package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nf4 extends sq3 {
    public boolean r;
    public Object s;
    public fsf t;
    public Serializable u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ qf4 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf4(qf4 qf4Var, sq3 sq3Var) {
        super(sq3Var);
        this.x = qf4Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.h(false, this);
    }
}
