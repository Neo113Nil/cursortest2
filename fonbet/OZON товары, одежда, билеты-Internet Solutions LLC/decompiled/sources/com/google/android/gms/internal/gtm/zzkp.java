package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;

/* loaded from: classes9.dex */
public final class zzkp extends zzjv {
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.google.android.gms.internal.gtm.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11;
        zzqz zzqzVar;
        Preconditions.checkNotNull(zzqwVarArr);
        int length = zzqwVarArr.length;
        if (length != 1) {
            if (length != 2) {
                z11 = false;
                Preconditions.checkArgument(z11);
                Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
                zzrd zzrdVar = (zzrd) zzqwVarArr[0];
                if (length != 2) {
                    Preconditions.checkArgument(zzqwVarArr[1] instanceof zzqz);
                    zzqzVar = (zzqz) zzqwVarArr[1];
                } else {
                    zzqzVar = new zzqz(new zzko(null));
                }
                Collections.sort(zzrdVar.zzk(), new zzkm(this, zzqzVar, zzibVar));
                return zzqwVarArr[0];
            }
            length = 2;
        }
        z11 = true;
        Preconditions.checkArgument(z11);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        zzrd zzrdVar2 = (zzrd) zzqwVarArr[0];
        if (length != 2) {
        }
        Collections.sort(zzrdVar2.zzk(), new zzkm(this, zzqzVar, zzibVar));
        return zzqwVarArr[0];
    }
}
