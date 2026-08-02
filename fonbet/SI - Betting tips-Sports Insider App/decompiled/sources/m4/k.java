package m4;

import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f20384a;

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f20385b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f20386c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f20387d;

    /* renamed from: e, reason: collision with root package name */
    public int f20388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, mf.c cVar) {
        super(cVar);
        this.f20387d = oVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20386c = obj;
        this.f20388e |= Integer.MIN_VALUE;
        return this.f20387d.a(this);
    }
}
