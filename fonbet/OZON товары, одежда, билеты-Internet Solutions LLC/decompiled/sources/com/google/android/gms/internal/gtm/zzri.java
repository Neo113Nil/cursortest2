package com.google.android.gms.internal.gtm;

import C.o0;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import g.C6594f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzri {
    public static Bundle zza(Map<String, zzqw<?>> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, zzqw<?>> entry : map.entrySet()) {
            if (entry.getValue() instanceof zzrh) {
                bundle.putString(entry.getKey(), ((zzrh) entry.getValue()).zzk());
            } else if (entry.getValue() instanceof zzqx) {
                bundle.putBoolean(entry.getKey(), ((zzqx) entry.getValue()).zzi().booleanValue());
            } else if (entry.getValue() instanceof zzqy) {
                bundle.putDouble(entry.getKey(), ((zzqy) entry.getValue()).zzi().doubleValue());
            } else {
                if (!(entry.getValue() instanceof zzre)) {
                    throw new IllegalArgumentException(String.format("Invalid param type for key '%s'. Only boolean, double and string types and maps of thereof are supported.", entry.getKey()));
                }
                bundle.putBundle(entry.getKey(), zza(((zzre) entry.getValue()).zza));
            }
        }
        return bundle;
    }

    public static zzqw<?> zzb(Object obj) {
        if (obj == null) {
            return zzra.zzd;
        }
        if (obj instanceof zzqw) {
            return (zzqw) obj;
        }
        if (obj instanceof Boolean) {
            return new zzqx((Boolean) obj);
        }
        if (obj instanceof Short) {
            return new zzqy(Double.valueOf(((Short) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzqy(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Long) {
            return new zzqy(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new zzqy(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new zzqy((Double) obj);
        }
        if (!(obj instanceof Byte) && !(obj instanceof Character)) {
            if (obj instanceof String) {
                return new zzrh((String) obj);
            }
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(zzb(it.next()));
                }
                return new zzrd(arrayList);
            }
            if (obj instanceof Map) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Preconditions.checkArgument(entry.getKey() instanceof String);
                    hashMap.put((String) entry.getKey(), zzb(entry.getValue()));
                }
                return new zzre(hashMap);
            }
            if (!(obj instanceof Bundle)) {
                String valueOf = String.valueOf(obj.getClass());
                throw new UnsupportedOperationException(o0.c(new StringBuilder(valueOf.length() + 20), "Type not supported: ", valueOf));
            }
            HashMap hashMap2 = new HashMap();
            Bundle bundle = (Bundle) obj;
            for (String str : bundle.keySet()) {
                hashMap2.put(str, zzb(bundle.get(str)));
            }
            return new zzre(hashMap2);
        }
        return new zzrh(obj.toString());
    }

    public static zzqw zzc(zzib zzibVar, zzqw zzqwVar) {
        Preconditions.checkNotNull(zzqwVar);
        if (!zzj(zzqwVar) && !(zzqwVar instanceof zzqz) && !(zzqwVar instanceof zzrd) && !(zzqwVar instanceof zzre)) {
            if (!(zzqwVar instanceof zzrf)) {
                throw new UnsupportedOperationException("Attempting to evaluate unknown type");
            }
            zzqwVar = zzd(zzibVar, (zzrf) zzqwVar);
        }
        if (zzqwVar == null) {
            throw new IllegalArgumentException("AbstractType evaluated to Java null");
        }
        if (zzqwVar instanceof zzrf) {
            throw new IllegalArgumentException("AbstractType evaluated to illegal type Statement.");
        }
        return zzqwVar;
    }

    public static zzqw zzd(zzib zzibVar, zzrf zzrfVar) {
        String zzi = zzrfVar.zzi();
        List<zzqw<?>> zzj = zzrfVar.zzj();
        zzqw<?> zzb = zzibVar.zzb(zzi);
        if (zzb == null) {
            throw new UnsupportedOperationException(C6594f.a("Function '", zzi, "' is not supported", new StringBuilder(String.valueOf(zzi).length() + 28)));
        }
        if (zzb instanceof zzqz) {
            return ((zzqz) zzb).zzi().zzd(zzibVar, (zzqw[]) zzj.toArray(new zzqw[zzj.size()]));
        }
        throw new UnsupportedOperationException(C6594f.a("Function '", zzi, "' is not a function", new StringBuilder(String.valueOf(zzi).length() + 29)));
    }

    public static zzqw zze(zzqw<?> zzqwVar) {
        if (!(zzqwVar instanceof zzre)) {
            return zzqwVar;
        }
        HashSet hashSet = new HashSet();
        Map<String, zzqw<?>> map = ((zzre) zzqwVar).zza;
        for (Map.Entry<String, zzqw<?>> entry : map.entrySet()) {
            if (entry.getValue() == zzra.zze) {
                hashSet.add(entry.getKey());
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
        return zzqwVar;
    }

    public static zzra zzf(zzib zzibVar, List<zzqw<?>> list) {
        for (zzqw<?> zzqwVar : list) {
            Preconditions.checkArgument(zzqwVar instanceof zzrf);
            zzqw zzc = zzc(zzibVar, zzqwVar);
            if (zzi(zzc)) {
                return (zzra) zzc;
            }
        }
        return zzra.zze;
    }

    public static Object zzg(zzqw<?> zzqwVar) {
        if (zzqwVar == null || zzqwVar == zzra.zzd) {
            return null;
        }
        if (zzqwVar instanceof zzqx) {
            return ((zzqx) zzqwVar).zzi();
        }
        if (zzqwVar instanceof zzqy) {
            zzqy zzqyVar = (zzqy) zzqwVar;
            double doubleValue = zzqyVar.zzi().doubleValue();
            return (Double.isInfinite(doubleValue) || doubleValue - Math.floor(doubleValue) >= 1.0E-5d) ? zzqyVar.zzi().toString() : Integer.valueOf((int) doubleValue);
        }
        if (zzqwVar instanceof zzrh) {
            return ((zzrh) zzqwVar).zzk();
        }
        if (zzqwVar instanceof zzrd) {
            ArrayList arrayList = new ArrayList();
            for (zzqw<?> zzqwVar2 : ((zzrd) zzqwVar).zzk()) {
                Object zzg = zzg(zzqwVar2);
                if (zzg == null) {
                    zzhl.zza(String.format("Failure to convert a list element to object: %s (%s)", zzqwVar2, zzqwVar2.getClass().getCanonicalName()));
                    return null;
                }
                arrayList.add(zzg);
            }
            return arrayList;
        }
        if (!(zzqwVar instanceof zzre)) {
            String valueOf = String.valueOf(zzqwVar.getClass());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
            sb2.append("Converting to Object from unknown abstract type: ");
            sb2.append(valueOf);
            zzhl.zza(sb2.toString());
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, zzqw<?>> entry : ((zzre) zzqwVar).zza.entrySet()) {
            Object zzg2 = zzg(entry.getValue());
            if (zzg2 == null) {
                zzhl.zza(String.format("Failure to convert a map's value to object: %s (%s)", entry.getValue(), entry.getValue().getClass().getCanonicalName()));
                return null;
            }
            hashMap.put(entry.getKey(), zzg2);
        }
        return hashMap;
    }

    public static Map<String, Object> zzh(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                hashMap.put(str, zzh((Bundle) obj));
            } else if (obj instanceof List) {
                hashMap.put(str, zzk((List) obj));
            } else {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    public static boolean zzi(zzqw zzqwVar) {
        if (zzqwVar == zzra.zzc || zzqwVar == zzra.zzb) {
            return true;
        }
        return (zzqwVar instanceof zzra) && ((zzra) zzqwVar).zzj();
    }

    public static boolean zzj(zzqw zzqwVar) {
        return (zzqwVar instanceof zzqx) || (zzqwVar instanceof zzqy) || (zzqwVar instanceof zzrh) || zzqwVar == zzra.zzd || zzqwVar == zzra.zze;
    }

    private static List<Object> zzk(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Bundle) {
                arrayList.add(zzh((Bundle) obj));
            } else if (obj instanceof List) {
                arrayList.add(zzk((List) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
