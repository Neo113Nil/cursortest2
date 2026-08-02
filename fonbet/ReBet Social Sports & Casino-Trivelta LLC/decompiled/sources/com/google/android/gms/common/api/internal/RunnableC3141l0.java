package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3141l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3147o0 f32535b;

    public RunnableC3141l0(C3147o0 c3147o0, int i10) {
        this.f32535b = c3147o0;
        this.f32534a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32535b.l(this.f32534a);
    }
}
