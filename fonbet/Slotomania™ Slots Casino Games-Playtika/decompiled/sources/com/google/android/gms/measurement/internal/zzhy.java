package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzhy implements zzln {
    final /* synthetic */ zzij zza;

    zzhy(zzij zzijVar) {
        this.zza = zzijVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzln
    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzD("auto", "_err", bundle);
        } else {
            this.zza.zzF("auto", "_err", bundle, str);
        }
    }
}
