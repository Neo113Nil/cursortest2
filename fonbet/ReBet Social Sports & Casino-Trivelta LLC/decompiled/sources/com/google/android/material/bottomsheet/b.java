package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import m.s;

/* loaded from: classes3.dex */
public class b extends s {

    /* renamed from: m, reason: collision with root package name */
    public boolean f35020m;

    /* renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    public class C0496b extends BottomSheetBehavior.g {
        public C0496b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            if (i10 == 5) {
                b.this.g0();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public void dismiss() {
        if (j0(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public void dismissAllowingStateLoss() {
        if (j0(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    public final void g0() {
        if (this.f35020m) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    public final void h0(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f35020m = z10;
        if (bottomSheetBehavior.x0() == 5) {
            g0();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) getDialog()).q();
        }
        bottomSheetBehavior.c0(new C0496b());
        bottomSheetBehavior.c1(5);
    }

    public final boolean j0(boolean z10) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialog;
        BottomSheetBehavior n10 = aVar.n();
        if (!n10.D0() || !aVar.o()) {
            return false;
        }
        h0(n10, z10);
        return true;
    }

    @Override // m.s, androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(getContext(), getTheme());
    }
}
