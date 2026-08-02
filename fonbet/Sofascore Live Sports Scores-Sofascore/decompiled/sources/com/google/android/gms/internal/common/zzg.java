package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzg extends Handler {
    public zzg() {
        Looper.getMainLooper();
    }

    public zzg(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
