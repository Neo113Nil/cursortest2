package h5;

import android.os.PowerManager;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v f65000a = new v();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final WeakHashMap<PowerManager.WakeLock, String> f65001b = new WeakHashMap<>();

    @NotNull
    public static WeakHashMap a() {
        return f65001b;
    }
}
