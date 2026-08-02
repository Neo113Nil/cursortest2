package hg;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class l0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10718a;

    /* renamed from: b, reason: collision with root package name */
    public int f10719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bd.f f10720c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10721d;

    /* renamed from: e, reason: collision with root package name */
    public h f10722e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(bd.f fVar, Continuation continuation) {
        super(continuation);
        this.f10720c = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10718a = obj;
        this.f10719b |= Integer.MIN_VALUE;
        return this.f10720c.d(null, this);
    }
}
