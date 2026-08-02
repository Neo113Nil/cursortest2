package com.google.android.gms.internal.measurement;

import defpackage.ono;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzu extends zzai {
    public final ono c;

    public zzu(ono onoVar) {
        super("internal.appMetadata");
        this.c = onoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao d(zzg zzgVar, List list) {
        try {
            return zzi.a(this.c.call());
        } catch (Exception unused) {
            return zzao.I7;
        }
    }
}
