package hg;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class c0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public bd.f f10652a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10653b;

    /* renamed from: c, reason: collision with root package name */
    public int f10654c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd.f f10655d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(bd.f fVar, Continuation continuation) {
        super(continuation);
        this.f10655d = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10653b = obj;
        this.f10654c |= Integer.MIN_VALUE;
        return this.f10655d.d(null, this);
    }
}
