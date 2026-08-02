package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uji extends xka implements Function2 {
    public final /* synthetic */ xtc i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uji(xtc xtcVar, Function2 function2, int i, int i2) {
        super(2);
        this.i = xtcVar;
        this.j = function2;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int K = aba.K(this.k | 1);
        int i = this.l;
        rz8.r(this.i, this.j, (of3) obj, K, i);
        return Unit.a;
    }
}
