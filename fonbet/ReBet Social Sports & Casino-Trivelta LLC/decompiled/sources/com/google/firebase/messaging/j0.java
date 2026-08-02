package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z.C6900a;

/* loaded from: classes3.dex */
public class j0 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f37978i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    public final Context f37979a;

    /* renamed from: b, reason: collision with root package name */
    public final N f37980b;

    /* renamed from: c, reason: collision with root package name */
    public final I f37981c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f37982d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f37984f;

    /* renamed from: h, reason: collision with root package name */
    public final h0 f37986h;

    /* renamed from: e, reason: collision with root package name */
    public final Map f37983e = new C6900a();

    /* renamed from: g, reason: collision with root package name */
    public boolean f37985g = false;

    public j0(FirebaseMessaging firebaseMessaging, N n10, h0 h0Var, I i10, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f37982d = firebaseMessaging;
        this.f37980b = n10;
        this.f37986h = h0Var;
        this.f37981c = i10;
        this.f37979a = context;
        this.f37984f = scheduledExecutorService;
    }

    public static /* synthetic */ j0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, N n10, I i10) {
        return new j0(firebaseMessaging, n10, h0.b(context, scheduledExecutorService), i10, context, scheduledExecutorService);
    }

    public static void c(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Task f(final FirebaseMessaging firebaseMessaging, final N n10, final I i10, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j0.a(context, scheduledExecutorService, firebaseMessaging, n10, i10);
            }
        });
    }

    public static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(g0 g0Var, TaskCompletionSource taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.f37983e) {
            try {
                String e10 = g0Var.e();
                if (this.f37983e.containsKey(e10)) {
                    arrayDeque = (ArrayDeque) this.f37983e.get(e10);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f37983e.put(e10, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(String str) {
        c(this.f37981c.m(this.f37982d.blockingGetToken(), str));
    }

    public final void e(String str) {
        c(this.f37981c.n(this.f37982d.blockingGetToken(), str));
    }

    public boolean g() {
        return this.f37986h.c() != null;
    }

    public synchronized boolean i() {
        return this.f37985g;
    }

    public final void j(g0 g0Var) {
        synchronized (this.f37983e) {
            try {
                String e10 = g0Var.e();
                if (this.f37983e.containsKey(e10)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f37983e.get(e10);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f37983e.remove(e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean k(g0 g0Var) {
        try {
            String b10 = g0Var.b();
            int hashCode = b10.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && b10.equals("U")) {
                    e(g0Var.c());
                    if (!h()) {
                        return true;
                    }
                    g0Var.c();
                    return true;
                }
            } else if (b10.equals("S")) {
                d(g0Var.c());
                if (!h()) {
                    return true;
                }
                g0Var.c();
                return true;
            }
            h();
            return true;
        } catch (IOException e10) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    public void l(Runnable runnable, long j10) {
        this.f37984f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    public Task m(g0 g0Var) {
        this.f37986h.a(g0Var);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        b(g0Var, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public synchronized void n(boolean z10) {
        this.f37985g = z10;
    }

    public final void o() {
        if (i()) {
            return;
        }
        s(0L);
    }

    public void p() {
        if (g()) {
            o();
        }
    }

    public Task q(String str) {
        Task m10 = m(g0.f(str));
        p();
        return m10;
    }

    public boolean r() {
        while (true) {
            synchronized (this) {
                try {
                    g0 c10 = this.f37986h.c();
                    if (c10 == null) {
                        h();
                        return true;
                    }
                    if (!k(c10)) {
                        return false;
                    }
                    this.f37986h.e(c10);
                    j(c10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void s(long j10) {
        l(new k0(this, this.f37979a, this.f37980b, Math.min(Math.max(30L, 2 * j10), f37978i)), j10);
        n(true);
    }

    public Task t(String str) {
        Task m10 = m(g0.g(str));
        p();
        return m10;
    }
}
