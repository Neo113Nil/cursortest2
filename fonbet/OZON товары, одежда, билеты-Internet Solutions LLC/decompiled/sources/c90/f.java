package c90;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f56844a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ExternalNetworkSettings f56845b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f56846c;

    public f(@NotNull SharedPreferences sharedPreferences, @NotNull ExternalNetworkSettings externalNetworkSettings, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56844a = sharedPreferences;
        this.f56845b = externalNetworkSettings;
        String string = context.getString(R.string.fintech_internal_header_token_key);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f56846c = string;
    }

    @NotNull
    public final String a() {
        String headerToken = this.f56845b.getHeaderToken();
        return (headerToken == null && (headerToken = this.f56844a.getString(this.f56846c, "")) == null) ? "" : headerToken;
    }

    public final void b() {
        Intrinsics.checkNotNullParameter("", "token");
        SharedPreferences.Editor edit = this.f56844a.edit();
        edit.putString(this.f56846c, "");
        edit.commit();
    }
}
