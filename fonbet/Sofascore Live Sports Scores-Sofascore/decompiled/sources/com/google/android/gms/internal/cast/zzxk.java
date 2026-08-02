package com.google.android.gms.internal.cast;

import defpackage.dcp;
import defpackage.hcp;
import defpackage.me4;
import defpackage.mz1;
import defpackage.sha;
import defpackage.tbp;
import defpackage.xbp;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzxk implements Iterable, Serializable {
    public static final dcp b = new dcp(zzym.b);
    public int a = 0;

    static {
        int i = tbp.a;
    }

    public static void h(int i) {
        if (((i - 47) | 47) >= 0) {
            return;
        }
        defpackage.zzl.r(me4.g(i, "End index: 47 >= ", new StringBuilder(String.valueOf(47).length() + 15 + String.valueOf(i).length())));
    }

    public abstract byte c(int i);

    public abstract byte d(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int m = m();
            i = p(m, m);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new xbp(this);
    }

    public abstract int m();

    public abstract dcp n();

    public abstract void o(hcp hcpVar);

    public abstract int p(int i, int i2);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return mz1.o(mz1.q(m(), "<ByteString@", hexString, " size=", " contents=\""), m() <= 50 ? sha.Z(this) : sha.Z(n()).concat("..."), "\">");
    }
}
