package id;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11141a;

    /* renamed from: b, reason: collision with root package name */
    public int f11142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bd.f f11143c;

    /* renamed from: d, reason: collision with root package name */
    public hg.h f11144d;

    /* renamed from: e, reason: collision with root package name */
    public int f11145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bd.f fVar, Continuation continuation) {
        super(continuation);
        this.f11143c = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f11141a = obj;
        this.f11142b |= Integer.MIN_VALUE;
        return this.f11143c.d(null, this);
    }
}
