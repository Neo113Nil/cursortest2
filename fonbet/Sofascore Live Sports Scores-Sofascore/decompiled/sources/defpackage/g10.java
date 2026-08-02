package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class g10 extends ot8 implements Function1 {
    public final /* synthetic */ k5b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g10(k5b k5bVar) {
        super(1, s9a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.b = k5bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((xzb) obj).a;
        dma dmaVar = (dma) ((eoh) this.b.r).getValue();
        if (dmaVar != null) {
            if (!dmaVar.f()) {
                dmaVar = null;
            }
            if (dmaVar != null) {
                dmaVar.z(fArr);
            }
        }
        return Unit.a;
    }
}
