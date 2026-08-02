package com.sofascore.results.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bsk;
import defpackage.i01;
import defpackage.krk;
import defpackage.nv;
import defpackage.px0;
import defpackage.srk;
import defpackage.su;
import defpackage.wb0;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/dialog/BaseFullScreenDialog;", "Lkrk;", "T", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseFullScreenDialog<T extends krk> extends DialogFragment {
    public long q;
    public krk s;
    public final su r = new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null);
    public final boolean t = true;
    public final px0 u = new px0(2, this, false);

    @Override // androidx.fragment.app.DialogFragment
    public Dialog l(Bundle bundle) {
        wb0 wb0Var = new wb0(requireContext(), this.f);
        Window window = wb0Var.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.FullScreenDialogAnimation);
        }
        wb0Var.getOnBackPressedDispatcher().a(wb0Var, this.u);
        return wb0Var;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n(1, R.style.RedesignFullScreenDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        krk s = s(layoutInflater, viewGroup, bundle);
        this.s = s;
        View root = s.getRoot();
        if (getT()) {
            root.setFitsSystemWindows(true);
            i01 i01Var = new i01(1, root);
            WeakHashMap weakHashMap = bsk.a;
            srk.c(root, i01Var);
        }
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        nv.U((BaseActivity) requireActivity, q(), System.currentTimeMillis() - this.q, this.r);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.q = System.currentTimeMillis();
        FragmentActivity requireActivity = requireActivity();
        BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
        if (baseActivity != null) {
            baseActivity.C = q();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        view.setContentDescription(q());
        view.setImportantForAccessibility(2);
    }

    public abstract String q();

    /* renamed from: r, reason: from getter */
    public boolean getT() {
        return this.t;
    }

    public abstract krk s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public final void t(float f) {
        Window window;
        View decorView;
        Dialog dialog = this.l;
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.animate().translationY(decorView.getMeasuredHeight() * f * 0.1f).setDuration(0L).start();
    }
}
