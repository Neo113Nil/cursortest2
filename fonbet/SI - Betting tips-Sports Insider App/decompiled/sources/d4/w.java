package d4;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ng.i f8158a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f8160c;

    /* renamed from: d, reason: collision with root package name */
    public int f8161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, mf.c cVar) {
        super(cVar);
        this.f8160c = yVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f8159b = obj;
        this.f8161d |= Integer.MIN_VALUE;
        return this.f8160c.a(this);
    }
}
