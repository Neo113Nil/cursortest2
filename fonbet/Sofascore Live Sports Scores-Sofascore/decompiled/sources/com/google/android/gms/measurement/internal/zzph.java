package com.google.android.gms.measurement.internal;

import android.app.Service;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzph {
    public final Context a;

    public zzph(Service service) {
        Context applicationContext = service.getApplicationContext();
        Preconditions.i(applicationContext);
        this.a = applicationContext;
    }
}
