package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zbag extends zbt {
    final /* synthetic */ TaskCompletionSource zba;

    public zbag(zbaj zbajVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbajVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbu
    public final void zbb(Status status, SavePasswordResult savePasswordResult) {
        AbstractC3165y.b(status, savePasswordResult, this.zba);
    }
}
