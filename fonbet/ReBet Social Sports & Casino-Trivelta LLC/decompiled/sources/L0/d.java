package L0;

import I0.InterfaceC1344i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.InterfaceC5321f;

/* loaded from: classes.dex */
public final class d implements InterfaceC1344i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1344i f6744a;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6745n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6746o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Function2 f6747p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f6747p = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f6747p, continuation);
            aVar.f6746o = obj;
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
            int i10 = this.f6745n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = (f) this.f6746o;
                Function2 function2 = this.f6747p;
                this.f6745n = 1;
                obj = function2.invoke(fVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            f fVar2 = (f) obj;
            Intrinsics.checkNotNull(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).h();
            return fVar2;
        }
    }

    public d(InterfaceC1344i delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6744a = delegate;
    }

    @Override // I0.InterfaceC1344i
    public Object a(Function2 function2, Continuation continuation) {
        return this.f6744a.a(new a(function2, null), continuation);
    }

    @Override // I0.InterfaceC1344i
    public InterfaceC5321f getData() {
        return this.f6744a.getData();
    }
}
