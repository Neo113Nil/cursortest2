package com.google.android.gms.internal.ads;

import defpackage.fno;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhne extends zzhes {
    public final zzhos a;

    public zzhne(zzhos zzhosVar) {
        this.a = zzhosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final zzhfj a() {
        zzhos zzhosVar = this.a;
        return new fno(zzhosVar.a, zzhosVar.e);
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final Integer b() {
        return this.a.f;
    }

    public final zzich c() {
        zzhos zzhosVar = this.a;
        zzhfm zzhfmVar = zzhosVar.e;
        Integer num = zzhosVar.f;
        if (zzhfmVar == zzhfm.e) {
            return zzich.a(new byte[0]);
        }
        if (zzhfmVar == zzhfm.c) {
            return zzhnx.b(num.intValue());
        }
        if (zzhfmVar == zzhfm.d || zzhfmVar == zzhfm.f) {
            return zzhnx.a(num.intValue());
        }
        defpackage.zzl.x("Unknown output prefix type");
        return null;
    }
}
