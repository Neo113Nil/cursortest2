package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class h35 implements Executor {
    public static final h35 a;
    public static final /* synthetic */ h35[] b;

    static {
        h35 h35Var = new h35("INSTANCE", 0);
        a = h35Var;
        b = new h35[]{h35Var};
    }

    public static h35 valueOf(String str) {
        return (h35) Enum.valueOf(h35.class, str);
    }

    public static h35[] values() {
        return (h35[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
