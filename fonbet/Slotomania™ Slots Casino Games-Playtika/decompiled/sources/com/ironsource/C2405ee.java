package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.ee, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2405ee {
    private static final int o = 0;
    private ArrayList<C2440gd> a;
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
    private C2440gd l;
    private C2643s2 m;
    private boolean n;

    public C2405ee() {
        this.a = new ArrayList<>();
        this.b = new J1();
    }

    public void a(C2440gd c2440gd) {
        if (c2440gd != null) {
            this.a.add(c2440gd);
            if (this.l == null) {
                this.l = c2440gd;
            } else if (c2440gd.a(0)) {
                this.l = c2440gd;
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

    public ArrayList<C2440gd> e() {
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

    public C2643s2 k() {
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
        return "RewardedVideoConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public C2405ee(int i, boolean z, int i2, int i3, J1 j1, C2643s2 c2643s2, int i4, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = j1;
        this.f = i3;
        this.m = c2643s2;
        this.g = i4;
        this.n = z2;
        this.h = j;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public C2440gd a(String str) {
        Iterator<C2440gd> it = this.a.iterator();
        while (it.hasNext()) {
            C2440gd next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public C2440gd a() {
        Iterator<C2440gd> it = this.a.iterator();
        while (it.hasNext()) {
            C2440gd next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.l;
    }
}
