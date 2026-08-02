package f7;

import android.util.Base64;
import java.security.SecureRandom;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final SecureRandom f9481a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f9481a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
