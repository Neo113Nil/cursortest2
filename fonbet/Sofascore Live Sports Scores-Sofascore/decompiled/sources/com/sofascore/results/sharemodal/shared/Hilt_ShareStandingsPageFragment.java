package com.sofascore.results.sharemodal.shared;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.sofascore.results.sharemodal.BaseSharePageFragment;
import defpackage.csk;
import defpackage.gf0;
import defpackage.jc4;
import defpackage.o3a;
import defpackage.odh;
import defpackage.oyn;
import defpackage.p1f;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.vv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_ShareStandingsPageFragment extends BaseSharePageFragment implements vv8 {
    public csk n;
    public volatile gf0 p;
    public boolean o = false;
    public final Object q = new Object();
    public boolean r = false;

    public final void E() {
        if (this.n == null) {
            this.n = new csk(super.getContext(), this);
            this.o = rfo.E(super.getContext());
        }
    }

    public final void F() {
        if (this.r) {
            return;
        }
        this.r = true;
        ((ShareStandingsPageFragment) this).k = (p1f) ((jc4) ((odh) f())).a.M0.get();
    }

    @Override // defpackage.uv8
    public final Object f() {
        if (this.p == null) {
            synchronized (this.q) {
                try {
                    if (this.p == null) {
                        this.p = new gf0(this);
                    }
                } finally {
                }
            }
        }
        return this.p.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.o) {
            return null;
        }
        E();
        return this.n;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        return oyn.E(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.n;
        o3a.p(cskVar == null || gf0.c(cskVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        E();
        F();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        E();
        F();
    }
}
