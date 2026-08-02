package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class fu8 extends ot8 implements Function1 {
    public fu8(yql yqlVar) {
        super(1, 0, yql.class, yqlVar, "onPlayerFirstFrameRendered", "onPlayerFirstFrameRendered(Ljava/lang/String;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((yql) this.receiver).a();
        return Unit.a;
    }
}
