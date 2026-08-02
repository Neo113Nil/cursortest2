package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y4l extends sq3 {
    public List r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ y57 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4l(y57 y57Var, sq3 sq3Var) {
        super(sq3Var);
        this.u = y57Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(null, this);
    }
}
