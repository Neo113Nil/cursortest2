package defpackage;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class ezh extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public b98 t;
    public int u;
    public final /* synthetic */ usf v;
    public ArrayList w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezh(usf usfVar, rq3 rq3Var) {
        super(rq3Var);
        this.v = usfVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}
