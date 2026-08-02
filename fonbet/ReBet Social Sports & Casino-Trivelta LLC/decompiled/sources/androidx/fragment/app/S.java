package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.C2195u;
import androidx.lifecycle.InterfaceC2184i;
import androidx.lifecycle.U;

/* loaded from: classes.dex */
public class S implements InterfaceC2184i, B2.g, androidx.lifecycle.W {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f20099a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.V f20100b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f20101c;

    /* renamed from: d, reason: collision with root package name */
    public U.c f20102d;

    /* renamed from: e, reason: collision with root package name */
    public C2195u f20103e = null;

    /* renamed from: f, reason: collision with root package name */
    public B2.f f20104f = null;

    public S(Fragment fragment, androidx.lifecycle.V v10, Runnable runnable) {
        this.f20099a = fragment;
        this.f20100b = v10;
        this.f20101c = runnable;
    }

    public void a(AbstractC2185j.a aVar) {
        this.f20103e.i(aVar);
    }

    public void b() {
        if (this.f20103e == null) {
            this.f20103e = new C2195u(this);
            B2.f a10 = B2.f.a(this);
            this.f20104f = a10;
            a10.c();
            this.f20101c.run();
        }
    }

    public boolean c() {
        return this.f20103e != null;
    }

    public void d(Bundle bundle) {
        this.f20104f.d(bundle);
    }

    public void e(Bundle bundle) {
        this.f20104f.e(bundle);
    }

    public void f(AbstractC2185j.b bVar) {
        this.f20103e.n(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC2184i
    public X0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f20099a.requireContext().getApplicationContext();
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
        X0.b bVar = new X0.b();
        if (application != null) {
            bVar.c(U.a.f20360h, application);
        }
        bVar.c(androidx.lifecycle.K.f20262a, this.f20099a);
        bVar.c(androidx.lifecycle.K.f20263b, this);
        if (this.f20099a.getArguments() != null) {
            bVar.c(androidx.lifecycle.K.f20264c, this.f20099a.getArguments());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.InterfaceC2184i
    public U.c getDefaultViewModelProviderFactory() {
        Application application;
        U.c defaultViewModelProviderFactory = this.f20099a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f20099a.mDefaultFactory)) {
            this.f20102d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f20102d == null) {
            Context applicationContext = this.f20099a.requireContext().getApplicationContext();
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
            Fragment fragment = this.f20099a;
            this.f20102d = new androidx.lifecycle.N(application, fragment, fragment.getArguments());
        }
        return this.f20102d;
    }

    @Override // androidx.lifecycle.InterfaceC2193s
    public AbstractC2185j getLifecycle() {
        b();
        return this.f20103e;
    }

    @Override // B2.g
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f20104f.b();
    }

    @Override // androidx.lifecycle.W
    public androidx.lifecycle.V getViewModelStore() {
        b();
        return this.f20100b;
    }
}
