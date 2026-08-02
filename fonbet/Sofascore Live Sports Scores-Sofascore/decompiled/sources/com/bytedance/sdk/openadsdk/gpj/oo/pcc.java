package com.bytedance.sdk.openadsdk.gpj.oo;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.sf;
import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.ork;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.bf3;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public static HashSet<String> pcc = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.gpj.oo.pcc.1
        {
            add(MBridgeConstans.APP_ID);
            add("extra_data");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> sf;

    private static void gm(String str) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = sf;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(sf(str))) == null) {
            return;
        }
        map.clear();
    }

    private static <T> void pcc(String str, String str2, T t) {
        String pcc2 = pcc(lu.pcc(), str, str2);
        if (ork.qf(pcc2)) {
            if (t.equals(sf(pcc2, str2))) {
                return;
            }
            sf.gm sf2 = sf.pcc(lu.pcc(), sf(pcc2)).sf();
            pcc(sf2, str2, (Object) t);
            sf2.apply();
            sf(pcc2, str2, t);
            return;
        }
        SharedPreferences pcc3 = pcc(lu.pcc(), sf(pcc2));
        if (pcc3 == null || t.equals(sf(pcc2, str2))) {
            return;
        }
        SharedPreferences.Editor edit = pcc3.edit();
        pcc(edit, str2, t);
        edit.apply();
        sf(pcc2, str2, t);
    }

    private static void sf(Context context, String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        try {
            String pcc2 = pcc(context, str, str2);
            if (ork.qf(pcc2)) {
                sf.pcc(context, pcc2).sf().remove(str2).apply();
                return;
            }
            SharedPreferences pcc3 = pcc(context, pcc2);
            if (pcc3 == null) {
                return;
            }
            SharedPreferences.Editor edit = pcc3.edit();
            edit.remove(str2);
            edit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = sf;
            if (softReference != null && (concurrentHashMap = softReference.get()) != null && (map = concurrentHashMap.get(sf(pcc2))) != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static String sf(String str, String str2, String str3) {
        return pcc() ? str3 : pcc(lu.pcc(), sf(str), str2, str3);
    }

    private static String sf(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    private static void sf(Context context, String str) {
        String pcc2 = pcc(lu.pcc(), str, "");
        if (ork.qf(pcc2)) {
            sf.pcc(context, pcc2).sf().clear().apply();
            gm(pcc2);
            return;
        }
        SharedPreferences pcc3 = pcc(context, pcc2);
        if (pcc3 == null) {
            return;
        }
        SharedPreferences.Editor edit = pcc3.edit();
        edit.clear();
        edit.apply();
        gm(pcc2);
    }

    private static boolean pcc() {
        return lu.pcc() == null;
    }

    public static void pcc(String str, String str2, Boolean bool) {
        if (pcc()) {
            return;
        }
        pcc(sf(str), str2, bool);
    }

    private static Object sf(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = sf;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(sf(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    public static void pcc(String str, String str2, Long l) {
        if (pcc()) {
            return;
        }
        pcc(sf(str), str2, l);
    }

    public static void pcc(String str, String str2, String str3) {
        if (pcc()) {
            return;
        }
        pcc(sf(str), str2, str3);
    }

    private static void sf(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = sf;
        if (softReference == null || softReference.get() == null) {
            sf = new SoftReference<>(new ConcurrentHashMap());
        }
        String sf2 = sf(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = sf.get();
        if (concurrentHashMap == null) {
            return;
        }
        Map<String, Object> map = concurrentHashMap.get(sf2);
        if (map == null) {
            map = new HashMap<>();
            concurrentHashMap.put(sf2, map);
        }
        map.put(str2, obj);
    }

    public static void pcc(String str, String str2, Integer num) {
        if (pcc()) {
            return;
        }
        pcc(sf(str), str2, num);
    }

    public static int pcc(String str, String str2, int i) {
        return pcc() ? i : pcc(lu.pcc(), sf(str), str2, i);
    }

    private static int pcc(Context context, String str, String str2, int i) {
        String pcc2 = pcc(context, str, str2);
        if (ork.qf(pcc2)) {
            return sf.pcc(context, pcc2).pcc(str2, i);
        }
        SharedPreferences pcc3 = pcc(context, pcc2);
        return pcc3 == null ? i : pcc3.getInt(str2, i);
    }

    public static boolean pcc(String str, String str2, boolean z) {
        return pcc() ? z : pcc(lu.pcc(), sf(str), str2, z);
    }

    private static boolean pcc(Context context, String str, String str2, boolean z) {
        String pcc2 = pcc(context, str, str2);
        if (ork.qf(pcc2)) {
            return sf.pcc(context, pcc2).pcc(str2, z);
        }
        SharedPreferences pcc3 = pcc(context, pcc2);
        return pcc3 == null ? z : pcc3.getBoolean(str2, z);
    }

    public static long pcc(String str, String str2, long j) {
        return pcc() ? j : pcc(lu.pcc(), sf(str), str2, j);
    }

    private static long pcc(Context context, String str, String str2, long j) {
        String pcc2 = pcc(context, str, str2);
        if (ork.qf(pcc2)) {
            return sf.pcc(context, pcc2).pcc(str2, j);
        }
        SharedPreferences pcc3 = pcc(context, pcc2);
        return pcc3 == null ? j : pcc3.getLong(str2, j);
    }

    private static String pcc(Context context, String str, String str2, String str3) {
        String pcc2 = pcc(context, str, str2);
        if (ork.qf(pcc2)) {
            return sf.pcc(context, pcc2).pcc(str2, str3);
        }
        SharedPreferences pcc3 = pcc(context, pcc2);
        return pcc3 == null ? str3 : pcc3.getString(str2, str3);
    }

    public static void pcc(String str, String str2) {
        if (pcc()) {
            return;
        }
        try {
            sf(lu.pcc(), sf(str), str2);
        } catch (Throwable unused) {
        }
    }

    public static void pcc(String str) {
        if (pcc()) {
            return;
        }
        try {
            sf(lu.pcc(), sf(str));
        } catch (Throwable unused) {
        }
    }

    private static String pcc(Context context, String str, String str2) {
        if (pcc.contains(str2)) {
            str = "pag_sp_bad_par";
        }
        if (fum.pcc(context)) {
            return str;
        }
        StringBuilder p = bf3.p(str, "_");
        p.append(fum.gm(context));
        return p.toString();
    }

    @Nullable
    public static SharedPreferences pcc(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(sf(str), 0);
        } catch (Throwable th) {
            lo.gm("TTAD.TTSaveHelper", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void pcc(sf.gm gmVar, String str, T t) {
        if (t instanceof Integer) {
            gmVar.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            gmVar.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            gmVar.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            gmVar.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            gmVar.putString(str, (String) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void pcc(SharedPreferences.Editor editor, String str, T t) {
        if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            editor.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            editor.putString(str, (String) t);
        }
    }
}
