package com.vk.voip.ui.call_effects.presentation;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import com.vk.core.fragments.FragmentImpl;
import com.vk.masks.MasksView;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.c;
import com.vk.voip.ui.call_effects.presentation.VoipSelectEffectInCallFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.disposables.b;
import xsna.a1w0;
import xsna.awt0;
import xsna.cb0;
import xsna.dbg0;
import xsna.dhw0;
import xsna.g2h0;
import xsna.h5x0;
import xsna.hb0;
import xsna.hfv0;
import xsna.i3x0;
import xsna.i5x0;
import xsna.iah0;
import xsna.jan0;
import xsna.n4u0;
import xsna.qnw0;
import xsna.qrw0;
import xsna.rnw0;
import xsna.rrw0;
import xsna.ua0;
import xsna.v4r0;
import xsna.vpn0;
import xsna.x0w0;
import xsna.xgw0;
import xsna.xvr0;
import xsna.y0w0;

/* compiled from: VoipSelectEffectInCallFragment.kt */
/* loaded from: classes7.dex */
public final class VoipSelectEffectInCallFragment extends FragmentImpl {
    public static final /* synthetic */ int Q = 0;
    public qnw0 N;
    public final b O = new b();
    public final hb0<Intent> P = registerForActivityResult(new cb0(), new ua0() { // from class: xsna.ezw0
        @Override // xsna.ua0
        public final void onActivityResult(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            qnw0 qnw0Var = VoipSelectEffectInCallFragment.this.N;
            z4x0 z4x0Var = qnw0Var instanceof z4x0 ? (z4x0) qnw0Var : null;
            if (z4x0Var != null) {
                z4x0Var.a(activityResult.c);
            }
        }
    });

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        qnw0 qnw0Var = this.N;
        if (qnw0Var == null) {
            return true;
        }
        qnw0Var.b();
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.O.b(c.I0(c.b).a0(a.b()).subscribe(new v4r0(new hfv0(this, 7), 6), new xvr0(new g2h0(16), 9)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0164  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean a;
        Context requireContext = requireContext();
        rnw0 rnw0Var = null;
        xgw0 xgw0Var = new xgw0(requireContext, null, 0);
        LayoutInflater.from(requireContext).inflate(R.layout.voip_call_view_virtual_background, (ViewGroup) xgw0Var, true);
        xgw0Var.setClickable(true);
        xgw0Var.setFocusable(true);
        Resources resources = xgw0Var.getResources();
        Resources.Theme theme = requireContext.getTheme();
        ThreadLocal<TypedValue> threadLocal = dbg0.a;
        xgw0Var.setBackgroundColor(resources.getColor(R.color.vk_gray_700, theme));
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("ARG_EFFECT_TYPE")) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            c cVar = c.b;
            dhw0 L = cVar.L();
            if ((L != null ? L.A : null) != null) {
                a = false;
            } else {
                cVar.getClass();
                a = c.R().getConfiguration().a();
            }
            if (a) {
                cVar.getClass();
                i3x0 R = c.R();
                i3x0.d.a.getClass();
                int i = i3x0.d.a.b;
                ViewGroup viewGroup2 = (ViewGroup) xgw0Var.findViewById(R.id.virtual_background_wrap_masks_cont);
                y0w0 b = R.b();
                Context context = xgw0Var.getContext();
                b.getClass();
                MasksView masksView = new MasksView(context);
                masksView.setId(i);
                awt0.v(masksView, true);
                masksView.setLayoutParams(new FrameLayout.LayoutParams(-1, iah0.a(260)));
                viewGroup2.addView(masksView);
                a1w0 h = c.R().h();
                rrw0 rrw0Var = new rrw0(cVar, new vpn0(this, 20));
                h.getClass();
                rnw0 qrw0Var = new qrw0(requireContext, xgw0Var, rrw0Var, h.a);
                qrw0Var.g();
                rnw0Var = qrw0Var;
                this.N = rnw0Var;
                if (rnw0Var == null) {
                    tn();
                }
                return xgw0Var;
            }
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            c cVar2 = c.b;
            cVar2.getClass();
            if (((com.vk.voip.call_effects.a) c.Q()).i() == CallEffectsDependency.TensorflowMode.GPU) {
                cVar2.getClass();
                i3x0 R2 = c.R();
                i3x0.d.a.getClass();
                int i2 = i3x0.d.a.c;
                ViewGroup viewGroup3 = (ViewGroup) xgw0Var.findViewById(R.id.virtual_background_wrap_masks_cont);
                y0w0 b2 = R2.b();
                Context context2 = xgw0Var.getContext();
                b2.getClass();
                MasksView masksView2 = new MasksView(context2);
                masksView2.setId(i2);
                awt0.v(masksView2, true);
                masksView2.setLayoutParams(new FrameLayout.LayoutParams(-1, iah0.a(260)));
                viewGroup3.addView(masksView2);
                x0w0 background = c.R().getBackground();
                i5x0 i5x0Var = new i5x0(cVar2, new jan0(this, 15), new vpn0(this, 20));
                background.getClass();
                rnw0 h5x0Var = new h5x0(requireContext, background.a, xgw0Var, i5x0Var, (n4u0) background.b.a.getValue(), background.c);
                h5x0Var.g();
                rnw0Var = h5x0Var;
            }
        }
        this.N = rnw0Var;
        if (rnw0Var == null) {
        }
        return xgw0Var;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.O.dispose();
        qnw0 qnw0Var = this.N;
        if (qnw0Var != null) {
            qnw0Var.clear();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.FullScreenDialogDialog;
    }
}
