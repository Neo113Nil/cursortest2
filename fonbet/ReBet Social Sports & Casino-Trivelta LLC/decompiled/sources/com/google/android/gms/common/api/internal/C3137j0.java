package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C3122c;

/* renamed from: com.google.android.gms.common.api.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3137j0 implements ComponentCallbacks2C3122c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3130g f32524a;

    public C3137j0(C3130g c3130g) {
        this.f32524a = c3130g;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3122c.a
    public final void a(boolean z10) {
        C3130g c3130g = this.f32524a;
        c3130g.f32500n.sendMessage(c3130g.f32500n.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
