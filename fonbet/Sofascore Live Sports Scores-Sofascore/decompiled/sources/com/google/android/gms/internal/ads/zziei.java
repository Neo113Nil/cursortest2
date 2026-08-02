package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.dpo;
import defpackage.fn0;
import defpackage.ipo;
import defpackage.lnb;
import defpackage.mpo;
import defpackage.mz1;
import defpackage.t6a;
import defpackage.x5n;
import defpackage.y6a;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zziei implements Iterable<Byte>, Serializable {
    public static final mpo b = new mpo(zzifz.a);
    public int a = 0;

    static {
        int i = dpo.a;
    }

    public static mpo B(int i, int i2, byte[] bArr) {
        try {
            return C(i, i2, bArr);
        } catch (zzige e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static mpo C(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return b;
        }
        e(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new mpo(bArr2);
    }

    public static zziei D(ArrayList arrayList) {
        int size = arrayList.size();
        return size == 0 ? b : v(arrayList.iterator(), size);
    }

    public static int e(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            defpackage.zzl.r(fn0.k(i, "Beginning index: ", " < 0", new StringBuilder(String.valueOf(i).length() + 21)));
            return 0;
        }
        if (i2 < i) {
            defpackage.zzl.r(x5n.n(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length()), i, "Beginning index larger than ending index: ", i2, ", "));
            return 0;
        }
        defpackage.zzl.r(x5n.n(new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length()), i2, "End index: ", i3, " >= "));
        return 0;
    }

    public static /* synthetic */ boolean m(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i3;
        e(i, i4, bArr.length);
        e(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static zziei v(Iterator it, int i) {
        if (i <= 0) {
            Locale locale = Locale.ROOT;
            a70.p(lnb.k(i, "length (", ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return (zziei) it.next();
        }
        int i2 = i >>> 1;
        zziei v = v(it, i2);
        zziei v2 = v(it, i - i2);
        if (Integer.MAX_VALUE - v.o() < v2.o()) {
            int o = v.o();
            int o2 = v2.o();
            a70.p(x5n.n(new StringBuilder(String.valueOf(o).length() + 31 + String.valueOf(o2).length()), o, "ByteString would be too long: ", o2, "+"));
            return null;
        }
        if (v2.o() == 0) {
            return v;
        }
        if (v.o() == 0) {
            return v2;
        }
        int o3 = v2.o() + v.o();
        mpo mpoVar = b;
        if (o3 < 128) {
            int o4 = v.o();
            int o5 = v2.o();
            int i3 = o4 + o5;
            byte[] bArr = new byte[i3];
            e(0, o4, v.o());
            e(0, o4, i3);
            if (o4 > 0) {
                v.r(0, 0, o4, bArr);
            }
            e(0, o5, v2.o());
            e(o4, i3, i3);
            if (o5 > 0) {
                v2.r(0, o4, o5, bArr);
            }
            if (i3 == 0) {
                return mpoVar;
            }
            try {
                return new mpo(bArr);
            } catch (zzige e) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            }
        }
        if (v instanceof x) {
            x xVar = (x) v;
            zziei zzieiVar = xVar.d;
            zziei zzieiVar2 = xVar.e;
            if (v2.o() + zzieiVar2.o() < 128) {
                int o6 = zzieiVar2.o();
                int o7 = v2.o();
                int i4 = o6 + o7;
                byte[] bArr2 = new byte[i4];
                e(0, o6, zzieiVar2.o());
                e(0, o6, i4);
                if (o6 > 0) {
                    zzieiVar2.r(0, 0, o6, bArr2);
                }
                e(0, o7, v2.o());
                e(o6, i4, i4);
                if (o7 > 0) {
                    v2.r(0, o6, o7, bArr2);
                }
                if (i4 != 0) {
                    try {
                        mpoVar = new mpo(bArr2);
                    } catch (zzige e2) {
                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                    }
                }
                return new x(zzieiVar, mpoVar);
            }
            if (zzieiVar.y() > zzieiVar2.y() && xVar.g > v2.y()) {
                return new x(zzieiVar, new x(zzieiVar2, v2));
            }
        }
        if (o3 >= x.E(Math.max(v.y(), v2.y()) + 1)) {
            return new x(v, v2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        t6a.O(v, arrayDeque);
        t6a.O(v2, arrayDeque);
        zziei zzieiVar3 = (zziei) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzieiVar3 = new x((zziei) arrayDeque.pop(), zzieiVar3);
        }
        return zzieiVar3;
    }

    @Override // java.lang.Iterable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public zzied iterator() {
        return new ipo(this);
    }

    public final byte[] d() {
        int o = o();
        if (o == 0) {
            return zzifz.a;
        }
        byte[] bArr = new byte[o];
        r(0, 0, o, bArr);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziei)) {
            return false;
        }
        zziei zzieiVar = (zziei) obj;
        int o = o();
        if (o != zzieiVar.o()) {
            return false;
        }
        if (o == 0) {
            return true;
        }
        int i = this.a;
        int i2 = zzieiVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return u(zzieiVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int o = o();
            i = w(o, 0, o);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public abstract byte n(int i);

    public abstract int o();

    public abstract zziei p(int i, int i2);

    public abstract zziei q(int i, int i2);

    public abstract void r(int i, int i2, int i3, byte[] bArr);

    public abstract ByteBuffer s();

    public abstract void t(zzier zzierVar);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return mz1.o(mz1.q(o(), "<ByteString@", hexString, " size=", " contents=\""), o() <= 50 ? y6a.R(d()) : y6a.R(q(0, 47).d()).concat("..."), "\">");
    }

    public abstract boolean u(zziei zzieiVar);

    public abstract int w(int i, int i2, int i3);

    public abstract zziem x();

    public abstract int y();

    public abstract boolean z();
}
