package defpackage;

import kotlin.collections.IndexedValue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l78 extends sq3 {
    public IndexedValue r;
    public j2d s;
    public /* synthetic */ Object t;
    public final /* synthetic */ b10 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l78(b10 b10Var, sq3 sq3Var) {
        super(sq3Var);
        this.u = b10Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.C(null, this);
    }
}
