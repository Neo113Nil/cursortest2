package bo.app;

import Ph.AbstractC1440a0;
import Ph.P;
import Ph.Q;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j4 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public long f25591a;

    /* renamed from: b, reason: collision with root package name */
    public int f25592b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25593c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k4 f25594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25595e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(k4 k4Var, long j10, Continuation continuation) {
        super(2, continuation);
        this.f25594d = k4Var;
        this.f25595e = j10;
    }

    public static final String a() {
        return "Requesting data flush from automatic sync policy";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        j4 j4Var = new j4(this.f25594d, this.f25595e, continuation);
        j4Var.f25593c = obj;
        return j4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j4) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        if (Ph.AbstractC1440a0.a(r4, r14) == r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j10;
        P p10 = (P) this.f25593c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25592b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            long j11 = this.f25594d.f25646g;
            long j12 = this.f25595e;
            this.f25593c = p10;
            this.f25591a = j11;
            this.f25592b = 1;
            if (AbstractC1440a0.a(j12, this) != coroutine_suspended) {
                j10 = j11;
            }
            return coroutine_suspended;
        }
        if (i10 == 1) {
            j10 = this.f25591a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f25591a;
            ResultKt.throwOnFailure(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, k4.f25639m, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.j4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.j4.a();
                }
            }, 12, (Object) null);
            Braze.INSTANCE.getInstance(this.f25594d.f25640a).requestImmediateDataFlush();
            if (Q.i(p10)) {
                return Unit.INSTANCE;
            }
            this.f25593c = p10;
            this.f25591a = j10;
            this.f25592b = 2;
        }
        Braze.INSTANCE.getInstance(this.f25594d.f25640a).requestImmediateDataFlush();
        if (Q.i(p10)) {
        }
    }
}
