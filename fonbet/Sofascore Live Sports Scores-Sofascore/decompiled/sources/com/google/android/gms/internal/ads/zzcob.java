package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.c40;
import defpackage.fjg;
import defpackage.fsn;
import defpackage.hsn;
import defpackage.ivn;
import defpackage.nc3;
import defpackage.qpn;
import defpackage.sx2;
import defpackage.tun;
import defpackage.uun;
import defpackage.vng;
import defpackage.wun;
import defpackage.x3o;
import defpackage.x6k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcob implements zzcsi {
    public static uun a;

    public static uun c(Context context, zzbvu zzbvuVar, int i) {
        zzhdi zzhdiVar;
        SharedPreferences sharedPreferences;
        new zzcpl();
        synchronized (zzcob.class) {
            try {
                uun uunVar = a;
                if (uunVar != null) {
                    return uunVar;
                }
                long a2 = com.google.android.gms.ads.internal.zzt.zzk().a();
                zzbjg.a(context);
                int i2 = 0;
                int i3 = 1;
                if (((Boolean) zzbkz.e.c()).booleanValue() && (sharedPreferences = context.getSharedPreferences(InneractiveMediationNameConsts.ADMOB, 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", zzbir.b(context, "init_without_write") + 1).commit();
                }
                zzfms a3 = zzfms.a(context);
                com.google.android.gms.ads.internal.zzt.zzc();
                boolean zzH = com.google.android.gms.ads.internal.util.zzs.zzH(a3.a);
                VersionInfoParcel versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i, true, zzH);
                if (((Boolean) zzbli.c.c()).booleanValue()) {
                    com.google.android.gms.ads.internal.client.zzcv zzcvVar = a3.b;
                    zzez zzezVar = null;
                    if (zzcvVar != null) {
                        try {
                            zzezVar = zzcvVar.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (zzezVar != null) {
                        versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, zzezVar.zza(), true, zzH);
                    }
                }
                a3.b(zzbvuVar);
                zzcqa zzcqaVar = new zzcqa();
                zzcoc zzcocVar = new zzcoc();
                zzcocVar.a = versionInfoParcel;
                zzcocVar.d = new WeakReference(context);
                zzcocVar.b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                zzcocVar.c = a2;
                zzcqaVar.a = new zzcod(zzcocVar);
                zzcqaVar.b = new zzcqx();
                uun a4 = zzcqaVar.a();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Df)).booleanValue()) {
                    zzcge zze = com.google.android.gms.ads.internal.zzt.zze();
                    hsn hsnVar = zzcgj.a;
                    zzioe.a(hsnVar);
                    zze.a(hsnVar, a4.u(), context);
                    zzcge zze2 = com.google.android.gms.ads.internal.zzt.zze();
                    if (zze2.d.get() && zze2.f >= 0 && zze2.g >= 0 && zze2.e.compareAndSet(false, true) && (zzhdiVar = zze2.a) != null) {
                        zzhdiVar.submit(new fsn(zze2, i2));
                    }
                }
                ((zzeez) a4.r.zzb()).a();
                ((zzcnu) a4.q.zzb()).a(context, versionInfoParcel);
                com.google.android.gms.ads.internal.zzt.zzh().b(context, versionInfoParcel, a4.u());
                com.google.android.gms.ads.internal.zzt.zzj().a(context);
                com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
                com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
                com.google.android.gms.ads.internal.util.zzd.zza(context);
                com.google.android.gms.ads.internal.zzt.zzg().a(context);
                com.google.android.gms.ads.internal.zzt.zzA().zza(context);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Zf)).booleanValue()) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ag);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)).contains(context.getPackageName())) {
                            ((zzdxs) a4.Z.zzb()).a(com.google.android.gms.ads.internal.zzt.zzg());
                        }
                    }
                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Yf)).booleanValue()) {
                    ((zzdxs) a4.Z.zzb()).a(com.google.android.gms.ads.internal.zzt.zzg());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.jg)).booleanValue()) {
                    ((DeviceTierManager) a4.m.zzb()).initialize();
                }
                ((com.google.android.gms.ads.internal.util.zzbz) a4.Y.zzb()).zza();
                zzces.b(context);
                com.google.android.gms.ads.internal.zzt.zzD().e = a4.u();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n7)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n1)).booleanValue()) {
                        zzbif zzbifVar = new zzbif(new zzbik(context));
                        zzejx zzejxVar = new zzejx(new zzejt(context), (zzhdi) a4.f.zzb());
                        try {
                            zzejxVar.a(new fjg(new zzeks(context, versionInfoParcel, zzbifVar, zzejxVar), com.google.android.gms.ads.internal.zzt.zzh().g().zzx()));
                        } catch (Exception e) {
                            String valueOf = String.valueOf(e.getMessage());
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzf("Error in offline signals database startup: ".concat(valueOf));
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Sf)).booleanValue()) {
                    Context context2 = a4.b.b;
                    zzioe.a(context2);
                    hsn hsnVar2 = zzcgj.a;
                    zzioe.a(hsnVar2);
                    hsnVar2.execute(new x3o(new zzeie(a4, context2, hsnVar2), i3));
                }
                a = a4;
                return a4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract zzfmm a();

    public abstract zzcfl b();

    public abstract Executor d();

    public abstract ScheduledExecutorService e();

    public abstract zzdgq f();

    public abstract c40 g();

    public abstract wun h();

    public abstract vng i();

    public abstract qpn j();

    public abstract nc3 k();

    public abstract ivn l();

    public abstract x6k m();

    public abstract sx2 n();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzq o();

    public abstract zzfmv p();

    public abstract zzedp q();

    public abstract zzfrj r();

    public final zzfek s(zzcbv zzcbvVar, int i) {
        return t(new zzffn(zzcbvVar, i));
    }

    public abstract tun t(zzffn zzffnVar);
}
