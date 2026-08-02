package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import defpackage.wb0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog l(Bundle bundle) {
        return new wb0(getContext(), this.f);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void o(Dialog dialog, int i) {
        if (!(dialog instanceof wb0)) {
            super.o(dialog, i);
            return;
        }
        wb0 wb0Var = (wb0) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        wb0Var.d().i(1);
    }
}
