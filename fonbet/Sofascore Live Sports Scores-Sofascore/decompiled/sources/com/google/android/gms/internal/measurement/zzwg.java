package com.google.android.gms.internal.measurement;

import defpackage.k9p;
import defpackage.z1a;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzwg extends k9p {
    public static final zzwg g;
    public final zzwl f;

    static {
        UUID randomUUID = UUID.randomUUID();
        g = new zzwg("<skip trace>", randomUUID, k9p.e(randomUUID), g.e, zzvy.c());
    }

    public zzwg(String str, UUID uuid, String str2, zzwl zzwlVar, zzwq zzwqVar) {
        super(str, uuid, str2, zzwqVar);
        z1a.s(zzwlVar.c);
        this.f = zzwlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return zzwl.a(this.f, zzl());
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return g.e;
    }
}
