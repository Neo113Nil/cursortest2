package com.google.android.gms.wallet;

import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class r extends p {
    public r(com.google.android.gms.common.api.f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.l createFailedResult(Status status) {
        return status;
    }
}
