package com.vk.voip.ui.actions.menu.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.voip.ui.menu.feature.VoipCallMainMenuComponentProvider;
import xsna.a89;
import xsna.dhr0;
import xsna.e41;
import xsna.l7s;
import xsna.t79;
import xsna.u59;

/* compiled from: CallParticipantSettingsFragment.kt */
/* loaded from: classes7.dex */
public final class CallParticipantSettingsFragment extends VoipMainMenuFragmentBase {
    public t79 P;

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
            this.P = new t79(this, u59Var);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a89 a89Var = new a89(layoutInflater, viewGroup);
        t79 t79Var = this.P;
        if (t79Var != null) {
            t79Var.b(a89Var);
        }
        return (ViewGroup) a89Var.b;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        t79 t79Var = this.P;
        if (t79Var != null) {
            t79Var.c();
        }
        this.P = null;
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        t79 t79Var = this.P;
        if (t79Var != null) {
            e41 e41Var = t79Var.m;
            if (e41Var != null) {
                e41Var.destroy();
            }
            t79Var.m = null;
            t79Var.h.e();
        }
        super.onDestroyView();
    }
}
