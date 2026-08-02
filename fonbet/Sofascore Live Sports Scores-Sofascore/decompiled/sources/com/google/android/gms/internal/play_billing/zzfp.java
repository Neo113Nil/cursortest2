package com.google.android.gms.internal.play_billing;

import defpackage.c8o;
import defpackage.dmi;
import defpackage.eao;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.o7o;
import defpackage.u8o;
import defpackage.v7a;
import defpackage.z8o;
import defpackage.zzl;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzfp implements Iterable, Serializable {
    public static final z8o b = new z8o(zzgv.a);
    public int a = 0;

    static {
        int i = o7o.a;
    }

    public static int r(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            zzl.r(lnb.k(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            zzl.r(dmi.k(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        zzl.r(dmi.k(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static z8o s(int i, int i2, byte[] bArr) {
        try {
            r(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new z8o(bArr2);
        } catch (zzhb e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean t(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
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

    public abstract int d(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfp)) {
            return false;
        }
        zzfp zzfpVar = (zzfp) obj;
        int m = m();
        if (m != zzfpVar.m()) {
            return false;
        }
        if (m == 0) {
            return true;
        }
        int i = this.a;
        int i2 = zzfpVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return q(zzfpVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int m = m();
            i = d(m, m);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new c8o(this);
    }

    public abstract int m();

    public abstract u8o n(int i, int i2);

    public abstract void o(int i, byte[] bArr);

    public abstract void p(eao eaoVar);

    public abstract boolean q(zzfp zzfpVar);

    public final String toString() {
        byte[] bArr;
        String concat;
        byte[] bArr2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int m = m();
        if (m() <= 50) {
            int m2 = m();
            if (m2 == 0) {
                bArr2 = zzgv.a;
            } else {
                byte[] bArr3 = new byte[m2];
                o(m2, bArr3);
                bArr2 = bArr3;
            }
            concat = v7a.I(bArr2);
        } else {
            u8o n = n(0, 47);
            int m3 = n.m();
            if (m3 == 0) {
                bArr = zzgv.a;
            } else {
                byte[] bArr4 = new byte[m3];
                n.o(m3, bArr4);
                bArr = bArr4;
            }
            concat = v7a.I(bArr).concat("...");
        }
        return mz1.o(mz1.q(m, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
