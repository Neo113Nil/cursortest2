package m2;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20239a;

    /* renamed from: b, reason: collision with root package name */
    public int f20240b;

    /* renamed from: c, reason: collision with root package name */
    public hg.h f20241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id.o f20242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(id.o oVar, Continuation continuation) {
        super(continuation);
        this.f20242d = oVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20239a = obj;
        this.f20240b |= Integer.MIN_VALUE;
        return this.f20242d.d(null, this);
    }
}
