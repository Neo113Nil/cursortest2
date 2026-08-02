package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.c;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzen extends zzer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzet zzetVar, c cVar) {
        super(zzetVar, cVar);
        Objects.requireNonNull(zzetVar);
    }

    @Override // com.google.android.gms.internal.cast.zzer, com.google.android.gms.common.api.internal.a
    /* renamed from: zza */
    public final void doExecute(zzew zzewVar) throws RemoteException {
        zzewVar.zzq(new zzeq(this));
    }
}
