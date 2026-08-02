package com.safedk.android.utils;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class j {
    public static final String a = "sdk_key";
    public static final String b = "userUUID";
    public static final String c = "configuration";
    public static final String d = "last_reported_device_at";
    public static final String e = "last_reported_version";
    public static final String f = "configETag";
    public static final String g = "sdk_version";
    public static final String h = "versionCode";
    public static final String i = "randomToken";
    public static final int j = -1;
    public static final String k = "";
    private static final String l = "SharedPreferencesUtils";
    private static final String m = "offlineMode";
    private static final String n = "age";
    private static final String o = "region";
    private static final String p = "last_foreground_time";
    private static final String q = "last_foreground_report";
    private static final String r = "sdk_versions";
    private static final String s = "is_reported";
    private static final String w = "safedk_stored_version";
    private static final String x = "§§";
    private final SharedPreferences t;
    private boolean u;
    private JSONObject v;

    public j(SharedPreferences sharedPreferences, boolean z) {
        this.t = sharedPreferences;
        this.u = z;
    }

    private void a(Map<String, String> map) {
        try {
            this.v = new JSONObject(this.t.getString(r, JsonUtils.EMPTY_JSON));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(key);
                Logger.d(l, "addDiscoveredVersionsToVersionsJson sdkPackage=", key, ", version=", value, ", uuid=", sdkUUIDByPackage);
                if (sdkUUIDByPackage != null) {
                    try {
                    } catch (JSONException e2) {
                        Logger.d(l, "error in addDiscoveredVersionsToVersionsJson", e2);
                    }
                    if (sdkUUIDByPackage.length() > 0 && value != null && value.length() > 0) {
                        this.v.put(sdkUUIDByPackage, value);
                    }
                }
                Logger.d(l, "UUID for sdkPackage ", key, "is empty and will not be added to sdkVersionsJson");
            }
            a(this.v);
        } catch (Throwable th) {
            Logger.e(l, "Exception in addDiscoveredVersionsToVersionsJson", th);
        }
    }

    private void a(JSONObject jSONObject) {
        SharedPreferences.Editor edit = this.t.edit();
        edit.putString(r, jSONObject.toString());
        Logger.d(l, "saveSdkVersions saved (", Integer.valueOf(jSONObject.length()), " items) : ", jSONObject.toString());
        edit.apply();
    }

    public String a() {
        return this.t.getString(b, null);
    }

    public boolean b() {
        return this.t.getBoolean(m, this.u);
    }

    public Integer c() {
        int i2 = this.t.getInt("age", -1);
        if (i2 < 0) {
            return null;
        }
        return new Integer(i2);
    }

    public String d() {
        return this.t.getString("region", null);
    }

    public Bundle e() {
        Logger.d(l, "getConfiguration started");
        return a(this.t, c);
    }

    public long f() {
        return this.t.getLong(d, 0L);
    }

    public int g() {
        return this.t.getInt(e, 0);
    }

    public long h() {
        return this.t.getLong(p, 0L);
    }

    public long i() {
        return this.t.getLong(q, 0L);
    }

    public JSONObject j() {
        return this.v;
    }

    public void a(long j2) {
        SharedPreferences.Editor edit = this.t.edit();
        edit.putLong(p, j2);
        edit.apply();
    }

    public String k() {
        return this.t.getString(f, null);
    }

    public void a(String str) {
        SharedPreferences.Editor edit = this.t.edit();
        edit.putString(b, str);
        edit.apply();
    }

    public boolean l() {
        return this.t.contains(c);
    }

    public void a(Bundle bundle) {
        try {
            SharedPreferences.Editor edit = this.t.edit();
            String p2 = p();
            String a2 = a();
            edit.clear();
            a(edit, c, bundle);
            if (p2 != null) {
                edit.putString(w, p2);
            }
            if (a2 != null) {
                edit.putString(b, a2);
            }
            edit.apply();
        } catch (Throwable th) {
            Logger.e(l, "Caught exception : ", th.getMessage(), th);
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, Bundle bundle) {
        String str2 = str + x;
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj == null) {
                editor.remove(str2 + str3);
            } else if (obj instanceof Integer) {
                editor.putInt(str2 + str3, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str2 + str3, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                editor.putBoolean(str2 + str3, ((Boolean) obj).booleanValue());
            } else if (obj instanceof CharSequence) {
                editor.putString(str2 + str3, ((CharSequence) obj).toString());
            } else {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 0 && (arrayList.get(0) instanceof String)) {
                        editor.putStringSet(str2 + str3, new HashSet(arrayList));
                    }
                }
                if (obj instanceof Bundle) {
                    a(editor, str2 + str3, (Bundle) obj);
                }
            }
        }
    }

    public static Bundle a(SharedPreferences sharedPreferences, String str) {
        Logger.d(l, "loadPreferencesBundle started, key=", str);
        Bundle bundle = new Bundle();
        Map<String, ?> all = sharedPreferences.getAll();
        String str2 = str + x;
        HashSet<String> hashSet = new HashSet();
        for (String str3 : all.keySet()) {
            if (str3.startsWith(str2)) {
                String b2 = b(str3, str2);
                if (!b2.contains(x)) {
                    Object obj = all.get(str3);
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            bundle.putInt(b2, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(b2, ((Long) obj).longValue());
                        } else if (obj instanceof Boolean) {
                            bundle.putBoolean(b2, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof CharSequence) {
                            bundle.putString(b2, ((CharSequence) obj).toString());
                        } else if (obj instanceof HashSet) {
                            bundle.putStringArrayList(b2, new ArrayList<>((HashSet) obj));
                        }
                    }
                } else {
                    hashSet.add(a(b2, x));
                }
            }
        }
        for (String str4 : hashSet) {
            bundle.putBundle(str4, a(sharedPreferences, str2 + str4));
        }
        return bundle;
    }

    public static String a(String str, String str2) {
        if (b(str) || str2 == null) {
            return str;
        }
        if (str2.length() == 0) {
            return "";
        }
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public static String b(String str, String str2) {
        if (b(str) || b(str2)) {
            return str;
        }
        if (str.startsWith(str2)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public void a(int i2, String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.t.edit();
            edit.putInt(h, i2);
            edit.putString(i, str);
            edit.putString("sdk_key", str2);
            Logger.d(l, "save sdk key ", str2, ", token ", str, ", version code ", Integer.valueOf(i2));
            edit.apply();
        } catch (Throwable th) {
            Logger.d(l, "Caught exception", th);
        }
    }

    public String m() {
        String string = this.t.getString("sdk_key", null);
        Logger.d(l, "read sdk key ", string);
        return string;
    }

    public int n() {
        int i2 = this.t.getInt(h, 0);
        Logger.d(l, "read version code ", Integer.valueOf(i2));
        return i2;
    }

    public String o() {
        String string = this.t.getString(i, null);
        Logger.d(l, "read token ", string);
        return string;
    }

    public void c(String str) {
        SharedPreferences.Editor edit = this.t.edit();
        edit.putString(w, str);
        edit.apply();
    }

    public String p() {
        return this.t.getString(w, null);
    }
}
