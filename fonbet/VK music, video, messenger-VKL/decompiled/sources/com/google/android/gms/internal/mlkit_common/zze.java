package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import xsna.d02;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
final class zze extends zzs {
    @Override // com.google.android.gms.internal.mlkit_common.zzs
    public final int zza(Context context, zzr zzrVar, boolean z) {
        return (zzrVar.zza.getAuthority().lastIndexOf(64) < 0 || d02.n(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
