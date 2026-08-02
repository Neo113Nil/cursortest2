package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdck {
    public final AtomicLong a;

    public zzdck(zzflo zzfloVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        atomicLong.set(zzfloVar.a.a.u.get());
    }

    public final void a(long j) {
        this.a.set(j);
    }
}
