package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import kotlin.UByte;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocaleString;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.jce.provider.PKIXPolicyNode;
import org.bouncycastle.jce.provider.RFC3280CertPathUtilities;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Objects;

/* loaded from: classes5.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected Date currentDate;
    protected List[] errors;
    private boolean initialized;

    /* renamed from: n, reason: collision with root package name */
    protected int f62148n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String QC_STATEMENT = Extension.qCStatements.getId();
    private static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 != bArr.length; i10++) {
                stringBuffer.append(Integer.toHexString(bArr[i10] & UByte.MAX_VALUE));
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
    }

    private void checkCriticalExtensions() {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e10) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathCheckerError", new Object[]{e10.getMessage(), e10, e10.getClass().getName()}), e10);
                }
            } catch (CertPathReviewerException e11) {
                addError(e11.getErrorMessage(), e11.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.KEY_USAGE);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.NAME_CONSTRAINTS);
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e12) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.criticalExtensionError", new Object[]{e12.getMessage(), e12, e12.getClass().getName()}), e12.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = CertPathValidatorUtilities.getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        for (int i10 = 0; i10 < aSN1Sequence2.size(); i10++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i10));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e10) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e10, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e11) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), e11, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e12) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e12, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e13) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e13, this.certPath, size);
                        }
                    } catch (IOException e14) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e14, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i11 = 0; i11 != excludedSubtrees.length; i11++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i11]);
                            }
                        }
                    }
                } catch (AnnotatedException e15) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncExtError"), e15, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e16) {
            addError(e16.getErrorMessage(), e16.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        BigInteger pathLenConstraint;
        int intValue;
        int i10 = this.f62148n;
        int i11 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (i10 <= 0) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pathLengthExtended"));
                }
                i10--;
                i11++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && (pathLenConstraint = basicConstraints.getPathLenConstraint()) != null && (intValue = pathLenConstraint.intValue()) < i10) {
                i10 = intValue;
            }
        }
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i11)}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x0147, code lost:
    
        r22 = org.bouncycastle.x509.CertPathValidatorUtilities.getQualifierSet(r10.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0151, code lost:
    
        r9 = r5[r14 - 1];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0158, code lost:
    
        if (r10 >= r9.size()) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x015a, code lost:
    
        r21 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r9.get(r10);
        r11 = r21.getExpectedPolicies().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x016e, code lost:
    
        if (r11.hasNext() == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0170, code lost:
    
        r30 = r9;
        r9 = r11.next();
        r31 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x017a, code lost:
    
        if ((r9 instanceof java.lang.String) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x017c, code lost:
    
        r9 = (java.lang.String) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0189, code lost:
    
        r10 = r21.getChildren();
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0193, code lost:
    
        if (r10.hasNext() == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0195, code lost:
    
        r19 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01a5, code lost:
    
        if (r9.equals(((org.bouncycastle.jce.provider.PKIXPolicyNode) r10.next()).getValidPolicy()) == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01a7, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01a9, code lost:
    
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01ac, code lost:
    
        if (r17 != false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01ae, code lost:
    
        r10 = new java.util.HashSet();
        r10.add(r9);
        r17 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r14, r10, r21, r22, r9, false);
        r9 = r21;
        r9.addChild(r17);
        r21 = r9;
        r5[r14].add(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01d6, code lost:
    
        r9 = r30;
        r10 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0181, code lost:
    
        if ((r9 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0183, code lost:
    
        r9 = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) r9).getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01db, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0131 A[Catch: CertPathReviewerException -> 0x00d8, TRY_LEAVE, TryCatch #7 {CertPathReviewerException -> 0x00d8, blocks: (B:15:0x0068, B:19:0x0077, B:22:0x0084, B:26:0x0094, B:27:0x009f, B:29:0x00a5, B:32:0x00c6, B:33:0x00ce, B:35:0x00d4, B:41:0x00dc, B:42:0x00e8, B:48:0x00f4, B:51:0x00fb, B:52:0x0104, B:54:0x010a, B:57:0x0114, B:64:0x011d, B:66:0x0121, B:68:0x01f1, B:70:0x01f5, B:71:0x01fe, B:73:0x0204, B:75:0x0210, B:81:0x0219, B:79:0x021c, B:85:0x0221, B:87:0x0229, B:88:0x0232, B:90:0x0238, B:99:0x0256, B:100:0x0262, B:101:0x0263, B:107:0x0267, B:109:0x026f, B:110:0x0275, B:112:0x027b, B:115:0x029f, B:117:0x02a9, B:119:0x02ae, B:120:0x02ba, B:122:0x02bb, B:123:0x02c7, B:126:0x02cc, B:127:0x02df, B:129:0x02e5, B:131:0x030b, B:133:0x0323, B:134:0x031a, B:137:0x0328, B:138:0x032e, B:140:0x0334, B:143:0x033c, B:156:0x035e, B:148:0x0341, B:149:0x034d, B:151:0x034f, B:152:0x035b, B:161:0x036a, B:170:0x038c, B:172:0x0396, B:173:0x039a, B:175:0x03a0, B:189:0x03b0, B:178:0x03bd, B:199:0x03ca, B:201:0x03d4, B:105:0x0415, B:205:0x03de, B:206:0x03ec, B:208:0x03ed, B:209:0x03f9, B:218:0x03fb, B:219:0x0409, B:220:0x0127, B:221:0x012b, B:223:0x0131, B:226:0x0147, B:228:0x0151, B:229:0x0154, B:231:0x015a, B:232:0x016a, B:234:0x0170, B:236:0x017c, B:237:0x0189, B:238:0x018f, B:240:0x0195, B:248:0x01ae, B:252:0x017f, B:254:0x0183, B:257:0x01db, B:261:0x01e4, B:262:0x01f0, B:269:0x0421, B:270:0x042d, B:272:0x042e, B:277:0x0441, B:279:0x044b, B:280:0x0450, B:282:0x0456, B:285:0x0464, B:300:0x0477, B:307:0x05ca, B:308:0x05d6, B:310:0x0482, B:311:0x048e, B:312:0x048f, B:314:0x0495, B:316:0x049d, B:318:0x04a3, B:320:0x04ab, B:321:0x04ae, B:323:0x04b4, B:325:0x04c4, B:326:0x04c8, B:328:0x04ce, B:330:0x04d6, B:333:0x04d9, B:335:0x04dc, B:336:0x04e0, B:338:0x04e6, B:340:0x04f4, B:342:0x04fe, B:343:0x0501, B:345:0x0507, B:347:0x0513, B:349:0x0517, B:352:0x051a, B:355:0x0520, B:356:0x052c, B:358:0x0531, B:360:0x0539, B:361:0x053c, B:363:0x0542, B:365:0x0552, B:366:0x0556, B:368:0x055c, B:371:0x056c, B:376:0x0570, B:379:0x0573, B:381:0x0576, B:382:0x057c, B:384:0x0582, B:386:0x0594, B:392:0x059e, B:394:0x05a6, B:395:0x05a9, B:397:0x05af, B:399:0x05bb, B:401:0x05bf, B:404:0x05c2, B:406:0x05d8, B:407:0x05e4), top: B:14:0x0068, inners: #0, #1, #2, #5, #6, #8, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01f1 A[EDGE_INSN: B:264:0x01f1->B:68:0x01f1 BREAK  A[LOOP:11: B:221:0x012b->B:263:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f5 A[Catch: CertPathReviewerException -> 0x00d8, TryCatch #7 {CertPathReviewerException -> 0x00d8, blocks: (B:15:0x0068, B:19:0x0077, B:22:0x0084, B:26:0x0094, B:27:0x009f, B:29:0x00a5, B:32:0x00c6, B:33:0x00ce, B:35:0x00d4, B:41:0x00dc, B:42:0x00e8, B:48:0x00f4, B:51:0x00fb, B:52:0x0104, B:54:0x010a, B:57:0x0114, B:64:0x011d, B:66:0x0121, B:68:0x01f1, B:70:0x01f5, B:71:0x01fe, B:73:0x0204, B:75:0x0210, B:81:0x0219, B:79:0x021c, B:85:0x0221, B:87:0x0229, B:88:0x0232, B:90:0x0238, B:99:0x0256, B:100:0x0262, B:101:0x0263, B:107:0x0267, B:109:0x026f, B:110:0x0275, B:112:0x027b, B:115:0x029f, B:117:0x02a9, B:119:0x02ae, B:120:0x02ba, B:122:0x02bb, B:123:0x02c7, B:126:0x02cc, B:127:0x02df, B:129:0x02e5, B:131:0x030b, B:133:0x0323, B:134:0x031a, B:137:0x0328, B:138:0x032e, B:140:0x0334, B:143:0x033c, B:156:0x035e, B:148:0x0341, B:149:0x034d, B:151:0x034f, B:152:0x035b, B:161:0x036a, B:170:0x038c, B:172:0x0396, B:173:0x039a, B:175:0x03a0, B:189:0x03b0, B:178:0x03bd, B:199:0x03ca, B:201:0x03d4, B:105:0x0415, B:205:0x03de, B:206:0x03ec, B:208:0x03ed, B:209:0x03f9, B:218:0x03fb, B:219:0x0409, B:220:0x0127, B:221:0x012b, B:223:0x0131, B:226:0x0147, B:228:0x0151, B:229:0x0154, B:231:0x015a, B:232:0x016a, B:234:0x0170, B:236:0x017c, B:237:0x0189, B:238:0x018f, B:240:0x0195, B:248:0x01ae, B:252:0x017f, B:254:0x0183, B:257:0x01db, B:261:0x01e4, B:262:0x01f0, B:269:0x0421, B:270:0x042d, B:272:0x042e, B:277:0x0441, B:279:0x044b, B:280:0x0450, B:282:0x0456, B:285:0x0464, B:300:0x0477, B:307:0x05ca, B:308:0x05d6, B:310:0x0482, B:311:0x048e, B:312:0x048f, B:314:0x0495, B:316:0x049d, B:318:0x04a3, B:320:0x04ab, B:321:0x04ae, B:323:0x04b4, B:325:0x04c4, B:326:0x04c8, B:328:0x04ce, B:330:0x04d6, B:333:0x04d9, B:335:0x04dc, B:336:0x04e0, B:338:0x04e6, B:340:0x04f4, B:342:0x04fe, B:343:0x0501, B:345:0x0507, B:347:0x0513, B:349:0x0517, B:352:0x051a, B:355:0x0520, B:356:0x052c, B:358:0x0531, B:360:0x0539, B:361:0x053c, B:363:0x0542, B:365:0x0552, B:366:0x0556, B:368:0x055c, B:371:0x056c, B:376:0x0570, B:379:0x0573, B:381:0x0576, B:382:0x057c, B:384:0x0582, B:386:0x0594, B:392:0x059e, B:394:0x05a6, B:395:0x05a9, B:397:0x05af, B:399:0x05bb, B:401:0x05bf, B:404:0x05c2, B:406:0x05d8, B:407:0x05e4), top: B:14:0x0068, inners: #0, #1, #2, #5, #6, #8, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0229 A[Catch: CertPathReviewerException -> 0x00d8, TryCatch #7 {CertPathReviewerException -> 0x00d8, blocks: (B:15:0x0068, B:19:0x0077, B:22:0x0084, B:26:0x0094, B:27:0x009f, B:29:0x00a5, B:32:0x00c6, B:33:0x00ce, B:35:0x00d4, B:41:0x00dc, B:42:0x00e8, B:48:0x00f4, B:51:0x00fb, B:52:0x0104, B:54:0x010a, B:57:0x0114, B:64:0x011d, B:66:0x0121, B:68:0x01f1, B:70:0x01f5, B:71:0x01fe, B:73:0x0204, B:75:0x0210, B:81:0x0219, B:79:0x021c, B:85:0x0221, B:87:0x0229, B:88:0x0232, B:90:0x0238, B:99:0x0256, B:100:0x0262, B:101:0x0263, B:107:0x0267, B:109:0x026f, B:110:0x0275, B:112:0x027b, B:115:0x029f, B:117:0x02a9, B:119:0x02ae, B:120:0x02ba, B:122:0x02bb, B:123:0x02c7, B:126:0x02cc, B:127:0x02df, B:129:0x02e5, B:131:0x030b, B:133:0x0323, B:134:0x031a, B:137:0x0328, B:138:0x032e, B:140:0x0334, B:143:0x033c, B:156:0x035e, B:148:0x0341, B:149:0x034d, B:151:0x034f, B:152:0x035b, B:161:0x036a, B:170:0x038c, B:172:0x0396, B:173:0x039a, B:175:0x03a0, B:189:0x03b0, B:178:0x03bd, B:199:0x03ca, B:201:0x03d4, B:105:0x0415, B:205:0x03de, B:206:0x03ec, B:208:0x03ed, B:209:0x03f9, B:218:0x03fb, B:219:0x0409, B:220:0x0127, B:221:0x012b, B:223:0x0131, B:226:0x0147, B:228:0x0151, B:229:0x0154, B:231:0x015a, B:232:0x016a, B:234:0x0170, B:236:0x017c, B:237:0x0189, B:238:0x018f, B:240:0x0195, B:248:0x01ae, B:252:0x017f, B:254:0x0183, B:257:0x01db, B:261:0x01e4, B:262:0x01f0, B:269:0x0421, B:270:0x042d, B:272:0x042e, B:277:0x0441, B:279:0x044b, B:280:0x0450, B:282:0x0456, B:285:0x0464, B:300:0x0477, B:307:0x05ca, B:308:0x05d6, B:310:0x0482, B:311:0x048e, B:312:0x048f, B:314:0x0495, B:316:0x049d, B:318:0x04a3, B:320:0x04ab, B:321:0x04ae, B:323:0x04b4, B:325:0x04c4, B:326:0x04c8, B:328:0x04ce, B:330:0x04d6, B:333:0x04d9, B:335:0x04dc, B:336:0x04e0, B:338:0x04e6, B:340:0x04f4, B:342:0x04fe, B:343:0x0501, B:345:0x0507, B:347:0x0513, B:349:0x0517, B:352:0x051a, B:355:0x0520, B:356:0x052c, B:358:0x0531, B:360:0x0539, B:361:0x053c, B:363:0x0542, B:365:0x0552, B:366:0x0556, B:368:0x055c, B:371:0x056c, B:376:0x0570, B:379:0x0573, B:381:0x0576, B:382:0x057c, B:384:0x0582, B:386:0x0594, B:392:0x059e, B:394:0x05a6, B:395:0x05a9, B:397:0x05af, B:399:0x05bb, B:401:0x05bf, B:404:0x05c2, B:406:0x05d8, B:407:0x05e4), top: B:14:0x0068, inners: #0, #1, #2, #5, #6, #8, #9, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkPolicy() {
        PKIXPolicyNode pKIXPolicyNode;
        PKIXPolicyNode pKIXPolicyNode2;
        int i10;
        int i11;
        int i12;
        ASN1Primitive aSN1Primitive;
        Set<String> set;
        HashSet hashSet;
        int intValueExact;
        int intValueExact2;
        HashSet hashSet2;
        Enumeration objects;
        int i13;
        Set<String> criticalExtensionOIDs;
        Set<String> initialPolicies = this.pkixParams.getInitialPolicies();
        int i14 = this.f62148n + 1;
        ArrayList[] arrayListArr = new ArrayList[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            arrayListArr[i15] = new ArrayList();
        }
        HashSet hashSet3 = new HashSet();
        hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
        PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
        arrayListArr[0].add(pKIXPolicyNode3);
        int i16 = this.pkixParams.isExplicitPolicyRequired() ? 0 : this.f62148n + 1;
        int i17 = this.pkixParams.isAnyPolicyInhibited() ? 0 : this.f62148n + 1;
        int i18 = this.pkixParams.isPolicyMappingInhibited() ? 0 : this.f62148n + 1;
        try {
            int size = this.certs.size() - 1;
            X509Certificate x509Certificate = null;
            HashSet hashSet4 = null;
            while (size >= 0) {
                int i19 = this.f62148n - size;
                X509Certificate x509Certificate2 = (X509Certificate) this.certs.get(size);
                PKIXPolicyNode pKIXPolicyNode4 = pKIXPolicyNode3;
                try {
                    ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                    if (aSN1Sequence == null || pKIXPolicyNode4 == null) {
                        i10 = i16;
                        i11 = i17;
                        i12 = i18;
                    } else {
                        Enumeration objects2 = aSN1Sequence.getObjects();
                        i10 = i16;
                        HashSet hashSet5 = new HashSet();
                        while (objects2.hasMoreElements()) {
                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects2.nextElement());
                            int i20 = i17;
                            ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                            int i21 = i18;
                            hashSet5.add(policyIdentifier.getId());
                            if (!RFC3280CertPathUtilities.ANY_POLICY.equals(policyIdentifier.getId())) {
                                try {
                                    Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                                    if (!CertPathValidatorUtilities.processCertD1i(i19, arrayListArr, policyIdentifier, qualifierSet)) {
                                        CertPathValidatorUtilities.processCertD1ii(i19, arrayListArr, policyIdentifier, qualifierSet);
                                    }
                                } catch (CertPathValidatorException e10) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e10, this.certPath, size);
                                }
                            }
                            i17 = i20;
                            i18 = i21;
                        }
                        i11 = i17;
                        i12 = i18;
                        if (hashSet4 != null && !hashSet4.contains(RFC3280CertPathUtilities.ANY_POLICY)) {
                            HashSet hashSet6 = new HashSet();
                            for (Object obj : hashSet4) {
                                if (hashSet5.contains(obj)) {
                                    hashSet6.add(obj);
                                }
                            }
                            hashSet2 = hashSet6;
                            if (i11 <= 0 || (i19 < this.f62148n && CertPathValidatorUtilities.isSelfIssued(x509Certificate2))) {
                                objects = aSN1Sequence.getObjects();
                                while (true) {
                                    if (objects.hasMoreElements()) {
                                        break;
                                    }
                                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects.nextElement());
                                    if (RFC3280CertPathUtilities.ANY_POLICY.equals(policyInformation2.getPolicyIdentifier().getId())) {
                                        try {
                                            break;
                                        } catch (CertPathValidatorException e11) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e11, this.certPath, size);
                                        }
                                    }
                                }
                            }
                            i13 = i19 - 1;
                            while (i13 >= 0) {
                                ArrayList arrayList = arrayListArr[i13];
                                int i22 = i13;
                                HashSet hashSet7 = hashSet2;
                                PKIXPolicyNode pKIXPolicyNode5 = pKIXPolicyNode4;
                                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                                    PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) arrayList.get(i23);
                                    if (!pKIXPolicyNode6.hasChildren() && (pKIXPolicyNode5 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode5, arrayListArr, pKIXPolicyNode6)) == null) {
                                        break;
                                    }
                                }
                                pKIXPolicyNode4 = pKIXPolicyNode5;
                                i13 = i22 - 1;
                                hashSet2 = hashSet7;
                            }
                            HashSet hashSet8 = hashSet2;
                            criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                                boolean contains = criticalExtensionOIDs.contains(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                                ArrayList arrayList2 = arrayListArr[i19];
                                for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                                    ((PKIXPolicyNode) arrayList2.get(i24)).setCritical(contains);
                                }
                            }
                            hashSet4 = hashSet8;
                        }
                        hashSet2 = hashSet5;
                        if (i11 <= 0) {
                        }
                        objects = aSN1Sequence.getObjects();
                        while (true) {
                            if (objects.hasMoreElements()) {
                            }
                        }
                        i13 = i19 - 1;
                        while (i13 >= 0) {
                        }
                        HashSet hashSet82 = hashSet2;
                        criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null) {
                        }
                        hashSet4 = hashSet82;
                    }
                    if (aSN1Sequence == null) {
                        pKIXPolicyNode4 = null;
                    }
                    if (i10 <= 0 && pKIXPolicyNode4 == null) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidPolicyTree"));
                    }
                    if (i19 != this.f62148n) {
                        try {
                            ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_MAPPINGS);
                            if (extensionValue != null) {
                                ASN1Sequence aSN1Sequence2 = (ASN1Sequence) extensionValue;
                                aSN1Primitive = extensionValue;
                                int i25 = 0;
                                while (i25 < aSN1Sequence2.size()) {
                                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence2.getObjectAt(i25);
                                    ASN1Sequence aSN1Sequence4 = aSN1Sequence2;
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(0);
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(1);
                                    if (RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    if (RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier2.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    i25++;
                                    aSN1Sequence2 = aSN1Sequence4;
                                }
                            } else {
                                aSN1Primitive = extensionValue;
                            }
                            if (aSN1Primitive != null) {
                                ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Primitive;
                                HashMap hashMap = new HashMap();
                                HashSet<String> hashSet9 = new HashSet();
                                set = initialPolicies;
                                hashSet = hashSet4;
                                int i26 = 0;
                                while (i26 < aSN1Sequence5.size()) {
                                    ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i26);
                                    ASN1Sequence aSN1Sequence7 = aSN1Sequence5;
                                    String id2 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(0)).getId();
                                    int i27 = i26;
                                    String id3 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(1)).getId();
                                    if (hashMap.containsKey(id2)) {
                                        ((Set) hashMap.get(id2)).add(id3);
                                    } else {
                                        HashSet hashSet10 = new HashSet();
                                        hashSet10.add(id3);
                                        hashMap.put(id2, hashSet10);
                                        hashSet9.add(id2);
                                    }
                                    i26 = i27 + 1;
                                    aSN1Sequence5 = aSN1Sequence7;
                                }
                                PKIXPolicyNode pKIXPolicyNode7 = pKIXPolicyNode4;
                                for (String str : hashSet9) {
                                    if (i12 > 0) {
                                        try {
                                            CertPathValidatorUtilities.prepareNextCertB1(i19, arrayListArr, str, hashMap, x509Certificate2);
                                        } catch (CertPathValidatorException e12) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e12, this.certPath, size);
                                        } catch (AnnotatedException e13) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyExtError"), e13, this.certPath, size);
                                        }
                                    } else if (i12 <= 0) {
                                        pKIXPolicyNode7 = CertPathValidatorUtilities.prepareNextCertB2(i19, arrayListArr, str, pKIXPolicyNode7);
                                    }
                                }
                                pKIXPolicyNode4 = pKIXPolicyNode7;
                            } else {
                                set = initialPolicies;
                                hashSet = hashSet4;
                            }
                            if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                                i16 = i10;
                                i17 = i11;
                                i18 = i12;
                            } else {
                                i16 = i10 != 0 ? i10 - 1 : i10;
                                i18 = i12 != 0 ? i12 - 1 : i12;
                                i17 = i11 != 0 ? i11 - 1 : i11;
                            }
                            try {
                                ASN1Sequence aSN1Sequence8 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                                if (aSN1Sequence8 != null) {
                                    Enumeration objects3 = aSN1Sequence8.getObjects();
                                    while (objects3.hasMoreElements()) {
                                        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects3.nextElement();
                                        int tagNo = aSN1TaggedObject.getTagNo();
                                        if (tagNo == 0) {
                                            int intValueExact3 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                            if (intValueExact3 < i16) {
                                                i16 = intValueExact3;
                                            }
                                        } else if (tagNo == 1 && (intValueExact2 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact()) < i18) {
                                            i18 = intValueExact2;
                                        }
                                    }
                                }
                                try {
                                    ASN1Integer aSN1Integer = (ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                                    if (aSN1Integer != null && (intValueExact = aSN1Integer.intValueExact()) < i17) {
                                        i17 = intValueExact;
                                    }
                                } catch (AnnotatedException unused) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyInhibitExtError"), this.certPath, size);
                                }
                            } catch (AnnotatedException unused2) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
                            }
                        } catch (AnnotatedException e14) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyMapExtError"), e14, this.certPath, size);
                        }
                    } else {
                        set = initialPolicies;
                        hashSet = hashSet4;
                        i16 = i10;
                        i17 = i11;
                        i18 = i12;
                    }
                    pKIXPolicyNode3 = pKIXPolicyNode4;
                    size--;
                    x509Certificate = x509Certificate2;
                    hashSet4 = hashSet;
                    initialPolicies = set;
                } catch (AnnotatedException e15) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyExtError"), e15, this.certPath, size);
                }
            }
            Set<String> set2 = initialPolicies;
            PKIXPolicyNode pKIXPolicyNode8 = pKIXPolicyNode3;
            int i28 = i16;
            int i29 = (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i28 <= 0) ? i28 : i28 - 1;
            try {
                ASN1Sequence aSN1Sequence9 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                if (aSN1Sequence9 != null) {
                    Enumeration objects4 = aSN1Sequence9.getObjects();
                    int i30 = i29;
                    while (objects4.hasMoreElements()) {
                        ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) objects4.nextElement();
                        if (aSN1TaggedObject2.getTagNo() == 0 && ASN1Integer.getInstance(aSN1TaggedObject2, false).intValueExact() == 0) {
                            i30 = 0;
                        }
                    }
                    i29 = i30;
                }
                if (pKIXPolicyNode8 != null) {
                    if (!CertPathValidatorUtilities.isAnyPolicy(set2)) {
                        HashSet<PKIXPolicyNode> hashSet11 = new HashSet();
                        for (int i31 = 0; i31 < i14; i31++) {
                            ArrayList arrayList3 = arrayListArr[i31];
                            for (int i32 = 0; i32 < arrayList3.size(); i32++) {
                                PKIXPolicyNode pKIXPolicyNode9 = (PKIXPolicyNode) arrayList3.get(i32);
                                if (RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode9.getValidPolicy())) {
                                    Iterator children = pKIXPolicyNode9.getChildren();
                                    while (children.hasNext()) {
                                        PKIXPolicyNode pKIXPolicyNode10 = (PKIXPolicyNode) children.next();
                                        if (!RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode10.getValidPolicy())) {
                                            hashSet11.add(pKIXPolicyNode10);
                                        }
                                    }
                                }
                            }
                        }
                        pKIXPolicyNode = pKIXPolicyNode8;
                        for (PKIXPolicyNode pKIXPolicyNode11 : hashSet11) {
                            Set<String> set3 = set2;
                            if (!set3.contains(pKIXPolicyNode11.getValidPolicy())) {
                                pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, arrayListArr, pKIXPolicyNode11);
                            }
                            set2 = set3;
                        }
                        if (pKIXPolicyNode != null) {
                            for (int i33 = this.f62148n - 1; i33 >= 0; i33--) {
                                ArrayList arrayList4 = arrayListArr[i33];
                                for (int i34 = 0; i34 < arrayList4.size(); i34++) {
                                    PKIXPolicyNode pKIXPolicyNode12 = (PKIXPolicyNode) arrayList4.get(i34);
                                    if (!pKIXPolicyNode12.hasChildren()) {
                                        pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, arrayListArr, pKIXPolicyNode12);
                                    }
                                }
                            }
                        }
                    } else if (!this.pkixParams.isExplicitPolicyRequired()) {
                        pKIXPolicyNode2 = pKIXPolicyNode8;
                    } else {
                        if (hashSet4.isEmpty()) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                        }
                        HashSet hashSet12 = new HashSet();
                        for (int i35 = 0; i35 < i14; i35++) {
                            ArrayList arrayList5 = arrayListArr[i35];
                            for (int i36 = 0; i36 < arrayList5.size(); i36++) {
                                PKIXPolicyNode pKIXPolicyNode13 = (PKIXPolicyNode) arrayList5.get(i36);
                                if (RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode13.getValidPolicy())) {
                                    Iterator children2 = pKIXPolicyNode13.getChildren();
                                    while (children2.hasNext()) {
                                        hashSet12.add(children2.next());
                                    }
                                }
                            }
                        }
                        Iterator it = hashSet12.iterator();
                        while (it.hasNext()) {
                            hashSet4.contains(((PKIXPolicyNode) it.next()).getValidPolicy());
                        }
                        pKIXPolicyNode = pKIXPolicyNode8;
                        for (int i37 = this.f62148n - 1; i37 >= 0; i37--) {
                            ArrayList arrayList6 = arrayListArr[i37];
                            for (int i38 = 0; i38 < arrayList6.size(); i38++) {
                                PKIXPolicyNode pKIXPolicyNode14 = (PKIXPolicyNode) arrayList6.get(i38);
                                if (!pKIXPolicyNode14.hasChildren()) {
                                    pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, arrayListArr, pKIXPolicyNode14);
                                }
                            }
                        }
                    }
                    pKIXPolicyNode2 = pKIXPolicyNode;
                } else {
                    if (this.pkixParams.isExplicitPolicyRequired()) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    pKIXPolicyNode2 = null;
                }
                if (i29 <= 0 && pKIXPolicyNode2 == null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicy"));
                }
            } catch (AnnotatedException unused3) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
            }
        } catch (CertPathReviewerException e16) {
            addError(e16.getErrorMessage(), e16.getIndex());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:31|(2:128|129)(2:33|(2:122|123)(3:35|(2:39|(1:41))|42))|(2:43|44)|45|(18:84|85|(15:87|88|89|(11:91|92|(2:95|93)|96|97|(2:100|98)|101|102|103|104|105)|112|92|(1:93)|96|97|(1:98)|101|102|103|104|105)|115|88|89|(0)|112|92|(1:93)|96|97|(1:98)|101|102|103|104|105)(1:47)|(1:51)|52|(7:54|(1:58)|59|60|(2:62|(1:64))(1:80)|65|(7:67|(1:79)|71|72|73|75|76))|83|71|72|73|75|76) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:84|85)|(3:(15:87|88|89|(11:91|92|(2:95|93)|96|97|(2:100|98)|101|102|103|104|105)|112|92|(1:93)|96|97|(1:98)|101|102|103|104|105)|104|105)|115|88|89|(0)|112|92|(1:93)|96|97|(1:98)|101|102|103) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02f4, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x028f, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.crlAuthInfoAccError"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0399, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.pubKeyError"), r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02cf A[LOOP:2: B:98:0x02c9->B:100:0x02cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028a A[Catch: AnnotatedException -> 0x028f, TRY_LEAVE, TryCatch #1 {AnnotatedException -> 0x028f, blocks: (B:89:0x0282, B:91:0x028a), top: B:88:0x0282 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ac A[LOOP:1: B:93:0x02a6->B:95:0x02ac, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkSignatures() {
        TrustAnchor trustAnchor;
        TrustAnchor trustAnchor2;
        X500Principal x500Principal;
        X509Certificate x509Certificate;
        PublicKey publicKey;
        int size;
        ErrorBundle errorBundle;
        ErrorBundle errorBundle2;
        CRLDistPoint cRLDistPoint;
        AuthorityInformationAccess authorityInformationAccess;
        Iterator it;
        Iterator it2;
        int i10;
        ASN1Primitive extensionValue;
        ASN1Primitive extensionValue2;
        char c10;
        AuthorityKeyIdentifier authorityKeyIdentifier;
        GeneralNames authorityCertIssuer;
        boolean[] keyUsage;
        X509Certificate x509Certificate2;
        Collection trustAnchors;
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathValidDate", new Object[]{new TrustedInput(this.validDate), new TrustedInput(this.currentDate)}));
        try {
            List list = this.certs;
            x509Certificate2 = (X509Certificate) list.get(list.size() - 1);
            trustAnchors = getTrustAnchors(x509Certificate2, this.pkixParams.getTrustAnchors());
        } catch (CertPathReviewerException e10) {
            e = e10;
            trustAnchor = null;
        } catch (Throwable th2) {
            th = th2;
            trustAnchor = null;
        }
        if (trustAnchors.size() > 1) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.conflictingTrustAnchors", new Object[]{Integers.valueOf(trustAnchors.size()), new UntrustedInput(x509Certificate2.getIssuerX500Principal())}));
        } else {
            if (!trustAnchors.isEmpty()) {
                trustAnchor = (TrustAnchor) trustAnchors.iterator().next();
                try {
                    try {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey(), this.pkixParams.getSigProvider());
                        } catch (SignatureException unused) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustButInvalidCert"));
                        } catch (Exception unused2) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknown", new Object[]{new UntrustedInput(th.getMessage()), new UntrustedInput(th)}));
                        trustAnchor2 = trustAnchor;
                        if (trustAnchor2 == null) {
                        }
                        if (trustAnchor2 == null) {
                        }
                        X509Certificate x509Certificate3 = x509Certificate;
                        X500Principal x500Principal2 = x500Principal;
                        PublicKey publicKey2 = publicKey;
                        size = this.certs.size() - 1;
                        while (size >= 0) {
                        }
                        this.trustAnchor = trustAnchor2;
                        this.subjectPublicKey = publicKey2;
                    }
                } catch (CertPathReviewerException e11) {
                    e = e11;
                    addError(e.getErrorMessage());
                    trustAnchor2 = trustAnchor;
                    if (trustAnchor2 == null) {
                    }
                    if (trustAnchor2 == null) {
                    }
                    X509Certificate x509Certificate32 = x509Certificate;
                    X500Principal x500Principal22 = x500Principal;
                    PublicKey publicKey22 = publicKey;
                    size = this.certs.size() - 1;
                    while (size >= 0) {
                    }
                    this.trustAnchor = trustAnchor2;
                    this.subjectPublicKey = publicKey22;
                }
                trustAnchor2 = trustAnchor;
                if (trustAnchor2 == null) {
                    X509Certificate trustedCert = trustAnchor2.getTrustedCert();
                    try {
                        x500Principal = trustedCert != null ? CertPathValidatorUtilities.getSubjectPrincipal(trustedCert) : new X500Principal(trustAnchor2.getCAName());
                    } catch (IllegalArgumentException unused3) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustDNInvalid", new Object[]{new UntrustedInput(trustAnchor2.getCAName())}));
                        x500Principal = null;
                    }
                    if (trustedCert != null && (keyUsage = trustedCert.getKeyUsage()) != null && (keyUsage.length <= 5 || !keyUsage[5])) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustKeyUsage"));
                    }
                } else {
                    x500Principal = null;
                }
                if (trustAnchor2 == null) {
                    x509Certificate = trustAnchor2.getTrustedCert();
                    publicKey = x509Certificate != null ? x509Certificate.getPublicKey() : trustAnchor2.getCAPublicKey();
                    try {
                        AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                    } catch (CertPathValidatorException unused4) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustPubKeyError"));
                    }
                } else {
                    x509Certificate = null;
                    publicKey = null;
                }
                X509Certificate x509Certificate322 = x509Certificate;
                X500Principal x500Principal222 = x500Principal;
                PublicKey publicKey222 = publicKey;
                size = this.certs.size() - 1;
                while (size >= 0) {
                    int i11 = this.f62148n - size;
                    X509Certificate x509Certificate4 = (X509Certificate) this.certs.get(size);
                    if (publicKey222 != null) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate4, publicKey222, this.pkixParams.getSigProvider());
                        } catch (GeneralSecurityException e12) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", new Object[]{e12.getMessage(), e12, e12.getClass().getName()});
                            addError(errorBundle, size);
                            x509Certificate4.checkValidity(this.validDate);
                            if (this.pkixParams.isRevocationEnabled()) {
                            }
                            if (x500Principal222 != null) {
                            }
                            if (i10 != this.f62148n) {
                            }
                            c10 = 5;
                            x500Principal222 = x509Certificate4.getSubjectX500Principal();
                            publicKey222 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                            AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey222);
                            algorithmIdentifier2.getAlgorithm();
                            algorithmIdentifier2.getParameters();
                            size--;
                            x509Certificate322 = x509Certificate4;
                        }
                    } else if (CertPathValidatorUtilities.isSelfIssued(x509Certificate4)) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate4, x509Certificate4.getPublicKey(), this.pkixParams.getSigProvider());
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                        } catch (GeneralSecurityException e13) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", new Object[]{e13.getMessage(), e13, e13.getClass().getName()});
                            addError(errorBundle, size);
                            x509Certificate4.checkValidity(this.validDate);
                            if (this.pkixParams.isRevocationEnabled()) {
                            }
                            if (x500Principal222 != null) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", new Object[]{x500Principal222.getName(), x509Certificate4.getIssuerX500Principal().getName()}), size);
                            }
                            if (i10 != this.f62148n) {
                            }
                            c10 = 5;
                            x500Principal222 = x509Certificate4.getSubjectX500Principal();
                            publicKey222 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                            AlgorithmIdentifier algorithmIdentifier22 = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey222);
                            algorithmIdentifier22.getAlgorithm();
                            algorithmIdentifier22.getParameters();
                            size--;
                            x509Certificate322 = x509Certificate4;
                        }
                    } else {
                        ErrorBundle errorBundle3 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.NoIssuerPublicKey");
                        byte[] extensionValue3 = x509Certificate4.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                        if (extensionValue3 != null && (authorityCertIssuer = (authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue3).getOctets())).getAuthorityCertIssuer()) != null) {
                            GeneralName generalName = authorityCertIssuer.getNames()[0];
                            BigInteger authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                            if (authorityCertSerialNumber != null) {
                                errorBundle3.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                            }
                        }
                        addError(errorBundle3, size);
                    }
                    try {
                        x509Certificate4.checkValidity(this.validDate);
                    } catch (CertificateExpiredException unused5) {
                        errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateExpired", new Object[]{new TrustedInput(x509Certificate4.getNotAfter())});
                        addError(errorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (x500Principal222 != null) {
                        }
                        if (i10 != this.f62148n) {
                        }
                        c10 = 5;
                        x500Principal222 = x509Certificate4.getSubjectX500Principal();
                        publicKey222 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier222 = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey222);
                        algorithmIdentifier222.getAlgorithm();
                        algorithmIdentifier222.getParameters();
                        size--;
                        x509Certificate322 = x509Certificate4;
                    } catch (CertificateNotYetValidException unused6) {
                        errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateNotYetValid", new Object[]{new TrustedInput(x509Certificate4.getNotBefore())});
                        addError(errorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (x500Principal222 != null) {
                        }
                        if (i10 != this.f62148n) {
                        }
                        c10 = 5;
                        x500Principal222 = x509Certificate4.getSubjectX500Principal();
                        publicKey222 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier2222 = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey222);
                        algorithmIdentifier2222.getAlgorithm();
                        algorithmIdentifier2222.getParameters();
                        size--;
                        x509Certificate322 = x509Certificate4;
                    }
                    if (this.pkixParams.isRevocationEnabled()) {
                        try {
                            extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate4, CRL_DIST_POINTS);
                        } catch (AnnotatedException unused7) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPtExtError"), size);
                        }
                        try {
                            if (extensionValue2 != null) {
                                cRLDistPoint = CRLDistPoint.getInstance(extensionValue2);
                                extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate4, AUTH_INFO_ACCESS);
                                if (extensionValue != null) {
                                    authorityInformationAccess = AuthorityInformationAccess.getInstance(extensionValue);
                                    Vector cRLDistUrls = getCRLDistUrls(cRLDistPoint);
                                    Vector oCSPUrls = getOCSPUrls(authorityInformationAccess);
                                    it = cRLDistUrls.iterator();
                                    while (it.hasNext()) {
                                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPoint", new Object[]{new UntrustedUrlInput(it.next())}), size);
                                    }
                                    it2 = oCSPUrls.iterator();
                                    while (it2.hasNext()) {
                                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ocspLocation", new Object[]{new UntrustedUrlInput(it2.next())}), size);
                                    }
                                    i10 = i11;
                                    checkRevocation(this.pkixParams, x509Certificate4, this.validDate, x509Certificate322, publicKey222, cRLDistUrls, oCSPUrls, size);
                                }
                                authorityInformationAccess = null;
                                Vector cRLDistUrls2 = getCRLDistUrls(cRLDistPoint);
                                Vector oCSPUrls2 = getOCSPUrls(authorityInformationAccess);
                                it = cRLDistUrls2.iterator();
                                while (it.hasNext()) {
                                }
                                it2 = oCSPUrls2.iterator();
                                while (it2.hasNext()) {
                                }
                                i10 = i11;
                                checkRevocation(this.pkixParams, x509Certificate4, this.validDate, x509Certificate322, publicKey222, cRLDistUrls2, oCSPUrls2, size);
                            }
                            checkRevocation(this.pkixParams, x509Certificate4, this.validDate, x509Certificate322, publicKey222, cRLDistUrls2, oCSPUrls2, size);
                        } catch (CertPathReviewerException e14) {
                            e = e14;
                            addError(e.getErrorMessage(), size);
                            if (x500Principal222 != null) {
                            }
                            if (i10 != this.f62148n) {
                            }
                            c10 = 5;
                            x500Principal222 = x509Certificate4.getSubjectX500Principal();
                            publicKey222 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                            AlgorithmIdentifier algorithmIdentifier22222 = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey222);
                            algorithmIdentifier22222.getAlgorithm();
                            algorithmIdentifier22222.getParameters();
                            size--;
                            x509Certificate322 = x509Certificate4;
                        }
                        cRLDistPoint = null;
                        extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate4, AUTH_INFO_ACCESS);
                        if (extensionValue != null) {
                        }
                        authorityInformationAccess = null;
                        Vector cRLDistUrls22 = getCRLDistUrls(cRLDistPoint);
                        Vector oCSPUrls22 = getOCSPUrls(authorityInformationAccess);
                        it = cRLDistUrls22.iterator();
                        while (it.hasNext()) {
                        }
                        it2 = oCSPUrls22.iterator();
                        while (it2.hasNext()) {
                        }
                        i10 = i11;
                    } else {
                        i10 = i11;
                    }
                    if (x500Principal222 != null && !x509Certificate4.getIssuerX500Principal().equals(x500Principal222)) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", new Object[]{x500Principal222.getName(), x509Certificate4.getIssuerX500Principal().getName()}), size);
                    }
                    if (i10 != this.f62148n) {
                        if (x509Certificate4 != null && x509Certificate4.getVersion() == 1) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), size);
                        }
                        try {
                            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate4, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                            if (basicConstraints == null) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBasicConstraints"), size);
                            } else if (!basicConstraints.isCA()) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), size);
                            }
                        } catch (AnnotatedException unused8) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.errorProcesingBC"), size);
                        }
                        boolean[] keyUsage2 = x509Certificate4.getKeyUsage();
                        if (keyUsage2 != null) {
                            c10 = 5;
                            if (keyUsage2.length <= 5 || !keyUsage2[5]) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCertSign"), size);
                            }
                            x500Principal222 = x509Certificate4.getSubjectX500Principal();
                            publicKey222 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                            AlgorithmIdentifier algorithmIdentifier222222 = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey222);
                            algorithmIdentifier222222.getAlgorithm();
                            algorithmIdentifier222222.getParameters();
                            size--;
                            x509Certificate322 = x509Certificate4;
                        }
                    }
                    c10 = 5;
                    x500Principal222 = x509Certificate4.getSubjectX500Principal();
                    publicKey222 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                    AlgorithmIdentifier algorithmIdentifier2222222 = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey222);
                    algorithmIdentifier2222222.getAlgorithm();
                    algorithmIdentifier2222222.getParameters();
                    size--;
                    x509Certificate322 = x509Certificate4;
                }
                this.trustAnchor = trustAnchor2;
                this.subjectPublicKey = publicKey222;
            }
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noTrustAnchorFound", new Object[]{new UntrustedInput(x509Certificate2.getIssuerX500Principal()), Integers.valueOf(this.pkixParams.getTrustAnchors().size())}));
        }
        trustAnchor = null;
        trustAnchor2 = trustAnchor;
        if (trustAnchor2 == null) {
        }
        if (trustAnchor2 == null) {
        }
        X509Certificate x509Certificate3222 = x509Certificate;
        X500Principal x500Principal2222 = x500Principal;
        PublicKey publicKey2222 = publicKey;
        size = this.certs.size() - 1;
        while (size >= 0) {
        }
        this.trustAnchor = trustAnchor2;
        this.subjectPublicKey = publicKey2222;
    }

    private X509CRL getCRL(String str) {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e10) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e10.getMessage(), e10, e10.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i10) {
        ErrorBundle errorBundle;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z10 = false;
            for (int i11 = 0; i11 < aSN1Sequence.size(); i11++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i11));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcSSCD");
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double doubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(doubleValue)), monetaryValue}) : new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(doubleValue)), monetaryValue}), i10);
                        } else {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i10);
                            z10 = true;
                        }
                    }
                }
                addNotification(errorBundle, i10);
            }
            return !z10;
        } catch (AnnotatedException unused) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcStatementExtError"), i10);
            return false;
        }
    }

    public void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0257  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void checkCRLs(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, int i10) {
        Iterator it;
        X509CRL x509crl;
        boolean z10;
        boolean z11;
        String str;
        boolean[] keyUsage;
        X509CRL x509crl2;
        X500Principal x500Principal;
        Iterator it2;
        boolean z12;
        ErrorBundle errorBundle;
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            x509CRLStoreSelector.setCertificateChecking(x509Certificate);
            try {
                Set findCRLs = PKIXCRLUtil.findCRLs(x509CRLStoreSelector, pKIXParameters);
                it = findCRLs.iterator();
                if (findCRLs.isEmpty()) {
                    Iterator it3 = PKIXCRLUtil.findCRLs(new X509CRLStoreSelector(), pKIXParameters).iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it3.hasNext()) {
                        arrayList.add(((X509CRL) it3.next()).getIssuerX500Principal());
                    }
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlInCertstore", new Object[]{new UntrustedInput(x509CRLStoreSelector.getIssuerNames()), new UntrustedInput(arrayList), Integers.valueOf(arrayList.size())}), i10);
                }
            } catch (AnnotatedException e10) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError", new Object[]{e10.getCause().getMessage(), e10.getCause(), e10.getCause().getClass().getName()}), i10);
                it = new ArrayList().iterator();
            }
            X509CRL x509crl3 = null;
            while (it.hasNext()) {
                x509crl3 = (X509CRL) it.next();
                Date thisUpdate = x509crl3.getThisUpdate();
                Date nextUpdate = x509crl3.getNextUpdate();
                Object[] objArr = {new TrustedInput(thisUpdate), new TrustedInput(nextUpdate)};
                if (nextUpdate == null || date.before(x509crl3.getNextUpdate())) {
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localValidCRL", objArr), i10);
                    x509crl = x509crl3;
                    z10 = true;
                    break;
                }
                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localInvalidCRL", objArr), i10);
            }
            x509crl = x509crl3;
            z10 = false;
            if (!z10) {
                X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                Iterator it4 = vector.iterator();
                boolean z13 = z10;
                while (true) {
                    if (!it4.hasNext()) {
                        z11 = z13;
                        break;
                    }
                    try {
                        String str2 = (String) it4.next();
                        X509CRL crl = getCRL(str2);
                        if (crl != null) {
                            X500Principal issuerX500Principal2 = crl.getIssuerX500Principal();
                            if (issuerX500Principal.equals(issuerX500Principal2)) {
                                x509crl2 = x509crl;
                                x500Principal = issuerX500Principal;
                                it2 = it4;
                                z12 = z13;
                                Date thisUpdate2 = crl.getThisUpdate();
                                Date nextUpdate2 = crl.getNextUpdate();
                                Object[] objArr2 = {new TrustedInput(thisUpdate2), new TrustedInput(nextUpdate2), new UntrustedUrlInput(str2)};
                                if (nextUpdate2 != null && !date.before(nextUpdate2)) {
                                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineInvalidCRL", objArr2);
                                }
                                try {
                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineValidCRL", objArr2), i10);
                                    x509crl = crl;
                                    z11 = true;
                                    break;
                                } catch (CertPathReviewerException e11) {
                                    e = e11;
                                    z13 = true;
                                    addNotification(e.getErrorMessage(), i10);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                    issuerX500Principal = x500Principal;
                                }
                            } else {
                                x509crl2 = x509crl;
                                try {
                                    x500Principal = issuerX500Principal;
                                    it2 = it4;
                                    try {
                                        z12 = z13;
                                    } catch (CertPathReviewerException e12) {
                                        e = e12;
                                        addNotification(e.getErrorMessage(), i10);
                                        it4 = it2;
                                        x509crl = x509crl2;
                                        issuerX500Principal = x500Principal;
                                    }
                                    try {
                                        errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineCRLWrongCA", new Object[]{new UntrustedInput(issuerX500Principal2.getName()), new UntrustedInput(x500Principal.getName()), new UntrustedUrlInput(str2)});
                                    } catch (CertPathReviewerException e13) {
                                        e = e13;
                                        z13 = z12;
                                        addNotification(e.getErrorMessage(), i10);
                                        it4 = it2;
                                        x509crl = x509crl2;
                                        issuerX500Principal = x500Principal;
                                    }
                                } catch (CertPathReviewerException e14) {
                                    e = e14;
                                    x500Principal = issuerX500Principal;
                                    it2 = it4;
                                    addNotification(e.getErrorMessage(), i10);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                    issuerX500Principal = x500Principal;
                                }
                            }
                            addNotification(errorBundle, i10);
                        } else {
                            x509crl2 = x509crl;
                            x500Principal = issuerX500Principal;
                            it2 = it4;
                            z12 = z13;
                        }
                        it4 = it2;
                        x509crl = x509crl2;
                        issuerX500Principal = x500Principal;
                        z13 = z12;
                    } catch (CertPathReviewerException e15) {
                        e = e15;
                        x509crl2 = x509crl;
                    }
                }
            } else {
                z11 = z10;
            }
            if (x509crl != null) {
                if (x509Certificate2 != null && (keyUsage = x509Certificate2.getKeyUsage()) != null && (keyUsage.length <= 6 || !keyUsage[6])) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlSigningPermited"));
                }
                if (publicKey == null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNoIssuerPublicKey"));
                }
                try {
                    x509crl.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                    X509CRLEntry revokedCertificate = x509crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                    if (revokedCertificate != null) {
                        if (revokedCertificate.hasExtensions()) {
                            try {
                                ASN1Enumerated aSN1Enumerated = ASN1Enumerated.getInstance(CertPathValidatorUtilities.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                                if (aSN1Enumerated != null) {
                                    str = CertPathValidatorUtilities.crlReasons[aSN1Enumerated.intValueExact()];
                                    if (str == null) {
                                        str = CertPathValidatorUtilities.crlReasons[7];
                                    }
                                    LocaleString localeString = new LocaleString(RESOURCE_NAME, str);
                                    if (date.before(revokedCertificate.getRevocationDate())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certRevoked", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}));
                                    }
                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.revokedAfterValidation", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}), i10);
                                }
                            } catch (AnnotatedException e16) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlReasonExtError"), e16);
                            }
                        }
                        str = null;
                        if (str == null) {
                        }
                        LocaleString localeString2 = new LocaleString(RESOURCE_NAME, str);
                        if (date.before(revokedCertificate.getRevocationDate())) {
                        }
                    } else {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notRevoked"), i10);
                    }
                    Date nextUpdate3 = x509crl.getNextUpdate();
                    if (nextUpdate3 != null && !date.before(nextUpdate3)) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlUpdateAvailable", new Object[]{new TrustedInput(nextUpdate3)}), i10);
                    }
                    try {
                        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                        try {
                            ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                            if (extensionValue2 != null) {
                                X509CRLStoreSelector x509CRLStoreSelector2 = new X509CRLStoreSelector();
                                try {
                                    x509CRLStoreSelector2.addIssuerName(CertPathValidatorUtilities.getIssuerPrincipal(x509crl).getEncoded());
                                    x509CRLStoreSelector2.setMinCRLNumber(((ASN1Integer) extensionValue2).getPositiveValue());
                                    try {
                                        x509CRLStoreSelector2.setMaxCRLNumber(((ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                                        try {
                                            Iterator it5 = PKIXCRLUtil.findCRLs(x509CRLStoreSelector2, pKIXParameters).iterator();
                                            while (it5.hasNext()) {
                                                try {
                                                    if (Objects.areEqual(extensionValue, CertPathValidatorUtilities.getExtensionValue((X509CRL) it5.next(), CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT))) {
                                                    }
                                                } catch (AnnotatedException e17) {
                                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"), e17);
                                                }
                                            }
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBaseCRL"));
                                        } catch (AnnotatedException e18) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError"), e18);
                                        }
                                    } catch (AnnotatedException e19) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNbrExtError"), e19);
                                    }
                                } catch (IOException e20) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlIssuerException"), e20);
                                }
                            }
                            if (extensionValue != null) {
                                IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                try {
                                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyUserCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyCaCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyAttrCert"));
                                    }
                                } catch (AnnotatedException e21) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlBCExtError"), e21);
                                }
                            }
                        } catch (AnnotatedException unused) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.deltaCrlExtError"));
                        }
                    } catch (AnnotatedException unused2) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"));
                    }
                } catch (Exception e22) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlVerifyFailed"), e22);
                }
            }
            if (!z11) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidCrlFound"));
            }
        } catch (IOException e23) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlIssuerException"), e23);
        }
    }

    public void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i10) {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i10);
    }

    public void doChecks() {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i10 = this.f62148n;
        this.notifications = new List[i10 + 1];
        this.errors = new List[i10 + 1];
        int i11 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i11 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i11] = new ArrayList();
            this.errors[i11] = new ArrayList();
            i11++;
        }
    }

    public Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i10 = 0; i10 < names.length; i10++) {
                        if (names[i10].getTagNo() == 6) {
                            vector.add(((DERIA5String) names[i10].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.f62148n;
    }

    public List getErrors(int i10) {
        doChecks();
        return this.errors[i10 + 1];
    }

    public List getNotifications(int i10) {
        doChecks();
        return this.notifications[i10 + 1];
    }

    public Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i10 = 0; i10 < accessDescriptions.length; i10++) {
                if (accessDescriptions[i10].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i10].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((DERIA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    public Collection getTrustAnchors(X509Certificate x509Certificate, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                byte[] keyIdentifier = authorityKeyIdentifier.getKeyIdentifier();
                if (keyIdentifier != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) {
        if (this.initialized) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        this.certPath = certPath;
        List<? extends Certificate> certificates = certPath.getCertificates();
        this.certs = certificates;
        this.f62148n = certificates.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = CertPathValidatorUtilities.getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() {
        doChecks();
        int i10 = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i10 >= listArr.length) {
                return true;
            }
            if (!listArr[i10].isEmpty()) {
                return false;
            }
            i10++;
        }
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) {
        init(certPath, pKIXParameters);
    }

    public void addError(ErrorBundle errorBundle, int i10) {
        if (i10 < -1 || i10 >= this.f62148n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i10 + 1].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle, int i10) {
        if (i10 < -1 || i10 >= this.f62148n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i10 + 1].add(errorBundle);
    }

    public List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public List[] getNotifications() {
        doChecks();
        return this.notifications;
    }
}
