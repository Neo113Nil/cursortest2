package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFf1jSDK;
import com.appsflyer.internal.AFf1zSDK.AnonymousClass3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFc1kSDK {
    public String AFAdRevenueData;
    public final AFd1kSDK areAllFieldsValid;
    public String[] component1;
    public long component4;
    public DeepLinkListener getCurrencyIso4217Code;
    public Map<String, String> getMediationNetwork;
    public Intent getRevenue;
    public List<List<String>> getMonetizationNetwork = new ArrayList();
    public final List<String> component3 = new ArrayList();

    public AFc1kSDK(AFd1kSDK aFd1kSDK) {
        this.areAllFieldsValid = aFd1kSDK;
    }

    public final void n_(AFc1pSDK aFc1pSDK, Intent intent, Context context) {
        AFd1mSDK aFd1mSDK = (AFd1mSDK) this.areAllFieldsValid;
        if (context != null) {
            AFd1lSDK aFd1lSDK = aFd1mSDK.getMonetizationNetwork;
            if (context != null) {
                aFd1lSDK.getCurrencyIso4217Code = context.getApplicationContext();
            }
        }
        if (!p_(intent, aFc1pSDK) && this.getCurrencyIso4217Code != null && this.areAllFieldsValid.getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0) == 0 && !this.areAllFieldsValid.getMediationNetwork().AFAdRevenueData("ddl_sent")) {
            AFc1jSDK aFc1jSDK = new AFc1jSDK();
            AFf1zSDK copydefault = this.areAllFieldsValid.copydefault();
            copydefault.getRevenue.execute(copydefault.new AnonymousClass3(new AFf1iSDK(aFc1jSDK, this.areAllFieldsValid)));
        }
        this.areAllFieldsValid.getMediationNetwork().getMediationNetwork("ddl_sent", true);
    }

    public final void o_(AFc1pSDK aFc1pSDK, Uri uri) {
        AFf1kSDK aFf1kSDK = new AFf1kSDK(this, aFc1pSDK, uri, this.component3);
        AFf1zSDK copydefault = this.areAllFieldsValid.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass3(aFf1kSDK));
        this.getRevenue = null;
    }

    private Uri q_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
                return null;
            }
        }
        return null;
    }

    public final void getCurrencyIso4217Code(String str, DeepLinkResult.Error error) {
        if (this.getCurrencyIso4217Code != null) {
            AFLogger.INSTANCE.d(AFh1xSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getMediationNetwork(new DeepLinkResult(null, error));
        } else {
            getRevenue(str);
        }
    }

    public final void getMediationNetwork(Map<String, String> map) {
        if (this.getCurrencyIso4217Code != null) {
            try {
                try {
                    DeepLink AFAdRevenueData = DeepLink.AFAdRevenueData(map);
                    AFAdRevenueData.AFAdRevenueData.put("is_deferred", false);
                    getMediationNetwork(new DeepLinkResult(AFAdRevenueData, null));
                    return;
                } catch (JSONException e) {
                    AFLogger.INSTANCE.e(AFh1xSDK.DDL, "Error occurred", e, true);
                    getMediationNetwork(new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED));
                    return;
                }
            } catch (Throwable th) {
                getMediationNetwork(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getRevenue;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    public final void getMediationNetwork(DeepLinkResult deepLinkResult) {
        if (this.getCurrencyIso4217Code != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1xSDK aFh1xSDK = AFh1xSDK.DDL;
            StringBuilder sb = new StringBuilder("Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            aFLogger.d(aFh1xSDK, sb.toString());
            try {
                this.getCurrencyIso4217Code.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.INSTANCE.d(AFh1xSDK.DDL, "skipping, no callback registered");
    }

    private static void getRevenue(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getRevenue;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    public final void r_(AFc1pSDK aFc1pSDK, Uri uri, Uri uri2) {
        if (!aFc1pSDK.getMediationNetwork("af_deeplink")) {
            String obj = uri.toString();
            if (obj == null) {
                obj = null;
            } else if (obj.matches("fb\\d*?://authorize.*") && obj.contains("access_token")) {
                int indexOf = obj.indexOf(63);
                String substring = indexOf == -1 ? "" : obj.substring(indexOf);
                if (substring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (substring.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(substring.split("&")));
                    } else {
                        arrayList.add(substring);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb.length() != 0) {
                                sb.append("&");
                            } else if (!str.startsWith("?")) {
                                sb.append("?");
                            }
                            sb.append(str);
                        }
                    }
                    obj = obj.replace(substring, sb.toString());
                }
            }
            String str2 = this.AFAdRevenueData;
            if (str2 != null && this.getMediationNetwork != null && obj.contains(str2)) {
                Uri.Builder buildUpon = Uri.parse(obj).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getMediationNetwork.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                obj = buildUpon.build().toString();
                String encodedQuery = buildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFc1pSDK.getMediationNetwork.put("appended_query_params", encodedQuery);
                AFc1gSDK aFc1gSDK = aFc1pSDK.getRevenue;
                if (aFc1gSDK != null) {
                    aFc1gSDK.getMonetizationNetwork(aFc1pSDK.getMediationNetwork);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFc1pSDK.getMediationNetwork.put("af_deeplink", obj);
            AFc1gSDK aFc1gSDK2 = aFc1pSDK.getRevenue;
            if (aFc1gSDK2 != null) {
                aFc1gSDK2.getMonetizationNetwork(aFc1pSDK.getMediationNetwork);
            }
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            hashMap.put("original_link", uri2.toString());
        }
        AFb1qSDK.d_(this.areAllFieldsValid.AFInAppEventParameterName().getCurrencyIso4217Code, hashMap, uri);
        AFf1jSDK aFf1jSDK = new AFf1jSDK(this.areAllFieldsValid, UUID.randomUUID(), uri);
        if (aFf1jSDK.equals()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFc1pSDK.getMediationNetwork.put("isBrandedDomain", bool);
            AFc1gSDK aFc1gSDK3 = aFc1pSDK.getRevenue;
            if (aFc1gSDK3 != null) {
                aFc1gSDK3.getMonetizationNetwork(aFc1pSDK.getMediationNetwork);
            }
        }
        if (!aFf1jSDK.copy()) {
            this.areAllFieldsValid.d().getMediationNetwork(hashMap);
            return;
        }
        aFf1jSDK.component3 = new AFf1jSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFc1kSDK.4
            @Override // com.appsflyer.internal.AFf1jSDK.AFa1tSDK
            public final void getRevenue(String str3) {
                AFc1kSDK.this.getCurrencyIso4217Code(str3, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1jSDK.AFa1tSDK
            public final void getMediationNetwork(Map<String, String> map) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3));
                }
                AFc1kSDK.this.getMediationNetwork(hashMap);
            }
        };
        AFf1zSDK copydefault = this.areAllFieldsValid.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass3(aFf1jSDK));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:42:0x0047->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean p_(Intent intent, AFc1pSDK aFc1pSDK) {
        String string;
        Uri q_;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.getRevenue;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent == null) {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        } else {
            Bundle extras = intent.getExtras();
            if (!this.getMonetizationNetwork.isEmpty() && extras != null) {
                Iterator<List<String>> it = this.getMonetizationNetwork.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List<String> next = it.next();
                    if (next != null) {
                        Iterator<String> it2 = next.iterator();
                        if (it2.hasNext() && (string = extras.getString(it2.next())) != null) {
                            q_ = q_(string, it2);
                            if (q_ == null) {
                                StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                                sb.append(next.toString());
                                AFLogger.afDebugLog(sb.toString());
                                List<List<String>> list = this.getMonetizationNetwork;
                                Intrinsics.checkNotNullParameter("payloadKey", "");
                                Map<String, Object> revenue = AFb1rSDK.getRevenue(aFc1pSDK.getMediationNetwork);
                                Intrinsics.checkNotNullExpressionValue(revenue, "");
                                revenue.put("payloadKey", list);
                                AFc1gSDK aFc1gSDK = aFc1pSDK.getRevenue;
                                if (aFc1gSDK != null) {
                                    aFc1gSDK.getMonetizationNetwork(aFc1pSDK.getMediationNetwork);
                                }
                                uri = q_;
                            }
                        }
                    }
                    q_ = null;
                    if (q_ == null) {
                    }
                }
            }
        }
        if (data != null) {
            AFj1pSDK aFj1pSDK = new AFj1pSDK(intent);
            if (!aFj1pSDK.getMonetizationNetwork("af_consumed")) {
                aFj1pSDK.I_("af_consumed", System.currentTimeMillis());
                o_(aFc1pSDK, data);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.afInfoLog(sb2.toString());
            return false;
        }
        if (data2 != null) {
            AFj1pSDK aFj1pSDK2 = new AFj1pSDK(this.getRevenue);
            if (!aFj1pSDK2.getMonetizationNetwork("af_consumed")) {
                aFj1pSDK2.I_("af_consumed", System.currentTimeMillis());
                o_(aFc1pSDK, data2);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb3.append(data2.toString());
            sb3.append(" w/af_consumed");
            AFLogger.afInfoLog(sb3.toString());
            return false;
        }
        if (uri != null) {
            AFj1pSDK aFj1pSDK3 = new AFj1pSDK(intent);
            if (!aFj1pSDK3.getMonetizationNetwork("af_consumed")) {
                aFj1pSDK3.I_("af_consumed", System.currentTimeMillis());
                o_(aFc1pSDK, uri);
                return true;
            }
            StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
            sb4.append(uri.toString());
            sb4.append(" w/af_consumed");
            AFLogger.afInfoLog(sb4.toString());
            return false;
        }
        AFLogger.afDebugLog("No deep link detected");
        return false;
    }
}
