package c6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.y;
import g6.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class i extends y {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f3669a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f3670b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f3671c;

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3670b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.y
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f3669a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f3671c == null) {
            Context context = getContext();
            v.h(context);
            this.f3671c = new AlertDialog.Builder(context).create();
        }
        return this.f3671c;
    }
}
