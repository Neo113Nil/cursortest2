package com.google.android.gms.internal.measurement;

import defpackage.ecp;
import defpackage.j40;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j extends zzyq {
    public static final ecp d = new ecp(3);
    public static final j40 e = new j40(26);
    public final AtomicInteger c = new AtomicInteger();

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void a() {
        this.c.decrementAndGet();
    }
}
