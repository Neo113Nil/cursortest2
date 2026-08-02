package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.internal.AbstractC3189m;

/* renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3120b {

    /* renamed from: a, reason: collision with root package name */
    public final int f32436a;

    /* renamed from: b, reason: collision with root package name */
    public final C3117a f32437b;

    /* renamed from: c, reason: collision with root package name */
    public final C3117a.d f32438c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32439d;

    public C3120b(C3117a c3117a, C3117a.d dVar, String str) {
        this.f32437b = c3117a;
        this.f32438c = dVar;
        this.f32439d = str;
        this.f32436a = AbstractC3189m.c(c3117a, dVar, str);
    }

    public static C3120b a(C3117a c3117a, C3117a.d dVar, String str) {
        return new C3120b(c3117a, dVar, str);
    }

    public final String b() {
        return this.f32437b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3120b)) {
            return false;
        }
        C3120b c3120b = (C3120b) obj;
        return AbstractC3189m.b(this.f32437b, c3120b.f32437b) && AbstractC3189m.b(this.f32438c, c3120b.f32438c) && AbstractC3189m.b(this.f32439d, c3120b.f32439d);
    }

    public final int hashCode() {
        return this.f32436a;
    }
}
