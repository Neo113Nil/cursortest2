package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u38 implements Executor {
    public static final u38 a;
    public static final /* synthetic */ u38[] b;

    static {
        u38 u38Var = new u38("INSTANCE", 0);
        a = u38Var;
        b = new u38[]{u38Var};
    }

    public static u38 valueOf(String str) {
        return (u38) Enum.valueOf(u38.class, str);
    }

    public static u38[] values() {
        return (u38[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
