package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzkg extends zzjv {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // com.google.android.gms.internal.gtm.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11;
        zzrd zzrdVar;
        int size;
        zzqw<?> zzi;
        int i11;
        Preconditions.checkNotNull(zzqwVarArr);
        int length = zzqwVarArr.length;
        if (length != 2) {
            if (length != 3) {
                z11 = false;
                Preconditions.checkArgument(z11);
                Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
                Preconditions.checkArgument(zzqwVarArr[1] instanceof zzqz);
                zzrdVar = (zzrd) zzqwVarArr[0];
                zzqz zzqzVar = (zzqz) zzqwVarArr[1];
                List<zzqw<?>> zzk = zzrdVar.zzk();
                size = zzk.size();
                if (length != 3) {
                    zzi = zzqwVarArr[2];
                    i11 = 0;
                } else {
                    Preconditions.checkState(size > 0);
                    zzi = zzrdVar.zzi(0);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            i11 = 1;
                            break;
                        }
                        if (zzrdVar.zzn(i12)) {
                            zzi = zzrdVar.zzi(i12);
                            i11 = i12 + 1;
                            break;
                        }
                        i12++;
                    }
                    Preconditions.checkState(i12 < size);
                }
                while (i11 < size && i11 < zzrdVar.zzk().size()) {
                    if (!zzrdVar.zzn(i11)) {
                        zzi = zzqzVar.zzi().zzd(zzibVar, zzi, zzk.get(i11), new zzqy(Double.valueOf(i11)), zzrdVar);
                    }
                    i11++;
                }
                return zzi;
            }
            length = 3;
        }
        z11 = true;
        Preconditions.checkArgument(z11);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        Preconditions.checkArgument(zzqwVarArr[1] instanceof zzqz);
        zzrdVar = (zzrd) zzqwVarArr[0];
        zzqz zzqzVar2 = (zzqz) zzqwVarArr[1];
        List<zzqw<?>> zzk2 = zzrdVar.zzk();
        size = zzk2.size();
        if (length != 3) {
        }
        while (i11 < size) {
            if (!zzrdVar.zzn(i11)) {
            }
            i11++;
        }
        return zzi;
    }
}
