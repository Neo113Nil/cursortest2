package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3161w extends BasePendingResult {
    public C3161w(com.google.android.gms.common.api.f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.l createFailedResult(Status status) {
        return status;
    }
}
