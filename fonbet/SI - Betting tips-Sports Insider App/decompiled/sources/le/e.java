package le;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f19753b;

    /* renamed from: c, reason: collision with root package name */
    public int f19754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(continuation);
        this.f19753b = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19752a = obj;
        this.f19754c |= Integer.MIN_VALUE;
        return this.f19753b.a(0, this);
    }
}
