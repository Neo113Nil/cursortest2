package p2;

import eg.z;
import k2.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f21456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f21457c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f21459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f21460f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w wVar, Continuation continuation, Function1 function1, boolean z5, boolean z7) {
        super(2, continuation);
        this.f21457c = wVar;
        this.f21458d = z5;
        this.f21459e = z7;
        this.f21460f = function1;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        boolean z5 = this.f21459e;
        return new c(this.f21457c, continuation, this.f21460f, this.f21458d, z5);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f21456b;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            return obj;
        }
        h8.b.B(obj);
        w wVar = this.f21457c;
        boolean z5 = !(wVar.k() && wVar.l()) && this.f21458d;
        w wVar2 = this.f21457c;
        Function1 function1 = this.f21460f;
        boolean z7 = this.f21459e;
        b bVar = new b(wVar2, null, function1, z5, z7);
        this.f21456b = 1;
        Object s8 = wVar2.s(z7, bVar, this);
        return s8 == aVar ? aVar : s8;
    }
}
