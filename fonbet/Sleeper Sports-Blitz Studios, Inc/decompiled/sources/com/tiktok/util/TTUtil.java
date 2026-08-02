package com.tiktok.util;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.TTCrashHandler;
import com.tiktok.appevents.edp.Sensig;
import java.util.Arrays;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class TTUtil {
    private static final String TAG = "com.tiktok.util.TTUtil";
    private static final TTLogger logger = new TTLogger(TTUtil.class.getName(), TikTokBusinessSdk.getLogLevel());

    public static void checkThread(String tag) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            TTCrashHandler.handleCrash(tag, new IllegalStateException("Current method should be called in a non-main thread"), 2);
        }
    }

    public static String ppStr(JSONObject o) {
        if (o == null) {
            return AbstractJsonLexerKt.NULL;
        }
        try {
            return o.toString(4);
        } catch (JSONException unused) {
            return "";
        }
    }

    public static String ppStr(String str) {
        try {
            return ppStr(new JSONObject(str));
        } catch (JSONException unused) {
            return "";
        }
    }

    public static String getOrGenAnoId(Context context, boolean forceGenerate) {
        TTKeyValueStore tTKeyValueStore = new TTKeyValueStore(context);
        String str = tTKeyValueStore.get(TTConst.TTSDK_APP_ANONYMOUS_ID);
        if (!TextUtils.isEmpty(str) && !forceGenerate) {
            return str;
        }
        String uuid = UUID.randomUUID().toString();
        tTKeyValueStore.set(TTConst.TTSDK_APP_ANONYMOUS_ID, uuid);
        logger.info("AnonymousId reset to " + uuid, new Object[0]);
        return uuid;
    }

    public static Sensig getSensigInfo(Context context) {
        TTKeyValueStore tTKeyValueStore = new TTKeyValueStore(context);
        int i = tTKeyValueStore.getInt(TTConst.TTSDK_APP_SENSIG_VERSION);
        String str = tTKeyValueStore.get(TTConst.TTSDK_APP_SENSIG_LIST);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new Sensig(i, str);
    }

    public static void setSensigInfo(Context context, Sensig sensig) {
        if (sensig == null) {
            return;
        }
        TTKeyValueStore tTKeyValueStore = new TTKeyValueStore(context);
        tTKeyValueStore.set(TTConst.TTSDK_APP_SENSIG_VERSION, Integer.valueOf(sensig.version));
        tTKeyValueStore.set(TTConst.TTSDK_APP_SENSIG_LIST, sensig.regexList);
    }

    public static JSONObject getMetaWithTS(Long ts) {
        if (ts == null) {
            ts = Long.valueOf(System.currentTimeMillis());
        }
        try {
            return new JSONObject().put("ts", ts);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static JSONObject getMonitorException(Throwable ex, Long ts, int type) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "exception");
            jSONObject.put("name", "exception");
            jSONObject.put("meta", getMetaException(ex, ts, type));
            jSONObject.put("extra", (Object) null);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject getMetaException(Throwable ex, Long ts, int type) {
        JSONObject metaWithTS = getMetaWithTS(ts);
        if (ex != null) {
            while (ex.getCause() != null && ex.getCause() != ex) {
                ex = ex.getCause();
            }
            metaWithTS.put("ex_class", ex.getStackTrace()[0].getClassName());
            metaWithTS.put("ex_method", ex.getStackTrace()[0].getMethodName());
            metaWithTS.put("ex_args", ex.getStackTrace()[0].getFileName() + " " + ex.getStackTrace()[0].getLineNumber());
            metaWithTS.put("ex_msg", ex.getMessage());
            metaWithTS.put("ex_type", type);
            String[] strArr = new String[15];
            for (int i = 0; i < 15; i++) {
                if (ex.getStackTrace()[i] != null) {
                    strArr[i] = ex.getStackTrace()[i].toString();
                }
            }
            metaWithTS.put("ex_stack", Arrays.toString(strArr));
            metaWithTS.put("success", false);
            return metaWithTS;
        }
        metaWithTS.put("success", true);
        return metaWithTS;
    }
}
