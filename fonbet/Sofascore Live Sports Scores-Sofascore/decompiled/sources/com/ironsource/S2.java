package com.ironsource;

import defpackage.lnb;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class S2 {
    private static final int p = 0;
    private H1 a;
    private int b;
    private long c;
    private boolean d;
    private ArrayList<C4013c3> e;
    private C4013c3 f;
    private int g;
    private int h;
    private C4263q2 i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;

    public S2(int i, long j, boolean z, H1 h1, int i2, C4263q2 c4263q2, int i3, boolean z2, long j2, boolean z3, boolean z4, boolean z5, long j3) {
        this.e = new ArrayList<>();
        this.b = i;
        this.c = j;
        this.d = z;
        this.a = h1;
        this.g = i2;
        this.h = i3;
        this.i = c4263q2;
        this.j = z2;
        this.k = j2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = j3;
    }

    public C4013c3 a(String str) {
        Iterator<C4013c3> it = this.e.iterator();
        while (it.hasNext()) {
            C4013c3 next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public C4263q2 d() {
        return this.i;
    }

    public long e() {
        return this.k;
    }

    public int f() {
        return this.h;
    }

    public H1 g() {
        return this.a;
    }

    public int h() {
        return this.g;
    }

    @NotNull
    public C4013c3 i() {
        Iterator<C4013c3> it = this.e.iterator();
        while (it.hasNext()) {
            C4013c3 next = it.next();
            if (next.d()) {
                return next;
            }
        }
        C4013c3 c4013c3 = this.f;
        return c4013c3 != null ? c4013c3 : new C4105h5();
    }

    public long j() {
        return this.o;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.n;
    }

    public boolean n() {
        return this.m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BannerConfigurations{parallelLoad=");
        sb.append(this.b);
        sb.append(", bidderExclusive=");
        return lnb.r(sb, this.d, '}');
    }

    public void a(C4013c3 c4013c3) {
        if (c4013c3 != null) {
            this.e.add(c4013c3);
            if (this.f == null) {
                this.f = c4013c3;
            } else if (c4013c3.a(0)) {
                this.f = c4013c3;
            }
        }
    }

    public int a() {
        return this.b;
    }

    public S2() {
        this.a = new H1();
        this.e = new ArrayList<>();
    }
}
