package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzin;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzax {
    public static final zzax zza = new zzax(null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zzin.zza, zziq> zzf;

    public final int zza() {
        return this.zzb;
    }

    public final int hashCode() {
        Boolean bool = this.zzd;
        int i = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.zze;
        return this.zzc.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zzin.zza, zziq> entry : this.zzf.entrySet()) {
            String zzb = zzin.zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public static zzax zza(Bundle bundle, int i) {
        if (bundle == null) {
            return new zzax(null, i);
        }
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        for (zzin.zza zzaVar : zzip.DMA.zza()) {
            enumMap.put((EnumMap) zzaVar, (zzin.zza) zzin.zza(bundle.getString(zzaVar.zze)));
        }
        return new zzax((EnumMap<zzin.zza, zziq>) enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    static zzax zza(zziq zziqVar, int i) {
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        enumMap.put((EnumMap) zzin.zza.AD_USER_DATA, (zzin.zza) zziqVar);
        return new zzax((EnumMap<zzin.zza, zziq>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzax zza(String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        zzin.zza[] zza2 = zzip.DMA.zza();
        int length = zza2.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((EnumMap) zza2[i2], (zzin.zza) zzin.zza(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new zzax((EnumMap<zzin.zza, zziq>) enumMap, parseInt, (Boolean) null, (String) null);
    }

    public final zziq zzc() {
        zziq zziqVar = this.zzf.get(zzin.zza.AD_USER_DATA);
        return zziqVar == null ? zziq.UNINITIALIZED : zziqVar;
    }

    public static Boolean zza(Bundle bundle) {
        zziq zza2;
        if (bundle == null || (zza2 = zzin.zza(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i = zzaw.zza[zza2.ordinal()];
        if (i != 3) {
            return i != 4 ? null : true;
        }
        return false;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    private final String zzh() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zzin.zza zzaVar : zzip.DMA.zza()) {
            sb.append(":");
            sb.append(zzin.zza(this.zzf.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzin.zza(this.zzb));
        for (zzin.zza zzaVar : zzip.DMA.zza()) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append("=");
            zziq zziqVar = this.zzf.get(zzaVar);
            if (zziqVar == null) {
                sb.append("uninitialized");
            } else {
                int i = zzaw.zza[zziqVar.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append("default");
                } else if (i == 3) {
                    sb.append("denied");
                } else if (i == 4) {
                    sb.append(PermissionsResponse.GRANTED_KEY);
                }
            }
        }
        if (this.zzd != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.zzd);
        }
        if (this.zze != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.zze);
        }
        return sb.toString();
    }

    zzax(Boolean bool, int i) {
        this(bool, i, (Boolean) null, (String) null);
    }

    zzax(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zzin.zza, zziq> enumMap = new EnumMap<>((Class<zzin.zza>) zzin.zza.class);
        this.zzf = enumMap;
        enumMap.put((EnumMap<zzin.zza, zziq>) zzin.zza.AD_USER_DATA, (zzin.zza) zzin.zza(bool));
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    private zzax(EnumMap<zzin.zza, zziq> enumMap, int i, Boolean bool, String str) {
        EnumMap<zzin.zza, zziq> enumMap2 = new EnumMap<>((Class<zzin.zza>) zzin.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzax)) {
            return false;
        }
        zzax zzaxVar = (zzax) obj;
        if (this.zzc.equalsIgnoreCase(zzaxVar.zzc) && Objects.equals(this.zzd, zzaxVar.zzd)) {
            return Objects.equals(this.zze, zzaxVar.zze);
        }
        return false;
    }

    public final boolean zzg() {
        Iterator<zziq> it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zziq.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }
}
