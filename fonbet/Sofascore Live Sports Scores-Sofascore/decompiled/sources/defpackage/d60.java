package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class d60 extends xka implements Function2 {
    public final /* synthetic */ Object i;
    public final /* synthetic */ xtc j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ io l;
    public final /* synthetic */ String m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ tc3 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(Object obj, xtc xtcVar, Function1 function1, io ioVar, String str, Function1 function12, tc3 tc3Var, int i, int i2) {
        super(2);
        this.i = obj;
        this.j = xtcVar;
        this.k = function1;
        this.l = ioVar;
        this.m = str;
        this.n = function12;
        this.o = tc3Var;
        this.p = i;
        this.q = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        l98.b(this.i, this.j, this.k, this.l, this.m, this.n, this.o, (of3) obj, aba.K(this.p | 1), this.q);
        return Unit.a;
    }
}
