package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3178b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zbaf extends zbr {
    final /* synthetic */ TaskCompletionSource zba;

    public zbaf(zbaj zbajVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbajVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbs
    public final void zbb(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        if (status.l()) {
            this.zba.setResult(saveAccountLinkingTokenResult);
        } else {
            this.zba.setException(AbstractC3178b.a(status));
        }
    }
}
