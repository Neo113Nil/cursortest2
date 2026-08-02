package bo.app;

import bo.app.p0;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B1\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\u0006R\u0014\u0010\u0013\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0012¨\u0006\u001f"}, d2 = {"Lbo/app/f;", "Lbo/app/f2;", "Lkotlinx/coroutines/Job;", "c", "Lbo/app/a2;", "request", "", Constants.BRAZE_PUSH_CONTENT_KEY, "b", "Lbo/app/x1;", "event", "Lbo/app/h2;", "internalEventPublisher", "Lbo/app/o5;", JsonStorageKeyNames.SESSION_ID_KEY, "eventMessenger", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Lbo/app/j0;", "()Lbo/app/j0;", "dataSyncRequest", "Lcom/braze/configuration/BrazeConfigurationProvider;", "appConfigurationProvider", "internalIEventMessenger", "Lbo/app/n2;", "requestExecutor", "Lbo/app/r0;", "dispatchManager", "", "mockAllNetworkRequests", "<init>", "(Lcom/braze/configuration/BrazeConfigurationProvider;Lbo/app/h2;Lbo/app/n2;Lbo/app/r0;Z)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class f implements f2 {
    public static final a i = new a(null);
    private static final String j = BrazeLogger.getBrazeLogTag((Class<?>) f.class);
    private final BrazeConfigurationProvider a;
    private final n2 b;
    private final r0 c;
    private final boolean d;
    private final ReentrantLock e;
    private final t0 f;
    private volatile boolean g;
    private volatile Job h;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbo/app/f$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[p0.b.values().length];
            iArr[p0.b.ADD_PENDING_BRAZE_EVENT.ordinal()] = 1;
            iArr[p0.b.ADD_BRAZE_EVENT.ordinal()] = 2;
            iArr[p0.b.FLUSH_PENDING_BRAZE_EVENTS.ordinal()] = 3;
            iArr[p0.b.ADD_REQUEST.ordinal()] = 4;
            a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.dispatch.AutomaticDispatchDecorator$kickoffDispatchJob$1", f = "AutomaticDispatchDecorator.kt", i = {0}, l = {140}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        private /* synthetic */ Object c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ Exception b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Exception exc) {
                super(0);
                this.b = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Automatic thread interrupted! This is usually the result of calling changeUser(). [" + this.b + AbstractJsonLexerKt.END_LIST;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = f.this.new c(continuation);
            cVar.c = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[Catch: Exception -> 0x0042, TRY_ENTER, TryCatch #0 {Exception -> 0x0042, blocks: (B:6:0x000f, B:7:0x003a, B:10:0x0029), top: B:5:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:7:0x003a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.c;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.c;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    BrazeLogger.INSTANCE.brazelog(f.j, BrazeLogger.Priority.V, (Throwable) e, (Function0<String>) new a(e));
                }
                f.this.a((a2) obj);
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    r0 r0Var = f.this.c;
                    this.c = coroutineScope;
                    this.b = 1;
                    obj = r0Var.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    f.this.a((a2) obj);
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Automatic request execution start was previously requested, continuing without action.";
        }
    }

    public f(BrazeConfigurationProvider appConfigurationProvider, final h2 internalIEventMessenger, n2 requestExecutor, r0 dispatchManager, boolean z) {
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "internalIEventMessenger");
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(dispatchManager, "dispatchManager");
        this.a = appConfigurationProvider;
        this.b = requestExecutor;
        this.c = dispatchManager;
        this.d = z;
        this.e = new ReentrantLock();
        this.f = new t0(internalIEventMessenger, z);
        internalIEventMessenger.b(p0.class, new IEventSubscriber() { // from class: bo.app.f$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f.a(f.this, internalIEventMessenger, (p0) obj);
            }
        });
    }

    private final j0 b() {
        return new j0(this.a.getBaseUrlForRequests(), null, 2, null);
    }

    private final Job c() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new c(null), 3, null);
        return launch$default;
    }

    public final void d() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.g) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, j, (BrazeLogger.Priority) null, (Throwable) null, (Function0) d.b, 6, (Object) null);
                return;
            }
            this.h = c();
            this.g = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void b(x1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.c.b(event);
    }

    private final void b(a2 request) {
        if (!request.getT() && !this.d) {
            this.b.a(request);
        } else {
            this.f.a(request);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f this$0, h2 internalIEventMessenger, p0 dstr$commandType$brazeEvent$sessionId$brazeRequest) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "$internalIEventMessenger");
        Intrinsics.checkNotNullParameter(dstr$commandType$brazeEvent$sessionId$brazeRequest, "$dstr$commandType$brazeEvent$sessionId$brazeRequest");
        p0.b a2 = dstr$commandType$brazeEvent$sessionId$brazeRequest.getA();
        x1 b2 = dstr$commandType$brazeEvent$sessionId$brazeRequest.getB();
        o5 c2 = dstr$commandType$brazeEvent$sessionId$brazeRequest.getC();
        a2 d2 = dstr$commandType$brazeEvent$sessionId$brazeRequest.getD();
        int i2 = b.a[a2.ordinal()];
        if (i2 == 1) {
            if (b2 == null) {
                return;
            }
            this$0.b(b2);
        } else if (i2 == 2) {
            if (b2 == null) {
                return;
            }
            this$0.a(b2);
        } else if (i2 == 3) {
            if (c2 == null) {
                return;
            }
            this$0.a(c2);
        } else if (i2 == 4 && d2 != null) {
            this$0.a(internalIEventMessenger, d2);
        }
    }

    @Override // bo.app.f2
    public void a(x1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.c.a(event);
    }

    public void a(h2 internalEventPublisher, a2 request) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(request, "request");
        this.c.a(internalEventPublisher, request);
    }

    public void a(o5 sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.c.a(sessionId);
    }

    public final void a(h2 eventMessenger) {
        Intrinsics.checkNotNullParameter(eventMessenger, "eventMessenger");
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            Job job = this.h;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.h = null;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (!this.c.b()) {
                this.c.a(eventMessenger, b());
            }
            a2 d2 = this.c.d();
            if (d2 != null) {
                b(d2);
            }
            eventMessenger.a();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(a2 request) {
        if (!request.getT() && !this.d) {
            this.b.b(request);
        } else {
            this.f.b(request);
        }
    }
}
