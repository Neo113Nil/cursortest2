package c;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: c.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2456n extends ContinuationImpl {

    /* renamed from: n, reason: collision with root package name */
    public Object f26630n;

    /* renamed from: o, reason: collision with root package name */
    public Object f26631o;

    /* renamed from: p, reason: collision with root package name */
    public Object f26632p;

    /* renamed from: q, reason: collision with root package name */
    public int f26633q;

    /* renamed from: r, reason: collision with root package name */
    public int f26634r;

    /* renamed from: s, reason: collision with root package name */
    public int f26635s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f26636t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D f26637u;

    /* renamed from: v, reason: collision with root package name */
    public int f26638v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2456n(D d10, Continuation continuation) {
        super(continuation);
        this.f26637u = d10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26636t = obj;
        this.f26638v |= Integer.MIN_VALUE;
        Object b10 = D.b(this.f26637u, null, this);
        return b10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b10 : Result.m146boximpl(b10);
    }
}
