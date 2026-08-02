package io.sentry.android.core.internal.util;

import android.view.Window;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f67223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Window f67224b;

    public /* synthetic */ q(v vVar, Window window) {
        this.f67223a = vVar;
        this.f67224b = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v.c(this.f67223a, this.f67224b);
    }
}
