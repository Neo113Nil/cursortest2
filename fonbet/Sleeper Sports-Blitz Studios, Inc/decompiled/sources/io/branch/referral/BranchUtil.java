package io.branch.referral;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import io.radar.sdk.RadarTrackingOptions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.jar.JarFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class BranchUtil {
    private static boolean isCustomDebugEnabled_ = false;
    private static Boolean isManifestTestModeEnabled = null;
    private static boolean isTestModeEnabled_ = false;
    private static PluginType pluginType;
    private static String pluginVersion;

    public enum PluginType {
        CordovaIonic,
        PhoneGap,
        Unity,
        Corona,
        Xamarin,
        ReactNative,
        Titanium,
        mParticle,
        AdobeLaunch,
        AdobeLaunchMobileUI,
        Segment
    }

    static void shutDown() {
        isCustomDebugEnabled_ = false;
        isTestModeEnabled_ = false;
        isManifestTestModeEnabled = null;
    }

    static boolean checkTestMode(Context context) {
        if (!isTestModeEnabled_ && isManifestTestModeEnabled == null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo.metaData != null && applicationInfo.metaData.containsKey("io.branch.sdk.TestMode")) {
                    isTestModeEnabled_ = applicationInfo.metaData.getBoolean("io.branch.sdk.TestMode", false);
                } else {
                    Resources resources = context.getResources();
                    isTestModeEnabled_ = Boolean.parseBoolean(resources.getString(resources.getIdentifier("io.branch.sdk.TestMode", "string", context.getPackageName())));
                }
            } catch (Exception unused) {
            }
            isManifestTestModeEnabled = Boolean.valueOf(isTestModeEnabled_);
        }
        return isTestModeEnabled_;
    }

    public static String readBranchKey(Context context) {
        String str = isTestModeEnabled() ? "io.branch.sdk.BranchKey.test" : "io.branch.sdk.BranchKey";
        String str2 = null;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null && (str2 = applicationInfo.metaData.getString(str)) == null && isTestModeEnabled()) {
                str2 = applicationInfo.metaData.getString("io.branch.sdk.BranchKey");
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            Resources resources = context.getResources();
            return resources.getString(resources.getIdentifier(str, "string", context.getPackageName()));
        } catch (Exception unused2) {
            return str2;
        }
    }

    public static boolean isTestModeEnabled() {
        return isTestModeEnabled_;
    }

    static void setTestMode(boolean z) {
        isTestModeEnabled_ = z;
    }

    public static boolean isDebugEnabled() {
        return isCustomDebugEnabled_ || isTestModeEnabled();
    }

    static void setDebugMode(boolean z) {
        isCustomDebugEnabled_ = z;
    }

    static JSONObject formatLinkParam(JSONObject jSONObject) {
        return addSource(jSONObject);
    }

    static JSONObject addSource(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("source", "android");
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public static class JsonReader {
        private final JSONObject jsonObject;

        public JsonReader(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.jsonObject = jSONObject2;
        }

        public JSONObject getJsonObject() {
            return this.jsonObject;
        }

        public int readOutInt(String str) {
            int optInt = this.jsonObject.optInt(str);
            this.jsonObject.remove(str);
            return optInt;
        }

        public Integer readOutInt(String str, Integer num) {
            if (!this.jsonObject.has(str)) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.jsonObject.optInt(str));
            this.jsonObject.remove(str);
            return valueOf;
        }

        public String readOutString(String str) {
            String optString = this.jsonObject.optString(str);
            this.jsonObject.remove(str);
            return optString;
        }

        public String readOutString(String str, String str2) {
            String optString = this.jsonObject.optString(str, str2);
            this.jsonObject.remove(str);
            return optString;
        }

        public long readOutLong(String str) {
            long optLong = this.jsonObject.optLong(str);
            this.jsonObject.remove(str);
            return optLong;
        }

        public double readOutDouble(String str) {
            double optDouble = this.jsonObject.optDouble(str);
            this.jsonObject.remove(str);
            return optDouble;
        }

        public Double readOutDouble(String str, Double d) {
            if (!this.jsonObject.has(str)) {
                return d;
            }
            Double valueOf = Double.valueOf(this.jsonObject.optDouble(str));
            this.jsonObject.remove(str);
            return valueOf;
        }

        public boolean readOutBoolean(String str) {
            boolean optBoolean = this.jsonObject.optBoolean(str);
            this.jsonObject.remove(str);
            return optBoolean;
        }

        public JSONArray readOutJsonArray(String str) {
            JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
            this.jsonObject.remove(str);
            return optJSONArray;
        }

        public Object readOut(String str) {
            Object opt = this.jsonObject.opt(str);
            this.jsonObject.remove(str);
            return opt;
        }

        public boolean has(String str) {
            return this.jsonObject.has(str);
        }

        public Iterator<String> keys() {
            return this.jsonObject.keys();
        }
    }

    public static Drawable getDrawable(Context context, int i) {
        return context.getResources().getDrawable(i, context.getTheme());
    }

    public static int dpToPx(Context context, int i) {
        return Math.round(i * (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public static boolean isLowOnMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject getDeepLinkSchemes(Context context) {
        JarFile jarFile;
        Throwable th;
        InputStream inputStream;
        JSONObject jSONObject = null;
        try {
            if (!isLowOnMemory(context)) {
                try {
                    jarFile = new JarFile(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).publicSourceDir);
                    try {
                        inputStream = jarFile.getInputStream(jarFile.getEntry("AndroidManifest.xml"));
                        try {
                            byte[] bArr = new byte[inputStream.available()];
                            inputStream.read(bArr);
                            jSONObject = new ApkParser().decompressXMLForValidator(bArr);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (Exception unused) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                    throw th;
                                }
                            }
                            if (jarFile != null) {
                                jarFile.close();
                            }
                            throw th;
                        }
                    } catch (Exception unused3) {
                        inputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                } catch (Exception unused4) {
                    inputStream = null;
                    jarFile = null;
                } catch (Throwable th4) {
                    jarFile = null;
                    th = th4;
                    inputStream = null;
                }
                jarFile.close();
            }
        } catch (IOException unused5) {
        }
        return jSONObject;
    }

    public static String getPluginVersion() {
        return pluginVersion;
    }

    public static void setPluginVersion(String str) {
        pluginVersion = str;
    }

    public static PluginType getPluginType() {
        return pluginType;
    }

    public static void setPluginType(PluginType pluginType2) {
        pluginType = pluginType2;
    }
}
