package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC3189m;

/* renamed from: com.google.android.gms.common.api.internal.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3151q0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3120b f32559a;

    /* renamed from: b, reason: collision with root package name */
    public final Feature f32560b;

    public /* synthetic */ C3151q0(C3120b c3120b, Feature feature, AbstractC3149p0 abstractC3149p0) {
        this.f32559a = c3120b;
        this.f32560b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3151q0)) {
            C3151q0 c3151q0 = (C3151q0) obj;
            if (AbstractC3189m.b(this.f32559a, c3151q0.f32559a) && AbstractC3189m.b(this.f32560b, c3151q0.f32560b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3189m.c(this.f32559a, this.f32560b);
    }

    public final String toString() {
        return AbstractC3189m.d(this).a("key", this.f32559a).a("feature", this.f32560b).toString();
    }
}
