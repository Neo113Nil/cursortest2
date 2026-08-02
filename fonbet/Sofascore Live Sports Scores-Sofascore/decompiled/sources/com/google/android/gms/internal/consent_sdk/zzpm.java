package com.google.android.gms.internal.consent_sdk;

import defpackage.k1p;
import defpackage.ljg;
import defpackage.mz1;
import defpackage.p1p;
import defpackage.s1p;
import defpackage.ufa;
import defpackage.v1p;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzpm implements Iterable, Serializable {
    public static final v1p b = new v1p(zzqs.b);
    public int a = 0;

    static {
        int i = k1p.a;
    }

    public static void h(int i) {
        if (((i - 47) | 47) >= 0) {
            return;
        }
        defpackage.zzl.r(ljg.j(i, "End index: 47 >= "));
    }

    public abstract byte c(int i);

    public abstract byte d(int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzpm)) {
            return false;
        }
        zzpm zzpmVar = (zzpm) obj;
        int m = m();
        if (m != zzpmVar.m()) {
            return false;
        }
        if (m == 0) {
            return true;
        }
        int i = this.a;
        int i2 = zzpmVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return q(zzpmVar);
        }
        return false;
    }

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
        return new p1p(this);
    }

    public abstract int m();

    public abstract int n(int i, int i2);

    public abstract s1p o();

    public abstract void p(zzpv zzpvVar);

    public abstract boolean q(zzpm zzpmVar);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return mz1.o(mz1.q(m(), "<ByteString@", hexString, " size=", " contents=\""), m() <= 50 ? ufa.K(this) : ufa.K(o()).concat("..."), "\">");
    }
}
