package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x3e extends sq3 {
    public Object A;
    public Collection B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ z3e F;
    public int G;
    public Function2 r;
    public z3e s;
    public sfb t;
    public Collection u;
    public Iterator v;
    public zvj w;
    public List x;
    public List y;
    public Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3e(z3e z3eVar, sq3 sq3Var) {
        super(sq3Var);
        this.F = z3eVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, this);
    }
}
