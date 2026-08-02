package qa;

import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public String f22070a;

    /* renamed from: b, reason: collision with root package name */
    public na.b f22071b;

    /* renamed from: c, reason: collision with root package name */
    public int f22072c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f22073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ na.b f22074e;

    /* renamed from: f, reason: collision with root package name */
    public int f22075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(na.b bVar, c cVar) {
        super(cVar);
        this.f22074e = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f22073d = obj;
        this.f22075f |= Integer.MIN_VALUE;
        return this.f22074e.t0(null, 0, null, null, this);
    }
}
