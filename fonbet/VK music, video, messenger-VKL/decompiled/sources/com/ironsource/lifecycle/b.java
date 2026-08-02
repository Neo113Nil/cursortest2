package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC4404ka;
import com.ironsource.Ff;
import com.ironsource.InterfaceC4386ja;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import xsna.b04;
import xsna.j0;
import xsna.n93;
import xsna.o93;
import xsna.u12;

/* loaded from: classes13.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private static final b m = new b();
    private static AtomicBoolean n = new AtomicBoolean(false);
    static final long o = 700;
    private int a = 0;
    private int b = 0;
    private boolean c = true;
    private boolean d = true;
    private EnumC4404ka e = EnumC4404ka.NONE;
    private final List<InterfaceC4386ja> f = new CopyOnWriteArrayList();
    private final AtomicReference<Ff.a> g = new AtomicReference<>();
    private final Runnable h = new u12(this, 16);
    private final Runnable i = new n93(this, 10);
    private final Runnable j = new o93(this, 28);
    private final Runnable k = new b04(this, 19);
    private final a.InterfaceC0224a l = new a();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<InterfaceC4386ja> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<InterfaceC4386ja> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<InterfaceC4386ja> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<InterfaceC4386ja> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
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

    public void a(InterfaceC4386ja interfaceC4386ja) {
        if (!IronsourceLifecycleProvider.a() || interfaceC4386ja == null || this.f.contains(interfaceC4386ja)) {
            return;
        }
        this.f.add(interfaceC4386ja);
    }

    public void b(InterfaceC4386ja interfaceC4386ja) {
        if (this.f.contains(interfaceC4386ja)) {
            this.f.remove(interfaceC4386ja);
        }
    }

    public EnumC4404ka c() {
        return this.e;
    }

    public boolean e() {
        return this.e == EnumC4404ka.STOPPED;
    }

    public void c(Activity activity) {
        int i = this.a + 1;
        this.a = i;
        if (i == 1 && this.d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.k);
            this.d = false;
            this.e = EnumC4404ka.STARTED;
        }
    }

    public void d(Activity activity) {
        this.a--;
        b();
    }

    public void b(Activity activity) {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.j);
                this.c = false;
                this.e = EnumC4404ka.RESUMED;
            } else {
                Ff.a aVar = this.g.get();
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public void a(Context context) {
        Application application;
        if (!n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void a(Activity activity) {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            this.g.set(IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j0(this, 21), o));
        }
    }

    private void b() {
        if (this.a == 0 && this.c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.i);
            this.d = true;
            this.e = EnumC4404ka.STOPPED;
        }
    }

    private void a() {
        if (this.b == 0) {
            this.c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.h);
            this.e = EnumC4404ka.PAUSED;
        }
    }

    public class a implements a.InterfaceC0224a {
        public a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0224a
        public void a(Activity activity) {
            b.this.b(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0224a
        public void b(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0224a
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
