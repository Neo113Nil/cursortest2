package Q2;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1496g implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
