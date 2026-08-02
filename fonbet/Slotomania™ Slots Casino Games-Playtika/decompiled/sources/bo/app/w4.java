package bo.app;

import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u001a"}, d2 = {"Lbo/app/w4;", "Lbo/app/n2;", "Lbo/app/a2;", "brazeRequest", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/m2;", "request", "b", "Lbo/app/i2;", "httpConnector", "Lbo/app/h2;", "internalEventPublisher", "externalEventPublisher", "Lbo/app/m1;", "feedStorageProvider", "Lbo/app/k5;", "serverConfigStorageProvider", "Lbo/app/b0;", "contentCardsStorageProvider", "Lbo/app/z1;", "brazeManager", "Lbo/app/u0;", "endpointMetadataProvider", "<init>", "(Lbo/app/i2;Lbo/app/h2;Lbo/app/h2;Lbo/app/m1;Lbo/app/k5;Lbo/app/b0;Lbo/app/z1;Lbo/app/u0;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class w4 implements n2 {
    private final i2 a;
    private final h2 b;
    private final h2 c;
    private final m1 d;
    private final k5 e;
    private final b0 f;
    private final z1 g;
    private final u0 h;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Request is null. Cannot execute request.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.requests.RequestExecutor$execute$2", f = "RequestExecutor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        final /* synthetic */ a2 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a2 a2Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = a2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w4.this.new b(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            w4.this.a(this.d);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Request is null. Cannot execute request.";
        }
    }

    public w4(i2 httpConnector, h2 internalEventPublisher, h2 externalEventPublisher, m1 feedStorageProvider, k5 serverConfigStorageProvider, b0 contentCardsStorageProvider, z1 brazeManager, u0 endpointMetadataProvider) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(feedStorageProvider, "feedStorageProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(contentCardsStorageProvider, "contentCardsStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(endpointMetadataProvider, "endpointMetadataProvider");
        this.a = httpConnector;
        this.b = internalEventPublisher;
        this.c = externalEventPublisher;
        this.d = feedStorageProvider;
        this.e = serverConfigStorageProvider;
        this.f = contentCardsStorageProvider;
        this.g = brazeManager;
        this.h = endpointMetadataProvider;
    }

    @Override // bo.app.n2
    public void b(m2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        a2 a2Var = request instanceof a2 ? (a2) request : null;
        if (a2Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new b(a2Var, null), 3, null);
        }
    }

    @Override // bo.app.n2
    public void a(m2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        a2 a2Var = request instanceof a2 ? (a2) request : null;
        if (a2Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
        } else {
            a(a2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(a2 brazeRequest) {
        new t(brazeRequest, this.a, this.b, this.c, this.d, this.g, this.e, this.f, this.h).c();
    }
}
