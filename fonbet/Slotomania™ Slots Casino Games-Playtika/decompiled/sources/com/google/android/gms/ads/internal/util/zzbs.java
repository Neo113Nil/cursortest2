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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.braze.models.inappmessage.InAppMessageBase;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzfjt;
import com.google.android.gms.internal.ads.zzgsk;
import com.google.android.gms.internal.ads.zzgtl;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nonnull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzbs {
    public static boolean zza(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeq)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzer)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(7:4|5|(5:8|9|10|11|6)|65|66|(1:68)(1:71)|69)|14|(7:57|58|17|18|19|20|(10:22|(8:26|27|(2:29|(1:31)(1:49))(1:50)|32|33|(3:42|43|(1:45))|35|(2:37|38))|51|27|(0)(0)|32|33|(0)|35|(0))(10:52|(8:54|27|(0)(0)|32|33|(0)|35|(0))|51|27|(0)(0)|32|33|(0)|35|(0)))|16|17|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0173, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0174, code lost:
    
        r3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016d A[Catch: JSONException -> 0x0173, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0173, blocks: (B:19:0x0137, B:31:0x0164, B:49:0x0168, B:50:0x016d), top: B:18:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject zzb(Context context, View view) {
        int i;
        ViewParent parent;
        String str;
        int hashCode;
        int i2;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view != null) {
            int i3 = 1;
            try {
                int[] zzg = zzg(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i = i3;
                    try {
                        iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                        iArr[i] = Math.min(viewGroup.getMeasuredHeight(), iArr[i]);
                        parent2 = parent2.getParent();
                        i3 = i;
                    } catch (Exception unused) {
                        int i4 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                        }
                        str = "";
                        hashCode = str.hashCode();
                        if (hashCode == -2066603854) {
                        }
                    }
                }
                i = i3;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view.getMeasuredWidth()));
                jSONObject3.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view.getMeasuredHeight()));
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[0]));
                jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[i]));
                jSONObject3.put("maximum_visible_width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[0]));
                jSONObject3.put("maximum_visible_height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[i]));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put(TypedValues.AttributesType.S_FRAME, jSONObject3);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = zzl(context, rect);
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
                i = i3;
            }
            parent = view.getParent();
            if (parent != null) {
                try {
                    str = (String) parent.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent, new Object[0]);
                } catch (IllegalAccessException e) {
                    e = e;
                    int i5 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (NoSuchMethodException unused3) {
                } catch (SecurityException e2) {
                    e = e2;
                    int i52 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (InvocationTargetException e3) {
                    e = e3;
                    int i522 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                }
                hashCode = str.hashCode();
                if (hashCode == -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        i2 = i;
                        if (i2 != 0) {
                            jSONObject2.put("native_template_type", i);
                        } else if (i2 != i) {
                            jSONObject2.put("native_template_type", 0);
                        } else {
                            jSONObject2.put("native_template_type", 2);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjh)).booleanValue()) {
                            try {
                                if (view.getLayoutParams() != null) {
                                    jSONObject2.put("view_width_layout_type", zzm(r0.width) - 1);
                                    jSONObject2.put("view_height_layout_type", zzm(r0.height) - 1);
                                }
                            } catch (Exception unused4) {
                                zze.zza("Unable to get native ad view layout types");
                            }
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjj)).booleanValue()) {
                            try {
                                jSONObject2.put("alpha", view.getAlpha());
                            } catch (JSONException e4) {
                                int i6 = zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log container view alpha signal to JSON", e4);
                            }
                        }
                    }
                    i2 = -1;
                    if (i2 != 0) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjh)).booleanValue()) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjj)).booleanValue()) {
                    }
                } else {
                    if (str.equals("small_template")) {
                        i2 = 0;
                        if (i2 != 0) {
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjh)).booleanValue()) {
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjj)).booleanValue()) {
                        }
                    }
                    i2 = -1;
                    if (i2 != 0) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjh)).booleanValue()) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjj)).booleanValue()) {
                    }
                }
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode == -2066603854) {
            }
        }
        return jSONObject2;
    }

    public static JSONObject zzc(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjd)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzje)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        if (zzs.zzA(view) == 0) {
                            z = false;
                        }
                        jSONObject.put("contained_in_scroll_view", z);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjf)).booleanValue()) {
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
                    if ((parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) == -1) {
                        z = false;
                    }
                    jSONObject.put("contained_in_scroll_view", z);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject zzd(Context context, View view) {
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

    public static JSONObject zze(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
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
                            jSONObject3.put(TypedValues.AttributesType.S_FRAME, jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = zzl(context, rect);
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
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjg)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjh)).booleanValue() && (layoutParams = view2.getLayoutParams()) != null) {
                                    jSONObject3.put("view_width_layout_type", zzm(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", zzm(layoutParams.height) - 1);
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzji)).booleanValue()) {
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
                                jSONObject3.put(InAppMessageBase.MESSAGE_TEXT_COLOR, textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject3.put(ViewHierarchyConstants.TEXT_SIZE, textView.getTextSize());
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
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjj)).booleanValue()) {
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

    public static JSONObject zzf(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point2.x));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point2.y));
                    jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point.x));
                    jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    int i = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                int i2 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static int[] zzg(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zzh(MotionEvent motionEvent, View view) {
        int[] zzg = zzg(view);
        return new Point(((int) motionEvent.getRawX()) - zzg[0], ((int) motionEvent.getRawY()) - zzg[1]);
    }

    public static boolean zzi(Context context, zzfjt zzfjtVar) {
        if (!zzfjtVar.zzN) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjk)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjn)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjl);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzgtl.zza(zzgsk.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject zzj(@Nonnull Context context) {
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
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjm)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    private static JSONObject zzl(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzm(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }
}
