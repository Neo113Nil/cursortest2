package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.sofascore.results.R;
import defpackage.e02;
import defpackage.g02;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public void j() {
        Dialog dialog = this.l;
        if (dialog instanceof g02) {
            g02 g02Var = (g02) dialog;
            if (g02Var.g == null) {
                g02Var.f();
            }
            boolean z = g02Var.g.J;
        }
        k(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        Context context = getContext();
        int i = this.f;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        g02 g02Var = new g02(context, i);
        g02Var.k = true;
        g02Var.l = true;
        g02Var.q = new e02(g02Var);
        g02Var.d().i(1);
        TypedArray obtainStyledAttributes = g02Var.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        g02Var.o = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return g02Var;
    }

    public final void q() {
        Dialog dialog = this.l;
        if (dialog instanceof g02) {
            g02 g02Var = (g02) dialog;
            if (g02Var.g == null) {
                g02Var.f();
            }
            boolean z = g02Var.g.J;
        }
        k(true, false);
    }
}
