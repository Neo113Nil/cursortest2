package com.google.android.gms.internal.pal;

import defpackage.b7n;
import defpackage.dmi;
import defpackage.h7n;
import defpackage.i2a;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.r7n;
import defpackage.zzl;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzaby implements Iterable, Serializable {
    public static final r7n b = new r7n(zzadg.b);
    public int a = 0;

    static {
        int i = b7n.a;
    }

    public static int t(int i, int i2, int i3) {
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

    public static r7n u(int i, int i2, byte[] bArr) {
        t(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new r7n(bArr2);
    }

    public abstract byte c(int i);

    public abstract byte d(int i);

    public abstract boolean equals(Object obj);

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
    public final /* synthetic */ Iterator iterator() {
        return new h7n(this);
    }

    public abstract int m();

    public abstract void n(int i, byte[] bArr);

    public abstract int o(int i, int i2);

    public abstract r7n p();

    public abstract String q(Charset charset);

    public abstract void r(zzach zzachVar);

    public abstract boolean s();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return mz1.o(mz1.q(m(), "<ByteString@", hexString, " size=", " contents=\""), m() <= 50 ? i2a.L(this) : i2a.L(p()).concat("..."), "\">");
    }
}
