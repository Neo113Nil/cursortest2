package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzglt extends zzfyi {
    public final zzggk f;

    public zzglt(Context context, ExecutorService executorService, zzggk zzggkVar) {
        super(context, executorService, new TaskCompletionSource().getTask(), false);
        this.f = zzggkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    public final void b(int i, long j) {
        this.f.c(i, j, null, null);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    public final void c(int i, long j, Exception exc) {
        this.f.c(i, j, null, exc);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    public final void d(int i, String str) {
        this.f.c(i, -1L, str, null);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }
}
