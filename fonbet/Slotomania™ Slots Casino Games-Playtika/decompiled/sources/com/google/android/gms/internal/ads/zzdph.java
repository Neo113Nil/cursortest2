package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdph {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzea zzb;
    private zzbll zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzew zzg;
    private Bundle zzh;
    private zzcki zzi;
    private zzcki zzj;
    private zzcki zzk;
    private zzelb zzl;
    private ListenableFuture zzm;
    private zzcfk zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbls zzs;
    private zzbls zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdph zzaf(zzbvf zzbvfVar) {
        try {
            return zzak(zzam(zzbvfVar.zzn(), zzbvfVar), zzbvfVar.zzo(), (View) zzal(zzbvfVar.zzp()), zzbvfVar.zze(), zzbvfVar.zzf(), zzbvfVar.zzg(), zzbvfVar.zzs(), zzbvfVar.zzi(), (View) zzal(zzbvfVar.zzq()), zzbvfVar.zzr(), zzbvfVar.zzl(), zzbvfVar.zzm(), zzbvfVar.zzk(), zzbvfVar.zzh(), zzbvfVar.zzj(), zzbvfVar.zzz());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzdph zzag(zzbvc zzbvcVar) {
        try {
            zzdpg zzam = zzam(zzbvcVar.zzs(), null);
            zzbll zzt = zzbvcVar.zzt();
            View view = (View) zzal(zzbvcVar.zzr());
            String zze = zzbvcVar.zze();
            List zzf = zzbvcVar.zzf();
            String zzg = zzbvcVar.zzg();
            Bundle zzp = zzbvcVar.zzp();
            String zzi = zzbvcVar.zzi();
            View view2 = (View) zzal(zzbvcVar.zzu());
            IObjectWrapper zzv = zzbvcVar.zzv();
            String zzj = zzbvcVar.zzj();
            zzbls zzh = zzbvcVar.zzh();
            zzdph zzdphVar = new zzdph();
            zzdphVar.zza = 1;
            zzdphVar.zzb = zzam;
            zzdphVar.zzc = zzt;
            zzdphVar.zzd = view;
            zzdphVar.zzs("headline", zze);
            zzdphVar.zze = zzf;
            zzdphVar.zzs("body", zzg);
            zzdphVar.zzh = zzp;
            zzdphVar.zzs("call_to_action", zzi);
            zzdphVar.zzo = view2;
            zzdphVar.zzq = zzv;
            zzdphVar.zzs(X3.i.F0, zzj);
            zzdphVar.zzt = zzh;
            return zzdphVar;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdph zzah(zzbvb zzbvbVar) {
        zzdph zzdphVar;
        try {
            zzdpg zzam = zzam(zzbvbVar.zzt(), null);
            zzbll zzv = zzbvbVar.zzv();
            View view = (View) zzal(zzbvbVar.zzu());
            String zze = zzbvbVar.zze();
            List zzf = zzbvbVar.zzf();
            String zzg = zzbvbVar.zzg();
            Bundle zzr = zzbvbVar.zzr();
            String zzi = zzbvbVar.zzi();
            View view2 = (View) zzal(zzbvbVar.zzw());
            IObjectWrapper zzx = zzbvbVar.zzx();
            String zzk = zzbvbVar.zzk();
            String zzl = zzbvbVar.zzl();
            double zzj = zzbvbVar.zzj();
            zzbls zzh = zzbvbVar.zzh();
            zzdphVar = null;
            try {
                zzdph zzdphVar2 = new zzdph();
                zzdphVar2.zza = 2;
                zzdphVar2.zzb = zzam;
                zzdphVar2.zzc = zzv;
                zzdphVar2.zzd = view;
                zzdphVar2.zzs("headline", zze);
                zzdphVar2.zze = zzf;
                zzdphVar2.zzs("body", zzg);
                zzdphVar2.zzh = zzr;
                zzdphVar2.zzs("call_to_action", zzi);
                zzdphVar2.zzo = view2;
                zzdphVar2.zzq = zzx;
                zzdphVar2.zzs(X3.i.U, zzk);
                zzdphVar2.zzs("price", zzl);
                zzdphVar2.zzr = zzj;
                zzdphVar2.zzs = zzh;
                return zzdphVar2;
            } catch (RemoteException e) {
                e = e;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
                return zzdphVar;
            }
        } catch (RemoteException e2) {
            e = e2;
            zzdphVar = null;
        }
    }

    public static zzdph zzai(zzbvb zzbvbVar) {
        try {
            return zzak(zzam(zzbvbVar.zzt(), null), zzbvbVar.zzv(), (View) zzal(zzbvbVar.zzu()), zzbvbVar.zze(), zzbvbVar.zzf(), zzbvbVar.zzg(), zzbvbVar.zzr(), zzbvbVar.zzi(), (View) zzal(zzbvbVar.zzw()), zzbvbVar.zzx(), zzbvbVar.zzk(), zzbvbVar.zzl(), zzbvbVar.zzj(), zzbvbVar.zzh(), null, 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdph zzaj(zzbvc zzbvcVar) {
        try {
            return zzak(zzam(zzbvcVar.zzs(), null), zzbvcVar.zzt(), (View) zzal(zzbvcVar.zzr()), zzbvcVar.zze(), zzbvcVar.zzf(), zzbvcVar.zzg(), zzbvcVar.zzp(), zzbvcVar.zzi(), (View) zzal(zzbvcVar.zzu()), zzbvcVar.zzv(), null, null, -1.0d, zzbvcVar.zzh(), zzbvcVar.zzj(), 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdph zzak(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbll zzbllVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbls zzblsVar, String str6, float f) {
        zzdph zzdphVar = new zzdph();
        zzdphVar.zza = 6;
        zzdphVar.zzb = zzeaVar;
        zzdphVar.zzc = zzbllVar;
        zzdphVar.zzd = view;
        zzdphVar.zzs("headline", str);
        zzdphVar.zze = list;
        zzdphVar.zzs("body", str2);
        zzdphVar.zzh = bundle;
        zzdphVar.zzs("call_to_action", str3);
        zzdphVar.zzo = view2;
        zzdphVar.zzq = iObjectWrapper;
        zzdphVar.zzs(X3.i.U, str4);
        zzdphVar.zzs("price", str5);
        zzdphVar.zzr = d;
        zzdphVar.zzs = zzblsVar;
        zzdphVar.zzs(X3.i.F0, str6);
        zzdphVar.zzu(f);
        return zzdphVar;
    }

    private static Object zzal(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzdpg zzam(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbvf zzbvfVar) {
        if (zzeaVar == null) {
            return null;
        }
        return new zzdpg(zzeaVar, zzbvfVar);
    }

    public final synchronized View zzA() {
        return this.zzd;
    }

    public final synchronized String zzB() {
        return zzw("headline");
    }

    public final synchronized List zzC() {
        return this.zze;
    }

    public final zzbls zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzblr.zzh((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzew zzF() {
        return this.zzg;
    }

    public final synchronized String zzG() {
        return zzw("body");
    }

    public final synchronized Bundle zzH() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    public final synchronized View zzJ() {
        return this.zzo;
    }

    public final synchronized View zzK() {
        return this.zzp;
    }

    public final synchronized IObjectWrapper zzL() {
        return this.zzq;
    }

    public final synchronized String zzM() {
        return zzw(X3.i.U);
    }

    public final synchronized String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    public final synchronized zzbls zzP() {
        return this.zzs;
    }

    public final synchronized String zzQ() {
        return zzw(X3.i.F0);
    }

    public final synchronized zzbls zzR() {
        return this.zzt;
    }

    public final synchronized String zzS() {
        return this.zzu;
    }

    public final synchronized zzcki zzT() {
        return this.zzi;
    }

    public final synchronized zzcki zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    public final synchronized zzcki zzW() {
        return this.zzk;
    }

    public final synchronized ListenableFuture zzX() {
        return this.zzm;
    }

    public final synchronized zzcfk zzY() {
        return this.zzn;
    }

    public final synchronized zzelb zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i) {
        this.zza = i;
    }

    public final synchronized SimpleArrayMap zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized SimpleArrayMap zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        zzcki zzckiVar = this.zzi;
        if (zzckiVar != null) {
            zzckiVar.destroy();
            this.zzi = null;
        }
        zzcki zzckiVar2 = this.zzj;
        if (zzckiVar2 != null) {
            zzckiVar2.destroy();
            this.zzj = null;
        }
        zzcki zzckiVar3 = this.zzk;
        if (zzckiVar3 != null) {
            zzckiVar3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzcfk zzcfkVar = this.zzn;
        if (zzcfkVar != null) {
            zzcfkVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zzb = zzeaVar;
    }

    public final synchronized void zzc(zzbll zzbllVar) {
        this.zzc = zzbllVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzew zzewVar) {
        this.zzg = zzewVar;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d) {
        this.zzr = d;
    }

    public final synchronized void zzj(zzbls zzblsVar) {
        this.zzs = zzblsVar;
    }

    public final synchronized void zzk(zzbls zzblsVar) {
        this.zzt = zzblsVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzcki zzckiVar) {
        this.zzi = zzckiVar;
    }

    public final synchronized void zzn(zzcki zzckiVar) {
        this.zzj = zzckiVar;
    }

    public final synchronized void zzo(zzcki zzckiVar) {
        this.zzk = zzckiVar;
    }

    public final synchronized void zzp(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzq(zzelb zzelbVar) {
        this.zzl = zzelbVar;
    }

    public final synchronized void zzr(zzcfk zzcfkVar) {
        this.zzn = zzcfkVar;
    }

    public final synchronized void zzs(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized void zzt(String str, zzbld zzbldVar) {
        if (zzbldVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbldVar);
        }
    }

    public final synchronized void zzu(float f) {
        this.zzx = f;
    }

    public final synchronized void zzv(String str) {
        this.zzy = str;
    }

    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzea zzy() {
        return this.zzb;
    }

    public final synchronized zzbll zzz() {
        return this.zzc;
    }
}
