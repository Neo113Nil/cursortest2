package oh0;

import C.C2702w;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f78343a;

    public c(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f78343a = sharedPreferences;
    }

    public final boolean a() {
        return this.f78343a.getBoolean("ru.ozon.push.sdk.LAST_NOTIFICATION_CHANNEL_AVAILABILITY", false);
    }

    public final int b() {
        return this.f78343a.getInt("ru.ozon.push.sdk.LAST_MICROPHONE_PERMISSION_STATE", 0);
    }

    public final void c(boolean z11) {
        C2702w.e(this.f78343a, "ru.ozon.push.sdk.LAST_NOTIFICATION_CHANNEL_AVAILABILITY", z11);
    }

    public final void d(int i11) {
        SharedPreferences.Editor edit = this.f78343a.edit();
        edit.putInt("ru.ozon.push.sdk.LAST_MICROPHONE_PERMISSION_STATE", i11);
        edit.apply();
    }
}
