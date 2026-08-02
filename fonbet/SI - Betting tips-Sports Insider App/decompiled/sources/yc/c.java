package yc;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25837a;

    /* renamed from: b, reason: collision with root package name */
    public int f25838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f25839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, Continuation continuation) {
        super(continuation);
        this.f25839c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25837a = obj;
        this.f25838b |= Integer.MIN_VALUE;
        return this.f25839c.d(null, this);
    }
}
