package com.google.android.gms.internal.location;

import V9.AbstractC1745a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC3124d;
import com.google.android.gms.common.api.l;

/* loaded from: classes2.dex */
abstract class zzv extends AbstractC3124d {
    public zzv(f fVar) {
        super(AbstractC1745a.f12831a, fVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ l createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3126e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzv) obj);
    }
}
