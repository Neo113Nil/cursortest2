package hg;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class w extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public x f10785a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f10787c;

    /* renamed from: d, reason: collision with root package name */
    public int f10788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Continuation continuation) {
        super(continuation);
        this.f10787c = xVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10786b = obj;
        this.f10788d |= Integer.MIN_VALUE;
        return this.f10787c.d(null, this);
    }
}
