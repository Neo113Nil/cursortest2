package va;

import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public String f24537a;

    /* renamed from: b, reason: collision with root package name */
    public String f24538b;

    /* renamed from: c, reason: collision with root package name */
    public na.b f24539c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ na.b f24541e;

    /* renamed from: f, reason: collision with root package name */
    public int f24542f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(na.b bVar, c cVar) {
        super(cVar);
        this.f24541e = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f24540d = obj;
        this.f24542f |= Integer.MIN_VALUE;
        return this.f24541e.w0(null, null, null, null, this);
    }
}
