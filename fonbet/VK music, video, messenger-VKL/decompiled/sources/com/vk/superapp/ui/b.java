package com.vk.superapp.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.c;
import com.vk.superapp.ui.VkRoundedTopDelegate;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.HashSet;
import xsna.fnj;
import xsna.iah0;
import xsna.prw;
import xsna.q0o0;
import xsna.rl3;
import xsna.tk5;
import xsna.vk9;

/* compiled from: VkBottomSheetContainerDialogFragment.kt */
/* loaded from: classes6.dex */
public abstract class b extends c {
    public abstract Fragment Fn();

    public final void Gn() {
        int a = iah0.a(480);
        if (iah0.f().widthPixels < a) {
            a = iah0.f().widthPixels;
        }
        Window window = zn().getWindow();
        if (window == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        window.setLayout(a, -1);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Gn();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bn(0, R.style.VkBottomSheetTheme);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vk_fragment_bottom_sheet_container, viewGroup, false);
        VkRoundedTopFrameLayout vkRoundedTopFrameLayout = (VkRoundedTopFrameLayout) inflate.findViewById(R.id.rounded_container);
        Context mo2getContext = mo2getContext();
        HashSet hashSet = iah0.a;
        if (fnj.b(mo2getContext)) {
            vkRoundedTopFrameLayout.setSides(rl3.y0(new VkRoundedTopDelegate.CornerSide[]{VkRoundedTopDelegate.CornerSide.BOTTOM, VkRoundedTopDelegate.CornerSide.TOP}));
            int a = iah0.a(600);
            if (iah0.f().heightPixels > a) {
                ViewGroup.LayoutParams layoutParams = vkRoundedTopFrameLayout.getLayoutParams();
                layoutParams.height = a;
                vkRoundedTopFrameLayout.setLayoutParams(layoutParams);
            }
            inflate.setPadding(inflate.getPaddingLeft(), inflate.getPaddingTop(), inflate.getPaddingRight(), iah0.a(24));
        } else {
            vkRoundedTopFrameLayout.setSides(Collections.singleton(VkRoundedTopDelegate.CornerSide.TOP));
            ViewGroup.LayoutParams layoutParams2 = vkRoundedTopFrameLayout.getLayoutParams();
            layoutParams2.height = -1;
            vkRoundedTopFrameLayout.setLayoutParams(layoutParams2);
        }
        if (bundle == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            androidx.fragment.app.a b = tk5.b(childFragmentManager, childFragmentManager);
            b.f(R.id.rounded_container, Fn(), null, 1);
            b.k(false);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.setOnShowListener(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Gn();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.bottomsheet.c, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View decorView;
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        prw.h(this, q0o0Var != null ? q0o0Var.tag() : "VkSdkDialogFragment", null);
        Dialog yn = super.yn(bundle);
        if (bundle != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new vk9(this, 14), 100L);
            return yn;
        }
        Window window = yn.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setClipToOutline(false);
        }
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.hfu0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View findViewById;
                Context mo2getContext = com.vk.superapp.ui.b.this.mo2getContext();
                if (mo2getContext == null) {
                    return;
                }
                HashSet hashSet = iah0.a;
                boolean b = fnj.b(mo2getContext);
                com.google.android.material.bottomsheet.b bVar = dialogInterface instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialogInterface : null;
                if (bVar == null || (findViewById = bVar.findViewById(R.id.design_bottom_sheet)) == null) {
                    return;
                }
                if (b) {
                    findViewById.setBackground(new ColorDrawable(0));
                }
                BottomSheetBehavior.L(findViewById).W(b ? iah0.f().heightPixels : an10.b(iah0.u() * 0.7f), false);
            }
        });
        return yn;
    }
}
