package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import io.sentry.android.core.w0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f6112i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6113a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.core.view.f f6114b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.widget.a0 f6115c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f6116d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6118f;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f6120h;

    /* renamed from: e, reason: collision with root package name */
    public final s.e f6117e = new s.e(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f6119g = false;

    public e0(FirebaseMessaging firebaseMessaging, androidx.core.view.f fVar, c0 c0Var, androidx.appcompat.widget.a0 a0Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f6116d = firebaseMessaging;
        this.f6114b = fVar;
        this.f6120h = c0Var;
        this.f6115c = a0Var;
        this.f6113a = context;
        this.f6118f = scheduledThreadPoolExecutor;
    }

    public static void b(Task task) {
        try {
            d5.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e7) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e7);
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e9);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void a(b0 b0Var, w7.g gVar) {
        ArrayDeque arrayDeque;
        synchronized (this.f6117e) {
            try {
                String str = b0Var.f6098c;
                if (this.f6117e.containsKey(str)) {
                    arrayDeque = (ArrayDeque) this.f6117e.get(str);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f6117e.put(str, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(gVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str) {
        String a7 = this.f6116d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        androidx.appcompat.widget.a0 a0Var = this.f6115c;
        b(a0Var.u(a0Var.E(a7, "/topics/" + str, bundle)));
    }

    public final void d(String str) {
        String a7 = this.f6116d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        androidx.appcompat.widget.a0 a0Var = this.f6115c;
        b(a0Var.u(a0Var.E(a7, "/topics/" + str, bundle)));
    }

    public final void f(b0 b0Var) {
        synchronized (this.f6117e) {
            try {
                String str = b0Var.f6098c;
                if (this.f6117e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f6117e.get(str);
                    w7.g gVar = (w7.g) arrayDeque.poll();
                    if (gVar != null) {
                        gVar.b(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f6117e.remove(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final w7.m g(b0 b0Var) {
        c0 c0Var = this.f6120h;
        synchronized (c0Var) {
            c0Var.f6102b.c(b0Var.f6098c);
        }
        w7.g gVar = new w7.g();
        a(b0Var, gVar);
        return gVar.f24979a;
    }

    public final synchronized void h(boolean z5) {
        this.f6119g = z5;
    }

    public final void i() {
        boolean z5;
        if (this.f6120h.a() != null) {
            synchronized (this) {
                z5 = this.f6119g;
            }
            if (z5) {
                return;
            }
            k(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089 A[Catch: IOException -> 0x005d, TRY_LEAVE, TryCatch #1 {IOException -> 0x005d, blocks: (B:8:0x0028, B:13:0x0083, B:15:0x0089, B:19:0x0039, B:21:0x0041, B:23:0x004a, B:26:0x005f, B:28:0x0067, B:30:0x0070), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j() {
        b0 a7;
        while (true) {
            synchronized (this) {
                try {
                    a7 = this.f6120h.a();
                    if (a7 == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a7.f6097b;
                String str2 = a7.f6096a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        d(str2);
                        if (e()) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                        this.f6120h.c(a7);
                        f(a7);
                    }
                    if (!e()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + a7 + ".");
                    }
                    this.f6120h.c(a7);
                    f(a7);
                } else {
                    if (str.equals("S")) {
                        c(str2);
                        if (e()) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                        }
                        this.f6120h.c(a7);
                        f(a7);
                    }
                    if (!e()) {
                    }
                    this.f6120h.c(a7);
                    f(a7);
                }
            } catch (IOException e7) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e7.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e7.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e7.getMessage())) {
                    if (e7.getMessage() != null) {
                        throw e7;
                    }
                    w0.d("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                w0.d("FirebaseMessaging", "Topic operation failed: " + e7.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (e()) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void k(long j6) {
        this.f6118f.schedule(new g0(this, this.f6113a, this.f6114b, Math.min(Math.max(30L, 2 * j6), f6112i)), j6, TimeUnit.SECONDS);
        h(true);
    }
}
