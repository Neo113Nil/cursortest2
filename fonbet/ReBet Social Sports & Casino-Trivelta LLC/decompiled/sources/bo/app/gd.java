package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gd implements dd {
    public static final String b(nb nbVar) {
        return "Shutdown sync got success response: " + nbVar;
    }

    @Override // bo.app.dd
    public final void a(final nb apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.K2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.gd.b(bo.app.nb.this);
            }
        }, 7, (Object) null);
    }

    public static final String b(j jVar) {
        return "Shutdown sync got error response: " + jVar;
    }

    @Override // bo.app.dd
    public final void a(final j apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.L2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.gd.b(bo.app.j.this);
            }
        }, 7, (Object) null);
    }
}
