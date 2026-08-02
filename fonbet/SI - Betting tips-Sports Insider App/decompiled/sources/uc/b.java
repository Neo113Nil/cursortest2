package uc;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24217a;

    /* renamed from: b, reason: collision with root package name */
    public int f24218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f24219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t tVar, Continuation continuation) {
        super(continuation);
        this.f24219c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f24217a = obj;
        this.f24218b |= Integer.MIN_VALUE;
        return this.f24219c.d(null, this);
    }
}
