package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaaq implements zzaai {
    public final Level a;
    public final Set b;
    public final zzzq c;

    private zzaaq() {
        this(Level.ALL, zzaas.f, zzaas.g);
    }

    @Override // com.google.android.gms.internal.measurement.zzaai
    public final zzzf zza(String str) {
        return new zzaas(str, this.a, this.b, this.c);
    }

    public zzaaq(Level level, Set set, zzzq zzzqVar) {
        this.a = level;
        this.b = set;
        this.c = zzzqVar;
    }
}
