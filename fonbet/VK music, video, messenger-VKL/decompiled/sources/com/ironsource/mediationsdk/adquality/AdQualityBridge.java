package com.ironsource.mediationsdk.adquality;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C4243ba;
import com.ironsource.C4376j0;
import com.ironsource.C4452n4;
import com.ironsource.C4632x5;
import com.ironsource.EnumC4650y5;
import com.ironsource.Kb;
import com.ironsource.L6;
import com.ironsource.M6;
import com.ironsource.Wa;
import com.ironsource.adapters.bigo.BigoConstants;
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
import org.json.JSONObject;
import xsna.brm0;
import xsna.drm0;
import xsna.epx;
import xsna.z23;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class AdQualityBridge {
    public static final Companion Companion = new Companion(null);
    private static Boolean isGetVersionMethodExist;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isGetVersionMethodExist() {
            try {
                if (AdQualityBridge.isGetVersionMethodExist != null) {
                    return epx.f(AdQualityBridge.isGetVersionMethodExist, Boolean.TRUE);
                }
                boolean z = Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality").getDeclaredMethods().length >= 10;
                AdQualityBridge.isGetVersionMethodExist = Boolean.valueOf(z);
                return z;
            } catch (Throwable th) {
                C4452n4.d().a(th);
                logEvent$default(this, EnumC4650y5.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(EnumC4650y5 enumC4650y5, Integer num, String str) {
            JSONObject b = IronSourceUtils.b(false);
            if (num != null) {
                b.put("errorCode", num.intValue());
            }
            if (str != null) {
                b.put("reason", str);
            }
            b.put(IronSourceConstants.EVENTS_EXT1, a.a.a().b());
            Kb.u.d().q().a(new C4632x5(enumC4650y5, b));
        }

        public static /* synthetic */ void logEvent$default(Companion companion, EnumC4650y5 enumC4650y5, Integer num, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            companion.logEvent(enumC4650y5, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int versionCompare(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return -1;
            }
            int i = 0;
            String[] strArr = (String[]) drm0.c0(z23.c("[^0-9.]", str, ""), new String[]{"."}, 0, 6).toArray(new String[0]);
            String[] strArr2 = (String[]) drm0.c0(z23.c("[^0-9.]", str2, ""), new String[]{"."}, 0, 6).toArray(new String[0]);
            while (i < strArr.length && i < strArr2.length && epx.f(strArr[i], strArr2[i])) {
                i++;
            }
            return (i >= strArr.length || i >= strArr2.length) ? Integer.signum(strArr.length - strArr2.length) : Integer.signum(epx.g(Integer.valueOf(strArr[i]).intValue(), Integer.valueOf(strArr2[i]).intValue()));
        }

        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }

        public final String getAdQualitySdkVersion() {
            return isGetVersionMethodExist() ? IronSourceAdQuality.getSDKVersion() : new String();
        }

        private Companion() {
        }

        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }
    }

    public AdQualityBridge(Context context, String str, String str2, C4376j0 c4376j0, int i) {
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource(BigoConstants.MEDIATION_NAME).setLogLevel(convertToAdQualityLogLevel(i)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            public void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str3) {
                EnumC4650y5 enumC4650y5 = EnumC4650y5.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (iSAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    enumC4650y5 = EnumC4650y5.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                }
                AdQualityBridge.Companion.logEvent(enumC4650y5, Integer.valueOf(iSAdQualityInitError.getValue()), str3);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: ".concat(str3), 3);
            }

            public void adQualitySdkInitSuccess() {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.Companion, EnumC4650y5.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!TextUtils.isEmpty(str2)) {
            deviceIdType.setUserId(str2);
        }
        Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject a = c4376j0.a();
            if (a.length() > 0) {
                deviceIdType.setMetaData(a);
            }
        }
        Companion.logEvent$default(companion, EnumC4650y5.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, str, deviceIdType.build());
    }

    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR : ISAdQualityLogLevel.WARNING : ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.VERBOSE;
    }

    public static final String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        String a = L6.a().a(Wa.G);
        return a != null && Boolean.parseBoolean(a);
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(L6.a().a(M6.N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    private static final void logEvent(EnumC4650y5 enumC4650y5, Integer num, String str) {
        Companion.logEvent(enumC4650y5, num, str);
    }

    private static final int versionCompare(String str, String str2) {
        return Companion.versionCompare(str, str2);
    }

    public final void changeUserId(String str) {
        IronSourceAdQuality.getInstance().changeUserId(str);
    }

    public final void setSegment(C4243ba c4243ba) {
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (c4243ba.g() != null) {
            builder.setSegmentName(c4243ba.g());
        }
        if (c4243ba.a() > -1) {
            builder.setAge(c4243ba.a());
        }
        if (c4243ba.b() != null) {
            builder.setGender(c4243ba.b());
        }
        if (c4243ba.e() > -1) {
            builder.setLevel(c4243ba.e());
        }
        if (c4243ba.d() != null) {
            builder.setIsPaying(c4243ba.d().get());
        }
        if (c4243ba.c() > -1.0d) {
            builder.setInAppPurchasesTotal(c4243ba.c());
        }
        if (c4243ba.h() > 0) {
            builder.setUserCreationDate(c4243ba.h());
        }
        Iterator<Pair<String, String>> it = c4243ba.f().iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            String str = (String) next.first;
            String str2 = (String) next.second;
            if (brm0.B(str, "custom_", false)) {
                builder.setCustomData(drm0.U(str, "custom_"), str2);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }
}
