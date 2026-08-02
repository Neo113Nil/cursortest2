package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import defpackage.fff;
import defpackage.ilo;
import defpackage.qon;
import defpackage.vlo;
import defpackage.yzn;
import defpackage.zzn;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdpl implements zzdqz {
    public com.google.android.gms.ads.internal.client.zzdc C;
    public final zzdge D;
    public final zzdrs E;
    public final com.google.android.gms.ads.internal.zzb F;
    public final zzdck G;
    public final Context a;
    public final zzdrb b;
    public final JSONObject c;
    public final zzdvv d;
    public final zzdqr e;
    public final zzbbd f;
    public final zzdeh g;
    public final zzddn h;
    public final zzdlu i;
    public final zzfld j;
    public final VersionInfoParcel k;
    public final zzflw l;
    public final zzcuy m;
    public final zzdrw n;
    public final Clock o;
    public final zzdlq p;
    public final zzfte q;
    public final zzdxl r;
    public final zzfrg s;
    public final zzelp t;
    public boolean v;
    public boolean u = false;
    public boolean w = false;
    public boolean x = false;
    public Point y = new Point();
    public Point z = new Point();
    public long A = 0;
    public long B = 0;

    public zzdpl(Context context, zzdrb zzdrbVar, JSONObject jSONObject, zzdvv zzdvvVar, zzdqr zzdqrVar, zzbbd zzbbdVar, zzdeh zzdehVar, zzddn zzddnVar, zzdlu zzdluVar, zzfld zzfldVar, VersionInfoParcel versionInfoParcel, zzflw zzflwVar, zzcuy zzcuyVar, zzdrw zzdrwVar, Clock clock, zzdlq zzdlqVar, zzfte zzfteVar, zzfrg zzfrgVar, zzelp zzelpVar, zzdxl zzdxlVar, zzdrs zzdrsVar, zzdge zzdgeVar, com.google.android.gms.ads.internal.zzb zzbVar, zzdck zzdckVar) {
        this.a = context;
        this.b = zzdrbVar;
        this.c = jSONObject;
        this.d = zzdvvVar;
        this.e = zzdqrVar;
        this.f = zzbbdVar;
        this.g = zzdehVar;
        this.h = zzddnVar;
        this.i = zzdluVar;
        this.j = zzfldVar;
        this.k = versionInfoParcel;
        this.l = zzflwVar;
        this.m = zzcuyVar;
        this.n = zzdrwVar;
        this.o = clock;
        this.p = zzdlqVar;
        this.q = zzfteVar;
        this.s = zzfrgVar;
        this.t = zzelpVar;
        this.r = zzdxlVar;
        this.E = zzdrsVar;
        this.D = zzdgeVar;
        this.F = zzbVar;
        this.G = zzdckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.y = new Point();
        this.z = new Point();
        if (!this.v) {
            this.p.q0(view);
            this.v = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        zzcuy zzcuyVar = this.m;
        zzcuyVar.getClass();
        zzcuyVar.j = new WeakReference(this);
        boolean zza = com.google.android.gms.ads.internal.util.zzbs.zza(this.k.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zza) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zza) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void b(View view) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            zzdrw zzdrwVar = this.n;
            view.setOnClickListener(zzdrwVar);
            view.setClickable(true);
            zzdrwVar.g = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void c(View view) {
        this.y = new Point();
        this.z = new Point();
        if (view != null) {
            zzdlq zzdlqVar = this.p;
            synchronized (zzdlqVar) {
                WeakHashMap weakHashMap = zzdlqVar.b;
                if (weakHashMap.containsKey(view)) {
                    ((zzbfi) weakHashMap.get(view)).l.remove(zzdlqVar);
                    weakHashMap.remove(view);
                }
            }
        }
        this.v = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final JSONObject d(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject l = l(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.x && this.c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (l != null) {
                jSONObject.put("nas", l);
            }
            return jSONObject;
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to create native click meta data JSON.", e);
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // com.google.android.gms.internal.ads.zzdqz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        boolean z2;
        boolean z3;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.c;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.jd)).booleanValue()) {
                z2 = true;
                if (!z2) {
                    if (!this.x) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzd("Custom click reporting failed. enableCustomClickGesture is not set.");
                        return;
                    } else if (!jSONObject2.optBoolean("allow_custom_click_gesture", false)) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzd("Custom click reporting failed. Ad unit id not in the allow list.");
                        return;
                    }
                }
                Context context = this.a;
                JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
                JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
                JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
                z3 = z2;
                JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
                String s = s(view, map);
                JSONObject zzf = com.google.android.gms.ads.internal.util.zzbs.zzf(s, context, this.z, this.y);
                if (z3) {
                    try {
                        Point point = this.z;
                        Point point2 = this.y;
                        try {
                            jSONObject = new JSONObject();
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                JSONObject jSONObject4 = new JSONObject();
                                if (point != null) {
                                    jSONObject3.put("x", point.x);
                                    jSONObject3.put("y", point.y);
                                }
                                if (point2 != null) {
                                    jSONObject4.put("x", point2.x);
                                    jSONObject4.put("y", point2.y);
                                }
                                jSONObject.put("start_point", jSONObject3);
                                jSONObject.put("end_point", jSONObject4);
                                jSONObject.put("duration_ms", i);
                            } catch (Exception e) {
                                e = e;
                                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                zzo.zzg("Error occurred while grabbing custom click gesture signals.", e);
                                jSONObject2.put("custom_click_gesture_signal", jSONObject);
                                x(view2, zzb, zze, zzc, zzd, s, zzf, null, z, true);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            jSONObject = null;
                        }
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    } catch (JSONException e3) {
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzg("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                        com.google.android.gms.ads.internal.zzt.zzh().d("FirstPartyNativeAdCore.performCustomClickGesture", e3);
                    }
                }
                x(view2, zzb, zze, zzc, zzd, s, zzf, null, z, true);
            }
        }
        z2 = false;
        if (!z2) {
        }
        Context context2 = this.a;
        JSONObject zze2 = com.google.android.gms.ads.internal.util.zzbs.zze(context2, map, map2, view2, scaleType);
        JSONObject zzb2 = com.google.android.gms.ads.internal.util.zzbs.zzb(context2, view2);
        JSONObject zzc2 = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        z3 = z2;
        JSONObject zzd2 = com.google.android.gms.ads.internal.util.zzbs.zzd(context2, view2);
        String s2 = s(view, map);
        JSONObject zzf2 = com.google.android.gms.ads.internal.util.zzbs.zzf(s2, context2, this.z, this.y);
        if (z3) {
        }
        x(view2, zzb2, zze2, zzc2, zzd2, s2, zzf2, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void f(Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Touch event data is null. No touch event is reported.");
        } else {
            if (!r("touch_reporting")) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzf("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.f.b.zze((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            t();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean g(Bundle bundle) {
        if (r("impression_reporting")) {
            return v(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.cd)).booleanValue() ? w(null) : null, com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, null), false, null);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzf("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void h(zzboj zzbojVar) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdrw zzdrwVar = this.n;
        zzdvv zzdvvVar = zzdrwVar.a;
        zzdrwVar.c = zzbojVar;
        qon qonVar = zzdrwVar.d;
        if (qonVar != null) {
            zzdvvVar.c("/unconfirmedClick", qonVar);
        }
        qon qonVar2 = new qon(2, zzdrwVar, zzbojVar);
        zzdrwVar.d = qonVar2;
        zzdvvVar.b("/unconfirmedClick", qonVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void i(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        zzew zzewVar;
        zzew zzewVar2;
        zzfrg zzfrgVar = this.s;
        zzfld zzfldVar = this.j;
        zzfte zzfteVar = this.q;
        try {
            if (this.w) {
                return;
            }
            if (zzdgVar == null) {
                zzdqr zzdqrVar = this.e;
                synchronized (zzdqrVar) {
                    zzewVar = zzdqrVar.g;
                }
                if (zzewVar != null) {
                    this.w = true;
                    synchronized (zzdqrVar) {
                        zzewVar2 = zzdqrVar.g;
                    }
                    zzfteVar.b(zzewVar2.zzf(), zzfldVar.x0, zzfrgVar, null);
                    y();
                    return;
                }
            }
            this.w = true;
            zzfteVar.b(zzdgVar.zzf(), zzfldVar.x0, zzfrgVar, null);
            y();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void j() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            zzcgm.a(this.d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression", zzcgj.h);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void k(MotionEvent motionEvent, View view) {
        this.y = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, view);
        long a = this.o.a();
        this.B = a;
        if (motionEvent.getAction() == 0) {
            this.r.a = motionEvent;
            this.A = a;
            this.z = this.y;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.y;
        obtain.setLocation(point.x, point.y);
        this.f.b.zzd(obtain);
        obtain.recycle();
        t();
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final JSONObject l(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zze);
            jSONObject.put("ad_view_signal", zzb);
            jSONObject.put("scroll_view_signal", zzc);
            jSONObject.put("lock_screen_signal", zzd);
            return jSONObject;
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void m(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.C = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void n(String str) {
        x(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void o(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        String s = s(view, map);
        x(true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I4)).booleanValue() ? view2 : view, zzb, zze, zzc, zzd, s, com.google.android.gms.ads.internal.util.zzbs.zzf(s, context, this.z, this.y), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void p(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        boolean zzi = com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.j);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            jSONObject.put("asset_view_signal", zze);
            jSONObject.put("ad_view_signal", zzb);
            jSONObject.put("scroll_view_signal", zzc);
            jSONObject.put("lock_screen_signal", zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B4)).booleanValue()) {
                jSONObject.put("view_signals", w(view));
            }
            jSONObject.put("policy_validator_enabled", zzi);
            jSONObject.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(context));
            zzcgm.a(this.d.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging", zzcgj.h);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to create native ad signals logging JSON.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.a;
        v(com.google.android.gms.ads.internal.util.zzbs.zzb(context, view), com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbs.zzc(view), com.google.android.gms.ads.internal.util.zzbs.zzd(context, view), w(view), null, com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.j), view);
    }

    public final boolean r(String str) {
        JSONObject optJSONObject = this.c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    public final String s(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int q = this.e.q();
        if (q == 1) {
            return "1099";
        }
        if (q == 2) {
            return "2099";
        }
        if (q != 6) {
            return null;
        }
        return "3099";
    }

    public final void t() {
        com.google.android.gms.ads.internal.zzb zzbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.yf)).booleanValue() || (zzbVar = this.F) == null) {
            return;
        }
        zzbVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void u(Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Click data is null. No click is reported.");
        } else if (r("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            x(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, null), false, false);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    public final boolean v(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z, View view) {
        zzdck zzdckVar;
        zzfld zzfldVar = this.j;
        Context context = this.a;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B4)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(context));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Af)).booleanValue() && (zzdckVar = this.G) != null) {
                AtomicLong atomicLong = zzdckVar.a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, atomicLong.get());
                }
            }
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y9)).booleanValue();
            zzdvv zzdvvVar = this.d;
            if (booleanValue) {
                zzdvvVar.b("/clickRecorded", new yzn(this, 1));
            } else {
                zzdvvVar.b("/logScionEvent", new yzn(this, 0));
            }
            zzdvvVar.b("/nativeImpression", new qon(this, view));
            zzdvvVar.b("/nativeImpressionFlowControl", new zzn(this, this.q, zzfldVar.x0, this.s));
            zzcgm.a(zzdvvVar.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression", zzcgj.h);
            if (!this.u) {
                this.u = com.google.android.gms.ads.internal.zzt.zzo().zzg(context, this.k.afmaVersion, zzfldVar.C.toString(), this.l.g);
            }
            return true;
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to create impression JSON.", e);
            return false;
        }
    }

    public final String w(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B4)).booleanValue()) {
            return null;
        }
        try {
            return this.f.b.zzj(this.a, view, null);
        } catch (Exception unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Exception getting data.");
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:2|3|(1:5)(1:82)|6|(1:81)(1:10)|11|87|16|(2:91|(22:23|24|(1:28)|29|(1:33)|(1:35)|36|(1:38)|39|40|41|42|(1:44)|45|46|(1:50)|51|(1:55)|56|(3:58|(1:60)|(1:62))|63|64))|75|24|(2:26|28)|29|(2:31|33)|(0)|36|(0)|39|40|41|42|(0)|45|46|(2:48|50)|51|(2:53|55)|56|(0)|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010d, code lost:
    
        r10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception obtaining click signals", r0);
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3 A[Catch: JSONException -> 0x01ac, TryCatch #3 {JSONException -> 0x01ac, blocks: (B:3:0x000a, B:6:0x004d, B:8:0x007b, B:11:0x0082, B:12:0x0087, B:15:0x008a, B:16:0x008b, B:18:0x0091, B:21:0x0094, B:24:0x009f, B:26:0x00a8, B:28:0x00b0, B:29:0x00b5, B:31:0x00c2, B:33:0x00cc, B:35:0x00d3, B:36:0x00d8, B:39:0x00e7, B:46:0x0115, B:48:0x012f, B:50:0x0135, B:51:0x013a, B:53:0x014c, B:55:0x0152, B:56:0x0157, B:58:0x0183, B:60:0x018b, B:62:0x0193, B:63:0x0198, B:69:0x010d, B:74:0x009e, B:80:0x01ab, B:42:0x00ed, B:44:0x00f3, B:45:0x00fc, B:14:0x0088, B:20:0x0092), top: B:2:0x000a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3 A[Catch: Exception -> 0x00f9, TryCatch #0 {Exception -> 0x00f9, blocks: (B:42:0x00ed, B:44:0x00f3, B:45:0x00fc), top: B:41:0x00ed, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0183 A[Catch: JSONException -> 0x01ac, TryCatch #3 {JSONException -> 0x01ac, blocks: (B:3:0x000a, B:6:0x004d, B:8:0x007b, B:11:0x0082, B:12:0x0087, B:15:0x008a, B:16:0x008b, B:18:0x0091, B:21:0x0094, B:24:0x009f, B:26:0x00a8, B:28:0x00b0, B:29:0x00b5, B:31:0x00c2, B:33:0x00cc, B:35:0x00d3, B:36:0x00d8, B:39:0x00e7, B:46:0x0115, B:48:0x012f, B:50:0x0135, B:51:0x013a, B:53:0x014c, B:55:0x0152, B:56:0x0157, B:58:0x0183, B:60:0x018b, B:62:0x0193, B:63:0x0198, B:69:0x010d, B:74:0x009e, B:80:0x01ab, B:42:0x00ed, B:44:0x00f3, B:45:0x00fc, B:14:0x0088, B:20:0x0092), top: B:2:0x000a, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        List list;
        boolean z3;
        JSONObject optJSONObject;
        zzew zzewVar;
        Clock clock = this.o;
        zzdqr zzdqrVar = this.e;
        JSONObject jSONObject7 = this.c;
        try {
            t();
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            zzdrb zzdrbVar = this.b;
            jSONObject8.put("has_custom_click_handler", ((zzbnw) zzdrbVar.g.get(zzdqrVar.g())) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdqrVar.q());
            jSONObject9.put("view_aware_api_used", z);
            zzbmk zzbmkVar = this.l.j;
            jSONObject9.put("custom_mute_requested", zzbmkVar != null && zzbmkVar.g);
            synchronized (zzdqrVar) {
                list = zzdqrVar.f;
            }
            if (!list.isEmpty()) {
                synchronized (zzdqrVar) {
                    zzewVar = zzdqrVar.g;
                }
                if (zzewVar != null) {
                    z3 = true;
                    jSONObject9.put("custom_mute_enabled", z3);
                    if (this.n.c != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                        jSONObject9.put("custom_one_point_five_click_eligible", true);
                    }
                    jSONObject9.put("timestamp", clock.a());
                    if (this.x && this.c.optBoolean("allow_custom_click_gesture", false)) {
                        jSONObject9.put("custom_click_gesture_eligible", true);
                    }
                    if (z2) {
                        jSONObject9.put("is_custom_click_gesture", true);
                    }
                    jSONObject9.put("has_custom_click_handler", ((zzbnw) zzdrbVar.g.get(zzdqrVar.g())) != null);
                    optJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    String str2 = this.f.b.zzg(this.a, optJSONObject.optString("click_string"), view);
                    jSONObject9.put("click_signals", str2);
                    jSONObject9.put("open_chrome_custom_tab", true);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ca)).booleanValue() && PlatformVersion.a()) {
                        jSONObject9.put("try_fallback_for_deep_link", true);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.da)).booleanValue() && PlatformVersion.a()) {
                        jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
                    }
                    jSONObject8.put("click", jSONObject9);
                    JSONObject jSONObject10 = new JSONObject();
                    long a = clock.a();
                    jSONObject10.put("time_from_last_touch_down", a - this.A);
                    jSONObject10.put("time_from_last_touch", a - this.B);
                    jSONObject8.put("touch_signal", jSONObject10);
                    if (this.j.b()) {
                        JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                        String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                        if (string != null) {
                            this.t.E4(string, zzdqrVar);
                        }
                    }
                    zzcgm.a(this.d.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick", zzcgj.h);
                }
            }
            z3 = false;
            jSONObject9.put("custom_mute_enabled", z3);
            if (this.n.c != null) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", clock.a());
            if (this.x) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
            }
            jSONObject9.put("has_custom_click_handler", ((zzbnw) zzdrbVar.g.get(zzdqrVar.g())) != null);
            optJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
            }
            String str22 = this.f.b.zzg(this.a, optJSONObject.optString("click_string"), view);
            jSONObject9.put("click_signals", str22);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ca)).booleanValue()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.da)).booleanValue()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject102 = new JSONObject();
            long a2 = clock.a();
            jSONObject102.put("time_from_last_touch_down", a2 - this.A);
            jSONObject102.put("time_from_last_touch", a2 - this.B);
            jSONObject8.put("touch_signal", jSONObject102);
            if (this.j.b()) {
            }
            zzcgm.a(this.d.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick", zzcgj.h);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to create click JSON.", e);
        }
    }

    public final void y() {
        try {
            com.google.android.gms.ads.internal.client.zzdc zzdcVar = this.C;
            if (zzdcVar != null) {
                zzdcVar.zze();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzA() {
        zzdvv zzdvvVar = this.d;
        synchronized (zzdvvVar) {
            ilo iloVar = zzdvvVar.n;
            if (iloVar == null) {
                return;
            }
            fff fffVar = new fff(14);
            iloVar.addListener(new vlo(0, iloVar, fffVar), zzdvvVar.e);
            zzdvvVar.n = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzg() {
        this.x = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean zzh() {
        return this.c.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzn() {
        v(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzq() {
        View view;
        if (this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzdrw zzdrwVar = this.n;
            if (zzdrwVar.c == null || zzdrwVar.f == null) {
                return;
            }
            zzdrwVar.e = null;
            zzdrwVar.f = null;
            WeakReference weakReference = zzdrwVar.g;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                zzdrwVar.g = null;
            }
            try {
                zzdrwVar.c.zzf();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final int zzu() {
        zzbmk zzbmkVar = this.l.j;
        if (zzbmkVar == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.jd)).booleanValue()) {
            return zzbmkVar.i;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean zzv() {
        if (zzu() == 0) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.jd)).booleanValue()) {
            return this.l.j.j;
        }
        return true;
    }
}
