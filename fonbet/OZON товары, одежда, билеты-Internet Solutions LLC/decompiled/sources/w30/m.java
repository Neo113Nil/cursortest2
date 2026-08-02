package w30;

import android.content.Context;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f103530a;

    public m(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f103530a = context;
    }

    @NotNull
    public final Pair<Integer, Integer> a() {
        DisplayMetrics displayMetrics = this.f103530a.getResources().getDisplayMetrics();
        return new Pair<>(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    public final Boolean b() {
        Object systemService = this.f103530a.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager != null) {
            return Boolean.valueOf(powerManager.isInteractive());
        }
        return null;
    }
}
