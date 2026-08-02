package com.google.android.recaptcha.internal;

import Ph.X;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzas {
    @NotNull
    public static final Task zza(@NotNull X x10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        x10.invokeOnCompletion(new zzar(taskCompletionSource, x10));
        return taskCompletionSource.getTask();
    }
}
