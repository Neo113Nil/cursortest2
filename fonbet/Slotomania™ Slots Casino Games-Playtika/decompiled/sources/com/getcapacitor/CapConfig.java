package com.getcapacitor;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class CapConfig {
    private JSONObject config;

    public CapConfig(AssetManager assetManager, JSONObject jSONObject) {
        this.config = new JSONObject();
        if (jSONObject != null) {
            this.config = jSONObject;
        } else {
            loadConfig(assetManager);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r0 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void loadConfig(AssetManager assetManager) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(assetManager.open("capacitor.config.json")));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            } catch (JSONException e2) {
                e = e2;
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
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }

    public JSONObject getObject(String str) {
        try {
            return this.config.getJSONObject(str);
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

    public String getString(String str) {
        return getString(str, null);
    }

    public String getString(String str, String str2) {
        String string;
        try {
            string = getConfigObjectDeepest(str).getString(getConfigKey(str));
        } catch (Exception unused) {
        }
        return string == null ? str2 : string;
    }

    public boolean getBoolean(String str, boolean z) {
        try {
            return getConfigObjectDeepest(str).getBoolean(getConfigKey(str));
        } catch (Exception unused) {
            return z;
        }
    }

    public int getInt(String str, int i) {
        try {
            return getConfigObjectDeepest(str).getInt(getConfigKey(str));
        } catch (Exception unused) {
            return i;
        }
    }

    private String getConfigKey(String str) {
        String[] split = str.split("\\.");
        if (split.length > 0) {
            return split[split.length - 1];
        }
        return null;
    }

    public String[] getArray(String str) {
        return getArray(str, null);
    }

    public String[] getArray(String str, String[] strArr) {
        JSONArray jSONArray;
        try {
            jSONArray = getConfigObjectDeepest(str).getJSONArray(getConfigKey(str));
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
