package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class N extends zbuf implements zbvn {
    private static final N zbb;
    private int zbd;
    private Object zbf;
    private C6856r0 zbg;
    private boolean zbh;
    private W0 zbi;
    private V0 zbj;
    private C6835g0 zbk;
    private int zbl;
    private int zbe = 0;
    private byte zbm = 2;

    static {
        N n11 = new N();
        zbb = n11;
        zbuf.zbD(N.class, n11);
    }

    private N() {
    }

    public static L b() {
        return (L) zbb.zbq();
    }

    static /* synthetic */ void d(N n11, V0 v02) {
        v02.getClass();
        n11.zbj = v02;
        n11.zbd |= 8;
    }

    static /* synthetic */ void e(N n11, C6856r0 c6856r0) {
        c6856r0.getClass();
        n11.zbg = c6856r0;
        n11.zbd |= 1;
    }

    public final int a() {
        return this.zbl;
    }

    public final boolean f() {
        if (this.zbe == 6) {
            return ((Boolean) this.zbf).booleanValue();
        }
        return false;
    }

    public final boolean g() {
        if (this.zbe == 5) {
            return ((Boolean) this.zbf).booleanValue();
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbm);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005:\u0000\u0006:\u0000\u0007ဉ\u0004\bင\u0005", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", "zbj", "zbi", "zbk", "zbl"});
        }
        if (i12 == 3) {
            return new N();
        }
        if (i12 == 4) {
            return new L(r12);
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbm = obj != null ? (byte) 1 : (byte) 0;
        return null;
    }

    public final boolean zbi() {
        return (this.zbd & 32) != 0;
    }
}
