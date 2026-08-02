package uc;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24225a;

    /* renamed from: b, reason: collision with root package name */
    public int f24226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f24227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t tVar, Continuation continuation) {
        super(continuation);
        this.f24227c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f24225a = obj;
        this.f24226b |= Integer.MIN_VALUE;
        return this.f24227c.d(null, this);
    }
}
