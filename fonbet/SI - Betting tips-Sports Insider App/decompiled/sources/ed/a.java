package ed;

import m3.f;
import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9097b;

    /* renamed from: c, reason: collision with root package name */
    public int f9098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, c cVar) {
        super(cVar);
        this.f9097b = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f9096a = obj;
        this.f9098c |= Integer.MIN_VALUE;
        return this.f9097b.u(this);
    }
}
