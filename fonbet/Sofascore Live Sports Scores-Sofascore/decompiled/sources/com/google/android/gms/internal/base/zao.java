package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zao extends Handler {
    public zao() {
        Looper.getMainLooper();
    }

    public zao(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public zao(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
