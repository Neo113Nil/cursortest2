package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.r;

/* loaded from: classes2.dex */
final class zzaa extends r {
    final /* synthetic */ CreateWalletObjectsRequest zza;
    final /* synthetic */ int zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzab zzabVar, f fVar, CreateWalletObjectsRequest createWalletObjectsRequest, int i10) {
        super(fVar);
        this.zza = createWalletObjectsRequest;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3124d
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void doExecute(zzy zzyVar) {
        zzyVar.zzp(this.zza, this.zzb);
        setResult((zzaa) Status.f32275f);
    }
}
