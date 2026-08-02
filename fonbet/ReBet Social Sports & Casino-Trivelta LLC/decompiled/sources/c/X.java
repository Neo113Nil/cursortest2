package c;

import com.surt.guardian.GuardianSDK;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class X extends ContinuationImpl {

    /* renamed from: n, reason: collision with root package name */
    public GuardianSDK f26503n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f26504o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ GuardianSDK f26505p;

    /* renamed from: q, reason: collision with root package name */
    public int f26506q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(GuardianSDK guardianSDK, Continuation continuation) {
        super(continuation);
        this.f26505p = guardianSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26504o = obj;
        this.f26506q |= Integer.MIN_VALUE;
        return GuardianSDK.access$performAttestation(this.f26505p, null, this);
    }
}
