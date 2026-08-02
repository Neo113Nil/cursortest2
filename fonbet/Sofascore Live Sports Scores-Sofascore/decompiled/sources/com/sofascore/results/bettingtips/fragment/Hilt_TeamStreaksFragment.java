package com.sofascore.results.bettingtips.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.csk;
import defpackage.gf0;
import defpackage.jc4;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.p1f;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.t2j;
import defpackage.vv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_TeamStreaksFragment<T> extends AbstractBettingTipsFragment<T> implements vv8 {
    public csk q;
    public volatile gf0 s;
    public boolean r = false;
    public final Object t = new Object();
    public boolean u = false;

    public final void K() {
        if (this.q == null) {
            this.q = new csk(super.getContext(), this);
            this.r = rfo.E(super.getContext());
        }
    }

    public final void L() {
        if (this.u) {
            return;
        }
        this.u = true;
        ((TeamStreaksFragment) this).k = (p1f) ((jc4) ((t2j) f())).a.M0.get();
    }

    @Override // defpackage.uv8
    public final Object f() {
        if (this.s == null) {
            synchronized (this.t) {
                try {
                    if (this.s == null) {
                        this.s = new gf0(this);
                    }
                } finally {
                }
            }
        }
        return this.s.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.r) {
            return null;
        }
        K();
        return this.q;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        return oyn.E(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.q;
        o3a.p(cskVar == null || gf0.c(cskVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        K();
        L();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        K();
        L();
    }
}
