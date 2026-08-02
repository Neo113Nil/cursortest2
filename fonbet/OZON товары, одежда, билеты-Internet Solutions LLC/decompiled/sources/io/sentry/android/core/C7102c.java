package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7102c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private io.sentry.util.l<FrameMetricsAggregator> f67068a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f67069b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap f67070c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final WeakHashMap f67071d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Z f67072e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    protected io.sentry.util.a f67073f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.l<Boolean> f67074g;

    /* renamed from: io.sentry.android.core.c$a */
    /* loaded from: classes10.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f67075a;

        /* renamed from: b, reason: collision with root package name */
        private final int f67076b;

        /* renamed from: c, reason: collision with root package name */
        private final int f67077c;

        a(int i11, int i12, int i13) {
            this.f67075a = i11;
            this.f67076b = i12;
            this.f67077c = i13;
        }
    }

    public C7102c(@NotNull io.sentry.util.m mVar, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        Z z11 = new Z();
        this.f67070c = new ConcurrentHashMap();
        this.f67071d = new WeakHashMap();
        this.f67073f = new io.sentry.util.a();
        this.f67074g = new io.sentry.util.l<>(new Hn.d(mVar, sentryAndroidOptions.getLogger()));
        this.f67068a = new io.sentry.util.l<>(new Pk0.g(5));
        this.f67069b = sentryAndroidOptions;
        this.f67072e = z11;
    }

    public static /* synthetic */ void c(C7102c c7102c, Runnable runnable, String str) {
        c7102c.getClass();
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                c7102c.f67069b.getLogger().c(I2.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    private a f() {
        int i11;
        int i12;
        SparseIntArray sparseIntArray;
        if (!g() || !this.f67074g.a().booleanValue()) {
            return null;
        }
        SparseIntArray[] b11 = this.f67068a.a().b();
        int i13 = 0;
        if (b11.length <= 0 || (sparseIntArray = b11[0]) == null) {
            i11 = 0;
            i12 = 0;
        } else {
            int i14 = 0;
            i11 = 0;
            i12 = 0;
            while (i13 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i13);
                int valueAt = sparseIntArray.valueAt(i13);
                i14 += valueAt;
                if (keyAt > 700) {
                    i12 += valueAt;
                } else if (keyAt > 16) {
                    i11 += valueAt;
                }
                i13++;
            }
            i13 = i14;
        }
        return new a(i13, i11, i12);
    }

    private void h(Runnable runnable, String str) {
        try {
            if (io.sentry.android.core.internal.util.d.d().a()) {
                runnable.run();
            } else {
                this.f67072e.b(new BS.b(this, runnable, str, 1));
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f67069b.getLogger().c(I2.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    public final void e(@NotNull Activity activity) {
        InterfaceC7097a0 a11 = this.f67073f.a();
        try {
            if (!g()) {
                a11.close();
                return;
            }
            h(new E.a0(3, this, activity), "FrameMetricsAggregator.add");
            a f7 = f();
            if (f7 != null) {
                this.f67071d.put(activity, f7);
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean g() {
        if (!this.f67074g.a().booleanValue()) {
            return false;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f67069b;
        return sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
    }

    public final void i(@NotNull Activity activity, @NotNull io.sentry.protocol.t tVar) {
        a f7;
        InterfaceC7097a0 a11 = this.f67073f.a();
        try {
            if (!g()) {
                a11.close();
                return;
            }
            a aVar = null;
            h(new O9.d(3, this, activity), null);
            a aVar2 = (a) this.f67071d.remove(activity);
            if (aVar2 != null && (f7 = f()) != null) {
                aVar = new a(f7.f67075a - aVar2.f67075a, f7.f67076b - aVar2.f67076b, f7.f67077c - aVar2.f67077c);
            }
            if (aVar != null && (aVar.f67075a != 0 || aVar.f67076b != 0 || aVar.f67077c != 0)) {
                io.sentry.protocol.k kVar = new io.sentry.protocol.k(DevicePublicKeyStringDef.NONE, Integer.valueOf(aVar.f67075a));
                io.sentry.protocol.k kVar2 = new io.sentry.protocol.k(DevicePublicKeyStringDef.NONE, Integer.valueOf(aVar.f67076b));
                io.sentry.protocol.k kVar3 = new io.sentry.protocol.k(DevicePublicKeyStringDef.NONE, Integer.valueOf(aVar.f67077c));
                HashMap hashMap = new HashMap();
                hashMap.put("frames_total", kVar);
                hashMap.put("frames_slow", kVar2);
                hashMap.put("frames_frozen", kVar3);
                this.f67070c.put(tVar, hashMap);
                a11.close();
                return;
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void j() {
        InterfaceC7097a0 a11 = this.f67073f.a();
        try {
            if (g()) {
                h(new MW.a(this, 2), "FrameMetricsAggregator.stop");
                this.f67068a.a().d();
            }
            this.f67070c.clear();
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Map<String, io.sentry.protocol.k> k(@NotNull io.sentry.protocol.t tVar) {
        InterfaceC7097a0 a11 = this.f67073f.a();
        try {
            if (!g()) {
                a11.close();
                return null;
            }
            ConcurrentHashMap concurrentHashMap = this.f67070c;
            Map<String, io.sentry.protocol.k> map = (Map) concurrentHashMap.get(tVar);
            concurrentHashMap.remove(tVar);
            a11.close();
            return map;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
