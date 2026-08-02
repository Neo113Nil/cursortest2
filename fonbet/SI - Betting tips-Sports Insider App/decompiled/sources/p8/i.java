package p8;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final i f21553a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f21554b;

    static {
        i iVar = new i("INSTANCE", 0);
        f21553a = iVar;
        f21554b = new i[]{iVar};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f21554b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
