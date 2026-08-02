package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.common.api.internal.InterfaceC3126e;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzaf implements InterfaceC3126e {
    private final TaskCompletionSource zza;

    public zzaf(TaskCompletionSource taskCompletionSource) {
        AbstractC3191o.m(taskCompletionSource);
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3126e
    public final void setFailedResult(Status status) {
        if (status == null) {
            return;
        }
        this.zza.setException(new b(status));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3126e
    public final /* synthetic */ void setResult(Object obj) {
        AbstractC3165y.b((Status) obj, null, this.zza);
    }
}
