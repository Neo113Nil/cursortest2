package com.google.android.gms.internal.consent_sdk;

import xsna.b5j;
import xsna.d8s;
import xsna.xkq0;
import xsna.ykq0;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes12.dex */
final class zzba implements ykq0, xkq0 {
    private final ykq0 zza;
    private final xkq0 zzb;

    public /* synthetic */ zzba(ykq0 ykq0Var, xkq0 xkq0Var, zzaz zzazVar) {
        this.zza = ykq0Var;
        this.zzb = xkq0Var;
    }

    @Override // xsna.xkq0
    public final void onConsentFormLoadFailure(d8s d8sVar) {
        this.zzb.onConsentFormLoadFailure(d8sVar);
    }

    @Override // xsna.ykq0
    public final void onConsentFormLoadSuccess(b5j b5jVar) {
        this.zza.onConsentFormLoadSuccess(b5jVar);
    }
}
