package com.fyber.inneractive.sdk.web;

import android.widget.Toast;

/* loaded from: classes12.dex */
public final class v implements Runnable {
    public final /* synthetic */ String a;

    public v(String str) {
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(com.fyber.inneractive.sdk.util.o.a, this.a, 0).show();
    }
}
