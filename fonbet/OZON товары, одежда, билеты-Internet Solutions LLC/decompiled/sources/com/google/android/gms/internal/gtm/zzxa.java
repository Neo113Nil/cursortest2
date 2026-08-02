package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzxa extends zzxk {
    zzxa(int i11) {
        super(i11, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzxk
    public final void zza() {
        if (!zzj()) {
            for (int i11 = 0; i11 < zzb(); i11++) {
                ((zzun) zzg(i11).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzun) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
