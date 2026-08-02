package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhnp {
    public static final zzhnp b = new zzhnp();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final void a(zzhno zzhnoVar, Class cls) {
        zzhno zzhnoVar2 = (zzhno) this.a.putIfAbsent(cls, zzhnoVar);
        if (zzhnoVar2 == null || zzhnoVar2.equals(zzhnoVar)) {
            return;
        }
        defpackage.zzl.x("Different key creator for parameters class already inserted");
    }
}
