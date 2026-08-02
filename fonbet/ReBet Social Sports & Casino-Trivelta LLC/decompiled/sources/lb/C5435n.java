package lb;

import ai.verisoul.sdk.Core;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zze;
import eb.C4196f;

/* renamed from: lb.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5435n {

    /* renamed from: h, reason: collision with root package name */
    public static G9.a f55766h = new G9.a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a, reason: collision with root package name */
    public final C4196f f55767a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f55768b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f55769c;

    /* renamed from: d, reason: collision with root package name */
    public long f55770d;

    /* renamed from: e, reason: collision with root package name */
    public HandlerThread f55771e;

    /* renamed from: f, reason: collision with root package name */
    public Handler f55772f;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f55773g;

    public C5435n(C4196f c4196f) {
        f55766h.g("Initializing TokenRefresher", new Object[0]);
        C4196f c4196f2 = (C4196f) AbstractC3191o.m(c4196f);
        this.f55767a = c4196f2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f55771e = handlerThread;
        handlerThread.start();
        this.f55772f = new zze(this.f55771e.getLooper());
        this.f55773g = new RunnableC5438q(this, c4196f2.p());
        this.f55770d = Core.sensorDataTimeout;
    }

    public final void b() {
        this.f55772f.removeCallbacks(this.f55773g);
    }

    public final void c() {
        f55766h.g("Scheduling refresh for " + (this.f55768b - this.f55770d), new Object[0]);
        b();
        this.f55769c = Math.max((this.f55768b - K9.h.c().a()) - this.f55770d, 0L) / 1000;
        this.f55772f.postDelayed(this.f55773g, this.f55769c * 1000);
    }

    public final void d() {
        int i10 = (int) this.f55769c;
        this.f55769c = (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) ? 2 * this.f55769c : i10 != 960 ? 30L : 960L;
        this.f55768b = K9.h.c().a() + (this.f55769c * 1000);
        f55766h.g("Scheduling refresh for " + this.f55768b, new Object[0]);
        this.f55772f.postDelayed(this.f55773g, this.f55769c * 1000);
    }
}
