package com.fyber.inneractive.sdk.web;

import android.widget.Toast;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
