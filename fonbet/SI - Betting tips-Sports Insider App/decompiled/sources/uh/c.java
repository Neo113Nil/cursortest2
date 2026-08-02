package uh;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.z;
import okio.Utf8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f24333a = new c();

    public static List a(X509Certificate x509Certificate, int i5) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return e0.f19204a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i5)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return e0.f19204a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[LOOP:1: B:26:0x007a->B:58:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String host, X509Certificate certificate) {
        boolean z5;
        int length;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        Regex regex = hh.d.f10820a;
        Intrinsics.checkNotNullParameter(host, "<this>");
        if (hh.d.f10820a.d(host)) {
            String b10 = hh.d.b(host);
            List a7 = a(certificate, 7);
            if (a7 == null || !a7.isEmpty()) {
                Iterator it = a7.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(b10, hh.d.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (host.length() == ((int) Utf8.size$default(host, 0, 0, 3, null))) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            host = host.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(host, "toLowerCase(...)");
        }
        List<String> a10 = a(certificate, 2);
        if (a10 == null || !a10.isEmpty()) {
            for (String str : a10) {
                if (host != null && host.length() != 0 && !z.o(host, ".", false) && !z.i(host, "..", false) && str != null && str.length() != 0 && !z.o(str, ".", false) && !z.i(str, "..", false)) {
                    String concat = !z.i(host, ".", false) ? host.concat(".") : host;
                    if (!z.i(str, ".", false)) {
                        str = str.concat(".");
                    }
                    if (str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null))) {
                        Locale US2 = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US2, "US");
                        str = str.toLowerCase(US2);
                        Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                    }
                    if (!StringsKt.A(str, "*", false)) {
                        z5 = Intrinsics.areEqual(concat, str);
                    } else if (z.o(str, "*.", false) && StringsKt.F(str, '*', 1, false, 4) == -1 && concat.length() >= str.length() && !Intrinsics.areEqual("*.", str)) {
                        String substring = str.substring(1);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        if (z.i(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || StringsKt.J(concat, '.', length - 1, 4) == -1)) {
                            z5 = true;
                        }
                    }
                    if (!z5) {
                        return true;
                    }
                }
                z5 = false;
                if (!z5) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (host.length() == ((int) Utf8.size$default(host, 0, 0, 3, null))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return b(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
