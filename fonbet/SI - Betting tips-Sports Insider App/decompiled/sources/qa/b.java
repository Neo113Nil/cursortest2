package qa;

import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public String f22076a;

    /* renamed from: b, reason: collision with root package name */
    public na.b f22077b;

    /* renamed from: c, reason: collision with root package name */
    public int f22078c;

    /* renamed from: d, reason: collision with root package name */
    public int f22079d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f22080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ na.b f22081f;

    /* renamed from: g, reason: collision with root package name */
    public int f22082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(na.b bVar, c cVar) {
        super(cVar);
        this.f22081f = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f22080e = obj;
        this.f22082g |= Integer.MIN_VALUE;
        return this.f22081f.u0(null, 0, 0, null, null, this);
    }
}
