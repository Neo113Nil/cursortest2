package bo.app;

import Ph.P;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bd extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cd f25299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ id f25300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dd f25301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(cd cdVar, id idVar, dd ddVar, Continuation continuation) {
        super(2, continuation);
        this.f25299a = cdVar;
        this.f25300b = idVar;
        this.f25301c = ddVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new bd(this.f25299a, this.f25300b, this.f25301c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bd) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        cd cdVar = this.f25299a;
        new l2(this.f25300b, cdVar.f25356a, cdVar.f25357b, cdVar.f25358c, cdVar.f25361f, cdVar.f25359d, cdVar.f25360e, cdVar.f25362g, this.f25301c).c();
        return Unit.INSTANCE;
    }
}
