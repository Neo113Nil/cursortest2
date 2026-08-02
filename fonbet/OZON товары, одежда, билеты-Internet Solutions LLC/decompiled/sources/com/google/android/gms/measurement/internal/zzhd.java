package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
class zzhd implements zzhf {
    protected final zzgk zzs;

    zzhd(zzgk zzgkVar) {
        Preconditions.checkNotNull(zzgkVar);
        this.zzs = zzgkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final Context zzau() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final Clock zzav() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final zzab zzaw() {
        throw null;
    }

    public void zzax() {
        this.zzs.zzaz().zzax();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final zzfa zzay() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final zzgh zzaz() {
        throw null;
    }

    public void zzg() {
        this.zzs.zzaz().zzg();
    }
}
