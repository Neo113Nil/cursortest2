package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC3124d;
import com.google.android.gms.common.api.l;
import w9.InterfaceC6732g;

/* loaded from: classes2.dex */
final class zzac extends AbstractC3124d {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, C3117a c3117a, f fVar, boolean z10) {
        super(c3117a, fVar);
        this.zza = z10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final l createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3124d
    public final /* bridge */ /* synthetic */ void doExecute(C3117a.b bVar) {
        ((InterfaceC6732g) ((zzam) bVar).getService()).Q(this.zza);
        setResult((zzac) new zzaj(Status.f32275f));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3126e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzac) obj);
    }
}
