package defpackage;

import com.google.android.gms.internal.pal.zzjn;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rso extends haa {
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;

    public rso(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.i = atomicReferenceFieldUpdater;
        this.j = atomicReferenceFieldUpdater2;
        this.k = atomicReferenceFieldUpdater3;
        this.l = atomicReferenceFieldUpdater4;
        this.m = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.haa
    public final qso O(zzjn zzjnVar) {
        return (qso) this.l.getAndSet(zzjnVar, qso.b);
    }

    @Override // defpackage.haa
    public final uso Q(zzjn zzjnVar) {
        return (uso) this.k.getAndSet(zzjnVar, uso.c);
    }

    @Override // defpackage.haa
    public final void S(uso usoVar, uso usoVar2) {
        this.j.lazySet(usoVar, usoVar2);
    }

    @Override // defpackage.haa
    public final void V(uso usoVar, Thread thread) {
        this.i.lazySet(usoVar, thread);
    }

    @Override // defpackage.haa
    public final boolean X(zzjn zzjnVar, Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(zzjnVar, obj, obj2)) {
                return true;
            }
            if (atomicReferenceFieldUpdater.get(zzjnVar) != obj && atomicReferenceFieldUpdater.get(zzjnVar) != obj) {
                return false;
            }
        }
    }

    @Override // defpackage.haa
    public final boolean Y(zzjn zzjnVar, uso usoVar, uso usoVar2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(zzjnVar, usoVar, usoVar2)) {
                return true;
            }
            if (atomicReferenceFieldUpdater.get(zzjnVar) != usoVar && atomicReferenceFieldUpdater.get(zzjnVar) != usoVar) {
                return false;
            }
        }
    }
}
