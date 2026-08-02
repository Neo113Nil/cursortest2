package com.sofascore.results.player.media;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.results.media.BaseMediaFragment;
import defpackage.csk;
import defpackage.cte;
import defpackage.gf0;
import defpackage.jc4;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.p1f;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.vv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_PlayerMediaFragment<T extends IRecent> extends BaseMediaFragment<T> implements vv8 {
    public csk m;
    public volatile gf0 o;
    public boolean n = false;
    public final Object p = new Object();
    public boolean q = false;

    public final void F() {
        if (this.m == null) {
            this.m = new csk(super.getContext(), this);
            this.n = rfo.E(super.getContext());
        }
    }

    public final void G() {
        if (this.q) {
            return;
        }
        this.q = true;
        ((PlayerMediaFragment) this).k = (p1f) ((jc4) ((cte) f())).a.M0.get();
    }

    @Override // defpackage.uv8
    public final Object f() {
        if (this.o == null) {
            synchronized (this.p) {
                try {
                    if (this.o == null) {
                        this.o = new gf0(this);
                    }
                } finally {
                }
            }
        }
        return this.o.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.n) {
            return null;
        }
        F();
        return this.m;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        return oyn.E(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.m;
        o3a.p(cskVar == null || gf0.c(cskVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        F();
        G();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        F();
        G();
    }
}
