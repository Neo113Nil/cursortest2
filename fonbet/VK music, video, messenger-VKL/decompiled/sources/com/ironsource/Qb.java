package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Qb {
    public static final a m = new a(null);
    private static final int n = 0;
    private final boolean a;
    private J1 b;
    private int c;
    private long d;
    private boolean e;
    private final ArrayList<C4245bc> f = new ArrayList<>();
    private C4245bc g;
    private int h;
    private C4539s2 i;
    private long j;
    private boolean k;
    private boolean l;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    public Qb(int i, long j, boolean z, J1 j1, C4539s2 c4539s2, int i2, long j2, boolean z2, boolean z3, boolean z4) {
        this.a = z4;
        this.c = i;
        this.d = j;
        this.e = z;
        this.b = j1;
        this.h = i2;
        this.i = c4539s2;
        this.j = j2;
        this.k = z2;
        this.l = z3;
    }

    public final void a(J1 j1) {
        this.b = j1;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final C4539s2 d() {
        return this.i;
    }

    public final C4245bc e() {
        Iterator<C4245bc> it = this.f.iterator();
        while (it.hasNext()) {
            C4245bc next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.g;
    }

    public final int f() {
        return this.h;
    }

    public final J1 g() {
        return this.b;
    }

    public final long h() {
        return this.j;
    }

    public final boolean i() {
        return this.k;
    }

    public final boolean j() {
        return this.a;
    }

    public final boolean k() {
        return this.l;
    }

    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.e + "}";
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void b(int i) {
        this.h = i;
    }

    public final void c(boolean z) {
        this.l = z;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void b(long j) {
        this.j = j;
    }

    public final boolean a() {
        return this.e;
    }

    public final void b(boolean z) {
        this.k = z;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final void a(C4539s2 c4539s2) {
        this.i = c4539s2;
    }

    public final void a(C4245bc c4245bc) {
        if (c4245bc != null) {
            this.f.add(c4245bc);
            if (this.g == null) {
                this.g = c4245bc;
            } else if (c4245bc.b() == 0) {
                this.g = c4245bc;
            }
        }
    }

    public final C4245bc a(String str) {
        Iterator<C4245bc> it = this.f.iterator();
        while (it.hasNext()) {
            C4245bc next = it.next();
            if (epx.f(next.c(), str)) {
                return next;
            }
        }
        return null;
    }
}
