package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.common.api.internal.InterfaceC3132h;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zbam extends InterfaceC3132h.a {
    final /* synthetic */ TaskCompletionSource zba;

    public zbam(zbat zbatVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbatVar);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3132h
    public final void onResult(Status status) {
        AbstractC3165y.a(status, this.zba);
    }
}
