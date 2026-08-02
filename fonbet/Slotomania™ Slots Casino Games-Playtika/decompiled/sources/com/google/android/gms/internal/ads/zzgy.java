package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzgy {
    private final zzgx zza;
    private final ArrayDeque zzb = new ArrayDeque();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;
    private zzgw zzf;

    public zzgy(zzgx zzgxVar) {
        this.zza = zzgxVar;
    }

    private final void zzf(int i) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.zzd;
            if (priorityQueue.size() <= i) {
                return;
            }
            zzgw zzgwVar = (zzgw) priorityQueue.poll();
            String str = zzfk.zza;
            int i2 = 0;
            while (true) {
                list = zzgwVar.zza;
                if (i2 >= list.size()) {
                    break;
                }
                this.zza.zza(zzgwVar.zzb, (zzes) list.get(i2));
                this.zzb.push((zzes) list.get(i2));
                i2++;
            }
            list.clear();
            zzgw zzgwVar2 = this.zzf;
            if (zzgwVar2 != null && zzgwVar2.zzb == zzgwVar.zzb) {
                this.zzf = null;
            }
            this.zzc.push(zzgwVar);
        }
    }

    public final void zza(int i) {
        zzgsw.zzi(i >= 0);
        this.zze = i;
        zzf(i);
    }

    public final int zzb() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r7 < r0.zzb) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(long j, zzes zzesVar) {
        if (j != C.TIME_UNSET) {
            int i = this.zze;
            if (i != 0) {
                if (i != -1) {
                    PriorityQueue priorityQueue = this.zzd;
                    if (priorityQueue.size() >= this.zze) {
                        zzgw zzgwVar = (zzgw) priorityQueue.peek();
                        String str = zzfk.zza;
                    }
                }
                ArrayDeque arrayDeque = this.zzb;
                zzes zzesVar2 = arrayDeque.isEmpty() ? new zzes() : (zzes) arrayDeque.pop();
                zzesVar2.zza(zzesVar.zzd());
                System.arraycopy(zzesVar.zzi(), zzesVar.zzg(), zzesVar2.zzi(), 0, zzesVar2.zzd());
                zzgw zzgwVar2 = this.zzf;
                if (zzgwVar2 != null && j == zzgwVar2.zzb) {
                    zzgwVar2.zza.add(zzesVar2);
                    return;
                }
                ArrayDeque arrayDeque2 = this.zzc;
                zzgw zzgwVar3 = arrayDeque2.isEmpty() ? new zzgw() : (zzgw) arrayDeque2.pop();
                List list = zzgwVar3.zza;
                zzgsw.zzi(list.isEmpty());
                zzgwVar3.zzb = j;
                list.add(zzesVar2);
                this.zzd.add(zzgwVar3);
                this.zzf = zzgwVar3;
                int i2 = this.zze;
                if (i2 != -1) {
                    zzf(i2);
                    return;
                }
                return;
            }
        } else {
            j = -9223372036854775807L;
        }
        this.zza.zza(j, zzesVar);
    }

    public final void zzd() {
        this.zzd.clear();
    }

    public final void zze() {
        zzf(0);
    }
}
