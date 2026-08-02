package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3117a;

/* renamed from: com.google.android.gms.common.api.internal.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3143m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3145n0 f32538a;

    public RunnableC3143m0(C3145n0 c3145n0) {
        this.f32538a = c3145n0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3117a.f fVar;
        C3117a.f fVar2;
        C3147o0 c3147o0 = this.f32538a.f32539a;
        fVar = c3147o0.f32542b;
        fVar2 = c3147o0.f32542b;
        fVar.disconnect(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
