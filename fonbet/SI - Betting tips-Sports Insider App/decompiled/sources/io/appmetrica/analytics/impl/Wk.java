package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Wk {

    /* renamed from: a, reason: collision with root package name */
    public final C0367o f13113a;

    /* renamed from: b, reason: collision with root package name */
    public final C0323m5 f13114b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f13115c;

    /* renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f13116d;

    /* renamed from: e, reason: collision with root package name */
    public final C0417q f13117e;

    /* renamed from: f, reason: collision with root package name */
    public final C0317m f13118f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13119g;

    public Wk(C0367o c0367o, C0317m c0317m) {
        this(c0367o, c0317m, new C0323m5(), new C0417q());
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0323m5 c0323m5 = this.f13114b;
            ip ipVar = new ip(this, activity, 0);
            c0323m5.getClass();
            C0040b4.l().f13374c.a().execute(new RunnableC0298l5(c0323m5, ipVar));
        }
    }

    public final void b(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0323m5 c0323m5 = this.f13114b;
            ip ipVar = new ip(this, activity, 1);
            c0323m5.getClass();
            C0040b4.l().f13374c.a().execute(new RunnableC0298l5(c0323m5, ipVar));
        }
    }

    public Wk(C0367o c0367o, C0317m c0317m, C0323m5 c0323m5, C0417q c0417q) {
        this.f13119g = false;
        this.f13113a = c0367o;
        this.f13118f = c0317m;
        this.f13114b = c0323m5;
        this.f13117e = c0417q;
        final int i5 = 0;
        this.f13115c = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.hp

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wk f13913b;

            {
                this.f13913b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i5) {
                    case 0:
                        this.f13913b.a(activity, activityEvent);
                        break;
                    default:
                        this.f13913b.b(activity, activityEvent);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f13116d = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.hp

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wk f13913b;

            {
                this.f13913b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i10) {
                    case 0:
                        this.f13913b.a(activity, activityEvent);
                        break;
                    default:
                        this.f13913b.b(activity, activityEvent);
                        break;
                }
            }
        };
    }

    public final void a(Activity activity, C0203hc c0203hc) {
        if (this.f13119g && this.f13117e.a(activity, EnumC0392p.RESUMED)) {
            c0203hc.a(activity);
        }
    }

    public final void b(Activity activity, C0203hc c0203hc) {
        if (this.f13119g && this.f13117e.a(activity, EnumC0392p.PAUSED)) {
            c0203hc.b(activity);
        }
    }

    public final synchronized EnumC0342n a() {
        try {
            if (!this.f13119g) {
                this.f13113a.registerListener(this.f13115c, ActivityEvent.RESUMED);
                this.f13113a.registerListener(this.f13116d, ActivityEvent.PAUSED);
                this.f13119g = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f13113a.f14375b;
    }
}
