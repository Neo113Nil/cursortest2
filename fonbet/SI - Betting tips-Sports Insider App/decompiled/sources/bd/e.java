package bd;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3148a;

    /* renamed from: b, reason: collision with root package name */
    public int f3149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3150c;

    /* renamed from: d, reason: collision with root package name */
    public hg.h f3151d;

    /* renamed from: e, reason: collision with root package name */
    public int f3152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(continuation);
        this.f3150c = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3148a = obj;
        this.f3149b |= Integer.MIN_VALUE;
        return this.f3150c.d(null, this);
    }
}
