package defpackage;

import com.google.android.gms.internal.ads.zzhbr;
import com.mbridge.msdk.foundation.controller.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class clo extends w3a {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(flo.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(flo.class, flo.class, "b");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(glo.class, flo.class, a.q);
    public static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(glo.class, zko.class, "b");
    public static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(glo.class, Object.class, "a");

    @Override // defpackage.w3a
    public final void X(flo floVar, Thread thread) {
        h.lazySet(floVar, thread);
    }

    @Override // defpackage.w3a
    public final void Y(flo floVar, flo floVar2) {
        i.lazySet(floVar, floVar2);
    }

    @Override // defpackage.w3a
    public final boolean Z(glo gloVar, flo floVar, flo floVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = j;
            if (atomicReferenceFieldUpdater.compareAndSet(gloVar, floVar, floVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gloVar) == floVar);
        return false;
    }

    @Override // defpackage.w3a
    public final boolean a0(zzhbr zzhbrVar, zko zkoVar, zko zkoVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = k;
            if (atomicReferenceFieldUpdater.compareAndSet(zzhbrVar, zkoVar, zkoVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(zzhbrVar) == zkoVar);
        return false;
    }

    @Override // defpackage.w3a
    public final flo b0(zzhbr zzhbrVar) {
        return (flo) j.getAndSet(zzhbrVar, flo.c);
    }

    @Override // defpackage.w3a
    public final zko d0(zzhbr zzhbrVar) {
        return (zko) k.getAndSet(zzhbrVar, zko.d);
    }

    @Override // defpackage.w3a
    public final boolean e0(glo gloVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = l;
            if (atomicReferenceFieldUpdater.compareAndSet(gloVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gloVar) == obj);
        return false;
    }
}
