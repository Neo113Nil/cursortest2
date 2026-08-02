package I0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public abstract class G {

    public static final class a extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f5073n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f5074o;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        public final Object i(y yVar, boolean z10, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f5074o = yVar;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((y) obj, ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5073n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            y yVar = (y) this.f5074o;
            this.f5073n = 1;
            Object c10 = yVar.c(this);
            return c10 == coroutine_suspended ? coroutine_suspended : c10;
        }
    }

    public static final Object a(F f10, Continuation continuation) {
        return f10.d(new a(null), continuation);
    }
}
