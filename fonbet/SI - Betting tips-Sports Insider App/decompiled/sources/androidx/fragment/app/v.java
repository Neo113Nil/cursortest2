package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f2097a;

    public v(y yVar) {
        this.f2097a = yVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        y yVar = this.f2097a;
        dialog = yVar.mDialog;
        if (dialog != null) {
            dialog2 = yVar.mDialog;
            yVar.onDismiss(dialog2);
        }
    }
}
