package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aod implements HostnameVerifier {
    public static final aod a = new aod();
    public static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01c9, code lost:
    
        defpackage.a70.r("Unexpected end of DN: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01d0, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
    
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
    
        r4 = r5.c;
        r9 = new java.lang.String(r10, r4, r5.d - r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean z;
        boolean z2;
        String str2;
        int i;
        char[] cArr;
        char c;
        int i2;
        char c2;
        boolean z3 = false;
        boolean z4 = true;
        if (b.matcher(str).matches()) {
            List a2 = a(x509Certificate, 7);
            int size = a2.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (str.equalsIgnoreCase((String) a2.get(i3))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c3 = 2;
        List a3 = a(x509Certificate, 2);
        int size2 = a3.size();
        int i4 = 0;
        Object[] objArr = false;
        while (i4 < size2) {
            if (c(lowerCase, (String) a3.get(i4))) {
                return true;
            }
            i4++;
            objArr = true;
        }
        if (objArr == false) {
            b65 b65Var = new b65(x509Certificate.getSubjectX500Principal());
            int i5 = b65Var.a;
            b65Var.b = 0;
            b65Var.c = 0;
            b65Var.d = 0;
            b65Var.e = 0;
            String str3 = (String) b65Var.f;
            b65Var.g = str3.toCharArray();
            String c4 = b65Var.c();
            String str4 = null;
            if (c4 != null) {
                while (true) {
                    int i6 = b65Var.b;
                    if (i6 == i5) {
                        break;
                    }
                    char c5 = ((char[]) b65Var.g)[i6];
                    char c6 = c3;
                    z = z3;
                    if (c5 == '\"') {
                        z2 = z4;
                        int i7 = i6 + 1;
                        b65Var.b = i7;
                        b65Var.c = i7;
                        b65Var.d = i7;
                        while (true) {
                            int i8 = b65Var.b;
                            if (i8 == i5) {
                                a70.r("Unexpected end of DN: ".concat(str3));
                                return z;
                            }
                            char[] cArr2 = (char[]) b65Var.g;
                            char c7 = cArr2[i8];
                            if (c7 == '\"') {
                                b65Var.b = i8 + 1;
                                while (true) {
                                    int i9 = b65Var.b;
                                    if (i9 >= i5 || ((char[]) b65Var.g)[i9] != ' ') {
                                        break;
                                    }
                                    b65Var.b = i9 + 1;
                                }
                                char[] cArr3 = (char[]) b65Var.g;
                                int i10 = b65Var.c;
                                str2 = new String(cArr3, i10, b65Var.d - i10);
                            } else {
                                int i11 = b65Var.d;
                                if (c7 == '\\') {
                                    cArr2[i11] = b65Var.b();
                                } else {
                                    cArr2[i11] = c7;
                                }
                                b65Var.b++;
                                b65Var.d++;
                            }
                        }
                    } else if (c5 == '#') {
                        z2 = z4;
                        if (i6 + 4 >= i5) {
                            a70.r("Unexpected end of DN: ".concat(str3));
                            return z;
                        }
                        b65Var.c = i6;
                        b65Var.b = i6 + 1;
                        while (true) {
                            i = b65Var.b;
                            if (i == i5 || (c = (cArr = (char[]) b65Var.g)[i]) == '+' || c == ',' || c == ';') {
                                break;
                            }
                            if (c == ' ') {
                                b65Var.d = i;
                                b65Var.b = i + 1;
                                while (true) {
                                    int i12 = b65Var.b;
                                    if (i12 >= i5 || ((char[]) b65Var.g)[i12] != ' ') {
                                        break;
                                    }
                                    b65Var.b = i12 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i] = (char) (c + ' ');
                                }
                                b65Var.b = i + 1;
                            }
                        }
                        b65Var.d = i;
                        int i13 = b65Var.d;
                        int i14 = b65Var.c;
                        int i15 = i13 - i14;
                        if (i15 < 5 || (i15 & 1) == 0) {
                            break;
                        }
                        int i16 = i15 / 2;
                        byte[] bArr = new byte[i16];
                        int i17 = i14 + 1;
                        for (int i18 = z ? 1 : 0; i18 < i16; i18++) {
                            bArr[i18] = (byte) b65Var.a(i17);
                            i17 += 2;
                        }
                        str2 = new String((char[]) b65Var.g, b65Var.c, i15);
                    } else if (c5 == '+' || c5 == ',' || c5 == ';') {
                        z2 = z4;
                        str2 = "";
                    } else {
                        b65Var.c = i6;
                        b65Var.d = i6;
                        while (true) {
                            int i19 = b65Var.b;
                            char[] cArr4 = (char[]) b65Var.g;
                            if (i19 >= i5) {
                                int i20 = b65Var.c;
                                str2 = new String(cArr4, i20, b65Var.d - i20);
                                z2 = z4;
                                break;
                            }
                            char c8 = cArr4[i19];
                            if (c8 == ' ') {
                                z2 = z4;
                                int i21 = b65Var.d;
                                b65Var.e = i21;
                                b65Var.b = i19 + 1;
                                b65Var.d = i21 + 1;
                                cArr4[i21] = ' ';
                                while (true) {
                                    i2 = b65Var.b;
                                    if (i2 >= i5) {
                                        break;
                                    }
                                    char[] cArr5 = (char[]) b65Var.g;
                                    if (cArr5[i2] != ' ') {
                                        break;
                                    }
                                    int i22 = b65Var.d;
                                    b65Var.d = i22 + 1;
                                    cArr5[i22] = ' ';
                                    b65Var.b = i2 + 1;
                                }
                                if (i2 == i5 || (c2 = ((char[]) b65Var.g)[i2]) == ',' || c2 == '+' || c2 == ';') {
                                    break;
                                }
                                z4 = z2;
                            } else {
                                if (c8 == ';') {
                                    break;
                                }
                                if (c8 == '\\') {
                                    z2 = z4;
                                    int i23 = b65Var.d;
                                    b65Var.d = i23 + 1;
                                    cArr4[i23] = b65Var.b();
                                    b65Var.b++;
                                } else {
                                    if (c8 == '+' || c8 == ',') {
                                        break;
                                    }
                                    int i24 = b65Var.d;
                                    z2 = z4;
                                    b65Var.d = i24 + 1;
                                    cArr4[i24] = c8;
                                    b65Var.b = i19 + 1;
                                }
                                z4 = z2;
                            }
                        }
                        char[] cArr6 = (char[]) b65Var.g;
                        int i25 = b65Var.c;
                        str2 = new String(cArr6, i25, b65Var.e - i25);
                    }
                    if ("cn".equalsIgnoreCase(c4)) {
                        str4 = str2;
                        break;
                    }
                    int i26 = b65Var.b;
                    if (i26 >= i5) {
                        break;
                    }
                    char c9 = ((char[]) b65Var.g)[i26];
                    if (c9 != ',' && c9 != ';' && c9 != '+') {
                        a70.r("Malformed DN: ".concat(str3));
                        return z;
                    }
                    b65Var.b = i26 + 1;
                    c4 = b65Var.c();
                    if (c4 == null) {
                        a70.r("Malformed DN: ".concat(str3));
                        return z;
                    }
                    c3 = c6;
                    z3 = z ? 1 : 0;
                    z4 = z2;
                }
            }
            z = z3;
            return str4 != null ? c(lowerCase, str4) : z;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String substring = lowerCase.substring(1);
        if (!str.endsWith(substring)) {
            return false;
        }
        int length = str.length() - substring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
