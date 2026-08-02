package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import androidx.core.content.e;

/* loaded from: classes9.dex */
final class zzd extends zzk {
    zzd() {
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzk
    protected final int zza(Context context, zzj zzjVar, boolean z11) {
        return (zzjVar.zza.getAuthority().lastIndexOf(64) < 0 || e.a(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
