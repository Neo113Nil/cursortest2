package dd;

import m3.f;
import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f8367b;

    /* renamed from: c, reason: collision with root package name */
    public int f8368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, c cVar) {
        super(cVar);
        this.f8367b = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f8366a = obj;
        this.f8368c |= Integer.MIN_VALUE;
        return this.f8367b.r(this);
    }
}
