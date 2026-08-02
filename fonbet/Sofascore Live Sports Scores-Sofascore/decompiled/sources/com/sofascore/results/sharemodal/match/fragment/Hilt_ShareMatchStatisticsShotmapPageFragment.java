package com.sofascore.results.sharemodal.match.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.csk;
import defpackage.gf0;
import defpackage.jc4;
import defpackage.kdh;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.p1f;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.vv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_ShareMatchStatisticsShotmapPageFragment extends BaseShareMatchPageFragment implements vv8 {
    public csk o;
    public volatile gf0 q;
    public boolean p = false;
    public final Object r = new Object();
    public boolean s = false;

    public final void F() {
        if (this.o == null) {
            this.o = new csk(super.getContext(), this);
            this.p = rfo.E(super.getContext());
        }
    }

    public final void G() {
        if (this.s) {
            return;
        }
        this.s = true;
        ((ShareMatchStatisticsShotmapPageFragment) this).k = (p1f) ((jc4) ((kdh) f())).a.M0.get();
    }

    @Override // defpackage.uv8
    public final Object f() {
        if (this.q == null) {
            synchronized (this.r) {
                try {
                    if (this.q == null) {
                        this.q = new gf0(this);
                    }
                } finally {
                }
            }
        }
        return this.q.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.p) {
            return null;
        }
        F();
        return this.o;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        return oyn.E(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.o;
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
