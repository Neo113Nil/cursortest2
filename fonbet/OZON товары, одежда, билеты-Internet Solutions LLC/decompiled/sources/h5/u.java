package h5;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f64999a;

    static {
        String i11 = androidx.work.o.i("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(i11, "tagWithPrefix(\"WakeLocks\")");
        f64999a = i11;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (v.f65000a) {
            linkedHashMap.putAll(v.a());
            Unit unit = Unit.f71690a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.o.e().k(f64999a, "WakeLock held for " + str);
            }
        }
    }

    @NotNull
    public static final PowerManager.WakeLock b(@NotNull Context context, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String b11 = Nk.a.b("WorkManager: ", tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, b11);
        synchronized (v.f65000a) {
        }
        Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }
}
