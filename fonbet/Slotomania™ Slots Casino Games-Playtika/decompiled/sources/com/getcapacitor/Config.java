package com.getcapacitor;

import android.app.Activity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes7.dex */
public class Config {
    private static Config instance;
    private JSONObject config = new JSONObject();

    private static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    @Deprecated
    public static void load(Activity activity) {
        getInstance().loadConfig(activity);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        if (r0 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void loadConfig(Activity activity) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(activity.getAssets().open("capacitor.config.json")));
                } catch (IOException unused) {
                    return;
                }
            } catch (IOException e) {
                e = e;
            } catch (JSONException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    this.config = new JSONObject(sb.toString());
                    bufferedReader.close();
                    return;
                }
            }
        } catch (IOException e3) {
            e = e3;
            bufferedReader2 = bufferedReader;
            Logger.error("Unable to load capacitor.config.json. Run npx cap copy first", e);
        } catch (JSONException e4) {
            e = e4;
            bufferedReader2 = bufferedReader;
            Logger.error("Unable to parse capacitor.config.json. Make sure it's valid json", e);
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static JSONObject getObject(String str) {
        try {
            return getInstance().config.getJSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private JSONObject getConfigObjectDeepest(String str) throws JSONException {
        String[] split = str.split("\\.");
        JSONObject jSONObject = this.config;
        for (int i = 0; i < split.length - 1; i++) {
            jSONObject = jSONObject.getJSONObject(split[i]);
        }
        return jSONObject;
    }

    @Deprecated
    public static String getString(String str) {
        return getString(str, null);
    }

    @Deprecated
    public static String getString(String str, String str2) {
        String string;
        try {
            string = getInstance().getConfigObjectDeepest(str).getString(getConfigKey(str));
        } catch (Exception unused) {
        }
        return string == null ? str2 : string;
    }

    @Deprecated
    public static boolean getBoolean(String str, boolean z) {
        try {
            return getInstance().getConfigObjectDeepest(str).getBoolean(getConfigKey(str));
        } catch (Exception unused) {
            return z;
        }
    }

    @Deprecated
    public static int getInt(String str, int i) {
        try {
            return getInstance().getConfigObjectDeepest(str).getInt(getConfigKey(str));
        } catch (Exception unused) {
            return i;
        }
    }

    @Deprecated
    private static String getConfigKey(String str) {
        String[] split = str.split("\\.");
        if (split.length > 0) {
            return split[split.length - 1];
        }
        return null;
    }

    @Deprecated
    public static String[] getArray(String str) {
        return getArray(str, null);
    }

    @Deprecated
    public static String[] getArray(String str, String[] strArr) {
        JSONArray jSONArray;
        try {
            jSONArray = getInstance().getConfigObjectDeepest(str).getJSONArray(getConfigKey(str));
        } catch (Exception unused) {
        }
        if (jSONArray == null) {
            return strArr;
        }
        int length = jSONArray.length();
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = (String) jSONArray.get(i);
        }
        return strArr2;
    }
}
