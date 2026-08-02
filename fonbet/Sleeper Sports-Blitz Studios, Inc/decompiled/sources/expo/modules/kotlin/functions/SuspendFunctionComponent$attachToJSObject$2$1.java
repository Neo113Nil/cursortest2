package expo.modules.kotlin.functions;

import expo.modules.core.errors.CodedException;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.PromiseImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: SuspendFunctionComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.kotlin.functions.SuspendFunctionComponent$attachToJSObject$2$1", f = "SuspendFunctionComponent.kt", i = {0}, l = {47}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u241"}, s = {"L$3"})
/* loaded from: classes9.dex */
final class SuspendFunctionComponent$attachToJSObject$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppContext $appContext;
    final /* synthetic */ Object[] $args;
    final /* synthetic */ String $moduleName;
    final /* synthetic */ PromiseImpl $promiseImpl;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SuspendFunctionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendFunctionComponent$attachToJSObject$2$1(PromiseImpl promiseImpl, SuspendFunctionComponent suspendFunctionComponent, String str, Object[] objArr, AppContext appContext, Continuation<? super SuspendFunctionComponent$attachToJSObject$2$1> continuation) {
        super(2, continuation);
        this.$promiseImpl = promiseImpl;
        this.this$0 = suspendFunctionComponent;
        this.$moduleName = str;
        this.$args = objArr;
        this.$appContext = appContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuspendFunctionComponent$attachToJSObject$2$1 suspendFunctionComponent$attachToJSObject$2$1 = new SuspendFunctionComponent$attachToJSObject$2$1(this.$promiseImpl, this.this$0, this.$moduleName, this.$args, this.$appContext, continuation);
        suspendFunctionComponent$attachToJSObject$2$1.L$0 = obj;
        return suspendFunctionComponent$attachToJSObject$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SuspendFunctionComponent$attachToJSObject$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:18:0x0071, B:20:0x0075, B:22:0x0079, B:23:0x009e, B:24:0x00a9, B:25:0x0093, B:26:0x009b, B:30:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:18:0x0071, B:20:0x0075, B:22:0x0079, B:23:0x009e, B:24:0x00a9, B:25:0x0093, B:26:0x009b, B:30:0x0031), top: B:2:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UnexpectedException unexpectedException;
        SuspendFunctionComponent suspendFunctionComponent;
        CodedException codedException;
        String str;
        Function3 function3;
        CoroutineScope coroutineScope;
        PromiseImpl promiseImpl;
        UnexpectedException unexpectedException2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                suspendFunctionComponent = this.this$0;
                String str2 = this.$moduleName;
                Object[] objArr = this.$args;
                AppContext appContext = this.$appContext;
                PromiseImpl promiseImpl2 = this.$promiseImpl;
                try {
                    SuspendFunctionComponent$attachToJSObject$2$1 suspendFunctionComponent$attachToJSObject$2$1 = this;
                    function3 = suspendFunctionComponent.body;
                    Object[] convertArgs$default = AnyFunction.convertArgs$default(suspendFunctionComponent, objArr, appContext, false, 4, null);
                    this.L$0 = suspendFunctionComponent;
                    this.L$1 = str2;
                    this.L$2 = promiseImpl2;
                    this.L$3 = coroutineScope2;
                    this.label = 1;
                    Object invoke = function3.invoke(coroutineScope2, convertArgs$default, this);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope2;
                    obj = invoke;
                    str = str2;
                    promiseImpl = promiseImpl2;
                } catch (Throwable th) {
                    codedException = th;
                    str = str2;
                    if (!(codedException instanceof expo.modules.kotlin.exception.CodedException)) {
                        unexpectedException2 = (expo.modules.kotlin.exception.CodedException) codedException;
                    } else {
                        unexpectedException2 = codedException instanceof CodedException ? new expo.modules.kotlin.exception.CodedException(codedException.getCode(), codedException.getMessage(), codedException.getCause()) : new UnexpectedException(codedException);
                    }
                    throw new FunctionCallException(suspendFunctionComponent.getName(), str, unexpectedException2);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$3;
                promiseImpl = (PromiseImpl) this.L$2;
                str = (String) this.L$1;
                suspendFunctionComponent = (SuspendFunctionComponent) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    codedException = th2;
                    if (!(codedException instanceof expo.modules.kotlin.exception.CodedException)) {
                    }
                    throw new FunctionCallException(suspendFunctionComponent.getName(), str, unexpectedException2);
                }
            }
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                promiseImpl.resolve(obj);
            }
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th3) {
            if (this.$promiseImpl.getWasSettled()) {
                throw th3;
            }
            PromiseImpl promiseImpl3 = this.$promiseImpl;
            if (th3 instanceof expo.modules.kotlin.exception.CodedException) {
                unexpectedException = (expo.modules.kotlin.exception.CodedException) th3;
            } else if (th3 instanceof CodedException) {
                CodedException codedException2 = (CodedException) th3;
                unexpectedException = new expo.modules.kotlin.exception.CodedException(codedException2.getCode(), codedException2.getMessage(), codedException2.getCause());
            } else {
                unexpectedException = new UnexpectedException(th3);
            }
            promiseImpl3.reject(unexpectedException);
        }
        return Unit.INSTANCE;
    }
}
