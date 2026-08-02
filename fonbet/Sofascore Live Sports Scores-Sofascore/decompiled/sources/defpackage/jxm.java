package defpackage;

import defpackage.gim;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jxm extends sq3 {
    public w3m r;
    public gim.e s;
    public /* synthetic */ Object t;
    public final /* synthetic */ w3m u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxm(w3m w3mVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = w3mVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return w3m.X(this.u, null, null, false, this);
    }
}
