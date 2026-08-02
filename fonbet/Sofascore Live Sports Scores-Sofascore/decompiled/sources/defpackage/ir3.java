package defpackage;

import com.sofascore.model.mvvm.model.Event;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ir3 extends sq3 {
    public Event r;
    public gv9 s;
    public /* synthetic */ Object t;
    public final /* synthetic */ tr3 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir3(tr3 tr3Var, rq3 rq3Var) {
        super(rq3Var);
        this.u = tr3Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.u(this);
    }
}
