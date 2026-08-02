package lf;

import P4.f;
import T7.E;
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
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* renamed from: lf.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7948d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C7948d f73278a = new C7948d();

    @NotNull
    public static ArrayList a(@NotNull X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        List b11 = b(certificate, 7);
        return C7714v.p0(b(certificate, 2), b11);
    }

    private static List b(X509Certificate x509Certificate, int i11) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return K.f71697a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.d(list.get(0), Integer.valueOf(i11)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return K.f71697a;
        }
    }

    private static boolean c(String str) {
        int i11;
        int length = str.length();
        int length2 = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (length2 < 0) {
            throw new IllegalArgumentException(E.a(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder f7 = f.f(length2, "endIndex > string.length: ", " > ");
            f7.append(str.length());
            throw new IllegalArgumentException(f7.toString().toString());
        }
        long j11 = 0;
        int i12 = 0;
        while (i12 < length2) {
            char charAt = str.charAt(i12);
            if (charAt < 128) {
                j11++;
            } else {
                if (charAt < 2048) {
                    i11 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i11 = 3;
                } else {
                    int i13 = i12 + 1;
                    char charAt2 = i13 < length2 ? str.charAt(i13) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j11++;
                        i12 = i13;
                    } else {
                        j11 += 4;
                        i12 += 2;
                    }
                }
                j11 += i11;
            }
            i12++;
        }
        return length == ((int) j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[LOOP:1: B:26:0x0078->B:58:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(@NotNull String host, @NotNull X509Certificate certificate) {
        boolean z11;
        int length;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        if (Ye.b.b(host)) {
            String b11 = Ye.a.b(host);
            List b12 = b(certificate, 7);
            if (!(b12 instanceof Collection) || !b12.isEmpty()) {
                Iterator it = b12.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d(b11, Ye.a.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (c(host)) {
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            host = host.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(host, "(this as java.lang.String).toLowerCase(locale)");
        }
        List<String> b13 = b(certificate, 2);
        if (!(b13 instanceof Collection) || !b13.isEmpty()) {
            for (String str : b13) {
                if (host != null && host.length() != 0 && !h.e0(host, ".", false) && !h.A(host, "..", false) && str != null && str.length() != 0 && !h.e0(str, ".", false) && !h.A(str, "..", false)) {
                    String concat = !h.A(host, ".", false) ? host.concat(".") : host;
                    if (!h.A(str, ".", false)) {
                        str = str.concat(".");
                    }
                    if (c(str)) {
                        Locale locale2 = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(locale2, "Locale.US");
                        str = str.toLowerCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!h.t(str, "*", false)) {
                        z11 = Intrinsics.d(concat, str);
                    } else if (h.e0(str, "*.", false) && h.I('*', 1, 4, str) == -1 && concat.length() >= str.length() && !"*.".equals(str)) {
                        String substring = str.substring(1);
                        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                        if (h.A(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || h.N('.', length - 1, 4, concat) == -1)) {
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        return true;
                    }
                }
                z11 = false;
                if (!z11) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(@NotNull String host, @NotNull SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (c(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                if (certificate != null) {
                    return d(host, (X509Certificate) certificate);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
