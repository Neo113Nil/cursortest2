package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbb extends zzav {
    public zzbb() {
        this.a.add(zzbk.AND);
        this.a.add(zzbk.NOT);
        this.a.add(zzbk.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int ordinal = zzh.e(str).ordinal();
        if (ordinal == 1) {
            zzh.a(2, "AND", arrayList);
            zzao b = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
            if (!b.zze().booleanValue()) {
                return b;
            }
            return zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
        }
        if (ordinal == 47) {
            zzh.a(1, "NOT", arrayList);
            return new zzaf(Boolean.valueOf(!zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zze().booleanValue()));
        }
        if (ordinal != 50) {
            b(str);
            throw null;
        }
        zzh.a(2, "OR", arrayList);
        zzao b2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
        if (b2.zze().booleanValue()) {
            return b2;
        }
        return zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
    }
}
