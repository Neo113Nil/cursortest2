package com.sofascore.results.stagesport.fragments.details;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a4i;
import defpackage.csk;
import defpackage.gf0;
import defpackage.jc4;
import defpackage.krk;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.p1f;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.vv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_StageDetailsResultsFragment<VB extends krk> extends AbstractFragment<VB> implements vv8 {
    public csk m;
    public volatile gf0 o;
    public boolean n = false;
    public final Object p = new Object();
    public boolean q = false;

    public final void A() {
        if (this.m == null) {
            this.m = new csk(super.getContext(), this);
            this.n = rfo.E(super.getContext());
        }
    }

    public final void B() {
        if (this.q) {
            return;
        }
        this.q = true;
        ((StageDetailsResultsFragment) this).k = (p1f) ((jc4) ((a4i) f())).a.M0.get();
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
        A();
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
        A();
        B();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        A();
        B();
    }
}
