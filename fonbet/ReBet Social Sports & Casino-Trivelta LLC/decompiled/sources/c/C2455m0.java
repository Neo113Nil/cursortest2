package c;

import com.surt.guardian.GuardianSDK;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: c.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2455m0 extends ContinuationImpl {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f26627n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ GuardianSDK f26628o;

    /* renamed from: p, reason: collision with root package name */
    public int f26629p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2455m0(GuardianSDK guardianSDK, Continuation continuation) {
        super(continuation);
        this.f26628o = guardianSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26627n = obj;
        this.f26629p |= Integer.MIN_VALUE;
        Object m114verifySuspend0E7RQCE = this.f26628o.m114verifySuspend0E7RQCE(null, null, this);
        return m114verifySuspend0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m114verifySuspend0E7RQCE : Result.m146boximpl(m114verifySuspend0E7RQCE);
    }
}
