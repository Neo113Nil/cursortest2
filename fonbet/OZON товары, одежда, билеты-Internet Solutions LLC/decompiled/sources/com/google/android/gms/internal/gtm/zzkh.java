package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzkh extends zzjv {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0067 -> B:9:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0069 -> B:9:0x008c). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.gtm.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11;
        zzqw<?> zzqwVar;
        Preconditions.checkNotNull(zzqwVarArr);
        int length = zzqwVarArr.length;
        if (length != 2) {
            if (length == 3) {
                length = 3;
            } else {
                z11 = false;
                Preconditions.checkArgument(z11);
                Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
                Preconditions.checkArgument(zzqwVarArr[1] instanceof zzqz);
                zzrd zzrdVar = (zzrd) zzqwVarArr[0];
                zzqz zzqzVar = (zzqz) zzqwVarArr[1];
                List<zzqw<?>> zzk = zzrdVar.zzk();
                int size = zzk.size();
                if (length != 3) {
                    zzqwVar = zzqwVarArr[2];
                    size--;
                    if (size < 0) {
                        return zzqwVar;
                    }
                    if (zzrdVar.zzn(size)) {
                        zzqwVar = zzqzVar.zzi().zzd(zzibVar, zzqwVar, zzk.get(size), new zzqy(Double.valueOf(size)), zzrdVar);
                    }
                    size--;
                    if (size < 0) {
                    }
                } else {
                    Preconditions.checkState(size > 0);
                    int i11 = size - 1;
                    zzqw<?> zzi = zzrdVar.zzi(i11);
                    size -= 2;
                    while (true) {
                        if (i11 < 0) {
                            break;
                        }
                        if (zzrdVar.zzn(i11)) {
                            zzi = zzrdVar.zzi(i11);
                            size = i11 - 1;
                            break;
                        }
                        i11--;
                    }
                    Preconditions.checkState(i11 >= 0);
                    zzqwVar = zzi;
                    if (size < 0) {
                    }
                }
            }
        }
        z11 = true;
        Preconditions.checkArgument(z11);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        Preconditions.checkArgument(zzqwVarArr[1] instanceof zzqz);
        zzrd zzrdVar2 = (zzrd) zzqwVarArr[0];
        zzqz zzqzVar2 = (zzqz) zzqwVarArr[1];
        List<zzqw<?>> zzk2 = zzrdVar2.zzk();
        int size2 = zzk2.size();
        if (length != 3) {
        }
    }
}
