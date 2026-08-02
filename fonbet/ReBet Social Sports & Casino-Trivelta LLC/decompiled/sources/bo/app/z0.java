package bo.app;

import Ph.AbstractC1459k;
import Ph.P;
import Ph.X;
import com.braze.Braze;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f26335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Braze f26336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f26337g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f26338h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(boolean z10, Object obj, boolean z11, boolean z12, Braze braze, Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f26332b = z10;
        this.f26333c = obj;
        this.f26334d = z11;
        this.f26335e = z12;
        this.f26336f = braze;
        this.f26337g = function2;
        this.f26338h = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new z0(this.f26332b, this.f26333c, this.f26334d, this.f26335e, this.f26336f, this.f26337g, this.f26338h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        X b10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f26331a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        b10 = AbstractC1459k.b(ne.f25833a, null, null, new com.braze.d(this.f26332b, this.f26333c, this.f26334d, this.f26335e, this.f26336f, this.f26337g, this.f26338h, null), 3, null);
        this.f26331a = 1;
        Object await = b10.await(this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }
}
