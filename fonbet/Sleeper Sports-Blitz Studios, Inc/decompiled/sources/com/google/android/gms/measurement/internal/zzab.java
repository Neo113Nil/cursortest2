package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzff;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
abstract class zzab {
    String zza;
    int zzb;
    Boolean zzc;
    Boolean zzd;
    Long zze;
    Long zzf;

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0084, code lost:
    
        if (r2 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Boolean zza(BigDecimal bigDecimal, zzff.zzd zzdVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzdVar);
        if (zzdVar.zzh() && zzdVar.zza() != zzff.zzd.zzb.UNKNOWN_COMPARISON_TYPE) {
            if (zzdVar.zza() == zzff.zzd.zzb.BETWEEN) {
                if (!zzdVar.zzl() || !zzdVar.zzk()) {
                    return null;
                }
            } else if (!zzdVar.zzi()) {
                return null;
            }
            zzff.zzd.zzb zza = zzdVar.zza();
            if (zzdVar.zza() == zzff.zzd.zzb.BETWEEN) {
                if (zznp.zzb(zzdVar.zzf()) && zznp.zzb(zzdVar.zze())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(zzdVar.zzf());
                        bigDecimal4 = new BigDecimal(zzdVar.zze());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!zznp.zzb(zzdVar.zzd())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(zzdVar.zzd());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (zza == zzff.zzd.zzb.BETWEEN) {
                if (bigDecimal3 == null) {
                    return null;
                }
            }
            int i = zzv.zzb[zza.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    }
                    if (bigDecimal2 != null) {
                        if (d == 0.0d) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
            } else if (bigDecimal2 != null) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
            }
        }
        return null;
    }

    abstract int zza();

    abstract boolean zzb();

    abstract boolean zzc();

    static Boolean zza(String str, zzff.zzf zzfVar, zzfw zzfwVar) {
        String zze;
        List<String> list;
        Preconditions.checkNotNull(zzfVar);
        if (str == null || !zzfVar.zzj() || zzfVar.zzb() == zzff.zzf.zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (zzfVar.zzb() == zzff.zzf.zzb.IN_LIST) {
            if (zzfVar.zza() == 0) {
                return null;
            }
        } else if (!zzfVar.zzi()) {
            return null;
        }
        zzff.zzf.zzb zzb = zzfVar.zzb();
        boolean zzg = zzfVar.zzg();
        if (zzg || zzb == zzff.zzf.zzb.REGEXP || zzb == zzff.zzf.zzb.IN_LIST) {
            zze = zzfVar.zze();
        } else {
            zze = zzfVar.zze().toUpperCase(Locale.ENGLISH);
        }
        String str2 = zze;
        if (zzfVar.zza() == 0) {
            list = null;
        } else {
            List<String> zzf = zzfVar.zzf();
            if (!zzg) {
                ArrayList arrayList = new ArrayList(zzf.size());
                Iterator<String> it = zzf.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                zzf = Collections.unmodifiableList(arrayList);
            }
            list = zzf;
        }
        return zza(str, zzb, zzg, str2, list, zzb == zzff.zzf.zzb.REGEXP ? str2 : null, zzfwVar);
    }

    private static Boolean zza(String str, zzff.zzf.zzb zzbVar, boolean z, String str2, List<String> list, String str3, zzfw zzfwVar) {
        if (str == null) {
            return null;
        }
        if (zzbVar == zzff.zzf.zzb.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && zzbVar != zzff.zzf.zzb.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (zzv.zza[zzbVar.ordinal()]) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (zzfwVar != null) {
                            zzfwVar.zzu().zza("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    static Boolean zza(double d, zzff.zzd zzdVar) {
        try {
            return zza(new BigDecimal(d), zzdVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean zza(long j, zzff.zzd zzdVar) {
        try {
            return zza(new BigDecimal(j), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean zza(String str, zzff.zzd zzdVar) {
        if (!zznp.zzb(str)) {
            return null;
        }
        try {
            return zza(new BigDecimal(str), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean zza(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    zzab(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
