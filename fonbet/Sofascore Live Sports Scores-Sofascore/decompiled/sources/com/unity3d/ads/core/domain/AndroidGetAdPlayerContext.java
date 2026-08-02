package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tub;
import defpackage.y6a;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "", "", "invoke", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetAdPlayerContext {

    @NotNull
    public static final String KEY_GAME_ID = "gameId";

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetAdPlayerContext(@NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository) {
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@NotNull rq3<? super Map<String, ? extends Object>> rq3Var) {
        AndroidGetAdPlayerContext$invoke$1 androidGetAdPlayerContext$invoke$1;
        int i;
        String gameId;
        if (rq3Var instanceof AndroidGetAdPlayerContext$invoke$1) {
            androidGetAdPlayerContext$invoke$1 = (AndroidGetAdPlayerContext$invoke$1) rq3Var;
            int i2 = androidGetAdPlayerContext$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetAdPlayerContext$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetAdPlayerContext$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidGetAdPlayerContext$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetAdPlayerContext$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetAdPlayerContext$invoke$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = (StaticDeviceInfoOuterClass.StaticDeviceInfo) obj;
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.deviceInfoRepository.getDynamicDeviceInfo();
                gameId = this.sessionRepository.getGameId();
                if (gameId == null) {
                    gameId = "";
                }
                return tub.h(new Pair("bundleId", staticDeviceInfo.getBundleId()), new Pair("bundleVersion", staticDeviceInfo.getBundleVersion()), new Pair("webviewHash", "unknown"), new Pair("sdkVersion", new Integer(SdkProperties.getVersionCode())), new Pair("sdkVersionName", SdkProperties.getVersionName()), new Pair("osVersion", staticDeviceInfo.getOsVersion()), new Pair("systemLanguage", Locale.getDefault().toString()), new Pair("deviceModel", staticDeviceInfo.getDeviceModel()), new Pair("limitAdTracking", Boolean.valueOf(dynamicDeviceInfo.getLimitedTracking())), new Pair("maxVolume", new Double(dynamicDeviceInfo.getAndroid().getMaxVolume())), new Pair(KEY_GAME_ID, gameId));
            }
        }
        androidGetAdPlayerContext$invoke$1 = new AndroidGetAdPlayerContext$invoke$1(this, rq3Var);
        Object obj2 = androidGetAdPlayerContext$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidGetAdPlayerContext$invoke$1.label;
        if (i != 0) {
        }
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = (StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.deviceInfoRepository.getDynamicDeviceInfo();
        gameId = this.sessionRepository.getGameId();
        if (gameId == null) {
        }
        return tub.h(new Pair("bundleId", staticDeviceInfo2.getBundleId()), new Pair("bundleVersion", staticDeviceInfo2.getBundleVersion()), new Pair("webviewHash", "unknown"), new Pair("sdkVersion", new Integer(SdkProperties.getVersionCode())), new Pair("sdkVersionName", SdkProperties.getVersionName()), new Pair("osVersion", staticDeviceInfo2.getOsVersion()), new Pair("systemLanguage", Locale.getDefault().toString()), new Pair("deviceModel", staticDeviceInfo2.getDeviceModel()), new Pair("limitAdTracking", Boolean.valueOf(dynamicDeviceInfo2.getLimitedTracking())), new Pair("maxVolume", new Double(dynamicDeviceInfo2.getAndroid().getMaxVolume())), new Pair(KEY_GAME_ID, gameId));
    }
}
