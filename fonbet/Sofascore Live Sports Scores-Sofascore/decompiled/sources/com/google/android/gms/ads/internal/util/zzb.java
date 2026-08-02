package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcgj;
import defpackage.ddb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzb {
    public final Runnable a = new zza(this);

    public abstract void zza();

    public ddb zzb() {
        return zzcgj.a.submit(this.a);
    }
}
