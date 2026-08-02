package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzkb extends zzjv {
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.gms.internal.gtm.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11;
        Preconditions.checkNotNull(zzqwVarArr);
        int length = zzqwVarArr.length;
        if (length != 1) {
            if (length != 2) {
                z11 = false;
                Preconditions.checkArgument(z11);
                Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
                List<zzqw<?>> zzk = ((zzrd) zzqwVarArr[0]).zzk();
                zzqw<?> zzqwVar = length >= 2 ? zzra.zze : zzqwVarArr[1];
                String zzd = zzqwVar != zzra.zze ? "," : zzju.zzd(zzqwVar);
                ArrayList arrayList = new ArrayList();
                for (zzqw<?> zzqwVar2 : zzk) {
                    if (zzqwVar2 == zzra.zzd || zzqwVar2 == zzra.zze) {
                        arrayList.add("");
                    } else {
                        arrayList.add(zzju.zzd(zzqwVar2));
                    }
                }
                return new zzrh(TextUtils.join(zzd, arrayList));
            }
            length = 2;
        }
        z11 = true;
        Preconditions.checkArgument(z11);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        List<zzqw<?>> zzk2 = ((zzrd) zzqwVarArr[0]).zzk();
        if (length >= 2) {
        }
        if (zzqwVar != zzra.zze) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r0.hasNext()) {
        }
        return new zzrh(TextUtils.join(zzd, arrayList2));
    }
}
