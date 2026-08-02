package com.moloco.sdk.service_locator;

import com.moloco.sdk.internal.services.o;
import defpackage.mqi;
import defpackage.ypa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class l {
    public static final mqi a = ypa.b(new h(6));
    public static final mqi b = ypa.b(new h(7));
    public static final mqi c = ypa.b(new h(8));

    public static com.moloco.sdk.internal.services.events.c a() {
        return new com.moloco.sdk.internal.services.events.c(e.a(), (com.moloco.sdk.internal.services.c) j.b.getValue(), e.b(), (com.moloco.sdk.internal.services.g) e.d.getValue(), (com.moloco.sdk.internal.services.usertracker.c) b.getValue(), (o) i.c.getValue(), (com.moloco.sdk.internal.services.proto.a) i.b.getValue(), (com.moloco.sdk.internal.services.events.e) c.getValue());
    }
}
