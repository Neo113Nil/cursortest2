package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfrf {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final zzhbt zzc;
    private final zzfrg zzd;
    private final zzcmu zze;

    public zzfrf(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzhbt zzhbtVar, zzfrg zzfrgVar, zzcmu zzcmuVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzhbtVar;
        this.zzd = zzfrgVar;
        this.zze = zzcmuVar;
    }

    private final ListenableFuture zze(final String str, final long j, final int i) {
        final String str2;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i > zzxVar.zza()) {
            zzfrg zzfrgVar = this.zzd;
            if (zzfrgVar == null || !zzxVar.zzd()) {
                return zzhbi.zza(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
            }
            zzfrgVar.zza(str, "", 2);
            return zzhbi.zza(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjO)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            String valueOf = String.valueOf(clearQuery.build());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(encodedQuery).length());
            sb.append(valueOf);
            sb.append(X3.j.c);
            sb.append(encodedQuery);
            str2 = sb.toString();
        } else {
            str2 = str;
        }
        zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzfre
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfrf.this.zzb(i, j, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j == 0) {
            zzhbt zzhbtVar = this.zzc;
            return zzhbi.zzj(zzhbtVar.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfrd
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzfrf.this.zzd(str2);
                }
            }), zzhaqVar, zzhbtVar);
        }
        zzhbt zzhbtVar2 = this.zzc;
        return zzhbi.zzj(zzhbtVar2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfrc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfrf.this.zzc(str2);
            }
        }, j, TimeUnit.MILLISECONDS), zzhaqVar, zzhbtVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.client.zzt zzd(String str) {
        zzcmu zzcmuVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkg)).booleanValue() || (zzcmuVar = this.zze) == null || (!com.google.android.gms.ads.internal.zzt.zzc().zzh(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzi(str))) {
            return this.zzb.zzc(str, null);
        }
        String zzb = zzcmuVar.zzb();
        HashMap hashMap = new HashMap();
        if (zzb != null) {
            hashMap.put((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkh), zzb);
        }
        return this.zzb.zzc(str, hashMap);
    }

    public final ListenableFuture zza(String str) {
        if (str != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzg)).booleanValue() || !str.isEmpty()) {
                try {
                    return zze(str, 0L, 1);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return zzhbi.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
                }
            }
        }
        return zzhbi.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
    }

    final /* synthetic */ ListenableFuture zzb(int i, long j, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzhbi.zza(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        long zzb = zzxVar.zzb();
        if (i != 1) {
            zzb = (long) (zzxVar.zzc() * j);
        }
        return zze(str, zzb, i + 1);
    }
}
