package p8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final k f21561a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f21562b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f21563c;

    static {
        k kVar = new k("INSTANCE", 0);
        f21561a = kVar;
        f21563c = new k[]{kVar};
        f21562b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f21563c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f21562b.post(runnable);
    }
}
