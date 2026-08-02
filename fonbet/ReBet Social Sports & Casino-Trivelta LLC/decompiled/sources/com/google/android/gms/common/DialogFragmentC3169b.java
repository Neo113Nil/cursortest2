package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3191o;

/* renamed from: com.google.android.gms.common.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class DialogFragmentC3169b extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f32604a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f32605b;

    /* renamed from: c, reason: collision with root package name */
    public Dialog f32606c;

    public static DialogFragmentC3169b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC3169b dialogFragmentC3169b = new DialogFragmentC3169b();
        Dialog dialog2 = (Dialog) AbstractC3191o.n(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC3169b.f32604a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC3169b.f32605b = onCancelListener;
        }
        return dialogFragmentC3169b;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f32605b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f32604a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f32606c == null) {
            this.f32606c = new AlertDialog.Builder((Context) AbstractC3191o.m(getActivity())).create();
        }
        return this.f32606c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
