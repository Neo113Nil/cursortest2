package yc;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25834a;

    /* renamed from: b, reason: collision with root package name */
    public int f25835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f25836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t tVar, Continuation continuation) {
        super(continuation);
        this.f25836c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25834a = obj;
        this.f25835b |= Integer.MIN_VALUE;
        return this.f25836c.d(null, this);
    }
}
