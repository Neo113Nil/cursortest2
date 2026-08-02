package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgwk extends zzgwf {
    public final zzgwk zzb(Object obj, Object... objArr) {
        List asList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = asList.iterator();
            StringBuilder sb = new StringBuilder(X3.j.d);
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z = false;
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = asList.iterator();
        if (it2.hasNext()) {
            zzgvu zzgvuVar = (zzgvu) zza().get(obj);
            if (zzgvuVar == null) {
                zzgvuVar = zzgwj.zzt(asList instanceof Set ? Math.max(4, ((Set) asList).size()) : 4);
                zza().put(obj, zzgvuVar);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                zzguv.zza(obj, next);
                zzgvuVar.zzd(next);
            }
        }
        return this;
    }

    public final zzgwm zzc() {
        Map map = this.zza;
        if (map == null) {
            return zzgvn.zza;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return zzgvn.zza;
        }
        zzgwb zzgwbVar = new zzgwb(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            zzgwj zzp = zzgwj.zzp(((zzgwi) entry.getValue()).zzh());
            if (!zzp.isEmpty()) {
                zzgwbVar.zza(key, zzp);
                i += zzp.size();
            }
        }
        return new zzgwm(zzgwbVar.zzc(), i, null);
    }
}
