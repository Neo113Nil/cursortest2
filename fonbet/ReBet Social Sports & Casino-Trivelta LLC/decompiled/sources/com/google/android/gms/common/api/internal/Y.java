package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3117a;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Y implements InterfaceC3125d0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3131g0 f32428a;

    public Y(C3131g0 c3131g0) {
        this.f32428a = c3131g0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void b() {
        Iterator it = this.f32428a.f32507f.values().iterator();
        while (it.hasNext()) {
            ((C3117a.f) it.next()).disconnect();
        }
        this.f32428a.f32515n.f32464p = Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void c() {
        this.f32428a.n();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void d(ConnectionResult connectionResult, C3117a c3117a, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void e(int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final AbstractC3124d f(AbstractC3124d abstractC3124d) {
        this.f32428a.f32515n.f32456h.add(abstractC3124d);
        return abstractC3124d;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final AbstractC3124d h(AbstractC3124d abstractC3124d) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
