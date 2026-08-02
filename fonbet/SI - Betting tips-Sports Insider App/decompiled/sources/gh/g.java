package gh;

import androidx.appcompat.widget.c1;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class g {
    public static String a(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        if (!c1.v(certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder sb2 = new StringBuilder("sha256/");
        Intrinsics.checkNotNullParameter(certificate, "<this>");
        ByteString.Companion companion = ByteString.INSTANCE;
        byte[] encoded = certificate.getPublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
        sb2.append(ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256().base64());
        return sb2.toString();
    }
}
