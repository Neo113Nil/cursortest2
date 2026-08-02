package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q7p implements Executor {
    public static final q7p a;
    public static final /* synthetic */ q7p[] b;

    static {
        q7p q7pVar = new q7p("INSTANCE", 0);
        a = q7pVar;
        b = new q7p[]{q7pVar};
    }

    public static q7p[] values() {
        return (q7p[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
