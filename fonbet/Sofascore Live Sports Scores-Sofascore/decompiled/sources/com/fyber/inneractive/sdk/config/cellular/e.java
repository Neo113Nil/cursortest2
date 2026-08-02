package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class e {
    public static d a(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? new c(context) : new g(context);
    }
}
