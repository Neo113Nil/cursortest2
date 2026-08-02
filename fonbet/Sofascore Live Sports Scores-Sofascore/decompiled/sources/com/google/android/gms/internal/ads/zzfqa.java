package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.t9o;
import defpackage.xlo;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzfqa {
    public static final xlo d = xlo.b;
    public final zzhdi a;
    public final ScheduledExecutorService b;
    public final t9o c;

    public zzfqa(zzhdi zzhdiVar, ScheduledExecutorService scheduledExecutorService, t9o t9oVar) {
        this.a = zzhdiVar;
        this.b = scheduledExecutorService;
        this.c = t9oVar;
    }

    public final zzfpz a(ddb ddbVar, Object obj) {
        return new zzfpz(this, obj, null, ddbVar, Collections.singletonList(ddbVar), ddbVar);
    }

    public abstract String b(Object obj);
}
