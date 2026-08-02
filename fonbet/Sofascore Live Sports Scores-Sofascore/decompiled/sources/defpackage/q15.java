package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q15 extends bo8 {
    public final /* synthetic */ bo8 a;
    public final /* synthetic */ DialogFragment b;

    public q15(DialogFragment dialogFragment, bo8 bo8Var) {
        this.b = dialogFragment;
        this.a = bo8Var;
    }

    @Override // defpackage.bo8
    public final View b(int i) {
        bo8 bo8Var = this.a;
        if (bo8Var.c()) {
            return bo8Var.b(i);
        }
        Dialog dialog = this.b.l;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.bo8
    public final boolean c() {
        return this.a.c() || this.b.p;
    }
}
