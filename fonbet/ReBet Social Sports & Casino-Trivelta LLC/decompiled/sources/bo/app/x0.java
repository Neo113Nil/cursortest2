package bo.app;

import Ph.AbstractC1457j;
import Ph.P;
import com.braze.Braze;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26216c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Braze f26217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f26218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f26219f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(boolean z10, boolean z11, boolean z12, Braze braze, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.f26214a = z10;
        this.f26215b = z11;
        this.f26216c = z12;
        this.f26217d = braze;
        this.f26218e = function0;
        this.f26219f = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new x0(this.f26214a, this.f26215b, this.f26216c, this.f26217d, this.f26218e, this.f26219f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC1457j.b(null, new com.braze.c(this.f26214a, this.f26215b, this.f26216c, this.f26217d, this.f26218e, this.f26219f, null), 1, null);
        return Unit.INSTANCE;
    }
}
