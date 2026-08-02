package com.sofascore.results.fantasy.league.settings.dialog;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.sofascore.results.dialog.BaseFullScreenDialog;
import defpackage.c67;
import defpackage.csk;
import defpackage.gf0;
import defpackage.krk;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.vv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_FantasyLeagueTeamsFullScreenDialog<T extends krk> extends BaseFullScreenDialog<T> implements vv8 {
    public csk v;
    public volatile gf0 x;
    public boolean w = false;
    public final Object y = new Object();
    public boolean z = false;

    @Override // defpackage.uv8
    public final Object f() {
        if (this.x == null) {
            synchronized (this.y) {
                try {
                    if (this.x == null) {
                        this.x = new gf0(this);
                    }
                } finally {
                }
            }
        }
        return this.x.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.w) {
            return null;
        }
        u();
        return this.v;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        return oyn.E(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.v;
        o3a.p(cskVar == null || gf0.c(cskVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        u();
        if (this.z) {
            return;
        }
        this.z = true;
        c67 c67Var = (c67) f();
        c67Var.getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    public final void u() {
        if (this.v == null) {
            this.v = new csk(super.getContext(), this);
            this.w = rfo.E(super.getContext());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        u();
        if (this.z) {
            return;
        }
        this.z = true;
        c67 c67Var = (c67) f();
        c67Var.getClass();
    }
}
