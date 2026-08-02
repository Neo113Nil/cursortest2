package pc;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public List f21671a;

    /* renamed from: b, reason: collision with root package name */
    public List f21672b;

    /* renamed from: c, reason: collision with root package name */
    public List f21673c;

    /* renamed from: d, reason: collision with root package name */
    public List f21674d;

    /* renamed from: e, reason: collision with root package name */
    public List f21675e;

    /* renamed from: f, reason: collision with root package name */
    public List f21676f;

    /* renamed from: g, reason: collision with root package name */
    public List f21677g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f21678h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f21679i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, mf.c cVar) {
        super(cVar);
        this.f21679i = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21678h = obj;
        this.j |= Integer.MIN_VALUE;
        return u.f(this.f21679i, null, this);
    }
}
