package o1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class V implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f58766a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f58766a.post(runnable);
    }
}
