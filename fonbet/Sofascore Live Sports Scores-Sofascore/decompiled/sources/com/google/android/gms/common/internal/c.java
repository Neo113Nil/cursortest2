package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c implements PendingResult.StatusListener {
    public final /* synthetic */ PendingResult a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ PendingResultUtil.ResultConverter c;

    public c(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter) {
        this.a = pendingResult;
        this.b = taskCompletionSource;
        this.c = resultConverter;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void a(Status status) {
        boolean Y0 = status.Y0();
        TaskCompletionSource taskCompletionSource = this.b;
        if (!Y0) {
            taskCompletionSource.setException(ApiExceptionUtil.a(status));
        } else {
            taskCompletionSource.setResult(this.c.d(this.a.b()));
        }
    }
}
