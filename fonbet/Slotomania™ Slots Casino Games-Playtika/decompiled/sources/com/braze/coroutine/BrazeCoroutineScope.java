package com.braze.coroutine;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import io.sentry.SentryEvent;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0001J>\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/braze/coroutine/BrazeCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "cancelChildren", "", "launchDelayed", "Lkotlinx/coroutines/Job;", "startDelayInMs", "", "specificContext", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/Number;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrazeCoroutineScope implements CoroutineScope {
    public static final BrazeCoroutineScope INSTANCE = new BrazeCoroutineScope();
    private static final CoroutineContext coroutineContext;
    private static final CoroutineExceptionHandler exceptionHandler;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cancelling children of BrazeCoroutineScope";
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
            return Intrinsics.stringPlus("Child job of BrazeCoroutineScope got exception: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.coroutine.BrazeCoroutineScope$launchDelayed$1", f = "BrazeCoroutineScope.kt", i = {0}, l = {52, 55}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ Number d;
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Number number, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = number;
            this.e = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.d, this.e, continuation);
            cVar.c = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        
            if (r7.invoke(r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(r4, r6) == r0) goto L17;
         */
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
                long longValue = this.d.longValue();
                this.c = coroutineScope;
                this.b = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
            }
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                Function1<Continuation<? super Unit>, Object> function1 = this.e;
                this.c = null;
                this.b = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", SentryEvent.JsonKeys.EXCEPTION, "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public d(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            BrazeLogger.INSTANCE.brazelog(BrazeCoroutineScope.INSTANCE, BrazeLogger.Priority.E, exception, new b(exception));
        }
    }

    static {
        d dVar = new d(CoroutineExceptionHandler.INSTANCE);
        exceptionHandler = dVar;
        coroutineContext = Dispatchers.getIO().plus(dVar).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
    }

    private BrazeCoroutineScope() {
    }

    @JvmStatic
    public static final void cancelChildren() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeCoroutineScope brazeCoroutineScope = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeCoroutineScope, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
        JobKt__JobKt.cancelChildren$default(brazeCoroutineScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    public static /* synthetic */ Job launchDelayed$default(BrazeCoroutineScope brazeCoroutineScope, Number number, CoroutineContext coroutineContext2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineContext2 = brazeCoroutineScope.getCoroutineContext();
        }
        return brazeCoroutineScope.launchDelayed(number, coroutineContext2, function1);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return coroutineContext;
    }

    public final Job launchDelayed(Number startDelayInMs, CoroutineContext specificContext, Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(startDelayInMs, "startDelayInMs");
        Intrinsics.checkNotNullParameter(specificContext, "specificContext");
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this, specificContext, null, new c(startDelayInMs, block, null), 2, null);
        return launch$default;
    }
}
