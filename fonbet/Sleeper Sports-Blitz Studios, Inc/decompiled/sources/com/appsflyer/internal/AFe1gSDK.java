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
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u000b\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0015\u0010\r\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000eR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/appsflyer/internal/AFe1gSDK;", "", "Lcom/appsflyer/internal/AFd1rSDK;", "p0", "Lcom/appsflyer/internal/AFd1pSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1rSDK;Lcom/appsflyer/internal/AFd1pSDK;)V", "", "areAllFieldsValid", "Lkotlin/Lazy;", "getCurrencyIso4217Code", "AFAdRevenueData", "getRevenue", "()Ljava/lang/String;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFd1rSDK;", "", "getMediationNetwork", "()Z", "Lcom/appsflyer/internal/AFd1pSDK;", "component2", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFe1gSDK {
    private static AFe1jSDK component4;

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public final Lazy getRevenue;

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    private final Lazy getCurrencyIso4217Code;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private final AFd1pSDK areAllFieldsValid;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private final AFd1rSDK AFAdRevenueData;

    /* renamed from: AFa1tSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String getMediationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String getRevenue = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> component2 = CollectionsKt.listOf((Object[]) new String[]{"googleplay", "playstore", "googleplaystore"});

    public AFe1gSDK(AFd1rSDK aFd1rSDK, AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.AFAdRevenueData = aFd1rSDK;
        this.areAllFieldsValid = aFd1pSDK;
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1gSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String str = (String) AFb1rSDK.getRevenue(new Object[]{AFe1gSDK.this.areAllFieldsValid, AFe1gSDK.this.AFAdRevenueData.areAllFieldsValid()}, 983289703, -983289699, (int) System.currentTimeMillis());
                String str2 = str;
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    String obj = StringsKt.trim((CharSequence) str2).toString();
                    Companion companion = AFe1gSDK.INSTANCE;
                    List<String> AFAdRevenueData = Companion.AFAdRevenueData();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = obj.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (!AFAdRevenueData.contains(lowerCase)) {
                        str = "-" + obj;
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "");
                        AFLogger.afWarnLog(format);
                        str = "";
                    }
                }
                return StringsKt.trim((CharSequence) (str != null ? str : "")).toString();
            }

            {
                super(0);
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1gSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String packageName = AFe1gSDK.this.AFAdRevenueData.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return AFe1gSDK.getCurrencyIso4217Code(packageName, AFe1gSDK.getRevenue(AFe1gSDK.this));
            }

            {
                super(0);
            }
        });
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\"\u0004\b\b\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFe1gSDK$AFa1tSDK;", "", "<init>", "()V", "", "", "component2", "Ljava/util/List;", "AFAdRevenueData", "()Ljava/util/List;", "getRevenue", "getMediationNetwork", "Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1jSDK;", "component4", "Lcom/appsflyer/internal/AFe1jSDK;", "(Lcom/appsflyer/internal/AFe1jSDK;)V", "getMonetizationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1gSDK$AFa1tSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static List<String> AFAdRevenueData() {
            return AFe1gSDK.component2;
        }

        public static void AFAdRevenueData(AFe1jSDK aFe1jSDK) {
            AFe1gSDK.component4 = aFe1jSDK;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static boolean getMediationNetwork() {
        return component4 == null;
    }

    public final String getMonetizationNetwork() {
        AFe1cSDK aFe1cSDK;
        if (getMediationNetwork()) {
            aFe1cSDK = AFe1cSDK.DEFAULT;
        } else {
            aFe1cSDK = AFe1cSDK.API;
        }
        int i = AFa1vSDK.getRevenue[aFe1cSDK.ordinal()];
        if (i == 1) {
            return (String) this.getRevenue.getValue();
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1jSDK aFe1jSDK = component4;
        String str = aFe1jSDK != null ? aFe1jSDK.getMonetizationNetwork : null;
        return str == null ? "" : str;
    }

    public final String getCurrencyIso4217Code() {
        AFe1cSDK aFe1cSDK;
        if (getMediationNetwork()) {
            aFe1cSDK = AFe1cSDK.DEFAULT;
        } else {
            aFe1cSDK = AFe1cSDK.API;
        }
        int i = AFa1vSDK.getRevenue[aFe1cSDK.ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1jSDK aFe1jSDK = component4;
        String str = aFe1jSDK != null ? aFe1jSDK.getCurrencyIso4217Code : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String getCurrencyIso4217Code(String str, String str2) {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
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

    public static final /* synthetic */ String getRevenue(AFe1gSDK aFe1gSDK) {
        return (String) aFe1gSDK.getCurrencyIso4217Code.getValue();
    }

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1cSDK.values().length];
            try {
                iArr[AFe1cSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1cSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1cSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    public static final void getRevenue(AFe1jSDK aFe1jSDK) {
        Companion.AFAdRevenueData(aFe1jSDK);
    }
}
