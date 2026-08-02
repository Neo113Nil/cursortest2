package p2;

import eg.c0;
import eg.z;
import k2.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f21461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f21462c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f21463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f21464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f21465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f21466g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CoroutineContext coroutineContext, w wVar, boolean z5, boolean z7, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f21462c = coroutineContext;
        this.f21463d = wVar;
        this.f21464e = z5;
        this.f21465f = z7;
        this.f21466g = function1;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f21462c, this.f21463d, this.f21464e, this.f21465f, this.f21466g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f21461b;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            return obj;
        }
        h8.b.B(obj);
        c cVar = new c(this.f21463d, null, this.f21466g, this.f21464e, this.f21465f);
        this.f21461b = 1;
        Object A = c0.A(this.f21462c, cVar, this);
        return A == aVar ? aVar : A;
    }
}
