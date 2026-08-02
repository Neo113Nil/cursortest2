package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class U {

    /* renamed from: i, reason: collision with root package name */
    private static final long f59652i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f59653j = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f59654a;

    /* renamed from: b, reason: collision with root package name */
    private final C5944z f59655b;

    /* renamed from: c, reason: collision with root package name */
    private final C5941w f59656c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f59657d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f59659f;

    /* renamed from: h, reason: collision with root package name */
    private final S f59661h;

    /* renamed from: e, reason: collision with root package name */
    private final C5132a f59658e = new C5132a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f59660g = false;

    private U(FirebaseMessaging firebaseMessaging, C5944z c5944z, S s11, C5941w c5941w, Context context, @NonNull ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f59657d = firebaseMessaging;
        this.f59655b = c5944z;
        this.f59661h = s11;
        this.f59656c = c5941w;
        this.f59654a = context;
        this.f59659f = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ U a(Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, FirebaseMessaging firebaseMessaging, C5944z c5944z, C5941w c5941w) {
        return new U(firebaseMessaging, c5944z, S.a(context, scheduledThreadPoolExecutor), c5941w, context, scheduledThreadPoolExecutor);
    }

    private static <T> void b(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e11) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e12);
            }
            throw ((RuntimeException) cause);
        }
    }

    final void c(Runnable runnable, long j11) {
        this.f59659f.schedule(runnable, j11, TimeUnit.SECONDS);
    }

    final synchronized void d(boolean z11) {
        this.f59660g = z11;
    }

    final void e() {
        boolean z11;
        if (this.f59661h.b() != null) {
            synchronized (this) {
                z11 = this.f59660g;
            }
            if (z11) {
                return;
            }
            g(0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8 A[Catch: IOException -> 0x0045, TryCatch #0 {IOException -> 0x0045, blocks: (B:8:0x002a, B:17:0x005d, B:19:0x0065, B:46:0x007a, B:48:0x0091, B:49:0x00a8, B:51:0x00bf, B:52:0x003b, B:55:0x0048), top: B:7:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean f() throws IOException {
        Q b11;
        char c11;
        while (true) {
            synchronized (this) {
                try {
                    b11 = this.f59661h.b();
                    if (b11 == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String b12 = b11.b();
                int hashCode = b12.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && b12.equals("U")) {
                        c11 = 1;
                        C5941w c5941w = this.f59656c;
                        FirebaseMessaging firebaseMessaging = this.f59657d;
                        if (c11 != 0) {
                            b(c5941w.f(firebaseMessaging.i(), b11.c()));
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Subscribe to topic: " + b11.c() + " succeeded.");
                            }
                        } else if (c11 == 1) {
                            b(c5941w.g(firebaseMessaging.i(), b11.c()));
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Unsubscribe from topic: " + b11.c() + " succeeded.");
                            }
                        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unknown topic operation" + b11 + ".");
                        }
                        this.f59661h.c(b11);
                        synchronized (this.f59658e) {
                            try {
                                String d11 = b11.d();
                                if (this.f59658e.containsKey(d11)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.f59658e.get(d11);
                                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                                    if (taskCompletionSource != null) {
                                        taskCompletionSource.setResult(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.f59658e.remove(d11);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    c11 = 65535;
                    C5941w c5941w2 = this.f59656c;
                    FirebaseMessaging firebaseMessaging2 = this.f59657d;
                    if (c11 != 0) {
                    }
                    this.f59661h.c(b11);
                    synchronized (this.f59658e) {
                    }
                } else {
                    if (b12.equals("S")) {
                        c11 = 0;
                        C5941w c5941w22 = this.f59656c;
                        FirebaseMessaging firebaseMessaging22 = this.f59657d;
                        if (c11 != 0) {
                        }
                        this.f59661h.c(b11);
                        synchronized (this.f59658e) {
                        }
                    }
                    c11 = 65535;
                    C5941w c5941w222 = this.f59656c;
                    FirebaseMessaging firebaseMessaging222 = this.f59657d;
                    if (c11 != 0) {
                    }
                    this.f59661h.c(b11);
                    synchronized (this.f59658e) {
                    }
                }
            } catch (IOException e11) {
                if ("SERVICE_NOT_AVAILABLE".equals(e11.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e11.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e11.getMessage())) {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e11.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e11.getMessage() != null) {
                        throw e11;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                }
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    final void g(long j11) {
        c(new V(this, this.f59654a, this.f59655b, Math.min(Math.max(30L, 2 * j11), f59652i)), j11);
        d(true);
    }
}
