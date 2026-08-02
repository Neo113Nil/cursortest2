package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f9k implements Executor {
    public static final f9k a;
    public static final Handler b;
    public static final /* synthetic */ f9k[] c;

    static {
        f9k f9kVar = new f9k("INSTANCE", 0);
        a = f9kVar;
        c = new f9k[]{f9kVar};
        b = new Handler(Looper.getMainLooper());
    }

    public static f9k valueOf(String str) {
        return (f9k) Enum.valueOf(f9k.class, str);
    }

    public static f9k[] values() {
        return (f9k[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
