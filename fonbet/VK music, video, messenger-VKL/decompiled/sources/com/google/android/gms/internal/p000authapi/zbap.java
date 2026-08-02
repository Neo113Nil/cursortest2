package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.i7o0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes.dex */
final class zbap extends zbo {
    final /* synthetic */ TaskCompletionSource zba;

    public zbap(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbp
    public final void zbb(Status status, PendingIntent pendingIntent) {
        i7o0.i(status, pendingIntent, this.zba);
    }
}
