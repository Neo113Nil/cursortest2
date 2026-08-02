package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzin;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzaj {
    private final EnumMap<zzin.zza, zzai> zza;

    public final zzai zza(zzin.zza zzaVar) {
        zzai zzaiVar = this.zza.get(zzaVar);
        return zzaiVar == null ? zzai.UNSET : zzaiVar;
    }

    public static zzaj zza(String str) {
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        if (str.length() >= zzin.zza.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                zzin.zza[] values = zzin.zza.values();
                int length = values.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put((EnumMap) values[i], (zzin.zza) zzai.zza(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new zzaj(enumMap);
            }
        }
        return new zzaj();
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder("1");
        for (zzin.zza zzaVar : zzin.zza.values()) {
            zzai zzaiVar = this.zza.get(zzaVar);
            if (zzaiVar == null) {
                zzaiVar = zzai.UNSET;
            }
            c = zzaiVar.zzl;
            sb.append(c);
        }
        return sb.toString();
    }

    zzaj() {
        this.zza = new EnumMap<>(zzin.zza.class);
    }

    private zzaj(EnumMap<zzin.zza, zzai> enumMap) {
        EnumMap<zzin.zza, zzai> enumMap2 = new EnumMap<>((Class<zzin.zza>) zzin.zza.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public final void zza(zzin.zza zzaVar, int i) {
        zzai zzaiVar = zzai.UNSET;
        if (i == -30) {
            zzaiVar = zzai.TCF;
        } else {
            if (i != -20) {
                if (i == -10) {
                    zzaiVar = zzai.MANIFEST;
                } else if (i != 0) {
                    if (i == 30) {
                        zzaiVar = zzai.INITIALIZATION;
                    }
                }
            }
            zzaiVar = zzai.API;
        }
        this.zza.put((EnumMap<zzin.zza, zzai>) zzaVar, (zzin.zza) zzaiVar);
    }

    public final void zza(zzin.zza zzaVar, zzai zzaiVar) {
        this.zza.put((EnumMap<zzin.zza, zzai>) zzaVar, (zzin.zza) zzaiVar);
    }
}
