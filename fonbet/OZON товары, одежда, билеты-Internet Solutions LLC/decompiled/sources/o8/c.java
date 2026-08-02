package o8;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c implements Executor {
    private static final /* synthetic */ c[] $VALUES;

    @SuppressLint({"ThreadPoolCreation"})
    private static final Handler HANDLER;
    public static final c INSTANCE;

    static {
        c cVar = new c("INSTANCE", 0);
        INSTANCE = cVar;
        $VALUES = new c[]{cVar};
        HANDLER = new Handler(Looper.getMainLooper());
    }

    private c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        HANDLER.post(runnable);
    }
}
