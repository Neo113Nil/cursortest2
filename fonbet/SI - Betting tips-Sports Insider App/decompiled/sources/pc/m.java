package pc;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public List f21667a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f21669c;

    /* renamed from: d, reason: collision with root package name */
    public int f21670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u uVar, mf.c cVar) {
        super(cVar);
        this.f21669c = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21668b = obj;
        this.f21670d |= Integer.MIN_VALUE;
        return u.e(this.f21669c, null, this);
    }
}
