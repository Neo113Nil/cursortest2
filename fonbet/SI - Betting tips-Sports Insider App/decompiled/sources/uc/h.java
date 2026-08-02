package uc;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class h extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24234a;

    /* renamed from: b, reason: collision with root package name */
    public int f24235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f24236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t tVar, Continuation continuation) {
        super(continuation);
        this.f24236c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f24234a = obj;
        this.f24235b |= Integer.MIN_VALUE;
        return this.f24236c.d(null, this);
    }
}
