package com.ironsource.mediationsdk.adquality;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.C2329aa;
import com.ironsource.C2480j0;
import com.ironsource.C2556n4;
import com.ironsource.C2736x5;
import com.ironsource.EnumC2754y5;
import com.ironsource.J6;
import com.ironsource.Jb;
import com.ironsource.K6;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AdQualityBridge {
    public static final Companion Companion = new Companion(null);
    private static Boolean isGetVersionMethodExist;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean isGetVersionMethodExist() {
            try {
                if (AdQualityBridge.isGetVersionMethodExist != null) {
                    return Intrinsics.areEqual(AdQualityBridge.isGetVersionMethodExist, Boolean.TRUE);
                }
                boolean z = Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality").getDeclaredMethods().length >= 10;
                AdQualityBridge.isGetVersionMethodExist = Boolean.valueOf(z);
                return z;
            } catch (Throwable th) {
                C2556n4.d().a(th);
                logEvent$default(this, EnumC2754y5.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        @JvmStatic
        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void logEvent(EnumC2754y5 enumC2754y5, Integer num, String str) {
            JSONObject b = IronSourceUtils.b(false);
            if (num != null) {
                b.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            }
            if (str != null) {
                b.put("reason", str);
            }
            b.put(IronSourceConstants.EVENTS_EXT1, a.a.a().b());
            Jb.u.d().q().a(new C2736x5(enumC2754y5, b));
        }

        static /* synthetic */ void logEvent$default(Companion companion, EnumC2754y5 enumC2754y5, Integer num, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            companion.logEvent(enumC2754y5, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final int versionCompare(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return -1;
            }
            int i = 0;
            String[] strArr = (String[]) StringsKt.split$default((CharSequence) new Regex("[^0-9.]").replace(str, ""), new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            String[] strArr2 = (String[]) StringsKt.split$default((CharSequence) new Regex("[^0-9.]").replace(str2, ""), new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            while (i < strArr.length && i < strArr2.length && Intrinsics.areEqual(strArr[i], strArr2[i])) {
                i++;
            }
            if (i >= strArr.length || i >= strArr2.length) {
                return Integer.signum(strArr.length - strArr2.length);
            }
            int intValue = Integer.valueOf(strArr[i]).intValue();
            Integer valueOf = Integer.valueOf(strArr2[i]);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(vals2[i])");
            return Integer.signum(Intrinsics.compare(intValue, valueOf.intValue()));
        }

        @JvmStatic
        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }

        @JvmStatic
        public final String getAdQualitySdkVersion() {
            if (!isGetVersionMethodExist()) {
                return new String();
            }
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }

        private Companion() {
        }
    }

    public AdQualityBridge(Context context, String appKey, String str, C2480j0 adQualityDataProvider, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(adQualityDataProvider, "adQualityDataProvider");
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(ISAdQualityInitError isAdQualityInitError, String message) {
                Intrinsics.checkNotNullParameter(isAdQualityInitError, "isAdQualityInitError");
                Intrinsics.checkNotNullParameter(message, "message");
                EnumC2754y5 enumC2754y5 = EnumC2754y5.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (isAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    enumC2754y5 = EnumC2754y5.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                }
                AdQualityBridge.Companion.logEvent(enumC2754y5, Integer.valueOf(isAdQualityInitError.getValue()), message);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: " + message, 3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.Companion, EnumC2754y5.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!TextUtils.isEmpty(str)) {
            deviceIdType.setUserId(str);
        }
        Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject a = adQualityDataProvider.a();
            if (a.length() > 0) {
                deviceIdType.setMetaData(a);
            }
        }
        Companion.logEvent$default(companion, EnumC2754y5.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, appKey, deviceIdType.build());
    }

    @JvmStatic
    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR : ISAdQualityLogLevel.WARNING : ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.VERBOSE;
    }

    @JvmStatic
    public static final String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        String a = J6.a().a("is_coppa");
        return a != null && Boolean.parseBoolean(a);
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(J6.a().a(K6.N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    @JvmStatic
    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    @JvmStatic
    private static final void logEvent(EnumC2754y5 enumC2754y5, Integer num, String str) {
        Companion.logEvent(enumC2754y5, num, str);
    }

    @JvmStatic
    private static final int versionCompare(String str, String str2) {
        return Companion.versionCompare(str, str2);
    }

    public final void changeUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        IronSourceAdQuality.getInstance().changeUserId(userId);
    }

    public final void setSegment(C2329aa segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (segment.g() != null) {
            builder.setSegmentName(segment.g());
        }
        if (segment.a() > -1) {
            builder.setAge(segment.a());
        }
        if (segment.b() != null) {
            builder.setGender(segment.b());
        }
        if (segment.e() > -1) {
            builder.setLevel(segment.e());
        }
        if (segment.d() != null) {
            builder.setIsPaying(segment.d().get());
        }
        if (segment.c() > -1.0d) {
            builder.setInAppPurchasesTotal(segment.c());
        }
        if (segment.h() > 0) {
            builder.setUserCreationDate(segment.h());
        }
        Iterator<Pair<String, String>> it = segment.f().iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            String key = (String) next.first;
            String str = (String) next.second;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            if (StringsKt.startsWith$default(key, ContentMetadata.KEY_CUSTOM_PREFIX, false, 2, (Object) null)) {
                builder.setCustomData(StringsKt.removePrefix(key, (CharSequence) ContentMetadata.KEY_CUSTOM_PREFIX), str);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }
}
