package io.sentry.android.replay.util;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f51786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f51787b;

    public m(String taskName, Runnable delegate) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f51786a = taskName;
        this.f51787b = delegate;
    }

    public final String a() {
        return this.f51786a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f51787b.run();
    }
}
