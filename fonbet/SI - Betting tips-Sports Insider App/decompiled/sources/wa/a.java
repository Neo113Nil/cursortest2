package wa;

import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public String f25037a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ na.b f25039c;

    /* renamed from: d, reason: collision with root package name */
    public int f25040d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(na.b bVar, c cVar) {
        super(cVar);
        this.f25039c = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25038b = obj;
        this.f25040d |= Integer.MIN_VALUE;
        return this.f25039c.v0(null, null, null, this);
    }
}
