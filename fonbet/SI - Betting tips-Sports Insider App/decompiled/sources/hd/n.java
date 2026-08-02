package hd;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f10577a;

    /* renamed from: b, reason: collision with root package name */
    public String f10578b;

    /* renamed from: c, reason: collision with root package name */
    public String f10579c;

    /* renamed from: d, reason: collision with root package name */
    public StringBuilder f10580d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.sentry.internal.debugmeta.c f10582f;

    /* renamed from: g, reason: collision with root package name */
    public int f10583g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(io.sentry.internal.debugmeta.c cVar, mf.c cVar2) {
        super(cVar2);
        this.f10582f = cVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10581e = obj;
        this.f10583g |= Integer.MIN_VALUE;
        return this.f10582f.n(this);
    }
}
