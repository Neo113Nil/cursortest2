package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.a;
import xsna.i801;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
final class zzag extends a {
    final /* synthetic */ Account zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzal zzalVar, com.google.android.gms.common.api.a aVar, c cVar, Account account) {
        super((com.google.android.gms.common.api.a<?>) aVar, cVar);
        this.zza = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final qdg0 createFailedResult(Status status) {
        return new zzak(status);
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((i801) ((zzam) bVar).getService()).X0(new zzaf(this), this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.a, xsna.ue6
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzag) obj);
    }
}
