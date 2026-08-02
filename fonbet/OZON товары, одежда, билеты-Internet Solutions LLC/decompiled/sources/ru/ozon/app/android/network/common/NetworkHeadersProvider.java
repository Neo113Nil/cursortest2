package ru.ozon.app.android.network.common;

import Tc.d;
import We.C;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.debug.ExtraHeadersService;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.version.AppVersionService;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB1\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011J\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011J\u0018\u0010\u0013\u001a\u00020\u0014*\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u0014*\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0015H\u0002J*\u0010\u0017\u001a\u00020\u0014*\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/network/common/NetworkHeadersProvider;", "", "versionService", "Lru/ozon/app/android/network/version/AppVersionService;", "debugHeaderService", "Lru/ozon/app/android/network/debug/DebugHeaderService;", "extraHeadersService", "Lru/ozon/app/android/network/debug/ExtraHeadersService;", "dependencies", "Lru/ozon/app/android/network/common/NetworkHeadersDependencies;", "config", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "<init>", "(Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/network/debug/DebugHeaderService;Lru/ozon/app/android/network/debug/ExtraHeadersService;Lru/ozon/app/android/network/common/NetworkHeadersDependencies;Lru/ozon/app/android/network/di/NetworkComponentConfig;)V", "deviceTypeNameHeaderValue", "", "getNativeHeaders", "", "getWebViewHeaders", "putGeneralHeaders", "", "", "putNativeHeaders", "putNotNull", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkHeadersProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String MEDIA_TYPE;

    @NotNull
    private final DebugHeaderService debugHeaderService;

    @NotNull
    private final NetworkHeadersDependencies dependencies;

    @NotNull
    private final String deviceTypeNameHeaderValue;

    @NotNull
    private final ExtraHeadersService extraHeadersService;

    @NotNull
    private final AppVersionService versionService;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/network/common/NetworkHeadersProvider$Companion;", "", "<init>", "()V", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        C.f33536g.getClass();
        MEDIA_TYPE = String.valueOf(C.a.b("application/json; charset=utf-8"));
    }

    public NetworkHeadersProvider(@NotNull AppVersionService versionService, @NotNull DebugHeaderService debugHeaderService, @NotNull ExtraHeadersService extraHeadersService, @NotNull NetworkHeadersDependencies dependencies, @NotNull NetworkComponentConfig config) {
        Intrinsics.checkNotNullParameter(versionService, "versionService");
        Intrinsics.checkNotNullParameter(debugHeaderService, "debugHeaderService");
        Intrinsics.checkNotNullParameter(extraHeadersService, "extraHeadersService");
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        Intrinsics.checkNotNullParameter(config, "config");
        this.versionService = versionService;
        this.debugHeaderService = debugHeaderService;
        this.extraHeadersService = extraHeadersService;
        this.dependencies = dependencies;
        this.deviceTypeNameHeaderValue = config.getDeviceTypeName();
    }

    private final void putGeneralHeaders(Map<String, String> map) {
        putNotNull(map, "User-Agent", this.versionService.getUserAgent());
        putNotNull(map, "x-o3-app-name", this.versionService.getAppName());
        putNotNull(map, "x-o3-app-version", this.versionService.getVersion());
        putNotNull(map, "x-o3-sample-trace", String.valueOf(this.dependencies.isOzonQA()));
        putNotNull(map, "x-o3-ab-variants", this.debugHeaderService.getAbVariant());
        putNotNull(map, "x-o3-meshversion", this.debugHeaderService.getMeshValue());
        putNotNull(map, "x-o3-language", this.dependencies.getDisplayedLanguage());
        putNotNull(map, "x-o3-resolve-override", this.debugHeaderService.getResolveOverride());
    }

    private final void putNativeHeaders(Map<String, String> map) {
        putNotNull(map, "MOBILE-GAID", this.dependencies.getAdvertisingId());
        putNotNull(map, "MOBILE-LAT", String.valueOf(Boolean.compare(this.dependencies.isLimitAdTrackingEnabled(), false)));
        putNotNull(map, "x-o3-device-type", this.deviceTypeNameHeaderValue);
        putNotNull(map, "x-o3-internal-headers-token", this.debugHeaderService.getInternalHeadersToken());
        putNotNull(map, "x-o3-composer-debug-token", this.debugHeaderService.getComposerDebugToken());
        putNotNull(map, "x-o3-gds-mock", this.dependencies.isRailwayMockServiceEnabled() ? "true" : null);
        putNotNull(map, "Accept", MEDIA_TYPE);
        map.putAll(this.extraHeadersService.getExtraHeaders());
    }

    private final void putNotNull(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    @NotNull
    public final Map<String, String> getNativeHeaders() {
        d builder = new d();
        putGeneralHeaders(builder);
        putNativeHeaders(builder);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    @NotNull
    public final Map<String, String> getWebViewHeaders() {
        d builder = new d();
        putGeneralHeaders(builder);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }
}
