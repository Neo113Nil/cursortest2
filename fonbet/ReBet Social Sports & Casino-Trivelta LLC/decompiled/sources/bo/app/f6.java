package bo.app;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class f6 extends FunctionReferenceImpl implements Function1 {
    public f6(g6 g6Var) {
        super(1, g6Var, g6.class, "onConnectionFailed", "onConnectionFailed(Ljava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((g6) this.receiver).a((Integer) obj);
        return Unit.INSTANCE;
    }
}
