package rc;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1.y f22457b;

    /* renamed from: c, reason: collision with root package name */
    public int f22458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c1.y yVar, Continuation continuation) {
        super(continuation);
        this.f22457b = yVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f22456a = obj;
        this.f22458c |= Integer.MIN_VALUE;
        return this.f22457b.a(null, this);
    }
}
