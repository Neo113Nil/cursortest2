package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b2 implements androidx.lifecycle.r, q2.f, androidx.lifecycle.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f1871a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.o1 f1872b;

    /* renamed from: c, reason: collision with root package name */
    public final z f1873c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.m1 f1874d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.g0 f1875e = null;

    /* renamed from: f, reason: collision with root package name */
    public q2.e f1876f = null;

    public b2(Fragment fragment, androidx.lifecycle.o1 o1Var, z zVar) {
        this.f1871a = fragment;
        this.f1872b = o1Var;
        this.f1873c = zVar;
    }

    public final void a(androidx.lifecycle.w wVar) {
        this.f1875e.e(wVar);
    }

    public final void b() {
        if (this.f1875e == null) {
            this.f1875e = new androidx.lifecycle.g0(this);
            Intrinsics.checkNotNullParameter(this, "owner");
            q2.e eVar = new q2.e(new r2.a(this, new me.a(10, this)));
            this.f1876f = eVar;
            eVar.a();
            this.f1873c.run();
        }
    }

    @Override // androidx.lifecycle.r
    public final t1.c getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f1871a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        t1.e eVar = new t1.e(0);
        if (application != null) {
            eVar.b(androidx.lifecycle.l1.f2201e, application);
        }
        eVar.b(androidx.lifecycle.d1.f2149a, fragment);
        eVar.b(androidx.lifecycle.d1.f2150b, this);
        if (fragment.getArguments() != null) {
            eVar.b(androidx.lifecycle.d1.f2151c, fragment.getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.m1 getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f1871a;
        androidx.lifecycle.m1 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f1874d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f1874d == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f1874d = new androidx.lifecycle.g1(application, fragment, fragment.getArguments());
        }
        return this.f1874d;
    }

    @Override // androidx.lifecycle.e0
    public final androidx.lifecycle.y getLifecycle() {
        b();
        return this.f1875e;
    }

    @Override // q2.f
    public final q2.d getSavedStateRegistry() {
        b();
        return this.f1876f.f21928b;
    }

    @Override // androidx.lifecycle.p1
    public final androidx.lifecycle.o1 getViewModelStore() {
        b();
        return this.f1872b;
    }
}
