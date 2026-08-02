package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;

/* loaded from: classes2.dex */
final class zbi extends zbl {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ l createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3124d
    public final /* bridge */ /* synthetic */ void doExecute(C3117a.b bVar) {
        zbe zbeVar = (zbe) bVar;
        ((zbs) zbeVar.getService()).zbd(new zbh(this), zbeVar.zba());
    }
}
