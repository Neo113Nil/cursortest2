package io.sentry.android.replay.util;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f16133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f16134b;

    public g(Runnable delegate, String taskName) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f16133a = taskName;
        this.f16134b = delegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16134b.run();
    }
}
