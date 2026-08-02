package qd;

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import eg.b2;
import eg.c0;
import eg.l;
import eg.m0;
import eg.r;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.y;
import mf.i;
import oi.w;
import t0.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22102b;

    /* renamed from: c, reason: collision with root package name */
    public int f22103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f22104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f22105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(r rVar, e eVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22102b = i5;
        this.f22104d = rVar;
        this.f22105e = eVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22102b) {
            case 0:
                return new d(this.f22105e, this.f22104d, continuation, 0);
            case 1:
                return new d(this.f22104d, this.f22105e, continuation, 1);
            case 2:
                return new d(this.f22105e, this.f22104d, continuation, 2);
            default:
                return new d(this.f22104d, this.f22105e, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22102b) {
        }
        return ((d) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        boolean Q;
        int i5 = this.f22102b;
        int i10 = 0;
        int i11 = 3;
        Continuation continuation = null;
        e eVar = this.f22105e;
        r rVar = this.f22104d;
        int i12 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i13 = this.f22103c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    eVar.getClass();
                    Context context = eVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(context, "context");
                    t0.a request = new t0.a();
                    this.f22103c = 1;
                    l lVar = new l(1, lf.d.b(this));
                    lVar.s();
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    lVar.u(new t0.h(cancellationSignal, 0));
                    w callback = new w(lVar, 3);
                    o.a executor = new o.a(1);
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(executor, "executor");
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    k c2 = b2.e.c(new b2.e(context, 6), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                    if (c2 == null) {
                        callback.a(new u0.a());
                    } else {
                        c2.onClearCredential(request, cancellationSignal, executor, callback);
                    }
                    Object r5 = lVar.r();
                    if (r5 == aVar) {
                        Intrinsics.checkNotNullParameter(this, "frame");
                    }
                    if (r5 != aVar) {
                        r5 = Unit.f19194a;
                    }
                    if (r5 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Boolean.valueOf(rVar.Q(Boolean.TRUE));
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i14 = this.f22103c;
                try {
                    if (i14 == 0) {
                        h8.b.B(obj);
                        d dVar = new d(eVar, rVar, continuation, i10);
                        this.f22103c = 1;
                        obj = b2.c(30000L, dVar, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    Boolean bool = (Boolean) obj;
                    Q = bool != null ? bool.booleanValue() : rVar.Q(Boolean.FALSE);
                } catch (Exception unused) {
                    Q = rVar.Q(Boolean.FALSE);
                }
                return Boolean.valueOf(Q);
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i15 = this.f22103c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    if (Build.VERSION.SDK_INT < 34) {
                        this.f22103c = 2;
                        eVar.getClass();
                        lg.e eVar2 = m0.f9201a;
                        if (c0.A(lg.d.f20063c, new d(rVar, eVar, continuation, i11), this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        this.f22103c = 1;
                        eVar.getClass();
                        lg.e eVar3 = m0.f9201a;
                        if (c0.A(lg.d.f20063c, new d(rVar, eVar, continuation, i12), this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i15 != 1 && i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar4 = lf.a.f20034a;
                int i16 = this.f22103c;
                try {
                    if (i16 == 0) {
                        h8.b.B(obj);
                        y yVar = new y(eVar, rVar, null, 18);
                        this.f22103c = 1;
                        obj = b2.c(30000L, yVar, this);
                        if (obj == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return obj == null ? Boolean.valueOf(rVar.Q(Boolean.FALSE)) : obj;
                } catch (Exception unused2) {
                    return Boolean.valueOf(rVar.Q(Boolean.FALSE));
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, r rVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22102b = i5;
        this.f22105e = eVar;
        this.f22104d = rVar;
    }
}
