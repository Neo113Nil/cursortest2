package Sj;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import zendesk.core.CustomNetworkConfig;

/* loaded from: classes5.dex */
public final class f extends CustomNetworkConfig {
    @Override // zendesk.core.CustomNetworkConfig
    public void configureOkHttpClient(OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        a.f10836a.a(builder);
    }
}
