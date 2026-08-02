package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f19723a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f19725c;

    /* renamed from: d, reason: collision with root package name */
    public int f19726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, mf.c cVar) {
        super(cVar);
        this.f19725c = hVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19724b = obj;
        this.f19726d |= Integer.MIN_VALUE;
        return h.p(this.f19725c, this);
    }
}
