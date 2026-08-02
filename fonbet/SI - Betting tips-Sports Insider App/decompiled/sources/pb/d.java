package pb;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class d extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21599a;

    /* renamed from: b, reason: collision with root package name */
    public int f21600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bd.f f21601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bd.f fVar, Continuation continuation) {
        super(continuation);
        this.f21601c = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21599a = obj;
        this.f21600b |= Integer.MIN_VALUE;
        return this.f21601c.d(null, this);
    }
}
