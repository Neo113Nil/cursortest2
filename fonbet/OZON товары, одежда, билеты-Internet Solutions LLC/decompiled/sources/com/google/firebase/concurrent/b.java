package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
final class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f59503e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f59504a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f59505b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59506c;

    /* renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f59507d;

    b(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        this.f59505b = str;
        this.f59506c = i11;
        this.f59507d = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        Process.setThreadPriority(bVar.f59506c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f59507d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread newThread = f59503e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this, runnable);
            }
        });
        Locale locale = Locale.ROOT;
        newThread.setName(this.f59505b + " Thread #" + this.f59504a.getAndIncrement());
        return newThread;
    }
}
