package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O0 f32368a;

    public L0(O0 o02) {
        this.f32368a = o02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N0 n02;
        n02 = this.f32368a.f32383g;
        n02.c(new ConnectionResult(4));
    }
}
