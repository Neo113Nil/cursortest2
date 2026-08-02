package com.google.android.gms.internal.fido;

import defpackage.dfo;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.r4a;
import defpackage.teo;
import defpackage.xgo;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgx implements Iterable<Byte>, Serializable {
    public static final xgo b = new xgo(zzhc.a);
    public int a = 0;

    static {
        int i = teo.a;
    }

    public static int q(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            defpackage.zzl.r(lnb.k(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            defpackage.zzl.r(dmi.k(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        defpackage.zzl.r(dmi.k(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static xgo r(int i, byte[] bArr) {
        q(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new xgo(bArr2);
    }

    public abstract byte c(int i);

    public abstract byte d(int i);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int m = m();
            i = o(m, m);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new dfo(this);
    }

    public abstract int m();

    public abstract void n(int i, byte[] bArr);

    public abstract int o(int i, int i2);

    public abstract xgo p(int i, int i2);

    public final byte[] s() {
        int m = m();
        if (m == 0) {
            return zzhc.a;
        }
        byte[] bArr = new byte[m];
        n(m, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return mz1.o(mz1.q(m(), "<ByteString@", hexString, " size=", " contents=\""), m() <= 50 ? r4a.N(this) : r4a.N(p(0, 47)).concat("..."), "\">");
    }
}
