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
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* loaded from: classes5.dex */
public class PKIXCertPathValidatorSpi_8 extends CertPathValidatorSpi {
    private final JcaJceHelper helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi_8() {
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
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        PKIXExtendedParameters pKIXExtendedParameters;
        List<? extends Certificate> list;
        X500Name ca2;
        PublicKey cAPublicKey;
        HashSet hashSet;
        TrustAnchor trustAnchor;
        PKIXCertRevocationChecker pKIXCertRevocationChecker;
        boolean z10;
        int i10;
        ArrayList arrayList;
        HashSet hashSet2;
        CertPath certPath2 = certPath;
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
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath2, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(pKIXExtendedParameters, new Date());
        Set initialPolicies = pKIXExtendedParameters.getInitialPolicies();
        try {
            TrustAnchor findTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), pKIXExtendedParameters.getTrustAnchors(), pKIXExtendedParameters.getSigProvider());
            if (findTrustAnchor == null) {
                list = certificates;
                try {
                    throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath2, -1);
                } catch (AnnotatedException e10) {
                    e = e10;
                    throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath2, list.size() - 1);
                }
            }
            checkCertificate(findTrustAnchor.getTrustedCert());
            PKIXExtendedParameters build = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTrustAnchor(findTrustAnchor).build();
            ArrayList arrayList2 = new ArrayList();
            PKIXCertRevocationChecker pKIXCertRevocationChecker2 = null;
            for (PKIXCertPathChecker pKIXCertPathChecker : build.getCertPathCheckers()) {
                pKIXCertPathChecker.init(false);
                if (!(pKIXCertPathChecker instanceof PKIXRevocationChecker)) {
                    arrayList2.add(pKIXCertPathChecker);
                } else {
                    if (pKIXCertRevocationChecker2 != null) {
                        throw new CertPathValidatorException("only one PKIXRevocationChecker allowed");
                    }
                    pKIXCertRevocationChecker2 = pKIXCertPathChecker instanceof PKIXCertRevocationChecker ? (PKIXCertRevocationChecker) pKIXCertPathChecker : new WrappedRevocationChecker(pKIXCertPathChecker);
                }
            }
            if (build.isRevocationEnabled() && pKIXCertRevocationChecker2 == null) {
                pKIXCertRevocationChecker2 = new ProvRevocationChecker(this.helper);
            }
            int i11 = size + 1;
            ArrayList[] arrayListArr = new ArrayList[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                arrayListArr[i12] = new ArrayList();
            }
            HashSet hashSet3 = new HashSet();
            int i13 = 1;
            hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
            arrayListArr[0].add(pKIXPolicyNode);
            PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
            HashSet hashSet4 = new HashSet();
            int i14 = build.isExplicitPolicyRequired() ? 0 : i11;
            int i15 = build.isAnyPolicyInhibited() ? 0 : i11;
            if (build.isPolicyMappingInhibited()) {
                i11 = 0;
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
                    AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                    algorithmIdentifier.getAlgorithm();
                    algorithmIdentifier.getParameters();
                    if (build.getTargetConstraints() != null && !build.getTargetConstraints().match((Certificate) certificates.get(0))) {
                        throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath2, 0);
                    }
                    int i16 = i14;
                    PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                    int i17 = i16;
                    PublicKey publicKey = cAPublicKey;
                    ArrayList arrayList3 = arrayList2;
                    int size2 = certificates.size() - 1;
                    int i18 = i11;
                    PublicKey publicKey2 = publicKey;
                    PKIXExtendedParameters pKIXExtendedParameters2 = build;
                    int i19 = size;
                    X509Certificate x509Certificate = null;
                    while (size2 >= 0) {
                        int i20 = size - size2;
                        List<? extends Certificate> list2 = certificates;
                        X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                        if (size2 == list2.size() - 1) {
                            trustAnchor = findTrustAnchor;
                            pKIXCertRevocationChecker = pKIXCertRevocationChecker2;
                            z10 = i13;
                        } else {
                            trustAnchor = findTrustAnchor;
                            pKIXCertRevocationChecker = pKIXCertRevocationChecker2;
                            z10 = 0;
                        }
                        try {
                            checkCertificate(x509Certificate2);
                            PKIXExtendedParameters pKIXExtendedParameters3 = pKIXExtendedParameters2;
                            int i21 = i19;
                            X509Certificate x509Certificate3 = trustedCert;
                            Set set = initialPolicies;
                            int i22 = i17;
                            Date date = validityDate;
                            X500Name x500Name = ca2;
                            ArrayList[] arrayListArr2 = arrayListArr;
                            TrustAnchor trustAnchor2 = trustAnchor;
                            certPath2 = certPath;
                            RFC3280CertPathUtilities.processCertA(certPath2, pKIXExtendedParameters3, date, pKIXCertRevocationChecker, size2, publicKey2, z10, x500Name, x509Certificate3);
                            int i23 = size2;
                            PublicKey publicKey3 = publicKey2;
                            X509Certificate x509Certificate4 = x509Certificate3;
                            PKIXCertRevocationChecker pKIXCertRevocationChecker3 = pKIXCertRevocationChecker;
                            RFC3280CertPathUtilities.processCertBC(certPath2, i23, pKIXNameConstraintValidator, this.isForCRLCheck);
                            HashSet hashSet5 = hashSet4;
                            int i24 = i15;
                            PKIXPolicyNode processCertE = RFC3280CertPathUtilities.processCertE(certPath2, i23, RFC3280CertPathUtilities.processCertD(certPath2, i23, hashSet5, pKIXPolicyNode2, arrayListArr2, i24, this.isForCRLCheck));
                            RFC3280CertPathUtilities.processCertF(certPath2, i23, processCertE, i22);
                            if (i20 != size) {
                                if (x509Certificate2 != null) {
                                    hashSet4 = hashSet5;
                                    int i25 = i13;
                                    if (x509Certificate2.getVersion() == i25) {
                                        if (i20 != i25 || !x509Certificate2.equals(trustAnchor2.getTrustedCert())) {
                                            throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath2, i23);
                                        }
                                    }
                                } else {
                                    hashSet4 = hashSet5;
                                }
                                RFC3280CertPathUtilities.prepareNextCertA(certPath2, i23);
                                PKIXPolicyNode prepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath2, i23, arrayListArr2, processCertE, i18);
                                RFC3280CertPathUtilities.prepareNextCertG(certPath2, i23, pKIXNameConstraintValidator);
                                int prepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath2, i23, i22);
                                int prepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath2, i23, i18);
                                int prepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath2, i23, i24);
                                int prepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath2, i23, prepareNextCertH1);
                                int prepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath2, i23, prepareNextCertH2);
                                int prepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath2, i23, prepareNextCertH3);
                                RFC3280CertPathUtilities.prepareNextCertK(certPath2, i23);
                                i10 = RFC3280CertPathUtilities.prepareNextCertM(certPath2, i23, RFC3280CertPathUtilities.prepareNextCertL(certPath2, i23, i21));
                                RFC3280CertPathUtilities.prepareNextCertN(certPath2, i23);
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
                                ArrayList arrayList4 = arrayList3;
                                RFC3280CertPathUtilities.prepareNextCertO(certPath2, i23, hashSet2, arrayList4);
                                X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                pKIXPolicyNode2 = prepareCertB;
                                try {
                                    PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath2.getCertificates(), i23, this.helper);
                                    AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                    algorithmIdentifier2.getAlgorithm();
                                    algorithmIdentifier2.getParameters();
                                    x509Certificate4 = x509Certificate2;
                                    ca2 = subjectPrincipal;
                                    i17 = prepareNextCertI1;
                                    i15 = prepareNextCertJ;
                                    publicKey2 = nextWorkingKey;
                                    arrayList = arrayList4;
                                    i18 = prepareNextCertI2;
                                    size2 = i23 - 1;
                                    validityDate = date;
                                    arrayListArr = arrayListArr2;
                                    findTrustAnchor = trustAnchor2;
                                    arrayList3 = arrayList;
                                    i19 = i10;
                                    pKIXCertRevocationChecker2 = pKIXCertRevocationChecker3;
                                    x509Certificate = x509Certificate2;
                                    initialPolicies = set;
                                    pKIXExtendedParameters2 = pKIXExtendedParameters3;
                                    certificates = list2;
                                    trustedCert = x509Certificate4;
                                    i13 = 1;
                                } catch (CertPathValidatorException e11) {
                                    throw new CertPathValidatorException("Next working key could not be retrieved.", e11, certPath2, i23);
                                }
                            } else {
                                hashSet4 = hashSet5;
                            }
                            arrayList = arrayList3;
                            i10 = i21;
                            pKIXPolicyNode2 = processCertE;
                            i15 = i24;
                            i17 = i22;
                            publicKey2 = publicKey3;
                            ca2 = x500Name;
                            size2 = i23 - 1;
                            validityDate = date;
                            arrayListArr = arrayListArr2;
                            findTrustAnchor = trustAnchor2;
                            arrayList3 = arrayList;
                            i19 = i10;
                            pKIXCertRevocationChecker2 = pKIXCertRevocationChecker3;
                            x509Certificate = x509Certificate2;
                            initialPolicies = set;
                            pKIXExtendedParameters2 = pKIXExtendedParameters3;
                            certificates = list2;
                            trustedCert = x509Certificate4;
                            i13 = 1;
                        } catch (AnnotatedException e12) {
                            throw new CertPathValidatorException(e12.getMessage(), e12.getUnderlyingException(), certPath, size2);
                        }
                    }
                    TrustAnchor trustAnchor3 = findTrustAnchor;
                    int i26 = size2;
                    ArrayList[] arrayListArr3 = arrayListArr;
                    Set set2 = initialPolicies;
                    PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNode2;
                    ArrayList arrayList5 = arrayList3;
                    PKIXExtendedParameters pKIXExtendedParameters4 = pKIXExtendedParameters2;
                    int i27 = i26 + 1;
                    int wrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath2, i27, RFC3280CertPathUtilities.wrapupCertA(i17, x509Certificate));
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
                    RFC3280CertPathUtilities.wrapupCertF(certPath2, i27, arrayList5, hashSet);
                    PKIXPolicyNode wrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath2, pKIXExtendedParameters4, set2, i27, arrayListArr3, pKIXPolicyNode3, hashSet4);
                    if (wrapupCertB > 0 || wrapupCertG != null) {
                        return new PKIXCertPathValidatorResult(trustAnchor3, wrapupCertG, x509Certificate.getPublicKey());
                    }
                    throw new CertPathValidatorException("Path processing failed on policy.", null, certPath2, i26);
                } catch (CertPathValidatorException e13) {
                    throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e13, certPath2, -1);
                }
            } catch (RuntimeException e14) {
                throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e14, certPath2, -1);
            }
        } catch (AnnotatedException e15) {
            e = e15;
            list = certificates;
        }
    }

    public PKIXCertPathValidatorSpi_8(boolean z10) {
        this.helper = new BCJcaJceHelper();
        this.isForCRLCheck = z10;
    }

    @Override // java.security.cert.CertPathValidatorSpi
    public PKIXCertPathChecker engineGetRevocationChecker() {
        return new ProvRevocationChecker(this.helper);
    }
}
