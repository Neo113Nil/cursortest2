package ua;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f24145a;

    /* renamed from: b, reason: collision with root package name */
    public String f24146b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f24148d;

    /* renamed from: e, reason: collision with root package name */
    public int f24149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, mf.c cVar) {
        super(cVar);
        this.f24148d = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f24147c = obj;
        this.f24149e |= Integer.MIN_VALUE;
        return this.f24148d.u0(0, null, this);
    }
}
