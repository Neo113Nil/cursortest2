package defpackage;

import com.appsflyer.internal.i;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class znd implements HostnameVerifier {
    public static final znd a = new znd();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return km5.a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.c(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return km5.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[LOOP:1: B:26:0x0060->B:56:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        str.getClass();
        if (uol.a.f(str)) {
            String b = uol.b(str);
            List a2 = a(x509Certificate, 7);
            if (a2 == null || !a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.c(b, uol.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (str.length() == ((int) mha.B(str))) {
            Locale locale = Locale.US;
            str = i.k(locale, str, locale);
        }
        List<String> a3 = a(x509Certificate, 2);
        if (a3 == null || !a3.isEmpty()) {
            for (String str2 : a3) {
                if (str.length() != 0 && !c.v(str, ".", false) && !c.n(str, "..", false) && str2 != null && str2.length() != 0 && !c.v(str2, ".", false) && !c.n(str2, "..", false)) {
                    String concat = !c.n(str, ".", false) ? str.concat(".") : str;
                    if (!c.n(str2, ".", false)) {
                        str2 = str2.concat(".");
                    }
                    if (str2.length() == ((int) mha.B(str2))) {
                        Locale locale2 = Locale.US;
                        str2 = i.k(locale2, str2, locale2);
                    }
                    if (!StringsKt.J(str2, "*", false)) {
                        z = concat.equals(str2);
                    } else if (c.v(str2, "*.", false) && StringsKt.O(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        if (c.n(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || StringsKt.S(concat, '.', length - 1, 4) == -1)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        return true;
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (str.length() == ((int) mha.B(str))) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return b(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
