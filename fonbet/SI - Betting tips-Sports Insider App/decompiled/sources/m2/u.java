package m2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public long f20274a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f20275b;

    /* renamed from: c, reason: collision with root package name */
    public Ref.ObjectRef f20276c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f20277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f20278e;

    /* renamed from: f, reason: collision with root package name */
    public int f20279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, mf.c cVar) {
        super(cVar);
        this.f20278e = wVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20277d = obj;
        this.f20279f |= Integer.MIN_VALUE;
        return this.f20278e.b(0L, null, this);
    }
}
