package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import org.bouncycastle.i18n.LocalizedMessage;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2149y {
    public static final byte[] EMPTY_BYTE_ARRAY;

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f19690a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f19691b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f19692c = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);

    /* renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f19693d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC2133h f19694e;

    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    public interface a {
        boolean isInRange(int i10);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$b */
    public interface b extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        b mutableCopyWithCapacity(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        f19693d = ByteBuffer.wrap(bArr);
        f19694e = AbstractC2133h.i(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i10, int i11) {
        int g10 = g(i11, bArr, i10, i11);
        if (g10 == 0) {
            return 1;
        }
        return g10;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int g(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
