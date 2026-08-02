package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.EnumC4788n3;
import io.sentry.InterfaceC4765j0;
import io.sentry.util.C4843a;
import io.sentry.util.p;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.android.core.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4682i {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.util.p f50987a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f50988b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f50989c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f50990d;

    /* renamed from: e, reason: collision with root package name */
    public final L0 f50991e;

    /* renamed from: f, reason: collision with root package name */
    public C4843a f50992f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.util.p f50993g;

    /* renamed from: io.sentry.android.core.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f50994a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50995b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50996c;

        public b(int i10, int i11, int i12) {
            this.f50994a = i10;
            this.f50995b = i11;
            this.f50996c = i12;
        }
    }

    public C4682i(io.sentry.util.s sVar, SentryAndroidOptions sentryAndroidOptions, L0 l02) {
        this.f50989c = new ConcurrentHashMap();
        this.f50990d = new WeakHashMap();
        this.f50992f = new C4843a();
        this.f50993g = sVar.e("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger());
        this.f50987a = new io.sentry.util.p(new p.a() { // from class: io.sentry.android.core.d
            @Override // io.sentry.util.p.a
            public final Object a() {
                return C4682i.e();
            }
        });
        this.f50988b = sentryAndroidOptions;
        this.f50991e = l02;
    }

    public static /* synthetic */ void c(C4682i c4682i, Runnable runnable, String str) {
        c4682i.getClass();
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                c4682i.f50988b.getLogger().c(EnumC4788n3.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    public static /* synthetic */ FrameMetricsAggregator e() {
        return new FrameMetricsAggregator();
    }

    public void f(final Activity activity) {
        InterfaceC4765j0 d10 = this.f50992f.d();
        try {
            if (!i()) {
                if (d10 != null) {
                    d10.close();
                }
            } else {
                j(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((FrameMetricsAggregator) C4682i.this.f50987a.a()).a(activity);
                    }
                }, "FrameMetricsAggregator.add");
                l(activity);
                if (d10 != null) {
                    d10.close();
                }
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final b g() {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (!i() || !((Boolean) this.f50993g.a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] b10 = ((FrameMetricsAggregator) this.f50987a.a()).b();
        int i12 = 0;
        if (b10 == null || b10.length <= 0 || (sparseIntArray = b10[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                int valueAt = sparseIntArray.valueAt(i12);
                i13 += valueAt;
                if (keyAt > 700) {
                    i11 += valueAt;
                } else if (keyAt > 16) {
                    i10 += valueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new b(i12, i10, i11);
    }

    public final b h(Activity activity) {
        b g10;
        b bVar = (b) this.f50990d.remove(activity);
        if (bVar == null || (g10 = g()) == null) {
            return null;
        }
        return new b(g10.f50994a - bVar.f50994a, g10.f50995b - bVar.f50995b, g10.f50996c - bVar.f50996c);
    }

    public boolean i() {
        return ((Boolean) this.f50993g.a()).booleanValue() && this.f50988b.isEnableFramesTracking() && !this.f50988b.isEnablePerformanceV2();
    }

    public final void j(final Runnable runnable, final String str) {
        try {
            if (io.sentry.android.core.internal.util.k.e().a()) {
                runnable.run();
            } else {
                this.f50991e.b(new Runnable() { // from class: io.sentry.android.core.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4682i.c(C4682i.this, runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f50988b.getLogger().c(EnumC4788n3.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(final Activity activity, io.sentry.protocol.u uVar) {
        InterfaceC4765j0 d10 = this.f50992f.d();
        try {
            if (!i()) {
                if (d10 != null) {
                    d10.close();
                    return;
                }
                return;
            }
            j(new Runnable() { // from class: io.sentry.android.core.h
                @Override // java.lang.Runnable
                public final void run() {
                    ((FrameMetricsAggregator) C4682i.this.f50987a.a()).c(activity);
                }
            }, null);
            b h10 = h(activity);
            if (h10 != null && (h10.f50994a != 0 || h10.f50995b != 0 || h10.f50996c != 0)) {
                io.sentry.protocol.l lVar = new io.sentry.protocol.l(Integer.valueOf(h10.f50994a), ViewProps.NONE);
                io.sentry.protocol.l lVar2 = new io.sentry.protocol.l(Integer.valueOf(h10.f50995b), ViewProps.NONE);
                io.sentry.protocol.l lVar3 = new io.sentry.protocol.l(Integer.valueOf(h10.f50996c), ViewProps.NONE);
                HashMap hashMap = new HashMap();
                hashMap.put("frames_total", lVar);
                hashMap.put("frames_slow", lVar2);
                hashMap.put("frames_frozen", lVar3);
                this.f50989c.put(uVar, hashMap);
                if (d10 != null) {
                    d10.close();
                }
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final void l(Activity activity) {
        b g10 = g();
        if (g10 != null) {
            this.f50990d.put(activity, g10);
        }
    }

    public void m() {
        InterfaceC4765j0 d10 = this.f50992f.d();
        try {
            if (i()) {
                j(new Runnable() { // from class: io.sentry.android.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((FrameMetricsAggregator) C4682i.this.f50987a.a()).e();
                    }
                }, "FrameMetricsAggregator.stop");
                ((FrameMetricsAggregator) this.f50987a.a()).d();
            }
            this.f50989c.clear();
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Map n(io.sentry.protocol.u uVar) {
        InterfaceC4765j0 d10 = this.f50992f.d();
        try {
            if (!i()) {
                if (d10 != null) {
                    d10.close();
                }
                return null;
            }
            Map map = (Map) this.f50989c.get(uVar);
            this.f50989c.remove(uVar);
            if (d10 != null) {
                d10.close();
            }
            return map;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public C4682i(io.sentry.util.s sVar, SentryAndroidOptions sentryAndroidOptions) {
        this(sVar, sentryAndroidOptions, new L0());
    }
}
