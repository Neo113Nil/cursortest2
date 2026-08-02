package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j7h extends sq3 {
    public af0 r;
    public Context s;
    public Function1 t;
    public b62 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ af0 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7h(af0 af0Var, sq3 sq3Var) {
        super(sq3Var);
        this.w = af0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.d(null, null, this);
    }
}
