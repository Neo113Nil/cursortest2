package com.google.android.gms.internal.cast;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzgk extends zzgj {
    private zzgk() {
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzgj, com.google.android.gms.internal.cast.zzgf
    public final void zze(Status status) {
        if (status.i()) {
            return;
        }
        Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener: status=".concat(String.valueOf(status)));
    }

    public /* synthetic */ zzgk(byte[] bArr) {
    }
}
