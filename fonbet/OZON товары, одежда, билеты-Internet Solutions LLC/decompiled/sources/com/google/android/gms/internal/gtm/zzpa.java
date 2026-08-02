package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class zzpa extends zzjv {
    private static final Set<String> zza = new HashSet(Arrays.asList("GET", "HEAD", "POST", "PUT"));
    private final zzha zzb;

    public zzpa(zzha zzhaVar) {
        this.zzb = zzhaVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11 = true;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 1);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzre);
        zzqw<?> zzb = zzqwVarArr[0].zzb(ImagesContract.URL);
        Preconditions.checkArgument(zzb instanceof zzrh);
        String zzk = ((zzrh) zzb).zzk();
        zzqw<?> zzb2 = zzqwVarArr[0].zzb("method");
        zzra zzraVar = zzra.zze;
        if (zzb2 == zzraVar) {
            zzb2 = new zzrh("GET");
        }
        Preconditions.checkArgument(zzb2 instanceof zzrh);
        String zzk2 = ((zzrh) zzb2).zzk();
        Preconditions.checkArgument(zza.contains(zzk2));
        zzqw<?> zzb3 = zzqwVarArr[0].zzb("uniqueId");
        Preconditions.checkArgument(zzb3 == zzraVar || zzb3 == zzra.zzd || (zzb3 instanceof zzrh));
        String zzk3 = (zzb3 == zzraVar || zzb3 == zzra.zzd) ? null : ((zzrh) zzb3).zzk();
        zzqw<?> zzb4 = zzqwVarArr[0].zzb("headers");
        Preconditions.checkArgument(zzb4 == zzraVar || (zzb4 instanceof zzre));
        HashMap hashMap = new HashMap();
        if (zzb4 == zzraVar) {
            hashMap = null;
        } else {
            for (Map.Entry<String, zzqw<?>> entry : ((zzre) zzb4).zzi().entrySet()) {
                String key = entry.getKey();
                zzqw<?> value = entry.getValue();
                if (value instanceof zzrh) {
                    hashMap.put(key, ((zzrh) value).zzk());
                } else {
                    zzhl.zze("Ignore the non-string value of header key " + key + ".");
                }
            }
        }
        zzqw<?> zzb5 = zzqwVarArr[0].zzb("body");
        zzra zzraVar2 = zzra.zze;
        if (zzb5 != zzraVar2 && !(zzb5 instanceof zzrh)) {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        String zzk4 = zzb5 != zzraVar2 ? ((zzrh) zzb5).zzk() : null;
        if ((zzk2.equals("GET") || zzk2.equals("HEAD")) && zzk4 != null) {
            zzhl.zze("Body of " + zzk2 + " hit will be ignored: " + zzk4 + ".");
        }
        HashMap hashMap2 = hashMap;
        this.zzb.zzb(zzk, zzk2, zzk3, hashMap2, zzk4);
        zzhl.zzd(String.format("QueueRequest:\n  url = %s,\n  method = %s,\n  uniqueId = %s,\n  headers = %s,\n  body = %s", zzk, zzk2, zzk3, hashMap2, zzk4));
        return zzraVar2;
    }
}
