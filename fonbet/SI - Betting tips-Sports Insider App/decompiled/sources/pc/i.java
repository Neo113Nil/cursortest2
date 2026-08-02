package pc;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f21640a;

    /* renamed from: b, reason: collision with root package name */
    public int f21641b;

    /* renamed from: c, reason: collision with root package name */
    public List f21642c;

    /* renamed from: d, reason: collision with root package name */
    public List f21643d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f21644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f21645f;

    /* renamed from: g, reason: collision with root package name */
    public int f21646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u uVar, mf.c cVar) {
        super(cVar);
        this.f21645f = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21644e = obj;
        this.f21646g |= Integer.MIN_VALUE;
        return this.f21645f.s(0, null, null, this);
    }
}
