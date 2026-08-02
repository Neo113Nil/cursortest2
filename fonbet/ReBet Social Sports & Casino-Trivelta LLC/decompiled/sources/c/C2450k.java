package c;

import com.surt.guardian.network.CollectResult;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: c.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2450k extends SuspendLambda implements Function2 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f26599n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ CollectResult f26600o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2450k(Function1 function1, CollectResult collectResult, Continuation continuation) {
        super(2, continuation);
        this.f26599n = function1;
        this.f26600o = collectResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2450k(this.f26599n, this.f26600o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2450k(this.f26599n, this.f26600o, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Function1 function1 = this.f26599n;
        Result.Companion companion = Result.INSTANCE;
        function1.invoke(Result.m146boximpl(Result.m147constructorimpl(this.f26600o)));
        return Unit.INSTANCE;
    }
}
