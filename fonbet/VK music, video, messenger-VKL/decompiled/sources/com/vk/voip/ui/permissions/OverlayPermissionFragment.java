package com.vk.voip.ui.permissions;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.FragmentImpl;
import kotlin.NoWhenBranchMatchedException;
import xsna.bzb0;
import xsna.dhr0;
import xsna.fgu0;
import xsna.fww0;
import xsna.gvw0;
import xsna.l7s;

/* compiled from: OverlayPermissionFragment.kt */
/* loaded from: classes7.dex */
public final class OverlayPermissionFragment extends FragmentImpl {
    public static final /* synthetic */ int S = 0;
    public gvw0 N;
    public bzb0 O;
    public fgu0 P;
    public fww0 Q;
    public boolean R;

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 42902) {
            gvw0 gvw0Var = this.N;
            boolean canDrawOverlays = gvw0Var != null ? Settings.canDrawOverlays(gvw0Var.a) : false;
            if (canDrawOverlays) {
                fgu0 fgu0Var = this.P;
                if (fgu0Var != null) {
                    fgu0Var.invoke();
                }
            } else {
                if (canDrawOverlays) {
                    throw new NoWhenBranchMatchedException();
                }
                fww0 fww0Var = this.Q;
                if (fww0Var != null) {
                    fww0Var.invoke();
                }
            }
        }
        tn();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        this.N = new gvw0(kn(), null);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("IS_FORCED_NIGHT_THEME_KEY")) {
            i = dhr0.C().c;
        } else {
            dhr0.a.getClass();
            i = dhr0.u().c;
        }
        this.O = new bzb0(new l7s(kn(), i));
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
