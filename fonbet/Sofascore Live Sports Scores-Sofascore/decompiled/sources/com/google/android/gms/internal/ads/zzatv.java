package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzatv {
    public final AtomicInteger a;
    public final HashSet b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final zzauo e;
    public final zzauh f;
    public final zzatm[] g;
    public zzate h;
    public final ArrayList i;
    public final ArrayList j;
    public final zzatj k;

    public zzatv(zzauo zzauoVar, zzauh zzauhVar) {
        zzatj zzatjVar = new zzatj(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.e = zzauoVar;
        this.f = zzauhVar;
        this.g = new zzatm[4];
        this.k = zzatjVar;
    }

    public final void a() {
        zzate zzateVar = this.h;
        if (zzateVar != null) {
            zzateVar.d = true;
            zzateVar.interrupt();
        }
        zzatm[] zzatmVarArr = this.g;
        for (int i = 0; i < 4; i++) {
            zzatm zzatmVar = zzatmVarArr[i];
            if (zzatmVar != null) {
                zzatmVar.d = true;
                zzatmVar.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.c;
        PriorityBlockingQueue priorityBlockingQueue2 = this.d;
        zzauo zzauoVar = this.e;
        zzatj zzatjVar = this.k;
        zzate zzateVar2 = new zzate(priorityBlockingQueue, priorityBlockingQueue2, zzauoVar, zzatjVar);
        this.h = zzateVar2;
        zzateVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzatm zzatmVar2 = new zzatm(priorityBlockingQueue2, this.f, zzauoVar, zzatjVar);
            zzatmVarArr[i2] = zzatmVar2;
            zzatmVar2.start();
        }
    }

    public final void b(zzats zzatsVar) {
        zzatsVar.zzf(this);
        HashSet hashSet = this.b;
        synchronized (hashSet) {
            hashSet.add(zzatsVar);
        }
        zzatsVar.zzg(this.a.incrementAndGet());
        zzatsVar.zzc("add-to-queue");
        c();
        this.c.add(zzatsVar);
    }

    public final void c() {
        ArrayList arrayList = this.j;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzatt) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
