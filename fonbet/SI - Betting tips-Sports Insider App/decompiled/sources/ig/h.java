package ig;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public i f11252a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11253b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11254c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f11255d;

    /* renamed from: e, reason: collision with root package name */
    public int f11256e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(continuation);
        this.f11255d = iVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f11254c = obj;
        this.f11256e |= Integer.MIN_VALUE;
        return this.f11255d.d(null, this);
    }
}
