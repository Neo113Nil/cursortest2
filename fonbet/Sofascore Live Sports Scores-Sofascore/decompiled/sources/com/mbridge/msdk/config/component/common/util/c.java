package com.mbridge.msdk.config.component.common.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.w1l;
import defpackage.ztk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    public static Map<String, Object> a(Map<String, Object> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.mbridge.msdk.config.component.common.express.d dVar = new com.mbridge.msdk.config.component.common.express.d();
        if (map != null && !map.isEmpty()) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry.getKey().equals(c("13"))) {
                        if (entry.getValue() instanceof Map) {
                            linkedHashMap.put(entry.getKey(), b((Map<String, Object>) entry.getValue()));
                        } else {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    } else if (entry.getValue() instanceof String) {
                        linkedHashMap.put(entry.getKey(), dVar.a((String) entry.getValue(), aVar));
                    } else if (entry.getValue() instanceof Map) {
                        linkedHashMap.put(entry.getKey(), a((Map<String, Object>) entry.getValue(), aVar));
                    } else if (entry.getValue() instanceof List) {
                        List list = (List) entry.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (obj instanceof String) {
                                arrayList.add(dVar.a((String) obj, aVar));
                            }
                            if (obj instanceof Map) {
                                arrayList.add(a((Map<String, Object>) obj, aVar));
                            }
                            linkedHashMap.put(entry.getKey(), arrayList);
                        }
                    } else {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th) {
                q0.b("ComponentUtil", th.getMessage(), th);
            }
        }
        return linkedHashMap;
    }

    public static Map<String, Object> b(String str) {
        Map<String, Object> d;
        Map<String, Object> a;
        try {
            com.mbridge.msdk.config.component.database.a a2 = com.mbridge.msdk.config.component.database.a.a();
            if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
                d = a2.d("SELECT * FROM settingDB WHERE appId = '" + str + "'");
                e eVar = new e();
                if (d == null && !d.isEmpty()) {
                    Object obj = d.get(c("data"));
                    if (!(obj instanceof List)) {
                        return null;
                    }
                    List list = (List) obj;
                    if (list.isEmpty()) {
                        return null;
                    }
                    Object obj2 = list.get(0);
                    if (!(obj2 instanceof Map)) {
                        return null;
                    }
                    String valueOf = String.valueOf(((Map) obj2).get("jsonString"));
                    if (TextUtils.isEmpty(valueOf) || (a = eVar.a(valueOf)) == null) {
                        return null;
                    }
                    if (a.isEmpty()) {
                        return null;
                    }
                    return a;
                }
            }
            d = a2.d("SELECT * FROM settingDB WHERE type = 1 ORDER BY timestamp DESC LIMIT 1");
            e eVar2 = new e();
            return d == null ? null : null;
        } catch (Throwable th) {
            q0.b("ComponentUtil", th.getMessage(), th);
            return null;
        }
    }

    public static String c(String str) {
        Object b;
        if (com.mbridge.msdk.config.manager.a.c().b() != null && com.mbridge.msdk.config.manager.a.c().b().b((Object) "cml") != null && (b = com.mbridge.msdk.config.manager.a.c().b().b((Object) "cml")) != null && (b instanceof Map)) {
            String str2 = (String) ((Map) b).get(str);
            if (!TextUtils.isEmpty(str2) && !str2.equalsIgnoreCase("null")) {
                return str2;
            }
        }
        return str;
    }

    public static Map<String, Object> b(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof Map) {
                linkedHashMap.put(entry.getKey(), b((Map<String, Object>) entry.getValue()));
            } else if (entry.getValue() instanceof List) {
                List list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                    if (obj instanceof Map) {
                        arrayList.add(b((Map<String, Object>) obj));
                    }
                    linkedHashMap.put(entry.getKey(), arrayList);
                }
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static void b(String str, String str2) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new ztk(str2, str, 1));
    }

    public static String a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty()) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        String str2 = "{" + key + "}";
                        if (str.contains(str2)) {
                            str = str.replace(str2, value);
                        }
                    }
                }
                return str;
            } catch (Exception e) {
                w1l.v(e, new StringBuilder("Macro replacement error: "), "ComponentUtil");
            }
        }
        return str;
    }

    public static List<View> a(ViewGroup viewGroup, String str) {
        ArrayList arrayList = new ArrayList();
        if (viewGroup == null) {
            return arrayList;
        }
        a(viewGroup, arrayList, str);
        return arrayList;
    }

    private static void a(ViewGroup viewGroup, List<View> list, String str) {
        if (viewGroup == null) {
            return;
        }
        boolean z = false;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (str.equals(childAt.getTag())) {
                z = true;
            } else {
                if (z && childAt.getVisibility() == 0) {
                    list.add(childAt);
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, list, str);
                }
            }
        }
    }

    public static int a(Context context) {
        View findViewById;
        View decorView;
        WindowInsets rootWindowInsets;
        try {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                q0.a("ComponentUtil", "通过资源ID获取状态栏高度: " + dimensionPixelSize + "px");
                return dimensionPixelSize;
            }
        } catch (Exception e) {
            q0.a("ComponentUtil", "通过资源ID获取状态栏高度失败: " + e.getMessage());
        }
        try {
            if ((context instanceof Activity) && (decorView = ((Activity) context).getWindow().getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null) {
                int systemWindowInsetTop = rootWindowInsets.getSystemWindowInsetTop();
                q0.a("ComponentUtil", "通过WindowInsets获取状态栏高度: " + systemWindowInsetTop + "px");
                return systemWindowInsetTop;
            }
        } catch (Exception e2) {
            q0.a("ComponentUtil", "通过WindowInsets获取状态栏高度失败: " + e2.getMessage());
        }
        try {
            if ((context instanceof Activity) && (findViewById = ((Activity) context).findViewById(R.id.content)) != null) {
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                int i = iArr[1];
                q0.a("ComponentUtil", "通过content view获取状态栏高度: " + i + "px");
                return i;
            }
        } catch (Exception e3) {
            q0.a("ComponentUtil", "通过content view获取状态栏高度失败: " + e3.getMessage());
        }
        int i2 = (int) (context.getResources().getDisplayMetrics().density * 24.0f);
        q0.d("ComponentUtil", "所有方法都失败，使用默认状态栏高度: " + i2 + "px");
        return i2;
    }

    public static void a(Map<String, Object> map, Map<String, Object> map2) {
        if (map2 == null) {
            return;
        }
        try {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (map.containsKey(key)) {
                    Object obj = map.get(key);
                    if ((obj instanceof Map) && (value instanceof Map)) {
                        a((Map<String, Object>) obj, (Map<String, Object>) value);
                    } else {
                        map.put(key, value);
                    }
                } else {
                    map.put(key, value);
                }
            }
        } catch (Throwable th) {
            q0.b("ComponentUtil", th.getMessage(), th);
        }
    }

    public static boolean a(int i) {
        return i == 301 || i == 302 || i == 303 || i == 307 || i == 308;
    }

    public static Map<String, Object> a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    hashMap.put(entry.getKey(), a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) entry.getValue()).b()));
                } else if (entry.getValue() instanceof Map) {
                    hashMap.put(entry.getKey(), a((Map<String, Object>) entry.getValue()));
                } else {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return hashMap;
        } catch (Throwable th) {
            q0.b("ComponentUtil", th.getMessage(), th);
            return hashMap;
        }
    }

    public static String a() {
        String str;
        try {
            str = UUID.randomUUID().toString() + System.currentTimeMillis();
        } catch (Throwable th) {
            q0.a("ComponentUtil", th.getMessage(), th);
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return System.currentTimeMillis() + "";
    }

    public static com.mbridge.msdk.config.dynamic.binddata.wrapper.a a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\.");
        for (int i = 0; i < split.length - 1; i++) {
            if (!aVar.a((Object) split[i])) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
                aVar2.b(aVar.c());
                aVar.a(split[i], aVar2);
            }
            Object b = aVar.b((Object) split[i]);
            if (b instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) aVar.b((Object) split[i]);
            }
            if (b instanceof Map) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar3 = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
                aVar3.a((Map<? extends String, ?>) b);
                aVar.a(split[i], aVar3);
                aVar = aVar3;
            }
        }
        return aVar;
    }

    public static String a(String str) {
        com.mbridge.msdk.config.component.database.a a;
        try {
            a = com.mbridge.msdk.config.component.database.a.a();
        } catch (Throwable th) {
            q0.b("ComponentUtil", th.getMessage(), th);
        }
        if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
            Map<String, Object> d = a.d("SELECT * FROM settingDB WHERE appId = '" + str + "'");
            if (d != null && !d.isEmpty()) {
                Object obj = d.get(c("data"));
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        Object obj2 = list.get(0);
                        if (obj2 instanceof Map) {
                            String valueOf = String.valueOf(((Map) obj2).get("jsonString"));
                            if (!TextUtils.isEmpty(valueOf)) {
                                return valueOf;
                            }
                        }
                    }
                }
            }
            return "";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Map<String, Object> d = com.mbridge.msdk.config.component.database.a.a().d("SELECT * FROM settingDB WHERE appID = '" + str2 + "' AND type = 1");
            String replaceAll = str.replaceAll("'", "''");
            long currentTimeMillis = System.currentTimeMillis();
            if (d != null && !d.isEmpty()) {
                Object obj = d.get("data");
                if ((obj instanceof List) && ((List) obj).size() > 0) {
                    com.mbridge.msdk.config.component.database.a.a().c("UPDATE settingDB SET appID ='" + str2 + "', unitID = '',  type = 1, timestamp = " + currentTimeMillis + " , jsonString = '" + replaceAll + "' WHERE appID = '" + str2 + "'");
                    return;
                }
            }
            com.mbridge.msdk.config.component.database.a.a().c("INSERT INTO settingDB (appID, unitID, type, timestamp, jsonString) VALUES ('" + str2 + "','',1," + currentTimeMillis + ",'" + replaceAll + "')");
        } catch (Throwable th) {
            q0.b("ComponentUtil", "update component appSetting error: " + th.getMessage(), th);
        }
    }

    public static int a(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            String valueOf = String.valueOf(obj);
            if (valueOf.equalsIgnoreCase("null")) {
                return -1;
            }
            try {
                return Integer.parseInt(valueOf);
            } catch (Throwable th) {
                q0.b("ComponentUtil", th.getMessage());
                return -1;
            }
        } catch (Throwable th2) {
            q0.b("ComponentUtil", th2.getMessage());
            return -1;
        }
    }
}
