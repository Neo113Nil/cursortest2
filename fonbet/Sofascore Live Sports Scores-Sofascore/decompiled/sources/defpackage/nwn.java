package defpackage;

import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcw;
import com.mbridge.msdk.foundation.controller.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nwn extends wca {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(qwn.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(qwn.class, qwn.class, "b");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(twn.class, qwn.class, a.q);
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(twn.class, iwn.class, "b");
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(twn.class, Object.class, "a");

    @Override // defpackage.wca
    public final iwn L(zzcu zzcuVar) {
        return (iwn) f.getAndSet(zzcuVar, iwn.d);
    }

    @Override // defpackage.wca
    public final qwn M(zzcu zzcuVar) {
        return (qwn) e.getAndSet(zzcuVar, qwn.c);
    }

    @Override // defpackage.wca
    public final void N(qwn qwnVar, qwn qwnVar2) {
        d.lazySet(qwnVar, qwnVar2);
    }

    @Override // defpackage.wca
    public final void P(qwn qwnVar, Thread thread) {
        c.lazySet(qwnVar, thread);
    }

    @Override // defpackage.wca
    public final boolean R(zzcu zzcuVar, iwn iwnVar, iwn iwnVar2) {
        return zzcw.a(f, zzcuVar, iwnVar, iwnVar2);
    }

    @Override // defpackage.wca
    public final boolean S(twn twnVar, Object obj, Object obj2) {
        return zzcw.a(g, twnVar, obj, obj2);
    }

    @Override // defpackage.wca
    public final boolean T(twn twnVar, qwn qwnVar, qwn qwnVar2) {
        return zzcw.a(e, twnVar, qwnVar, qwnVar2);
    }
}
