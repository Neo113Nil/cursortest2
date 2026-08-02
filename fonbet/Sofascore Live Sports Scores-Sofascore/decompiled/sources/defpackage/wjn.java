package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.facebook.internal.d;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.cast.b;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.zza;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcea;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcif;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcms;
import com.google.android.gms.internal.ads.zzcny;
import com.google.android.gms.internal.ads.zzcrj;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzdn;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzdxw;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzeas;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzes;
import com.google.android.gms.internal.ads.zzfgl;
import com.google.android.gms.internal.ads.zzfjg;
import com.google.android.gms.internal.ads.zzfqz;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzfrk;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.android.gms.internal.ads.zzfrm;
import com.google.android.gms.internal.ads.zzfrn;
import com.google.android.gms.internal.ads.zzfro;
import com.google.android.gms.internal.ads.zzfrp;
import com.google.android.gms.internal.ads.zzfrq;
import com.google.android.gms.internal.ads.zzfs;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.ads.zzfvm;
import com.google.android.gms.internal.ads.zzfvy;
import com.google.android.gms.internal.ads.zzgae;
import com.google.android.gms.internal.ads.zzgrm;
import com.google.android.gms.internal.ads.zzgtj;
import com.google.android.gms.internal.ads.zzieh;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zzija;
import com.google.android.gms.internal.ads.zzijq;
import com.google.android.gms.internal.ads.zzikt;
import com.google.android.gms.internal.ads.zzikv;
import com.google.android.gms.internal.ads.zzilp;
import com.google.android.gms.internal.cast.zzef;
import com.google.android.gms.internal.cast.zzek;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.internal.playcore_hsdp.zzc;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class wjn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public wjn(zzlj zzljVar, zzcs zzcsVar) {
        this.a = 28;
        this.c = zzcsVar;
        Objects.requireNonNull(zzljVar);
        this.b = zzljVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01f8 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00a2, B:16:0x00be, B:20:0x00c5, B:22:0x0188, B:25:0x018d, B:26:0x0194, B:28:0x01f8, B:29:0x0204, B:31:0x0216, B:33:0x021e, B:35:0x022a, B:36:0x0234, B:37:0x0258), top: B:13:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0216 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00a2, B:16:0x00be, B:20:0x00c5, B:22:0x0188, B:25:0x018d, B:26:0x0194, B:28:0x01f8, B:29:0x0204, B:31:0x0216, B:33:0x021e, B:35:0x022a, B:36:0x0234, B:37:0x0258), top: B:13:0x00a2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        zzbyi zzbyiVar;
        zzfrj zzfrjVar = (zzfrj) this.c;
        zzfqz zzfqzVar = (zzfqz) this.b;
        synchronized (zzfrj.l) {
            try {
                if (!zzfrjVar.i) {
                    zzfrjVar.i = true;
                    if (zzfrj.a()) {
                        try {
                            zzt.zzc();
                            zzfrjVar.d = zzs.zzr(zzfrjVar.a);
                        } catch (RemoteException | RuntimeException e) {
                            zzt.zzh().d("CuiMonitor.gettingAppIdFromManifest", e);
                        }
                        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.b;
                        Context context = zzfrjVar.a;
                        googleApiAvailabilityLight.getClass();
                        zzfrjVar.e = GooglePlayServicesUtilLight.b(context);
                        int intValue = ((Integer) zzba.zzc().a(zzbjg.fa)).intValue();
                        if (((Boolean) zzba.zzc().a(zzbjg.Bd)).booleanValue()) {
                            long j = intValue;
                            zzcgj.d.scheduleWithFixedDelay(zzfrjVar, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j2 = intValue;
                            zzcgj.d.scheduleAtFixedRate(zzfrjVar, j2, j2, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) zzba.zzc().a(zzbjg.la)).booleanValue()) {
                            zzfrjVar.h.a();
                        }
                    }
                }
            } finally {
            }
        }
        if (zzfrj.a() && zzfqzVar != null) {
            synchronized (zzfrj.k) {
                try {
                    zzfrn zzfrnVar = zzfrjVar.c;
                    if (((zzfrq) zzfrnVar.b).D() >= ((Integer) zzba.zzc().a(zzbjg.ga)).intValue()) {
                        return;
                    }
                    zzfrk F = zzfrm.F();
                    int i = zzfqzVar.m;
                    F.n();
                    ((zzfrm) F.b).c0(i);
                    boolean z = zzfqzVar.b;
                    F.n();
                    ((zzfrm) F.b).G(z);
                    long j3 = zzfqzVar.a;
                    F.n();
                    ((zzfrm) F.b).H(j3);
                    F.n();
                    ((zzfrm) F.b).d0();
                    String str2 = zzfrjVar.b.afmaVersion;
                    F.n();
                    ((zzfrm) F.b).J(str2);
                    String str3 = zzfrjVar.d;
                    F.n();
                    ((zzfrm) F.b).K(str3);
                    String str4 = Build.VERSION.RELEASE;
                    F.n();
                    ((zzfrm) F.b).L(str4);
                    int i2 = Build.VERSION.SDK_INT;
                    F.n();
                    ((zzfrm) F.b).M(i2);
                    int i3 = zzfqzVar.o;
                    F.n();
                    ((zzfrm) F.b).D(i3);
                    int i4 = zzfqzVar.c;
                    F.n();
                    ((zzfrm) F.b).O(i4);
                    long j4 = zzfrjVar.e;
                    F.n();
                    ((zzfrm) F.b).P(j4);
                    int i5 = zzfqzVar.n;
                    F.n();
                    ((zzfrm) F.b).E(i5);
                    String str5 = zzfqzVar.d;
                    F.n();
                    ((zzfrm) F.b).Q(str5);
                    String str6 = zzfqzVar.e;
                    F.n();
                    ((zzfrm) F.b).R(str6);
                    String str7 = zzfqzVar.f;
                    F.n();
                    ((zzfrm) F.b).S(str7);
                    zzdxw b = zzfrjVar.f.b(zzfqzVar.f);
                    if (b != null && (zzbyiVar = b.b) != null) {
                        str = zzbyiVar.toString();
                        F.n();
                        ((zzfrm) F.b).U(str);
                        String str8 = zzfqzVar.g;
                        F.n();
                        ((zzfrm) F.b).V(str8);
                        zzfrl zzfrlVar = zzfqzVar.h;
                        F.n();
                        ((zzfrm) F.b).Z(zzfrlVar);
                        String str9 = zzfqzVar.k;
                        F.n();
                        ((zzfrm) F.b).Y(str9);
                        String str10 = zzfqzVar.i;
                        F.n();
                        ((zzfrm) F.b).W(str10);
                        String str11 = zzfqzVar.j;
                        F.n();
                        ((zzfrm) F.b).X(str11);
                        long j5 = zzfqzVar.l;
                        F.n();
                        ((zzfrm) F.b).I(j5);
                        if (((Boolean) zzba.zzc().a(zzbjg.ka)).booleanValue()) {
                            List list = zzfrjVar.g;
                            F.n();
                            ((zzfrm) F.b).N(list);
                        }
                        if (((Boolean) zzba.zzc().a(zzbjg.la)).booleanValue()) {
                            zzcny zzcnyVar = zzfrjVar.h;
                            zzija zzijaVar = zzcnyVar.b;
                            String str12 = zzcnyVar.a;
                            if (zzijaVar != null) {
                                F.n();
                                ((zzfrm) F.b).a0(zzijaVar);
                            }
                            if (str12 != null) {
                                F.n();
                                ((zzfrm) F.b).b0(str12);
                            }
                        }
                        zzfro D = zzfrp.D();
                        D.n();
                        ((zzfrp) D.b).E((zzfrm) F.o());
                        zzfrnVar.n();
                        ((zzfrq) zzfrnVar.b).F((zzfrp) D.o());
                    }
                    str = "";
                    F.n();
                    ((zzfrm) F.b).U(str);
                    String str82 = zzfqzVar.g;
                    F.n();
                    ((zzfrm) F.b).V(str82);
                    zzfrl zzfrlVar2 = zzfqzVar.h;
                    F.n();
                    ((zzfrm) F.b).Z(zzfrlVar2);
                    String str92 = zzfqzVar.k;
                    F.n();
                    ((zzfrm) F.b).Y(str92);
                    String str102 = zzfqzVar.i;
                    F.n();
                    ((zzfrm) F.b).W(str102);
                    String str112 = zzfqzVar.j;
                    F.n();
                    ((zzfrm) F.b).X(str112);
                    long j52 = zzfqzVar.l;
                    F.n();
                    ((zzfrm) F.b).I(j52);
                    if (((Boolean) zzba.zzc().a(zzbjg.ka)).booleanValue()) {
                    }
                    if (((Boolean) zzba.zzc().a(zzbjg.la)).booleanValue()) {
                    }
                    zzfro D2 = zzfrp.D();
                    D2.n();
                    ((zzfrp) D2.b).E((zzfrm) F.o());
                    zzfrnVar.n();
                    ((zzfrq) zzfrnVar.b).F((zzfrp) D2.o());
                } finally {
                }
            }
        }
    }

    private final /* synthetic */ void b() {
        u53 u53Var = (u53) this.c;
        Runnable runnable = (Runnable) this.b;
        if (((zzgrm) u53Var.i) != null || u53Var.a) {
            if (!u53Var.a) {
                runnable.run();
                return;
            }
            ((zzgtj) u53Var.d).a("Waiting to bind to the service.", new Object[0]);
            ArrayList arrayList = (ArrayList) u53Var.e;
            synchronized (arrayList) {
                arrayList.add(runnable);
            }
            return;
        }
        ((zzgtj) u53Var.d).a("Initiate binding to the service.", new Object[0]);
        ArrayList arrayList2 = (ArrayList) u53Var.e;
        synchronized (arrayList2) {
            arrayList2.add(runnable);
        }
        zxc zxcVar = new zxc(u53Var, 2);
        u53Var.h = zxcVar;
        u53Var.a = true;
        if (((Context) u53Var.c).bindService((Intent) u53Var.f, zxcVar, 65)) {
            return;
        }
        ((zzgtj) u53Var.d).a("Failed to bind to the service.", new Object[0]);
        u53Var.a = false;
        ArrayList arrayList3 = (ArrayList) u53Var.e;
        synchronized (arrayList3) {
            arrayList3.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean isEmpty;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Long valueOf;
        int i = 10;
        boolean z = false;
        boolean z2 = true;
        char c = 1;
        Application application = null;
        switch (this.a) {
            case 0:
                l2a l2aVar = (l2a) this.c;
                View view = (View) this.b;
                try {
                    if (view.getParent() != null) {
                        ((WindowManager) l2aVar.c).removeView(view);
                    }
                } catch (RuntimeException unused) {
                }
                l2aVar.d = null;
                return;
            case 1:
                zzbgg zzbggVar = (zzbgg) this.c;
                View view2 = (View) this.b;
                try {
                    zzbfw zzbfwVar = new zzbfw(zzbggVar.f, zzbggVar.g, zzbggVar.h, zzbggVar.i, zzbggVar.j, zzbggVar.k, zzbggVar.l, zzbggVar.o);
                    zzbgb zzg = zzt.zzg();
                    synchronized (zzg.a) {
                        try {
                            pmn pmnVar = zzg.b;
                            if (pmnVar != null) {
                                application = pmnVar.b;
                            }
                        } finally {
                        }
                    }
                    if (application != null) {
                        String str = zzbggVar.m;
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = (String) view2.getTag(application.getResources().getIdentifier((String) zzba.zzc().a(zzbjg.O0), "id", application.getPackageName()));
                            if (str2 != null && str2.equals(str)) {
                                return;
                            }
                        }
                    }
                    uif a = zzbggVar.a(view2, zzbfwVar);
                    zzbfwVar.b();
                    if (a.b == 0 && a.c == 0) {
                        return;
                    }
                    int i2 = a.c;
                    if (i2 == 0 && zzbfwVar.k == 0) {
                        return;
                    }
                    if (i2 == 0) {
                        zzbfx zzbfxVar = zzbggVar.d;
                        synchronized (zzbfxVar.a) {
                            try {
                                if (zzbfxVar.c.contains(zzbfwVar)) {
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                    zzbggVar.d.b(zzbfwVar);
                    return;
                } catch (Exception e) {
                    int i3 = zze.zza;
                    zzo.zzg("Exception in fetchContentOnUIThread", e);
                    zzt.zzh().d("ContentFetchTask.fetchContent", e);
                    return;
                }
            case 2:
                zzbm zzbmVar = ((b) this.c).a;
                zza zzaVar = (zza) this.b;
                zzbmVar.getClass();
                String str3 = zzaVar.a;
                if (CastUtils.c(str3, zzbmVar.v)) {
                    z2 = false;
                } else {
                    zzbmVar.v = str3;
                }
                zzbm.H.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(zzbmVar.o));
                t8p t8pVar = zzbmVar.E;
                if (t8pVar != null && (z2 || zzbmVar.o)) {
                    t8pVar.d();
                }
                zzbmVar.o = false;
                return;
            case 3:
                zzt.zzb();
                zzn.zza(((zzbym) this.b).a, (AdOverlayInfoParcel) this.c, true, null);
                return;
            case 4:
                zzcea zzceaVar = (zzcea) this.c;
                Bitmap bitmap = (Bitmap) this.b;
                mpo mpoVar = zziei.b;
                zzieh zziehVar = new zzieh();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, zziehVar);
                synchronized (zzceaVar.h) {
                    zzijq zzijqVar = zzceaVar.a;
                    zzikt D = zzikv.D();
                    zziei h = zziehVar.h();
                    D.n();
                    ((zzikv) D.b).F(h);
                    D.n();
                    ((zzikv) D.b).E("image/png");
                    D.n();
                    ((zzikv) D.b).G(2);
                    zzikv zzikvVar = (zzikv) D.o();
                    zzijqVar.n();
                    ((zzilp) zzijqVar.b).N(zzikvVar);
                }
                return;
            case 5:
                Context context = (Context) this.c;
                zzdt zzdtVar = (zzdt) this.b;
                zzcj.a = (AudioManager) context.getSystemService("audio");
                zzdtVar.a();
                return;
            case 6:
                int i4 = zzcku.w;
                ((zzcif) this.c).n("onGcacheInfoEvent", (HashMap) this.b);
                return;
            case 7:
                ((zzcms) this.c).a.n("pubVideoCmd", (HashMap) this.b);
                return;
            case 8:
                zzcgj.f.execute(new nkn((zzcrj) this.c, (Runnable) this.b, z, i));
                return;
            case 9:
                zzcub zzcubVar = (zzcub) this.c;
                Throwable th = (Throwable) this.b;
                boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.Vb)).booleanValue();
                Context context2 = zzcubVar.a;
                if (booleanValue) {
                    zzcas e2 = zzcaq.e(context2);
                    zzcubVar.i = e2;
                    e2.a("AttributionReporting.getUpdatedUrlAndRegisterSource", th);
                    return;
                } else {
                    zzcas c2 = zzcaq.c(context2);
                    zzcubVar.h = c2;
                    c2.a("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th);
                    return;
                }
            case 10:
                zzdn zzdnVar = (zzdn) this.c;
                Integer num = (Integer) this.b;
                if (zzdnVar.f == 0) {
                    Object obj = zzdnVar.d;
                    zzdnVar.d = num;
                    if (obj.equals(num)) {
                        return;
                    }
                    xto xtoVar = zzdnVar.c;
                    int intValue = num.intValue();
                    cwo cwoVar = (cwo) xtoVar.b;
                    cwoVar.o();
                    cwoVar.p(1, 10, num);
                    cwoVar.p(2, 10, num);
                    pff pffVar = new pff(intValue);
                    zzeg zzegVar = cwoVar.m;
                    zzegVar.c(21, pffVar);
                    zzegVar.d();
                    return;
                }
                return;
            case 11:
                zzdn zzdnVar2 = (zzdn) this.c;
                Object apply = ((vto) this.b).apply(zzdnVar2.e);
                zzdnVar2.e = apply;
                bnn bnnVar = new bnn(i, zzdnVar2, apply);
                zzea zzeaVar = zzdnVar2.b;
                if (zzeaVar.zza().getThread().isAlive()) {
                    zzeaVar.f(bnnVar);
                    return;
                }
                return;
            case 12:
                s sVar = zzdqm.J;
                ((zzclm) this.c).t("onVideoEvent", (JSONObject) this.b);
                return;
            case 13:
                ((zzeas) this.c).d.zzc((String) this.b, null);
                return;
            case 14:
                ((zzecu) this.c).i.execute(new fsn((zzcgo) this.b, 26));
                return;
            case 15:
                zzek zzekVar = (zzek) this.c;
                zzef zzefVar = (zzef) this.b;
                synchronized (zzekVar.h) {
                    isEmpty = zzekVar.e.isEmpty();
                }
                if (!isEmpty && !zzekVar.i && (connectivityManager = zzekVar.c) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    activeNetworkInfo.isConnected();
                }
                zzefVar.zza();
                return;
            case 16:
                zzfvy zzfvyVar = (zzfvy) this.c;
                ohn ohnVar = (ohn) this.b;
                Iterator it = zzfvyVar.d.values().iterator();
                while (it.hasNext()) {
                    ((zzfvm) it.next()).b();
                }
                Timer timer = new Timer();
                timer.schedule(new q4o(zzfvyVar, ohnVar, timer), 1000L);
                return;
            case 17:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.b).registerReceiver(new d((zzes) this.c, 18), intentFilter);
                return;
            case 18:
                ((zzfgl) ((p03) this.c).f).d.i0((com.google.android.gms.ads.internal.client.zze) this.b);
                return;
            case 19:
                ((zzfjg) ((p03) this.c).f).e.i0((com.google.android.gms.ads.internal.client.zze) this.b);
                return;
            case 20:
                zzfs zzfsVar = (zzfs) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                if (atomicBoolean.get()) {
                    new Thread(new bnn(20, zzfsVar.a, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 21:
                a();
                return;
            case 22:
                zzfvd zzfvdVar = (zzfvd) this.b;
                zzdx zzdxVar = (zzdx) this.c;
                zzcb zzcbVar = zzfvdVar.h;
                if (zzcbVar != null) {
                    try {
                        zzcbVar.zze((zzfp) zzfvdVar.e.get());
                    } catch (RemoteException unused2) {
                        int i5 = zze.zza;
                        zzo.zzi("Failed to call onAdsAvailable");
                    }
                }
                zzce zzceVar = zzfvdVar.i;
                if (zzceVar != null) {
                    try {
                        zzceVar.zze(zzfvdVar.l, zzdxVar);
                        return;
                    } catch (RemoteException unused3) {
                        int i6 = zze.zza;
                        zzo.zzi("Failed to call onAdPreloaded");
                        return;
                    }
                }
                return;
            case 23:
                ((TaskCompletionSource) this.b).setResult(zzgae.a((Context) this.c, "GLAS"));
                return;
            case 24:
                b();
                return;
            case 25:
                zzhj zzhjVar = (zzhj) this.b;
                zzic zzicVar = zzhjVar.b.a;
                zzhz zzhzVar = zzicVar.g;
                zzic.m(zzhzVar);
                zzhzVar.Q();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", zzhjVar.a);
                try {
                    if (((zzbs) this.c).u(bundle) == null) {
                        zzgu zzguVar = zzicVar.f;
                        zzic.m(zzguVar);
                        zzguVar.g.a("Install Referrer Service returned a null response");
                    }
                } catch (Exception e3) {
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.g.b(e3.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                zzhz zzhzVar2 = zzicVar.g;
                zzic.m(zzhzVar2);
                zzhzVar2.Q();
                throw new IllegalStateException("Unexpected call on client side");
            case 26:
                ((ExpandedControllerActivity) ((zgg) this.b).c).u((RemoteMediaClient) this.c);
                return;
            case 27:
                y0p y0pVar = (y0p) this.c;
                Bundle bundle2 = (Bundle) this.b;
                try {
                    i1k i1kVar = y0pVar.a;
                    if (i1kVar == null) {
                        throw null;
                    }
                    tqn tqnVar = (tqn) ((IInterface) i1kVar.k);
                    if (tqnVar == null) {
                        return;
                    }
                    x3n x3nVar = (x3n) tqnVar;
                    Parcel J = x3nVar.J();
                    int i7 = zzc.a;
                    J.writeInt(1);
                    bundle2.writeToParcel(J, 0);
                    x3nVar.S1(J, 3);
                    return;
                } catch (RemoteException unused4) {
                    return;
                }
            case 28:
                zzcs zzcsVar = (zzcs) this.c;
                zzlj zzljVar = (zzlj) this.b;
                zzic zzicVar2 = (zzic) zzljVar.b;
                zzic zzicVar3 = (zzic) zzljVar.b;
                zzoc zzocVar = zzicVar2.h;
                zzic.l(zzocVar);
                zzic zzicVar4 = (zzic) zzocVar.b;
                lmo lmoVar = zzicVar4.e;
                zzic.k(lmoVar);
                if (lmoVar.X().i(zzjk.ANALYTICS_STORAGE)) {
                    zzic.k(lmoVar);
                    zzhe zzheVar = lmoVar.r;
                    zzicVar4.k.getClass();
                    if (!lmoVar.Z(System.currentTimeMillis()) && zzheVar.a() != 0) {
                        valueOf = Long.valueOf(zzheVar.a());
                        if (valueOf == null) {
                            zzpp zzppVar = zzicVar3.i;
                            zzic.k(zzppVar);
                            zzppVar.E0(zzcsVar, valueOf.longValue());
                            return;
                        } else {
                            try {
                                zzcsVar.F(null);
                                return;
                            } catch (RemoteException e4) {
                                zzgu zzguVar3 = zzicVar3.f;
                                zzic.m(zzguVar3);
                                zzguVar3.g.b(e4, "getSessionId failed with exception");
                                return;
                            }
                        }
                    }
                } else {
                    zzgu zzguVar4 = zzicVar4.f;
                    zzic.m(zzguVar4);
                    zzguVar4.l.a("Analytics storage consent denied; will not get session id");
                }
                valueOf = null;
                if (valueOf == null) {
                }
                break;
            default:
                zzic zzicVar5 = (zzic) ((zzlj) this.b).b;
                lmo lmoVar2 = zzicVar5.e;
                zzgu zzguVar5 = zzicVar5.f;
                zzic.k(lmoVar2);
                lmoVar2.Q();
                lmoVar2.Q();
                com.google.android.gms.measurement.internal.zzba b = com.google.android.gms.measurement.internal.zzba.b(lmoVar2.U().getString("dma_consent_settings", null));
                com.google.android.gms.measurement.internal.zzba zzbaVar = (com.google.android.gms.measurement.internal.zzba) this.c;
                int i8 = zzbaVar.a;
                if (!zzjl.l(i8, b.a)) {
                    zzic.m(zzguVar5);
                    zzguVar5.m.b(Integer.valueOf(i8), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor edit = lmoVar2.U().edit();
                edit.putString("dma_consent_settings", zzbaVar.b);
                edit.apply();
                zzic.m(zzguVar5);
                zzguVar5.o.b(zzbaVar, "Setting DMA consent(FE)");
                if (zzicVar5.o().a0()) {
                    zznl o = zzicVar5.o();
                    o.Q();
                    o.R();
                    o.e0(new uyo(o, c == true ? 1 : 0));
                    return;
                }
                zznl o2 = zzicVar5.o();
                o2.Q();
                o2.R();
                if (o2.Z()) {
                    o2.e0(new qxo(o2, o2.g0(false), 1));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ wjn(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj2;
        this.b = obj;
    }

    public wjn(zzhj zzhjVar, zzbs zzbsVar, zzhj zzhjVar2) {
        this.a = 25;
        this.c = zzbsVar;
        this.b = zzhjVar;
    }

    public /* synthetic */ wjn(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
