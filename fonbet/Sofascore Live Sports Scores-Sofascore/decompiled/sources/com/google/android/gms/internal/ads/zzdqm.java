package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.a0o;
import defpackage.b0o;
import defpackage.bnn;
import defpackage.c0l;
import defpackage.ddb;
import defpackage.dh0;
import defpackage.fn0;
import defpackage.fsn;
import defpackage.hfi;
import defpackage.inn;
import defpackage.mio;
import defpackage.nkn;
import defpackage.ohn;
import defpackage.qc4;
import defpackage.vlo;
import defpackage.wt3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdqm extends zzcyl {
    public static final s J;
    public boolean A;
    public final zzceo B;
    public final zzbbd C;
    public final VersionInfoParcel D;
    public final Context E;
    public final zzdqo F;
    public final zzeud G;
    public final HashMap H;
    public final ArrayList I;
    public final Executor l;
    public final zzdqr m;
    public final zzdqz n;
    public final zzdrq o;
    public final zzdqw p;
    public final zzdrb q;
    public final zzinq r;
    public final zzinq s;
    public final zzinq t;
    public final zzinq u;
    public final zzinq v;
    public zzdso w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        mio mioVar = zzgxm.b;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzgzf.a(6, objArr);
        J = zzgxm.z(6, objArr);
    }

    public zzdqm(zzcyk zzcykVar, Executor executor, zzdqr zzdqrVar, zzdqz zzdqzVar, zzdrq zzdrqVar, zzdqw zzdqwVar, zzdrb zzdrbVar, zzinq zzinqVar, zzinq zzinqVar2, zzinq zzinqVar3, zzinq zzinqVar4, zzinq zzinqVar5, zzceo zzceoVar, zzbbd zzbbdVar, VersionInfoParcel versionInfoParcel, Context context, zzdqo zzdqoVar, zzeud zzeudVar) {
        super(zzcykVar);
        this.l = executor;
        this.m = zzdqrVar;
        this.n = zzdqzVar;
        this.o = zzdrqVar;
        this.p = zzdqwVar;
        this.q = zzdrbVar;
        this.r = zzinqVar;
        this.s = zzinqVar2;
        this.t = zzinqVar3;
        this.u = zzinqVar4;
        this.v = zzinqVar5;
        this.B = zzceoVar;
        this.C = zzbbdVar;
        this.D = versionInfoParcel;
        this.E = context;
        this.F = zzdqoVar;
        this.G = zzeudVar;
        this.H = new HashMap();
        this.I = new ArrayList();
    }

    public static boolean d(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.kc)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long zzy = com.google.android.gms.ads.internal.util.zzs.zzy(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return zzy >= ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.lc)).intValue());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void a() {
        b0o b0oVar = new b0o(this, 1);
        Executor executor = this.l;
        executor.execute(b0oVar);
        if (this.m.q() != 7) {
            zzdqz zzdqzVar = this.n;
            Objects.requireNonNull(zzdqzVar);
            executor.execute(new fsn(zzdqzVar, 22));
        }
        super.a();
    }

    public final synchronized void c(int i, View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.jd)).booleanValue()) {
            zzdso zzdsoVar = this.w;
            if (zzdsoVar != null) {
                this.l.execute(new hfi(this, view, zzdsoVar instanceof zzdrk, i));
            } else {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            }
        }
    }

    public final zzeml e(String str, boolean z) {
        boolean z2;
        boolean z3;
        String str2;
        zzemh zzemhVar;
        zzemi zzemiVar;
        zzdqw zzdqwVar = this.p;
        if (zzdqwVar.c() && !TextUtils.isEmpty(str)) {
            zzdqr zzdqrVar = this.m;
            zzclm j = zzdqrVar.j();
            zzclm h = zzdqrVar.h();
            if (j == null && h == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdqwVar.f();
            int a = zzdqwVar.f().a();
            int i2 = a - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    String str3 = a != 1 ? a != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                    String m = wt3.m("Unknown omid media type: ", str3, new StringBuilder(str3.length() + 49), ". Not initializing Omid.");
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi(m);
                    return null;
                }
                if (j == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z3 = false;
                z2 = true;
            } else if (h != null) {
                z2 = false;
                z3 = true;
            } else {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z2) {
                str2 = null;
            } else if (z3) {
                str2 = "javascript";
                j = h;
            } else {
                j = null;
                str2 = null;
            }
            if (j == null) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.E)) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.D;
            int i8 = versionInfoParcel.buddyApkVersion;
            int i9 = versionInfoParcel.clientJarVersion;
            StringBuilder sb = new StringBuilder(fn0.a(i8, 1) + String.valueOf(i9).length());
            sb.append(i8);
            sb.append(".");
            sb.append(i9);
            String sb2 = sb.toString();
            if (z3) {
                zzemhVar = zzemh.VIDEO;
                zzemiVar = zzemi.DEFINED_BY_JAVASCRIPT;
            } else {
                zzemhVar = zzemh.NATIVE_DISPLAY;
                zzemiVar = zzdqrVar.q() == 3 ? zzemi.UNSPECIFIED : zzemi.ONE_PIXEL;
            }
            zzeml f = com.google.android.gms.ads.internal.zzt.zzu().f(j.zzD(), zzemhVar, zzemiVar, sb2, str2, str, this.b.l0);
            if (f == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            synchronized (zzdqrVar) {
                zzdqrVar.l = f;
            }
            j.j0(f);
            if (z3) {
                zzfvq zzfvqVar = f.a;
                if (h != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().c(zzfvqVar, h.zzE());
                }
                this.A = true;
            }
            if (z) {
                com.google.android.gms.ads.internal.zzt.zzu().e(f.a);
                j.n("onSdkLoaded", new dh0(0));
            }
            return f;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(View view) {
        zzcgo zzcgoVar;
        zzdqr zzdqrVar = this.m;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x6)).booleanValue() || zzdqrVar.q() == 3) {
            zzeml k = zzdqrVar.k();
            zzclm j = this.m.j();
            if (!this.p.c() || k == null || j == null || view == null) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzu().c(k.a, view);
            return;
        }
        synchronized (zzdqrVar) {
            zzcgoVar = zzdqrVar.n;
        }
        if (zzcgoVar == null) {
            return;
        }
        c0l c0lVar = new c0l((Object) this, (Object) view, false, 28);
        zzcgoVar.addListener(new vlo(0 == true ? 1 : 0, zzcgoVar, c0lVar), this.l);
    }

    public final synchronized void g(zzdso zzdsoVar) {
        Iterator<String> keys;
        View view;
        zzbay zzbayVar;
        try {
            if (!this.x) {
                this.w = zzdsoVar;
                zzdrq zzdrqVar = this.o;
                zzdrqVar.g.execute(new bnn(12, zzdrqVar, zzdsoVar));
                this.n.a(zzdsoVar.l2(), zzdsoVar.zzi(), zzdsoVar.zzj(), zzdsoVar, zzdsoVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E3)).booleanValue() && (zzbayVar = this.C.b) != null) {
                    zzbayVar.zzh(zzdsoVar.l2());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A2)).booleanValue()) {
                    zzfld zzfldVar = this.b;
                    if (zzfldVar.k0 && (keys = zzfldVar.j0.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            zzdso zzdsoVar2 = this.w;
                            WeakReference weakReference = zzdsoVar2 == null ? null : (WeakReference) zzdsoVar2.zzh().get(next);
                            this.H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzbfi zzbfiVar = new zzbfi(this.E, view);
                                this.I.add(zzbfiVar);
                                zzbfiVar.l.add(new a0o(this, next));
                                zzbfiVar.d(3);
                            }
                        }
                    }
                }
                if (zzdsoVar.zzf() != null) {
                    zzbfi zzf = zzdsoVar.zzf();
                    zzf.l.add(this.B);
                    zzf.d(3);
                }
            }
        } finally {
        }
    }

    public final void h(zzdso zzdsoVar) {
        View l2 = zzdsoVar.l2();
        zzdsoVar.zzh();
        this.n.c(l2);
        if (zzdsoVar.S1() != null) {
            zzdsoVar.S1().setClickable(false);
            zzdsoVar.S1().removeAllViews();
        }
        if (zzdsoVar.zzf() != null) {
            zzbfi zzf = zzdsoVar.zzf();
            zzf.l.remove(this.B);
        }
        this.w = null;
    }

    public final synchronized void i(View view, Map map, Map map2) {
        this.o.a(this.w);
        this.n.q(view, map, map2, k());
        this.y = true;
    }

    public final synchronized void j(View view, Map map, Map map2) {
        View view2;
        if (!this.z) {
            synchronized (this) {
                if (map != null) {
                    try {
                        s sVar = J;
                        int i = sVar.d;
                        int i2 = 0;
                        while (i2 < i) {
                            WeakReference weakReference = (WeakReference) map.get((String) sVar.get(i2));
                            i2++;
                            if (weakReference != null) {
                                view2 = (View) weakReference.get();
                            }
                        }
                    } finally {
                    }
                }
                view2 = null;
                if (view2 != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.vf)).booleanValue()) {
                        Rect rect = new Rect();
                        if (view2.getGlobalVisibleRect(rect, new Point()) && view2.getHeight() == rect.height() && view2.getWidth() == rect.width()) {
                            this.n.p(view, map, map2, k());
                            this.z = true;
                        }
                    } else {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.wf)).booleanValue()) {
                            inn innVar = zzbjg.xf;
                            if (((Float) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).floatValue() > 0.0d) {
                                double floatValue = ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).floatValue();
                                if (view2.getGlobalVisibleRect(new Rect(), new Point())) {
                                    if (r1.height() * r1.width() >= view2.getHeight() * view2.getWidth() * (floatValue / 100.0d)) {
                                        this.n.p(view, map, map2, k());
                                        this.z = true;
                                    }
                                }
                            }
                        } else if (d(view2)) {
                            this.n.p(view, map, map2, k());
                            this.z = true;
                        }
                    }
                }
            }
        }
    }

    public final synchronized ImageView.ScaleType k() {
        zzdso zzdsoVar = this.w;
        if (zzdsoVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzm = zzdsoVar.zzm();
        if (zzm != null) {
            return (ImageView.ScaleType) ObjectWrapper.Z1(zzm);
        }
        return zzdrq.k;
    }

    public final void l() {
        ddb ddbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x6)).booleanValue()) {
            e("Google", true);
            return;
        }
        zzdqr zzdqrVar = this.m;
        synchronized (zzdqrVar) {
            ddbVar = zzdqrVar.m;
        }
        if (ddbVar == null) {
            return;
        }
        ohn ohnVar = new ohn(this, 10);
        ddbVar.addListener(new vlo(0, ddbVar, ohnVar), this.l);
    }

    public final synchronized void m() {
        this.x = true;
        this.l.execute(new b0o(this, 0));
        zzdeo zzdeoVar = this.c;
        zzdeoVar.getClass();
        zzdeoVar.p0(new qc4(null, 4));
    }

    public final synchronized boolean n(Bundle bundle) {
        if (this.y) {
            return true;
        }
        boolean g = this.n.g(bundle);
        this.y = g;
        return g;
    }

    public final synchronized void o(zzdso zzdsoVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.y2)).booleanValue()) {
            g(zzdsoVar);
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new nkn(this, zzdsoVar, false, 13));
        }
    }

    public final synchronized void p(zzdso zzdsoVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.y2)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new bnn(11, this, zzdsoVar));
        } else {
            h(zzdsoVar);
        }
    }

    public final synchronized void q(View view, View view2, Map map, Map map2, boolean z) {
        zzclm h;
        zzdse zzdseVar;
        zzdrq zzdrqVar = this.o;
        zzdso zzdsoVar = this.w;
        if (zzdsoVar != null && (zzdseVar = zzdrqVar.e) != null && zzdsoVar.S1() != null && zzdrqVar.c.a()) {
            try {
                zzdsoVar.S1().addView(zzdseVar.a());
            } catch (zzcmb e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
        this.n.o(view, view2, map, map2, z, k());
        if (this.A) {
            zzdqr zzdqrVar = this.m;
            if (zzdqrVar.h() != null && (h = zzdqrVar.h()) != null) {
                h.n("onSdkAdUserInteractionClick", new dh0(0));
            }
        }
    }

    public final synchronized void r(View view, Map map, Map map2, boolean z) {
        if (this.y) {
            j(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A2)).booleanValue() && this.b.k0) {
            HashMap hashMap = this.H;
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) hashMap.get((String) it.next())).booleanValue()) {
                    break;
                }
            }
        }
        if (z) {
            i(view, map, map2);
            j(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.U4)).booleanValue() && map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view2 != null && d(view2)) {
                    i(view, map, map2);
                    return;
                }
            }
        }
    }
}
