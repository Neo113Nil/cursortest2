package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements io.sentry.util.thread.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f15712a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile long f15713b;

    static {
        e eVar = new e();
        new Handler(Looper.getMainLooper()).post(new aa.d(4));
        f15712a = eVar;
        f15713b = Process.myTid();
    }

    @Override // io.sentry.util.thread.a
    public final String a() {
        return c() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public final long b() {
        return Process.myTid();
    }

    @Override // io.sentry.util.thread.a
    public final boolean c() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }
}
