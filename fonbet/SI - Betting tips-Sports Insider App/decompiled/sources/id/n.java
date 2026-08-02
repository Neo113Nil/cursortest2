package id;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class n extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11187a;

    /* renamed from: b, reason: collision with root package name */
    public int f11188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f11189c;

    /* renamed from: d, reason: collision with root package name */
    public hg.h f11190d;

    /* renamed from: e, reason: collision with root package name */
    public int f11191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(continuation);
        this.f11189c = oVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f11187a = obj;
        this.f11188b |= Integer.MIN_VALUE;
        return this.f11189c.d(null, this);
    }
}
