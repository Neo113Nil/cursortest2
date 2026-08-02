package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal.java */
/* loaded from: classes12.dex */
public final class b0 {
    public static final Charset a;
    public static final byte[] b;

    /* compiled from: Internal.java */
    public interface a {
        int getNumber();
    }

    /* compiled from: Internal.java */
    public interface b<T extends a> {
    }

    /* compiled from: Internal.java */
    public interface c {
        boolean isInRange(int i);
    }

    /* compiled from: Internal.java */
    public interface d<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        d<E> mutableCopyWithCapacity(int i);
    }

    static {
        Charset.forName(C.ASCII_NAME);
        a = Charset.forName(C.UTF8_NAME);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new g.a(bArr, 0, 0, false).c(0);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
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
