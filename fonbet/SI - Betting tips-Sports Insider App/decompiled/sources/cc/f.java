package cc;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3740a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f3742c;

    /* renamed from: d, reason: collision with root package name */
    public int f3743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Continuation continuation) {
        super(continuation);
        this.f3742c = iVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3741b = obj;
        this.f3743d |= Integer.MIN_VALUE;
        return this.f3742c.e(null, this);
    }
}
