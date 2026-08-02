package hd;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public StringBuilder f10569a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.sentry.internal.debugmeta.c f10571c;

    /* renamed from: d, reason: collision with root package name */
    public int f10572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(io.sentry.internal.debugmeta.c cVar, mf.c cVar2) {
        super(cVar2);
        this.f10571c = cVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10570b = obj;
        this.f10572d |= Integer.MIN_VALUE;
        return this.f10571c.l(this);
    }
}
