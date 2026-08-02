package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import xsna.c33;

/* compiled from: BottomSheetDialogFragment.java */
/* loaded from: classes13.dex */
public class c extends c33 {
    public boolean x;

    public final void Dn() {
        if (this.x) {
            super.tn();
        } else {
            un(false, false);
        }
    }

    public final boolean En(boolean z) {
        Dialog dialog = this.s;
        if (!(dialog instanceof b)) {
            return false;
        }
        b bVar = (b) dialog;
        BottomSheetBehavior<FrameLayout> o = bVar.o();
        if (!o.J || !bVar.l) {
            return false;
        }
        this.x = z;
        if (o.M == 5) {
            Dn();
            return true;
        }
        Dialog dialog2 = this.s;
        if (dialog2 instanceof b) {
            b bVar2 = (b) dialog2;
            bVar2.h.Q(bVar2.s);
        }
        o.D(new a());
        o.X(5);
        return true;
    }

    @Override // androidx.fragment.app.d
    public final void dismiss() {
        if (En(false)) {
            return;
        }
        un(false, false);
    }

    @Override // androidx.fragment.app.d
    public final void tn() {
        if (En(true)) {
            return;
        }
        super.tn();
    }

    @Override // xsna.c33, androidx.fragment.app.d
    @NonNull
    public Dialog yn(@Nullable Bundle bundle) {
        return new b(mo2getContext(), vn());
    }

    /* compiled from: BottomSheetDialogFragment.java */
    public class a extends BottomSheetBehavior.d {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, @NonNull View view) {
            if (i == 5) {
                c.this.Dn();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(@NonNull View view, float f) {
        }
    }
}
