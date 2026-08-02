package io.sentry.android.core;

/* renamed from: io.sentry.android.core.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class RunnableC7100a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C7101b f67043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D3.g f67044b;

    public /* synthetic */ RunnableC7100a(C7101b c7101b, D3.g gVar) {
        this.f67043a = c7101b;
        this.f67044b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7101b.a(this.f67043a, this.f67044b);
    }
}
