package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3178b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.wallet.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3414b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f34601a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b, reason: collision with root package name */
    public static final long f34602b = SystemClock.elapsedRealtime();

    public static Status a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.l()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(AbstractC3178b.a(status));
        }
    }
}
