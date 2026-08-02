package com.sofascore.results.sharemodal.match;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.sofascore.results.sharemodal.BaseSinglePageShareModal;
import defpackage.csk;
import defpackage.gf0;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.vch;
import defpackage.vv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_ShareMatchDetailsModal extends BaseSinglePageShareModal implements vv8 {
    public volatile gf0 A;
    public csk y;
    public boolean z = false;
    public final Object B = new Object();
    public boolean C = false;

    public final void O() {
        if (this.y == null) {
            this.y = new csk(super.getContext(), this);
            this.z = rfo.E(super.getContext());
        }
    }

    @Override // defpackage.uv8
    public final Object f() {
        if (this.A == null) {
            synchronized (this.B) {
                try {
                    if (this.A == null) {
                        this.A = new gf0(this);
                    }
                } finally {
                }
            }
        }
        return this.A.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.z) {
            return null;
        }
        O();
        return this.y;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        return oyn.E(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.y;
        o3a.p(cskVar == null || gf0.c(cskVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        O();
        if (this.C) {
            return;
        }
        this.C = true;
        vch vchVar = (vch) f();
        vchVar.getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        O();
        if (this.C) {
            return;
        }
        this.C = true;
        vch vchVar = (vch) f();
        vchVar.getClass();
    }
}
