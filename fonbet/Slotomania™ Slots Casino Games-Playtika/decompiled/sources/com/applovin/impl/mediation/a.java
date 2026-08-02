package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.e3;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;

/* loaded from: classes3.dex */
public class a extends com.applovin.impl.b {
    private final com.applovin.impl.c a;
    private final p b;
    private final String c;
    private InterfaceC0102a d;
    private e3 e;
    private String f;

    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0102a {
        void b(e3 e3Var);
    }

    a(l lVar) {
        this.b = lVar.Q();
        this.a = lVar.e();
        this.c = q7.a(l.p(), "AdActivityObserver", lVar);
    }

    public void a(e3 e3Var, InterfaceC0102a interfaceC0102a) {
        if (p.a()) {
            this.b.a("AdActivityObserver", "Starting for ad " + e3Var.getAdUnitId() + "...");
        }
        a();
        this.d = interfaceC0102a;
        this.e = e3Var;
        this.a.a(this);
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!activity.getClass().getName().equals(this.c) || !this.e.C0()) {
            if (this.f == null) {
                this.f = activity.getClass().getName();
                if (p.a()) {
                    this.b.a("AdActivityObserver", "Started tracking ad Activity: " + this.f);
                    return;
                }
                return;
            }
            return;
        }
        if (p.a()) {
            this.b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
        }
        if (this.d != null) {
            if (p.a()) {
                this.b.a("AdActivityObserver", "Invoking callback...");
            }
            this.d.b(this.e);
        }
        a();
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f)) {
            if (p.a()) {
                this.b.a("AdActivityObserver", "Ad Activity destroyed: " + this.f);
            }
            if (this.d != null) {
                if (p.a()) {
                    this.b.a("AdActivityObserver", "Invoking callback...");
                }
                this.d.b(this.e);
            }
            a();
        }
    }

    public void a() {
        if (p.a()) {
            this.b.a("AdActivityObserver", "Cancelling...");
        }
        this.a.b(this);
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
