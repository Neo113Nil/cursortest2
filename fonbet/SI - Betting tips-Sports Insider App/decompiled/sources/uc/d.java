package uc;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class d extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24222a;

    /* renamed from: b, reason: collision with root package name */
    public int f24223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f24224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, Continuation continuation) {
        super(continuation);
        this.f24224c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f24222a = obj;
        this.f24223b |= Integer.MIN_VALUE;
        return this.f24224c.d(null, this);
    }
}
