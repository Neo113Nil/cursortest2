package g4;

import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Ref.BooleanRef f9740a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f9742c;

    /* renamed from: d, reason: collision with root package name */
    public int f9743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, mf.c cVar) {
        super(cVar);
        this.f9742c = eVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f9741b = obj;
        this.f9743d |= Integer.MIN_VALUE;
        return this.f9742c.a(this);
    }
}
