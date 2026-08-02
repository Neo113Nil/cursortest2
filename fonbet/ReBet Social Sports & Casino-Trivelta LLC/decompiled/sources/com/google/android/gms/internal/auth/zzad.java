package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class zzad extends zzah {
    final /* synthetic */ zzae zza;

    public zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, w9.InterfaceC6729d
    public final void zzb(Account account) {
        this.zza.setResult((zzae) new zzai(account != null ? Status.f32275f : zzal.zza, account));
    }
}
