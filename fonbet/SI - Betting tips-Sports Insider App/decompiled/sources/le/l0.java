package le;

import android.graphics.Color;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19864b;

    /* renamed from: c, reason: collision with root package name */
    public int f19865c;

    /* renamed from: d, reason: collision with root package name */
    public int f19866d;

    /* renamed from: e, reason: collision with root package name */
    public int f19867e;

    /* renamed from: f, reason: collision with root package name */
    public int f19868f;

    /* renamed from: g, reason: collision with root package name */
    public String f19869g;

    /* renamed from: h, reason: collision with root package name */
    public int f19870h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ eg.f0 f19871i;
    public final /* synthetic */ rd.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(eg.f0 f0Var, rd.a aVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19864b = i5;
        this.f19871i = f0Var;
        this.j = aVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19864b) {
            case 0:
                return new l0(this.f19871i, (PayExpressFragment) this.j, continuation, 0);
            default:
                return new l0(this.f19871i, (PayPremiumFragment) this.j, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19864b) {
        }
        return ((l0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int parseColor;
        Object s8;
        String str;
        Object q;
        Object t3;
        int i5;
        int i10;
        String str2;
        fg.e eVar;
        k0 k0Var;
        int i11;
        int i12;
        int i13;
        Object A;
        Object k6;
        int i14;
        int i15;
        fg.e eVar2;
        ab.b bVar;
        int i16;
        int i17;
        int i18;
        int parseColor2;
        Object r5;
        String str3;
        Object q3;
        Object s10;
        int i19;
        int i20;
        String str4;
        fg.e eVar3;
        k0 k0Var2;
        int i21;
        int i22;
        int i23;
        Object A2;
        Object k9;
        int i24;
        int i25;
        fg.e eVar4;
        ab.b bVar2;
        int i26;
        int i27;
        int i28;
        int i29 = this.f19864b;
        eg.f0 f0Var = this.f19871i;
        Continuation continuation = null;
        rd.a aVar = this.j;
        int i30 = 3;
        int i31 = 2;
        int i32 = 1;
        switch (i29) {
            case 0:
                PayExpressFragment payExpressFragment = (PayExpressFragment) aVar;
                lf.a aVar2 = lf.a.f20034a;
                switch (this.f19870h) {
                    case 0:
                        h8.b.B(obj);
                        eg.f0[] f0VarArr = {f0Var};
                        this.f19870h = 1;
                        if (eg.c0.f(f0VarArr, this) == aVar2) {
                            return aVar2;
                        }
                        this.f19870h = 2;
                        if (eg.c0.i(new d0(payExpressFragment, continuation, i30), this) == aVar2) {
                            return aVar2;
                        }
                        payExpressFragment.H().f19730f.f25205g.getClass();
                        parseColor = Color.parseColor("#F8BC28");
                        d1 H = payExpressFragment.H();
                        this.f19865c = parseColor;
                        this.f19870h = 3;
                        s8 = H.f19730f.s(this);
                        if (s8 == aVar2) {
                            return aVar2;
                        }
                        str = (String) s8;
                        d1 H2 = payExpressFragment.H();
                        this.f19869g = str;
                        this.f19865c = parseColor;
                        this.f19870h = 4;
                        q = H2.f19730f.q(this);
                        if (q == aVar2) {
                            return aVar2;
                        }
                        int intValue = ((Number) q).intValue();
                        d1 H3 = payExpressFragment.H();
                        this.f19869g = str;
                        this.f19865c = parseColor;
                        this.f19866d = intValue;
                        this.f19870h = 5;
                        t3 = H3.f19730f.t(this);
                        if (t3 == aVar2) {
                            return aVar2;
                        }
                        i5 = parseColor;
                        i10 = intValue;
                        str2 = str;
                        int intValue2 = ((Number) t3).intValue();
                        lg.e eVar5 = eg.m0.f9201a;
                        eVar = jg.q.f18523a;
                        k0Var = new k0(payExpressFragment, i5, str2, i10, intValue2, null, 0);
                        i11 = i5;
                        int i33 = i10;
                        this.f19869g = null;
                        this.f19865c = i11;
                        this.f19866d = i33;
                        this.f19867e = intValue2;
                        this.f19870h = 6;
                        if (eg.c0.A(eVar, k0Var, this) != aVar2) {
                            return aVar2;
                        }
                        i12 = i33;
                        i13 = intValue2;
                        lg.e eVar6 = eg.m0.f9201a;
                        fg.e eVar7 = jg.q.f18523a;
                        g0 g0Var = new g0(payExpressFragment, continuation, i32);
                        this.f19869g = null;
                        this.f19865c = i11;
                        this.f19866d = i12;
                        this.f19867e = i13;
                        this.f19870h = 7;
                        A = eg.c0.A(eVar7, g0Var, this);
                        if (A == aVar2) {
                            return aVar2;
                        }
                        Integer num = (Integer) A;
                        int intValue3 = num != null ? num.intValue() : 0;
                        d1 H4 = payExpressFragment.H();
                        this.f19869g = null;
                        this.f19865c = i11;
                        this.f19866d = i12;
                        this.f19867e = i13;
                        this.f19868f = intValue3;
                        this.f19870h = 8;
                        k6 = H4.f19730f.f25205g.k(intValue3, 3, this);
                        if (k6 == aVar2) {
                            return aVar2;
                        }
                        i14 = i13;
                        i15 = intValue3;
                        lg.e eVar8 = eg.m0.f9201a;
                        eVar2 = jg.q.f18523a;
                        bVar = new ab.b(payExpressFragment, (Pair) k6, null, 20);
                        this.f19869g = null;
                        this.f19865c = i11;
                        this.f19866d = i12;
                        this.f19867e = i14;
                        this.f19868f = i15;
                        this.f19870h = 9;
                        if (eg.c0.A(eVar2, bVar, this) != aVar2) {
                            return aVar2;
                        }
                        i16 = i14;
                        i17 = i12;
                        i18 = i11;
                        this.f19869g = null;
                        this.f19865c = i18;
                        this.f19866d = i17;
                        this.f19867e = i16;
                        this.f19868f = i15;
                        this.f19870h = 10;
                        Object i34 = eg.c0.i(new d0(payExpressFragment, continuation, i31), this);
                        return i34 != aVar2 ? aVar2 : i34;
                    case 1:
                        h8.b.B(obj);
                        this.f19870h = 2;
                        if (eg.c0.i(new d0(payExpressFragment, continuation, i30), this) == aVar2) {
                        }
                        payExpressFragment.H().f19730f.f25205g.getClass();
                        parseColor = Color.parseColor("#F8BC28");
                        d1 H5 = payExpressFragment.H();
                        this.f19865c = parseColor;
                        this.f19870h = 3;
                        s8 = H5.f19730f.s(this);
                        if (s8 == aVar2) {
                        }
                        str = (String) s8;
                        d1 H22 = payExpressFragment.H();
                        this.f19869g = str;
                        this.f19865c = parseColor;
                        this.f19870h = 4;
                        q = H22.f19730f.q(this);
                        if (q == aVar2) {
                        }
                        int intValue4 = ((Number) q).intValue();
                        d1 H32 = payExpressFragment.H();
                        this.f19869g = str;
                        this.f19865c = parseColor;
                        this.f19866d = intValue4;
                        this.f19870h = 5;
                        t3 = H32.f19730f.t(this);
                        if (t3 == aVar2) {
                        }
                        break;
                    case 2:
                        h8.b.B(obj);
                        payExpressFragment.H().f19730f.f25205g.getClass();
                        parseColor = Color.parseColor("#F8BC28");
                        d1 H52 = payExpressFragment.H();
                        this.f19865c = parseColor;
                        this.f19870h = 3;
                        s8 = H52.f19730f.s(this);
                        if (s8 == aVar2) {
                        }
                        str = (String) s8;
                        d1 H222 = payExpressFragment.H();
                        this.f19869g = str;
                        this.f19865c = parseColor;
                        this.f19870h = 4;
                        q = H222.f19730f.q(this);
                        if (q == aVar2) {
                        }
                        int intValue42 = ((Number) q).intValue();
                        d1 H322 = payExpressFragment.H();
                        this.f19869g = str;
                        this.f19865c = parseColor;
                        this.f19866d = intValue42;
                        this.f19870h = 5;
                        t3 = H322.f19730f.t(this);
                        if (t3 == aVar2) {
                        }
                        break;
                    case 3:
                        parseColor = this.f19865c;
                        h8.b.B(obj);
                        s8 = obj;
                        str = (String) s8;
                        d1 H2222 = payExpressFragment.H();
                        this.f19869g = str;
                        this.f19865c = parseColor;
                        this.f19870h = 4;
                        q = H2222.f19730f.q(this);
                        if (q == aVar2) {
                        }
                        int intValue422 = ((Number) q).intValue();
                        d1 H3222 = payExpressFragment.H();
                        this.f19869g = str;
                        this.f19865c = parseColor;
                        this.f19866d = intValue422;
                        this.f19870h = 5;
                        t3 = H3222.f19730f.t(this);
                        if (t3 == aVar2) {
                        }
                        break;
                    case 4:
                        parseColor = this.f19865c;
                        String str5 = this.f19869g;
                        h8.b.B(obj);
                        str = str5;
                        q = obj;
                        int intValue4222 = ((Number) q).intValue();
                        d1 H32222 = payExpressFragment.H();
                        this.f19869g = str;
                        this.f19865c = parseColor;
                        this.f19866d = intValue4222;
                        this.f19870h = 5;
                        t3 = H32222.f19730f.t(this);
                        if (t3 == aVar2) {
                        }
                        break;
                    case 5:
                        int i35 = this.f19866d;
                        int i36 = this.f19865c;
                        String str6 = this.f19869g;
                        h8.b.B(obj);
                        i10 = i35;
                        i5 = i36;
                        str2 = str6;
                        t3 = obj;
                        int intValue22 = ((Number) t3).intValue();
                        lg.e eVar52 = eg.m0.f9201a;
                        eVar = jg.q.f18523a;
                        k0Var = new k0(payExpressFragment, i5, str2, i10, intValue22, null, 0);
                        i11 = i5;
                        int i332 = i10;
                        this.f19869g = null;
                        this.f19865c = i11;
                        this.f19866d = i332;
                        this.f19867e = intValue22;
                        this.f19870h = 6;
                        if (eg.c0.A(eVar, k0Var, this) != aVar2) {
                        }
                        break;
                    case 6:
                        i13 = this.f19867e;
                        i12 = this.f19866d;
                        i11 = this.f19865c;
                        h8.b.B(obj);
                        lg.e eVar62 = eg.m0.f9201a;
                        fg.e eVar72 = jg.q.f18523a;
                        g0 g0Var2 = new g0(payExpressFragment, continuation, i32);
                        this.f19869g = null;
                        this.f19865c = i11;
                        this.f19866d = i12;
                        this.f19867e = i13;
                        this.f19870h = 7;
                        A = eg.c0.A(eVar72, g0Var2, this);
                        if (A == aVar2) {
                        }
                        Integer num2 = (Integer) A;
                        if (num2 != null) {
                        }
                        d1 H42 = payExpressFragment.H();
                        this.f19869g = null;
                        this.f19865c = i11;
                        this.f19866d = i12;
                        this.f19867e = i13;
                        this.f19868f = intValue3;
                        this.f19870h = 8;
                        k6 = H42.f19730f.f25205g.k(intValue3, 3, this);
                        if (k6 == aVar2) {
                        }
                        break;
                    case 7:
                        i13 = this.f19867e;
                        int i37 = this.f19866d;
                        int i38 = this.f19865c;
                        h8.b.B(obj);
                        i11 = i38;
                        i12 = i37;
                        A = obj;
                        Integer num22 = (Integer) A;
                        if (num22 != null) {
                        }
                        d1 H422 = payExpressFragment.H();
                        this.f19869g = null;
                        this.f19865c = i11;
                        this.f19866d = i12;
                        this.f19867e = i13;
                        this.f19868f = intValue3;
                        this.f19870h = 8;
                        k6 = H422.f19730f.f25205g.k(intValue3, 3, this);
                        if (k6 == aVar2) {
                        }
                        break;
                    case 8:
                        i15 = this.f19868f;
                        int i39 = this.f19867e;
                        int i40 = this.f19866d;
                        int i41 = this.f19865c;
                        h8.b.B(obj);
                        i11 = i41;
                        i12 = i40;
                        i14 = i39;
                        k6 = obj;
                        lg.e eVar82 = eg.m0.f9201a;
                        eVar2 = jg.q.f18523a;
                        bVar = new ab.b(payExpressFragment, (Pair) k6, null, 20);
                        this.f19869g = null;
                        this.f19865c = i11;
                        this.f19866d = i12;
                        this.f19867e = i14;
                        this.f19868f = i15;
                        this.f19870h = 9;
                        if (eg.c0.A(eVar2, bVar, this) != aVar2) {
                        }
                        break;
                    case 9:
                        i15 = this.f19868f;
                        i16 = this.f19867e;
                        i17 = this.f19866d;
                        i18 = this.f19865c;
                        h8.b.B(obj);
                        this.f19869g = null;
                        this.f19865c = i18;
                        this.f19866d = i17;
                        this.f19867e = i16;
                        this.f19868f = i15;
                        this.f19870h = 10;
                        Object i342 = eg.c0.i(new d0(payExpressFragment, continuation, i31), this);
                        if (i342 != aVar2) {
                        }
                        break;
                    case 10:
                        h8.b.B(obj);
                        return obj;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            default:
                PayPremiumFragment payPremiumFragment = (PayPremiumFragment) aVar;
                lf.a aVar3 = lf.a.f20034a;
                switch (this.f19870h) {
                    case 0:
                        h8.b.B(obj);
                        eg.f0[] f0VarArr2 = {f0Var};
                        this.f19870h = 1;
                        if (eg.c0.f(f0VarArr2, this) == aVar3) {
                            return aVar3;
                        }
                        this.f19870h = 2;
                        if (eg.c0.i(new j1(payPremiumFragment, continuation, i30), this) == aVar3) {
                            return aVar3;
                        }
                        payPremiumFragment.H().f19769f.f25124g.getClass();
                        parseColor2 = Color.parseColor("#03F39E");
                        f2 H6 = payPremiumFragment.H();
                        this.f19865c = parseColor2;
                        this.f19870h = 3;
                        r5 = H6.f19769f.r(this);
                        if (r5 == aVar3) {
                            return aVar3;
                        }
                        str3 = (String) r5;
                        f2 H7 = payPremiumFragment.H();
                        this.f19869g = str3;
                        this.f19865c = parseColor2;
                        this.f19870h = 4;
                        q3 = H7.f19769f.q(this);
                        if (q3 == aVar3) {
                            return aVar3;
                        }
                        int intValue5 = ((Number) q3).intValue();
                        f2 H8 = payPremiumFragment.H();
                        this.f19869g = str3;
                        this.f19865c = parseColor2;
                        this.f19866d = intValue5;
                        this.f19870h = 5;
                        s10 = H8.f19769f.s(this);
                        if (s10 == aVar3) {
                            return aVar3;
                        }
                        i19 = parseColor2;
                        i20 = intValue5;
                        str4 = str3;
                        int intValue6 = ((Number) s10).intValue();
                        lg.e eVar9 = eg.m0.f9201a;
                        eVar3 = jg.q.f18523a;
                        k0Var2 = new k0(payPremiumFragment, i19, str4, i20, intValue6, null, 1);
                        i21 = i19;
                        int i42 = i20;
                        this.f19869g = null;
                        this.f19865c = i21;
                        this.f19866d = i42;
                        this.f19867e = intValue6;
                        this.f19870h = 6;
                        if (eg.c0.A(eVar3, k0Var2, this) != aVar3) {
                            return aVar3;
                        }
                        i22 = i42;
                        i23 = intValue6;
                        lg.e eVar10 = eg.m0.f9201a;
                        fg.e eVar11 = jg.q.f18523a;
                        m1 m1Var = new m1(payPremiumFragment, continuation, i32);
                        this.f19869g = null;
                        this.f19865c = i21;
                        this.f19866d = i22;
                        this.f19867e = i23;
                        this.f19870h = 7;
                        A2 = eg.c0.A(eVar11, m1Var, this);
                        if (A2 == aVar3) {
                            return aVar3;
                        }
                        Integer num3 = (Integer) A2;
                        int intValue7 = num3 != null ? num3.intValue() : 0;
                        f2 H9 = payPremiumFragment.H();
                        this.f19869g = null;
                        this.f19865c = i21;
                        this.f19866d = i22;
                        this.f19867e = i23;
                        this.f19868f = intValue7;
                        this.f19870h = 8;
                        k9 = H9.f19769f.f25124g.k(intValue7, 2, this);
                        if (k9 == aVar3) {
                            return aVar3;
                        }
                        i24 = i23;
                        i25 = intValue7;
                        lg.e eVar12 = eg.m0.f9201a;
                        eVar4 = jg.q.f18523a;
                        bVar2 = new ab.b(payPremiumFragment, (Pair) k9, null, 22);
                        this.f19869g = null;
                        this.f19865c = i21;
                        this.f19866d = i22;
                        this.f19867e = i24;
                        this.f19868f = i25;
                        this.f19870h = 9;
                        if (eg.c0.A(eVar4, bVar2, this) != aVar3) {
                            return aVar3;
                        }
                        i26 = i24;
                        i27 = i22;
                        i28 = i21;
                        this.f19869g = null;
                        this.f19865c = i28;
                        this.f19866d = i27;
                        this.f19867e = i26;
                        this.f19868f = i25;
                        this.f19870h = 10;
                        Object i43 = eg.c0.i(new j1(payPremiumFragment, continuation, i31), this);
                        return i43 != aVar3 ? aVar3 : i43;
                    case 1:
                        h8.b.B(obj);
                        this.f19870h = 2;
                        if (eg.c0.i(new j1(payPremiumFragment, continuation, i30), this) == aVar3) {
                        }
                        payPremiumFragment.H().f19769f.f25124g.getClass();
                        parseColor2 = Color.parseColor("#03F39E");
                        f2 H62 = payPremiumFragment.H();
                        this.f19865c = parseColor2;
                        this.f19870h = 3;
                        r5 = H62.f19769f.r(this);
                        if (r5 == aVar3) {
                        }
                        str3 = (String) r5;
                        f2 H72 = payPremiumFragment.H();
                        this.f19869g = str3;
                        this.f19865c = parseColor2;
                        this.f19870h = 4;
                        q3 = H72.f19769f.q(this);
                        if (q3 == aVar3) {
                        }
                        int intValue52 = ((Number) q3).intValue();
                        f2 H82 = payPremiumFragment.H();
                        this.f19869g = str3;
                        this.f19865c = parseColor2;
                        this.f19866d = intValue52;
                        this.f19870h = 5;
                        s10 = H82.f19769f.s(this);
                        if (s10 == aVar3) {
                        }
                        break;
                    case 2:
                        h8.b.B(obj);
                        payPremiumFragment.H().f19769f.f25124g.getClass();
                        parseColor2 = Color.parseColor("#03F39E");
                        f2 H622 = payPremiumFragment.H();
                        this.f19865c = parseColor2;
                        this.f19870h = 3;
                        r5 = H622.f19769f.r(this);
                        if (r5 == aVar3) {
                        }
                        str3 = (String) r5;
                        f2 H722 = payPremiumFragment.H();
                        this.f19869g = str3;
                        this.f19865c = parseColor2;
                        this.f19870h = 4;
                        q3 = H722.f19769f.q(this);
                        if (q3 == aVar3) {
                        }
                        int intValue522 = ((Number) q3).intValue();
                        f2 H822 = payPremiumFragment.H();
                        this.f19869g = str3;
                        this.f19865c = parseColor2;
                        this.f19866d = intValue522;
                        this.f19870h = 5;
                        s10 = H822.f19769f.s(this);
                        if (s10 == aVar3) {
                        }
                        break;
                    case 3:
                        parseColor2 = this.f19865c;
                        h8.b.B(obj);
                        r5 = obj;
                        str3 = (String) r5;
                        f2 H7222 = payPremiumFragment.H();
                        this.f19869g = str3;
                        this.f19865c = parseColor2;
                        this.f19870h = 4;
                        q3 = H7222.f19769f.q(this);
                        if (q3 == aVar3) {
                        }
                        int intValue5222 = ((Number) q3).intValue();
                        f2 H8222 = payPremiumFragment.H();
                        this.f19869g = str3;
                        this.f19865c = parseColor2;
                        this.f19866d = intValue5222;
                        this.f19870h = 5;
                        s10 = H8222.f19769f.s(this);
                        if (s10 == aVar3) {
                        }
                        break;
                    case 4:
                        parseColor2 = this.f19865c;
                        String str7 = this.f19869g;
                        h8.b.B(obj);
                        str3 = str7;
                        q3 = obj;
                        int intValue52222 = ((Number) q3).intValue();
                        f2 H82222 = payPremiumFragment.H();
                        this.f19869g = str3;
                        this.f19865c = parseColor2;
                        this.f19866d = intValue52222;
                        this.f19870h = 5;
                        s10 = H82222.f19769f.s(this);
                        if (s10 == aVar3) {
                        }
                        break;
                    case 5:
                        int i44 = this.f19866d;
                        int i45 = this.f19865c;
                        String str8 = this.f19869g;
                        h8.b.B(obj);
                        i20 = i44;
                        i19 = i45;
                        str4 = str8;
                        s10 = obj;
                        int intValue62 = ((Number) s10).intValue();
                        lg.e eVar92 = eg.m0.f9201a;
                        eVar3 = jg.q.f18523a;
                        k0Var2 = new k0(payPremiumFragment, i19, str4, i20, intValue62, null, 1);
                        i21 = i19;
                        int i422 = i20;
                        this.f19869g = null;
                        this.f19865c = i21;
                        this.f19866d = i422;
                        this.f19867e = intValue62;
                        this.f19870h = 6;
                        if (eg.c0.A(eVar3, k0Var2, this) != aVar3) {
                        }
                        break;
                    case 6:
                        i23 = this.f19867e;
                        i22 = this.f19866d;
                        i21 = this.f19865c;
                        h8.b.B(obj);
                        lg.e eVar102 = eg.m0.f9201a;
                        fg.e eVar112 = jg.q.f18523a;
                        m1 m1Var2 = new m1(payPremiumFragment, continuation, i32);
                        this.f19869g = null;
                        this.f19865c = i21;
                        this.f19866d = i22;
                        this.f19867e = i23;
                        this.f19870h = 7;
                        A2 = eg.c0.A(eVar112, m1Var2, this);
                        if (A2 == aVar3) {
                        }
                        Integer num32 = (Integer) A2;
                        if (num32 != null) {
                        }
                        f2 H92 = payPremiumFragment.H();
                        this.f19869g = null;
                        this.f19865c = i21;
                        this.f19866d = i22;
                        this.f19867e = i23;
                        this.f19868f = intValue7;
                        this.f19870h = 8;
                        k9 = H92.f19769f.f25124g.k(intValue7, 2, this);
                        if (k9 == aVar3) {
                        }
                        break;
                    case 7:
                        i23 = this.f19867e;
                        int i46 = this.f19866d;
                        int i47 = this.f19865c;
                        h8.b.B(obj);
                        i21 = i47;
                        i22 = i46;
                        A2 = obj;
                        Integer num322 = (Integer) A2;
                        if (num322 != null) {
                        }
                        f2 H922 = payPremiumFragment.H();
                        this.f19869g = null;
                        this.f19865c = i21;
                        this.f19866d = i22;
                        this.f19867e = i23;
                        this.f19868f = intValue7;
                        this.f19870h = 8;
                        k9 = H922.f19769f.f25124g.k(intValue7, 2, this);
                        if (k9 == aVar3) {
                        }
                        break;
                    case 8:
                        i25 = this.f19868f;
                        int i48 = this.f19867e;
                        int i49 = this.f19866d;
                        int i50 = this.f19865c;
                        h8.b.B(obj);
                        i21 = i50;
                        i22 = i49;
                        i24 = i48;
                        k9 = obj;
                        lg.e eVar122 = eg.m0.f9201a;
                        eVar4 = jg.q.f18523a;
                        bVar2 = new ab.b(payPremiumFragment, (Pair) k9, null, 22);
                        this.f19869g = null;
                        this.f19865c = i21;
                        this.f19866d = i22;
                        this.f19867e = i24;
                        this.f19868f = i25;
                        this.f19870h = 9;
                        if (eg.c0.A(eVar4, bVar2, this) != aVar3) {
                        }
                        break;
                    case 9:
                        i25 = this.f19868f;
                        i26 = this.f19867e;
                        i27 = this.f19866d;
                        i28 = this.f19865c;
                        h8.b.B(obj);
                        this.f19869g = null;
                        this.f19865c = i28;
                        this.f19866d = i27;
                        this.f19867e = i26;
                        this.f19868f = i25;
                        this.f19870h = 10;
                        Object i432 = eg.c0.i(new j1(payPremiumFragment, continuation, i31), this);
                        if (i432 != aVar3) {
                        }
                        break;
                    case 10:
                        h8.b.B(obj);
                        return obj;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }
}
