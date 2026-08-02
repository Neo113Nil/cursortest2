package oe;

import com.google.android.gms.internal.measurement.y3;
import eg.c0;
import eg.m0;
import eg.z;
import hg.d1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import pd.v;
import rc.s;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21198b;

    /* renamed from: c, reason: collision with root package name */
    public int f21199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f21200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(k kVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21198b = i5;
        this.f21200d = kVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21198b) {
            case 0:
                return new h(this.f21200d, continuation, 0);
            case 1:
                return new h(this.f21200d, continuation, 1);
            case 2:
                return new h(this.f21200d, continuation, 2);
            default:
                return new h(this.f21200d, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21198b) {
        }
        return ((h) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f21198b;
        k kVar = this.f21200d;
        Continuation continuation = null;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f21199c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    m7.b bVar = new m7.b();
                    this.f21199c = 1;
                    if (bVar.e(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f21199c;
                int i12 = 0;
                if (i11 == 0) {
                    h8.b.B(obj);
                    m7.b bVar2 = new m7.b();
                    this.f21199c = 1;
                    lg.e eVar = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new s(bVar2, continuation, i12), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                int intValue = ((Number) obj).intValue();
                boolean z5 = 1 <= intValue && intValue < 3;
                d1 d1Var = kVar.f21217k;
                Boolean valueOf = Boolean.valueOf(z5);
                d1Var.getClass();
                d1Var.k(null, valueOf);
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i13 = this.f21199c;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                gf.k.b(new v(9));
                this.f21199c = 1;
                ((za.h) y3.m(za.h.class, null, 6)).getClass();
                Object b10 = za.h.b().b("enable_clear_data", this);
                return b10 == aVar3 ? aVar3 : b10;
            default:
                lf.a aVar4 = lf.a.f20034a;
                int i14 = this.f21199c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    lg.e eVar2 = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    h hVar = new h(kVar, continuation, 2);
                    this.f21199c = 1;
                    obj = c0.A(dVar, hVar, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                d1 d1Var2 = kVar.j;
                d1Var2.getClass();
                d1Var2.k(null, bool);
                return Unit.f19194a;
        }
    }
}
