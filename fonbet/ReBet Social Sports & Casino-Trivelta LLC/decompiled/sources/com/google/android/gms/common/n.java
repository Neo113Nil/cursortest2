package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public class n extends DialogInterfaceOnCancelListenerC2163m {

    /* renamed from: m, reason: collision with root package name */
    public Dialog f32781m;

    /* renamed from: n, reason: collision with root package name */
    public DialogInterface.OnCancelListener f32782n;

    /* renamed from: o, reason: collision with root package name */
    public Dialog f32783o;

    public static n f0(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        n nVar = new n();
        Dialog dialog2 = (Dialog) AbstractC3191o.n(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        nVar.f32781m = dialog2;
        if (onCancelListener != null) {
            nVar.f32782n = onCancelListener;
        }
        return nVar;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f32782n;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f32781m;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f32783o == null) {
            this.f32783o = new AlertDialog.Builder((Context) AbstractC3191o.m(getContext())).create();
        }
        return this.f32783o;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
