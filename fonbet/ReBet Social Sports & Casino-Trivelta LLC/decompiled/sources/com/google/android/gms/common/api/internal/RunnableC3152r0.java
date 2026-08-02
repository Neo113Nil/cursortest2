package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3117a;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3152r0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f32572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3154s0 f32573b;

    public RunnableC3152r0(C3154s0 c3154s0, ConnectionResult connectionResult) {
        this.f32573b = c3154s0;
        this.f32572a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C3120b c3120b;
        C3117a.f fVar;
        C3117a.f fVar2;
        C3117a.f fVar3;
        C3117a.f fVar4;
        C3154s0 c3154s0 = this.f32573b;
        map = c3154s0.f32582f.f32496j;
        c3120b = c3154s0.f32578b;
        C3147o0 c3147o0 = (C3147o0) map.get(c3120b);
        if (c3147o0 == null) {
            return;
        }
        if (!this.f32572a.l()) {
            c3147o0.H(this.f32572a, null);
            return;
        }
        this.f32573b.f32581e = true;
        fVar = this.f32573b.f32577a;
        if (fVar.requiresSignIn()) {
            this.f32573b.i();
            return;
        }
        try {
            C3154s0 c3154s02 = this.f32573b;
            fVar3 = c3154s02.f32577a;
            fVar4 = c3154s02.f32577a;
            fVar3.getRemoteService(null, fVar4.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            fVar2 = this.f32573b.f32577a;
            fVar2.disconnect("Failed to get service from broker.");
            c3147o0.H(new ConnectionResult(10), null);
        }
    }
}
