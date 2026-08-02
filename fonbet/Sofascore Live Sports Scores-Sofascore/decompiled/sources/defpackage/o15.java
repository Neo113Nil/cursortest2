package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o15 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment a;

    public o15(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.a;
        Dialog dialog = dialogFragment.l;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
