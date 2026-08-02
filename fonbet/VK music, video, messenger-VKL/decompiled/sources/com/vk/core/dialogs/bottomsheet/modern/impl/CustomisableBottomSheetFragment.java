package com.vk.core.dialogs.bottomsheet.modern.impl;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.core.fragments.FragmentImpl;
import com.vk.log.L;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.gw20;
import xsna.izs;
import xsna.jcg;
import xsna.lpj;
import xsna.ppk;
import xsna.qpk;
import xsna.s3q0;
import xsna.wd2;
import xsna.z1h0;

/* compiled from: CustomisableBottomSheetFragment.kt */
/* loaded from: classes17.dex */
public abstract class CustomisableBottomSheetFragment<T extends gw20> extends FragmentImpl implements qpk, DialogInterface.OnShowListener, DialogInterface.OnKeyListener {
    public static final /* synthetic */ int S = 0;
    public DialogInterface.OnShowListener N;
    public DialogInterface.OnDismissListener O;
    public CustomisableBottomSheetBehavior<FrameLayout> P;
    public final Handler Q = new Handler(Looper.getMainLooper());
    public final bpn0 R = new bpn0(new jcg(this, 9));

    /* compiled from: CustomisableBottomSheetFragment.kt */
    public static final class a extends CustomisableBottomSheetBehavior.b {
        public final gw20 a;
        public final ppk b;

        public a(gw20 gw20Var, ppk ppkVar) {
            this.a = gw20Var;
            this.b = ppkVar;
        }

        @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public final void a(View view, float f) {
            qpk.a w = this.a.w();
            if (w != null) {
                w.C(f);
            }
        }

        @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public final void b(int i, View view) {
            qpk.a w = this.a.w();
            if (w != null) {
                w.r(i);
            }
            if (i == 5) {
                this.b.cancel();
            }
        }
    }

    /* compiled from: CustomisableBottomSheetFragment.kt */
    public static final class b {
        public static qpk a(AppCompatActivity appCompatActivity, CustomisableBottomSheetFragment customisableBottomSheetFragment, String str) {
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            z1h0 H = supportFragmentManager.H(str == null ? "CustomisableBottomSheetFragment" : str);
            qpk qpkVar = H instanceof qpk ? (qpk) H : null;
            if (qpkVar != null) {
                return qpkVar;
            }
            if (str == null) {
                str = "CustomisableBottomSheetFragment";
            }
            try {
                customisableBottomSheetFragment.Td(supportFragmentManager, str);
                return customisableBottomSheetFragment;
            } catch (IllegalStateException e) {
                L.i(e);
                return customisableBottomSheetFragment;
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final int Pn() {
        Integer i = fo().i();
        if (i != null) {
            return i.intValue();
        }
        return 16;
    }

    public abstract T eo();

    public final T fo() {
        return (T) this.R.getValue();
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener e = fo().e();
        if (e != null) {
            e.onCancel(dialogInterface);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        izs<Configuration, s3q0> d = fo().d();
        if (d != null) {
            d.invoke(configuration);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return fo().x(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        fo().onDestroy();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.O;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        DialogInterface.OnDismissListener q = fo().q();
        if (q != null) {
            q.onDismiss(dialogInterface);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 0) {
            return false;
        }
        DialogInterface.OnKeyListener g = fo().g();
        if (g != null && g.onKey(dialogInterface, i, keyEvent)) {
            return true;
        }
        if (i != 4) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (fo().k()) {
            tn();
        } else {
            fo().onPause();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        fo().onResume();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        ppk ppkVar = dialogInterface instanceof ppk ? (ppk) dialogInterface : null;
        if (ppkVar == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) ppkVar.findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(android.R.color.transparent);
        }
        CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = ppkVar.h;
        if (!ppkVar.i) {
            customisableBottomSheetBehavior.I(Integer.MAX_VALUE);
            customisableBottomSheetBehavior.h = false;
        }
        DialogInterface.OnShowListener f = fo().f();
        if (f != null) {
            f.onShow(dialogInterface);
        }
        DialogInterface.OnShowListener onShowListener = this.N;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        int s = fo().s();
        Context requireContext = s == 0 ? requireContext() : new lpj(mo2getContext(), s);
        CustomisableBottomSheetBehavior<FrameLayout> behavior = fo().getBehavior();
        if (behavior == null) {
            behavior = new CustomisableBottomSheetBehavior<>(requireContext);
        }
        this.P = behavior;
        ppk ppkVar = new ppk(requireContext, s, this.P);
        ppkVar.setCancelable(fo().a());
        ppkVar.setOnShowListener(this);
        ppkVar.setOnKeyListener(this);
        CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = this.P;
        if (customisableBottomSheetBehavior != null) {
            customisableBottomSheetBehavior.r = new a(fo(), ppkVar);
        }
        if (bundle != null) {
            this.Q.postDelayed(new wd2(this, 2), 100L);
        }
        return ppkVar;
    }
}
