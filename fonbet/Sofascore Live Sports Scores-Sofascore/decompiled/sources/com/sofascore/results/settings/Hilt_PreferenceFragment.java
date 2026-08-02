package com.sofascore.results.settings;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.preference.PreferenceFragmentCompat;
import defpackage.csk;
import defpackage.gf0;
import defpackage.jc4;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.vv8;
import defpackage.w4f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_PreferenceFragment extends PreferenceFragmentCompat implements vv8 {
    public csk i;
    public volatile gf0 k;
    public boolean j = false;
    public final Object l = new Object();
    public boolean m = false;

    @Override // defpackage.uv8
    public final Object f() {
        if (this.k == null) {
            synchronized (this.l) {
                try {
                    if (this.k == null) {
                        this.k = new gf0(this);
                    }
                } finally {
                }
            }
        }
        return this.k.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.j) {
            return null;
        }
        m();
        return this.i;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        return oyn.E(this, super.getDefaultViewModelProviderFactory());
    }

    public final void m() {
        if (this.i == null) {
            this.i = new csk(super.getContext(), this);
            this.j = rfo.E(super.getContext());
        }
    }

    public final void n() {
        if (this.m) {
            return;
        }
        this.m = true;
        ((PreferenceFragment) this).o = (SharedPreferences) ((jc4) ((w4f) f())).a.l.get();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.i;
        o3a.p(cskVar == null || gf0.c(cskVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m();
        n();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        m();
        n();
    }
}
