package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qjh extends xka implements Function1 {
    public final /* synthetic */ rjh i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ m1c m;
    public final /* synthetic */ qhe n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjh(rjh rjhVar, long j, int i, int i2, m1c m1cVar, qhe qheVar) {
        super(1);
        this.i = rjhVar;
        this.j = j;
        this.k = i;
        this.l = i2;
        this.m = m1cVar;
        this.n = qheVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        phe.g((phe) obj, this.n, this.i.q.a(this.j, (this.l & 4294967295L) | (this.k << 32), this.m.getLayoutDirection()));
        return Unit.a;
    }
}
