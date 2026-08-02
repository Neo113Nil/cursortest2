package com.sofascore.results.dialog;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.b3j;
import defpackage.csk;
import defpackage.gf0;
import defpackage.o3a;
import defpackage.rfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_TeamTopPlayersCategoryBottomSheet extends TopStatsCategoryBottomSheet {
    public csk G;
    public boolean H = false;
    public boolean I = false;

    @Override // com.sofascore.results.dialog.Hilt_TopStatsCategoryBottomSheet
    public final void L() {
        if (this.I) {
            return;
        }
        this.I = true;
        b3j b3jVar = (b3j) f();
        b3jVar.getClass();
    }

    public final void O() {
        if (this.G == null) {
            this.G = new csk(super.getContext(), this);
            this.H = rfo.E(super.getContext());
        }
    }

    @Override // com.sofascore.results.dialog.Hilt_TopStatsCategoryBottomSheet, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.H) {
            return null;
        }
        O();
        return this.G;
    }

    @Override // com.sofascore.results.dialog.Hilt_TopStatsCategoryBottomSheet, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.G;
        o3a.p(cskVar == null || gf0.c(cskVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        O();
        L();
    }

    @Override // com.sofascore.results.dialog.Hilt_TopStatsCategoryBottomSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    @Override // com.sofascore.results.dialog.Hilt_TopStatsCategoryBottomSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        O();
        L();
    }
}
