package ad;

import m3.f;
import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f130b;

    /* renamed from: c, reason: collision with root package name */
    public int f131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, c cVar) {
        super(cVar);
        this.f130b = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f129a = obj;
        this.f131c |= Integer.MIN_VALUE;
        return this.f130b.u(this);
    }
}
