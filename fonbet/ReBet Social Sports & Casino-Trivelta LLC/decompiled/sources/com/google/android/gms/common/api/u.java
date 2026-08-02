package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
public final class u extends BasePendingResult {

    /* renamed from: a, reason: collision with root package name */
    public final l f32601a;

    public u(f fVar, l lVar) {
        super(fVar);
        this.f32601a = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final l createFailedResult(Status status) {
        return this.f32601a;
    }
}
