package bo.app;

import Ph.P;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j7 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Wh.a f25605a;

    /* renamed from: b, reason: collision with root package name */
    public m7 f25606b;

    /* renamed from: c, reason: collision with root package name */
    public String f25607c;

    /* renamed from: d, reason: collision with root package name */
    public long f25608d;

    /* renamed from: e, reason: collision with root package name */
    public int f25609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m7 f25610f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f25611g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f25612h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(m7 m7Var, String str, long j10, Continuation continuation) {
        super(2, continuation);
        this.f25610f = m7Var;
        this.f25611g = str;
        this.f25612h = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j7(this.f25610f, this.f25611g, this.f25612h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j7) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m7 m7Var;
        Wh.a aVar;
        String str;
        long j10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25609e;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            m7Var = this.f25610f;
            aVar = m7Var.f25746b;
            String str2 = this.f25611g;
            long j11 = this.f25612h;
            this.f25605a = aVar;
            this.f25606b = m7Var;
            this.f25607c = str2;
            this.f25608d = j11;
            this.f25609e = 1;
            if (aVar.f(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
            j10 = j11;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f25608d;
            str = this.f25607c;
            m7Var = this.f25606b;
            aVar = this.f25605a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            Map a10 = m7Var.a();
            a10.put(str, Boxing.boxLong(j10));
            m7.a(m7Var, a10);
            return Unit.INSTANCE;
        } finally {
            aVar.g(null);
        }
    }
}
