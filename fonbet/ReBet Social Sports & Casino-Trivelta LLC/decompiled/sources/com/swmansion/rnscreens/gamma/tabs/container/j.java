package com.swmansion.rnscreens.gamma.tabs.container;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f41897a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41898b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41899c;

    public j(boolean z10, boolean z11, boolean z12) {
        this.f41897a = z10;
        this.f41898b = z11;
        this.f41899c = z12;
    }

    public final boolean a() {
        return this.f41897a || this.f41898b || this.f41899c;
    }

    public final void b() {
        this.f41897a = true;
        this.f41898b = true;
        this.f41899c = true;
    }

    public final boolean c() {
        return this.f41898b;
    }

    public final boolean d() {
        return this.f41899c;
    }

    public final boolean e() {
        return this.f41897a;
    }

    public final void f(boolean z10) {
        this.f41898b = z10;
    }

    public final void g(boolean z10) {
        this.f41899c = z10;
    }

    public final void h(boolean z10) {
        this.f41897a = z10;
    }

    public /* synthetic */ j(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12);
    }
}
