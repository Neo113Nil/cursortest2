package androidx.datastore.preferences.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal.java */
/* loaded from: classes.dex */
public final class p {
    public static final Charset a;
    public static final byte[] b;

    /* compiled from: Internal.java */
    /* loaded from: classes12.dex */
    public interface a {
        int getNumber();
    }

    /* compiled from: Internal.java */
    public interface b {
        boolean a();
    }

    /* compiled from: Internal.java */
    /* loaded from: classes12.dex */
    public interface c<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        c<E> mutableCopyWithCapacity(int i);
    }

    static {
        Charset.forName(C.ASCII_NAME);
        a = Charset.forName(C.UTF8_NAME);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        f.d(bArr, 0, 0, false);
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
