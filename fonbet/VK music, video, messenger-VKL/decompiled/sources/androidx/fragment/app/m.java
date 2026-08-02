package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import xsna.fg50;
import xsna.gat;
import xsna.jas;
import xsna.qbk;
import xsna.v1h0;
import xsna.w1h0;
import xsna.wyt0;
import xsna.xyt0;
import xsna.y1h0;
import xsna.z1h0;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public final class m implements androidx.lifecycle.f, z1h0, xyt0 {
    public final Fragment b;
    public final wyt0 c;
    public final jas d;
    public e0.c e;
    public androidx.lifecycle.m f = null;
    public w1h0 g = null;

    public m(@NonNull Fragment fragment, @NonNull wyt0 wyt0Var, @NonNull jas jasVar) {
        this.b = fragment;
        this.c = wyt0Var;
        this.d = jasVar;
    }

    public final void a(@NonNull Lifecycle.Event event) {
        this.f.c(event);
    }

    public final void b() {
        if (this.f == null) {
            this.f = new androidx.lifecycle.m(this, true);
            y1h0 y1h0Var = new y1h0(this, new gat(this, 9));
            this.g = new w1h0(y1h0Var);
            y1h0Var.a();
            this.d.run();
        }
    }

    @Override // androidx.lifecycle.f
    @NonNull
    public final qbk getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.b;
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
        fg50 fg50Var = new fg50((Object) null);
        if (application != null) {
            fg50Var.a(e0.a.d, application);
        }
        fg50Var.a(a0.a, fragment);
        fg50Var.a(a0.b, this);
        if (fragment.getArguments() != null) {
            fg50Var.a(a0.c, fragment.getArguments());
        }
        return fg50Var;
    }

    @Override // androidx.lifecycle.f
    @NonNull
    public final e0.c getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.b;
        e0.c defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.e == null) {
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
            this.e = new b0(application, fragment, fragment.getArguments());
        }
        return this.e;
    }

    @Override // xsna.f5z
    @NonNull
    public final Lifecycle getLifecycle() {
        b();
        return this.f;
    }

    @Override // xsna.z1h0
    @NonNull
    public final v1h0 getSavedStateRegistry() {
        b();
        return this.g.b;
    }

    @Override // xsna.xyt0
    @NonNull
    public final wyt0 getViewModelStore() {
        b();
        return this.c;
    }
}
