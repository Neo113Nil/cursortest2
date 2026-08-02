package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y3e extends sq3 {
    public Collection A;
    public Collection B;
    public /* synthetic */ Object C;
    public final /* synthetic */ z3e D;
    public int E;
    public Function2 r;
    public z3e s;
    public sfb t;
    public Collection u;
    public Iterator v;
    public zvj w;
    public int[] x;
    public Collection y;
    public Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3e(z3e z3eVar, sq3 sq3Var) {
        super(sq3Var);
        this.D = z3eVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.b(null, this);
    }
}
