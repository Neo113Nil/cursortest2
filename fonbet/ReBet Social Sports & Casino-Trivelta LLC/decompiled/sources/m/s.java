package m;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;

/* loaded from: classes.dex */
public class s extends DialogInterfaceOnCancelListenerC2163m {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle bundle) {
        return new r(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public void setupDialog(Dialog dialog, int i10) {
        if (!(dialog instanceof r)) {
            super.setupDialog(dialog, i10);
            return;
        }
        r rVar = (r) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        rVar.h(1);
    }
}
