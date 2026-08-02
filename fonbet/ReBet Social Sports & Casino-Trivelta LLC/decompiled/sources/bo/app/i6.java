package bo.app;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class i6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f25561a;

    /* renamed from: b, reason: collision with root package name */
    public int f25562b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25563c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o6 f25564d;

    /* renamed from: e, reason: collision with root package name */
    public int f25565e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(o6 o6Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25564d = o6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25563c = obj;
        this.f25565e |= Integer.MIN_VALUE;
        return this.f25564d.a(this);
    }
}
