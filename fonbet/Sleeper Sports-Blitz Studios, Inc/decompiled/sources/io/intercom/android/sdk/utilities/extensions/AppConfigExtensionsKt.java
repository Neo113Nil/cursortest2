package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.identity.AppConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppConfigExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"canStartNewConversation", "", "Lio/intercom/android/sdk/identity/AppConfig;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppConfigExtensionsKt {
    public static final boolean canStartNewConversation(AppConfig appConfig) {
        Intrinsics.checkNotNullParameter(appConfig, "<this>");
        boolean isInboundMessages = appConfig.isInboundMessages();
        return appConfig.isPreventMultipleInboundConversationsEnabled() ? isInboundMessages && !appConfig.getHasOpenConversations() : isInboundMessages;
    }
}
