package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3121b0 extends AbstractC3158u0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f32440a;

    public C3121b0(C3123c0 c3123c0) {
        this.f32440a = new WeakReference(c3123c0);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3158u0
    public final void a() {
        C3123c0 c3123c0 = (C3123c0) this.f32440a.get();
        if (c3123c0 == null) {
            return;
        }
        C3123c0.v(c3123c0);
    }
}
