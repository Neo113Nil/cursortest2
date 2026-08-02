package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import xsna.rax0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes12.dex */
final class zzac extends rax0.c {
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ CreateWalletObjectsRequest zzeh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzaa zzaaVar, c cVar, CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        super(cVar);
        this.zzeh = createWalletObjectsRequest;
        this.val$requestCode = i;
    }

    @Override // xsna.rax0.b, com.google.android.gms.common.api.internal.a
    /* renamed from: zza */
    public final void doExecute(zzv zzvVar) {
        zzvVar.zza(this.zzeh, this.val$requestCode);
        setResult((zzac) Status.f);
    }
}
