package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzhz implements zzhx {

    @NotNull
    private final zzhy zza;

    public zzhz(@NotNull zzhy zzhyVar, @NotNull zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    private final zztz zzb(String str, List list) {
        zzhu zzhuVar;
        if (str.length() == 0) {
            throw new zzce(3, 17, null);
        }
        try {
            long zza = this.zza.zza(CollectionsKt.toLongArray(list));
            zzhuVar = zzhv.zza;
            zzhv zzhvVar = new zzhv(zza, 255L, zzhuVar);
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append((char) UInt.m242constructorimpl(UInt.m242constructorimpl(str.charAt(i10)) ^ UInt.m242constructorimpl((int) zzhvVar.zza())));
            }
            return zztz.zzg(zzkh.zzh().zzj(sb2.toString()));
        } catch (Exception e10) {
            throw new zzce(3, 18, e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    @NotNull
    public final zztz zza(@NotNull zzub zzubVar) {
        zzjh zzb = zzjh.zzb();
        zztz zzb2 = zzb(zzubVar.zzj(), zzubVar.zzk());
        zzb.zzf();
        long zza = zzb.zza(TimeUnit.MICROSECONDS);
        int i10 = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), zza);
        return zzb2;
    }
}
