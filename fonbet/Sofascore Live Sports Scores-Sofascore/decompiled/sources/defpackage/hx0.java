package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hx0 extends sq3 {
    public za4 r;
    public String s;
    public Function1 t;
    public AtomicBoolean u;
    public ln2 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ za4 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx0(za4 za4Var, rq3 rq3Var) {
        super(rq3Var);
        this.x = za4Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.a(null, null, this);
    }
}
