package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog q;
    public DialogInterface.OnCancelListener r;
    public AlertDialog s;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        Dialog dialog = this.q;
        if (dialog != null) {
            return dialog;
        }
        this.h = false;
        AlertDialog alertDialog = this.s;
        if (alertDialog != null) {
            return alertDialog;
        }
        Context context = getContext();
        Preconditions.i(context);
        AlertDialog create = new AlertDialog.Builder(context).create();
        this.s = create;
        return create;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
