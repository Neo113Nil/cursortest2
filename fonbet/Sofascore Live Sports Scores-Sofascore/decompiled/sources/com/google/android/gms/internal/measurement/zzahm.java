package com.google.android.gms.internal.measurement;

import defpackage.lzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahm implements zzahl {
    public static final lzo a;
    public static final lzo b;

    static {
        zzog zzogVar = zzagr.c;
        a = zzogVar.a("measurement.service.store_null_safelist", true);
        b = zzogVar.a("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzahl
    public final boolean zzb() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzahl
    public final boolean zzc() {
        return ((Boolean) b.get()).booleanValue();
    }
}
