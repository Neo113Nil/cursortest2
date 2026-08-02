package com.google.mlkit.common.sdkinternal;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f60031b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static g f60032c;

    /* renamed from: a, reason: collision with root package name */
    private final zza f60033a;

    private g(Looper looper) {
        this.f60033a = new zza(looper);
    }

    @NonNull
    @KeepForSdk
    public static g a() {
        g gVar;
        synchronized (f60031b) {
            try {
                if (f60032c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f60032c = new g(handlerThread.getLooper());
                }
                gVar = f60032c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @NonNull
    @KeepForSdk
    public static Task b(@NonNull final Callable callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        s.zza.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.r
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (R8.a e11) {
                    taskCompletionSource2.setException(e11);
                } catch (Exception e12) {
                    taskCompletionSource2.setException(new R8.a("Internal error has occurred when executing ML Kit tasks", e12));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @NonNull
    @KeepForSdk
    public static Executor c() {
        return s.zza;
    }
}
