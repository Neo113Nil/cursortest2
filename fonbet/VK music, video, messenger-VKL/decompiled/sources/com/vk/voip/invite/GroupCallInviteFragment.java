package com.vk.voip.invite;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.voip.VoipCallSource;
import com.vkontakte.android.R;
import xsna.a201;
import xsna.bo8;
import xsna.dhr0;
import xsna.ies;
import xsna.o25;
import xsna.oz50;
import xsna.uhu;
import xsna.v20;
import xsna.w89;
import xsna.xhu;

/* compiled from: GroupCallInviteFragment.kt */
/* loaded from: classes7.dex */
public final class GroupCallInviteFragment extends BaseFragment implements ies {
    public static final /* synthetic */ int V = 0;
    public final v20 S = new v20(this, 25);
    public uhu T;
    public int U;

    /* compiled from: GroupCallInviteFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: GroupCallInviteFragment.kt */
    public static final class b {
        public final GroupCallInviteFragment a;

        public b(GroupCallInviteFragment groupCallInviteFragment) {
            this.a = groupCallInviteFragment;
        }

        public final void a(boolean z) {
            GroupCallInviteFragment groupCallInviteFragment = this.a;
            int i = groupCallInviteFragment.U;
            if (i == 0) {
                groupCallInviteFragment.tn();
            } else if (i == 1) {
                groupCallInviteFragment.finish();
            } else {
                if (i != 2) {
                    return;
                }
                groupCallInviteFragment.finish();
            }
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        uhu uhuVar = this.T;
        if (uhuVar == null) {
            uhuVar = null;
        }
        uhuVar.Z0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.getDecorView().setBackground(null);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setStatusBarColor(dhr0.t.c(R.attr.vk_ui_header_background));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        w89 w89Var = new w89();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("vkJoinLink") : null;
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle arguments2 = getArguments();
        VoipCallSource voipCallSource = arguments2 != null ? (VoipCallSource) arguments2.getParcelable("callSource") : null;
        Bundle arguments3 = getArguments();
        this.T = new uhu(context, w89Var, string, voipCallSource, arguments3 != null ? arguments3.getString("name") : null, o25.a(), a201.b().a(), new b(this), new xhu());
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            arguments4.getBoolean("should_auth_if_needed");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dhr0.a.getClass();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(dhr0.E());
        uhu uhuVar = this.T;
        if (uhuVar == null) {
            uhuVar = null;
        }
        return uhuVar.E0(cloneInContext, viewGroup, null, bundle);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        uhu uhuVar = this.T;
        if (uhuVar == null) {
            uhuVar = null;
        }
        uhuVar.H0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        uhu uhuVar = this.T;
        if (uhuVar == null) {
            uhuVar = null;
        }
        uhuVar.P0(bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        FragmentManager supportFragmentManager;
        Integer d;
        super.onViewCreated(view, bundle);
        uhu uhuVar = this.T;
        if (uhuVar == null) {
            uhuVar = null;
        }
        uhuVar.a1();
        Bundle arguments = getArguments();
        if (arguments != null && (d = bo8.d(arguments, "closeType")) != null) {
            this.U = d.intValue();
        }
        uhu uhuVar2 = this.T;
        if (uhuVar2 == null) {
            uhuVar2 = null;
        }
        uhuVar2.getClass();
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            while (true) {
                z = mo2getContext instanceof FragmentActivity;
                if (z || !(mo2getContext instanceof ContextWrapper)) {
                    break;
                } else {
                    mo2getContext = ((ContextWrapper) mo2getContext).getBaseContext();
                }
            }
            FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) mo2getContext : null);
            if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.l0("request_key_change_name", this, this.S);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        uhu uhuVar = this.T;
        if (uhuVar == null) {
            uhuVar = null;
        }
        uhuVar.O0(bundle);
    }
}
