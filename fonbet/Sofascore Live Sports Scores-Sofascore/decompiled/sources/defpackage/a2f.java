package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a2f extends xka implements Function0 {
    public final /* synthetic */ esf i;
    public final /* synthetic */ b2f j;
    public final /* synthetic */ x6a k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2f(esf esfVar, b2f b2fVar, x6a x6aVar, long j, long j2) {
        super(0);
        this.i = esfVar;
        this.j = b2fVar;
        this.k = x6aVar;
        this.l = j;
        this.m = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b2f b2fVar = this.j;
        this.i.a = b2fVar.getPositionProvider().a(this.k, this.l, b2fVar.getParentLayoutDirection(), this.m);
        return Unit.a;
    }
}
