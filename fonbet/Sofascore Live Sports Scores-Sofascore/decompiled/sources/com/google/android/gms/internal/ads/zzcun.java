package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.ahn;
import defpackage.c0l;
import defpackage.eho;
import defpackage.hsn;
import defpackage.kwn;
import defpackage.lwn;
import defpackage.ohn;
import defpackage.qgo;
import defpackage.uko;
import defpackage.vlo;
import defpackage.xlo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcun implements zzddp, zzdfd, zzdej, com.google.android.gms.ads.internal.client.zza, zzdef, zzdln, zzdgk {
    public final Context a;
    public final hsn b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final zzflo e;
    public final zzfld f;
    public final zzfta g;
    public final zzfmj h;
    public final zzbbd i;
    public final zzbkn j;
    public final WeakReference k;
    public final WeakReference l;
    public final zzdcs m;
    public final zzdge n;
    public final zzdck o;
    public final Set p;
    public boolean q;
    public final AtomicBoolean r = new AtomicBoolean();
    public zzcfw s = null;

    public zzcun(Context context, hsn hsnVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzflo zzfloVar, zzfld zzfldVar, zzfta zzftaVar, zzfmj zzfmjVar, View view, zzclm zzclmVar, zzbbd zzbbdVar, zzbkn zzbknVar, zzdcs zzdcsVar, zzdge zzdgeVar, zzdck zzdckVar, Set set) {
        this.a = context;
        this.b = hsnVar;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.e = zzfloVar;
        this.f = zzfldVar;
        this.g = zzftaVar;
        this.h = zzfmjVar;
        this.i = zzbbdVar;
        this.k = new WeakReference(view);
        this.l = new WeakReference(zzclmVar);
        this.j = zzbknVar;
        this.m = zzdcsVar;
        this.n = zzdgeVar;
        this.o = zzdckVar;
        this.p = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        int i;
        zzcfw zzcfwVar;
        zzfld zzfldVar = this.f;
        List list = zzfldVar.d;
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z = false;
        Object[] objArr = 0;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Cf)).booleanValue() && this.s == null) {
            zzcga zzcgaVar = com.google.android.gms.ads.internal.zzt.zzh().c;
            Set set = this.p;
            String str = this.e.a.a.g;
            zzcfx zzcfxVar = zzcgaVar.d;
            synchronized (zzcfxVar.g) {
                try {
                    int i2 = zzcfxVar.m;
                    zzcfxVar.m = i2 + 1;
                    if (set.isEmpty()) {
                        zzcfwVar = new zzcfw(i2, -1, -1);
                    } else {
                        String join = String.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, new TreeSet(set));
                        HashMap hashMap = zzcfxVar.n;
                        Integer num = (Integer) hashMap.get(join);
                        int intValue = num == null ? 0 : num.intValue();
                        hashMap.put(join, Integer.valueOf(intValue + 1));
                        if (str == null) {
                            zzcfwVar = new zzcfw(i2, intValue, -1);
                        } else {
                            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(join).length());
                            sb.append(str);
                            sb.append("|");
                            sb.append(join);
                            String sb2 = sb.toString();
                            HashMap hashMap2 = zzcfxVar.o;
                            Integer num2 = (Integer) hashMap2.get(sb2);
                            int intValue2 = num2 == null ? 0 : num2.intValue();
                            hashMap2.put(sb2, Integer.valueOf(intValue2 + 1));
                            zzcfwVar = new zzcfw(i2, intValue, intValue2);
                        }
                    }
                } finally {
                }
            }
            this.s = zzcfwVar;
        }
        String zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B4)).booleanValue() ? this.i.b.zzj(this.a, (View) this.k.get(), null) : null;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.i1)).booleanValue() && this.e.b.b.h) || !((Boolean) zzblg.h.c()).booleanValue()) {
            this.h.a(this.g.b(this.e, zzfldVar, false, zzj, null, c(), this.o, this.s), this.n);
            return;
        }
        if (((Boolean) zzblg.g.c()).booleanValue() && ((i = zzfldVar.b) == 1 || i == 2 || i == 5)) {
        }
        zzhcq zzhcqVar = (zzhcq) zzhcy.g(zzhcq.r(xlo.b), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M1)).longValue(), TimeUnit.MILLISECONDS, this.d);
        zzhcqVar.addListener(new vlo(objArr == true ? 1 : 0, zzhcqVar, new c0l(this, zzj, z, 26)), this.b);
    }

    public final List c() {
        List list = this.f.d;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Zc)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.a;
            if (com.google.android.gms.ads.internal.util.zzs.zzE(context)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                Integer zzu = com.google.android.gms.ads.internal.util.zzs.zzu(context);
                if (zzu != null) {
                    int min = Math.min(zzu.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    public final void h(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.k.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            A();
        } else {
            this.d.schedule(new lwn(this, i, i2, 0), i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        if (this.r.compareAndSet(false, true)) {
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K4)).intValue();
            if (intValue > 0) {
                h(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L4)).intValue());
                return;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.J4)).booleanValue()) {
                A();
            } else {
                this.c.execute(new kwn(this, 0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void n(zzcce zzcceVar, String str, String str2) {
        eho ehoVar;
        zzgui zzguiVar;
        zzfld zzfldVar = this.f;
        List list = zzfldVar.h;
        zzfta zzftaVar = this.g;
        zzftaVar.getClass();
        ArrayList arrayList = new ArrayList();
        long a = zzftaVar.h.a();
        try {
            String str3 = zzcceVar.a;
            String num = Integer.toString(zzcceVar.b);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.C4)).booleanValue()) {
                zzflq zzflqVar = zzftaVar.g;
                if (zzflqVar == null) {
                    zzguiVar = qgo.a;
                } else {
                    zzflp zzflpVar = zzflqVar.a;
                    if (zzflpVar != null) {
                        ehoVar = new eho(zzflpVar);
                        zzguiVar = ehoVar;
                    }
                    zzguiVar = qgo.a;
                }
            } else {
                zzflp zzflpVar2 = zzftaVar.f;
                if (zzflpVar2 != null) {
                    ehoVar = new eho(zzflpVar2);
                    zzguiVar = ehoVar;
                }
                zzguiVar = qgo.a;
            }
            String str4 = (String) zzguiVar.e(ahn.s).d();
            String str5 = (String) zzguiVar.e(ahn.r).d();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzcet.a(zzfta.c(zzfta.c(zzfta.c(zzfta.c(zzfta.c(zzfta.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(a)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", num), "@gw_sdkver@", zzftaVar.b), zzftaVar.e, zzfldVar.W, zzfldVar.w0));
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to determine award type and amount.", e);
        }
        this.h.a(arrayList, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.i1)).booleanValue();
        zzflo zzfloVar = this.e;
        if ((booleanValue && zzfloVar.b.b.h) || !((Boolean) zzblg.d.c()).booleanValue()) {
            zzfld zzfldVar = this.f;
            this.h.b(this.g.a(zzfloVar, zzfldVar, zzfldVar.c), true == com.google.android.gms.ads.internal.zzt.zzh().i(this.a) ? 2 : 1);
        } else {
            zzbkn zzbknVar = this.j;
            zzbknVar.getClass();
            uko e = zzhcy.e(zzhcq.r((zzhcq) zzhcy.g(zzhcq.r(xlo.b), ((Long) zzblg.c.c()).longValue(), TimeUnit.MILLISECONDS, zzbknVar.c)), Throwable.class, ahn.e, zzcgj.h);
            e.addListener(new vlo(0, e, new ohn(this, 6)), this.b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void t(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.l2)).booleanValue()) {
            int i = zzeVar.zza;
            ArrayList arrayList = new ArrayList();
            zzfld zzfldVar = this.f;
            for (String str : zzfldVar.o) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(zzfta.c(str, "@gw_mpe@", sb.toString()));
            }
            this.h.a(this.g.a(this.e, zzfldVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
        zzfld zzfldVar = this.f;
        this.h.a(this.g.a(this.e, zzfldVar, zzfldVar.g), null);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
        zzfld zzfldVar = this.f;
        this.h.a(this.g.a(this.e, zzfldVar, zzfldVar.i), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzg() {
        zzdcs zzdcsVar;
        long j;
        try {
            if (this.q) {
                ArrayList arrayList = new ArrayList(c());
                zzfld zzfldVar = this.f;
                arrayList.addAll(zzfldVar.f);
                this.h.a(this.g.b(this.e, zzfldVar, true, null, null, arrayList, null, null), null);
            } else {
                zzfmj zzfmjVar = this.h;
                zzfta zzftaVar = this.g;
                zzflo zzfloVar = this.e;
                zzfld zzfldVar2 = this.f;
                zzfmjVar.a(zzftaVar.a(zzfloVar, zzfldVar2, zzfldVar2.m), null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G4)).booleanValue() && (zzdcsVar = this.m) != null) {
                    List list = zzdcsVar.b.m;
                    String d = zzdcsVar.c.d();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzfta.c((String) it.next(), "@gw_adnetstatus@", d));
                    }
                    zzeqb zzeqbVar = zzdcsVar.c;
                    synchronized (zzeqbVar) {
                        j = zzeqbVar.h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(zzfta.c((String) it2.next(), "@gw_ttr@", Long.toString(j, 10)));
                    }
                    zzfmjVar.a(zzftaVar.a(zzdcsVar.a, zzdcsVar.b, arrayList3), null);
                }
                zzfmjVar.a(zzftaVar.a(zzfloVar, zzfldVar2, zzfldVar2.f), null);
            }
            this.q = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdln
    public final void zzi() {
        zzfld zzfldVar = this.f;
        this.h.a(this.g.a(this.e, zzfldVar, zzfldVar.u0), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final void zzk() {
        zzfld zzfldVar = this.f;
        if (zzfldVar.e == 4) {
            this.h.a(this.g.a(this.e, zzfldVar, zzfldVar.A0), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void I() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void L() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void a0() {
    }
}
