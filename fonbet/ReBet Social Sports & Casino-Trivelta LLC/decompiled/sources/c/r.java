package c;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class r extends ContinuationImpl {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f26657n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D f26658o;

    /* renamed from: p, reason: collision with root package name */
    public int f26659p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(D d10, Continuation continuation) {
        super(continuation);
        this.f26658o = d10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26657n = obj;
        this.f26659p |= Integer.MIN_VALUE;
        Object c10 = this.f26658o.c(null, null, this);
        return c10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c10 : Result.m146boximpl(c10);
    }
}
