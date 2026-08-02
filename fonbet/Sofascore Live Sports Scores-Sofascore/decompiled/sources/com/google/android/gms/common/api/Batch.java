package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class Batch extends BasePendingResult<BatchResult> {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final void d() {
        super.d();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result e(Status status) {
        return new BatchResult(status);
    }
}
