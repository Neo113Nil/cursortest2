package me;

import androidx.lifecycle.d1;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import eg.m0;
import hg.u0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20687b;

    /* renamed from: c, reason: collision with root package name */
    public int f20688c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f20689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(c0 c0Var, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f20687b = i10;
        this.f20689d = c0Var;
        this.f20688c = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20687b) {
            case 0:
                return new w(this.f20689d, continuation, 0);
            case 1:
                return new w(this.f20689d, continuation, 1);
            case 2:
                return new w(this.f20689d, this.f20688c, continuation, 2);
            case 3:
                return new w(this.f20689d, this.f20688c, continuation, 3);
            case 4:
                return new w(this.f20689d, this.f20688c, continuation, 4);
            default:
                return new w(this.f20689d, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20687b) {
        }
        return ((w) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f20687b;
        int i10 = 5;
        int i11 = 0;
        int i12 = 3;
        int i13 = 2;
        c0 c0Var = this.f20689d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i14 = this.f20688c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    this.f20688c = 1;
                    obj = c0Var.g(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ga.a aVar2 = (ga.a) obj;
                c0Var.f20620f0.h(Boolean.valueOf(aVar2 != null));
                c0Var.f20617d0.set(false);
                c0Var.f20624h0 = aVar2 != null ? aVar2.f9909a : -1;
                c0Var.j0 = aVar2 != null ? aVar2.f9910b : null;
                c0Var.f20629l0.h(aVar2 != null ? aVar2.f9911c : null);
                return Unit.f19194a;
            case 1:
                lf.a aVar3 = lf.a.f20034a;
                int i15 = this.f20688c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    this.f20688c = 1;
                    obj = c0Var.f(this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ga.a aVar4 = (ga.a) obj;
                c0Var.f20622g0.h(Boolean.valueOf(aVar4 != null));
                c0Var.e0.set(false);
                c0Var.f20626i0 = aVar4 != null ? aVar4.f9909a : -1;
                c0Var.k0 = aVar4 != null ? aVar4.f9910b : null;
                c0Var.f20631m0.h(aVar4 != null ? aVar4.f9911c : null);
                return Unit.f19194a;
            case 2:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                l1.a aVar6 = c0Var.f20612b;
                int i16 = this.f20688c;
                aVar6.getClass();
                l1.a.r().getClass();
                id.u uVar = new id.u(io.sentry.config.a.e(((sb.j) y3.m(sb.j.class, null, 6)).f23427b.f24213a, new String[]{"favorite_table"}, new ub.d(i16, i12)), 4);
                lg.e eVar = m0.f9201a;
                lg.d dVar = lg.d.f20063c;
                c0Var.Y = u0.p(u0.n(new hg.u(u0.n(new hg.u(u0.n(uVar, dVar), new f3.n(c0Var, r10, i13), 2), dVar), new ge.o(i12, r10, 12)), dVar), d1.i(c0Var));
                return Unit.f19194a;
            case 3:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                l1.a aVar8 = c0Var.f20612b;
                int i17 = this.f20688c;
                aVar8.getClass();
                l1.a.r().getClass();
                id.p e7 = io.sentry.config.a.e(((sb.j) y3.m(sb.j.class, null, 6)).f23427b.f24213a, new String[]{PredictionTable.tableName}, new ub.d(i17, 7));
                lg.e eVar2 = m0.f9201a;
                lg.d dVar2 = lg.d.f20063c;
                c0Var.f20623h = u0.p(u0.n(new hg.u(u0.n(new hg.u(u0.n(u0.i(u0.n(new ge.q(u0.n(e7, dVar2), i10), dVar2)), dVar2), new z(c0Var, r10, i11), 2), dVar2), new ge.o(i12, r10, 13)), dVar2), d1.i(c0Var));
                return Unit.f19194a;
            case 4:
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                l1.a aVar10 = c0Var.f20612b;
                int i18 = this.f20688c;
                aVar10.getClass();
                la.m0 r5 = l1.a.r();
                r5.getClass();
                id.p e9 = io.sentry.config.a.e(((sb.j) y3.m(sb.j.class, null, 6)).f23427b.f24213a, new String[]{"prediction_meeting_table"}, new ub.d(i18, 8));
                lg.e eVar3 = m0.f9201a;
                lg.d dVar3 = lg.d.f20063c;
                c0Var.X = u0.p(u0.n(new hg.u(u0.n(new hg.u(u0.n(new bd.g(u0.n(e9, dVar3), r5, i10), m0.f9201a), new z(c0Var, r10, r9 ? 1 : 0), 2), dVar3), new ge.o(i12, r10, 14)), dVar3), d1.i(c0Var));
                return Unit.f19194a;
            default:
                lf.a aVar11 = lf.a.f20034a;
                int i19 = this.f20688c;
                if (i19 == 0) {
                    h8.b.B(obj);
                    this.f20688c = 1;
                    if (c0.e(c0Var, null, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(c0 c0Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20687b = i5;
        this.f20689d = c0Var;
    }
}
