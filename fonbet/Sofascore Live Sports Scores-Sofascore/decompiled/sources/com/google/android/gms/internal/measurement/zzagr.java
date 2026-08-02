package com.google.android.gms.internal.measurement;

import defpackage.ggf;
import defpackage.i0p;
import defpackage.xen;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzagr {
    public static final defpackage.zzo a;
    public static volatile String b;
    public static final zzog c;

    static {
        i0p i0pVar = new i0p(xen.b, true, new zzpj().a);
        ggf ggfVar = new ggf();
        ggfVar.b = i0pVar;
        c = new zzog(ggfVar);
        a = new defpackage.zzo("__phenotype_server_token", ggfVar, "");
        b = null;
    }

    private zzagr() {
    }

    public static String a() {
        return (String) a.get();
    }
}
