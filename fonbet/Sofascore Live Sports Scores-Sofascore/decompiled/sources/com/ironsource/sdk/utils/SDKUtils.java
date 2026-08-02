package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.C3996b4;
import com.ironsource.C4114he;
import com.ironsource.C4157k4;
import com.ironsource.C4197m8;
import com.ironsource.C4376w8;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4339u7;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import defpackage.is8;
import defpackage.yhk;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class SDKUtils {
    private static final String a = "SDKUtils";
    private static String b = null;
    private static String c = null;
    private static String d = null;
    private static String e = null;
    private static int f = 0;
    private static String g = null;
    private static Map<String, String> h = null;
    private static String i = "";
    private static final AtomicInteger j = new AtomicInteger(1);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        do {
            atomicInteger = j;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    public static int convertDpToPx(int i2) {
        return (int) TypedValue.applyDimension(0, i2, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i2) {
        return (int) TypedValue.applyDimension(1, i2, Resources.getSystem().getDisplayMetrics());
    }

    public static boolean copyFileFromBundleToStorage(Context context, C4376w8 c4376w8) {
        int i2;
        byte[] a2 = C3996b4.a(context, c4376w8.getName());
        if (a2 == null || a2.length == 0) {
            return false;
        }
        try {
            i2 = IronSourceStorageUtils.saveFile(a2, c4376w8.getPath());
        } catch (Exception e2) {
            IronLog.INTERNAL.error("exception: " + e2.getMessage());
            i2 = 0;
        }
        if (i2 != 0) {
            return true;
        }
        IronLog.INTERNAL.verbose("failed to read bytes for " + c4376w8.getName());
        return false;
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, C.UTF8_NAME);
        } catch (UnsupportedEncodingException e2) {
            C4157k4.d().a(e2);
            Logger.d(a, "Failed decoding string " + e2.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j2) {
        return (int) ((j2 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, C.UTF8_NAME).replace("+", "%20");
        } catch (UnsupportedEncodingException e2) {
            C4157k4.d().a(e2);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] encrypt(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            try {
                messageDigest.reset();
                messageDigest.update(str.getBytes(C.UTF8_NAME));
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                if (messageDigest != null) {
                }
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                if (messageDigest != null) {
                }
            }
        } catch (UnsupportedEncodingException e4) {
            e = e4;
            messageDigest = null;
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e2) {
                    C4157k4.d().a(e2);
                    Logger.i(a, "flatMapToJsonAsStringfailed " + e2.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z) {
        return z ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return b;
    }

    public static String getControllerConfig() {
        return g;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(e) ? e : !TextUtils.isEmpty(d) ? d : "";
    }

    public static int getDebugMode() {
        return f;
    }

    public static String getFileName(String str) {
        try {
            return URLEncoder.encode(str.split(File.separator)[r1.length - 1].split("\\?")[0], C.UTF8_NAME);
        } catch (UnsupportedEncodingException e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return h;
    }

    public static String getLimitAdTracking() {
        return c;
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e2) {
            C4157k4.d().a(e2);
            is8.h(e2);
            return null;
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(U3.d.b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(U3.a.b);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }

    public static JSONObject getNetworkFeatureConfiguration() {
        JSONObject optJSONObject;
        JSONObject jSONObject = new JSONObject();
        try {
            optJSONObject = getNetworkConfiguration().optJSONObject(U3.a.v);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return optJSONObject != null ? optJSONObject : jSONObject;
    }

    public static JSONObject getOrientation(Context context) {
        InterfaceC4339u7 a2 = Ib.a0().a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(U3.i.n, translateOrientation(a2.A(context)));
            return jSONObject;
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }

    public static C4197m8.e getProductType(String str) {
        C4197m8.e eVar = C4197m8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C4197m8.e eVar2 = C4197m8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "9.5.0";
    }

    public static String getTesterParameters() {
        return i;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState)) {
                return true;
            }
            return "mounted_ro".equals(externalStorageState);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity) || (activity instanceof InlineStoreActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        InterfaceC4339u7 a2 = Ib.a0().a();
        String I = a2.I(context);
        String c2 = a2.c(context);
        if (!TextUtils.isEmpty(I)) {
            b = I;
        }
        if (TextUtils.isEmpty(c2)) {
            return;
        }
        c = c2;
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap hashMap = new HashMap();
        if (mapArr != null) {
            for (Map<String, String> map : mapArr) {
                if (map != null) {
                    hashMap.putAll(map);
                }
            }
        }
        return hashMap;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j2) {
        return (int) ((j2 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        yhk.s(str2);
        return null;
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        yhk.s(str);
        return null;
    }

    public static void setControllerConfig(String str) {
        g = str;
        Ib.R().y().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        d = str;
    }

    public static void setCustomControllerUrl(String str) {
        e = str;
    }

    public static void setDebugMode(int i2) {
        f = i2;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        h = map;
    }

    public static void setTesterParameters(String str) {
        i = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i2) {
        return i2 != 1 ? i2 != 2 ? "none" : U3.i.C : U3.i.D;
    }

    public static String translateOrientation(int i2) {
        return i2 != 1 ? i2 != 2 ? "none" : U3.i.C : U3.i.D;
    }

    public static String translateRequestedOrientation(int i2) {
        if (i2 == 0) {
            return U3.i.C;
        }
        if (i2 == 1) {
            return U3.i.D;
        }
        if (i2 == 11) {
            return U3.i.C;
        }
        if (i2 == 12) {
            return U3.i.D;
        }
        switch (i2) {
            case 6:
            case 8:
                return U3.i.C;
            case 7:
            case 9:
                return U3.i.D;
            default:
                return "none";
        }
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(g);
            jSONObject2.put(str, jSONObject);
            g = jSONObject2.toString();
        } catch (JSONException e2) {
            C4157k4.d().a(e2);
            Logger.i(a, "Unable to update controllerConfigs: " + e2.toString());
        }
    }

    public static String fetchDemandSourceId(C4114he c4114he) {
        return fetchDemandSourceId(c4114he.a());
    }
}
