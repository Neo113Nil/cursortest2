package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaih implements zzaig {
    public static final zzpo a = new zzpo(zzagr.c, 11);

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzb() {
        return ((Boolean) a.a(1, "measurement.rb.attribution.client2", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzc() {
        return ((Boolean) a.a(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzd() {
        return ((Boolean) a.a(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zze() {
        return ((Boolean) a.a(6, "measurement.rb.attribution.service", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzf() {
        return ((Boolean) a.a(7, "measurement.rb.attribution.enable_trigger_redaction", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzg() {
        return ((Boolean) a.a(8, "measurement.rb.attribution.uuid_generation", true).get()).booleanValue();
    }
}
