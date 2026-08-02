package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFj1nSDK {
    public String d;
    public final WeakReference<Context> registerClient;

    public AFj1nSDK(@NonNull Context context) {
        this.registerClient = new WeakReference<>(context);
    }
}
