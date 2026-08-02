package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzid implements zzls {
    final /* synthetic */ zzip zza;

    zzid(zzip zzipVar) {
        this.zza = zzipVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzls
    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzE("auto", "_err", bundle);
        } else {
            this.zza.zzG("auto", "_err", bundle, str);
        }
    }
}
