package com.vk.voip.ui.actions.menu.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.movika.sdk.base.ui.g;
import com.vk.movika.sdk.base.ui.k;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.menu.feature.VoipCallMainMenuComponentProvider;
import io.reactivex.rxjava3.kotlin.c;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cdz;
import xsna.dhr0;
import xsna.e41;
import xsna.fpf0;
import xsna.ghw0;
import xsna.gzs;
import xsna.hg1;
import xsna.k79;
import xsna.l1;
import xsna.l7s;
import xsna.ld;
import xsna.m7m;
import xsna.r79;
import xsna.s3q0;
import xsna.sg2;
import xsna.t9;
import xsna.u59;
import xsna.yfb;

/* compiled from: CallParticipantPermissionsFragment.kt */
/* loaded from: classes7.dex */
public final class CallParticipantPermissionsFragment extends VoipMainMenuFragmentBase {
    public static final /* synthetic */ int S = 0;
    public k79 P;
    public cdz Q;
    public r79 R;

    /* compiled from: CallParticipantPermissionsFragment.kt */
    public static final class a {
        public static CallParticipantPermissionsFragment a(u59 u59Var, boolean z) {
            CallParticipantPermissionsFragment callParticipantPermissionsFragment = new CallParticipantPermissionsFragment();
            Bundle b = yfb.b(new Pair("STANDALONE_ARGS", Boolean.valueOf(z)));
            b.putParcelable("call_main_menu", new VoipCallMainMenuComponentProvider(u59Var));
            callParticipantPermissionsFragment.setArguments(b);
            return callParticipantPermissionsFragment;
        }
    }

    /* compiled from: CallParticipantPermissionsFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((CallParticipantPermissionsFragment) this.receiver).tn();
            return s3q0.a;
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
        this.Q = new cdz(new b(0, this, CallParticipantPermissionsFragment.class, "dismissAllowingStateLoss", "dismissAllowingStateLoss()V", 0), new k(3, u59Var, this), new t9(this, 12));
        k79 k79Var = new k79(this, new l1(u59Var, 11), new g(u59Var, 16));
        hg1.a(c.f(3, k79Var.a(), null, null, new sg2(((VoipAnalyticsInternalComponent) m7m.d(this).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df(), 1)), this);
        this.P = k79Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        r79 r79Var = new r79(layoutInflater, viewGroup);
        this.R = r79Var;
        k79 k79Var = this.P;
        if (k79Var != null) {
            k79Var.b(r79Var);
        }
        cdz cdzVar = this.Q;
        if (cdzVar != null) {
            cdzVar.a(r79Var.p);
        }
        return (ViewGroup) r79Var.b;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        k79 k79Var = this.P;
        if (k79Var != null) {
            k79Var.c();
        }
        this.P = null;
        cdz cdzVar = this.Q;
        if (cdzVar != null) {
            cdzVar.d.w();
            cdzVar.e.dispose();
            cdzVar.g.e();
        }
        this.Q = null;
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Bundle arguments;
        r79 r79Var = this.R;
        if (r79Var != null) {
            r79Var.destroy();
        }
        this.R = null;
        k79 k79Var = this.P;
        if (k79Var != null) {
            e41 e41Var = k79Var.m;
            if (e41Var != null) {
                e41Var.destroy();
            }
            k79Var.m = null;
            k79Var.h.e();
        }
        cdz cdzVar = this.Q;
        if (cdzVar != null) {
            cdzVar.e.e();
        }
        Bundle arguments2 = getArguments();
        VoipCallMainMenuComponentProvider voipCallMainMenuComponentProvider = arguments2 != null ? (VoipCallMainMenuComponentProvider) arguments2.getParcelable("call_main_menu") : null;
        u59 u59Var = voipCallMainMenuComponentProvider != null ? voipCallMainMenuComponentProvider.b : null;
        if (u59Var != null && (arguments = getArguments()) != null && arguments.getBoolean("STANDALONE_ARGS")) {
            VoipMainMenuActionsFragment voipMainMenuActionsFragment = new VoipMainMenuActionsFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("call_main_menu", new VoipCallMainMenuComponentProvider(u59Var));
            voipMainMenuActionsFragment.setArguments(bundle);
            u59Var.d.a(new ghw0.k.c(new ld(voipMainMenuActionsFragment, 12)));
        }
        super.onDestroyView();
    }
}
