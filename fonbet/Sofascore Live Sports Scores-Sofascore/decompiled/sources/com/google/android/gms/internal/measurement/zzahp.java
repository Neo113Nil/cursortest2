package com.google.android.gms.internal.measurement;

import defpackage.lzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahp implements zzaho {
    public static final lzo a;
    public static final lzo b;
    public static final lzo c;

    static {
        zzog zzogVar = zzagr.c;
        a = zzogVar.a("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = zzogVar.a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = zzogVar.a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzb() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzc() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzd() {
        return ((Boolean) c.get()).booleanValue();
    }
}
