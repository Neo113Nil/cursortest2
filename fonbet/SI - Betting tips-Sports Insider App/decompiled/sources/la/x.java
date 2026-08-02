package la;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f19608a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19609b;

    /* renamed from: c, reason: collision with root package name */
    public List f19610c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f19611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f19612e;

    /* renamed from: f, reason: collision with root package name */
    public int f19613f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c0 c0Var, mf.c cVar) {
        super(cVar);
        this.f19612e = c0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19611d = obj;
        this.f19613f |= Integer.MIN_VALUE;
        return this.f19612e.L0(0, false, this);
    }
}
