package hd;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public List f10509a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10510b;

    /* renamed from: c, reason: collision with root package name */
    public StringBuilder f10511c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f10513e;

    /* renamed from: f, reason: collision with root package name */
    public int f10514f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, mf.c cVar) {
        super(cVar);
        this.f10513e = dVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10512d = obj;
        this.f10514f |= Integer.MIN_VALUE;
        return this.f10513e.k(this);
    }
}
