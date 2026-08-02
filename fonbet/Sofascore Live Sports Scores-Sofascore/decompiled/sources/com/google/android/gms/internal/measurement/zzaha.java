package com.google.android.gms.internal.measurement;

import defpackage.lzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaha implements zzagz {
    public static final lzo a;
    public static final lzo b;

    static {
        zzog zzogVar = zzagr.c;
        a = zzogVar.a("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = zzogVar.a("measurement.set_default_event_parameters.fix_service_request_ordering", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzagz
    public final boolean zza() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagz
    public final boolean zzb() {
        return ((Boolean) b.get()).booleanValue();
    }
}
