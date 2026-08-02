package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zban extends zbp {
    final /* synthetic */ TaskCompletionSource zba;

    public zban(zbat zbatVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbatVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbq
    public final void zbb(Status status, PendingIntent pendingIntent) {
        AbstractC3165y.b(status, pendingIntent, this.zba);
    }
}
