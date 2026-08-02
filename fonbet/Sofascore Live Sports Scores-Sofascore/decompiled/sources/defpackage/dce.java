package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dce extends sq3 {
    public Function1 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ece t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dce(ece eceVar, rq3 rq3Var) {
        super(rq3Var);
        this.t = eceVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.p(null, this);
    }
}
