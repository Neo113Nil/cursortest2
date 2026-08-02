package m2;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f20194a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f20195b;

    /* renamed from: c, reason: collision with root package name */
    public j f20196c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f20197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f20198e;

    /* renamed from: f, reason: collision with root package name */
    public int f20199f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, mf.c cVar) {
        super(cVar);
        this.f20198e = d0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20197d = obj;
        this.f20199f |= Integer.MIN_VALUE;
        return this.f20198e.c(null, null, this);
    }
}
