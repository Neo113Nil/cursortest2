package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzau extends zzav {
    public zzau() {
        this.a.add(zzbk.BITWISE_AND);
        this.a.add(zzbk.BITWISE_LEFT_SHIFT);
        this.a.add(zzbk.BITWISE_NOT);
        this.a.add(zzbk.BITWISE_OR);
        this.a.add(zzbk.BITWISE_RIGHT_SHIFT);
        this.a.add(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(zzbk.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        switch (zzh.e(str).ordinal()) {
            case 4:
                zzh.a(2, "BITWISE_AND", arrayList);
                return new zzah(Double.valueOf(zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue()) & zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue())));
            case 5:
                zzh.a(2, "BITWISE_LEFT_SHIFT", arrayList);
                return new zzah(Double.valueOf(zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue()) << ((int) (zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()) & 31))));
            case 6:
                zzh.a(1, "BITWISE_NOT", arrayList);
                return new zzah(Double.valueOf(~zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue())));
            case 7:
                zzh.a(2, "BITWISE_OR", arrayList);
                return new zzah(Double.valueOf(zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue()) | zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue())));
            case 8:
                zzh.a(2, "BITWISE_RIGHT_SHIFT", arrayList);
                return new zzah(Double.valueOf(zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue()) >> ((int) (zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()) & 31))));
            case 9:
                zzh.a(2, "BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList);
                return new zzah(Double.valueOf((zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue()) & 4294967295L) >>> ((int) (zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()) & 31))));
            case 10:
                zzh.a(2, "BITWISE_XOR", arrayList);
                return new zzah(Double.valueOf(zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue()) ^ zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue())));
            default:
                b(str);
                throw null;
        }
    }
}
