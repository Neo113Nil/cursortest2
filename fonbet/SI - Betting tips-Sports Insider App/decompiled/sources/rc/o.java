package rc;

import eg.c0;
import eg.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22429b;

    /* renamed from: c, reason: collision with root package name */
    public int f22430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f22431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22429b = i5;
        this.f22431d = rVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22429b) {
            case 0:
                return new o(this.f22431d, continuation, 0);
            case 1:
                return new o(this.f22431d, continuation, 1);
            default:
                return new o(this.f22431d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22429b) {
        }
        return ((o) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        boolean z5;
        Continuation continuation = null;
        int i5 = 1;
        switch (this.f22429b) {
            case 0:
                r rVar = this.f22431d;
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f22430c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    String str = gc.d.f9945a;
                    String c2 = d2.i.c();
                    this.f22430c = 1;
                    obj = c0.i(new p(c2, rVar, continuation, i5), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Boolean bool = (Boolean) obj;
                r.d().b("push_on_channel_live_passed", bool.booleanValue());
                return bool;
            case 1:
                r rVar2 = this.f22431d;
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f22430c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    fa.a d10 = r.d();
                    d10.getClass();
                    Intrinsics.checkNotNullParameter("push_on_channel_live_passed", "key");
                    int i12 = 0;
                    if (d10.f9542b.contains("push_on_channel_live_passed")) {
                        fa.a d11 = r.d();
                        d11.getClass();
                        Intrinsics.checkNotNullParameter("push_on_channel_live_passed", "key");
                        z5 = d11.f9542b.getBoolean("push_on_channel_live_passed", false);
                        return Boolean.valueOf(z5);
                    }
                    this.f22430c = 1;
                    obj = c0.i(new o(rVar2, continuation, i12), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                z5 = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z5);
            default:
                lf.a aVar3 = lf.a.f20034a;
                int i13 = this.f22430c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    r rVar3 = this.f22431d;
                    this.f22430c = 1;
                    lg.e eVar = m0.f9201a;
                    if (c0.A(lg.d.f20063c, new o(rVar3, continuation, i5), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
