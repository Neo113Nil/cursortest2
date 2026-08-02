package ru.ozon.app.android.messenger.initializer;

import We.E;
import android.content.Context;
import android.net.Uri;
import ei0.InterfaceC6369b;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.android.messenger.api.a;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.core.initialization.e;
import ru.ozon.android.messenger.framework.logger.b;
import ru.ozon.android.messenger.framework.navigation.action.f;
import ru.ozon.app.android.messenger.flags.EnableMessengerOzonLoggerFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storefrontcommonwidgets.core.messenger.MarkdownBlockFactory;
import ru.ozon.app.android.storefrontcommonwidgets.core.messenger.TileScrollBlockFactory;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.MarkdownBlockApi;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontMessengerBlocksApi;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B[\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/messenger/initializer/MessengerInitializer;", "", "LWe/E;", "okHttpClient", "Landroid/content/Context;", "appContext", "Lru/ozon/android/messenger/framework/analytics/i;", "trackerAnalyticsAdapter", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkComponentConfig", "", "webSocketLink", "Lru/ozon/android/messenger/framework/logger/b;", "nonFatalLogger", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lei0/b;", "ozonTracker", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionStorage", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "<init>", "(LWe/E;Landroid/content/Context;Lru/ozon/android/messenger/framework/analytics/i;Lru/ozon/app/android/network/di/NetworkComponentConfig;Ljava/lang/String;Lru/ozon/android/messenger/framework/logger/b;Lru/ozon/app/android/network/abtool/FeatureChecker;Lei0/b;Lru/ozon/app/android/storage/appversion/AppVersionStorage;Lru/ozon/app/android/network/version/AppVersionService;)V", "namespace", "Lru/ozon/android/messenger/framework/navigation/action/f;", "messengerActionHandler", "", "isEdgeToEdgeEnabled", "Lru/ozon/android/messenger/api/a;", "createFeature", "(Ljava/lang/String;Lru/ozon/android/messenger/framework/navigation/action/f;Z)Lru/ozon/android/messenger/api/a;", "LWe/E;", "Landroid/content/Context;", "Lru/ozon/android/messenger/framework/analytics/i;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "Ljava/lang/String;", "Lru/ozon/android/messenger/framework/logger/b;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lei0/b;", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "Lru/ozon/app/android/network/version/AppVersionService;", "Lru/ozon/app/android/storefrontcommonwidgets/core/messenger/TileScrollBlockFactory;", "tileScrollBlockProvider", "Lru/ozon/app/android/storefrontcommonwidgets/core/messenger/TileScrollBlockFactory;", "Lru/ozon/app/android/storefrontcommonwidgets/core/messenger/MarkdownBlockFactory;", "markdownBlockProvider", "Lru/ozon/app/android/storefrontcommonwidgets/core/messenger/MarkdownBlockFactory;", "Companion", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessengerInitializer {

    @NotNull
    private final Context appContext;

    @NotNull
    private final AppVersionService appVersionService;

    @NotNull
    private final AppVersionStorage appVersionStorage;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final MarkdownBlockFactory markdownBlockProvider;

    @NotNull
    private final NetworkComponentConfig networkComponentConfig;

    @NotNull
    private final b nonFatalLogger;

    @NotNull
    private final E okHttpClient;

    @NotNull
    private final InterfaceC6369b ozonTracker;

    @NotNull
    private final TileScrollBlockFactory tileScrollBlockProvider;

    @NotNull
    private final i trackerAnalyticsAdapter;

    @NotNull
    private final String webSocketLink;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/messenger/initializer/MessengerInitializer$Companion;", "", "<init>", "()V", "API_URL_PATH", "", "MESSENGER_PATH", "NAMESPACE_QUERY_PARAM", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MessengerInitializer(@NotNull E okHttpClient, @NotNull Context appContext, @NotNull i trackerAnalyticsAdapter, @NotNull NetworkComponentConfig networkComponentConfig, @NotNull String webSocketLink, @NotNull b nonFatalLogger, @NotNull FeatureChecker featureChecker, @NotNull InterfaceC6369b ozonTracker, @NotNull AppVersionStorage appVersionStorage, @NotNull AppVersionService appVersionService) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(trackerAnalyticsAdapter, "trackerAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(networkComponentConfig, "networkComponentConfig");
        Intrinsics.checkNotNullParameter(webSocketLink, "webSocketLink");
        Intrinsics.checkNotNullParameter(nonFatalLogger, "nonFatalLogger");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(appVersionStorage, "appVersionStorage");
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        this.okHttpClient = okHttpClient;
        this.appContext = appContext;
        this.trackerAnalyticsAdapter = trackerAnalyticsAdapter;
        this.networkComponentConfig = networkComponentConfig;
        this.webSocketLink = webSocketLink;
        this.nonFatalLogger = nonFatalLogger;
        this.featureChecker = featureChecker;
        this.ozonTracker = ozonTracker;
        this.appVersionStorage = appVersionStorage;
        this.appVersionService = appVersionService;
        if (StorefrontMessengerBlocksApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorefrontMessengerBlocksApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(appContext, StorefrontMessengerBlocksApi.class).getDependencyStorage();
        if (StorefrontMessengerBlocksApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorefrontMessengerBlocksApi is not DiComponent");
        }
        this.tileScrollBlockProvider = ((StorefrontMessengerBlocksApi) dependencyStorage.b(StorefrontMessengerBlocksApi.class)).getTileScrollBlockProvider();
        if (MarkdownBlockApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component MarkdownBlockApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(appContext, MarkdownBlockApi.class).getDependencyStorage();
        if (MarkdownBlockApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component MarkdownBlockApi is not DiComponent");
        }
        this.markdownBlockProvider = ((MarkdownBlockApi) dependencyStorage2.b(MarkdownBlockApi.class)).getMarkdownBlockProvider();
    }

    @NotNull
    public final a createFeature(@NotNull String namespace, @NotNull f messengerActionHandler, boolean isEdgeToEdgeEnabled) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(messengerActionHandler, "messengerActionHandler");
        String uri = Uri.parse(this.webSocketLink).buildUpon().appendEncodedPath("v3/buyer").appendQueryParameter("namespace", namespace).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        int i11 = e.f87343e;
        Context context = this.appContext;
        E e11 = this.okHttpClient;
        d.f fVar = new d.f(this.networkComponentConfig.getApiUrl(), uri, namespace, this.networkComponentConfig.getApiUrl());
        i iVar = this.trackerAnalyticsAdapter;
        d.b bVar = new d.b();
        b bVar2 = this.nonFatalLogger;
        FeatureChecker featureChecker = this.featureChecker;
        return e.e(new MessengerConfigImpl(context, e11, null, iVar, messengerActionHandler, bVar, fVar, bVar2, featureChecker, featureChecker.isEnabled(EnableMessengerOzonLoggerFlag.INSTANCE), new d.c(this) { // from class: ru.ozon.app.android.messenger.initializer.MessengerInitializer$createFeature$1
            private final MessengerInitializer$createFeature$1$appVersionConfig$1 appVersionConfig;
            private final InterfaceC6369b ozonTracker;

            /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.messenger.initializer.MessengerInitializer$createFeature$1$appVersionConfig$1] */
            {
                InterfaceC6369b interfaceC6369b;
                this.appVersionConfig = new ru.ozon.android.messenger.framework.core.initialization.a(this) { // from class: ru.ozon.app.android.messenger.initializer.MessengerInitializer$createFeature$1$appVersionConfig$1
                    private final String appName;
                    private final DeviceType deviceType;
                    private final String versionCode;
                    private final String versionName;

                    {
                        AppVersionService appVersionService;
                        NetworkComponentConfig networkComponentConfig;
                        AppVersionStorage appVersionStorage;
                        AppVersionStorage appVersionStorage2;
                        appVersionService = this.appVersionService;
                        this.appName = appVersionService.getAppName();
                        networkComponentConfig = this.networkComponentConfig;
                        this.deviceType = networkComponentConfig.getDeviceType();
                        appVersionStorage = this.appVersionStorage;
                        this.versionCode = appVersionStorage.getVersionCode();
                        appVersionStorage2 = this.appVersionStorage;
                        this.versionName = appVersionStorage2.getVersionNameWithoutSuffix();
                    }

                    @Override // ru.ozon.android.messenger.framework.core.initialization.a
                    public String getAppName() {
                        return this.appName;
                    }

                    @Override // ru.ozon.android.messenger.framework.core.initialization.a
                    public DeviceType getDeviceType() {
                        return this.deviceType;
                    }

                    @Override // ru.ozon.android.messenger.framework.core.initialization.a
                    public String getVersionCode() {
                        return this.versionCode;
                    }

                    @Override // ru.ozon.android.messenger.framework.core.initialization.a
                    public String getVersionName() {
                        return this.versionName;
                    }
                };
                interfaceC6369b = this.ozonTracker;
                this.ozonTracker = interfaceC6369b;
            }

            @Override // ru.ozon.android.messenger.framework.core.initialization.d.c
            public InterfaceC6369b getOzonTracker() {
                return this.ozonTracker;
            }

            @Override // ru.ozon.android.messenger.framework.core.initialization.d.c
            public MessengerInitializer$createFeature$1$appVersionConfig$1 getAppVersionConfig() {
                return this.appVersionConfig;
            }
        }, isEdgeToEdgeEnabled, this.markdownBlockProvider, this.tileScrollBlockProvider, 4, null));
    }
}
