package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.ShowFirstParty;
import g.C6594f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzjr {
    private static final Map<String, zzjq> zza;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(zza.CONTAINS.toString(), new zzjq("contains"));
        hashMap.put(zza.ENDS_WITH.toString(), new zzjq("endsWith"));
        hashMap.put(zza.EQUALS.toString(), new zzjq("equals"));
        hashMap.put(zza.GREATER_EQUALS.toString(), new zzjq("greaterEquals"));
        hashMap.put(zza.GREATER_THAN.toString(), new zzjq("greaterThan"));
        hashMap.put(zza.LESS_EQUALS.toString(), new zzjq("lessEquals"));
        hashMap.put(zza.LESS_THAN.toString(), new zzjq("lessThan"));
        hashMap.put(zza.REGEX.toString(), new zzjq("regex", new String[]{zzb.ARG0.toString(), zzb.ARG1.toString(), zzb.IGNORE_CASE.toString()}));
        hashMap.put(zza.STARTS_WITH.toString(), new zzjq("startsWith"));
        zza = hashMap;
    }

    @ShowFirstParty
    public static zzrf zza(String str, Map<String, zzqw<?>> map, zzib zzibVar) {
        Map<String, zzjq> map2 = zza;
        if (!map2.containsKey(str)) {
            throw new RuntimeException(C6594f.a("Fail to convert ", str, " to the internal representation", new StringBuilder(String.valueOf(str).length() + 47)));
        }
        zzjq zzjqVar = map2.get(str);
        String[] zzb = zzjqVar.zzb();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < zzb.length; i11++) {
            if (map.containsKey(zzb[i11])) {
                arrayList.add(map.get(zzb[i11]));
            } else {
                arrayList.add(zzra.zze);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new zzrh("gtmUtils"));
        zzrf zzrfVar = new zzrf("15", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(zzrfVar);
        arrayList3.add(new zzrh("mobile"));
        zzrf zzrfVar2 = new zzrf("17", arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(zzrfVar2);
        arrayList4.add(new zzrh(zzjqVar.zza()));
        arrayList4.add(new zzrd(arrayList));
        return new zzrf("2", arrayList4);
    }

    public static String zzb(zza zzaVar) {
        return zzc(zzaVar.toString());
    }

    public static String zzc(String str) {
        Map<String, zzjq> map = zza;
        if (map.containsKey(str)) {
            return map.get(str).zza();
        }
        return null;
    }
}
