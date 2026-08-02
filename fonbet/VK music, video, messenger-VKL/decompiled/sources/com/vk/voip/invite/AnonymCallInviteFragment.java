package com.vk.voip.invite;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.BaseFragment;
import xsna.a201;
import xsna.c1w0;
import xsna.dhr0;
import xsna.khw0;
import xsna.oz50;
import xsna.pt2;
import xsna.sp;
import xsna.w89;
import xsna.wwf0;

/* compiled from: AnonymCallInviteFragment.kt */
/* loaded from: classes7.dex */
public class AnonymCallInviteFragment extends BaseFragment {
    public static final /* synthetic */ int T = 0;
    public pt2 S;

    /* compiled from: AnonymCallInviteFragment.kt */
    public final class a {
        public a() {
        }

        public final void a(boolean z) {
            c1w0 c1w0Var = wwf0.g;
            if (c1w0Var == null) {
                c1w0Var = null;
            }
            c1w0Var.c.getClass();
            AnonymCallInviteFragment.this.Mf(-1, new Intent());
        }
    }

    /* compiled from: AnonymCallInviteFragment.kt */
    public static final class b extends oz50 {
        public b() {
            super(AnonymCallInviteFragment.class, AnonymCallInviteActivity.class, null);
            s(true);
            x();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        pt2 pt2Var = this.S;
        if (pt2Var == null) {
            pt2Var = null;
        }
        a aVar = pt2Var.q;
        if (aVar != null) {
            aVar.a(true);
        }
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        w89 w89Var = new w89();
        khw0 a2 = a201.b().a();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("vkJoinLink") : null;
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle arguments2 = getArguments();
        pt2 pt2Var = new pt2(context, w89Var, a2, string, arguments2 != null ? arguments2.getString("name") : null);
        this.S = pt2Var;
        pt2Var.q = new a();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        pt2 pt2Var = this.S;
        if (pt2Var == null) {
            pt2Var = null;
        }
        pt2Var.K0(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dhr0.a.getClass();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(dhr0.E());
        pt2 pt2Var = this.S;
        if (pt2Var == null) {
            pt2Var = null;
        }
        if (viewGroup != null) {
            return pt2Var.E0(cloneInContext, viewGroup, null, bundle);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        pt2 pt2Var = this.S;
        if (pt2Var == null) {
            pt2Var = null;
        }
        pt2Var.H0();
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        pt2 pt2Var = this.S;
        if (pt2Var == null) {
            pt2Var = null;
        }
        pt2Var.P0(bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        pt2 pt2Var = this.S;
        if (pt2Var == null) {
            pt2Var = null;
        }
        pt2Var.Z0(null);
        sp.u(view, !dhr0.M());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        pt2 pt2Var = this.S;
        if (pt2Var == null) {
            pt2Var = null;
        }
        pt2Var.O0(bundle);
    }
}
