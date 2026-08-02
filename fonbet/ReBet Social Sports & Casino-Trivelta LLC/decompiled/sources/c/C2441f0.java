package c;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: c.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2441f0 extends SuspendLambda implements Function2 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f26552n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f26553o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441f0(Function1 function1, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f26552n = function1;
        this.f26553o = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2441f0(this.f26552n, this.f26553o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2441f0(this.f26552n, this.f26553o, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f26552n.invoke(Result.m146boximpl(this.f26553o));
        return Unit.INSTANCE;
    }
}
