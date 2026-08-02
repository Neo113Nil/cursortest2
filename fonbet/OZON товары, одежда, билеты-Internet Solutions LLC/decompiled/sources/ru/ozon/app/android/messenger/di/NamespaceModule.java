package ru.ozon.app.android.messenger.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.flags.TravelNameSpaceEnabledFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/messenger/di/NamespaceModule;", "", "<init>", "()V", "provideMessengerFeatureNamespace", "", "appType", "Lru/ozon/app/android/utils/AppType;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "provideAIChatFeatureNamespace", "provideBloggerChatNamespace", "Companion", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NamespaceModule {
    @NotNull
    public final String provideAIChatFeatureNamespace() {
        return "BX_AI_ASSISTANT_CHAT";
    }

    @NotNull
    public final String provideBloggerChatNamespace() {
        return "CHAT_BLOGGER";
    }

    @NotNull
    public final String provideMessengerFeatureNamespace(@NotNull AppType appType, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        return appType == AppType.SELECT ? "CHAT_SELECT" : (appType == AppType.TRAVEL && featureChecker.isEnabled(TravelNameSpaceEnabledFlag.INSTANCE)) ? "CHAT_TRAVEL" : "CHAT";
    }
}
