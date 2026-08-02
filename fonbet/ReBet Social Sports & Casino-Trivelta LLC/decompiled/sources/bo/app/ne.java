package bo.app;

import Ph.AbstractC1481v0;
import Ph.G0;
import Ph.M;
import Ph.P;
import Ph.X0;
import bo.app.ne;
import com.braze.support.BrazeLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ne implements P {

    /* renamed from: a, reason: collision with root package name */
    public static final ne f25833a = new ne();

    /* renamed from: b, reason: collision with root package name */
    public static r7 f25834b;

    /* renamed from: c, reason: collision with root package name */
    public static final CoroutineContext f25835c;

    static {
        me meVar = new me(M.f9041T2);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f25835c = AbstractC1481v0.c(newSingleThreadExecutor).plus(meVar).plus(X0.b(null, 1, null));
    }

    public static final String b() {
        return "Cancelling children of SerialCoroutineScope";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.T6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ne.b();
            }
        }, 6, (Object) null);
        G0.j(f25835c, null, 1, null);
    }

    @Override // Ph.P
    public final CoroutineContext getCoroutineContext() {
        return f25835c;
    }
}
