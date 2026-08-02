package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kotlinx.coroutines.flow.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5317b extends AbstractC5319d {

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f54671e;

    /* renamed from: kotlinx.coroutines.flow.b$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f54672n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54673o;

        /* renamed from: q, reason: collision with root package name */
        public int f54675q;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54673o = obj;
            this.f54675q |= Integer.MIN_VALUE;
            return C5317b.this.f(null, this);
        }
    }

    public /* synthetic */ C5317b(Function2 function2, CoroutineContext coroutineContext, int i10, Rh.d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? Rh.d.f10307a : dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.AbstractC5319d, kotlinx.coroutines.flow.internal.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(Rh.y yVar, Continuation continuation) {
        a aVar;
        int i10;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f54675q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f54675q = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f54673o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f54675q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar.f54672n = yVar;
                    aVar.f54675q = 1;
                    if (super.f(yVar, aVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = (Rh.y) aVar.f54672n;
                    ResultKt.throwOnFailure(obj);
                }
                if (yVar.p()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return Unit.INSTANCE;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f54673o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f54675q;
        if (i10 != 0) {
        }
        if (yVar.p()) {
        }
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public kotlinx.coroutines.flow.internal.e i(CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        return new C5317b(this.f54671e, coroutineContext, i10, dVar);
    }

    public C5317b(Function2 function2, CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        super(function2, coroutineContext, i10, dVar);
        this.f54671e = function2;
    }
}
