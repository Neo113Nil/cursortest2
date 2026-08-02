package g4;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f9744a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f9746c;

    /* renamed from: d, reason: collision with root package name */
    public int f9747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, mf.c cVar) {
        super(cVar);
        this.f9746c = eVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f9745b = obj;
        this.f9747d |= Integer.MIN_VALUE;
        return this.f9746c.c(null, this);
    }
}
