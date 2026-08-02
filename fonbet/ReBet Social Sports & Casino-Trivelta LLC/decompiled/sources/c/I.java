package c;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class I extends SuspendLambda implements Function2 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f26431n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Dc.c f26432o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Function1 function1, Dc.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f26431n = function1;
        this.f26432o = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new I(this.f26431n, this.f26432o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new I(this.f26431n, this.f26432o, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Function1 function1 = this.f26431n;
        Result.Companion companion = Result.INSTANCE;
        function1.invoke(Result.m146boximpl(Result.m147constructorimpl(ResultKt.createFailure(this.f26432o))));
        return Unit.INSTANCE;
    }
}
