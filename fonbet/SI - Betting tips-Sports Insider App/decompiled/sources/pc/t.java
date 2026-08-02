package pc;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public List f21697a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f21699c;

    /* renamed from: d, reason: collision with root package name */
    public int f21700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, mf.c cVar) {
        super(cVar);
        this.f21699c = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21698b = obj;
        this.f21700d |= Integer.MIN_VALUE;
        return this.f21699c.y(this);
    }
}
