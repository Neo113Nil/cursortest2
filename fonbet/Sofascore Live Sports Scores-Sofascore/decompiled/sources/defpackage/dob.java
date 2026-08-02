package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class dob implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eob b;

    public /* synthetic */ dob(eob eobVar, int i) {
        this.a = i;
        this.b = eobVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        eob eobVar = this.b;
        switch (i) {
            case 0:
                eobVar.m1();
                return Unit.a;
            case 1:
                return new dnd(eobVar.C);
            default:
                dma dmaVar = (dma) ((eoh) eobVar.A).getValue();
                return new dnd(dmaVar != null ? dmaVar.P(0L) : 9205357640488583168L);
        }
    }
}
