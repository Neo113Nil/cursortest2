package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b57 extends sq3 {
    public ArrayList r;
    public mj7 s;
    public /* synthetic */ Object t;
    public final /* synthetic */ e57 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b57(e57 e57Var, sq3 sq3Var) {
        super(sq3Var);
        this.u = e57Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.t(this);
    }
}
