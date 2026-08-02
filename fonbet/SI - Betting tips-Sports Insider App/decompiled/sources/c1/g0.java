package c1;

import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Ref.IntRef f3388a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f3390c;

    /* renamed from: d, reason: collision with root package name */
    public int f3391d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, mf.c cVar) {
        super(cVar);
        this.f3390c = i0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3389b = obj;
        this.f3391d |= Integer.MIN_VALUE;
        return this.f3390c.j(null, false, this);
    }
}
