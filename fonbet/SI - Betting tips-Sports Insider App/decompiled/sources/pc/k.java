package pc;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public List f21655a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f21657c;

    /* renamed from: d, reason: collision with root package name */
    public int f21658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u uVar, mf.c cVar) {
        super(cVar);
        this.f21657c = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21656b = obj;
        this.f21658d |= Integer.MIN_VALUE;
        return u.c(this.f21657c, null, this);
    }
}
