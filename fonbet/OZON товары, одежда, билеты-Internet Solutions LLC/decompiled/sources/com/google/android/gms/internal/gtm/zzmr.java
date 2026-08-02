package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class zzmr extends zzjv {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // com.google.android.gms.internal.gtm.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        if (length != 1) {
            if (length != 2) {
                z11 = false;
                Preconditions.checkArgument(z11);
                Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
                ArrayList arrayList = new ArrayList();
                if (length != 1) {
                    arrayList.add(zzqwVarArr[0]);
                } else {
                    String zzk = ((zzrh) zzqwVarArr[0]).zzk();
                    String zzd = zzju.zzd(zzqwVarArr[1]);
                    boolean equals = zzd.equals("");
                    String[] split = zzk.split(zzd, true != equals ? -1 : 0);
                    for (int i11 = (equals && split.length > 0 && split[0].equals("")) ? 1 : 0; i11 < split.length; i11++) {
                        arrayList.add(new zzrh(split[i11]));
                    }
                }
                return new zzrd(arrayList);
            }
            length = 2;
        }
        z11 = true;
        Preconditions.checkArgument(z11);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        ArrayList arrayList2 = new ArrayList();
        if (length != 1) {
        }
        return new zzrd(arrayList2);
    }
}
