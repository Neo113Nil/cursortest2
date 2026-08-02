package c;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class O extends ContinuationImpl {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f26477n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f26478o;

    /* renamed from: p, reason: collision with root package name */
    public int f26479p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Z z10, Continuation continuation) {
        super(continuation);
        this.f26478o = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26477n = obj;
        this.f26479p |= Integer.MIN_VALUE;
        return this.f26478o.a(this);
    }
}
