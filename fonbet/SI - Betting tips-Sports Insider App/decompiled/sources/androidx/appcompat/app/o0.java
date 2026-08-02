package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class o0 extends androidx.fragment.app.y {
    @Override // androidx.fragment.app.y
    public Dialog onCreateDialog(Bundle bundle) {
        return new n0(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.y
    public void setupDialog(@NonNull Dialog dialog, int i5) {
        if (!(dialog instanceof n0)) {
            super.setupDialog(dialog, i5);
            return;
        }
        n0 n0Var = (n0) dialog;
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        n0Var.supportRequestWindowFeature(1);
    }
}
