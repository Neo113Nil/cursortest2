package sc;

import s7.s;
import s7.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ha.a f23459a;

    /* renamed from: b, reason: collision with root package name */
    public ha.a f23460b;

    /* renamed from: c, reason: collision with root package name */
    public u f23461c;

    /* renamed from: d, reason: collision with root package name */
    public int f23462d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f23463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f23464f;

    /* renamed from: g, reason: collision with root package name */
    public int f23465g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s sVar, mf.c cVar) {
        super(cVar);
        this.f23464f = sVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23463e = obj;
        this.f23465g |= Integer.MIN_VALUE;
        return this.f23464f.f(this);
    }
}
