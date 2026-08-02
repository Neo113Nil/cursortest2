package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f2092a;

    public u(y yVar) {
        this.f2092a = yVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        y yVar = this.f2092a;
        dialog = yVar.mDialog;
        if (dialog != null) {
            dialog2 = yVar.mDialog;
            yVar.onCancel(dialog2);
        }
    }
}
