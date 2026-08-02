package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdst implements zzdqz, zzdir {
    public final zzbwj a;
    public final zzdeh b;
    public final zzdgi c;
    public final zzddn d;
    public final zzdlu e;
    public final Context f;
    public final zzfld g;
    public final VersionInfoParcel h;
    public final zzflw i;
    public boolean j = false;
    public boolean k = false;
    public boolean l = true;
    public final zzbwf m;
    public final zzbwg n;

    public zzdst(zzbwf zzbwfVar, zzbwg zzbwgVar, zzbwj zzbwjVar, zzdeh zzdehVar, zzdgi zzdgiVar, zzddn zzddnVar, zzdlu zzdluVar, Context context, zzfld zzfldVar, VersionInfoParcel versionInfoParcel, zzflw zzflwVar) {
        this.m = zzbwfVar;
        this.n = zzbwgVar;
        this.a = zzbwjVar;
        this.b = zzdehVar;
        this.c = zzdgiVar;
        this.d = zzddnVar;
        this.e = zzdluVar;
        this.f = context;
        this.g = zzfldVar;
        this.h = versionInfoParcel;
        this.i = zzflwVar;
    }

    public static final HashMap r(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void D() {
        try {
            zzbwj zzbwjVar = this.a;
            if (zzbwjVar == null || !zzbwjVar.zzt()) {
                return;
            }
            zzfld zzfldVar = this.g;
            if (zzfldVar.e == 4 || zzfldVar.D0) {
                zzbwjVar.e2();
                this.b.zza();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzq;
        try {
            ObjectWrapper objectWrapper = new ObjectWrapper(view);
            JSONObject jSONObject = this.g.j0;
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n2)).booleanValue();
            zzbwg zzbwgVar = this.n;
            zzbwf zzbwfVar = this.m;
            zzbwj zzbwjVar = this.a;
            boolean z = true;
            if (booleanValue && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.o2)).booleanValue() && next.equals("3010")) {
                                Object obj2 = null;
                                if (zzbwjVar != null) {
                                    try {
                                        zzq = zzbwjVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzq = zzbwfVar != null ? zzbwfVar.D4() : zzbwgVar != null ? zzbwgVar.zzu() : null;
                                }
                                if (zzq != null) {
                                    obj2 = ObjectWrapper.Z1(zzq);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                zzbp.zza(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzc();
                                ClassLoader classLoader = this.f.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break loop0;
                    }
                }
            }
            this.l = z;
            HashMap r = r(map);
            HashMap r2 = r(map2);
            if (zzbwjVar != null) {
                zzbwjVar.f0(objectWrapper, new ObjectWrapper(r), new ObjectWrapper(r2));
                return;
            }
            if (zzbwfVar != null) {
                ObjectWrapper objectWrapper2 = new ObjectWrapper(r);
                ObjectWrapper objectWrapper3 = new ObjectWrapper(r2);
                Parcel J = zzbwfVar.J();
                zzbew.e(J, objectWrapper);
                zzbew.e(J, objectWrapper2);
                zzbew.e(J, objectWrapper3);
                zzbwfVar.Z1(J, 22);
                Parcel J2 = zzbwfVar.J();
                zzbew.e(J2, objectWrapper);
                zzbwfVar.Z1(J2, 12);
                return;
            }
            if (zzbwgVar != null) {
                ObjectWrapper objectWrapper4 = new ObjectWrapper(r);
                ObjectWrapper objectWrapper5 = new ObjectWrapper(r2);
                Parcel J3 = zzbwgVar.J();
                zzbew.e(J3, objectWrapper);
                zzbew.e(J3, objectWrapper4);
                zzbew.e(J3, objectWrapper5);
                zzbwgVar.Z1(J3, 22);
                Parcel J4 = zzbwgVar.J();
                zzbew.e(J4, objectWrapper);
                zzbwgVar.Z1(J4, 10);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void c(View view) {
        try {
            ObjectWrapper objectWrapper = new ObjectWrapper(view);
            zzbwj zzbwjVar = this.a;
            if (zzbwjVar != null) {
                zzbwjVar.M2(objectWrapper);
                return;
            }
            zzbwf zzbwfVar = this.m;
            if (zzbwfVar != null) {
                Parcel J = zzbwfVar.J();
                zzbew.e(J, objectWrapper);
                zzbwfVar.Z1(J, 16);
            } else {
                zzbwg zzbwgVar = this.n;
                if (zzbwgVar != null) {
                    Parcel J2 = zzbwgVar.J();
                    zzbew.e(J2, objectWrapper);
                    zzbwgVar.Z1(J2, 14);
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final JSONObject d(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void e(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.k) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.g.L) {
            s(view2);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean g(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void i(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final JSONObject l(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void m(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void o(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.k && this.g.L) {
            return;
        }
        s(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z = this.j;
            zzfld zzfldVar = this.g;
            if (!z) {
                this.j = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.f, this.h.afmaVersion, zzfldVar.C.toString(), this.i.g);
            }
            if (this.l) {
                zzbwj zzbwjVar = this.a;
                zzdeh zzdehVar = this.b;
                if (zzbwjVar != null) {
                    if (zzfldVar.D0) {
                        if (zzbwjVar.zzt()) {
                            return;
                        }
                        zzbwjVar.e2();
                        zzdehVar.zza();
                        return;
                    }
                    if (zzbwjVar.zzt() && zzfldVar.e == 4) {
                        this.c.zza();
                        return;
                    } else {
                        zzbwjVar.e2();
                        zzdehVar.zza();
                        return;
                    }
                }
                zzbwf zzbwfVar = this.m;
                if (zzbwfVar != null) {
                    Parcel S1 = zzbwfVar.S1(zzbwfVar.J(), 13);
                    ClassLoader classLoader = zzbew.a;
                    boolean z2 = S1.readInt() != 0;
                    S1.recycle();
                    if (!z2) {
                        zzbwfVar.Z1(zzbwfVar.J(), 10);
                        zzdehVar.zza();
                        return;
                    }
                }
                zzbwg zzbwgVar = this.n;
                if (zzbwgVar != null) {
                    Parcel S12 = zzbwgVar.S1(zzbwgVar.J(), 11);
                    ClassLoader classLoader2 = zzbew.a;
                    boolean z3 = S12.readInt() != 0;
                    S12.recycle();
                    if (z3) {
                        return;
                    }
                    zzbwgVar.Z1(zzbwgVar.J(), 8);
                    zzdehVar.zza();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to call recordImpression", e);
        }
    }

    public final void s(View view) {
        try {
            zzbwj zzbwjVar = this.a;
            zzdlu zzdluVar = this.e;
            zzddn zzddnVar = this.d;
            if (zzbwjVar != null && !zzbwjVar.zzu()) {
                zzbwjVar.B(new ObjectWrapper(view));
                zzddnVar.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.sc)).booleanValue()) {
                    zzdluVar.M();
                    return;
                }
                return;
            }
            zzbwf zzbwfVar = this.m;
            if (zzbwfVar != null) {
                Parcel S1 = zzbwfVar.S1(zzbwfVar.J(), 14);
                ClassLoader classLoader = zzbew.a;
                boolean z = S1.readInt() != 0;
                S1.recycle();
                if (!z) {
                    ObjectWrapper objectWrapper = new ObjectWrapper(view);
                    Parcel J = zzbwfVar.J();
                    zzbew.e(J, objectWrapper);
                    zzbwfVar.Z1(J, 11);
                    zzddnVar.onAdClicked();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.sc)).booleanValue()) {
                        zzdluVar.M();
                        return;
                    }
                    return;
                }
            }
            zzbwg zzbwgVar = this.n;
            if (zzbwgVar != null) {
                Parcel S12 = zzbwgVar.S1(zzbwgVar.J(), 12);
                ClassLoader classLoader2 = zzbew.a;
                boolean z2 = S12.readInt() != 0;
                S12.recycle();
                if (z2) {
                    return;
                }
                ObjectWrapper objectWrapper2 = new ObjectWrapper(view);
                Parcel J2 = zzbwgVar.J();
                zzbew.e(J2, objectWrapper2);
                zzbwgVar.Z1(J2, 9);
                zzddnVar.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.sc)).booleanValue()) {
                    zzdluVar.M();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzA() {
        try {
            zzbwj zzbwjVar = this.a;
            if (zzbwjVar != null) {
                zzbwjVar.e();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to call destroy", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzg() {
        this.k = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean zzh() {
        return this.g.L;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void M() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void b(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void f(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void h(zzboj zzbojVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void n(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void u(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void k(MotionEvent motionEvent, View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void p(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }
}
