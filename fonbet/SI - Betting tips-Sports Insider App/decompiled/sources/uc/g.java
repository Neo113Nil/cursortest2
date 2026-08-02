package uc;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class g extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24231a;

    /* renamed from: b, reason: collision with root package name */
    public int f24232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f24233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t tVar, Continuation continuation) {
        super(continuation);
        this.f24233c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f24231a = obj;
        this.f24232b |= Integer.MIN_VALUE;
        return this.f24233c.d(null, this);
    }
}
