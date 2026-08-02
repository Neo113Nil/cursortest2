package com.unity3d.ads.core.data.datasource;

import android.os.Bundle;
import com.ironsource.C4427z5;
import com.ironsource.mediationsdk.j;
import com.unity3d.ads.core.data.model.AdRevenueAdFormat;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.log.Logger;
import defpackage.dmi;
import defpackage.e0c;
import defpackage.iii;
import defpackage.ixa;
import defpackage.ku3;
import defpackage.xw3;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001e¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;", "", "Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "handleAdRevenueEvent", "Lku3;", "scope", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;Lku3;Lcom/unity3d/ads/core/log/Logger;)V", "Landroid/os/Bundle;", "bundle", "Lcom/unity3d/ads/core/data/model/AdRevenueData;", "parseRevenueBundle", "(Landroid/os/Bundle;)Lcom/unity3d/ads/core/data/model/AdRevenueData;", "", "bundleToTraceString", "(Landroid/os/Bundle;)Ljava/lang/String;", "validateString", "(Ljava/lang/String;)Ljava/lang/String;", "formatStr", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "parseMaxAdFormatString", "(Ljava/lang/String;)Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "messageData", "", "onMessageReceived", "(Landroid/os/Bundle;)V", "Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "Lku3;", "Lcom/unity3d/ads/core/log/Logger;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MaxAdRevenueListener {

    @NotNull
    private static final String KEY_AD_FORMAT = "ad_format";

    @NotNull
    private static final String KEY_COUNTRY_CODE = "country_code";

    @NotNull
    private static final String KEY_MAX_AD_UNIT_ID = "max_ad_unit_id";

    @NotNull
    private static final String KEY_NETWORK_NAME = "network_name";

    @NotNull
    private static final String KEY_REVENUE = "revenue";

    @NotNull
    private static final String KEY_THIRD_PARTY_AD_PLACEMENT_ID = "third_party_ad_placement_id";
    private static final int MAX_STRING_LENGTH = 500;

    @NotNull
    private final HandleAdRevenueEvent handleAdRevenueEvent;

    @NotNull
    private final Logger logger;

    @NotNull
    private final ku3 scope;

    public MaxAdRevenueListener(@NotNull HandleAdRevenueEvent handleAdRevenueEvent, @NotNull ku3 ku3Var, @NotNull Logger logger) {
        handleAdRevenueEvent.getClass();
        ku3Var.getClass();
        logger.getClass();
        this.handleAdRevenueEvent = handleAdRevenueEvent;
        this.scope = ku3Var;
        this.logger = logger;
    }

    private final String bundleToTraceString(Bundle bundle) {
        try {
            if (bundle.isEmpty()) {
                return "{}";
            }
            Set<String> keySet = bundle.keySet();
            keySet.getClass();
            return CollectionsKt.f0(keySet, null, "{", "}", new e0c(0, bundle), 25);
        } catch (Throwable unused) {
            return "<error serializing bundle>";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence bundleToTraceString$lambda$1(Bundle bundle, String str) {
        String obj;
        StringBuilder sb;
        try {
            Object obj2 = bundle.get(str);
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof String) {
                if (((String) obj2).length() <= 500) {
                    sb = new StringBuilder("\"");
                    sb.append((String) obj2);
                    sb.append('\"');
                } else {
                    sb = new StringBuilder("\"");
                    sb.append(iii.H(500, (String) obj2));
                    sb.append("...\"");
                }
                obj = sb.toString();
            } else {
                obj = obj2.toString();
            }
            return str + C4427z5.U + obj;
        } catch (Throwable unused) {
            return dmi.y(str, "=<error>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMessageReceived$lambda$0(MaxAdRevenueListener maxAdRevenueListener, Bundle bundle) {
        return "Ad revenue subscribed event (raw): " + maxAdRevenueListener.bundleToTraceString(bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r1.equals("REWARDED_INTERSTITIAL") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.REWARDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r1.equals("REWARDED_INTER") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r1.equals("REWARDED") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r1.equals("INTER") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.INTERSTITIAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r1.equals("INTERSTITIAL") == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AdRevenueAdFormat parseMaxAdFormatString(String formatStr) {
        if (formatStr == null || StringsKt.R(formatStr)) {
            return null;
        }
        String upperCase = formatStr.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case -1999289321:
                if (upperCase.equals("NATIVE")) {
                    return AdRevenueAdFormat.NATIVE;
                }
                return AdRevenueAdFormat.INSTANCE.fromString(formatStr);
            case -1372958932:
                break;
            case 2374915:
                if (upperCase.equals("MREC")) {
                    return AdRevenueAdFormat.MREC;
                }
                return AdRevenueAdFormat.INSTANCE.fromString(formatStr);
            case 69823676:
                break;
            case 543046670:
                break;
            case 1654540619:
                break;
            case 1854800829:
                break;
            case 1951953708:
                if (upperCase.equals(j.a)) {
                    return AdRevenueAdFormat.BANNER;
                }
                return AdRevenueAdFormat.INSTANCE.fromString(formatStr);
            default:
                return AdRevenueAdFormat.INSTANCE.fromString(formatStr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x004b, B:9:0x0053, B:10:0x005a, B:12:0x0062, B:13:0x0069, B:15:0x0071, B:16:0x0078, B:18:0x0080, B:19:0x0087, B:27:0x001c, B:29:0x0026, B:31:0x0033, B:32:0x0039), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x004b, B:9:0x0053, B:10:0x005a, B:12:0x0062, B:13:0x0069, B:15:0x0071, B:16:0x0078, B:18:0x0080, B:19:0x0087, B:27:0x001c, B:29:0x0026, B:31:0x0033, B:32:0x0039), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x004b, B:9:0x0053, B:10:0x005a, B:12:0x0062, B:13:0x0069, B:15:0x0071, B:16:0x0078, B:18:0x0080, B:19:0x0087, B:27:0x001c, B:29:0x0026, B:31:0x0033, B:32:0x0039), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x004b, B:9:0x0053, B:10:0x005a, B:12:0x0062, B:13:0x0069, B:15:0x0071, B:16:0x0078, B:18:0x0080, B:19:0x0087, B:27:0x001c, B:29:0x0026, B:31:0x0033, B:32:0x0039), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AdRevenueData parseRevenueBundle(Bundle bundle) {
        Double valueOf;
        try {
            if (bundle.containsKey("revenue")) {
                double d = bundle.getDouble("revenue");
                if (d >= 0.0d && Math.abs(d) <= Double.MAX_VALUE) {
                    valueOf = Double.valueOf(d);
                    String string = bundle.getString(KEY_COUNTRY_CODE);
                    String validateString = string == null ? validateString(string) : null;
                    String string2 = bundle.getString(KEY_NETWORK_NAME);
                    String validateString2 = string2 == null ? validateString(string2) : null;
                    String string3 = bundle.getString(KEY_MAX_AD_UNIT_ID);
                    String validateString3 = string3 == null ? validateString(string3) : null;
                    String string4 = bundle.getString(KEY_THIRD_PARTY_AD_PLACEMENT_ID);
                    return new AdRevenueData(null, valueOf, validateString, validateString2, validateString3, string4 == null ? validateString(string4) : null, parseMaxAdFormatString(bundle.getString(KEY_AD_FORMAT)), 1, null);
                }
                Logger.DefaultImpls.trace$default(this.logger, "Invalid or missing revenue in revenue event: " + d, null, 2, null);
            } else {
                Logger.DefaultImpls.trace$default(this.logger, "Missing revenue key in revenue event", null, 2, null);
            }
            valueOf = null;
            String string5 = bundle.getString(KEY_COUNTRY_CODE);
            if (string5 == null) {
            }
            String string22 = bundle.getString(KEY_NETWORK_NAME);
            if (string22 == null) {
            }
            String string32 = bundle.getString(KEY_MAX_AD_UNIT_ID);
            if (string32 == null) {
            }
            String string42 = bundle.getString(KEY_THIRD_PARTY_AD_PLACEMENT_ID);
            return new AdRevenueData(null, valueOf, validateString, validateString2, validateString3, string42 == null ? validateString(string42) : null, parseMaxAdFormatString(bundle.getString(KEY_AD_FORMAT)), 1, null);
        } catch (Exception e) {
            this.logger.trace("Failed to parse revenue Bundle", e);
            return null;
        }
    }

    private final String validateString(String str) {
        if (StringsKt.R(str) || str.length() > 500) {
            return null;
        }
        return str;
    }

    public final void onMessageReceived(@NotNull Bundle messageData) {
        messageData.getClass();
        this.logger.trace(new ixa(11, this, messageData));
        xw3.L(this.scope, null, null, new MaxAdRevenueListener$onMessageReceived$2(this, messageData, null), 3);
    }
}
