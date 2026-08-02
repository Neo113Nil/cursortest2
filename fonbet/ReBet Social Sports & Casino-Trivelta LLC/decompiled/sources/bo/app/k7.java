package bo.app;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k7 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Wh.a f25656a;

    /* renamed from: b, reason: collision with root package name */
    public m7 f25657b;

    /* renamed from: c, reason: collision with root package name */
    public String f25658c;

    /* renamed from: d, reason: collision with root package name */
    public int f25659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m7 f25660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f25661f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(m7 m7Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f25660e = m7Var;
        this.f25661f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k7(this.f25660e, this.f25661f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k7(this.f25660e, this.f25661f, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m7 m7Var;
        Wh.a aVar;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25659d;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            m7Var = this.f25660e;
            Wh.a aVar2 = m7Var.f25746b;
            String str2 = this.f25661f;
            this.f25656a = aVar2;
            this.f25657b = m7Var;
            this.f25658c = str2;
            this.f25659d = 1;
            if (aVar2.f(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = aVar2;
            str = str2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f25658c;
            m7Var = this.f25657b;
            aVar = this.f25656a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            Map a10 = m7Var.a();
            a10.remove(str);
            m7.a(m7Var, a10);
            return Unit.INSTANCE;
        } finally {
            aVar.g(null);
        }
    }
}
