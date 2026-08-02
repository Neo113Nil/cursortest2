package com.ironsource;

import defpackage.lnb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.de, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4042de {
    private static final int o = 0;
    private ArrayList<C4077fd> a;
    private H1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private C4077fd l;
    private C4263q2 m;
    private boolean n;

    public C4042de(int i, boolean z, int i2, int i3, H1 h1, C4263q2 c4263q2, int i4, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = h1;
        this.f = i3;
        this.m = c4263q2;
        this.g = i4;
        this.n = z2;
        this.h = j;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public C4077fd a(String str) {
        Iterator<C4077fd> it = this.a.iterator();
        while (it.hasNext()) {
            C4077fd next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
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

    public ArrayList<C4077fd> e() {
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

    public C4263q2 k() {
        return this.m;
    }

    public long l() {
        return this.h;
    }

    public H1 m() {
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
        return lnb.r(sb, this.d, '}');
    }

    public void a(C4077fd c4077fd) {
        if (c4077fd != null) {
            this.a.add(c4077fd);
            if (this.l == null) {
                this.l = c4077fd;
            } else if (c4077fd.a(0)) {
                this.l = c4077fd;
            }
        }
    }

    public C4042de() {
        this.a = new ArrayList<>();
        this.b = new H1();
    }

    public C4077fd a() {
        Iterator<C4077fd> it = this.a.iterator();
        while (it.hasNext()) {
            C4077fd next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.l;
    }
}
