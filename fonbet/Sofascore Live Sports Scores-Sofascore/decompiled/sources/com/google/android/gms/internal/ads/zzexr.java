package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import defpackage.ddb;
import defpackage.k6o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzexr implements zzfdi {
    public final zzfic a;

    public zzexr(zzfic zzficVar) {
        this.a = zzficVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        zzfic zzficVar = this.a;
        if (zzficVar == null) {
            return zzhcy.a(new k6o(null, 1));
        }
        String str = zzficVar.a;
        return Strings.a(str) ? zzhcy.a(new k6o(null, 1)) : zzhcy.a(new k6o(str, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 15;
    }
}
