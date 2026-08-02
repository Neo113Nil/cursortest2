package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Pb {

    @NotNull
    public static final a m = new a(null);
    private static final int n = 0;
    private final boolean a;

    @NotNull
    private H1 b;
    private int c;
    private long d;
    private boolean e;

    @NotNull
    private final ArrayList<C3961ac> f;

    @Nullable
    private C3961ac g;
    private int h;

    @NotNull
    private C4263q2 i;
    private long j;
    private boolean k;
    private boolean l;

    public Pb(int i, long j, boolean z, @NotNull H1 h1, @NotNull C4263q2 c4263q2, int i2, long j2, boolean z2, boolean z3, boolean z4) {
        h1.getClass();
        c4263q2.getClass();
        this.a = z4;
        this.f = new ArrayList<>();
        this.c = i;
        this.d = j;
        this.e = z;
        this.b = h1;
        this.h = i2;
        this.i = c4263q2;
        this.j = j2;
        this.k = z2;
        this.l = z3;
    }

    @Nullable
    public final C3961ac a(@NotNull String str) {
        str.getClass();
        Iterator<C3961ac> it = this.f.iterator();
        while (it.hasNext()) {
            C3961ac next = it.next();
            if (Intrinsics.c(next.c(), str)) {
                return next;
            }
        }
        return null;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    @NotNull
    public final C4263q2 d() {
        return this.i;
    }

    @Nullable
    public final C3961ac e() {
        Iterator<C3961ac> it = this.f.iterator();
        while (it.hasNext()) {
            C3961ac next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.g;
    }

    public final int f() {
        return this.h;
    }

    @NotNull
    public final H1 g() {
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

    @NotNull
    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.e + "}";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void b(int i) {
        this.h = i;
    }

    public final void c(boolean z) {
        this.l = z;
    }

    public final void b(long j) {
        this.j = j;
    }

    public final void b(boolean z) {
        this.k = z;
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final boolean a() {
        return this.e;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final void a(@NotNull C4263q2 c4263q2) {
        c4263q2.getClass();
        this.i = c4263q2;
    }

    public final void a(@Nullable C3961ac c3961ac) {
        if (c3961ac != null) {
            this.f.add(c3961ac);
            if (this.g == null) {
                this.g = c3961ac;
            } else if (c3961ac.b() == 0) {
                this.g = c3961ac;
            }
        }
    }

    public final void a(@NotNull H1 h1) {
        h1.getClass();
        this.b = h1;
    }
}
