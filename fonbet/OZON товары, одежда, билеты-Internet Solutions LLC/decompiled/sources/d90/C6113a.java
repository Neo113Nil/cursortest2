package d90;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: d90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6113a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f61370a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ExternalNetworkSettings f61371b;

    public C6113a(@NotNull SharedPreferences sharedPreferences, @NotNull ExternalNetworkSettings externalNetworkSettings) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        this.f61370a = sharedPreferences;
        this.f61371b = externalNetworkSettings;
    }

    public final boolean a() {
        Boolean isAutotestsHeader = this.f61371b.getIsAutotestsHeader();
        return isAutotestsHeader != null ? isAutotestsHeader.booleanValue() : this.f61370a.getBoolean("fintech_is_autotests_header_key", false);
    }

    public final String b() {
        return this.f61370a.getString("FINTECH_TEST_NAME_PREFS_KEY", null);
    }

    public final String c() {
        return this.f61370a.getString("FINTECH_HOST_NAME_KEY", null);
    }

    public final void d(boolean z11) {
        SharedPreferences.Editor edit = this.f61370a.edit();
        edit.putBoolean("fintech_is_autotests_header_key", z11);
        edit.commit();
    }

    public final void e(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.f61370a.edit();
        edit.putString("FINTECH_TEST_NAME_PREFS_KEY", value);
        edit.commit();
    }

    public final void f(String str) {
        if (str.length() == 0) {
            str = null;
        }
        SharedPreferences.Editor edit = this.f61370a.edit();
        edit.putString("FINTECH_HOST_NAME_KEY", str);
        edit.commit();
    }
}
