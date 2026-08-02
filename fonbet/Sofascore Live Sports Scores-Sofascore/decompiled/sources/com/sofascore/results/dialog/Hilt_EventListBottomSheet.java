package com.sofascore.results.dialog;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.csk;
import defpackage.gf0;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.v16;
import defpackage.vv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_EventListBottomSheet extends BaseModalBottomSheetDialog implements vv8 {
    public csk w;
    public volatile gf0 y;
    public boolean x = false;
    public final Object z = new Object();
    public boolean A = false;

    public final void F() {
        if (this.w == null) {
            this.w = new csk(super.getContext(), this);
            this.x = rfo.E(super.getContext());
        }
    }

    @Override // defpackage.uv8
    public final Object f() {
        if (this.y == null) {
            synchronized (this.z) {
                try {
                    if (this.y == null) {
                        this.y = new gf0(this);
                    }
                } finally {
                }
            }
        }
        return this.y.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.x) {
            return null;
        }
        F();
        return this.w;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        return oyn.E(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.w;
        o3a.p(cskVar == null || gf0.c(cskVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        F();
        if (this.A) {
            return;
        }
        this.A = true;
        v16 v16Var = (v16) f();
        v16Var.getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        F();
        if (this.A) {
            return;
        }
        this.A = true;
        v16 v16Var = (v16) f();
        v16Var.getClass();
    }
}
