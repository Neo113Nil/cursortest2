package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Pb {
    public static final a m = new a(null);
    private static final int n = 0;
    private final boolean a;
    private J1 b;
    private int c;
    private long d;
    private boolean e;
    private final ArrayList<C2331ac> f;
    private C2331ac g;
    private int h;
    private C2643s2 i;
    private long j;
    private boolean k;
    private boolean l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Pb(int i, long j, boolean z, J1 events, C2643s2 auctionSettings, int i2, long j2, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.a = z4;
        this.f = new ArrayList<>();
        this.c = i;
        this.d = j;
        this.e = z;
        this.b = events;
        this.h = i2;
        this.i = auctionSettings;
        this.j = j2;
        this.k = z2;
        this.l = z3;
    }

    public final void a(J1 j1) {
        Intrinsics.checkNotNullParameter(j1, "<set-?>");
        this.b = j1;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final C2643s2 d() {
        return this.i;
    }

    public final C2331ac e() {
        Iterator<C2331ac> it = this.f.iterator();
        while (it.hasNext()) {
            C2331ac next = it.next();
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

    public final void a(C2643s2 c2643s2) {
        Intrinsics.checkNotNullParameter(c2643s2, "<set-?>");
        this.i = c2643s2;
    }

    public final void a(C2331ac c2331ac) {
        if (c2331ac != null) {
            this.f.add(c2331ac);
            if (this.g == null) {
                this.g = c2331ac;
            } else if (c2331ac.b() == 0) {
                this.g = c2331ac;
            }
        }
    }

    public final C2331ac a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Iterator<C2331ac> it = this.f.iterator();
        while (it.hasNext()) {
            C2331ac next = it.next();
            if (Intrinsics.areEqual(next.c(), placementName)) {
                return next;
            }
        }
        return null;
    }
}
