package com.unity3d.ads.core.data.datasource;

import android.os.Bundle;
import com.ironsource.B5;
import com.unity3d.ads.core.data.model.AdRevenueAdFormat;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.log.Logger;
import com.vk.movika.sdk.base.ui.s;
import java.util.Locale;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.drm0;
import xsna.erm0;
import xsna.fo8;
import xsna.hxl;
import xsna.j5g;
import xsna.myc0;
import xsna.yvj;
import xsna.zcl;

/* compiled from: MaxAdRevenueListener.kt */
/* loaded from: classes14.dex */
public final class MaxAdRevenueListener {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_AD_FORMAT = "ad_format";
    private static final String KEY_COUNTRY_CODE = "country_code";
    private static final String KEY_MAX_AD_UNIT_ID = "max_ad_unit_id";
    private static final String KEY_NETWORK_NAME = "network_name";
    private static final String KEY_REVENUE = "revenue";
    private static final String KEY_THIRD_PARTY_AD_PLACEMENT_ID = "third_party_ad_placement_id";
    private static final int MAX_STRING_LENGTH = 500;
    private final HandleAdRevenueEvent handleAdRevenueEvent;
    private final Logger logger;
    private final yvj scope;

    /* compiled from: MaxAdRevenueListener.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public MaxAdRevenueListener(HandleAdRevenueEvent handleAdRevenueEvent, yvj yvjVar, Logger logger) {
        this.handleAdRevenueEvent = handleAdRevenueEvent;
        this.scope = yvjVar;
        this.logger = logger;
    }

    private final String bundleToTraceString(Bundle bundle) {
        try {
            return bundle.isEmpty() ? "{}" : j5g.g0(bundle.keySet(), null, "{", "}", 0, new hxl(bundle, 18), 25);
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
                    sb.append(erm0.D0(500, (String) obj2));
                    sb.append("...\"");
                }
                obj = sb.toString();
            } else {
                obj = obj2.toString();
            }
            return str + B5.U + obj;
        } catch (Throwable unused) {
            return fo8.a(str, "=<error>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMessageReceived$lambda$0(MaxAdRevenueListener maxAdRevenueListener, Bundle bundle) {
        return "Ad revenue subscribed event (raw): " + maxAdRevenueListener.bundleToTraceString(bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r0.equals("REWARDED_INTERSTITIAL") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.REWARDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0.equals("REWARDED_INTER") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r0.equals("REWARDED") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0.equals("INTER") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.INTERSTITIAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r0.equals("INTERSTITIAL") == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AdRevenueAdFormat parseMaxAdFormatString(String str) {
        if (str == null || drm0.N(str)) {
            return null;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        switch (upperCase.hashCode()) {
            case -1999289321:
                if (upperCase.equals("NATIVE")) {
                    return AdRevenueAdFormat.NATIVE;
                }
                return AdRevenueAdFormat.Companion.fromString(str);
            case -1372958932:
                break;
            case 2374915:
                if (upperCase.equals("MREC")) {
                    return AdRevenueAdFormat.MREC;
                }
                return AdRevenueAdFormat.Companion.fromString(str);
            case 69823676:
                break;
            case 543046670:
                break;
            case 1654540619:
                break;
            case 1854800829:
                break;
            case 1951953708:
                if (upperCase.equals("BANNER")) {
                    return AdRevenueAdFormat.BANNER;
                }
                return AdRevenueAdFormat.Companion.fromString(str);
            default:
                return AdRevenueAdFormat.Companion.fromString(str);
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
                if (d >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE && Math.abs(d) <= Double.MAX_VALUE) {
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
        if (drm0.N(str) || str.length() > 500) {
            return null;
        }
        return str;
    }

    public final void onMessageReceived(Bundle bundle) {
        this.logger.trace(new s(13, this, bundle));
        myc0.h(this.scope, null, null, new MaxAdRevenueListener$onMessageReceived$2(this, bundle, null), 3);
    }
}
