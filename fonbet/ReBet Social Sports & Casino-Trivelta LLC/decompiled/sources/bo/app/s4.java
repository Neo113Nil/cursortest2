package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s4 extends c7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(final c9 destination, q5 dispatchDataProvider) {
        super(destination, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Fa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.s4.a(bo.app.c9.this);
            }
        }, 7, (Object) null);
    }

    @Override // bo.app.c7
    public final void a(long j10) {
    }

    public static final String a(c9 c9Var) {
        return "Default queue created for dest " + c9Var;
    }
}
