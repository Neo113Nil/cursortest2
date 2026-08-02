package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n60 extends xka implements Function1 {
    public final /* synthetic */ p60 i;
    public final /* synthetic */ qhe j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(p60 p60Var, qhe qheVar, long j) {
        super(1);
        this.i = p60Var;
        this.j = qheVar;
        this.k = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        io ioVar = this.i.r.b;
        phe.g((phe) obj, this.j, ioVar.a((r0.b & 4294967295L) | (r0.a << 32), this.k, ema.a));
        return Unit.a;
    }
}
