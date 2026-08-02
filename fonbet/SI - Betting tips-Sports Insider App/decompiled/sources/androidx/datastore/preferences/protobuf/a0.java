package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1572a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1573b;

    static {
        Charset.forName("US-ASCII");
        f1572a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f1573b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new j(bArr, 0, 0, false).e(0);
        } catch (c0 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
