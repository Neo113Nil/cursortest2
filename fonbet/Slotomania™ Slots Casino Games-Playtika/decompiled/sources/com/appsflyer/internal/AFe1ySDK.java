package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u000b\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0015\u0010\r\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0011\u0010\u000e\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFe1ySDK;", "", "Lcom/appsflyer/internal/AFc1kSDK;", "p0", "Lcom/appsflyer/internal/AFc1sSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1sSDK;)V", "", "component4", "Lkotlin/Lazy;", "getRevenue", "getCurrencyIso4217Code", "getMediationNetwork", "AFAdRevenueData", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFc1kSDK;", "", "()Z", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFc1sSDK;", "component1", "areAllFieldsValid", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AFe1ySDK {
    private static AFd1bSDK component1;

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final AFc1sSDK component1;

    /* renamed from: component4, reason: from kotlin metadata */
    private final Lazy getRevenue;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public final Lazy getMediationNetwork;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final AFc1kSDK getCurrencyIso4217Code;

    /* renamed from: AFa1vSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String getRevenue = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String getMonetizationNetwork = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> component2 = CollectionsKt.listOf((Object[]) new String[]{"googleplay", "playstore", "googleplaystore"});

    public AFe1ySDK(AFc1kSDK aFc1kSDK, AFc1sSDK aFc1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        this.getCurrencyIso4217Code = aFc1kSDK;
        this.component1 = aFc1sSDK;
        this.getRevenue = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1ySDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String AFAdRevenueData = com.appsflyer.internal.AFa1zSDK.AFAdRevenueData(AFe1ySDK.this.component1, AFe1ySDK.this.getCurrencyIso4217Code.component1());
                String str = AFAdRevenueData;
                if (str != null && !StringsKt.isBlank(str)) {
                    String obj = StringsKt.trim((CharSequence) str).toString();
                    Companion companion = AFe1ySDK.INSTANCE;
                    List<String> currencyIso4217Code = Companion.getCurrencyIso4217Code();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = obj.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (!currencyIso4217Code.contains(lowerCase)) {
                        AFAdRevenueData = "-" + obj;
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "");
                        AFLogger.afWarnLog(format);
                        AFAdRevenueData = "";
                    }
                }
                return StringsKt.trim((CharSequence) (AFAdRevenueData != null ? AFAdRevenueData : "")).toString();
            }

            {
                super(0);
            }
        });
        this.getMediationNetwork = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1ySDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String packageName = AFe1ySDK.this.getCurrencyIso4217Code.AFAdRevenueData.getMonetizationNetwork.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return AFe1ySDK.getMediationNetwork(packageName, AFe1ySDK.getRevenue(AFe1ySDK.this));
            }

            {
                super(0);
            }
        });
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1ySDK$AFa1vSDK;", "", "<init>", "()V", "", "", "component2", "Ljava/util/List;", "getCurrencyIso4217Code", "()Ljava/util/List;", "AFAdRevenueData", "getRevenue", "Ljava/lang/String;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFd1bSDK;", "component1", "Lcom/appsflyer/internal/AFd1bSDK;", "(Lcom/appsflyer/internal/AFd1bSDK;)V", "getMediationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1ySDK$AFa1vSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static List<String> getCurrencyIso4217Code() {
            return AFe1ySDK.component2;
        }

        public static void getCurrencyIso4217Code(AFd1bSDK aFd1bSDK) {
            AFe1ySDK.component1 = aFd1bSDK;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static boolean getRevenue() {
        return component1 == null;
    }

    public final String getCurrencyIso4217Code() {
        AFe1wSDK aFe1wSDK;
        if (getRevenue()) {
            aFe1wSDK = AFe1wSDK.DEFAULT;
        } else {
            aFe1wSDK = AFe1wSDK.API;
        }
        int i = AFa1zSDK.getMediationNetwork[aFe1wSDK.ordinal()];
        if (i == 1) {
            return (String) this.getMediationNetwork.getValue();
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFd1bSDK aFd1bSDK = component1;
        String str = aFd1bSDK != null ? aFd1bSDK.getCurrencyIso4217Code : null;
        return str == null ? "" : str;
    }

    public final String AFAdRevenueData() {
        AFe1wSDK aFe1wSDK;
        if (getRevenue()) {
            aFe1wSDK = AFe1wSDK.DEFAULT;
        } else {
            aFe1wSDK = AFe1wSDK.API;
        }
        int i = AFa1zSDK.getMediationNetwork[aFe1wSDK.ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFd1bSDK aFd1bSDK = component1;
        String str = aFd1bSDK != null ? aFd1bSDK.getRevenue : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String getMediationNetwork(String str, String str2) {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String encodeToString = Base64.encodeToString(digest, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String substring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring + "-";
    }

    public static final /* synthetic */ String getRevenue(AFe1ySDK aFe1ySDK) {
        return (String) aFe1ySDK.getRevenue.getValue();
    }

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFe1wSDK.values().length];
            try {
                iArr[AFe1wSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1wSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1wSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMediationNetwork = iArr;
        }
    }

    public static final void getMediationNetwork(AFd1bSDK aFd1bSDK) {
        Companion.getCurrencyIso4217Code(aFd1bSDK);
    }
}
