package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC3132h;
import com.google.android.gms.common.internal.AbstractC3178b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zby extends InterfaceC3132h.a {
    final /* synthetic */ TaskCompletionSource zba;

    public zby(zbad zbadVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbadVar);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3132h
    public final void onResult(Status status) {
        if (status.l()) {
            this.zba.setResult(null);
        } else {
            this.zba.setException(AbstractC3178b.a(status));
        }
    }
}
