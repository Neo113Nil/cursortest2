package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nx7 extends sq3 {
    public List r;
    public Set s;
    public List t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ qx7 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx7(qx7 qx7Var, sq3 sq3Var) {
        super(sq3Var);
        this.w = qx7Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.d(null, this);
    }
}
