package xa;

import mf.c;
import na.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public String f25447a;

    /* renamed from: b, reason: collision with root package name */
    public String f25448b;

    /* renamed from: c, reason: collision with root package name */
    public String f25449c;

    /* renamed from: d, reason: collision with root package name */
    public String f25450d;

    /* renamed from: e, reason: collision with root package name */
    public b f25451e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f25452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f25453g;

    /* renamed from: h, reason: collision with root package name */
    public int f25454h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f25453g = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25452f = obj;
        this.f25454h |= Integer.MIN_VALUE;
        return this.f25453g.D0(null, null, null, null, null, null, this);
    }
}
