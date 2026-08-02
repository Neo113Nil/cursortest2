package com.vk.id.internal.analytics;

import com.vk.id.StatParams;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.auth.VKIDAuthParams;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/vk/id/internal/analytics/CustomAuthAnalytics;", "", "<init>", "()V", "customAuthStart", "Lcom/vk/id/StatParams;", "params", "Lcom/vk/id/auth/VKIDAuthParams;", "customAuthStart$vkid_release", "customAuthError", "", "statParams", "customAuthError$vkid_release", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomAuthAnalytics {

    @NotNull
    public static final CustomAuthAnalytics INSTANCE = new CustomAuthAnalytics();

    private CustomAuthAnalytics() {
    }

    public final void customAuthError$vkid_release(@NotNull StatParams statParams) {
        Intrinsics.checkNotNullParameter(statParams, "statParams");
        VKIDAnalytics.INSTANCE.trackEvent("sdk_auth_error", new VKIDAnalytics.EventParam("error", "sdk_auth_error", null, 4, null), new VKIDAnalytics.EventParam("sdk_type", "vkid", null, 4, null), new VKIDAnalytics.EventParam("unique_session_id", statParams.getSessionId(), null, 4, null), new VKIDAnalytics.EventParam("from_custom_auth", "true", null, 4, null));
    }

    @NotNull
    public final StatParams customAuthStart$vkid_release(@NotNull VKIDAuthParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        VKIDAnalytics.INSTANCE.trackEvent("custom_auth_start", new VKIDAnalytics.EventParam("sdk_type", "vkid", null, 4, null), new VKIDAnalytics.EventParam("unique_session_id", uuid, null, 4, null), new VKIDAnalytics.EventParam("oauth_service", CustomAuthAnalyticsKt.toAnalyticsParam(params.getOAuth()), null, 4, null));
        return new StatParams("from_custom_auth", uuid);
    }
}
