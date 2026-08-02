package com.google.android.gms.internal.auth;

import defpackage.dmi;
import defpackage.h0o;
import defpackage.h1o;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.v2o;
import defpackage.z1a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzef implements Iterable, Serializable {
    public static final v2o b = new v2o(zzfa.b);
    public int a = 0;

    static {
        int i = h0o.a;
    }

    public static int r(int i, int i2, int i3) {
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

    public static v2o s(int i, int i2, byte[] bArr) {
        r(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new v2o(bArr2);
    }

    public abstract byte c(int i);

    public abstract byte d(int i);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int m = m();
            i = n(m, m);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new h1o(this);
    }

    public abstract int m();

    public abstract int n(int i, int i2);

    public abstract v2o o();

    public abstract String p(Charset charset);

    public abstract boolean q();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return mz1.o(mz1.q(m(), "<ByteString@", hexString, " size=", " contents=\""), m() <= 50 ? z1a.Z(this) : z1a.Z(o()).concat("..."), "\">");
    }
}
