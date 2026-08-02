package od;

import m7.b;
import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f21157b;

    /* renamed from: c, reason: collision with root package name */
    public int f21158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f21157b = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21156a = obj;
        this.f21158c |= Integer.MIN_VALUE;
        return this.f21157b.c(0, this);
    }
}
