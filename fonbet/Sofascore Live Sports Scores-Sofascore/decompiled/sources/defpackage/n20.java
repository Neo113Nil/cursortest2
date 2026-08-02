package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n20 extends xka implements Function0 {
    public final /* synthetic */ b2f i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ g2f k;
    public final /* synthetic */ String l;
    public final /* synthetic */ ema m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(b2f b2fVar, Function0 function0, g2f g2fVar, String str, ema emaVar) {
        super(0);
        this.i = b2fVar;
        this.j = function0;
        this.k = g2fVar;
        this.l = str;
        this.m = emaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.i.n(this.j, this.k, this.l, this.m);
        return Unit.a;
    }
}
