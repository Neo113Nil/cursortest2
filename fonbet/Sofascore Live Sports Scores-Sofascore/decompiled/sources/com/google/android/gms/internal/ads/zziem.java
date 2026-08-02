package com.google.android.gms.internal.ads;

import defpackage.hbo;
import defpackage.ilg;
import defpackage.mpo;
import defpackage.npo;
import defpackage.opo;
import defpackage.zz0;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zziem {
    public int a;
    public int b;
    public zz0 c;

    private zziem() {
    }

    public static zziem e(InputStream inputStream) {
        return inputStream == null ? f(0, 0, zzifz.a) : new opo(inputStream);
    }

    public static npo f(int i, int i2, byte[] bArr) {
        npo npoVar = new npo(bArr, i, i2);
        try {
            npoVar.a(i2);
            return npoVar;
        } catch (zzige e) {
            ilg.k(e);
            return null;
        }
    }

    public static int h(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long i(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract long A();

    public abstract int B();

    public abstract long C();

    public abstract int a(int i);

    public abstract void b(int i);

    public abstract boolean c();

    public abstract int d();

    public final void g() {
        int j;
        do {
            j = j();
            if (j == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                hbo.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.b = i2 + 1;
                this.b--;
            }
        } while (l(j));
    }

    public abstract int j();

    public abstract void k(int i);

    public abstract boolean l(int i);

    public abstract double m();

    public abstract float n();

    public abstract long o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract boolean t();

    public abstract String u();

    public abstract String v();

    public abstract mpo w();

    public abstract int x();

    public abstract int y();

    public abstract int z();
}
