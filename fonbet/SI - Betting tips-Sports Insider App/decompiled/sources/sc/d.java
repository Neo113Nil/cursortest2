package sc;

import s7.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ha.a f23432a;

    /* renamed from: b, reason: collision with root package name */
    public u f23433b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f23435d;

    /* renamed from: e, reason: collision with root package name */
    public int f23436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, mf.c cVar) {
        super(cVar);
        this.f23435d = hVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23434c = obj;
        this.f23436e |= Integer.MIN_VALUE;
        return this.f23435d.c(null, this);
    }
}
