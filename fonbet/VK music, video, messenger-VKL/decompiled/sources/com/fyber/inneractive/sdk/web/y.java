package com.fyber.inneractive.sdk.web;

import android.content.DialogInterface;
import android.os.Environment;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.File;

/* loaded from: classes12.dex */
public final class y implements DialogInterface.OnClickListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ i0 b;

    public y(i0 i0Var, String str) {
        this.b = i0Var;
        this.a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        i0 i0Var = this.b;
        String str = this.a;
        i0Var.getClass();
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        com.fyber.inneractive.sdk.flow.x xVar = i0Var.s;
        IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.b1(new x(i0Var), str, xVar != null ? xVar.c : null));
    }
}
