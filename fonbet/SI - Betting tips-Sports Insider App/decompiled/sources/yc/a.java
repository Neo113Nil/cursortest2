package yc;

import s7.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f25832b;

    /* renamed from: c, reason: collision with root package name */
    public int f25833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u uVar, mf.c cVar) {
        super(cVar);
        this.f25832b = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25831a = obj;
        this.f25833c |= Integer.MIN_VALUE;
        return this.f25832b.k(null, this);
    }
}
