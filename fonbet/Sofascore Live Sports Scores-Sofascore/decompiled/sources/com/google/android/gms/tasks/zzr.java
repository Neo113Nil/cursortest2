package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzr {
    private final Object zza = new Object();
    private Queue zzb;
    private boolean zzc;

    public final void zza(@NonNull zzq zzqVar) {
        synchronized (this.zza) {
            try {
                Queue queue = this.zzb;
                if (queue == null) {
                    queue = new ArrayDeque();
                    this.zzb = queue;
                }
                queue.add(zzqVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(@NonNull Task task) {
        zzq zzqVar;
        synchronized (this.zza) {
            if (this.zzb != null && !this.zzc) {
                this.zzc = true;
                while (true) {
                    synchronized (this.zza) {
                        try {
                            zzqVar = (zzq) this.zzb.poll();
                            if (zzqVar == null) {
                                this.zzc = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    zzqVar.zza(task);
                }
            }
        }
    }
}
