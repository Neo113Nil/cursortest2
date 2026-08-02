package com.google.android.gms.internal.ads;

import defpackage.rco;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgfq implements zzgfo {
    public final Executor a;
    public final PriorityQueue b = new PriorityQueue();

    public zzgfq(Executor executor) {
        this.a = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final void a(long j, Runnable runnable) {
        if (j <= 0) {
            this.a.execute(runnable);
            return;
        }
        rco rcoVar = new rco(System.currentTimeMillis() + j, runnable);
        PriorityQueue priorityQueue = this.b;
        synchronized (priorityQueue) {
            priorityQueue.add(rcoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final void zzb() {
        PriorityQueue priorityQueue = this.b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long currentTimeMillis = System.currentTimeMillis();
                for (rco rcoVar = (rco) priorityQueue.peek(); rcoVar != null && rcoVar.b <= currentTimeMillis; rcoVar = (rco) priorityQueue.peek()) {
                    priorityQueue2.add(rcoVar);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.a.execute(((rco) it.next()).a);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
