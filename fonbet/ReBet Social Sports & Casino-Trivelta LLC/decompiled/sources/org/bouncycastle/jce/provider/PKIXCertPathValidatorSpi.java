package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* loaded from: classes5.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi() {
        this(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkCertificate(X509Certificate x509Certificate) {
        if (x509Certificate instanceof BCX509Certificate) {
            try {
            } catch (RuntimeException e10) {
                e = e10;
            }
            if (((BCX509Certificate) x509Certificate).getTBSCertificateNative() != null) {
                return;
            }
            e = null;
            throw new AnnotatedException("unable to process TBSCertificate", e);
        }
        try {
            TBSCertificate.getInstance(x509Certificate.getTBSCertificate());
        } catch (IllegalArgumentException e11) {
            throw new AnnotatedException(e11.getMessage());
        } catch (CertificateEncodingException e12) {
            throw new AnnotatedException("unable to process TBSCertificate", e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.bouncycastle.asn1.x509.AlgorithmIdentifier] */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        PKIXExtendedParameters pKIXExtendedParameters;
        List<? extends Certificate> list;
        X500Name ca2;
        PublicKey cAPublicKey;
        int i10;
        TrustAnchor trustAnchor;
        ProvCrlRevocationChecker provCrlRevocationChecker;
        HashSet hashSet;
        int i11;
        List list2;
        HashSet hashSet2;
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            pKIXExtendedParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            pKIXExtendedParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedParameters)) {
                throw new InvalidAlgorithmParameterException("Parameters must be a " + PKIXParameters.class.getName() + " instance.");
            }
            pKIXExtendedParameters = (PKIXExtendedParameters) certPathParameters;
        }
        if (pKIXExtendedParameters.getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        int i12 = -1;
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(pKIXExtendedParameters, new Date());
        Set initialPolicies = pKIXExtendedParameters.getInitialPolicies();
        try {
            TrustAnchor findTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), pKIXExtendedParameters.getTrustAnchors(), pKIXExtendedParameters.getSigProvider());
            if (findTrustAnchor == null) {
                list = certificates;
                try {
                    throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
                } catch (AnnotatedException e10) {
                    e = e10;
                    throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath, list.size() - 1);
                }
            }
            checkCertificate(findTrustAnchor.getTrustedCert());
            PKIXExtendedParameters build = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTrustAnchor(findTrustAnchor).build();
            int i13 = size + 1;
            ArrayList[] arrayListArr = new ArrayList[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                arrayListArr[i14] = new ArrayList();
            }
            HashSet hashSet3 = new HashSet();
            hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
            arrayListArr[0].add(pKIXPolicyNode);
            PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
            HashSet hashSet4 = new HashSet();
            int i15 = build.isExplicitPolicyRequired() ? 0 : i13;
            int i16 = build.isAnyPolicyInhibited() ? 0 : i13;
            if (build.isPolicyMappingInhibited()) {
                i13 = 0;
            }
            X509Certificate trustedCert = findTrustAnchor.getTrustedCert();
            try {
                if (trustedCert != null) {
                    ca2 = PrincipalUtils.getSubjectPrincipal(trustedCert);
                    cAPublicKey = trustedCert.getPublicKey();
                } else {
                    ca2 = PrincipalUtils.getCA(findTrustAnchor);
                    cAPublicKey = findTrustAnchor.getCAPublicKey();
                }
                try {
                    i12 = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                    i12.getAlgorithm();
                    i12.getParameters();
                    if (build.getTargetConstraints() != null) {
                        i10 = 1;
                        if (!build.getTargetConstraints().match((Certificate) certificates.get(0))) {
                            throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                        }
                    } else {
                        i10 = 1;
                    }
                    List certPathCheckers = build.getCertPathCheckers();
                    Iterator it = certPathCheckers.iterator();
                    while (it.hasNext()) {
                        ((PKIXCertPathChecker) it.next()).init(false);
                    }
                    if (build.isRevocationEnabled()) {
                        provCrlRevocationChecker = new ProvCrlRevocationChecker(this.helper);
                        trustAnchor = findTrustAnchor;
                    } else {
                        trustAnchor = findTrustAnchor;
                        provCrlRevocationChecker = null;
                    }
                    int i17 = i13;
                    int size2 = certificates.size() - 1;
                    int i18 = i15;
                    PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                    int i19 = i18;
                    PKIXExtendedParameters pKIXExtendedParameters2 = build;
                    X509Certificate x509Certificate = null;
                    int i20 = size;
                    while (size2 >= 0) {
                        int i21 = size - size2;
                        List<? extends Certificate> list3 = certificates;
                        X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                        boolean z10 = size2 == list3.size() + (-1) ? i10 : 0;
                        try {
                            checkCertificate(x509Certificate2);
                            X509Certificate x509Certificate3 = trustedCert;
                            ArrayList[] arrayListArr2 = arrayListArr;
                            PublicKey publicKey = cAPublicKey;
                            int i22 = i20;
                            int i23 = i19;
                            X500Name x500Name = ca2;
                            List list4 = certPathCheckers;
                            PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                            TrustAnchor trustAnchor2 = trustAnchor;
                            Date date = validityDate;
                            PKIXExtendedParameters pKIXExtendedParameters3 = pKIXExtendedParameters2;
                            RFC3280CertPathUtilities.processCertA(certPath, pKIXExtendedParameters3, date, provCrlRevocationChecker, size2, publicKey, z10, x500Name, x509Certificate3);
                            pKIXExtendedParameters2 = pKIXExtendedParameters3;
                            int i24 = size2;
                            ProvCrlRevocationChecker provCrlRevocationChecker2 = provCrlRevocationChecker;
                            RFC3280CertPathUtilities.processCertBC(certPath, i24, pKIXNameConstraintValidator2, this.isForCRLCheck);
                            HashSet hashSet5 = hashSet4;
                            int i25 = i16;
                            PKIXPolicyNode processCertE = RFC3280CertPathUtilities.processCertE(certPath, i24, RFC3280CertPathUtilities.processCertD(certPath, i24, hashSet5, pKIXPolicyNode2, arrayListArr2, i25, this.isForCRLCheck));
                            RFC3280CertPathUtilities.processCertF(certPath, i24, processCertE, i23);
                            if (i21 != size) {
                                if (x509Certificate2 != null) {
                                    hashSet4 = hashSet5;
                                    int i26 = i10;
                                    if (x509Certificate2.getVersion() == i26) {
                                        if (i21 != i26 || !x509Certificate2.equals(trustAnchor2.getTrustedCert())) {
                                            throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i24);
                                        }
                                    }
                                } else {
                                    hashSet4 = hashSet5;
                                }
                                RFC3280CertPathUtilities.prepareNextCertA(certPath, i24);
                                PKIXPolicyNode prepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, i24, arrayListArr2, processCertE, i17);
                                RFC3280CertPathUtilities.prepareNextCertG(certPath, i24, pKIXNameConstraintValidator2);
                                int prepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i24, i23);
                                int prepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i24, i17);
                                int prepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i24, i25);
                                int prepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i24, prepareNextCertH1);
                                int prepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i24, prepareNextCertH2);
                                i25 = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i24, prepareNextCertH3);
                                RFC3280CertPathUtilities.prepareNextCertK(certPath, i24);
                                int prepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath, i24, RFC3280CertPathUtilities.prepareNextCertL(certPath, i24, i22));
                                RFC3280CertPathUtilities.prepareNextCertN(certPath, i24);
                                Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                if (criticalExtensionOIDs != null) {
                                    hashSet2 = new HashSet(criticalExtensionOIDs);
                                    hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                    hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                    hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                    hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                    hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                    hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                    hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                    hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                    hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                } else {
                                    hashSet2 = new HashSet();
                                }
                                RFC3280CertPathUtilities.prepareNextCertO(certPath, i24, hashSet2, list4);
                                X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                pKIXPolicyNode2 = prepareCertB;
                                try {
                                    PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i24, this.helper);
                                    AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                    algorithmIdentifier.getAlgorithm();
                                    algorithmIdentifier.getParameters();
                                    cAPublicKey = nextWorkingKey;
                                    list2 = list4;
                                    trustedCert = x509Certificate2;
                                    ca2 = subjectPrincipal;
                                    i11 = prepareNextCertM;
                                    i23 = prepareNextCertI1;
                                    i17 = prepareNextCertI2;
                                    i16 = i25;
                                    int i27 = i24 - 1;
                                    arrayListArr = arrayListArr2;
                                    validityDate = date;
                                    provCrlRevocationChecker = provCrlRevocationChecker2;
                                    i19 = i23;
                                    pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                    i10 = 1;
                                    size2 = i27;
                                    certPathCheckers = list2;
                                    i20 = i11;
                                    x509Certificate = x509Certificate2;
                                    trustAnchor = trustAnchor2;
                                    certificates = list3;
                                } catch (CertPathValidatorException e11) {
                                    throw new CertPathValidatorException("Next working key could not be retrieved.", e11, certPath, i24);
                                }
                            } else {
                                hashSet4 = hashSet5;
                            }
                            list2 = list4;
                            i11 = i22;
                            pKIXPolicyNode2 = processCertE;
                            cAPublicKey = publicKey;
                            ca2 = x500Name;
                            trustedCert = x509Certificate3;
                            i16 = i25;
                            int i272 = i24 - 1;
                            arrayListArr = arrayListArr2;
                            validityDate = date;
                            provCrlRevocationChecker = provCrlRevocationChecker2;
                            i19 = i23;
                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                            i10 = 1;
                            size2 = i272;
                            certPathCheckers = list2;
                            i20 = i11;
                            x509Certificate = x509Certificate2;
                            trustAnchor = trustAnchor2;
                            certificates = list3;
                        } catch (AnnotatedException e12) {
                            throw new CertPathValidatorException(e12.getMessage(), e12.getUnderlyingException(), certPath, size2);
                        }
                    }
                    TrustAnchor trustAnchor3 = trustAnchor;
                    int i28 = size2;
                    ArrayList[] arrayListArr3 = arrayListArr;
                    List list5 = certPathCheckers;
                    int i29 = i28 + 1;
                    int wrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i29, RFC3280CertPathUtilities.wrapupCertA(i19, x509Certificate));
                    Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                    if (criticalExtensionOIDs2 != null) {
                        hashSet = new HashSet(criticalExtensionOIDs2);
                        hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                        hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                        hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                        hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                        hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                        hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                        hashSet.remove(Extension.extendedKeyUsage.getId());
                    } else {
                        hashSet = new HashSet();
                    }
                    RFC3280CertPathUtilities.wrapupCertF(certPath, i29, list5, hashSet);
                    PKIXPolicyNode wrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParameters2, initialPolicies, i29, arrayListArr3, pKIXPolicyNode2, hashSet4);
                    if (wrapupCertB > 0 || wrapupCertG != null) {
                        return new PKIXCertPathValidatorResult(trustAnchor3, wrapupCertG, x509Certificate.getPublicKey());
                    }
                    throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i28);
                } catch (CertPathValidatorException e13) {
                    throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e13, certPath, -1);
                }
            } catch (RuntimeException e14) {
                throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e14, certPath, i12);
            }
        } catch (AnnotatedException e15) {
            e = e15;
            list = certificates;
        }
    }

    public PKIXCertPathValidatorSpi(boolean z10) {
        this.helper = new BCJcaJceHelper();
        this.isForCRLCheck = z10;
    }
}
