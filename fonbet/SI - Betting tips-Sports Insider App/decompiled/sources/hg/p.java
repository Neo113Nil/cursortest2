package hg;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class p extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10737a;

    /* renamed from: b, reason: collision with root package name */
    public int f10738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f10739c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10740d;

    /* renamed from: e, reason: collision with root package name */
    public h f10741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Continuation continuation) {
        super(continuation);
        this.f10739c = qVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10737a = obj;
        this.f10738b |= Integer.MIN_VALUE;
        return this.f10739c.a(null, this);
    }
}
