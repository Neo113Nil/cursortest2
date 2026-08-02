package com.google.android.gms.common.internal;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32722b;

    /* renamed from: c, reason: collision with root package name */
    public final ComponentName f32723c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32724d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f32725e;

    public l0(ComponentName componentName, int i10) {
        this.f32721a = null;
        this.f32722b = null;
        AbstractC3191o.m(componentName);
        this.f32723c = componentName;
        this.f32724d = 4225;
        this.f32725e = false;
    }

    public final String a() {
        return this.f32721a;
    }

    public final String b() {
        return this.f32722b;
    }

    public final ComponentName c() {
        return this.f32723c;
    }

    public final boolean d() {
        return this.f32725e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return AbstractC3189m.b(this.f32721a, l0Var.f32721a) && AbstractC3189m.b(this.f32722b, l0Var.f32722b) && AbstractC3189m.b(this.f32723c, l0Var.f32723c) && this.f32725e == l0Var.f32725e;
    }

    public final int hashCode() {
        return AbstractC3189m.c(this.f32721a, this.f32722b, this.f32723c, 4225, Boolean.valueOf(this.f32725e));
    }

    public final String toString() {
        String str = this.f32721a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f32723c;
        AbstractC3191o.m(componentName);
        return componentName.flattenToString();
    }

    public l0(String str, String str2, int i10, boolean z10) {
        AbstractC3191o.g(str);
        this.f32721a = str;
        AbstractC3191o.g(str2);
        this.f32722b = str2;
        this.f32723c = null;
        this.f32724d = 4225;
        this.f32725e = z10;
    }
}
