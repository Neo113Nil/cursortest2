package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ir7 extends sq3 {
    public String r;
    public HashSet s;
    public rr7 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ rr7 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir7(rr7 rr7Var, sq3 sq3Var) {
        super(sq3Var);
        this.v = rr7Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.n(null, null, this);
    }
}
