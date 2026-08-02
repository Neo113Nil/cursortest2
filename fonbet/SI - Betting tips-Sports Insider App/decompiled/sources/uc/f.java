package uc;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24228a;

    /* renamed from: b, reason: collision with root package name */
    public int f24229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f24230c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t tVar, Continuation continuation) {
        super(continuation);
        this.f24230c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f24228a = obj;
        this.f24229b |= Integer.MIN_VALUE;
        return this.f24230c.d(null, this);
    }
}
