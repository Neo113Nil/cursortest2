package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.Df;
import com.ironsource.EnumC4145ja;
import com.ironsource.InterfaceC4128ia;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.a;
import defpackage.ztl;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private static final b m = new b();
    private static AtomicBoolean n = new AtomicBoolean(false);
    static final long o = 700;
    private int a = 0;
    private int b = 0;
    private boolean c = true;
    private boolean d = true;
    private EnumC4145ja e = EnumC4145ja.NONE;
    private final List<InterfaceC4128ia> f = new CopyOnWriteArrayList();
    private final AtomicReference<Df.a> g = new AtomicReference<>();
    private final Runnable h = new ztl(this, 1);
    private final Runnable i = new ztl(this, 2);
    private final Runnable j = new ztl(this, 3);
    private final Runnable k = new ztl(this, 4);
    private final a.InterfaceC1205a l = new a();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<InterfaceC4128ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<InterfaceC4128ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<InterfaceC4128ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<InterfaceC4128ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void a(Activity activity) {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            this.g.set(IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new ztl(this, 0), o));
        }
    }

    public void b(Activity activity) {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.j);
                this.c = false;
                this.e = EnumC4145ja.RESUMED;
            } else {
                Df.a aVar = this.g.get();
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public void c(Activity activity) {
        int i = this.a + 1;
        this.a = i;
        if (i == 1 && this.d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.k);
            this.d = false;
            this.e = EnumC4145ja.STARTED;
        }
    }

    public void d(Activity activity) {
        this.a--;
        b();
    }

    public boolean e() {
        return this.e == EnumC4145ja.STOPPED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a a2 = com.ironsource.lifecycle.a.a(activity);
        if (a2 != null) {
            a2.d(this.l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }

    public static b d() {
        return m;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements a.InterfaceC1205a {
        public a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC1205a
        public void a(Activity activity) {
            b.this.b(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC1205a
        public void b(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC1205a
        public void c(Activity activity) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    public EnumC4145ja c() {
        return this.e;
    }

    public void a(InterfaceC4128ia interfaceC4128ia) {
        if (!IronsourceLifecycleProvider.a() || interfaceC4128ia == null || this.f.contains(interfaceC4128ia)) {
            return;
        }
        this.f.add(interfaceC4128ia);
    }

    public void a(Context context) {
        Application application;
        if (!n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    private void a() {
        if (this.b == 0) {
            this.c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.h);
            this.e = EnumC4145ja.PAUSED;
        }
    }

    public void b(InterfaceC4128ia interfaceC4128ia) {
        if (this.f.contains(interfaceC4128ia)) {
            this.f.remove(interfaceC4128ia);
        }
    }

    private void b() {
        if (this.a == 0 && this.c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.i);
            this.d = true;
            this.e = EnumC4145ja.STOPPED;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
