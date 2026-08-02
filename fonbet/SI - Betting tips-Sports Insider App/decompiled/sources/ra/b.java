package ra;

import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public String f22355a;

    /* renamed from: b, reason: collision with root package name */
    public int f22356b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na.b f22358d;

    /* renamed from: e, reason: collision with root package name */
    public int f22359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(na.b bVar, c cVar) {
        super(cVar);
        this.f22358d = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f22357c = obj;
        this.f22359e |= Integer.MIN_VALUE;
        return this.f22358d.z0(null, 0, null, null, this);
    }
}
