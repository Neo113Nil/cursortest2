package hg;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class y extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10797a;

    /* renamed from: b, reason: collision with root package name */
    public int f10798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bd.g f10799c;

    /* renamed from: d, reason: collision with root package name */
    public bd.g f10800d;

    /* renamed from: e, reason: collision with root package name */
    public h f10801e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f10802f;

    /* renamed from: g, reason: collision with root package name */
    public long f10803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(bd.g gVar, Continuation continuation) {
        super(continuation);
        this.f10799c = gVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10797a = obj;
        this.f10798b |= Integer.MIN_VALUE;
        return this.f10799c.a(null, this);
    }
}
