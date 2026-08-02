package com.google.android.gms.internal.play_billing;

import com.ironsource.X3;
import xsna.zr;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes12.dex */
final class zzt extends zzq {
    final /* synthetic */ zzu zzg;

    public zzt(zzu zzuVar) {
        this.zzg = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzq
    public final String zza() {
        zzr zzrVar = (zzr) this.zzg.zza.get();
        return zzrVar == null ? "Completer object has been garbage collected, future will fail soon" : zr.a("tag=[", String.valueOf(zzrVar.zza), X3.j.e);
    }
}
