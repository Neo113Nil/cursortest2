package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbh extends zzav {
    public zzbh() {
        this.a.add(zzbk.ADD);
        this.a.add(zzbk.DIVIDE);
        this.a.add(zzbk.MODULUS);
        this.a.add(zzbk.MULTIPLY);
        this.a.add(zzbk.NEGATE);
        this.a.add(zzbk.POST_DECREMENT);
        this.a.add(zzbk.POST_INCREMENT);
        this.a.add(zzbk.PRE_DECREMENT);
        this.a.add(zzbk.PRE_INCREMENT);
        this.a.add(zzbk.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int ordinal = zzh.e(str).ordinal();
        if (ordinal == 0) {
            zzh.a(2, "ADD", arrayList);
            zzao b = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
            zzao b2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
            if (!(b instanceof zzak) && !(b instanceof zzas) && !(b2 instanceof zzak) && !(b2 instanceof zzas)) {
                return new zzah(Double.valueOf(b2.zzd().doubleValue() + b.zzd().doubleValue()));
            }
            return new zzas(String.valueOf(b.zzc()).concat(String.valueOf(b2.zzc())));
        }
        if (ordinal == 21) {
            zzh.a(2, "DIVIDE", arrayList);
            return new zzah(Double.valueOf(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue() / zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()));
        }
        if (ordinal == 59) {
            zzh.a(2, "SUBTRACT", arrayList);
            zzao b3 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
            zzah zzahVar = new zzah(Double.valueOf(-zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()));
            return new zzah(Double.valueOf(zzahVar.a.doubleValue() + b3.zzd().doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            zzh.a(2, str, arrayList);
            zzao b4 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
            zzgVar.a((zzao) arrayList.get(1));
            return b4;
        }
        if (ordinal == 55 || ordinal == 56) {
            zzh.a(1, str, arrayList);
            return zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
        }
        switch (ordinal) {
            case 44:
                zzh.a(2, "MODULUS", arrayList);
                return new zzah(Double.valueOf(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue() % zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()));
            case 45:
                zzh.a(2, "MULTIPLY", arrayList);
                return new zzah(Double.valueOf(zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue() * zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue()));
            case 46:
                zzh.a(1, "NEGATE", arrayList);
                return new zzah(Double.valueOf(-zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue()));
            default:
                b(str);
                throw null;
        }
    }
}
