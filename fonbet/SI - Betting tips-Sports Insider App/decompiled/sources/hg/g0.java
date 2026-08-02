package hg;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class g0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public bd.f f10682a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10683b;

    /* renamed from: c, reason: collision with root package name */
    public int f10684c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd.f f10685d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(bd.f fVar, Continuation continuation) {
        super(continuation);
        this.f10685d = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10683b = obj;
        this.f10684c |= Integer.MIN_VALUE;
        return this.f10685d.d(null, this);
    }
}
