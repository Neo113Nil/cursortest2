package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC3124d;
import com.google.android.gms.common.api.l;
import w9.InterfaceC6732g;

/* loaded from: classes2.dex */
final class zzag extends AbstractC3124d {
    final /* synthetic */ Account zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzal zzalVar, C3117a c3117a, f fVar, Account account) {
        super(c3117a, fVar);
        this.zza = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final l createFailedResult(Status status) {
        return new zzak(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3124d
    public final /* bridge */ /* synthetic */ void doExecute(C3117a.b bVar) {
        ((InterfaceC6732g) ((zzam) bVar).getService()).t(new zzaf(this), this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3126e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzag) obj);
    }
}
