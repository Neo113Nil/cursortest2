package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f35 implements Executor {
    public static final f35 a;
    public static final /* synthetic */ f35[] b;

    static {
        f35 f35Var = new f35("INSTANCE", 0);
        a = f35Var;
        b = new f35[]{f35Var};
    }

    public static f35 valueOf(String str) {
        return (f35) Enum.valueOf(f35.class, str);
    }

    public static f35[] values() {
        return (f35[]) b.clone();
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
