package c9;

import android.content.SharedPreferences;
import android.util.Base64;
import h8.g;
import h8.i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.android.core.w0;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3714c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3715a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3716b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(g gVar) {
        gVar.a();
        this.f3715a = gVar.f10401a.getSharedPreferences("com.google.android.gms.appid", 0);
        gVar.a();
        i iVar = gVar.f10403c;
        String str = iVar.f10419e;
        if (str == null) {
            gVar.a();
            str = iVar.f10416b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.f3716b = str;
    }

    public final String a() {
        String string;
        synchronized (this.f3715a) {
            string = this.f3715a.getString("|S|id", null);
        }
        return string;
    }

    public final String b() {
        PublicKey publicKey;
        synchronized (this.f3715a) {
            String str = null;
            String string = this.f3715a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e7) {
                w0.m("ContentValues", "Invalid key stored " + e7);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & KotlinVersion.MAX_COMPONENT_VALUE);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                w0.m("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
