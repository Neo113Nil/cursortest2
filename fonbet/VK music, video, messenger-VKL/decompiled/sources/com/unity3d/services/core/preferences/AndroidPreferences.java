package com.unity3d.services.core.preferences;

import android.content.SharedPreferences;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.vk.core.preference.Preference;
import xsna.t33;

/* loaded from: classes14.dex */
public class AndroidPreferences {
    public static Boolean getBoolean(String str, String str2) {
        SharedPreferences h = Preference.h(ClientProperties.getApplicationContext(), 0, str);
        if (h.contains(str2)) {
            try {
                return Boolean.valueOf(h.getBoolean(str2, false));
            } catch (ClassCastException e) {
                StringBuilder a = t33.a("Unity Ads failed to cast ", str2, ": ");
                a.append(e.getMessage());
                DeviceLog.warning(a.toString());
            }
        }
        return null;
    }

    public static Float getFloat(String str, String str2) {
        SharedPreferences h = Preference.h(ClientProperties.getApplicationContext(), 0, str);
        if (h.contains(str2)) {
            try {
                return Float.valueOf(h.getFloat(str2, Float.NaN));
            } catch (ClassCastException e) {
                StringBuilder a = t33.a("Unity Ads failed to cast ", str2, ": ");
                a.append(e.getMessage());
                DeviceLog.warning(a.toString());
            }
        }
        return null;
    }

    public static Integer getInteger(String str, String str2) {
        SharedPreferences h = Preference.h(ClientProperties.getApplicationContext(), 0, str);
        if (h.contains(str2)) {
            try {
                return Integer.valueOf(h.getInt(str2, -1));
            } catch (ClassCastException e) {
                StringBuilder a = t33.a("Unity Ads failed to cast ", str2, ": ");
                a.append(e.getMessage());
                DeviceLog.warning(a.toString());
            }
        }
        return null;
    }

    public static Long getLong(String str, String str2) {
        SharedPreferences h = Preference.h(ClientProperties.getApplicationContext(), 0, str);
        if (h.contains(str2)) {
            try {
                return Long.valueOf(h.getLong(str2, -1L));
            } catch (ClassCastException e) {
                StringBuilder a = t33.a("Unity Ads failed to cast ", str2, ": ");
                a.append(e.getMessage());
                DeviceLog.warning(a.toString());
            }
        }
        return null;
    }

    public static String getString(String str, String str2) {
        SharedPreferences h = Preference.h(ClientProperties.getApplicationContext(), 0, str);
        if (h.contains(str2)) {
            try {
                return h.getString(str2, "");
            } catch (ClassCastException e) {
                StringBuilder a = t33.a("Unity Ads failed to cast ", str2, ": ");
                a.append(e.getMessage());
                DeviceLog.warning(a.toString());
            }
        }
        return null;
    }

    public static boolean hasKey(String str, String str2) {
        return Preference.h(ClientProperties.getApplicationContext(), 0, str).contains(str2);
    }

    public static void removeKey(String str, String str2) {
        SharedPreferences.Editor edit = Preference.h(ClientProperties.getApplicationContext(), 0, str).edit();
        edit.remove(str2);
        edit.commit();
    }

    public static void setBoolean(String str, String str2, Boolean bool) {
        SharedPreferences.Editor edit = Preference.h(ClientProperties.getApplicationContext(), 0, str).edit();
        edit.putBoolean(str2, bool.booleanValue());
        edit.commit();
    }

    public static void setFloat(String str, String str2, Double d) {
        SharedPreferences.Editor edit = Preference.h(ClientProperties.getApplicationContext(), 0, str).edit();
        edit.putFloat(str2, d.floatValue());
        edit.commit();
    }

    public static void setInteger(String str, String str2, Integer num) {
        SharedPreferences.Editor edit = Preference.h(ClientProperties.getApplicationContext(), 0, str).edit();
        edit.putInt(str2, num.intValue());
        edit.commit();
    }

    public static void setLong(String str, String str2, Long l) {
        SharedPreferences.Editor edit = Preference.h(ClientProperties.getApplicationContext(), 0, str).edit();
        edit.putLong(str2, l.longValue());
        edit.commit();
    }

    public static void setString(String str, String str2, String str3) {
        SharedPreferences.Editor edit = Preference.h(ClientProperties.getApplicationContext(), 0, str).edit();
        edit.putString(str2, str3);
        edit.commit();
    }
}
