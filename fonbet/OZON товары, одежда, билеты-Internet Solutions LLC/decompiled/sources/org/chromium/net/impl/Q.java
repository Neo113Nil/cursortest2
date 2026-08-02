package org.chromium.net.impl;

/* loaded from: classes6.dex */
final class Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g0 f78891a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a0 f78892b;

    Q(g0 g0Var, a0 a0Var) {
        this.f78891a = g0Var;
        this.f78892b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f78891a.b(this.f78892b);
    }
}
