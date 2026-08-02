package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.j7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.t3;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class g implements AppLovinBroadcastManager.Receiver {
    private j7 a;
    private final Object b = new Object();
    private final AtomicBoolean c = new AtomicBoolean();
    private boolean d;
    private final l e;
    private final WeakReference f;
    private long g;

    public interface a {
        void onAdRefresh();
    }

    public g(l lVar, a aVar) {
        this.f = new WeakReference(aVar);
        this.e = lVar;
    }

    private void e() {
        if (((Boolean) this.e.a(t3.O7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.e.a(t3.O7)).booleanValue()) {
            synchronized (this.b) {
                if (this.d) {
                    this.e.Q();
                    if (p.a()) {
                        this.e.Q().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.e.o0().isApplicationPaused()) {
                    this.e.Q();
                    if (p.a()) {
                        this.e.Q().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    j7 j7Var = this.a;
                    if (j7Var != null) {
                        j7Var.e();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.b) {
            j7 j7Var = this.a;
            if (j7Var != null) {
                j7Var.d();
            } else {
                this.e.Q();
                if (p.a()) {
                    this.e.Q().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.c.set(true);
            }
        }
    }

    private void l() {
        synchronized (this.b) {
            this.a = null;
            if (!((Boolean) this.e.a(t3.P7)).booleanValue()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void n() {
        synchronized (this.b) {
            j7 j7Var = this.a;
            if (j7Var != null) {
                j7Var.e();
            } else {
                this.c.set(false);
            }
        }
    }

    public void a(long j) {
        synchronized (this.b) {
            a();
            this.g = j;
            this.a = j7.a(j, this.e, new Runnable() { // from class: com.applovin.impl.sdk.g$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.i();
                }
            });
            if (!((Boolean) this.e.a(t3.P7)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.e.a(t3.O7)).booleanValue() && (this.e.J().d() || this.e.o0().isApplicationPaused())) {
                this.a.d();
            }
            if (this.c.compareAndSet(true, false) && ((Boolean) this.e.a(t3.Q7)).booleanValue()) {
                this.e.Q();
                if (p.a()) {
                    this.e.Q().a("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.a.d();
            }
        }
    }

    public long b() {
        long c;
        synchronized (this.b) {
            j7 j7Var = this.a;
            c = j7Var != null ? j7Var.c() : -1L;
        }
        return c;
    }

    public void c() {
        if (((Boolean) this.e.a(t3.N7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z;
        a aVar;
        if (((Boolean) this.e.a(t3.N7)).booleanValue()) {
            synchronized (this.b) {
                if (this.d) {
                    this.e.Q();
                    if (p.a()) {
                        this.e.Q().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                    return;
                }
                if (this.e.J().d()) {
                    this.e.Q();
                    if (p.a()) {
                        this.e.Q().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                    return;
                }
                if (this.a != null) {
                    long b = this.g - b();
                    long longValue = ((Long) this.e.a(t3.M7)).longValue();
                    if (longValue >= 0 && b > longValue) {
                        a();
                        z = true;
                        if (z || (aVar = (a) this.f.get()) == null) {
                        }
                        aVar.onAdRefresh();
                        return;
                    }
                    this.a.e();
                }
                z = false;
                if (z) {
                }
            }
        }
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        boolean z;
        synchronized (this.b) {
            z = this.a != null;
        }
        return z;
    }

    public void j() {
        synchronized (this.b) {
            k();
            this.d = true;
        }
    }

    public void m() {
        synchronized (this.b) {
            n();
            this.d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a() {
        synchronized (this.b) {
            j7 j7Var = this.a;
            if (j7Var != null) {
                j7Var.a();
                l();
            }
        }
    }
}
