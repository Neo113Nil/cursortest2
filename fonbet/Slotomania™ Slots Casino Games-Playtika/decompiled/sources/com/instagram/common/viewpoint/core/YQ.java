package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;

/* loaded from: assets/audience_network/classes2.dex */
public class YQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1018Pp A00;

    public YQ(C1018Pp c1018Pp) {
        this.A00 = c1018Pp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
