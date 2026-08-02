package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzehw extends zzcad {
    private final Context zza;
    private final zzhbs zzb;
    private final zzeie zzc;
    private final zzcre zzd;
    private final ArrayDeque zze;
    private final zzfpv zzf;
    private final zzcaz zzg;

    public zzehw(Context context, zzhbs zzhbsVar, zzcaz zzcazVar, zzcre zzcreVar, zzeie zzeieVar, ArrayDeque arrayDeque, zzeib zzeibVar, zzfpv zzfpvVar) {
        zzbie.zza(context);
        this.zza = context;
        this.zzb = zzhbsVar;
        this.zzg = zzcazVar;
        this.zzc = zzeieVar;
        this.zzd = zzcreVar;
        this.zze = arrayDeque;
        this.zzf = zzfpvVar;
    }

    private static ListenableFuture zzm(final zzcar zzcarVar, zzfoy zzfoyVar, final zzfda zzfdaVar) {
        zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzehk
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfda.this.zzc().zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((Bundle) obj), zzcarVar.zzm);
            }
        };
        return zzfoyVar.zza(zzfos.GMS_SIGNALS, zzhbi.zza(zzcarVar.zza)).zzc(zzhaqVar).zzb(zzehl.zza).zzi();
    }

    private static ListenableFuture zzn(ListenableFuture listenableFuture, zzfoy zzfoyVar, zzbtw zzbtwVar, zzfps zzfpsVar, zzfpi zzfpiVar) {
        zzbtm zza = zzbtwVar.zza("AFMA_getAdDictionary", zzbtt.zza, zzehq.zza);
        zzfpr.zzb(listenableFuture, zzfpiVar);
        zzfof zzi = zzfoyVar.zza(zzfos.BUILD_URL, listenableFuture).zzc(zza).zzi();
        zzfpr.zzf(zzi, zzfpsVar, zzfpiVar);
        return zzi;
    }

    private final void zzo(ListenableFuture listenableFuture, zzcai zzcaiVar, zzcar zzcarVar) {
        zzhbi.zzr(zzhbi.zzj(listenableFuture, new zzhaq(this) { // from class: com.google.android.gms.internal.ads.zzeho
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhbi.zza(zzfln.zza((InputStream) obj));
            }
        }, zzcff.zza), new zzehh(this, zzcarVar, zzcaiVar), zzcff.zzh);
    }

    private final synchronized void zzp() {
        int intValue = ((Long) zzbkl.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= intValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(zzehr zzehrVar) {
        zzp();
        this.zze.addLast(zzehrVar);
    }

    private final synchronized zzehr zzr(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzehr zzehrVar = (zzehr) it.next();
            if (zzehrVar.zzc.equals(str)) {
                it.remove();
                return zzehrVar;
            }
        }
        return null;
    }

    public final ListenableFuture zzb(final zzcar zzcarVar, int i) {
        zzehr zzr;
        zzfof zzi;
        zzbtn zzr2 = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbtw zza = zzr2.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfda zzy = this.zzd.zzy(zzcarVar, i);
        zzbtm zza2 = zza.zza("google.afma.response.normalize", zzeht.zzd, zzbtt.zzb);
        if (((Boolean) zzbkl.zza.zze()).booleanValue()) {
            zzr = zzr(zzcarVar.zzh);
            if (zzr == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzcarVar.zzj;
            zzr = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzehr zzehrVar = zzr;
        zzfpi zzn = zzehrVar == null ? zzfpi.zzn(context, 9) : zzehrVar.zzd;
        zzfps zzf = zzy.zzf();
        zzf.zzb(zzcarVar.zza.getStringArrayList("ad_types"));
        zzeid zzeidVar = new zzeid(zzcarVar.zzg, zzf, zzn);
        zzeia zzeiaVar = new zzeia(context, zzcarVar.zzb.afmaVersion, this.zzg, i, null);
        zzfoy zze = zzy.zze();
        zzfpi zzn2 = zzfpi.zzn(context, 11);
        if (zzehrVar == null) {
            final ListenableFuture zzm = zzm(zzcarVar, zze, zzy);
            final ListenableFuture zzn3 = zzn(zzm, zze, zza, zzf, zzn);
            zzfpi zzn4 = zzfpi.zzn(context, 10);
            final zzfof zzi2 = zze.zzb(zzfos.HTTP, zzn3, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehp
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzcat zzcatVar = (zzcat) ListenableFuture.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle = zzcarVar.zzm) != null) {
                        bundle.putLong(zzdyi.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzcatVar.zzj());
                        bundle.putLong(zzdyi.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzcatVar.zzk());
                    }
                    return new zzeic((JSONObject) zzm.get(), zzcatVar);
                }
            }).zzb(zzeidVar).zzb(zzfpr.zzc(zzn4)).zzb(zzeiaVar).zzi();
            zzfpr.zzd(zzi2, zzf, zzn4);
            zzfpr.zzb(zzi2, zzn2);
            zzi = zze.zzb(zzfos.PRE_PROCESS, zzm, zzn3, zzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle = zzcar.this.zzm) != null) {
                        bundle.putLong(zzdyi.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    return new zzeht((zzehz) zzi2.get(), (JSONObject) zzm.get(), (zzcat) zzn3.get());
                }
            }).zzc(zza2).zzi();
        } else {
            zzeic zzeicVar = new zzeic(zzehrVar.zzb, zzehrVar.zza);
            zzfpi zzn5 = zzfpi.zzn(context, 10);
            final zzfof zzi3 = zze.zza(zzfos.HTTP, zzhbi.zza(zzeicVar)).zzb(zzeidVar).zzb(zzfpr.zzc(zzn5)).zzb(zzeiaVar).zzi();
            zzfpr.zzd(zzi3, zzf, zzn5);
            final ListenableFuture zza3 = zzhbi.zza(zzehrVar);
            zzfpr.zzb(zzi3, zzn2);
            zzi = zze.zzb(zzfos.PRE_PROCESS, zzi3, zza3).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzehz zzehzVar = (zzehz) ListenableFuture.this.get();
                    ListenableFuture listenableFuture = zza3;
                    return new zzeht(zzehzVar, ((zzehr) listenableFuture.get()).zzb, ((zzehr) listenableFuture.get()).zza);
                }
            }).zzc(zza2).zzi();
        }
        zzfpr.zzd(zzi, zzf, zzn2);
        return zzi;
    }

    public final ListenableFuture zzc(final zzcar zzcarVar, int i) {
        if (!((Boolean) zzbkl.zza.zze()).booleanValue()) {
            return zzhbi.zzc(new Exception("Split request is disabled."));
        }
        zzfmi zzfmiVar = zzcarVar.zzi;
        if (zzfmiVar == null) {
            return zzhbi.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzfmiVar.zzc == 0 || zzfmiVar.zzd == 0) {
            return zzhbi.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbtw zza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfda zzy = this.zzd.zzy(zzcarVar, i);
        zzfoy zze = zzy.zze();
        final ListenableFuture zzm = zzm(zzcarVar, zze, zzy);
        zzfps zzf = zzy.zzf();
        final zzfpi zzn = zzfpi.zzn(context, 9);
        final ListenableFuture zzn2 = zzn(zzm, zze, zza, zzf, zzn);
        return zze.zzb(zzfos.GET_URL_AND_CACHE_KEY, zzm, zzn2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzehw.this.zzl(zzn2, zzm, zzcarVar, zzn);
            }
        }).zzi();
    }

    public final ListenableFuture zzd(String str) {
        if (!((Boolean) zzbkl.zza.zze()).booleanValue()) {
            return zzhbi.zzc(new Exception("Split request is disabled."));
        }
        zzehg zzehgVar = new zzehg(this);
        if (zzr(str) != null) {
            return zzhbi.zza(zzehgVar);
        }
        String.valueOf(str);
        return zzhbi.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zze(zzcar zzcarVar, zzcai zzcaiVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle = zzcarVar.zzm) != null) {
            bundle.putLong(zzdyi.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture zzb = zzb(zzcarVar, Binder.getCallingUid());
        zzo(zzb, zzcaiVar, zzcarVar);
        if (((Boolean) zzbke.zzi.zze()).booleanValue()) {
            final zzeie zzeieVar = this.zzc;
            Objects.requireNonNull(zzeieVar);
            zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeie.this.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzf(zzcar zzcarVar, zzcai zzcaiVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle = zzcarVar.zzm) != null) {
            bundle.putLong(zzdyi.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzo(zzk(zzcarVar, Binder.getCallingUid()), zzcaiVar, zzcarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzg(zzcar zzcarVar, zzcai zzcaiVar) {
        zzo(zzc(zzcarVar, Binder.getCallingUid()), zzcaiVar, zzcarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzh(String str, zzcai zzcaiVar) {
        zzo(zzd(str), zzcaiVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpy)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpz);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> zzd = zzgtl.zza(zzgsk.zzc(AbstractJsonLexerKt.COMMA)).zzd(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (String str3 : zzd) {
                Context context = this.zza;
                zzeia zzeiaVar = new zzeia(context, str, this.zzg, callingUid, "HEAD");
                HashMap hashMap = new HashMap();
                hashMap.put(HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                zzehy zzehyVar = new zzehy(str3, 30000, hashMap, new byte[0], "", false);
                try {
                    zzehy zzehyVar2 = zzehyVar;
                    zzehz zza = zzeiaVar.zza(zzehyVar);
                    zzehz zzehzVar = zza;
                    if (zza.zza != 200) {
                        int i = zza.zza;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i);
                        throw new RemoteException(sb.toString());
                    }
                } catch (Exception e) {
                    throw new RemoteException(e.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzj(zzcaa zzcaaVar, zzcaj zzcajVar) {
        if (((Boolean) zzbkt.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzcaaVar.zza;
            zzhbi.zzr(zzhbi.zza(null), new zzehf(this, zzcajVar, zzcaaVar), zzcff.zzh);
        } else {
            try {
                zzcajVar.zze("", zzcaaVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
            }
        }
    }

    public final ListenableFuture zzk(final zzcar zzcarVar, int i) {
        zzbtn zzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbtw zza = zzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbkr.zza.zze()).booleanValue()) {
            return zzhbi.zzc(new Exception("Signal collection disabled."));
        }
        zzfda zzy = this.zzd.zzy(zzcarVar, i);
        final zzfcb zzd = zzy.zzd();
        zzbtm zza2 = zza.zza("google.afma.request.getSignals", zzbtt.zza, zzbtt.zzb);
        zzfpi zzn = zzfpi.zzn(context, 22);
        zzfoy zze = zzy.zze();
        zzfos zzfosVar = zzfos.GET_SIGNALS;
        Bundle bundle = zzcarVar.zza;
        zzfof zzi = zze.zza(zzfosVar, zzhbi.zza(bundle)).zzb(zzfpr.zzc(zzn)).zzc(new zzhaq() { // from class: com.google.android.gms.internal.ads.zzehn
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfcb.this.zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((Bundle) obj), zzcarVar.zzm);
            }
        }).zzj(zzfos.JS_SIGNALS).zzc(zza2).zzi();
        zzfps zzf = zzy.zzf();
        zzf.zzb(bundle.getStringArrayList("ad_types"));
        zzf.zzd(bundle.getBundle("extras"));
        zzfpr.zze(zzi, zzf, zzn);
        if (((Boolean) zzbke.zzj.zze()).booleanValue()) {
            final zzeie zzeieVar = this.zzc;
            Objects.requireNonNull(zzeieVar);
            zzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeie.this.zza();
                }
            }, this.zzb);
        }
        return zzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzl(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzcar zzcarVar, zzfpi zzfpiVar) {
        String zzi = ((zzcat) listenableFuture.get()).zzi();
        zzq(new zzehr((zzcat) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzcarVar.zzh, zzi, zzfpiVar));
        return new ByteArrayInputStream(zzi.getBytes(StandardCharsets.UTF_8));
    }
}
