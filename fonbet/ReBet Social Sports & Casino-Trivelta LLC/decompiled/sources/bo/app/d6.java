package bo.app;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class d6 extends FunctionReferenceImpl implements Function1 {
    public d6(g6 g6Var) {
        super(1, g6Var, g6.class, "ingestDustMessages", "ingestDustMessages$android_sdk_base_release(Lcom/braze/models/dust/IDustMessage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k9 p02 = (k9) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((g6) this.receiver).a(p02);
        return Unit.INSTANCE;
    }
}
