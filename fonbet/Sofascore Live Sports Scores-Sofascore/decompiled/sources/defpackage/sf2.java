package defpackage;

import kotlin.collections.IndexedValue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sf2 extends sq3 {
    public IndexedValue r;
    public /* synthetic */ Object s;
    public final /* synthetic */ tf2 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf2(tf2 tf2Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = tf2Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, this);
    }
}
