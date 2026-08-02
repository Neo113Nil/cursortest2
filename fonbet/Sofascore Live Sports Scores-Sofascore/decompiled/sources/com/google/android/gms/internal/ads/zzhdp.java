package com.google.android.gms.internal.ads;

import defpackage.irb;
import defpackage.slo;
import defpackage.tlo;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhdp {
    public static Executor a(Executor executor, tlo tloVar) {
        executor.getClass();
        return executor == slo.a ? executor : new irb(executor, tloVar, 3);
    }
}
