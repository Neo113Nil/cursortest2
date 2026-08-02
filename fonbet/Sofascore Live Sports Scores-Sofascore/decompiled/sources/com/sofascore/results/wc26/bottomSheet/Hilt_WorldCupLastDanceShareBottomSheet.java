package com.sofascore.results.wc26.bottomSheet;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal;
import defpackage.csk;
import defpackage.gf0;
import defpackage.hfl;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.qtk;
import defpackage.rfo;
import defpackage.vv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_WorldCupLastDanceShareBottomSheet<T extends Parcelable> extends BaseShareComposeBottomSheetModal<T> implements vv8 {
    public volatile gf0 B;
    public csk z;
    public boolean A = false;
    public final Object C = new Object();
    public boolean D = false;

    public final void S() {
        if (this.z == null) {
            this.z = new csk(super.getContext(), this);
            this.A = rfo.E(super.getContext());
        }
    }

    @Override // defpackage.uv8
    public final Object f() {
        if (this.B == null) {
            synchronized (this.C) {
                try {
                    if (this.B == null) {
                        this.B = new gf0(this);
                    }
                } finally {
                }
            }
        }
        return this.B.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.A) {
            return null;
        }
        S();
        return this.z;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        return oyn.E(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.z;
        o3a.p(cskVar == null || gf0.c(cskVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S();
        if (this.D) {
            return;
        }
        this.D = true;
        hfl hflVar = (hfl) f();
        hflVar.getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        S();
        if (this.D) {
            return;
        }
        this.D = true;
        hfl hflVar = (hfl) f();
        hflVar.getClass();
    }
}
