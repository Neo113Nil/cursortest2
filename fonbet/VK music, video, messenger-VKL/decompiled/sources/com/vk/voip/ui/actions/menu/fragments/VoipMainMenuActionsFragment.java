package com.vk.voip.ui.actions.menu.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.voip.ui.menu.feature.VoipCallMainMenuComponentProvider;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.single.v;
import xsna.asu0;
import xsna.be50;
import xsna.dhr0;
import xsna.dwz;
import xsna.e41;
import xsna.k6k;
import xsna.ke00;
import xsna.l7s;
import xsna.odm;
import xsna.p490;
import xsna.r99;
import xsna.sy4;
import xsna.u59;
import xsna.vgs0;
import xsna.whm0;

/* compiled from: VoipMainMenuActionsFragment.kt */
/* loaded from: classes7.dex */
public final class VoipMainMenuActionsFragment extends VoipMainMenuFragmentBase implements u59.a {
    public static final /* synthetic */ int V = 0;
    public ke00 P;
    public u59 Q;
    public c S;
    public c T;
    public final b R = new b();
    public final p490 U = r99.a.a();

    /* compiled from: VoipMainMenuActionsFragment.kt */
    public static final class a {
        public static VoipMainMenuActionsFragment a(u59 u59Var) {
            VoipMainMenuActionsFragment voipMainMenuActionsFragment = new VoipMainMenuActionsFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("call_main_menu", new VoipCallMainMenuComponentProvider(u59Var));
            voipMainMenuActionsFragment.setArguments(bundle);
            return voipMainMenuActionsFragment;
        }
    }

    @Override // com.vk.voip.ui.utils.ContextHolderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        dhr0.a.getClass();
        super.onAttach(new l7s(context, dhr0.u().c));
    }

    @Override // com.vk.voip.ui.actions.menu.fragments.VoipMainMenuFragmentBase, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            tn();
            return;
        }
        Bundle arguments = getArguments();
        VoipCallMainMenuComponentProvider voipCallMainMenuComponentProvider = arguments != null ? (VoipCallMainMenuComponentProvider) arguments.getParcelable("call_main_menu") : null;
        u59 u59Var = voipCallMainMenuComponentProvider != null ? voipCallMainMenuComponentProvider.b : null;
        if (u59Var == null) {
            tn();
            return;
        }
        this.P = new ke00(this, new k6k(u59Var, 26), new odm(u59Var, 23));
        this.Q = u59Var;
        this.S = u59Var.d.e.subscribe(new be50(new vgs0(this, 14), 29));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        u59 u59Var = this.Q;
        if (u59Var == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(requireContext());
        v vVar = new v(new dwz(this, layoutInflater, frameLayout));
        asu0 asu0Var = asu0.a;
        this.R.b(io.reactivex.rxjava3.subjects.c.b(asu0Var, vVar).m(asu0Var.d()).subscribe(new whm0(new sy4(u59Var, frameLayout, this, 8), 12)));
        return frameLayout;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ke00 ke00Var = this.P;
        if (ke00Var != null) {
            ke00Var.c();
        }
        this.P = null;
        super.onDestroy();
        this.U.w();
        c cVar = this.S;
        if (cVar != null) {
            cVar.dispose();
        }
        this.S = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ke00 ke00Var = this.P;
        if (ke00Var != null) {
            e41 e41Var = ke00Var.m;
            if (e41Var != null) {
                e41Var.destroy();
            }
            ke00Var.m = null;
            ke00Var.h.e();
        }
        this.R.e();
        super.onDestroyView();
    }
}
