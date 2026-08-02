package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzin {
    public static final zzin zza = new zzin(null, null, 100);
    private final EnumMap<zza, zziq> zzb;
    private final int zzc;

    public static boolean zza(int i, int i2) {
        if (i == -20 && i2 == -30) {
            return true;
        }
        return (i == -30 && i2 == -20) || i == i2 || i < i2;
    }

    static char zza(zziq zziqVar) {
        if (zziqVar == null) {
            return '-';
        }
        int ordinal = zziqVar.ordinal();
        if (ordinal == 1) {
            return SignatureVisitor.EXTENDS;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final int hashCode() {
        int i = this.zzc * 17;
        Iterator<zziq> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            i = (i * 31) + it.next().hashCode();
        }
        return i;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zza, zziq> entry : this.zzb.entrySet()) {
            String zzb = zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        return bundle;
    }

    static zziq zza(String str) {
        if (str == null) {
            return zziq.UNINITIALIZED;
        }
        if (str.equals(PermissionsResponse.GRANTED_KEY)) {
            return zziq.GRANTED;
        }
        if (str.equals("denied")) {
            return zziq.DENIED;
        }
        return zziq.UNINITIALIZED;
    }

    public final zziq zzc() {
        zziq zziqVar = this.zzb.get(zza.AD_STORAGE);
        return zziqVar == null ? zziq.UNINITIALIZED : zziqVar;
    }

    public final zziq zzd() {
        zziq zziqVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        return zziqVar == null ? zziq.UNINITIALIZED : zziqVar;
    }

    static zziq zza(char c) {
        if (c == '+') {
            return zziq.DEFAULT;
        }
        if (c == '0') {
            return zziq.DENIED;
        }
        if (c == '1') {
            return zziq.GRANTED;
        }
        return zziq.UNINITIALIZED;
    }

    static zziq zza(Boolean bool) {
        if (bool == null) {
            return zziq.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return zziq.GRANTED;
        }
        return zziq.DENIED;
    }

    public static zzin zza(Bundle bundle, int i) {
        zza[] zzaVarArr;
        if (bundle == null) {
            return new zzin(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzip.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            enumMap.put((EnumMap) zzaVar, (zza) zza(bundle.getString(zzaVar.zze)));
        }
        return new zzin(enumMap, i);
    }

    public static zzin zza(zziq zziqVar, zziq zziqVar2, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put((EnumMap) zza.AD_STORAGE, (zza) zziqVar);
        enumMap.put((EnumMap) zza.ANALYTICS_STORAGE, (zza) zziqVar2);
        return new zzin(enumMap, -10);
    }

    public static zzin zzb(String str) {
        return zza(str, 100);
    }

    public static zzin zza(String str, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zza2 = zzip.STORAGE.zza();
        for (int i2 = 0; i2 < zza2.length; i2++) {
            zza zzaVar = zza2[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put((EnumMap) zzaVar, (zza) zza(str.charAt(i3)));
            } else {
                enumMap.put((EnumMap) zzaVar, (zza) zziq.UNINITIALIZED);
            }
        }
        return new zzin(enumMap, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzin zza(zzin zzinVar) {
        zza[] zzaVarArr;
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzip.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            zziq zziqVar = this.zzb.get(zzaVar);
            zziq zziqVar2 = zzinVar.zzb.get(zzaVar);
            if (zziqVar != null) {
                if (zziqVar2 != null) {
                    if (zziqVar != zziq.UNINITIALIZED) {
                        if (zziqVar2 != zziq.UNINITIALIZED) {
                            if (zziqVar != zziq.DEFAULT) {
                                if (zziqVar2 != zziq.DEFAULT) {
                                    zziqVar = (zziqVar == zziq.DENIED || zziqVar2 == zziq.DENIED) ? zziq.DENIED : zziq.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (zziqVar == null) {
                    enumMap.put((EnumMap) zzaVar, (zza) zziqVar);
                }
            }
            zziqVar = zziqVar2;
            if (zziqVar == null) {
            }
        }
        return new zzin(enumMap, 100);
    }

    public final zzin zzb(zzin zzinVar) {
        zza[] zzaVarArr;
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzip.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            zziq zziqVar = this.zzb.get(zzaVar);
            if (zziqVar == zziq.UNINITIALIZED) {
                zziqVar = zzinVar.zzb.get(zzaVar);
            }
            if (zziqVar != null) {
                enumMap.put((EnumMap) zzaVar, (zza) zziqVar);
            }
        }
        return new zzin(enumMap, this.zzc);
    }

    public final Boolean zze() {
        zziq zziqVar = this.zzb.get(zza.AD_STORAGE);
        if (zziqVar == null) {
            return null;
        }
        int ordinal = zziqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                return null;
            }
        }
        return true;
    }

    public final Boolean zzf() {
        zziq zziqVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        if (zziqVar == null) {
            return null;
        }
        int ordinal = zziqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                return null;
            }
        }
        return true;
    }

    static String zza(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i == 90) {
            return "REMOTE_CONFIG";
        }
        if (i == 100) {
            return "UNKNOWN";
        }
        return "OTHER";
    }

    static String zzb(zziq zziqVar) {
        int ordinal = zziqVar.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return PermissionsResponse.GRANTED_KEY;
    }

    public static String zza(Bundle bundle) {
        zza[] zzaVarArr;
        String string;
        zzaVarArr = zzip.STORAGE.zzd;
        int length = zzaVarArr.length;
        int i = 0;
        while (true) {
            Boolean bool = null;
            if (i >= length) {
                return null;
            }
            zza zzaVar = zzaVarArr[i];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string != null) {
                    if (string.equals(PermissionsResponse.GRANTED_KEY)) {
                        bool = Boolean.TRUE;
                    } else if (string.equals("denied")) {
                        bool = Boolean.FALSE;
                    }
                }
                if (bool == null) {
                    return string;
                }
            }
            i++;
        }
    }

    public final String zzg() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzip.STORAGE.zza()) {
            zziq zziqVar = this.zzb.get(zzaVar);
            char c = '-';
            if (zziqVar != null && (ordinal = zziqVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final String zzh() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzip.STORAGE.zza()) {
            sb.append(zza(this.zzb.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String toString() {
        zza[] zzaVarArr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zza(this.zzc));
        zzaVarArr = zzip.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append("=");
            zziq zziqVar = this.zzb.get(zzaVar);
            if (zziqVar == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = zziqVar.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("default");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append(PermissionsResponse.GRANTED_KEY);
                }
            }
        }
        return sb.toString();
    }

    private zzin(EnumMap<zza, zziq> enumMap, int i) {
        EnumMap<zza, zziq> enumMap2 = new EnumMap<>((Class<zza>) zza.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }

    public zzin(Boolean bool, Boolean bool2, int i) {
        EnumMap<zza, zziq> enumMap = new EnumMap<>((Class<zza>) zza.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap<zza, zziq>) zza.AD_STORAGE, (zza) zza(bool));
        enumMap.put((EnumMap<zza, zziq>) zza.ANALYTICS_STORAGE, (zza) zza(bool2));
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        zza[] zzaVarArr;
        if (!(obj instanceof zzin)) {
            return false;
        }
        zzin zzinVar = (zzin) obj;
        zzaVarArr = zzip.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            if (this.zzb.get(zzaVar) != zzinVar.zzb.get(zzaVar)) {
                return false;
            }
        }
        return this.zzc == zzinVar.zzc;
    }

    public final boolean zza(zzin zzinVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zzinVar.zza(zzaVar) && zza(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzi() {
        return zza(zza.AD_STORAGE);
    }

    public final boolean zza(zza zzaVar) {
        return this.zzb.get(zzaVar) != zziq.DENIED;
    }

    public final boolean zzj() {
        return zza(zza.ANALYTICS_STORAGE);
    }

    public final boolean zzk() {
        Iterator<zziq> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zziq.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzin zzinVar) {
        return zzb(zzinVar, (zza[]) this.zzb.keySet().toArray(new zza[0]));
    }

    public final boolean zzb(zzin zzinVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zziq zziqVar = this.zzb.get(zzaVar);
            zziq zziqVar2 = zzinVar.zzb.get(zzaVar);
            if (zziqVar == zziq.DENIED && zziqVar2 != zziq.DENIED) {
                return true;
            }
        }
        return false;
    }
}
