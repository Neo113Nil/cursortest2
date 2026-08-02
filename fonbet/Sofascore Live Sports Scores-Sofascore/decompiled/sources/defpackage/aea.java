package defpackage;

import kotlin.Unit;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class aea extends kea implements xa3 {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aea(yda ydaVar) {
        super(true);
        boolean z = true;
        R(ydaVar);
        Unsafe unsafe = rh0.a;
        long j = kea.a;
        jt2 jt2Var = (jt2) unsafe.getObjectVolatile(this, j);
        kt2 kt2Var = jt2Var instanceof kt2 ? (kt2) jt2Var : null;
        if (kt2Var != null) {
            kea k = kt2Var.k();
            while (!k.J()) {
                jt2 jt2Var2 = (jt2) rh0.a.getObjectVolatile(k, j);
                kt2 kt2Var2 = jt2Var2 instanceof kt2 ? (kt2) jt2Var2 : null;
                if (kt2Var2 != null) {
                    k = kt2Var2.k();
                }
            }
            this.d = z;
        }
        z = false;
        this.d = z;
    }

    @Override // defpackage.kea
    public final boolean J() {
        return this.d;
    }

    @Override // defpackage.kea
    public final boolean L() {
        return true;
    }

    public final boolean j0() {
        return V(Unit.a);
    }
}
