package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfcb {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfps zzd;

    public zzfcb(Context context, Executor executor, Set set, zzfps zzfpsVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfpsVar;
    }

    public final ListenableFuture zza(final Object obj, final Bundle bundle) {
        zzfpi zzn = zzfpi.zzn(this.zza, 8);
        zzn.zza();
        Set<zzfby> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbhv zzbhvVar = zzbie.zzng;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).split(","));
        }
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && bundle != null) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdyi.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle.putLong(zzdyi.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (final zzfby zzfbyVar : set) {
            if (!arrayList2.contains(String.valueOf(zzfbyVar.zzb()))) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                ListenableFuture zza = zzfbyVar.zza();
                zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                        boolean booleanValue = ((Boolean) zzbkg.zza.zze()).booleanValue();
                        Bundle bundle3 = bundle2;
                        zzfby zzfbyVar2 = zzfbyVar;
                        if (booleanValue) {
                            String zza2 = zzgtn.zza(zzfbyVar2.getClass().getCanonicalName());
                            StringBuilder sb = new StringBuilder(zza2.length() + 25 + String.valueOf(elapsedRealtime2).length());
                            sb.append("Signal runtime (ms) : ");
                            sb.append(zza2);
                            sb.append(" = ");
                            sb.append(elapsedRealtime2);
                            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue()) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcT)).booleanValue()) {
                                synchronized (zzfcb.this) {
                                    int zzb = zzfbyVar2.zzb();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 3);
                                    sb2.append("sig");
                                    sb2.append(zzb);
                                    bundle3.putLong(sb2.toString(), elapsedRealtime2);
                                }
                            }
                        }
                    }
                }, zzcff.zzh);
                arrayList.add(zza);
            }
        }
        ListenableFuture zza2 = zzhbi.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfca
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfbw zzfbwVar = (zzfbw) ((ListenableFuture) it.next()).get();
                    if (zzfbwVar != null) {
                        zzfbwVar.zza(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdyi.CLIENT_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                        return obj2;
                    }
                    bundle3.putLong(zzdyi.GMS_SIGNALS_END.zza(), currentTimeMillis2);
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfpv.zza()) {
            zzfpr.zzd(zza2, this.zzd, zzn);
        }
        return zza2;
    }
}
