package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3376v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f34331a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34332b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3392x2 f34334d;

    public C3376v2(C3392x2 c3392x2, int i10, boolean z10, boolean z11) {
        Objects.requireNonNull(c3392x2);
        this.f34334d = c3392x2;
        this.f34331a = i10;
        this.f34332b = z10;
        this.f34333c = z11;
    }

    public final void a(String str) {
        this.f34334d.y(this.f34331a, this.f34332b, this.f34333c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f34334d.y(this.f34331a, this.f34332b, this.f34333c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f34334d.y(this.f34331a, this.f34332b, this.f34333c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f34334d.y(this.f34331a, this.f34332b, this.f34333c, str, obj, obj2, obj3);
    }
}
