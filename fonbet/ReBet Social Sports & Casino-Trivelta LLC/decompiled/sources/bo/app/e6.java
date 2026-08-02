package bo.app;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class e6 extends FunctionReferenceImpl implements Function0 {
    public e6(g6 g6Var) {
        super(0, g6Var, g6.class, "onConnectionSuccess", "onConnectionSuccess()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((g6) this.receiver).g();
        return Unit.INSTANCE;
    }
}
