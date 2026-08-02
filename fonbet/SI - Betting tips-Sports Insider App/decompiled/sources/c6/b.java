package c6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import g6.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class b extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f3653a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f3654b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f3655c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3654b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f3653a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f3655c == null) {
            Activity activity = getActivity();
            v.h(activity);
            this.f3655c = new AlertDialog.Builder(activity).create();
        }
        return this.f3655c;
    }
}
