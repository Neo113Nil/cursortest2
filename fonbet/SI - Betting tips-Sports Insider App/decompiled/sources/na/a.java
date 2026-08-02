package na;

import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public String f20861a;

    /* renamed from: b, reason: collision with root package name */
    public int f20862b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f20863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f20864d;

    /* renamed from: e, reason: collision with root package name */
    public int f20865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f20864d = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20863c = obj;
        this.f20865e |= Integer.MIN_VALUE;
        return this.f20864d.r0(null, 0, null, null, this);
    }
}
