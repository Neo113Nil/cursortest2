package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z18 extends k18 implements fml {
    @Override // defpackage.fml
    public final Object c(rq3 rq3Var, Object obj) {
        if (this.c.get()) {
            a70.r("This scope has already been closed.");
            return null;
        }
        Object T = l6g.T(this.a, new as2(this, obj, null), (sq3) rq3Var);
        return T == lu3.a ? T : Unit.a;
    }
}
