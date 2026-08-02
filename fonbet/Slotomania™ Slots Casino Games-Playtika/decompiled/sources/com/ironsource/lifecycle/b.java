package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC2490ja;
import com.ironsource.InterfaceC2473ia;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private static final b m = new b();
    private static AtomicBoolean n = new AtomicBoolean(false);
    static final long o = 700;
    private int a = 0;
    private int b = 0;
    private boolean c = true;
    private boolean d = true;
    private EnumC2490ja e = EnumC2490ja.NONE;
    private final List<InterfaceC2473ia> f = new CopyOnWriteArrayList();
    private final Runnable g = new Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            b.this.f();
        }
    };
    private final Runnable h = new Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            b.this.g();
        }
    };
    private final Runnable i = new Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            b.this.h();
        }
    };
    private final Runnable j = new Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda3
        @Override // java.lang.Runnable
        public final void run() {
            b.this.i();
        }
    };
    private final Runnable k = new Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda4
        @Override // java.lang.Runnable
        public final void run() {
            b.this.j();
        }
    };
    private final a.InterfaceC0213a l = new a();

    class a implements a.InterfaceC0213a {
        a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0213a
        public void a(Activity activity) {
            b.this.b(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0213a
        public void b(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0213a
        public void c(Activity activity) {
        }
    }

    public static b d() {
        return m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<InterfaceC2473ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<InterfaceC2473ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<InterfaceC2473ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<InterfaceC2473ia> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void a(InterfaceC2473ia interfaceC2473ia) {
        if (!IronsourceLifecycleProvider.a() || interfaceC2473ia == null || this.f.contains(interfaceC2473ia)) {
            return;
        }
        this.f.add(interfaceC2473ia);
    }

    public void b(InterfaceC2473ia interfaceC2473ia) {
        if (this.f.contains(interfaceC2473ia)) {
            this.f.remove(interfaceC2473ia);
        }
    }

    public EnumC2490ja c() {
        return this.e;
    }

    public boolean e() {
        return this.e == EnumC2490ja.STOPPED;
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
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }

    void c(Activity activity) {
        int i = this.a + 1;
        this.a = i;
        if (i == 1 && this.d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.k);
            this.d = false;
            this.e = EnumC2490ja.STARTED;
        }
    }

    void d(Activity activity) {
        this.a--;
        b();
    }

    void b(Activity activity) {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.j);
                this.c = false;
                this.e = EnumC2490ja.RESUMED;
                return;
            }
            IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.g);
        }
    }

    void a(Context context) {
        Application application;
        if (!n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    private void b() {
        if (this.a == 0 && this.c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.i);
            this.d = true;
            this.e = EnumC2490ja.STOPPED;
        }
    }

    void a(Activity activity) {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.g, 700L);
        }
    }

    private void a() {
        if (this.b == 0) {
            this.c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.h);
            this.e = EnumC2490ja.PAUSED;
        }
    }
}
