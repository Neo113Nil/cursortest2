package sc;

import s7.t;
import s7.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public t f23455a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f23457c;

    /* renamed from: d, reason: collision with root package name */
    public int f23458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, mf.c cVar) {
        super(cVar);
        this.f23457c = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23456b = obj;
        this.f23458d |= Integer.MIN_VALUE;
        return this.f23457c.h(null, this);
    }
}
