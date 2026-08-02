package com.vk.voip.ui.permissions;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentImpl;
import kotlin.NoWhenBranchMatchedException;
import xsna.bzb0;
import xsna.d5;
import xsna.dhr0;
import xsna.gvw0;
import xsna.l7s;
import xsna.spv0;

/* compiled from: PictureInPicturePermissionFragment.kt */
/* loaded from: classes7.dex */
public final class PictureInPicturePermissionFragment extends FragmentImpl {
    public static final /* synthetic */ int S = 0;
    public gvw0 N;
    public bzb0 O;
    public spv0 P;
    public d5 Q;
    public boolean R;

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 60091) {
            gvw0 gvw0Var = this.N;
            boolean c = gvw0Var != null ? gvw0Var.c() : false;
            if (c) {
                spv0 spv0Var = this.P;
                if (spv0Var != null) {
                    spv0Var.invoke();
                }
            } else {
                if (c) {
                    throw new NoWhenBranchMatchedException();
                }
                d5 d5Var = this.Q;
                if (d5Var != null) {
                    d5Var.invoke();
                }
            }
        }
        tn();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.N = new gvw0(kn(), null);
        FragmentActivity kn = kn();
        dhr0.a.getClass();
        this.O = new bzb0(new l7s(kn, dhr0.u().c));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.N = null;
        bzb0 bzb0Var = this.O;
        if (bzb0Var != null) {
            bzb0Var.a();
        }
        this.O = null;
        this.P = null;
        this.Q = null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.R) {
            tn();
        }
    }
}
