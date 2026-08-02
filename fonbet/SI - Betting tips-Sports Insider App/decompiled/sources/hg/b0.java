package hg;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class b0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10646a;

    /* renamed from: b, reason: collision with root package name */
    public int f10647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bd.g f10648c;

    /* renamed from: d, reason: collision with root package name */
    public bd.f f10649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(bd.g gVar, Continuation continuation) {
        super(continuation);
        this.f10648c = gVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10646a = obj;
        this.f10647b |= Integer.MIN_VALUE;
        return this.f10648c.a(null, this);
    }
}
