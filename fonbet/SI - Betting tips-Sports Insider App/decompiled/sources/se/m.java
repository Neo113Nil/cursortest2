package se;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f23569b;

    /* renamed from: c, reason: collision with root package name */
    public int f23570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Continuation continuation) {
        super(continuation);
        this.f23569b = nVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23568a = obj;
        this.f23570c |= Integer.MIN_VALUE;
        return this.f23569b.a(0, this);
    }
}
