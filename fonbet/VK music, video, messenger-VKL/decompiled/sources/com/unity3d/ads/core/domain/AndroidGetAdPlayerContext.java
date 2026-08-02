package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import xsna.pn00;
import xsna.spj;
import xsna.zcl;

/* compiled from: AndroidGetAdPlayerContext.kt */
/* loaded from: classes14.dex */
public final class AndroidGetAdPlayerContext {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_GAME_ID = "gameId";
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    /* compiled from: AndroidGetAdPlayerContext.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidGetAdPlayerContext(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository) {
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(spj<? super Map<String, ? extends Object>> spjVar) {
        AndroidGetAdPlayerContext$invoke$1 androidGetAdPlayerContext$invoke$1;
        int i;
        String gameId;
        if (spjVar instanceof AndroidGetAdPlayerContext$invoke$1) {
            androidGetAdPlayerContext$invoke$1 = (AndroidGetAdPlayerContext$invoke$1) spjVar;
            int i2 = androidGetAdPlayerContext$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetAdPlayerContext$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetAdPlayerContext$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidGetAdPlayerContext$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetAdPlayerContext$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetAdPlayerContext$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = (StaticDeviceInfoOuterClass.StaticDeviceInfo) obj;
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.deviceInfoRepository.getDynamicDeviceInfo();
                gameId = this.sessionRepository.getGameId();
                if (gameId == null) {
                    gameId = "";
                }
                return pn00.k(new Pair("bundleId", staticDeviceInfo.getBundleId()), new Pair("bundleVersion", staticDeviceInfo.getBundleVersion()), new Pair("webviewHash", "unknown"), new Pair("sdkVersion", new Integer(SdkProperties.getVersionCode())), new Pair("sdkVersionName", SdkProperties.getVersionName()), new Pair(EndpointParameters.Name.OS_VERSION, staticDeviceInfo.getOsVersion()), new Pair("systemLanguage", Locale.getDefault().toString()), new Pair("deviceModel", staticDeviceInfo.getDeviceModel()), new Pair("limitAdTracking", Boolean.valueOf(dynamicDeviceInfo.getLimitedTracking())), new Pair("maxVolume", new Double(dynamicDeviceInfo.getAndroid().getMaxVolume())), new Pair(KEY_GAME_ID, gameId));
            }
        }
        androidGetAdPlayerContext$invoke$1 = new AndroidGetAdPlayerContext$invoke$1(this, spjVar);
        Object obj2 = androidGetAdPlayerContext$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidGetAdPlayerContext$invoke$1.label;
        if (i != 0) {
        }
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = (StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.deviceInfoRepository.getDynamicDeviceInfo();
        gameId = this.sessionRepository.getGameId();
        if (gameId == null) {
        }
        return pn00.k(new Pair("bundleId", staticDeviceInfo2.getBundleId()), new Pair("bundleVersion", staticDeviceInfo2.getBundleVersion()), new Pair("webviewHash", "unknown"), new Pair("sdkVersion", new Integer(SdkProperties.getVersionCode())), new Pair("sdkVersionName", SdkProperties.getVersionName()), new Pair(EndpointParameters.Name.OS_VERSION, staticDeviceInfo2.getOsVersion()), new Pair("systemLanguage", Locale.getDefault().toString()), new Pair("deviceModel", staticDeviceInfo2.getDeviceModel()), new Pair("limitAdTracking", Boolean.valueOf(dynamicDeviceInfo2.getLimitedTracking())), new Pair("maxVolume", new Double(dynamicDeviceInfo2.getAndroid().getMaxVolume())), new Pair(KEY_GAME_ID, gameId));
    }
}
