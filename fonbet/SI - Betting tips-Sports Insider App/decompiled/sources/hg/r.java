package hg;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class r extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10745a;

    /* renamed from: b, reason: collision with root package name */
    public int f10746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bd.g f10747c;

    /* renamed from: d, reason: collision with root package name */
    public bd.g f10748d;

    /* renamed from: e, reason: collision with root package name */
    public h f10749e;

    /* renamed from: f, reason: collision with root package name */
    public ig.u f10750f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(bd.g gVar, Continuation continuation) {
        super(continuation);
        this.f10747c = gVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10745a = obj;
        this.f10746b |= Integer.MIN_VALUE;
        return this.f10747c.a(null, this);
    }
}
