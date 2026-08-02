package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ik, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0236ik implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f13951a;

    public ExecutorC0236ik(Handler handler) {
        this.f13951a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13951a.post(runnable);
    }
}
