package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.a9n;
import defpackage.f9n;
import defpackage.g9n;
import defpackage.hbo;
import defpackage.ilg;
import defpackage.zz0;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzacv {
    public int a;
    public int b;
    public zz0 c;

    private zzacv() {
    }

    public static zzacv h(InputStream inputStream, int i) {
        if (i <= 0) {
            a70.p("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new g9n(inputStream, i);
        }
        f9n f9nVar = new f9n(zzaed.a);
        try {
            f9nVar.a(0);
            return f9nVar;
        } catch (zzaeh e) {
            ilg.k(e);
            return null;
        }
    }

    public static int j(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long k(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract int a(int i);

    public abstract void b(int i);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract int f(int i, int i2, byte[] bArr);

    public abstract void g(int i);

    public final void i() {
        int l;
        do {
            l = l();
            if (l == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                hbo.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.b = i2 + 1;
                this.b--;
            }
        } while (n(l));
    }

    public abstract int l();

    public abstract void m(int i);

    public abstract boolean n(int i);

    public abstract double o();

    public abstract float p();

    public abstract long q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract boolean v();

    public abstract String w();

    public abstract String x();

    public abstract a9n y();

    public abstract byte[] z();
}
