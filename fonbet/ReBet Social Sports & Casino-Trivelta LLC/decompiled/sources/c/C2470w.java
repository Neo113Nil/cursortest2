package c;

import com.surt.guardian.GuardianSDK;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: c.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2470w extends ContinuationImpl {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f26710n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ GuardianSDK f26711o;

    /* renamed from: p, reason: collision with root package name */
    public int f26712p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470w(GuardianSDK guardianSDK, Continuation continuation) {
        super(continuation);
        this.f26711o = guardianSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26710n = obj;
        this.f26712p |= Integer.MIN_VALUE;
        return GuardianSDK.access$collectFingerprint(this.f26711o, this);
    }
}
