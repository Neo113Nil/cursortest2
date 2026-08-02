package M8;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f7567a;

    public f(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f7567a = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f7567a.post(command);
    }
}
