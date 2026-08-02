package L0;

import I0.InterfaceC1344i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class j {

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6752n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6753o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Function2 f6754p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f6754p = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f6754p, continuation);
            aVar.f6753o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Continuation continuation) {
            return ((a) create(fVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6752n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f6753o;
                ResultKt.throwOnFailure(obj);
                return cVar;
            }
            ResultKt.throwOnFailure(obj);
            c d10 = ((f) this.f6753o).d();
            Function2 function2 = this.f6754p;
            this.f6753o = d10;
            this.f6752n = 1;
            return function2.invoke(d10, this) == coroutine_suspended ? coroutine_suspended : d10;
        }
    }

    public static final Object a(InterfaceC1344i interfaceC1344i, Function2 function2, Continuation continuation) {
        return interfaceC1344i.a(new a(function2, null), continuation);
    }
}
