package com.huawei.hms.support.hianalytics;

import android.content.Context;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.utils.Util;
import java.util.Map;
import xsna.v11;

/* loaded from: classes13.dex */
public class HiAnalyticsClient extends HiAnalyticsBase {
    private static final String TAG = "HiAnalyticsClient";

    @Deprecated
    public static String reportEntry(Context context, String str) {
        return context == null ? "" : reportEntry(context, str, Util.getAppId(context), 0);
    }

    public static void reportExit(Context context, String str, String str2, int i, int i2) {
        if (context == null) {
            return;
        }
        reportExit(context, str, str2, Util.getAppId(context), i, i2, 0);
    }

    public static void reportExit(Context context, String str, String str2, int i, int i2, int i3) {
        if (context == null) {
            return;
        }
        reportExit(context, str, str2, Util.getAppId(context), i, i2, i3);
    }

    public static String reportEntry(Context context, String str, int i) {
        if (context == null) {
            return "";
        }
        return reportEntry(context, str, Util.getAppId(context), i);
    }

    public static void reportExit(Context context, String str, String str2, String str3, int i, int i2, int i3) {
        if (context == null) {
            return;
        }
        Map<String, String> mapForBi = HiAnalyticsBase.getMapForBi(context, str);
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str3);
        mapForBi.put("transId", str2);
        v11.c(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE, mapForBi, HiAnalyticsConstant.HaKey.BI_KEY_RESULT, i);
        mapForBi.put("result", String.valueOf(i2));
        mapForBi.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(i3)));
        mapForBi.put("phoneType", Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_KIT_API_CALLED, mapForBi);
    }

    public static String reportEntry(Context context, String str, String str2, int i) {
        if (context == null) {
            return "";
        }
        String id = TransactionIdCreater.getId(str2, str);
        Map<String, String> mapForBi = HiAnalyticsBase.getMapForBi(context, str);
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str2);
        mapForBi.put("transId", id);
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapForBi.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(i)));
        mapForBi.put("phoneType", Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_KIT_API_CALLED, mapForBi);
        return id;
    }
}
