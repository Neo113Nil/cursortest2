package defpackage;

import android.util.SparseBooleanArray;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qse implements wke {
    public final uke a;
    public final Function2 b;
    public final lj2 c;
    public final AtomicBoolean d;

    public qse(uke ukeVar, Function2 function2, lj2 lj2Var) {
        function2.getClass();
        this.a = ukeVar;
        this.b = function2;
        this.c = lj2Var;
        this.d = new AtomicBoolean(false);
    }

    @Override // defpackage.wke
    public final void onEvents(ale aleVar, uke ukeVar) {
        AtomicBoolean atomicBoolean = this.d;
        aleVar.getClass();
        try {
            if (atomicBoolean.get()) {
                return;
            }
            uke ukeVar2 = this.a;
            if (ukeVar2 != null) {
                j78 j78Var = ukeVar.a;
                SparseBooleanArray sparseBooleanArray = ukeVar2.a.a;
                for (int i = 0; i < sparseBooleanArray.size(); i++) {
                    z1a.v(i, sparseBooleanArray.size());
                    if (!j78Var.a.get(sparseBooleanArray.keyAt(i))) {
                    }
                }
                return;
            }
            this.b.invoke(aleVar, ukeVar);
        } catch (Throwable th) {
            atomicBoolean.set(true);
            p2g p2gVar = w2g.b;
            this.c.resumeWith(new u2g(th));
        }
    }
}
