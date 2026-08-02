package rl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 extends AbstractC7737t implements Function1<lm0.e<Integer>, Unit> {
    public j0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(lm0.e<Integer> eVar) {
        lm0.e<Integer> emitter = eVar;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        emitter.a(new IllegalStateException("AppUpdateInfo object is already used. Call the method getAppUpdateInfo() again"));
        return Unit.f71690a;
    }
}
