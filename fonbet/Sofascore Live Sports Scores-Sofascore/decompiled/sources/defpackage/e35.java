package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e35 implements Executor {
    public static final e35 a;
    public static final /* synthetic */ e35[] b;

    static {
        e35 e35Var = new e35("INSTANCE", 0);
        a = e35Var;
        b = new e35[]{e35Var};
    }

    public static e35 valueOf(String str) {
        return (e35) Enum.valueOf(e35.class, str);
    }

    public static e35[] values() {
        return (e35[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
