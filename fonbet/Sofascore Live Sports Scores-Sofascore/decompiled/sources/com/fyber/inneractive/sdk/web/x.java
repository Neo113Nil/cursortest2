package com.fyber.inneractive.sdk.web;

import android.media.MediaScannerConnection;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x implements com.fyber.inneractive.sdk.network.f0 {
    public final /* synthetic */ i0 a;

    public x(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (exc != null || TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.util.r.b.post(new w(this));
            return;
        }
        i0 i0Var = this.a;
        if (com.fyber.inneractive.sdk.util.o.a(i0Var.b) != null) {
            a0 a0Var = new a0(str);
            MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(com.fyber.inneractive.sdk.util.o.a(i0Var.b).getApplicationContext(), a0Var);
            a0Var.b = mediaScannerConnection;
            mediaScannerConnection.connect();
        }
    }
}
