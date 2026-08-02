package d90;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: d90.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6119g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f61384a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ExternalNetworkSettings f61385b;

    public C6119g(@NotNull SharedPreferences sharedPreferences, @NotNull ExternalNetworkSettings externalNetworkSettings) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        this.f61384a = sharedPreferences;
        this.f61385b = externalNetworkSettings;
    }

    public final String a() {
        String loginHeader = this.f61385b.getLoginHeader();
        return loginHeader == null ? this.f61384a.getString("fintech_sample_trace_header", null) : loginHeader;
    }
}
