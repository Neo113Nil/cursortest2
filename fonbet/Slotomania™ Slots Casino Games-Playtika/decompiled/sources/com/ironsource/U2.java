package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public class U2 {
    private static final int p = 0;
    private J1 a;
    private int b;
    private long c;
    private boolean d;
    private ArrayList<C2394e3> e;
    private C2394e3 f;
    private int g;
    private int h;
    private C2643s2 i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;

    public U2() {
        this.a = new J1();
        this.e = new ArrayList<>();
    }

    public int a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public C2643s2 d() {
        return this.i;
    }

    public long e() {
        return this.k;
    }

    public int f() {
        return this.h;
    }

    public J1 g() {
        return this.a;
    }

    public int h() {
        return this.g;
    }

    public C2394e3 i() {
        Iterator<C2394e3> it = this.e.iterator();
        while (it.hasNext()) {
            C2394e3 next = it.next();
            if (next.d()) {
                return next;
            }
        }
        C2394e3 c2394e3 = this.f;
        return c2394e3 != null ? c2394e3 : new C2485j5();
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
        return "BannerConfigurations{parallelLoad=" + this.b + ", bidderExclusive=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public void a(C2394e3 c2394e3) {
        if (c2394e3 != null) {
            this.e.add(c2394e3);
            if (this.f == null) {
                this.f = c2394e3;
            } else if (c2394e3.a(0)) {
                this.f = c2394e3;
            }
        }
    }

    public U2(int i, long j, boolean z, J1 j1, int i2, C2643s2 c2643s2, int i3, boolean z2, long j2, boolean z3, boolean z4, boolean z5, long j3) {
        this.e = new ArrayList<>();
        this.b = i;
        this.c = j;
        this.d = z;
        this.a = j1;
        this.g = i2;
        this.h = i3;
        this.i = c2643s2;
        this.j = z2;
        this.k = j2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = j3;
    }

    public C2394e3 a(String str) {
        Iterator<C2394e3> it = this.e.iterator();
        while (it.hasNext()) {
            C2394e3 next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
