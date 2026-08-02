package com.vk.voip.ui.call_effects.beauty.ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.c;
import com.vk.voip.ui.utils.StaticBottomSheetFragment;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.subjects.d;
import xsna.asu0;
import xsna.b00;
import xsna.cw;
import xsna.cw6;
import xsna.dw6;
import xsna.ew;
import xsna.ew6;
import xsna.fw6;
import xsna.gw6;
import xsna.k00;
import xsna.k9;
import xsna.w5;

/* compiled from: BeautySettingsFragment.kt */
/* loaded from: classes7.dex */
public class BeautySettingsFragment extends StaticBottomSheetFragment {
    public static final /* synthetic */ int Q = 0;
    public final b P = new b();

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment
    public final View eo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        gw6 gw6Var = new gw6(requireContext(), viewGroup);
        c.b.getClass();
        fw6 fw6Var = c.W;
        cw6 cw6Var = fw6Var != null ? fw6Var.g : null;
        if (cw6Var == null) {
            tn();
        } else {
            d<dw6> dVar = cw6Var.e;
            asu0 asu0Var = asu0.a;
            io.reactivex.rxjava3.disposables.c subscribe = dVar.a0(asu0Var.d()).subscribe(new b00(new k9(gw6Var, 11), 3));
            b bVar = this.P;
            bVar.b(subscribe);
            bVar.b((cw6Var.g ? q.T(ew6.a.a) : cw6Var.d).a0(asu0Var.d()).subscribe(new cw(new w5(this, 8), 6)));
            bVar.b(gw6Var.a.subscribe(new ew(new k00(cw6Var, 6), 3)));
        }
        return gw6Var.d;
    }

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            tn();
            c.b.getClass();
            fw6 fw6Var = c.W;
            if (fw6Var != null) {
                fw6Var.a();
            }
        }
    }

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        Dialog dialog = this.s;
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = this.s;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setDimAmount(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.P.e();
        c.b.getClass();
        fw6 fw6Var = c.W;
        if (fw6Var != null) {
            fw6Var.a();
        }
    }
}
