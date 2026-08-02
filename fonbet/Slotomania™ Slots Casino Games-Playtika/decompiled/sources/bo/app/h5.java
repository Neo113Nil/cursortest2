package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import io.sentry.SentryEvent;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\u0003\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lbo/app/h5;", "Lkotlinx/coroutines/CoroutineScope;", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()V", "Lbo/app/b1;", "eventPublisher", "Lbo/app/b1;", "b", "()Lbo/app/b1;", "(Lbo/app/b1;)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class h5 implements CoroutineScope {
    public static final h5 a = new h5();
    private static b1 b;
    private static final CoroutineExceptionHandler c;
    private static final ExecutorCoroutineDispatcher d;
    private static final CoroutineContext e;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cancelling children of SerialCoroutineScope";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Throwable th) {
            super(0);
            this.b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Child job of SerialCoroutineScope got exception: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", SentryEvent.JsonKeys.EXCEPTION, "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                h5 h5Var = h5.a;
                brazeLogger.brazelog(h5Var, BrazeLogger.Priority.E, exception, new b(exception));
                b1 b = h5Var.b();
                if (b == null) {
                    return;
                }
                b.a((b1) exception, (Class<b1>) Throwable.class);
            } catch (Exception unused) {
            }
        }
    }

    static {
        c cVar = new c(CoroutineExceptionHandler.INSTANCE);
        c = cVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor()");
        ExecutorCoroutineDispatcher from = ExecutorsKt.from(newSingleThreadExecutor);
        d = from;
        e = from.plus(cVar).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
    }

    private h5() {
    }

    public final void a(b1 b1Var) {
        b = b1Var;
    }

    public final b1 b() {
        return b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return e;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
        JobKt__JobKt.cancelChildren$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }
}
