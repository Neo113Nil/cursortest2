package uc;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24214a;

    /* renamed from: b, reason: collision with root package name */
    public int f24215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f24216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t tVar, Continuation continuation) {
        super(continuation);
        this.f24216c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f24214a = obj;
        this.f24215b |= Integer.MIN_VALUE;
        return this.f24216c.d(null, this);
    }
}
