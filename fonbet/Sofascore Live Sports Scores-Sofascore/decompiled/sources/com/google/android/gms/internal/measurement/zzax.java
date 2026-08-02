package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzax extends zzav {
    public zzax() {
        this.a.add(zzbk.EQUALS);
        this.a.add(zzbk.GREATER_THAN);
        this.a.add(zzbk.GREATER_THAN_EQUALS);
        this.a.add(zzbk.IDENTITY_EQUALS);
        this.a.add(zzbk.IDENTITY_NOT_EQUALS);
        this.a.add(zzbk.LESS_THAN);
        this.a.add(zzbk.LESS_THAN_EQUALS);
        this.a.add(zzbk.NOT_EQUALS);
    }

    public static boolean c(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        if ((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) {
            return ((zzas) zzaoVar).a.compareTo(((zzas) zzaoVar2).a) < 0;
        }
        double doubleValue = zzaoVar.zzd().doubleValue();
        double doubleValue2 = zzaoVar2.zzd().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static boolean d(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
                return true;
            }
            return zzaoVar instanceof zzah ? (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()) || zzaoVar.zzd().doubleValue() != zzaoVar2.zzd().doubleValue()) ? false : true : zzaoVar instanceof zzas ? zzaoVar.zzc().equals(zzaoVar2.zzc()) : zzaoVar instanceof zzaf ? zzaoVar.zze().equals(zzaoVar2.zze()) : zzaoVar == zzaoVar2;
        }
        if (((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) && ((zzaoVar2 instanceof zzat) || (zzaoVar2 instanceof zzam))) {
            return true;
        }
        boolean z = zzaoVar instanceof zzah;
        if (z && (zzaoVar2 instanceof zzas)) {
            return d(zzaoVar, new zzah(zzaoVar2.zzd()));
        }
        boolean z2 = zzaoVar instanceof zzas;
        if (z2 && (zzaoVar2 instanceof zzah)) {
            return d(new zzah(zzaoVar.zzd()), zzaoVar2);
        }
        if (zzaoVar instanceof zzaf) {
            return d(new zzah(zzaoVar.zzd()), zzaoVar2);
        }
        if (zzaoVar2 instanceof zzaf) {
            return d(zzaoVar, new zzah(zzaoVar2.zzd()));
        }
        if ((z2 || z) && (zzaoVar2 instanceof zzak)) {
            return d(zzaoVar, new zzas(zzaoVar2.zzc()));
        }
        if ((zzaoVar instanceof zzak) && ((zzaoVar2 instanceof zzas) || (zzaoVar2 instanceof zzah))) {
            return d(new zzas(zzaoVar.zzc()), zzaoVar2);
        }
        return false;
    }

    public static boolean e(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        return (((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) || !(Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()))) && !c(zzaoVar2, zzaoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        boolean d;
        boolean d2;
        zzh.a(2, zzh.e(str).name(), arrayList);
        zzao b = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
        zzao b2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
        int ordinal = zzh.e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                d2 = d(b, b2);
            } else if (ordinal == 42) {
                d = c(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        d = c(b2, b);
                        break;
                    case 38:
                        d = e(b2, b);
                        break;
                    case 39:
                        d = zzh.f(b, b2);
                        break;
                    case 40:
                        d2 = zzh.f(b, b2);
                        break;
                    default:
                        b(str);
                        throw null;
                }
            } else {
                d = e(b, b2);
            }
            d = !d2;
        } else {
            d = d(b, b2);
        }
        return d ? zzao.N7 : zzao.O7;
    }
}
