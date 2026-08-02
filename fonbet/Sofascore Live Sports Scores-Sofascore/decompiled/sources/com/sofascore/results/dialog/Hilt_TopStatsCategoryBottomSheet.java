package com.sofascore.results.dialog;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import defpackage.csk;
import defpackage.gf0;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.smj;
import defpackage.vv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_TopStatsCategoryBottomSheet extends ComposeModalBottomSheetDialog implements vv8 {
    public csk x;
    public volatile gf0 z;
    public boolean y = false;
    public final Object A = new Object();
    public boolean B = false;

    public final void K() {
        if (this.x == null) {
            this.x = new csk(super.getContext(), this);
            this.y = rfo.E(super.getContext());
        }
    }

    public void L() {
        if (this.B) {
            return;
        }
        this.B = true;
        smj smjVar = (smj) f();
        smjVar.getClass();
    }

    @Override // defpackage.uv8
    public final Object f() {
        if (this.z == null) {
            synchronized (this.A) {
                try {
                    if (this.z == null) {
                        this.z = new gf0(this);
                    }
                } finally {
                }
            }
        }
        return this.z.f();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.y) {
            return null;
        }
        K();
        return this.x;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        return oyn.E(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.x;
        o3a.p(cskVar == null || gf0.c(cskVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        K();
        L();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        K();
        L();
    }
}
