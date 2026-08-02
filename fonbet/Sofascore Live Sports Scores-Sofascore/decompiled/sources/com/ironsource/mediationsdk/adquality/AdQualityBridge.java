package com.ironsource.mediationsdk.adquality;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C3959aa;
import com.ironsource.C4135j0;
import com.ironsource.C4157k4;
import com.ironsource.C4181la;
import com.ironsource.C4355v5;
import com.ironsource.EnumC4373w5;
import com.ironsource.I6;
import com.ironsource.Ib;
import com.ironsource.J6;
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
import defpackage.me4;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class AdQualityBridge {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static Boolean isGetVersionMethodExist;

    public AdQualityBridge(@NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull C4135j0 c4135j0, int i) {
        context.getClass();
        str.getClass();
        c4135j0.getClass();
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(@NotNull ISAdQualityInitError iSAdQualityInitError, @NotNull String str3) {
                iSAdQualityInitError.getClass();
                str3.getClass();
                EnumC4373w5 enumC4373w5 = EnumC4373w5.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (iSAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    enumC4373w5 = EnumC4373w5.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                }
                AdQualityBridge.Companion.logEvent(enumC4373w5, Integer.valueOf(iSAdQualityInitError.getValue()), str3);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: " + str3, 3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.Companion, EnumC4373w5.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!TextUtils.isEmpty(str2)) {
            deviceIdType.setUserId(str2);
        }
        Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject a = c4135j0.a();
            if (a.length() > 0) {
                deviceIdType.setMetaData(a);
            }
        }
        Companion.logEvent$default(companion, EnumC4373w5.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, str, deviceIdType.build());
    }

    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR : ISAdQualityLogLevel.WARNING : ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.VERBOSE;
    }

    @NotNull
    public static final String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        String str;
        List<String> list = C4181la.b().c().get(com.ironsource.mediationsdk.metadata.a.b);
        if (list == null || (str = (String) CollectionsKt.firstOrNull(list)) == null) {
            return false;
        }
        return Boolean.parseBoolean(str);
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(I6.a().a(J6.N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    private static final void logEvent(EnumC4373w5 enumC4373w5, Integer num, String str) {
        Companion.logEvent(enumC4373w5, num, str);
    }

    private static final int versionCompare(String str, String str2) {
        return Companion.versionCompare(str, str2);
    }

    public final void changeUserId(@NotNull String str) {
        str.getClass();
        IronSourceAdQuality.getInstance().changeUserId(str);
    }

    public final void setSegment(@NotNull C3959aa c3959aa) {
        c3959aa.getClass();
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (c3959aa.g() != null) {
            builder.setSegmentName(c3959aa.g());
        }
        if (c3959aa.a() > -1) {
            builder.setAge(c3959aa.a());
        }
        if (c3959aa.b() != null) {
            builder.setGender(c3959aa.b());
        }
        if (c3959aa.e() > -1) {
            builder.setLevel(c3959aa.e());
        }
        if (c3959aa.d() != null) {
            builder.setIsPaying(c3959aa.d().get());
        }
        if (c3959aa.c() > -1.0d) {
            builder.setInAppPurchasesTotal(c3959aa.c());
        }
        if (c3959aa.h() > 0) {
            builder.setUserCreationDate(c3959aa.h());
        }
        Iterator<Pair<String, String>> it = c3959aa.f().iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            String str = (String) next.first;
            String str2 = (String) next.second;
            str.getClass();
            if (c.v(str, "custom_", false)) {
                builder.setCustomData(StringsKt.V(str, "custom_"), str2);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isGetVersionMethodExist() {
            try {
                if (AdQualityBridge.isGetVersionMethodExist != null) {
                    return Intrinsics.c(AdQualityBridge.isGetVersionMethodExist, Boolean.TRUE);
                }
                boolean z = IronSourceAdQuality.class.getDeclaredMethods().length >= 10;
                AdQualityBridge.isGetVersionMethodExist = Boolean.valueOf(z);
                return z;
            } catch (Throwable th) {
                C4157k4.d().a(th);
                logEvent$default(this, EnumC4373w5.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(EnumC4373w5 enumC4373w5, Integer num, String str) {
            JSONObject b = IronSourceUtils.b(false);
            if (num != null) {
                b.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            }
            if (str != null) {
                b.put("reason", str);
            }
            b.put(IronSourceConstants.EVENTS_EXT1, a.a.a().b());
            Ib.v.d().q().a(new C4355v5(enumC4373w5, b));
        }

        public static /* synthetic */ void logEvent$default(Companion companion, EnumC4373w5 enumC4373w5, Integer num, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            companion.logEvent(enumC4373w5, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int versionCompare(String str, String str2) {
            List split$default;
            List split$default2;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return -1;
            }
            int i = 0;
            split$default = StringsKt__StringsKt.split$default(me4.h("[^0-9.]", str, ""), new String[]{"."}, false, 0, 6, null);
            String[] strArr = (String[]) split$default.toArray(new String[0]);
            split$default2 = StringsKt__StringsKt.split$default(me4.h("[^0-9.]", str2, ""), new String[]{"."}, false, 0, 6, null);
            String[] strArr2 = (String[]) split$default2.toArray(new String[0]);
            while (i < strArr.length && i < strArr2.length && Intrinsics.c(strArr[i], strArr2[i])) {
                i++;
            }
            if (i >= strArr.length || i >= strArr2.length) {
                return Integer.signum(strArr.length - strArr2.length);
            }
            int intValue = Integer.valueOf(strArr[i]).intValue();
            Integer valueOf = Integer.valueOf(strArr2[i]);
            valueOf.getClass();
            return Integer.signum(Intrinsics.d(intValue, valueOf.intValue()));
        }

        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }

        @NotNull
        public final String getAdQualitySdkVersion() {
            if (!isGetVersionMethodExist()) {
                return new String();
            }
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            sDKVersion.getClass();
            return sDKVersion;
        }

        private Companion() {
        }

        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }
    }
}
