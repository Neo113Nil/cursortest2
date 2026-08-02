package com.google.android.gms.internal.wearable;

import defpackage.drn;
import defpackage.fn0;
import defpackage.mha;
import defpackage.mz1;
import defpackage.opn;
import defpackage.rtn;
import defpackage.srn;
import defpackage.x5n;
import defpackage.zrn;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcg implements Iterable, Serializable {
    public static final zrn b = new zrn(zzdq.a);
    public int a = 0;

    static {
        int i = opn.a;
    }

    public static int r(int i, int i2, int i3) {
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

    public static /* synthetic */ boolean s(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i3;
        r(i, i4, bArr.length);
        r(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte c(int i);

    public abstract int d();

    public abstract srn e(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcg)) {
            return false;
        }
        zzcg zzcgVar = (zzcg) obj;
        int d = d();
        if (d != zzcgVar.d()) {
            return false;
        }
        if (d == 0) {
            return true;
        }
        int i = this.a;
        int i2 = zzcgVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return o(zzcgVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int d = d();
            i = p(d, d);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new drn(this);
    }

    public abstract void m(int i, byte[] bArr);

    public abstract void n(rtn rtnVar);

    public abstract boolean o(zzcg zzcgVar);

    public abstract int p(int i, int i2);

    public abstract zzcj q();

    public final String toString() {
        byte[] bArr;
        String concat;
        byte[] bArr2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d = d();
        if (d() <= 50) {
            int d2 = d();
            if (d2 == 0) {
                bArr2 = zzdq.a;
            } else {
                byte[] bArr3 = new byte[d2];
                m(d2, bArr3);
                bArr2 = bArr3;
            }
            concat = mha.H(bArr2);
        } else {
            srn e = e(0, 47);
            int d3 = e.d();
            if (d3 == 0) {
                bArr = zzdq.a;
            } else {
                byte[] bArr4 = new byte[d3];
                e.m(d3, bArr4);
                bArr = bArr4;
            }
            concat = mha.H(bArr).concat("...");
        }
        return mz1.o(mz1.q(d, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
