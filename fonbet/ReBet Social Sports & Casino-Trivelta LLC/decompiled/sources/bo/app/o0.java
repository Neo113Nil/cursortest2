package bo.app;

import com.braze.Braze;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f25841b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(String str, Braze braze, Continuation continuation) {
        super(2, continuation);
        this.f25840a = str;
        this.f25841b = braze;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o0(this.f25840a, this.f25841b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o0(this.f25840a, this.f25841b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.f25840a;
        if (str == null) {
            return null;
        }
        return com.braze.support.i.a(str, ((ah) this.f25841b.getUdm$android_sdk_base_release()).f25278t);
    }
}
