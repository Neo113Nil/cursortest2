package c;

import com.surt.guardian.GuardianSDK;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: c.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2428A extends ContinuationImpl {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f26366n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ GuardianSDK f26367o;

    /* renamed from: p, reason: collision with root package name */
    public int f26368p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2428A(GuardianSDK guardianSDK, Continuation continuation) {
        super(continuation);
        this.f26367o = guardianSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26366n = obj;
        this.f26368p |= Integer.MIN_VALUE;
        Object m113collectSuspend0E7RQCE = this.f26367o.m113collectSuspend0E7RQCE(null, null, this);
        return m113collectSuspend0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m113collectSuspend0E7RQCE : Result.m146boximpl(m113collectSuspend0E7RQCE);
    }
}
