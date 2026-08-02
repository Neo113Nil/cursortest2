package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
final class zzvu extends zzvy {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* synthetic */ zzvu(zzvt zzvtVar) {
        super(null);
    }

    private static <L> List<L> zzf(Object obj, long j11, int i11) {
        List<L> list = (List) zzxy.zzf(obj, j11);
        if (list.isEmpty()) {
            List<L> zzvrVar = list instanceof zzvs ? new zzvr(i11) : ((list instanceof zzws) && (list instanceof zzvh)) ? ((zzvh) list).zzd(i11) : new ArrayList<>(i11);
            zzxy.zzs(obj, j11, zzvrVar);
            return zzvrVar;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i11);
            arrayList.addAll(list);
            zzxy.zzs(obj, j11, arrayList);
            return arrayList;
        }
        if (list instanceof zzxt) {
            zzvr zzvrVar2 = new zzvr(list.size() + i11);
            zzvrVar2.addAll(zzvrVar2.size(), (zzxt) list);
            zzxy.zzs(obj, j11, zzvrVar2);
            return zzvrVar2;
        }
        if ((list instanceof zzws) && (list instanceof zzvh)) {
            zzvh zzvhVar = (zzvh) list;
            if (!zzvhVar.zzc()) {
                zzvh zzd = zzvhVar.zzd(list.size() + i11);
                zzxy.zzs(obj, j11, zzd);
                return zzd;
            }
        }
        return list;
    }

    @Override // com.google.android.gms.internal.gtm.zzvy
    final <L> List<L> zza(Object obj, long j11) {
        return zzf(obj, j11, 10);
    }

    @Override // com.google.android.gms.internal.gtm.zzvy
    final void zzb(Object obj, long j11) {
        Object unmodifiableList;
        List list = (List) zzxy.zzf(obj, j11);
        if (list instanceof zzvs) {
            unmodifiableList = ((zzvs) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzws) && (list instanceof zzvh)) {
                zzvh zzvhVar = (zzvh) list;
                if (zzvhVar.zzc()) {
                    zzvhVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzxy.zzs(obj, j11, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.gtm.zzvy
    final <E> void zzc(Object obj, Object obj2, long j11) {
        List list = (List) zzxy.zzf(obj2, j11);
        List zzf = zzf(obj, j11, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzxy.zzs(obj, j11, list);
    }

    private zzvu() {
        super(null);
    }
}
