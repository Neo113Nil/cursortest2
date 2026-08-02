package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzpk {
    private final zzbd zza;
    private zzgvz zzb = zzgvz.zzi();
    private zzgwc zzc = zzgwc.zza();
    private zzxc zzd;
    private zzxc zze;
    private zzxc zzf;

    public zzpk(zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    private final void zzj(zzbf zzbfVar) {
        zzgwb zzgwbVar = new zzgwb();
        if (this.zzb.isEmpty()) {
            zzk(zzgwbVar, this.zze, zzbfVar);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzgwbVar, this.zzf, zzbfVar);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzgwbVar, this.zzd, zzbfVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzgwbVar, (zzxc) this.zzb.get(i), zzbfVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgwbVar, this.zzd, zzbfVar);
            }
        }
        this.zzc = zzgwbVar.zzc();
    }

    private final void zzk(zzgwb zzgwbVar, zzxc zzxcVar, zzbf zzbfVar) {
        if (zzxcVar == null) {
            return;
        }
        if (zzbfVar.zze(zzxcVar.zza) != -1) {
            zzgwbVar.zza(zzxcVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) this.zzc.get(zzxcVar);
        if (zzbfVar2 != null) {
            zzgwbVar.zza(zzxcVar, zzbfVar2);
        }
    }

    private static zzxc zzl(zzbb zzbbVar, zzgvz zzgvzVar, zzxc zzxcVar, zzbd zzbdVar) {
        zzbf zzq = zzbbVar.zzq();
        int zzr = zzbbVar.zzr();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzr);
        int i = -1;
        if (!zzbbVar.zzx() && !zzq.zzg()) {
            i = zzq.zzd(zzr, zzbdVar, false).zzf(zzfk.zzs(zzbbVar.zzu()));
        }
        int i2 = i;
        for (int i3 = 0; i3 < zzgvzVar.size(); i3++) {
            zzxc zzxcVar2 = (zzxc) zzgvzVar.get(i3);
            if (zzm(zzxcVar2, zzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i2)) {
                return zzxcVar2;
            }
        }
        if (zzgvzVar.isEmpty() && zzxcVar != null && zzm(zzxcVar, zzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i2)) {
            return zzxcVar;
        }
        return null;
    }

    private static boolean zzm(zzxc zzxcVar, Object obj, boolean z, int i, int i2, int i3) {
        if (zzxcVar.zza.equals(obj)) {
            return z ? zzxcVar.zzb == i && zzxcVar.zzc == i2 : zzxcVar.zzb == -1 && zzxcVar.zze == i3;
        }
        return false;
    }

    public final zzxc zza() {
        return this.zzd;
    }

    public final zzxc zzb() {
        return this.zze;
    }

    public final zzxc zzc() {
        return this.zzf;
    }

    public final zzxc zzd() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        List list = this.zzb;
        if (list instanceof List) {
            List list2 = list;
            if (list2.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = list2.get(list2.size() - 1);
        } else if (list instanceof SortedSet) {
            obj = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzxc) obj;
    }

    public final zzbf zze(zzxc zzxcVar) {
        return (zzbf) this.zzc.get(zzxcVar);
    }

    public final void zzf(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        zzj(zzbbVar.zzq());
    }

    public final void zzh(List list, zzxc zzxcVar, zzbb zzbbVar) {
        this.zzb = zzgvz.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (zzxc) list.get(0);
            zzxcVar.getClass();
            this.zzf = zzxcVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbbVar.zzq());
    }

    final /* synthetic */ zzgvz zzi() {
        return this.zzb;
    }
}
