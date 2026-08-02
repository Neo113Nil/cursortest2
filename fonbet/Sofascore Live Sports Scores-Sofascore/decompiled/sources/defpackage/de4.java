package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class de4 extends sq3 {
    public Serializable r;
    public Iterator s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ug5 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de4(ug5 ug5Var, sq3 sq3Var) {
        super(sq3Var);
        this.u = ug5Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.B(null, null, this);
    }
}
