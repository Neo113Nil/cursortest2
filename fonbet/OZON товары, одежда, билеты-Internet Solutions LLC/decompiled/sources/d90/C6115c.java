package d90;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: d90.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6115c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f61375a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ExternalNetworkSettings f61376b;

    public C6115c(@NotNull SharedPreferences sharedPreferences, @NotNull ExternalNetworkSettings externalNetworkSettings) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        this.f61375a = sharedPreferences;
        this.f61376b = externalNetworkSettings;
    }

    public final String a() {
        String loginHeader = this.f61376b.getLoginHeader();
        return loginHeader == null ? this.f61375a.getString("fintech_login_header", null) : loginHeader;
    }

    public final void b(@NotNull String login) {
        Intrinsics.checkNotNullParameter(login, "login");
        SharedPreferences.Editor edit = this.f61375a.edit();
        edit.putString("fintech_login_header", login);
        edit.commit();
    }
}
