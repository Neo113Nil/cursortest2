package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bf0 extends sq3 {
    public Function2 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ cf0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(cf0 cf0Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = cf0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        this.t.a(null, this);
        return lu3.a;
    }
}
