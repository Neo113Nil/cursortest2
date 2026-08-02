package com.google.android.gms.internal.measurement;

import defpackage.fhh;
import defpackage.z1a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g extends zzwl {
    public static final zzwl e;

    static {
        zzwl b = new g(null, new fhh(0)).b();
        e = b;
        g gVar = new g(b, new fhh(0));
        boolean z = !gVar.c;
        Boolean bool = Boolean.TRUE;
        z1a.D("Can't mutate after handing to trace", z);
        zzwj zzwjVar = zzwl.d;
        z1a.D("Key already present", !gVar.c(zzwjVar));
        gVar.b.put(zzwjVar, bool);
        gVar.b();
    }
}
