package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.nkn;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbik {
    public zzbfc a;
    public boolean b;
    public final ExecutorService c;

    public zzbik(Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.c = executorService;
        executorService.execute(new nkn(this, context, false, 2));
    }

    public zzbik() {
        this.c = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }
}
