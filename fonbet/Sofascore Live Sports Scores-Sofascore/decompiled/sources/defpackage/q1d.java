package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q1d {
    public final AtomicReference a = new AtomicReference(null);
    public final j2d b = new j2d();

    public static Object a(q1d q1dVar, Function1 function1, hoi hoiVar) {
        m1d m1dVar = m1d.a;
        q1dVar.getClass();
        return s9a.r(new ts2(m1dVar, q1dVar, function1, null, 11), hoiVar);
    }

    public final void b(o1d o1dVar) {
        while (true) {
            AtomicReference atomicReference = this.a;
            o1d o1dVar2 = (o1d) atomicReference.get();
            if (o1dVar2 != null && o1dVar.a.compareTo(o1dVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(o1dVar2, o1dVar)) {
                if (atomicReference.get() != o1dVar2) {
                    break;
                }
            }
            if (o1dVar2 != null) {
                o1dVar2.b.e(new s78("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
