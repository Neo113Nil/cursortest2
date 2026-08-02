package hg;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ig.u f10635a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.u f10637c;

    /* renamed from: d, reason: collision with root package name */
    public int f10638d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c1.u uVar, Continuation continuation) {
        super(continuation);
        this.f10637c = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10636b = obj;
        this.f10638d |= Integer.MIN_VALUE;
        return this.f10637c.a(null, this);
    }
}
