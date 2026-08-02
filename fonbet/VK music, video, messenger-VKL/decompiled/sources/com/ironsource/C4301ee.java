package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.ee, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4301ee {
    private static final int o = 0;
    private ArrayList<C4336gd> a;
    private J1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private C4336gd l;
    private C4539s2 m;
    private boolean n;

    public C4301ee() {
        this.a = new ArrayList<>();
        this.b = new J1();
    }

    public void a(C4336gd c4336gd) {
        if (c4336gd != null) {
            this.a.add(c4336gd);
            if (this.l == null) {
                this.l = c4336gd;
            } else if (c4336gd.a(0)) {
                this.l = c4336gd;
            }
        }
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.n;
    }

    public ArrayList<C4336gd> e() {
        return this.a;
    }

    public boolean f() {
        return this.i;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean j() {
        return this.d;
    }

    public C4539s2 k() {
        return this.m;
    }

    public long l() {
        return this.h;
    }

    public J1 m() {
        return this.b;
    }

    public boolean n() {
        return this.k;
    }

    public boolean o() {
        return this.j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RewardedVideoConfigurations{parallelLoad=");
        sb.append(this.c);
        sb.append(", bidderExclusive=");
        return defpackage.q0.a(sb, this.d, '}');
    }

    public C4301ee(int i, boolean z, int i2, int i3, J1 j1, C4539s2 c4539s2, int i4, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = j1;
        this.f = i3;
        this.m = c4539s2;
        this.g = i4;
        this.n = z2;
        this.h = j;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public C4336gd a(String str) {
        Iterator<C4336gd> it = this.a.iterator();
        while (it.hasNext()) {
            C4336gd next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public C4336gd a() {
        Iterator<C4336gd> it = this.a.iterator();
        while (it.hasNext()) {
            C4336gd next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.l;
    }
}
