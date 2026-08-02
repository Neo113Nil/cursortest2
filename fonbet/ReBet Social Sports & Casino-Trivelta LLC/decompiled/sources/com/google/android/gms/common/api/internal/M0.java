package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;

/* loaded from: classes2.dex */
public final class M0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zak f32371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O0 f32372b;

    public M0(O0 o02, zak zakVar) {
        this.f32372b = o02;
        this.f32371a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        O0.M0(this.f32372b, this.f32371a);
    }
}
