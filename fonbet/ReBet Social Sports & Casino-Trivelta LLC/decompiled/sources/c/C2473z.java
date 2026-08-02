package c;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2473z extends SuspendLambda implements Function2 {

    /* renamed from: n, reason: collision with root package name */
    public int f26740n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D f26741o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G f26742p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f26743q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2473z(D d10, G g10, String str, Continuation continuation) {
        super(2, continuation);
        this.f26741o = d10;
        this.f26742p = g10;
        this.f26743q = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2473z(this.f26741o, this.f26742p, this.f26743q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2473z) create((Ph.P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f26740n;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            D d10 = this.f26741o;
            C2469v c2469v = new C2469v(d10, this.f26742p, this.f26743q, null);
            this.f26740n = 1;
            b10 = D.b(d10, c2469v, this);
            if (b10 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            b10 = ((Result) obj).getValue();
        }
        return Result.m146boximpl(b10);
    }
}
