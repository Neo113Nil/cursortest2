package com.google.android.material.datepicker;

/* loaded from: classes9.dex */
final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f58245a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f58246b;

    g(h hVar, int i11) {
        this.f58246b = hVar;
        this.f58245a = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f58246b.f58254i.smoothScrollToPosition(this.f58245a);
    }
}
