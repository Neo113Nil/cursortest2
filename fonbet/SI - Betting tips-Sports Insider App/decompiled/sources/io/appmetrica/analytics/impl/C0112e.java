package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112e {

    /* renamed from: g, reason: collision with root package name */
    public static final long f13624g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f13625h = "WatchDog-" + ThreadFactoryC0655zd.f14994a.incrementAndGet();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f13626a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f13627b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f13628c;

    /* renamed from: d, reason: collision with root package name */
    public C0087d f13629d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f13630e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f13631f;

    public C0112e(Db db2) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f13626a = copyOnWriteArrayList;
        this.f13627b = new AtomicInteger();
        this.f13628c = new Handler(Looper.getMainLooper());
        this.f13630e = new AtomicBoolean();
        this.f13631f = new aa.c(22, this);
        copyOnWriteArrayList.add(db2);
    }

    public final /* synthetic */ void a() {
        this.f13630e.set(true);
    }

    public final synchronized void b() {
        C0087d c0087d = this.f13629d;
        if (c0087d != null) {
            c0087d.f13548a.set(false);
            this.f13629d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i5) {
        AtomicInteger atomicInteger = this.f13627b;
        int i10 = 5;
        if (i5 >= 5) {
            i10 = i5;
        }
        atomicInteger.set(i10);
        if (this.f13629d == null) {
            C0087d c0087d = new C0087d(this);
            this.f13629d = c0087d;
            try {
                c0087d.setName(f13625h);
            } catch (SecurityException unused) {
            }
            this.f13629d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i5));
        }
    }
}
