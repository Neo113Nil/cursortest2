package ru.ozon.app.android.inapppush.di;

import GZ.g;
import Ld0.c;
import We.B;
import We.InterfaceC4875q;
import ei0.InterfaceC6369b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.domain.flags.InAppPushSdkEnabledFlag;
import ru.ozon.app.android.inapppush.InAppPushHost;
import ru.ozon.app.android.inapppush.domain.GetPageNameFromDeeplinkOrJsonUseCase;
import ru.ozon.app.android.inapppush.presentation.InAppPushAnalyticsManager;
import ru.ozon.app.android.inapppush.presentation.InAppPushHostDisabled;
import ru.ozon.app.android.inapppush.presentation.InAppPushHostImpl;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/inapppush/di/InAppPushModule;", "", "<init>", "()V", "Lru/ozon/app/android/inapppush/domain/GetPageNameFromDeeplinkOrJsonUseCase;", "getPageName", "LGZ/g;", "router", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWe/q;", "cookieJar", "Lei0/b;", "tracker", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkComponentConfig", "Lru/ozon/app/android/utils/AppType;", "appType", "", "LWe/B;", "mainInterceptors", "LLd0/c;", "diStore", "Lru/ozon/app/android/inapppush/InAppPushHost;", "provideInAppPushHost", "(Lru/ozon/app/android/inapppush/domain/GetPageNameFromDeeplinkOrJsonUseCase;LGZ/g;Lru/ozon/app/android/network/abtool/FeatureChecker;LWe/q;Lei0/b;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/network/di/NetworkComponentConfig;Lru/ozon/app/android/utils/AppType;Ljava/util/List;LLd0/c;)Lru/ozon/app/android/inapppush/InAppPushHost;", "in-app-push-host_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppPushModule {

    @NotNull
    public static final InAppPushModule INSTANCE = new InAppPushModule();

    private InAppPushModule() {
    }

    @NotNull
    public final InAppPushHost provideInAppPushHost(@NotNull GetPageNameFromDeeplinkOrJsonUseCase getPageName, @NotNull g router, @NotNull FeatureChecker featureChecker, @NotNull InterfaceC4875q cookieJar, @NotNull InterfaceC6369b tracker, @NotNull JsonParser jsonDeserializer, @NotNull NetworkComponentConfig networkComponentConfig, @NotNull AppType appType, @NotNull List<B> mainInterceptors, @NotNull c diStore) {
        Intrinsics.checkNotNullParameter(getPageName, "getPageName");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(networkComponentConfig, "networkComponentConfig");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(mainInterceptors, "mainInterceptors");
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        return featureChecker.isEnabled(InAppPushSdkEnabledFlag.INSTANCE) ? new InAppPushHostImpl(getPageName, router, cookieJar, networkComponentConfig, mainInterceptors, new InAppPushAnalyticsManager(tracker, jsonDeserializer), appType, diStore) : new InAppPushHostDisabled();
    }
}
