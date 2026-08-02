package com.google.android.gms.internal.measurement;

import defpackage.lzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzajc implements zzajb {
    public static final lzo a = zzagr.c.a("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzajb
    public final boolean zzb() {
        return ((Boolean) a.get()).booleanValue();
    }
}
