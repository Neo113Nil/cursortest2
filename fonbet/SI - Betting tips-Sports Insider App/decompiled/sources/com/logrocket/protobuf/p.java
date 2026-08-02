package com.logrocket.protobuf;

import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class p extends l1 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f6773d = Logger.getLogger(p.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f6774e = x1.f6823e;

    /* renamed from: c, reason: collision with root package name */
    public n0 f6775c;

    public static int g(int i5, j jVar) {
        return h(jVar) + o(i5);
    }

    public static int h(j jVar) {
        int size = jVar.size();
        return p(size) + size;
    }

    public static int i(int i5) {
        return o(i5) + 4;
    }

    public static int j(int i5) {
        return o(i5) + 8;
    }

    public static int k(int i5, a aVar, g1 g1Var) {
        return aVar.b(g1Var) + (o(i5) * 2);
    }

    public static int l(int i5) {
        if (i5 >= 0) {
            return p(i5);
        }
        return 10;
    }

    public static int m(int i5) {
        return p((i5 >> 31) ^ (i5 << 1));
    }

    public static int n(String str) {
        int length;
        try {
            length = a2.c(str);
        } catch (z1 unused) {
            length = str.getBytes(d0.f6681a).length;
        }
        return p(length) + length;
    }

    public static int o(int i5) {
        return p(i5 << 3);
    }

    public static int p(int i5) {
        if ((i5 & (-128)) == 0) {
            return 1;
        }
        if ((i5 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i5) == 0) {
            return 3;
        }
        return (i5 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int q(long j) {
        int i5;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i5 = 6;
        } else {
            i5 = 2;
        }
        if (((-2097152) & j) != 0) {
            i5 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i5 + 1 : i5;
    }

    public static p u(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new l(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return x1.f6822d ? new o(byteBuffer) : new n(byteBuffer);
    }

    public abstract void A(int i5, int i10);

    public abstract void B(int i5);

    public abstract void C(int i5, long j);

    public abstract void D(long j);

    public abstract void E(int i5, int i10);

    public abstract void F(int i5);

    public abstract void G(int i5, a aVar, g1 g1Var);

    public abstract void H(a aVar);

    public abstract void I(int i5, String str);

    public abstract void J(String str);

    public abstract void K(int i5, int i10);

    public abstract void L(int i5, int i10);

    public abstract void M(int i5);

    public abstract void N(int i5, long j);

    public abstract void O(long j);

    public abstract void r();

    public abstract int s();

    public final void t(String str, z1 z1Var) {
        f6773d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) z1Var);
        byte[] bytes = str.getBytes(d0.f6681a);
        try {
            M(bytes.length);
            f(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new m(e7);
        }
    }

    public abstract void v(byte b10);

    public abstract void w(int i5, boolean z5);

    public abstract void x(int i5, byte[] bArr);

    public abstract void y(int i5, j jVar);

    public abstract void z(j jVar);
}
