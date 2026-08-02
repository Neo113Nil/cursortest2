package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public abstract class zzfzg implements Closeable {
    public static zzfzs zza() {
        return new zzfzs();
    }

    public static zzfzs zzb(zzgto<Integer> zzgtoVar, zzgto<Integer> zzgtoVar2, zzfzi zzfziVar) {
        return new zzfzs(zzgtoVar, zzgtoVar2, zzfziVar);
    }

    public static zzfzs zzc(final int i, zzfzi zzfziVar) {
        return new zzfzs(new zzgto() { // from class: com.google.android.gms.internal.ads.zzfzf
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        }, zzfze.zza, zzfziVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzf() {
        return -1;
    }
}
