package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;
import defpackage.fc6;
import defpackage.gjc;
import defpackage.zzl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class R5 {
    public static String c;
    public static JSONObject f;
    public static Integer g;
    public static Float h;
    public static final boolean i;
    public static final T5 a = new T5(0, 0, 2.0f);
    public static final Q5 b = new Q5(0, 0);
    public static float d = -1.0f;
    public static boolean e = true;

    static {
        F5.a.getClass();
        i = F5.w();
    }

    public static int a(WindowInsets windowInsets) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        windowInsets.getClass();
        F5.a.getClass();
        if (!F5.t()) {
            return 0;
        }
        Tf a2 = Uf.a(g());
        Insets insets = windowInsets.getInsets(16);
        insets.getClass();
        int ordinal = a2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i4 = insets.left;
                if (i4 == 0) {
                    i5 = insets.bottom;
                    if (i5 == 0) {
                        return 0;
                    }
                }
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    zzl.b();
                    return 0;
                }
                i6 = insets.right;
                if (i6 == 0) {
                    i7 = insets.bottom;
                    if (i7 == 0) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        i2 = insets.left;
        if (i2 == 0) {
            i3 = insets.right;
            if (i3 == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static final void b(WindowInsets windowInsets, Context context) {
        try {
            String insets = windowInsets.getSystemGestureInsets().toString();
            insets.getClass();
            String[] strArr = (String[]) new Regex("Insets").h(insets).toArray(new String[0]);
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr.length > 1) {
                String[] strArr2 = (String[]) new Regex(BlazeDataSourcePersonalizedType.STRING_SEPARATOR).h(new Regex("[^0-9,=a-zA-Z]*").replace(strArr[1], "")).toArray(new String[0]);
                stringBuffer.append("{");
                int length = strArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    String[] strArr3 = (String[]) new Regex(U3.j.b).h(strArr2[i2]).toArray(new String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append("\"" + strArr3[0] + "\"");
                        stringBuffer.append(":");
                        stringBuffer.append(N3.b(((float) Integer.parseInt(strArr3[1])) / b()));
                        if (i2 < strArr2.length - 1) {
                            stringBuffer.append(", ");
                        }
                    }
                }
                stringBuffer.append("}");
            }
            if (stringBuffer.length() > 0) {
                c = stringBuffer.toString();
                ConcurrentHashMap concurrentHashMap = Qa.b;
                context.getClass();
                Pa.a(context, "display_info_store").a("gesture_margin", stringBuffer.toString(), false);
            }
        } catch (Exception unused) {
        }
    }

    public static HashMap c() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("d-device-screen-density", String.valueOf(b()));
            hashMap.put("d-device-screen-size", e());
            hashMap.put("d-density-dependent-screen-size", a());
            hashMap.put("d-orientation", String.valueOf((int) g()));
            Float f2 = h;
            hashMap.put("d-textsize", String.valueOf(f2 != null ? f2.floatValue() : 37.0f));
            return hashMap;
        } catch (Exception e2) {
            e2.getMessage();
            return hashMap;
        }
    }

    public static T5 d() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return a;
        }
        Display a2 = a(context);
        if (a2 == null) {
            return a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a2.getMetrics(displayMetrics);
        float f2 = displayMetrics.density;
        return new T5((int) (displayMetrics.widthPixels / f2), (int) (displayMetrics.heightPixels / f2), f2);
    }

    public static String e() {
        T5 d2 = d();
        return fc6.g(d2.a, d2.b, "X");
    }

    public static Integer f() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return null;
        }
        int i2 = Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", -1);
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return i2 != 2 ? null : 1;
    }

    public static byte g() {
        Display a2;
        Context context = AbstractC3424fj.a;
        if (context == null || (a2 = a(context)) == null) {
            return (byte) 1;
        }
        int rotation = a2.getRotation();
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation != 2) {
            return rotation != 3 ? (byte) 1 : (byte) 4;
        }
        return (byte) 2;
    }

    public static T5 h() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return a;
        }
        Display a2 = a(context);
        if (a2 == null) {
            return a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a2.getRealMetrics(displayMetrics);
        float f2 = displayMetrics.density;
        return new T5((int) (displayMetrics.widthPixels / f2), (int) (displayMetrics.heightPixels / f2), f2);
    }

    public static void i() {
        Context context;
        if (i && f() == null && (context = AbstractC3424fj.a) != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            int i2 = Pa.a(context, "display_info_store").a.getInt("nav_bar_type", -1);
            Integer valueOf = Integer.valueOf(i2);
            g = valueOf;
            if (i2 == -1) {
                valueOf = null;
            }
            g = valueOf;
        }
    }

    public static void j() {
        Context context;
        if (i && (context = AbstractC3424fj.a) != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            JSONObject jSONObject = null;
            String string = Pa.a(context, "display_info_store").a.getString("safe_area", null);
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            f = jSONObject;
            Objects.toString(jSONObject);
        }
    }

    public static final void c(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (e || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(rootWindowInsets, context);
    }

    public static void a(Integer num) {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        AbstractC3424fj.g.submit(new gjc(21, num, context));
    }

    public static void a(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        AbstractC3424fj.g.submit(new gjc(23, linkedHashMap, context));
    }

    public static void a(WindowInsets windowInsets, Context context) {
        windowInsets.getClass();
        if (e) {
            return;
        }
        AbstractC3424fj.g.submit(new gjc(22, windowInsets, context));
    }

    public static Display a(Context context) {
        F5.a.getClass();
        Object systemService = context.getSystemService(U3.i.d);
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        if (displayManager != null) {
            return displayManager.getDisplay(0);
        }
        return null;
    }

    public static String a() {
        Display a2;
        Context context = AbstractC3424fj.a;
        if (context == null || (a2 = a(context)) == null) {
            return "0x0";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a2.getMetrics(displayMetrics);
        return fc6.g(displayMetrics.widthPixels, displayMetrics.heightPixels, "x");
    }

    public static final void a(Map map, Context context) {
        Objects.toString(map);
        if (f == null) {
            f = new JSONObject();
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            JSONObject jSONObject = f;
            if (jSONObject != null) {
                jSONObject.put(String.valueOf(intValue), map.get(Integer.valueOf(intValue)));
            }
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa a2 = Pa.a(context, "display_info_store");
        JSONObject jSONObject2 = f;
        a2.a("safe_area", jSONObject2 != null ? jSONObject2.toString() : null, false);
    }

    public static final void a(Integer num, Context context) {
        g = num;
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Pa.a(context, "display_info_store").a("nav_bar_type", num != null ? num.intValue() : -1, false);
    }

    public static float b() {
        Display a2;
        float f2 = d;
        if (f2 == -1.0f) {
            Context context = AbstractC3424fj.a;
            if (context == null || (a2 = a(context)) == null) {
                return 2.0f;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            a2.getMetrics(displayMetrics);
            f2 = displayMetrics.density;
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return 2.0f;
            }
            d = f2;
        }
        return f2;
    }

    public static Q5 b(Context context) {
        context.getClass();
        Display a2 = a(context);
        if (a2 == null) {
            return b;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a2.getRealMetrics(displayMetrics);
        return new Q5(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
