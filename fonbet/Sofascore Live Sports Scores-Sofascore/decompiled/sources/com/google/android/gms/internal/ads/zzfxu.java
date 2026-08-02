package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import defpackage.gl5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfxu implements zzfwv {
    public static final zzfxu f = new zzfxu();
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static Handler h = null;
    public static final gl5 i = new gl5(14);
    public static final gl5 j = new gl5(15);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final zzfxn d = new zzfxn();
    public final zzfwx c = new zzfwx();
    public final zzfxo e = new zzfxo(new zzfxx());

    public static void b() {
        if (h == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            h = handler;
            handler.post(i);
            h.postDelayed(j, 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view, zzfwz zzfwzVar, JSONObject jSONObject, boolean z) {
        Object obj;
        Object[] objArr;
        int i2;
        if (zzfxl.a(view) == null) {
            zzfxn zzfxnVar = this.d;
            char c = zzfxnVar.d.contains(view) ? (char) 1 : zzfxnVar.j ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            JSONObject a = zzfwzVar.a(view);
            zzfxg.c(jSONObject, a);
            HashMap hashMap = zzfxnVar.a;
            if (hashMap.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) hashMap.get(view);
                if (obj2 != null) {
                    hashMap.remove(view);
                }
                obj = obj2;
            }
            boolean z2 = false;
            if (obj != null) {
                try {
                    a.put("adSessionId", obj);
                } catch (JSONException unused) {
                }
                WeakHashMap weakHashMap = zzfxnVar.i;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z2 = true;
                }
                try {
                    a.put("hasWindowFocus", Boolean.valueOf(z2));
                } catch (JSONException unused2) {
                }
                boolean contains = zzfxnVar.h.contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        a.put("isPipActive", valueOf);
                    } catch (JSONException unused3) {
                    }
                }
                zzfxnVar.j = true;
                return;
            }
            HashMap hashMap2 = zzfxnVar.b;
            zzfxm zzfxmVar = (zzfxm) hashMap2.get(view);
            if (zzfxmVar != null) {
                hashMap2.remove(view);
            }
            if (zzfxmVar != null) {
                zzfwn zzfwnVar = zzfxmVar.a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = zzfxmVar.b;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    jSONArray.put((String) arrayList.get(i3));
                }
                try {
                    a.put("isFriendlyObstructionFor", jSONArray);
                    a.put("friendlyObstructionClass", zzfwnVar.b);
                    a.put("friendlyObstructionPurpose", zzfvt.a);
                    a.put("friendlyObstructionReason", "Ad overlay");
                } catch (JSONException unused4) {
                }
                objArr = true;
            } else {
                objArr = false;
            }
            boolean z3 = z || objArr == true;
            boolean z4 = c == 1;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z4) {
                    for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                        a(viewGroup.getChildAt(i4), zzfwzVar, a, z3);
                    }
                    return;
                }
                HashMap hashMap3 = new HashMap();
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    ArrayList arrayList2 = (ArrayList) hashMap3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hashMap3.put(Float.valueOf(childAt.getZ()), arrayList2);
                    }
                    arrayList2.add(childAt);
                }
                ArrayList arrayList3 = new ArrayList(hashMap3.keySet());
                Collections.sort(arrayList3);
                int size2 = arrayList3.size();
                int i6 = 0;
                while (i6 < size2) {
                    ArrayList arrayList4 = (ArrayList) hashMap3.get((Float) arrayList3.get(i6));
                    int size3 = arrayList4.size();
                    int i7 = 0;
                    while (true) {
                        i2 = i6 + 1;
                        if (i7 < size3) {
                            a((View) arrayList4.get(i7), zzfwzVar, a, z3);
                            i7++;
                        }
                    }
                    i6 = i2;
                }
            }
        }
    }
}
