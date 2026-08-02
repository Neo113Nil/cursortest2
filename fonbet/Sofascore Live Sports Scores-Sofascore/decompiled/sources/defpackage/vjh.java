package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vjh extends xka implements Function2 {
    public final /* synthetic */ long i;
    public final /* synthetic */ ekh j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjh(int i, long j, ekh ekhVar, Function2 function2) {
        super(2);
        this.i = j;
        this.j = ekhVar;
        this.k = function2;
        this.l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        waa.j(this.l | 1, this.i, (of3) obj, this.j, this.k);
        return Unit.a;
    }
}
