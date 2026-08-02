package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r6 implements s9 {

    /* renamed from: a, reason: collision with root package name */
    public final r7 f25975a;

    /* renamed from: b, reason: collision with root package name */
    public final e2 f25976b;

    public r6(r7 internalEventPublisher, e2 brazeManager) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f25975a = internalEventPublisher;
        this.f25976b = brazeManager;
        new ArrayList();
    }

    @Override // bo.app.s9
    public final void a(id requestInfo, dd requestDispatchCallback) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        final d9 d9Var = requestInfo.f25571a;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ia
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.r6.a(bo.app.d9.this);
            }
        }, 7, (Object) null);
        nb nbVar = new nb(d9Var, new n9(201, MapsKt.emptyMap(), 4), this.f25976b);
        r7 r7Var = this.f25975a;
        d9Var.a(r7Var, r7Var, nbVar);
        d9Var.b(this.f25975a);
        requestDispatchCallback.a(nbVar);
        this.f25975a.b(new s5(d9Var), s5.class);
    }

    public static final String a(d9 d9Var) {
        return "Short circuiting execution of network request (" + d9Var.hashCode() + ") and immediately marking it as succeeded.";
    }
}
