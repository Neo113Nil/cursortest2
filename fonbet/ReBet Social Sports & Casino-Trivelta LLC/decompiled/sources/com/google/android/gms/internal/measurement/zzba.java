package com.google.android.gms.internal.measurement;

import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzba {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzao zza(String str, zzae zzaeVar, zzg zzgVar, List list) {
        double d10;
        Double valueOf = Double.valueOf(-1.0d);
        String str2 = ",";
        double d11 = 0.0d;
        zzai zzaiVar = null;
        int i10 = 0;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    zzh.zza("toString", 0, list);
                    return new zzas(zzaeVar.zzs(","));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    zzae zzaeVar2 = (zzae) zzaeVar.zzt();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            zzao zza = zzgVar.zza((zzao) it.next());
                            if (zza instanceof zzag) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            int zzh = zzaeVar2.zzh();
                            if (zza instanceof zzae) {
                                zzae zzaeVar3 = (zzae) zza;
                                Iterator zzg = zzaeVar3.zzg();
                                while (zzg.hasNext()) {
                                    Integer num = (Integer) zzg.next();
                                    zzaeVar2.zzn(num.intValue() + zzh, zzaeVar3.zzl(num.intValue()));
                                }
                            } else {
                                zzaeVar2.zzn(zzh, zza);
                            }
                        }
                    }
                    return zzaeVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                if (str.equals(ViewProps.FILTER)) {
                    zzh.zza(ViewProps.FILTER, 1, list);
                    zzao zza2 = zzgVar.zza((zzao) list.get(0));
                    if (!(zza2 instanceof zzan)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (zzaeVar.zzi() == 0) {
                        return new zzae();
                    }
                    zzae zzaeVar4 = (zzae) zzaeVar.zzt();
                    zzae zzc = zzc(zzaeVar, zzgVar, (zzan) zza2, null, Boolean.TRUE);
                    zzae zzaeVar5 = new zzae();
                    Iterator zzg2 = zzc.zzg();
                    while (zzg2.hasNext()) {
                        zzaeVar5.zzn(zzaeVar5.zzh(), zzaeVar4.zzl(((Integer) zzg2.next()).intValue()));
                    }
                    return zzaeVar5;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals("reduce")) {
                    return zzb(zzaeVar, zzgVar, list, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals("splice")) {
                    if (list.isEmpty()) {
                        return new zzae();
                    }
                    int zzi = (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                    if (zzi < 0) {
                        zzi = Math.max(0, zzi + zzaeVar.zzh());
                    } else if (zzi > zzaeVar.zzh()) {
                        zzi = zzaeVar.zzh();
                    }
                    int zzh2 = zzaeVar.zzh();
                    zzae zzaeVar6 = new zzae();
                    if (list.size() > 1) {
                        int max = Math.max(0, (int) zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
                        if (max > 0) {
                            for (int i11 = zzi; i11 < Math.min(zzh2, zzi + max); i11++) {
                                zzaeVar6.zzn(zzaeVar6.zzh(), zzaeVar.zzl(zzi));
                                zzaeVar.zzr(zzi);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i12 = 2; i12 < list.size(); i12++) {
                                zzao zza3 = zzgVar.zza((zzao) list.get(i12));
                                if (zza3 instanceof zzag) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                zzaeVar.zzq((zzi + i12) - 2, zza3);
                            }
                        }
                    } else {
                        while (zzi < zzh2) {
                            zzaeVar6.zzn(zzaeVar6.zzh(), zzaeVar.zzl(zzi));
                            zzaeVar.zzn(zzi, null);
                            zzi++;
                        }
                    }
                    return zzaeVar6;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                if (str.equals("forEach")) {
                    zzh.zza("forEach", 1, list);
                    zzao zza4 = zzgVar.zza((zzao) list.get(0));
                    if (!(zza4 instanceof zzan)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (zzaeVar.zzi() == 0) {
                        return zzao.zzf;
                    }
                    zzc(zzaeVar, zzgVar, (zzan) zza4, null, null);
                    return zzao.zzf;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    zzh.zzc("lastIndexOf", 2, list);
                    zzao zzaoVar = zzao.zzf;
                    if (!list.isEmpty()) {
                        zzaoVar = zzgVar.zza((zzao) list.get(0));
                    }
                    int zzh3 = zzaeVar.zzh() - 1;
                    if (list.size() > 1) {
                        zzao zza5 = zzgVar.zza((zzao) list.get(1));
                        d10 = Double.isNaN(zza5.zzd().doubleValue()) ? zzaeVar.zzh() - 1 : zzh.zzi(zza5.zzd().doubleValue());
                        if (d10 < 0.0d) {
                            d10 += zzaeVar.zzh();
                        }
                    } else {
                        d10 = zzh3;
                    }
                    if (d10 < 0.0d) {
                        return new zzah(valueOf);
                    }
                    for (int min = (int) Math.min(zzaeVar.zzh(), d10); min >= 0; min--) {
                        if (zzaeVar.zzo(min) && zzh.zzf(zzaeVar.zzl(min), zzaoVar)) {
                            return new zzah(Double.valueOf(min));
                        }
                    }
                    return new zzah(valueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals("unshift")) {
                    if (!list.isEmpty()) {
                        zzae zzaeVar7 = new zzae();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            zzao zza6 = zzgVar.zza((zzao) it2.next());
                            if (zza6 instanceof zzag) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            zzaeVar7.zzn(zzaeVar7.zzh(), zza6);
                        }
                        int zzh4 = zzaeVar7.zzh();
                        Iterator zzg3 = zzaeVar.zzg();
                        while (zzg3.hasNext()) {
                            Integer num2 = (Integer) zzg3.next();
                            zzaeVar7.zzn(num2.intValue() + zzh4, zzaeVar.zzl(num2.intValue()));
                        }
                        zzaeVar.zzp();
                        Iterator zzg4 = zzaeVar7.zzg();
                        while (zzg4.hasNext()) {
                            Integer num3 = (Integer) zzg4.next();
                            zzaeVar.zzn(num3.intValue(), zzaeVar7.zzl(num3.intValue()));
                        }
                    }
                    return new zzah(Double.valueOf(zzaeVar.zzh()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    zzh.zza("map", 1, list);
                    zzao zza7 = zzgVar.zza((zzao) list.get(0));
                    if (zza7 instanceof zzan) {
                        return zzaeVar.zzh() == 0 ? new zzae() : zzc(zzaeVar, zzgVar, (zzan) zza7, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    zzh.zza("pop", 0, list);
                    int zzh5 = zzaeVar.zzh();
                    if (zzh5 == 0) {
                        return zzao.zzf;
                    }
                    int i13 = zzh5 - 1;
                    zzao zzl = zzaeVar.zzl(i13);
                    zzaeVar.zzr(i13);
                    return zzl;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    zzh.zzc("join", 1, list);
                    if (zzaeVar.zzh() == 0) {
                        return zzao.zzm;
                    }
                    if (!list.isEmpty()) {
                        zzao zza8 = zzgVar.zza((zzao) list.get(0));
                        str2 = ((zza8 instanceof zzam) || (zza8 instanceof zzat)) ? "" : zza8.zzc();
                    }
                    return new zzas(zzaeVar.zzs(str2));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals("push")) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            zzaeVar.zzn(zzaeVar.zzh(), zzgVar.zza((zzao) it3.next()));
                        }
                    }
                    return new zzah(Double.valueOf(zzaeVar.zzh()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    zzh.zza("some", 1, list);
                    zzao zza9 = zzgVar.zza((zzao) list.get(0));
                    if (!(zza9 instanceof zzai)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (zzaeVar.zzh() == 0) {
                        return zzao.zzl;
                    }
                    zzai zzaiVar2 = (zzai) zza9;
                    Iterator zzg5 = zzaeVar.zzg();
                    while (zzg5.hasNext()) {
                        int intValue = ((Integer) zzg5.next()).intValue();
                        if (zzaeVar.zzo(intValue) && zzaiVar2.zza(zzgVar, Arrays.asList(zzaeVar.zzl(intValue), new zzah(Double.valueOf(intValue)), zzaeVar)).zze().booleanValue()) {
                            return zzao.zzk;
                        }
                    }
                    return zzao.zzl;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals(Constants.SORT)) {
                    zzh.zzc(Constants.SORT, 1, list);
                    if (zzaeVar.zzh() >= 2) {
                        List zzb = zzaeVar.zzb();
                        if (!list.isEmpty()) {
                            zzao zza10 = zzgVar.zza((zzao) list.get(0));
                            if (!(zza10 instanceof zzai)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            zzaiVar = (zzai) zza10;
                        }
                        Collections.sort(zzb, new zzaz(zzaiVar, zzgVar));
                        zzaeVar.zzp();
                        Iterator it4 = zzb.iterator();
                        while (it4.hasNext()) {
                            zzaeVar.zzn(i10, (zzao) it4.next());
                            i10++;
                        }
                    }
                    return zzaeVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    zzh.zza("every", 1, list);
                    zzao zza11 = zzgVar.zza((zzao) list.get(0));
                    if (zza11 instanceof zzan) {
                        return zzaeVar.zzh() == 0 ? zzao.zzk : zzc(zzaeVar, zzgVar, (zzan) zza11, Boolean.FALSE, Boolean.TRUE).zzh() != zzaeVar.zzh() ? zzao.zzl : zzao.zzk;
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    zzh.zza("shift", 0, list);
                    if (zzaeVar.zzh() == 0) {
                        return zzao.zzf;
                    }
                    zzao zzl2 = zzaeVar.zzl(0);
                    zzaeVar.zzr(0);
                    return zzl2;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    zzh.zzc("slice", 2, list);
                    if (list.isEmpty()) {
                        return zzaeVar.zzt();
                    }
                    double zzh6 = zzaeVar.zzh();
                    double zzi2 = zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                    double max2 = zzi2 < 0.0d ? Math.max(zzi2 + zzh6, 0.0d) : Math.min(zzi2, zzh6);
                    if (list.size() == 2) {
                        double zzi3 = zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                        zzh6 = zzi3 < 0.0d ? Math.max(zzh6 + zzi3, 0.0d) : Math.min(zzh6, zzi3);
                    }
                    zzae zzaeVar8 = new zzae();
                    for (int i14 = (int) max2; i14 < zzh6; i14++) {
                        zzaeVar8.zzn(zzaeVar8.zzh(), zzaeVar.zzl(i14));
                    }
                    return zzaeVar8;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return zzb(zzaeVar, zzgVar, list, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    zzh.zza("reverse", 0, list);
                    int zzh7 = zzaeVar.zzh();
                    if (zzh7 != 0) {
                        while (i10 < zzh7 / 2) {
                            if (zzaeVar.zzo(i10)) {
                                zzao zzl3 = zzaeVar.zzl(i10);
                                zzaeVar.zzn(i10, null);
                                int i15 = (zzh7 - 1) - i10;
                                if (zzaeVar.zzo(i15)) {
                                    zzaeVar.zzn(i10, zzaeVar.zzl(i15));
                                }
                                zzaeVar.zzn(i15, zzl3);
                            }
                            i10++;
                        }
                    }
                    return zzaeVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    zzh.zzc("indexOf", 2, list);
                    zzao zzaoVar2 = zzao.zzf;
                    if (!list.isEmpty()) {
                        zzaoVar2 = zzgVar.zza((zzao) list.get(0));
                    }
                    if (list.size() > 1) {
                        double zzi4 = zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                        if (zzi4 >= zzaeVar.zzh()) {
                            return new zzah(valueOf);
                        }
                        d11 = zzi4 < 0.0d ? zzaeVar.zzh() + zzi4 : zzi4;
                    }
                    Iterator zzg6 = zzaeVar.zzg();
                    while (zzg6.hasNext()) {
                        int intValue2 = ((Integer) zzg6.next()).intValue();
                        double d12 = intValue2;
                        if (d12 >= d11 && zzh.zzf(zzaeVar.zzl(intValue2), zzaoVar2)) {
                            return new zzah(Double.valueOf(d12));
                        }
                    }
                    return new zzah(valueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzao zzb(zzae zzaeVar, zzg zzgVar, List list, boolean z10) {
        zzao zzaoVar;
        zzh.zzb("reduce", 1, list);
        zzh.zzc("reduce", 2, list);
        zzao zza = zzgVar.zza((zzao) list.get(0));
        if (!(zza instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzaoVar = zzgVar.zza((zzao) list.get(1));
            if (zzaoVar instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzaeVar.zzh() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzaoVar = null;
        }
        zzai zzaiVar = (zzai) zza;
        int zzh = zzaeVar.zzh();
        int i10 = z10 ? 0 : zzh - 1;
        int i11 = z10 ? zzh - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (zzaoVar == null) {
            zzaoVar = zzaeVar.zzl(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (zzaeVar.zzo(i10)) {
                zzaoVar = zzaiVar.zza(zzgVar, Arrays.asList(zzaoVar, zzaeVar.zzl(i10), new zzah(Double.valueOf(i10)), zzaeVar));
                if (zzaoVar instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return zzaoVar;
    }

    private static zzae zzc(zzae zzaeVar, zzg zzgVar, zzai zzaiVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator zzg = zzaeVar.zzg();
        while (zzg.hasNext()) {
            int intValue = ((Integer) zzg.next()).intValue();
            if (zzaeVar.zzo(intValue)) {
                zzao zza = zzaiVar.zza(zzgVar, Arrays.asList(zzaeVar.zzl(intValue), new zzah(Double.valueOf(intValue)), zzaeVar));
                if (zza.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || zza.zze().equals(bool2)) {
                    zzaeVar2.zzn(intValue, zza);
                }
            }
        }
        return zzaeVar2;
    }
}
