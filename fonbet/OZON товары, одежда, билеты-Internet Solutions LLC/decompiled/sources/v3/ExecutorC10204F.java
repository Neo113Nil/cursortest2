package v3;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: v3.F, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class ExecutorC10204F implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f101832a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f101832a.post(runnable);
    }
}
