package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class udd extends xka implements Function0 {
    public final /* synthetic */ wdd i;
    public final /* synthetic */ wtc j;
    public final /* synthetic */ sdd k;
    public final /* synthetic */ long l;
    public final /* synthetic */ jc9 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ float p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udd(wdd wddVar, wtc wtcVar, sdd sddVar, long j, jc9 jc9Var, int i, boolean z, float f, boolean z2) {
        super(0);
        this.i = wddVar;
        this.j = wtcVar;
        this.k = sddVar;
        this.l = j;
        this.m = jc9Var;
        this.n = i;
        this.o = z;
        this.p = f;
        this.q = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.i.s1(bea.E(this.j, this.k.b()), this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        return Unit.a;
    }
}
