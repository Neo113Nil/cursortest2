package com.google.android.gms.internal.cast;

import com.google.android.gms.common.util.DefaultClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzae {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final int e;

    public zzae(zzad zzadVar) {
        this.e = zzadVar.a;
        DefaultClock.a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.a = currentTimeMillis;
        this.b = currentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}
