package ta;

import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public String f23804a;

    /* renamed from: b, reason: collision with root package name */
    public String f23805b;

    /* renamed from: c, reason: collision with root package name */
    public String f23806c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f23807d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f23808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ na.b f23809f;

    /* renamed from: g, reason: collision with root package name */
    public int f23810g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(na.b bVar, c cVar) {
        super(cVar);
        this.f23809f = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23808e = obj;
        this.f23810g |= Integer.MIN_VALUE;
        return this.f23809f.B0(null, null, null, null, null, null, this);
    }
}
