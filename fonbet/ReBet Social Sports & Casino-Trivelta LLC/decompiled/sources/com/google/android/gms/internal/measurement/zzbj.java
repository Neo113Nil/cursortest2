package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbj extends zzav {
    public zzbj() {
        this.zza.add(zzbk.ASSIGN);
        this.zza.add(zzbk.CONST);
        this.zza.add(zzbk.CREATE_ARRAY);
        this.zza.add(zzbk.CREATE_OBJECT);
        this.zza.add(zzbk.EXPRESSION_LIST);
        this.zza.add(zzbk.GET);
        this.zza.add(zzbk.GET_INDEX);
        this.zza.add(zzbk.GET_PROPERTY);
        this.zza.add(zzbk.NULL);
        this.zza.add(zzbk.SET_PROPERTY);
        this.zza.add(zzbk.TYPEOF);
        this.zza.add(zzbk.UNDEFINED);
        this.zza.add(zzbk.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        String str2;
        zzbk zzbkVar = zzbk.ADD;
        int ordinal = zzh.zze(str).ordinal();
        int i10 = 0;
        if (ordinal == 3) {
            zzh.zza(zzbk.ASSIGN.name(), 2, list);
            zzao zza = zzgVar.zza((zzao) list.get(0));
            if (!(zza instanceof zzas)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", zza.getClass().getCanonicalName()));
            }
            if (!zzgVar.zzd(zza.zzc())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", zza.zzc()));
            }
            zzao zza2 = zzgVar.zza((zzao) list.get(1));
            zzgVar.zze(zza.zzc(), zza2);
            return zza2;
        }
        if (ordinal == 14) {
            zzh.zzb(zzbk.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i10 < list.size() - 1) {
                zzao zza3 = zzgVar.zza((zzao) list.get(i10));
                if (!(zza3 instanceof zzas)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", zza3.getClass().getCanonicalName()));
                }
                zzgVar.zzg(zza3.zzc(), zzgVar.zza((zzao) list.get(i10 + 1)));
                i10 += 2;
            }
            return zzao.zzf;
        }
        if (ordinal == 24) {
            zzh.zzb(zzbk.EXPRESSION_LIST.name(), 1, list);
            zzao zzaoVar = zzao.zzf;
            while (i10 < list.size()) {
                zzaoVar = zzgVar.zza((zzao) list.get(i10));
                if (zzaoVar instanceof zzag) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return zzaoVar;
        }
        if (ordinal == 33) {
            zzh.zza(zzbk.GET.name(), 1, list);
            zzao zza4 = zzgVar.zza((zzao) list.get(0));
            if (zza4 instanceof zzas) {
                return zzgVar.zzh(zza4.zzc());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", zza4.getClass().getCanonicalName()));
        }
        if (ordinal == 49) {
            zzh.zza(zzbk.NULL.name(), 0, list);
            return zzao.zzg;
        }
        if (ordinal == 58) {
            zzh.zza(zzbk.SET_PROPERTY.name(), 3, list);
            zzao zza5 = zzgVar.zza((zzao) list.get(0));
            zzao zza6 = zzgVar.zza((zzao) list.get(1));
            zzao zza7 = zzgVar.zza((zzao) list.get(2));
            if (zza5 == zzao.zzf || zza5 == zzao.zzg) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", zza6.zzc(), zza5.zzc()));
            }
            if ((zza5 instanceof zzae) && (zza6 instanceof zzah)) {
                ((zzae) zza5).zzn(zza6.zzd().intValue(), zza7);
                return zza7;
            }
            if (!(zza5 instanceof zzak)) {
                return zza7;
            }
            ((zzak) zza5).zzm(zza6.zzc(), zza7);
            return zza7;
        }
        if (ordinal == 17) {
            if (list.isEmpty()) {
                return new zzae();
            }
            zzae zzaeVar = new zzae();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzao zza8 = zzgVar.zza((zzao) it.next());
                if (zza8 instanceof zzag) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                zzaeVar.zzn(i10, zza8);
                i10++;
            }
            return zzaeVar;
        }
        if (ordinal == 18) {
            if (list.isEmpty()) {
                return new zzal();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            zzal zzalVar = new zzal();
            while (i10 < list.size() - 1) {
                zzao zza9 = zzgVar.zza((zzao) list.get(i10));
                zzao zza10 = zzgVar.zza((zzao) list.get(i10 + 1));
                if ((zza9 instanceof zzag) || (zza10 instanceof zzag)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                zzalVar.zzm(zza9.zzc(), zza10);
                i10 += 2;
            }
            return zzalVar;
        }
        if (ordinal == 35 || ordinal == 36) {
            zzh.zza(zzbk.GET_PROPERTY.name(), 2, list);
            zzao zza11 = zzgVar.zza((zzao) list.get(0));
            zzao zza12 = zzgVar.zza((zzao) list.get(1));
            if ((zza11 instanceof zzae) && zzh.zzd(zza12)) {
                return ((zzae) zza11).zzl(zza12.zzd().intValue());
            }
            if (zza11 instanceof zzak) {
                return ((zzak) zza11).zzk(zza12.zzc());
            }
            if (zza11 instanceof zzas) {
                if ("length".equals(zza12.zzc())) {
                    return new zzah(Double.valueOf(zza11.zzc().length()));
                }
                if (zzh.zzd(zza12) && zza12.zzd().doubleValue() < zza11.zzc().length()) {
                    return new zzas(String.valueOf(zza11.zzc().charAt(zza12.zzd().intValue())));
                }
            }
            return zzao.zzf;
        }
        switch (ordinal) {
            case 62:
                zzh.zza(zzbk.TYPEOF.name(), 1, list);
                zzao zza13 = zzgVar.zza((zzao) list.get(0));
                if (zza13 instanceof zzat) {
                    str2 = "undefined";
                } else if (zza13 instanceof zzaf) {
                    str2 = "boolean";
                } else if (zza13 instanceof zzah) {
                    str2 = "number";
                } else if (zza13 instanceof zzas) {
                    str2 = "string";
                } else if (zza13 instanceof zzan) {
                    str2 = "function";
                } else {
                    if ((zza13 instanceof zzap) || (zza13 instanceof zzag)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zza13));
                    }
                    str2 = "object";
                }
                return new zzas(str2);
            case 63:
                zzh.zza(zzbk.UNDEFINED.name(), 0, list);
                return zzao.zzf;
            case 64:
                zzh.zzb(zzbk.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    zzao zza14 = zzgVar.zza((zzao) it2.next());
                    if (!(zza14 instanceof zzas)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", zza14.getClass().getCanonicalName()));
                    }
                    zzgVar.zzf(zza14.zzc(), zzao.zzf);
                }
                return zzao.zzf;
            default:
                return super.zzb(str);
        }
    }
}
