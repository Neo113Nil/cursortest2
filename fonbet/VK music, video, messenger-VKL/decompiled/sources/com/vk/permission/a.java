package com.vk.permission;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.vk.permission.b;
import xsna.g4g;
import xsna.mht;
import xsna.oht;
import xsna.ozl;
import xsna.q90;

/* compiled from: GdprRationaleDialogFragment.kt */
/* loaded from: classes4.dex */
public final class a extends DialogFragment implements mht {
    public static final /* synthetic */ int c = 0;
    public boolean b;

    @Override // android.app.DialogFragment
    @ozl
    public final Dialog onCreateDialog(Bundle bundle) {
        Context activity;
        setCancelable(false);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("No arguments.");
        }
        b a = b.a.a(arguments);
        Activity activity2 = getActivity();
        Integer num = a.f;
        q90 q90Var = new q90(activity2, num);
        if (num != null) {
            activity = new ContextThemeWrapper(getActivity(), num.intValue());
        } else {
            activity = getActivity();
        }
        oht ohtVar = new oht(q90Var, a, new g4g(this, 20));
        return new AlertDialog.Builder(activity).setCancelable(false).setMessage(a.a).setPositiveButton(a.b, ohtVar).setNegativeButton(a.c, ohtVar).create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    @ozl
    public final void onSaveInstanceState(Bundle bundle) {
        this.b = true;
        super.onSaveInstanceState(bundle);
    }
}
