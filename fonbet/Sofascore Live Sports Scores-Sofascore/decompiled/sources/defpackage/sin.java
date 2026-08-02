package defpackage;

import com.mbridge.msdk.foundation.controller.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sin extends haa {
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(vin.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(vin.class, vin.class, "b");
    public static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(yin.class, vin.class, a.q);
    public static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(yin.class, jin.class, "b");
    public static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(yin.class, Object.class, "a");

    @Override // defpackage.haa
    public final void P(vin vinVar, Thread thread) {
        i.lazySet(vinVar, thread);
    }

    @Override // defpackage.haa
    public final void R(vin vinVar, vin vinVar2) {
        j.lazySet(vinVar, vinVar2);
    }

    @Override // defpackage.haa
    public final boolean T(yin yinVar, vin vinVar, vin vinVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = k;
            if (atomicReferenceFieldUpdater.compareAndSet(yinVar, vinVar, vinVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(yinVar) == vinVar);
        return false;
    }

    @Override // defpackage.haa
    public final vin U(yin yinVar) {
        return (vin) k.getAndSet(yinVar, vin.c);
    }

    @Override // defpackage.haa
    public final jin W(yin yinVar) {
        return (jin) l.getAndSet(yinVar, jin.b);
    }

    @Override // defpackage.haa
    public final boolean Z(yin yinVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = m;
            if (atomicReferenceFieldUpdater.compareAndSet(yinVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(yinVar) == obj);
        return false;
    }
}
