package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public interface LifecycleFragment {
    void a(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback c(Class cls, String str);

    Activity g();

    void startActivityForResult(Intent intent, int i);
}
