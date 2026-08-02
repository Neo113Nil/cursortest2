package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzguz;
import defpackage.pyh;
import defpackage.sgo;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbs {
    public static JSONObject a(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int b(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }

    public static boolean zza(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.y4)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.z4)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:3|4|5|(5:8|9|10|11|6)|57|58|(1:60)(1:63)|61|14|(11:49|50|17|18|19|(2:21|(6:25|26|27|(3:36|37|(1:39))|29|(2:31|32)))(2:43|(6:45|46|27|(0)|29|(0)))|42|27|(0)|29|(0))|16|17|18|19|(0)(0)|42|27|(0)|29|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0162, code lost:
    
        r2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject zzb(Context context, @Nullable View view) {
        int i;
        ViewParent parent;
        String str;
        int hashCode;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view != null) {
            int i2 = 1;
            try {
                int[] zzg = zzg(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i = i2;
                    try {
                        iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                        iArr[i] = Math.min(viewGroup.getMeasuredHeight(), iArr[i]);
                        parent2 = parent2.getParent();
                        i2 = i;
                    } catch (Exception unused) {
                        int i3 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                        }
                        str = "";
                        hashCode = str.hashCode();
                        if (hashCode == -2066603854) {
                        }
                        jSONObject2.put("native_template_type", 0);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n9)).booleanValue()) {
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r9)).booleanValue()) {
                        }
                        return jSONObject2;
                    }
                }
                i = i2;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view.getMeasuredWidth()));
                jSONObject3.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view.getMeasuredHeight()));
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[0]));
                jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[i]));
                jSONObject3.put("maximum_visible_width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[0]));
                jSONObject3.put("maximum_visible_height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[i]));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put("frame", jSONObject3);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = a(context, rect);
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("width", 0);
                    jSONObject4.put("height", 0);
                    jSONObject4.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[0]));
                    jSONObject4.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[i]));
                    jSONObject4.put("relative_to", "window");
                    jSONObject = jSONObject4;
                }
                jSONObject2.put("visible_bounds", jSONObject);
            } catch (Exception unused2) {
                i = i2;
            }
            parent = view.getParent();
            if (parent != null) {
                try {
                    str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
                } catch (IllegalAccessException e) {
                    e = e;
                    int i4 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                    jSONObject2.put("native_template_type", 0);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n9)).booleanValue()) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r9)).booleanValue()) {
                    }
                    return jSONObject2;
                } catch (NoSuchMethodException unused3) {
                } catch (SecurityException e2) {
                    e = e2;
                    int i42 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                    jSONObject2.put("native_template_type", 0);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n9)).booleanValue()) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r9)).booleanValue()) {
                    }
                    return jSONObject2;
                } catch (InvocationTargetException e3) {
                    e = e3;
                    int i422 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                    jSONObject2.put("native_template_type", 0);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n9)).booleanValue()) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r9)).booleanValue()) {
                    }
                    return jSONObject2;
                }
                hashCode = str.hashCode();
                if (hashCode == -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        jSONObject2.put("native_template_type", 2);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n9)).booleanValue()) {
                            try {
                                if (view.getLayoutParams() != null) {
                                    jSONObject2.put("view_width_layout_type", b(r0.width) - 1);
                                    jSONObject2.put("view_height_layout_type", b(r0.height) - 1);
                                }
                            } catch (Exception unused4) {
                                zze.zza("Unable to get native ad view layout types");
                            }
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r9)).booleanValue()) {
                            try {
                                jSONObject2.put("alpha", view.getAlpha());
                            } catch (JSONException e4) {
                                int i5 = zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log container view alpha signal to JSON", e4);
                            }
                        }
                    }
                } else if (str.equals("small_template")) {
                    jSONObject2.put("native_template_type", i);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n9)).booleanValue()) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r9)).booleanValue()) {
                    }
                }
                jSONObject2.put("native_template_type", 0);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n9)).booleanValue()) {
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r9)).booleanValue()) {
                }
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode == -2066603854) {
            }
            jSONObject2.put("native_template_type", 0);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n9)).booleanValue()) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r9)).booleanValue()) {
            }
        }
        return jSONObject2;
    }

    public static JSONObject zzc(@Nullable View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.j9)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.k9)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        jSONObject.put("contained_in_scroll_view", zzs.zzA(view) != 0);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.l9)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        jSONObject.put("scroll_view_type", zzs.zzA(view));
                        return jSONObject;
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject zzd(Context context, @Nullable View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("can_show_on_lock_screen", zzs.zzo(view));
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("is_keyguard_locked", zzs.zzG(context));
                return jSONObject;
            } catch (JSONException unused) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject zze(Context context, @Nullable Map map, @Nullable Map map2, @Nullable View view, @Nullable ImageView.ScaleType scaleType) {
        String str;
        String str2;
        Iterator it;
        JSONObject jSONObject;
        ViewGroup.LayoutParams layoutParams;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] zzg = zzg(view);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] zzg2 = zzg(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    int[] iArr = zzg;
                    try {
                        it = it2;
                        try {
                            jSONObject4.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view2.getMeasuredWidth()));
                            jSONObject4.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[0] - iArr[0]));
                            jSONObject4.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[1] - iArr[1]));
                            jSONObject4.put(str4, str3);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = a(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[0] - iArr[0]));
                                jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[1] - iArr[1]));
                                jSONObject.put(str4, str3);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.m9)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n9)).booleanValue() && (layoutParams = view2.getLayoutParams()) != null) {
                                    jSONObject3.put("view_width_layout_type", b(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", b(layoutParams.height) - 1);
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q9)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    int i = zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get asset views information");
                                    it2 = it;
                                    zzg = iArr;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r9)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        it = it2;
                    }
                    it2 = it;
                    zzg = iArr;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject zzf(@Nullable String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point2.x));
                jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point2.y));
                jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point.x));
                jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e2) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while putting signals into JSON object.", e2);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            jSONObject2 = jSONObject;
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static int[] zzg(@Nullable View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zzh(MotionEvent motionEvent, @Nullable View view) {
        int[] zzg = zzg(view);
        return new Point(((int) motionEvent.getRawX()) - zzg[0], ((int) motionEvent.getRawY()) - zzg[1]);
    }

    public static boolean zzi(Context context, zzfld zzfldVar) {
        pyh pyhVar;
        if (!zzfldVar.N) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s9)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v9)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t9);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        zzguz a = zzguz.a(new sgo(';'));
        Iterator i = a.c.i(a, str);
        do {
            pyhVar = (pyh) i;
            if (!pyhVar.hasNext()) {
                return false;
            }
        } while (!((String) pyhVar.next()).equals(packageName));
        return true;
    }

    @Nullable
    public static JSONObject zzj(Context context) {
        JSONObject jSONObject = new JSONObject();
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzv = zzs.zzv((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzv.widthPixels));
            jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzv.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams zzk() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u9)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }
}
