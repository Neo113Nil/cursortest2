package defpackage;

import kotlin.collections.IndexedValue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uf2 extends sq3 {
    public IndexedValue r;
    public /* synthetic */ Object s;
    public final /* synthetic */ f10 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf2(f10 f10Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = f10Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.e(null, this);
    }
}
