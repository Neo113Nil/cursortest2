package bd;

import c1.a1;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.data.room.general.table.AccountTable;
import e3.o;
import eg.b2;
import eg.c0;
import eg.m0;
import eg.z;
import hg.u0;
import id.p;
import io.appmetrica.analytics.impl.C0122e9;
import j$.time.Instant;
import k2.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import me.y;
import rc.n;
import rc.r;
import s7.s;
import s7.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3137b;

    /* renamed from: c, reason: collision with root package name */
    public int f3138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i5, Continuation continuation, int i10) {
        super(i5, continuation);
        this.f3137b = i10;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3137b) {
            case 0:
                return new b(2, continuation, 0);
            case 1:
                return new b(2, continuation, 1);
            case 2:
                b bVar = new b(2, continuation, 2);
                bVar.f3138c = ((Number) obj).intValue();
                return bVar;
            case 3:
                return new b(2, continuation, 3);
            case 4:
                return new b(2, continuation, 4);
            case 5:
                return new b(2, continuation, 5);
            case 6:
                return new b(2, continuation, 6);
            case 7:
                return new b(2, continuation, 7);
            case 8:
                return new b(2, continuation, 8);
            case 9:
                return new b(2, continuation, 9);
            case 10:
                return new b(2, continuation, 10);
            case 11:
                return new b(2, continuation, 11);
            case 12:
                return new b(2, continuation, 12);
            case 13:
                return new b(2, continuation, 13);
            case 14:
                return new b(2, continuation, 14);
            case 15:
                return new b(2, continuation, 15);
            case 16:
                return new b(2, continuation, 16);
            case 17:
                return new b(2, continuation, 17);
            case 18:
                return new b(2, continuation, 18);
            case 19:
                return new b(2, continuation, 19);
            case 20:
                return new b(2, continuation, 20);
            case 21:
                return new b(2, continuation, 21);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new b(2, continuation, 22);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new b(2, continuation, 23);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new b(2, continuation, 24);
            case C0122e9.F /* 25 */:
                return new b(2, continuation, 25);
            default:
                return new b(2, continuation, 26);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3137b) {
            case 2:
                break;
        }
        return ((b) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c2;
        Object e7;
        m3.f fVar;
        int i5 = 22;
        int i10 = 16;
        int i11 = 28;
        boolean z5 = false;
        Continuation continuation = null;
        int i12 = 1;
        switch (this.f3137b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i13 = this.f3138c;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                io.sentry.hints.j jVar = new io.sentry.hints.j(i11);
                this.f3138c = 1;
                lg.e eVar = m0.f9201a;
                Object A = c0.A(lg.d.f20063c, new ld.a(jVar, continuation, 4), this);
                return A == aVar ? aVar : A;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i14 = this.f3138c;
                try {
                    if (i14 == 0) {
                        h8.b.B(obj);
                        a1 a1Var = new a1(2, continuation, i12);
                        this.f3138c = 1;
                        c2 = b2.c(3000L, a1Var, this);
                        if (c2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        c2 = obj;
                    }
                } catch (Exception unused) {
                }
                if (((Boolean) c2) == null) {
                    return Boolean.FALSE;
                }
                z5 = true;
                return Boolean.valueOf(z5);
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return Boolean.valueOf(this.f3138c > 0);
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i15 = this.f3138c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    r rVar = new r();
                    this.f3138c = 1;
                    e7 = rVar.e(this);
                    if (e7 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    e7 = obj;
                }
                int intValue = ((Number) e7).intValue();
                mc.a aVar5 = mc.a.f20526a;
                if (intValue != 0) {
                    mc.a aVar6 = mc.a.f20527b;
                    if (intValue == 1) {
                        return aVar6;
                    }
                    if (intValue == 3) {
                        return mc.a.f20528c;
                    }
                }
                return aVar5;
            case 4:
                lf.a aVar7 = lf.a.f20034a;
                int i16 = this.f3138c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    m3.f fVar2 = new m3.f(i12);
                    this.f3138c = 1;
                    lg.e eVar2 = m0.f9201a;
                    if (c0.A(lg.d.f20063c, new ad.a(fVar2, continuation, z5 ? 1 : 0), this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 5:
                lf.a aVar8 = lf.a.f20034a;
                int i17 = this.f3138c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    m3.f fVar3 = new m3.f(i11);
                    this.f3138c = 1;
                    lg.e eVar3 = m0.f9201a;
                    if (c0.A(lg.d.f20063c, new ad.a(fVar3, continuation, 13), this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 6:
                lf.a aVar9 = lf.a.f20034a;
                int i18 = this.f3138c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    t tVar = new t(i10);
                    this.f3138c = 1;
                    o oVar = o.f8551a;
                    lg.e eVar4 = m0.f9201a;
                    Object A2 = c0.A(lg.d.f20063c, new y(tVar, oVar, continuation, i5), this);
                    Object obj2 = A2;
                    if (A2 != aVar9) {
                        obj2 = Unit.f19194a;
                    }
                    if (obj2 != aVar9) {
                        obj2 = Unit.f19194a;
                    }
                    if (obj2 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 7:
                Object obj3 = lf.a.f20034a;
                int i19 = this.f3138c;
                if (i19 == 0) {
                    h8.b.B(obj);
                    r rVar2 = new r();
                    long epochMilli = Instant.now().toEpochMilli();
                    this.f3138c = 1;
                    lg.e eVar5 = m0.f9201a;
                    Object A3 = c0.A(lg.d.f20063c, new n(rVar2, epochMilli, null, 1), this);
                    Object obj4 = A3;
                    if (A3 != obj3) {
                        obj4 = Unit.f19194a;
                    }
                    if (obj4 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 8:
                lf.a aVar10 = lf.a.f20034a;
                int i20 = this.f3138c;
                if (i20 == 0) {
                    h8.b.B(obj);
                    md.o oVar2 = new md.o(z5 ? 1 : 0);
                    this.f3138c = 1;
                    lg.e eVar6 = m0.f9201a;
                    if (c0.A(lg.d.f20063c, new ad.a(oVar2, continuation, 14), this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 9:
                lf.a aVar11 = lf.a.f20034a;
                int i21 = this.f3138c;
                if (i21 == 0) {
                    h8.b.B(obj);
                    this.f3138c = 1;
                    if (c0.j(500L, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 10:
                Object obj5 = lf.a.f20034a;
                int i22 = this.f3138c;
                try {
                    if (i22 == 0) {
                        h8.b.B(obj);
                        m7.b bVar = new m7.b(2);
                        this.f3138c = 1;
                        o oVar3 = o.f8551a;
                        lg.e eVar7 = m0.f9201a;
                        Object A4 = c0.A(lg.d.f20063c, new ad.a(bVar, null), this);
                        if ((A4 == obj5 ? A4 : Unit.f19194a) == obj5) {
                            return obj5;
                        }
                    } else {
                        if (i22 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (Exception e9) {
                    zc.d.b(4, "testPushNotification", e9);
                }
                return Unit.f19194a;
            case 11:
                lf.a aVar12 = lf.a.f20034a;
                int i23 = this.f3138c;
                if (i23 == 0) {
                    h8.b.B(obj);
                    ((la.a) y3.m(la.a.class, null, 6)).getClass();
                    p e10 = io.sentry.config.a.e(((sb.j) y3.m(sb.j.class, null, 6)).f23426a.f23832a, new String[]{AccountTable.tableName}, new d0(21));
                    lg.e eVar8 = m0.f9201a;
                    hg.g n9 = u0.n(e10, lg.d.f20063c);
                    pd.j jVar2 = pd.j.f21771b;
                    this.f3138c = 1;
                    Object a7 = n9.a(new c1.t(jVar2, 23), this);
                    if (a7 != aVar12) {
                        a7 = Unit.f19194a;
                    }
                    if (a7 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 12:
                lf.a aVar13 = lf.a.f20034a;
                int i24 = this.f3138c;
                if (i24 == 0) {
                    h8.b.B(obj);
                    ((la.a) y3.m(la.a.class, null, 6)).getClass();
                    p e11 = io.sentry.config.a.e(((sb.j) y3.m(sb.j.class, null, 6)).f23426a.f23832a, new String[]{AccountTable.tableName}, new d0(21));
                    lg.e eVar9 = m0.f9201a;
                    hg.g n10 = u0.n(e11, lg.d.f20063c);
                    pd.j jVar3 = pd.j.f21772c;
                    this.f3138c = 1;
                    Object a10 = n10.a(new c1.t(jVar3, 24), this);
                    if (a10 != aVar13) {
                        a10 = Unit.f19194a;
                    }
                    if (a10 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 13:
                lf.a aVar14 = lf.a.f20034a;
                int i25 = this.f3138c;
                if (i25 == 0) {
                    h8.b.B(obj);
                    ((la.a) y3.m(la.a.class, null, 6)).getClass();
                    p e12 = io.sentry.config.a.e(((sb.j) y3.m(sb.j.class, null, 6)).f23426a.f23832a, new String[]{AccountTable.tableName}, new d0(21));
                    lg.e eVar10 = m0.f9201a;
                    hg.g n11 = u0.n(e12, lg.d.f20063c);
                    pd.j jVar4 = pd.j.f21773d;
                    this.f3138c = 1;
                    Object a11 = n11.a(new c1.t(jVar4, 25), this);
                    if (a11 != aVar14) {
                        a11 = Unit.f19194a;
                    }
                    if (a11 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 14:
                lf.a aVar15 = lf.a.f20034a;
                int i26 = this.f3138c;
                if (i26 == 0) {
                    h8.b.B(obj);
                    ((la.a) y3.m(la.a.class, null, 6)).getClass();
                    p e13 = io.sentry.config.a.e(((sb.j) y3.m(sb.j.class, null, 6)).f23426a.f23832a, new String[]{AccountTable.tableName}, new d0(21));
                    lg.e eVar11 = m0.f9201a;
                    hg.g n12 = u0.n(e13, lg.d.f20063c);
                    pd.j jVar5 = pd.j.f21774e;
                    this.f3138c = 1;
                    Object a12 = n12.a(new c1.t(jVar5, 26), this);
                    if (a12 != aVar15) {
                        a12 = Unit.f19194a;
                    }
                    if (a12 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 15:
                Object obj6 = lf.a.f20034a;
                int i27 = this.f3138c;
                if (i27 == 0) {
                    h8.b.B(obj);
                    this.f3138c = 1;
                    if (c0.j(5000L, this) == obj6) {
                        return obj6;
                    }
                } else {
                    if (i27 != 1) {
                        if (i27 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                yc.e eVar12 = new yc.e();
                this.f3138c = 2;
                lg.e eVar13 = m0.f9201a;
                Object A5 = c0.A(lg.d.f20063c, new td.b(eVar12, continuation, 9), this);
                Object obj7 = A5;
                if (A5 != obj6) {
                    obj7 = Unit.f19194a;
                }
                if (obj7 == obj6) {
                    return obj6;
                }
                return Unit.f19194a;
            case 16:
                lf.a aVar16 = lf.a.f20034a;
                int i28 = this.f3138c;
                if (i28 == 0) {
                    h8.b.B(obj);
                    lg.e eVar14 = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    b bVar2 = new b(2, continuation, 15);
                    this.f3138c = 1;
                    if (c0.A(dVar, bVar2, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 17:
                lf.a aVar17 = lf.a.f20034a;
                int i29 = this.f3138c;
                if (i29 == 0) {
                    h8.b.B(obj);
                    m3.f fVar4 = new m3.f(11);
                    this.f3138c = 1;
                    lg.e eVar15 = m0.f9201a;
                    if (c0.A(lg.d.f20063c, new ad.a(fVar4, continuation, 4), this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i29 != 1) {
                        if (i29 != 2) {
                            if (i29 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return Unit.f19194a;
                        }
                        h8.b.B(obj);
                        fVar = new m3.f(14);
                        this.f3138c = 3;
                        lg.e eVar16 = m0.f9201a;
                        if (c0.A(lg.d.f20063c, new ad.a(fVar, continuation, 6), this) == aVar17) {
                            return aVar17;
                        }
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                this.f3138c = 2;
                lg.e eVar17 = m0.f9201a;
                if (c0.A(lg.d.f20063c, new ad.a(new y8.d(), continuation, 2), this) == aVar17) {
                    return aVar17;
                }
                fVar = new m3.f(14);
                this.f3138c = 3;
                lg.e eVar162 = m0.f9201a;
                if (c0.A(lg.d.f20063c, new ad.a(fVar, continuation, 6), this) == aVar17) {
                }
                return Unit.f19194a;
            case 18:
                lf.a aVar18 = lf.a.f20034a;
                int i30 = this.f3138c;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                s sVar = new s(i10);
                this.f3138c = 1;
                Object f6 = sVar.f(this);
                return f6 == aVar18 ? aVar18 : f6;
            case 19:
                lf.a aVar19 = lf.a.f20034a;
                int i31 = this.f3138c;
                if (i31 == 0) {
                    h8.b.B(obj);
                    t tVar2 = new t(i10);
                    this.f3138c = 1;
                    o oVar4 = o.f8551a;
                    lg.e eVar18 = m0.f9201a;
                    Object A6 = c0.A(lg.d.f20063c, new y(tVar2, oVar4, continuation, i5), this);
                    Object obj8 = A6;
                    if (A6 != aVar19) {
                        obj8 = Unit.f19194a;
                    }
                    if (obj8 != aVar19) {
                        obj8 = Unit.f19194a;
                    }
                    if (obj8 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 20:
                Object obj9 = lf.a.f20034a;
                int i32 = this.f3138c;
                if (i32 == 0) {
                    h8.b.B(obj);
                    sc.h hVar = new sc.h();
                    this.f3138c = 1;
                    lg.e eVar19 = m0.f9201a;
                    Object A7 = c0.A(lg.d.f20063c, new sc.c(hVar, continuation, i12), this);
                    Object obj10 = A7;
                    if (A7 != obj9) {
                        obj10 = Unit.f19194a;
                    }
                    if (obj10 == obj9) {
                        return obj9;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 21:
                lf.a aVar20 = lf.a.f20034a;
                int i33 = this.f3138c;
                if (i33 == 0) {
                    h8.b.B(obj);
                    this.f3138c = 1;
                    if (c0.j(100L, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                lf.a aVar21 = lf.a.f20034a;
                int i34 = this.f3138c;
                if (i34 == 0) {
                    h8.b.B(obj);
                    this.f3138c = 1;
                    if (c0.j(100L, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                lf.a aVar22 = lf.a.f20034a;
                int i35 = this.f3138c;
                if (i35 == 0) {
                    h8.b.B(obj);
                    this.f3138c = 1;
                    if (c0.j(500L, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                lf.a aVar23 = lf.a.f20034a;
                int i36 = this.f3138c;
                if (i36 == 0) {
                    h8.b.B(obj);
                    sc.h hVar2 = new sc.h();
                    this.f3138c = 1;
                    lg.e eVar20 = m0.f9201a;
                    if (c0.A(lg.d.f20063c, new sc.c(hVar2, continuation, z5 ? 1 : 0), this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case C0122e9.F /* 25 */:
                lf.a aVar24 = lf.a.f20034a;
                int i37 = this.f3138c;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                io.sentry.hints.j jVar6 = new io.sentry.hints.j(i11);
                this.f3138c = 1;
                Object D = jVar6.D(this);
                return D == aVar24 ? aVar24 : D;
            default:
                lf.a aVar25 = lf.a.f20034a;
                int i38 = this.f3138c;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                r rVar3 = new r();
                this.f3138c = 1;
                Object a13 = rVar3.a(this);
                return a13 == aVar25 ? aVar25 : a13;
        }
    }
}
