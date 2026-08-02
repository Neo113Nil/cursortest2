package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zbal extends zbk {
    final /* synthetic */ TaskCompletionSource zba;

    public zbal(zbat zbatVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbatVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbl
    public final void zbb(Status status, BeginSignInResult beginSignInResult) {
        AbstractC3165y.b(status, beginSignInResult, this.zba);
    }
}
