package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.AbstractC3191o;
import z.C6901b;

/* loaded from: classes2.dex */
public final class E extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final C6901b f32346e;

    /* renamed from: f, reason: collision with root package name */
    public final C3130g f32347f;

    public E(InterfaceC3138k interfaceC3138k, C3130g c3130g, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC3138k, googleApiAvailability);
        this.f32346e = new C6901b();
        this.f32347f = c3130g;
        this.mLifecycleFragment.h("ConnectionlessLifecycleHelper", this);
    }

    public static void j(Activity activity, C3130g c3130g, C3120b c3120b) {
        InterfaceC3138k fragment = AbstractC3136j.getFragment(activity);
        E e10 = (E) fragment.s("ConnectionlessLifecycleHelper", E.class);
        if (e10 == null) {
            e10 = new E(fragment, c3130g, GoogleApiAvailability.r());
        }
        AbstractC3191o.n(c3120b, "ApiKey cannot be null");
        e10.f32346e.add(c3120b);
        c3130g.b(e10);
    }

    @Override // com.google.android.gms.common.api.internal.g1
    public final void b(ConnectionResult connectionResult, int i10) {
        this.f32347f.G(connectionResult, i10);
    }

    @Override // com.google.android.gms.common.api.internal.g1
    public final void c() {
        this.f32347f.H();
    }

    public final C6901b i() {
        return this.f32346e;
    }

    public final void k() {
        if (this.f32346e.isEmpty()) {
            return;
        }
        this.f32347f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3136j
    public final void onResume() {
        super.onResume();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.g1, com.google.android.gms.common.api.internal.AbstractC3136j
    public final void onStart() {
        super.onStart();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.g1, com.google.android.gms.common.api.internal.AbstractC3136j
    public final void onStop() {
        super.onStop();
        this.f32347f.c(this);
    }
}
