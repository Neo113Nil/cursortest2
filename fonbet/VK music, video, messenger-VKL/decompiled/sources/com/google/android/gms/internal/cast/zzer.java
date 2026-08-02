package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.a;
import java.util.Objects;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
class zzer extends a {
    final /* synthetic */ zzet zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzet zzetVar, c cVar) {
        super((com.google.android.gms.common.api.a<?>) zzetVar.zzc(), cVar);
        Objects.requireNonNull(zzetVar);
        this.zzc = zzetVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ qdg0 createFailedResult(Status status) {
        return new zzes(status);
    }

    @Override // com.google.android.gms.common.api.internal.a, xsna.ue6
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzer) obj);
    }

    @Override // com.google.android.gms.common.api.internal.a
    /* renamed from: zza */
    public void doExecute(zzew zzewVar) throws RemoteException {
        throw null;
    }
}
