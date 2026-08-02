package gc;

import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Certificate f9931a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Certificate f9932b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Certificate f9933c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Certificate f9934d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Certificate f9935e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile Certificate f9936f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile Certificate f9937g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Certificate f9938h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile Certificate f9939i;
    public static volatile Certificate j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile Certificate f9940k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile Certificate f9941l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile Certificate f9942m;

    /* renamed from: n, reason: collision with root package name */
    public static volatile Certificate f9943n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile Certificate f9944o;

    public static Certificate a(String certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        byte[] bytes = certificate.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            Intrinsics.checkNotNullExpressionValue(certificateFactory, "getInstance(...)");
            Certificate generateCertificate = certificateFactory.generateCertificate(byteArrayInputStream);
            byteArrayInputStream.close();
            Intrinsics.checkNotNullExpressionValue(generateCertificate, "use(...)");
            return generateCertificate;
        } finally {
        }
    }
}
