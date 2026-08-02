package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class rwg extends sq3 {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object r;
    public int s;
    public b98 t;
    public int u;
    public final /* synthetic */ m70 v;
    public Collection w;
    public Iterator x;
    public Object y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwg(m70 m70Var, rq3 rq3Var) {
        super(rq3Var);
        this.v = m70Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}
