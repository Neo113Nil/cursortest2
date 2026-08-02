package com.sofascore.results.event.lineups.football;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.sofascore.results.event.lineups.BaseEventLineupsFragment;
import defpackage.b06;
import defpackage.csk;
import defpackage.gf0;
import defpackage.jc4;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.p1f;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.vv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_EventFootballLineupsFragment<State> extends BaseEventLineupsFragment<State> implements vv8 {
    public csk n;
    public volatile gf0 p;
    public boolean o = false;
    public final Object q = new Object();
    public boolean r = false;

    public final void F() {
        if (this.n == null) {
            this.n = new csk(super.getContext(), this);
            this.o = rfo.E(super.getContext());
        }
    }

    public final void G() {
        if (this.r) {
            return;
        }
        this.r = true;
        ((EventFootballLineupsFragment) this).k = (p1f) ((jc4) ((b06) f())).a.M0.get();
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
        F();
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
