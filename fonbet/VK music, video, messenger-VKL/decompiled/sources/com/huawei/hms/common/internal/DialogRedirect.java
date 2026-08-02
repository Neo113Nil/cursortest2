package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

/* loaded from: classes13.dex */
public abstract class DialogRedirect implements DialogInterface.OnClickListener {
    public static DialogRedirect getInstance(Activity activity, Intent intent, int i) {
        return new DialogRedirectImpl(intent, activity, i);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            redirect();
            if (dialogInterface == null) {
                return;
            }
        } catch (Throwable unused) {
            if (dialogInterface == null) {
                return;
            }
        }
        dialogInterface.dismiss();
    }

    public abstract void redirect();
}
