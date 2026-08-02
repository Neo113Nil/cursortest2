package le;

import android.graphics.Color;
import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import com.sports.insider.ui.pays.PayPremiumFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19826b;

    /* renamed from: c, reason: collision with root package name */
    public int f19827c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PayPremiumFragment f19828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(PayPremiumFragment payPremiumFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19826b = i5;
        this.f19828d = payPremiumFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19826b) {
            case 0:
                return new i1(this.f19828d, continuation, 0);
            case 1:
                return new i1(this.f19828d, continuation, 1);
            case 2:
                return new i1(this.f19828d, continuation, 2);
            case 3:
                return new i1(this.f19828d, continuation, 3);
            default:
                return new i1(this.f19828d, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19826b) {
        }
        return ((i1) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.Unit] */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Typeface typeface;
        Typeface typeface2;
        int i5 = this.f19826b;
        Object obj2 = 0;
        Unit unit = null;
        PayPremiumFragment payPremiumFragment = this.f19828d;
        int i10 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f19827c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                int parseColor = Color.parseColor("#0957EE");
                int parseColor2 = Color.parseColor("#7B14CC");
                int parseColor3 = Color.parseColor("#AD44FF");
                lg.e eVar = eg.m0.f9201a;
                fg.e eVar2 = jg.q.f18523a;
                cd.v vVar = new cd.v(this.f19828d, parseColor3, parseColor, parseColor2, null, 2);
                this.f19827c = 1;
                Object A = eg.c0.A(eVar2, vVar, this);
                return A == aVar ? aVar : A;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i12 = this.f19827c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                PayPremiumFragment payPremiumFragment2 = this.f19828d;
                String string = payPremiumFragment2.getResources().getString(R.string.GetForecast);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = payPremiumFragment2.getResources().getString(R.string.title_vip_screenP);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                lg.e eVar3 = eg.m0.f9201a;
                fg.e eVar4 = jg.q.f18523a;
                ge.f fVar = new ge.f((Object) payPremiumFragment2, (Object) string, (Object) string2, (Continuation) null, 6);
                this.f19827c = 1;
                Object A2 = eg.c0.A(eVar4, fVar, this);
                return A2 == aVar2 ? aVar2 : A2;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i13 = this.f19827c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    try {
                        typeface = ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).b();
                    } catch (Exception unused) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        lg.e eVar5 = eg.m0.f9201a;
                        fg.e eVar6 = jg.q.f18523a;
                        k1 k1Var = new k1(payPremiumFragment, typeface, obj2, 0);
                        this.f19827c = 1;
                        if (eg.c0.A(eVar6, k1Var, this) == aVar3) {
                            return aVar3;
                        }
                    }
                    return obj2;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                obj2 = Unit.f19194a;
                return obj2;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i14 = this.f19827c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    try {
                        typeface2 = ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).a();
                    } catch (Exception unused2) {
                        typeface2 = null;
                    }
                    if (typeface2 != null) {
                        lg.e eVar7 = eg.m0.f9201a;
                        fg.e eVar8 = jg.q.f18523a;
                        k1 k1Var2 = new k1(payPremiumFragment, typeface2, obj2, i10);
                        this.f19827c = 1;
                        obj = eg.c0.A(eVar8, k1Var2, this);
                        if (obj == aVar4) {
                            return aVar4;
                        }
                    }
                    return unit;
                }
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                unit = (Unit) obj;
                return unit;
            default:
                lf.a aVar5 = lf.a.f20034a;
                int i15 = this.f19827c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    hg.d1 d1Var = da.r.f8343a;
                    androidx.lifecycle.y lifecycle = payPremiumFragment.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                    androidx.lifecycle.x xVar = androidx.lifecycle.x.f2253a;
                    hg.u uVar = new hg.u(androidx.lifecycle.d1.f(d1Var, lifecycle), new ge.o(3, obj2, 8));
                    c1.y yVar = new c1.y(3, payPremiumFragment);
                    this.f19827c = 1;
                    if (uVar.a(yVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
