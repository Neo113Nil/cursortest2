package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.internal.AbstractC3179c;
import com.google.android.gms.common.internal.InterfaceC3184h;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3154s0 implements AbstractC3179c.InterfaceC0491c, N0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3117a.f f32577a;

    /* renamed from: b, reason: collision with root package name */
    public final C3120b f32578b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC3184h f32579c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f32580d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32581e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3130g f32582f;

    public C3154s0(C3130g c3130g, C3117a.f fVar, C3120b c3120b) {
        this.f32582f = c3130g;
        this.f32577a = fVar;
        this.f32578b = c3120b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c.InterfaceC0491c
    public final void a(ConnectionResult connectionResult) {
        this.f32582f.f32500n.post(new RunnableC3152r0(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.N0
    public final void b(InterfaceC3184h interfaceC3184h, Set set) {
        if (interfaceC3184h == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new ConnectionResult(4));
        } else {
            this.f32579c = interfaceC3184h;
            this.f32580d = set;
            i();
        }
    }

    @Override // com.google.android.gms.common.api.internal.N0
    public final void c(ConnectionResult connectionResult) {
        Map map;
        map = this.f32582f.f32496j;
        C3147o0 c3147o0 = (C3147o0) map.get(this.f32578b);
        if (c3147o0 != null) {
            c3147o0.I(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.N0
    public final void d(int i10) {
        Map map;
        boolean z10;
        map = this.f32582f.f32496j;
        C3147o0 c3147o0 = (C3147o0) map.get(this.f32578b);
        if (c3147o0 != null) {
            z10 = c3147o0.f32549i;
            if (z10) {
                c3147o0.I(new ConnectionResult(17));
            } else {
                c3147o0.i(i10);
            }
        }
    }

    public final void i() {
        InterfaceC3184h interfaceC3184h;
        if (!this.f32581e || (interfaceC3184h = this.f32579c) == null) {
            return;
        }
        this.f32577a.getRemoteService(interfaceC3184h, this.f32580d);
    }
}
