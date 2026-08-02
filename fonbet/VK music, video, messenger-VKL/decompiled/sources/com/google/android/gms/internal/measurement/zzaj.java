package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.fo8;
import xsna.go9;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes12.dex */
public final /* synthetic */ class zzaj {
    public static zzap zza(zzal zzalVar, zzap zzapVar, zzg zzgVar, List list) {
        if (zzalVar.zzt(zzapVar.zzi())) {
            zzap zzf = zzalVar.zzf(zzapVar.zzi());
            if (zzf instanceof zzai) {
                return ((zzai) zzf).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(fo8.a(zzapVar.zzi(), " is not a function"));
        }
        if (!"hasOwnProperty".equals(zzapVar.zzi())) {
            throw new IllegalArgumentException(go9.b("Object has no function ", zzapVar.zzi()));
        }
        zzh.zzh("hasOwnProperty", 1, list);
        return zzalVar.zzt(zzgVar.zzb((zzap) list.get(0)).zzi()) ? zzap.zzk : zzap.zzl;
    }

    public static Iterator zzb(Map map) {
        return new zzak(map.keySet().iterator());
    }
}
