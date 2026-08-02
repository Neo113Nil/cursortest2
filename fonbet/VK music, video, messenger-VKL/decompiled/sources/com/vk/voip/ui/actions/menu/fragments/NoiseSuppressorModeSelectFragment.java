package com.vk.voip.ui.actions.menu.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.voip.ui.menu.feature.VoipCallMainMenuComponentProvider;
import xsna.bfm;
import xsna.dhr0;
import xsna.l7s;
import xsna.p570;
import xsna.u59;

/* compiled from: NoiseSuppressorModeSelectFragment.kt */
/* loaded from: classes7.dex */
public final class NoiseSuppressorModeSelectFragment extends VoipMainMenuFragmentBase {
    public static final /* synthetic */ int Q = 0;
    public u59 P;

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
        } else {
            this.P = u59Var;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        u59 u59Var = this.P;
        if (u59Var == null) {
            return null;
        }
        return new p570(layoutInflater, viewGroup, new bfm(u59Var, 26)).a;
    }
}
