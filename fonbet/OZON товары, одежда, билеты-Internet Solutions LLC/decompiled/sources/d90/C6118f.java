package d90;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: d90.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6118f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f61382a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ExternalNetworkSettings f61383b;

    public C6118f(@NotNull SharedPreferences sharedPreferences, @NotNull ExternalNetworkSettings externalNetworkSettings) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        this.f61382a = sharedPreferences;
        this.f61383b = externalNetworkSettings;
    }

    public final String a() {
        String passwordHeader = this.f61383b.getPasswordHeader();
        return passwordHeader == null ? this.f61382a.getString("fintech_password_header", null) : passwordHeader;
    }

    public final void b(@NotNull String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        SharedPreferences.Editor edit = this.f61382a.edit();
        edit.putString("fintech_password_header", password);
        edit.commit();
    }
}
