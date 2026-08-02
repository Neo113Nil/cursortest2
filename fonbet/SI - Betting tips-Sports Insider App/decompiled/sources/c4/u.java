package c4;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.k1;
import com.sports.insider.ui.settings.SettingFragment;
import eg.c0;
import eg.m0;
import ic.h0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import la.e1;
import la.s0;
import le.d1;
import le.f2;
import le.v0;
import le.w0;
import le.y1;
import le.z1;
import wc.j0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3620b;

    /* renamed from: c, reason: collision with root package name */
    public int f3621c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3622d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3623e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3624f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3625g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3626h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(k1 k1Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3620b = i5;
        this.f3626h = k1Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3620b) {
            case 0:
                return new u((q4.h) this.f3622d, (v) this.f3623e, (r4.i) this.f3624f, (i) this.f3625g, (m) this.f3626h, continuation, 0);
            case 1:
                return new u((s0) this.f3624f, (Integer) this.f3625g, (String) this.f3626h, continuation, 1);
            case 2:
                return new u((e1) this.f3622d, (String) this.f3623e, (String) this.f3624f, (String) this.f3625g, (String) this.f3626h, continuation, 2);
            case 3:
                return new u((le.z) this.f3626h, continuation, 3);
            case 4:
                u uVar = new u((d1) this.f3624f, (String) this.f3625g, (Activity) this.f3626h, continuation, 4);
                uVar.f3623e = obj;
                return uVar;
            case 5:
                return new u((d1) this.f3626h, continuation, 5);
            case 6:
                u uVar2 = new u((f2) this.f3624f, (String) this.f3625g, (Activity) this.f3626h, continuation, 6);
                uVar2.f3623e = obj;
                return uVar2;
            case 7:
                return new u((f2) this.f3626h, continuation, 7);
            default:
                return new u((SettingFragment) this.f3625g, (String) this.f3626h, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3620b) {
        }
        return ((u) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:349:0x07d5, code lost:
    
        if (r0 == r13) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x07b0, code lost:
    
        if (r1 != r13) goto L367;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0126  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e7;
        lf.a aVar;
        Object c2;
        gf.u uVar;
        Pair pair;
        int intValue;
        Object A;
        int intValue2;
        Object A2;
        String str;
        ic.a aVar2;
        Object f6;
        String str2;
        ic.a aVar3;
        ic.a aVar4;
        Object f10;
        String str3;
        ic.a aVar5;
        Object f11;
        String str4;
        ic.a aVar6;
        Object f12;
        le.z zVar;
        ic.a aVar7;
        Continuation continuation;
        Object A3;
        ic.a aVar8;
        ic.a aVar9;
        ic.a aVar10;
        ic.a aVar11;
        Object A4;
        ic.a aVar12;
        ic.a aVar13;
        Object d10;
        Object j;
        h0 h0Var;
        Object j6;
        h0 h0Var2;
        Object p10;
        int intValue3;
        String str5;
        ic.a aVar14;
        Object f13;
        String str6;
        ic.a aVar15;
        ic.a aVar16;
        Object f14;
        String str7;
        ic.a aVar17;
        Object f15;
        String str8;
        ic.a aVar18;
        Object f16;
        ic.a aVar19;
        ic.a aVar20;
        ic.a aVar21;
        ic.a aVar22;
        ic.a aVar23;
        Object d11;
        Object j10;
        h0 h0Var3;
        Object j11;
        h0 h0Var4;
        Object p11;
        int intValue4;
        String str9;
        ic.a aVar24;
        Object f17;
        String str10;
        ic.a aVar25;
        ic.a aVar26;
        Object f18;
        String str11;
        ic.a aVar27;
        Object f19;
        String str12;
        ic.a aVar28;
        Object f20;
        ic.a aVar29;
        ic.a aVar30;
        ic.a aVar31;
        ic.a aVar32;
        ic.a aVar33;
        Context context;
        String str13;
        Object A5;
        String str14;
        Continuation continuation2 = null;
        int i5 = 1;
        switch (this.f3620b) {
            case 0:
                lf.a aVar34 = lf.a.f20034a;
                int i10 = this.f3621c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                q4.h hVar = (q4.h) this.f3622d;
                i4.l lVar = new i4.l(hVar, ((v) this.f3623e).f3631d.f3582a, 0, hVar, (r4.i) this.f3624f, (i) this.f3625g, ((m) this.f3626h) != null);
                this.f3621c = 1;
                Object a7 = lVar.a(this);
                return a7 == aVar34 ? aVar34 : a7;
            case 1:
                String str15 = (String) this.f3626h;
                Integer num = (Integer) this.f3625g;
                s0 s0Var = (s0) this.f3624f;
                lf.a aVar35 = lf.a.f20034a;
                int i11 = this.f3621c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    this.f3621c = 1;
                    e7 = s0.e(s0Var, num, str15, this);
                    if (e7 == aVar35) {
                        aVar = aVar35;
                        return aVar;
                    }
                } else if (i11 == 1) {
                    h8.b.B(obj);
                    e7 = obj;
                } else if (i11 == 2) {
                    gf.u uVar2 = (gf.u) this.f3622d;
                    h8.b.B(obj);
                    aVar = aVar35;
                    uVar = uVar2;
                    c2 = obj;
                    pair = (Pair) c2;
                    intValue = ((Number) pair.f19192a).intValue();
                    if (intValue == 200 && intValue != 204) {
                        return pair.f19192a;
                    }
                    Integer num2 = (Integer) this.f3625g;
                    long longValue = ((Number) uVar.f10039a).longValue();
                    long longValue2 = ((Number) uVar.f10040b).longValue();
                    String str16 = (String) this.f3626h;
                    this.f3622d = uVar;
                    this.f3623e = pair;
                    this.f3621c = 3;
                    fb.b bVar = new fb.b();
                    lg.e eVar = m0.f9201a;
                    A = c0.A(lg.d.f20063c, new lb.c(bVar, num2, longValue, longValue2, str16, null), this);
                    if (A != aVar) {
                        A = Unit.f19194a;
                    }
                    if (A != aVar) {
                        A = Unit.f19194a;
                    }
                    if (A != aVar) {
                        A = Unit.f19194a;
                        break;
                    }
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        A2 = obj;
                        intValue2 = ((Number) A2).intValue();
                        return new Integer(intValue2);
                    }
                    pair = (Pair) this.f3623e;
                    uVar = (gf.u) this.f3622d;
                    h8.b.B(obj);
                    aVar = aVar35;
                    if (!((Boolean) uVar.f10041c).booleanValue()) {
                        this.f3622d = null;
                        this.f3623e = null;
                        this.f3621c = 4;
                        lg.e eVar2 = m0.f9201a;
                        A2 = c0.A(lg.d.f20063c, new u(s0Var, num, str15, null, 1), this);
                        break;
                    } else {
                        intValue2 = ((Number) pair.f19192a).intValue();
                        return new Integer(intValue2);
                    }
                }
                gf.u uVar3 = (gf.u) e7;
                long longValue3 = ((Number) uVar3.f10039a).longValue();
                long longValue4 = ((Number) uVar3.f10040b).longValue();
                String str17 = (String) this.f3626h;
                Integer num3 = (Integer) this.f3625g;
                this.f3622d = uVar3;
                this.f3621c = 2;
                aVar = aVar35;
                c2 = s0.c(s0Var, longValue3, longValue4, str17, num3, this);
                if (c2 != aVar) {
                    uVar = uVar3;
                    pair = (Pair) c2;
                    intValue = ((Number) pair.f19192a).intValue();
                    if (intValue == 200) {
                    }
                    Integer num22 = (Integer) this.f3625g;
                    long longValue5 = ((Number) uVar.f10039a).longValue();
                    long longValue22 = ((Number) uVar.f10040b).longValue();
                    String str162 = (String) this.f3626h;
                    this.f3622d = uVar;
                    this.f3623e = pair;
                    this.f3621c = 3;
                    fb.b bVar2 = new fb.b();
                    lg.e eVar3 = m0.f9201a;
                    A = c0.A(lg.d.f20063c, new lb.c(bVar2, num22, longValue5, longValue22, str162, null), this);
                    if (A != aVar) {
                    }
                    if (A != aVar) {
                    }
                    if (A != aVar) {
                    }
                }
                return aVar;
            case 2:
                lf.a aVar36 = lf.a.f20034a;
                int i12 = this.f3621c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                na.b bVar3 = new na.b();
                String str18 = (String) this.f3623e;
                String str19 = (String) this.f3624f;
                String str20 = (String) this.f3625g;
                String str21 = (String) this.f3626h;
                String str22 = gc.d.f9945a;
                String c8 = d2.i.c();
                String d12 = d2.i.d();
                this.f3621c = 1;
                Object D0 = bVar3.D0(str18, str19, str20, str21, c8, d12, this);
                return D0 == aVar36 ? aVar36 : D0;
            case 3:
                le.z zVar2 = (le.z) this.f3626h;
                com.google.firebase.messaging.x xVar = zVar2.f20027y;
                lf.a aVar37 = lf.a.f20034a;
                Continuation continuation3 = null;
                switch (this.f3621c) {
                    case 0:
                        h8.b.B(obj);
                        this.f3621c = 1;
                        if (le.z.f(zVar2, this) == aVar37) {
                            return aVar37;
                        }
                        str = zVar2.f20015l;
                        if (str == null) {
                            this.f3622d = null;
                            this.f3621c = 2;
                            ((s7.u) xVar.f6185d).getClass();
                            f6 = s7.u.f(str, this);
                            if (f6 == aVar37) {
                                return aVar37;
                            }
                            aVar2 = (ic.a) f6;
                            str2 = zVar2.f20016m;
                            if (str2 != null) {
                                this.f3622d = aVar2;
                                this.f3623e = null;
                                this.f3621c = 3;
                                ((s7.u) xVar.f6185d).getClass();
                                f10 = s7.u.f(str2, this);
                                if (f10 == aVar37) {
                                    return aVar37;
                                }
                                ic.a aVar38 = (ic.a) f10;
                                aVar3 = aVar2;
                                aVar4 = aVar38;
                                str3 = zVar2.f20017n;
                                if (str3 != null) {
                                    this.f3622d = aVar3;
                                    this.f3623e = aVar4;
                                    this.f3624f = null;
                                    this.f3621c = 4;
                                    ((s7.u) xVar.f6185d).getClass();
                                    f11 = s7.u.f(str3, this);
                                    if (f11 == aVar37) {
                                        return aVar37;
                                    }
                                    aVar5 = (ic.a) f11;
                                    str4 = zVar2.f20018o;
                                    if (str4 != null) {
                                        this.f3622d = aVar3;
                                        this.f3623e = aVar4;
                                        this.f3624f = aVar5;
                                        this.f3625g = null;
                                        this.f3621c = 5;
                                        ((s7.u) xVar.f6185d).getClass();
                                        f12 = s7.u.f(str4, this);
                                        if (f12 == aVar37) {
                                            return aVar37;
                                        }
                                        aVar6 = (ic.a) f12;
                                        ic.a aVar39 = aVar4;
                                        this.f3622d = aVar3;
                                        this.f3623e = null;
                                        this.f3624f = aVar5;
                                        this.f3625g = aVar6;
                                        this.f3621c = 6;
                                        if (aVar3 == null) {
                                            A3 = Unit.f19194a;
                                            zVar = zVar2;
                                            aVar7 = aVar3;
                                            continuation = null;
                                        } else {
                                            lg.e eVar4 = m0.f9201a;
                                            zVar = zVar2;
                                            aVar7 = aVar3;
                                            continuation = null;
                                            A3 = c0.A(jg.q.f18523a, new le.s(zVar, aVar7, aVar39, continuation3, 1), this);
                                            if (A3 != aVar37) {
                                                A3 = Unit.f19194a;
                                            }
                                        }
                                        if (A3 == aVar37) {
                                            return aVar37;
                                        }
                                        aVar8 = aVar6;
                                        aVar9 = aVar5;
                                        aVar10 = aVar7;
                                        this.f3622d = aVar10;
                                        this.f3623e = continuation;
                                        this.f3624f = aVar9;
                                        this.f3625g = continuation;
                                        this.f3621c = 7;
                                        if (aVar9 != null) {
                                            A4 = Unit.f19194a;
                                            aVar11 = aVar9;
                                        } else {
                                            lg.e eVar5 = m0.f9201a;
                                            aVar11 = aVar9;
                                            A4 = c0.A(jg.q.f18523a, new le.s(zVar, aVar11, aVar8, continuation, 0), this);
                                            if (A4 != aVar37) {
                                                A4 = Unit.f19194a;
                                            }
                                        }
                                        if (A4 != aVar37) {
                                            return aVar37;
                                        }
                                        aVar12 = aVar10;
                                        aVar13 = aVar11;
                                        if (aVar12 == null && aVar13 == null) {
                                            xVar.D(2L);
                                        }
                                        return Unit.f19194a;
                                    }
                                    aVar6 = null;
                                    ic.a aVar392 = aVar4;
                                    this.f3622d = aVar3;
                                    this.f3623e = null;
                                    this.f3624f = aVar5;
                                    this.f3625g = aVar6;
                                    this.f3621c = 6;
                                    if (aVar3 == null) {
                                    }
                                    if (A3 == aVar37) {
                                    }
                                } else {
                                    aVar5 = null;
                                    str4 = zVar2.f20018o;
                                    if (str4 != null) {
                                    }
                                }
                            } else {
                                aVar3 = aVar2;
                                aVar4 = null;
                                str3 = zVar2.f20017n;
                                if (str3 != null) {
                                }
                            }
                        } else {
                            aVar2 = null;
                            str2 = zVar2.f20016m;
                            if (str2 != null) {
                            }
                        }
                    case 1:
                        h8.b.B(obj);
                        str = zVar2.f20015l;
                        if (str == null) {
                        }
                        break;
                    case 2:
                        h8.b.B(obj);
                        f6 = obj;
                        aVar2 = (ic.a) f6;
                        str2 = zVar2.f20016m;
                        if (str2 != null) {
                        }
                        break;
                    case 3:
                        aVar2 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        f10 = obj;
                        ic.a aVar382 = (ic.a) f10;
                        aVar3 = aVar2;
                        aVar4 = aVar382;
                        str3 = zVar2.f20017n;
                        if (str3 != null) {
                        }
                        break;
                    case 4:
                        aVar4 = (ic.a) this.f3623e;
                        aVar3 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        f11 = obj;
                        aVar5 = (ic.a) f11;
                        str4 = zVar2.f20018o;
                        if (str4 != null) {
                        }
                        break;
                    case 5:
                        ic.a aVar40 = (ic.a) this.f3624f;
                        aVar4 = (ic.a) this.f3623e;
                        aVar3 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        aVar5 = aVar40;
                        f12 = obj;
                        aVar6 = (ic.a) f12;
                        ic.a aVar3922 = aVar4;
                        this.f3622d = aVar3;
                        this.f3623e = null;
                        this.f3624f = aVar5;
                        this.f3625g = aVar6;
                        this.f3621c = 6;
                        if (aVar3 == null) {
                        }
                        if (A3 == aVar37) {
                        }
                        break;
                    case 6:
                        ic.a aVar41 = (ic.a) this.f3625g;
                        aVar9 = (ic.a) this.f3624f;
                        ic.a aVar42 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        zVar = zVar2;
                        aVar8 = aVar41;
                        aVar10 = aVar42;
                        continuation = null;
                        this.f3622d = aVar10;
                        this.f3623e = continuation;
                        this.f3624f = aVar9;
                        this.f3625g = continuation;
                        this.f3621c = 7;
                        if (aVar9 != null) {
                        }
                        if (A4 != aVar37) {
                        }
                        break;
                    case 7:
                        aVar13 = (ic.a) this.f3624f;
                        aVar12 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        if (aVar12 == null) {
                            xVar.D(2L);
                        }
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            case 4:
                String str23 = (String) this.f3625g;
                d1 d1Var = (d1) this.f3624f;
                wc.v vVar = d1Var.f19730f;
                eg.z zVar3 = (eg.z) this.f3623e;
                lf.a aVar43 = lf.a.f20034a;
                int i13 = this.f3621c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    if (d1Var.f19732h.get()) {
                        c0.t(androidx.lifecycle.d1.i(d1Var), null, null, new v0(d1Var, continuation2, r14), 3);
                        c0.e(zVar3, null, new v0(d1Var, continuation2, i5), 3);
                        return Unit.f19194a;
                    }
                    this.f3623e = zVar3;
                    this.f3621c = 1;
                    d10 = vVar.d(this);
                    if (d10 == aVar43) {
                        return aVar43;
                    }
                } else if (i13 == 1) {
                    h8.b.B(obj);
                    d10 = obj;
                } else {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            p10 = obj;
                            intValue3 = ((Number) p10).intValue();
                            if (intValue3 != 200 || intValue3 == 201 || intValue3 == 204) {
                                d1.s(d1Var, d1Var.j);
                            }
                            c0.e(zVar3, null, new v0(d1Var, continuation2, i5), 3);
                            return Unit.f19194a;
                        }
                        h0Var = (h0) this.f3622d;
                        h8.b.B(obj);
                        j6 = obj;
                        h0 h0Var5 = (h0) j6;
                        h0Var2 = h0Var == null ? h0Var5 : h0Var;
                        ic.a r5 = h0Var != null ? d1.r(d1Var, h0Var.f11122b) : h0Var5 != null ? d1.r(d1Var, h0Var5.f11122b) : null;
                        if (h0Var2 != null) {
                            int i14 = d1Var.j;
                            this.f3623e = zVar3;
                            this.f3622d = null;
                            this.f3621c = 4;
                            p10 = vVar.p(h0Var2, r5, i14, this);
                            if (p10 == aVar43) {
                                return aVar43;
                            }
                            intValue3 = ((Number) p10).intValue();
                            if (intValue3 != 200) {
                            }
                            d1.s(d1Var, d1Var.j);
                            c0.e(zVar3, null, new v0(d1Var, continuation2, i5), 3);
                            return Unit.f19194a;
                        }
                        String str24 = (String) this.f3625g;
                        d1Var.f19731g = str24;
                        wc.v vVar2 = d1Var.f19730f;
                        Activity activity = (Activity) this.f3626h;
                        int i15 = d1Var.f19765b;
                        nc.f fVar = d1Var.f19738o;
                        String planId = fVar != null ? fVar.planId() : null;
                        nc.f fVar2 = d1Var.f19738o;
                        vVar2.e(activity, str24, i15, false, planId, fVar2 != null ? fVar2.offerId() : null);
                        c0.e(zVar3, lg.d.f20063c, new w0(d1Var, (Activity) this.f3626h, continuation2, r14), 2);
                        c0.e(zVar3, null, new v0(d1Var, continuation2, i5), 3);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    j = obj;
                    h0Var = (h0) j;
                    String str25 = d1Var.f19737n;
                    this.f3623e = zVar3;
                    this.f3622d = h0Var;
                    this.f3621c = 3;
                    j6 = vVar.j(str25, this);
                    if (j6 == aVar43) {
                        return aVar43;
                    }
                    h0 h0Var52 = (h0) j6;
                    if (h0Var == null) {
                    }
                    if (h0Var != null) {
                    }
                    if (h0Var2 != null) {
                    }
                }
                if (((Boolean) d10).booleanValue()) {
                    d1.q(d1Var, str23);
                    c0.e(zVar3, null, new v0(d1Var, continuation2, i5), 3);
                    return Unit.f19194a;
                }
                this.f3623e = zVar3;
                this.f3621c = 2;
                j = vVar.j(str23, this);
                if (j == aVar43) {
                    return aVar43;
                }
                h0Var = (h0) j;
                String str252 = d1Var.f19737n;
                this.f3623e = zVar3;
                this.f3622d = h0Var;
                this.f3621c = 3;
                j6 = vVar.j(str252, this);
                if (j6 == aVar43) {
                }
                h0 h0Var522 = (h0) j6;
                if (h0Var == null) {
                }
                if (h0Var != null) {
                }
                if (h0Var2 != null) {
                }
            case 5:
                d1 d1Var2 = (d1) this.f3626h;
                wc.v vVar3 = d1Var2.f19730f;
                lf.a aVar44 = lf.a.f20034a;
                switch (this.f3621c) {
                    case 0:
                        h8.b.B(obj);
                        this.f3621c = 1;
                        if (d1.p(d1Var2, this) == aVar44) {
                            return aVar44;
                        }
                        str5 = d1Var2.f19736m;
                        if (str5 == null) {
                            this.f3622d = null;
                            this.f3621c = 2;
                            s7.u uVar4 = vVar3.f25075b;
                            f13 = s7.u.f(str5, this);
                            if (f13 == aVar44) {
                                return aVar44;
                            }
                            aVar14 = (ic.a) f13;
                            str6 = d1Var2.f19737n;
                            if (str6 != null) {
                                this.f3622d = aVar14;
                                this.f3623e = null;
                                this.f3621c = 3;
                                s7.u uVar5 = vVar3.f25075b;
                                f14 = s7.u.f(str6, this);
                                if (f14 == aVar44) {
                                    return aVar44;
                                }
                                ic.a aVar45 = (ic.a) f14;
                                aVar15 = aVar14;
                                aVar16 = aVar45;
                                str7 = d1Var2.f19739p;
                                if (str7 != null) {
                                    this.f3622d = aVar15;
                                    this.f3623e = aVar16;
                                    this.f3624f = null;
                                    this.f3621c = 4;
                                    s7.u uVar6 = vVar3.f25075b;
                                    f15 = s7.u.f(str7, this);
                                    if (f15 == aVar44) {
                                        return aVar44;
                                    }
                                    aVar17 = (ic.a) f15;
                                    str8 = d1Var2.q;
                                    if (str8 != null) {
                                        this.f3622d = aVar15;
                                        this.f3623e = aVar16;
                                        this.f3624f = aVar17;
                                        this.f3625g = null;
                                        this.f3621c = 5;
                                        s7.u uVar7 = vVar3.f25075b;
                                        f16 = s7.u.f(str8, this);
                                        if (f16 == aVar44) {
                                            return aVar44;
                                        }
                                        aVar18 = (ic.a) f16;
                                        this.f3622d = aVar15;
                                        this.f3623e = null;
                                        this.f3624f = aVar17;
                                        this.f3625g = aVar18;
                                        this.f3621c = 6;
                                        if (d1Var2.t(aVar15, aVar16, this) == aVar44) {
                                            return aVar44;
                                        }
                                        aVar19 = aVar18;
                                        aVar20 = aVar17;
                                        aVar21 = aVar15;
                                        this.f3622d = aVar21;
                                        this.f3623e = null;
                                        this.f3624f = aVar20;
                                        this.f3625g = null;
                                        this.f3621c = 7;
                                        if (d1Var2.v(aVar20, aVar19, this) != aVar44) {
                                            return aVar44;
                                        }
                                        aVar22 = aVar20;
                                        aVar23 = aVar21;
                                        if (aVar23 == null && aVar22 == null) {
                                            vVar3.f(2L);
                                        }
                                        return Unit.f19194a;
                                    }
                                    aVar18 = null;
                                    this.f3622d = aVar15;
                                    this.f3623e = null;
                                    this.f3624f = aVar17;
                                    this.f3625g = aVar18;
                                    this.f3621c = 6;
                                    if (d1Var2.t(aVar15, aVar16, this) == aVar44) {
                                    }
                                } else {
                                    aVar17 = null;
                                    str8 = d1Var2.q;
                                    if (str8 != null) {
                                    }
                                }
                            } else {
                                aVar15 = aVar14;
                                aVar16 = null;
                                str7 = d1Var2.f19739p;
                                if (str7 != null) {
                                }
                            }
                        } else {
                            aVar14 = null;
                            str6 = d1Var2.f19737n;
                            if (str6 != null) {
                            }
                        }
                    case 1:
                        h8.b.B(obj);
                        str5 = d1Var2.f19736m;
                        if (str5 == null) {
                        }
                        break;
                    case 2:
                        h8.b.B(obj);
                        f13 = obj;
                        aVar14 = (ic.a) f13;
                        str6 = d1Var2.f19737n;
                        if (str6 != null) {
                        }
                        break;
                    case 3:
                        aVar14 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        f14 = obj;
                        ic.a aVar452 = (ic.a) f14;
                        aVar15 = aVar14;
                        aVar16 = aVar452;
                        str7 = d1Var2.f19739p;
                        if (str7 != null) {
                        }
                        break;
                    case 4:
                        aVar16 = (ic.a) this.f3623e;
                        ic.a aVar46 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        aVar15 = aVar46;
                        f15 = obj;
                        aVar17 = (ic.a) f15;
                        str8 = d1Var2.q;
                        if (str8 != null) {
                        }
                        break;
                    case 5:
                        ic.a aVar47 = (ic.a) this.f3624f;
                        aVar16 = (ic.a) this.f3623e;
                        ic.a aVar48 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        aVar15 = aVar48;
                        aVar17 = aVar47;
                        f16 = obj;
                        aVar18 = (ic.a) f16;
                        this.f3622d = aVar15;
                        this.f3623e = null;
                        this.f3624f = aVar17;
                        this.f3625g = aVar18;
                        this.f3621c = 6;
                        if (d1Var2.t(aVar15, aVar16, this) == aVar44) {
                        }
                        break;
                    case 6:
                        aVar19 = (ic.a) this.f3625g;
                        aVar20 = (ic.a) this.f3624f;
                        aVar21 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        this.f3622d = aVar21;
                        this.f3623e = null;
                        this.f3624f = aVar20;
                        this.f3625g = null;
                        this.f3621c = 7;
                        if (d1Var2.v(aVar20, aVar19, this) != aVar44) {
                        }
                        break;
                    case 7:
                        aVar22 = (ic.a) this.f3624f;
                        aVar23 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        if (aVar23 == null) {
                            vVar3.f(2L);
                        }
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            case 6:
                String str26 = (String) this.f3625g;
                f2 f2Var = (f2) this.f3624f;
                j0 j0Var = f2Var.f19769f;
                eg.z zVar4 = (eg.z) this.f3623e;
                lf.a aVar49 = lf.a.f20034a;
                int i16 = this.f3621c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    if (f2Var.f19771h.get()) {
                        c0.t(androidx.lifecycle.d1.i(f2Var), null, null, new y1(f2Var, continuation2, r14), 3);
                        c0.e(zVar4, null, new y1(f2Var, continuation2, i5), 3);
                        return Unit.f19194a;
                    }
                    this.f3623e = zVar4;
                    this.f3621c = 1;
                    d11 = j0Var.d(this);
                    if (d11 == aVar49) {
                        return aVar49;
                    }
                } else if (i16 == 1) {
                    h8.b.B(obj);
                    d11 = obj;
                } else {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            p11 = obj;
                            intValue4 = ((Number) p11).intValue();
                            if (intValue4 != 200 || intValue4 == 201 || intValue4 == 204) {
                                f2.s(f2Var, f2Var.j);
                            }
                            c0.e(zVar4, null, new y1(f2Var, continuation2, i5), 3);
                            return Unit.f19194a;
                        }
                        h0Var3 = (h0) this.f3622d;
                        h8.b.B(obj);
                        j11 = obj;
                        h0 h0Var6 = (h0) j11;
                        h0Var4 = h0Var3 == null ? h0Var6 : h0Var3;
                        ic.a r6 = h0Var3 != null ? f2.r(f2Var, h0Var3.f11122b) : h0Var6 != null ? f2.r(f2Var, h0Var6.f11122b) : null;
                        if (h0Var4 != null) {
                            int i17 = f2Var.j;
                            this.f3623e = zVar4;
                            this.f3622d = null;
                            this.f3621c = 4;
                            p11 = j0Var.p(h0Var4, r6, i17, this);
                            if (p11 == aVar49) {
                                return aVar49;
                            }
                            intValue4 = ((Number) p11).intValue();
                            if (intValue4 != 200) {
                            }
                            f2.s(f2Var, f2Var.j);
                            c0.e(zVar4, null, new y1(f2Var, continuation2, i5), 3);
                            return Unit.f19194a;
                        }
                        String str27 = (String) this.f3625g;
                        f2Var.f19770g = str27;
                        j0 j0Var2 = f2Var.f19769f;
                        Activity activity2 = (Activity) this.f3626h;
                        int i18 = f2Var.f19765b;
                        nc.f fVar3 = f2Var.f19778p;
                        String planId2 = fVar3 != null ? fVar3.planId() : null;
                        nc.f fVar4 = f2Var.f19778p;
                        j0Var2.e(activity2, str27, i18, false, planId2, fVar4 != null ? fVar4.offerId() : null);
                        c0.e(zVar4, lg.d.f20063c, new z1(f2Var, (Activity) this.f3626h, continuation2, r14), 2);
                        c0.e(zVar4, null, new y1(f2Var, continuation2, i5), 3);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    j10 = obj;
                    h0Var3 = (h0) j10;
                    String str28 = f2Var.f19777o;
                    this.f3623e = zVar4;
                    this.f3622d = h0Var3;
                    this.f3621c = 3;
                    j11 = j0Var.j(str28, this);
                    if (j11 == aVar49) {
                        return aVar49;
                    }
                    h0 h0Var62 = (h0) j11;
                    if (h0Var3 == null) {
                    }
                    if (h0Var3 != null) {
                    }
                    if (h0Var4 != null) {
                    }
                }
                if (((Boolean) d11).booleanValue()) {
                    f2.q(f2Var, str26);
                    c0.e(zVar4, null, new y1(f2Var, continuation2, i5), 3);
                    return Unit.f19194a;
                }
                this.f3623e = zVar4;
                this.f3621c = 2;
                j10 = j0Var.j(str26, this);
                if (j10 == aVar49) {
                    return aVar49;
                }
                h0Var3 = (h0) j10;
                String str282 = f2Var.f19777o;
                this.f3623e = zVar4;
                this.f3622d = h0Var3;
                this.f3621c = 3;
                j11 = j0Var.j(str282, this);
                if (j11 == aVar49) {
                }
                h0 h0Var622 = (h0) j11;
                if (h0Var3 == null) {
                }
                if (h0Var3 != null) {
                }
                if (h0Var4 != null) {
                }
            case 7:
                f2 f2Var2 = (f2) this.f3626h;
                j0 j0Var3 = f2Var2.f19769f;
                lf.a aVar50 = lf.a.f20034a;
                switch (this.f3621c) {
                    case 0:
                        h8.b.B(obj);
                        this.f3621c = 1;
                        if (f2.p(f2Var2, this) == aVar50) {
                            return aVar50;
                        }
                        str9 = f2Var2.f19776n;
                        if (str9 == null) {
                            this.f3622d = null;
                            this.f3621c = 2;
                            s7.u uVar8 = j0Var3.f25075b;
                            f17 = s7.u.f(str9, this);
                            if (f17 == aVar50) {
                                return aVar50;
                            }
                            aVar24 = (ic.a) f17;
                            str10 = f2Var2.f19777o;
                            if (str10 != null) {
                                this.f3622d = aVar24;
                                this.f3623e = null;
                                this.f3621c = 3;
                                s7.u uVar9 = j0Var3.f25075b;
                                f18 = s7.u.f(str10, this);
                                if (f18 == aVar50) {
                                    return aVar50;
                                }
                                ic.a aVar51 = (ic.a) f18;
                                aVar25 = aVar24;
                                aVar26 = aVar51;
                                str11 = f2Var2.q;
                                if (str11 != null) {
                                    this.f3622d = aVar25;
                                    this.f3623e = aVar26;
                                    this.f3624f = null;
                                    this.f3621c = 4;
                                    s7.u uVar10 = j0Var3.f25075b;
                                    f19 = s7.u.f(str11, this);
                                    if (f19 == aVar50) {
                                        return aVar50;
                                    }
                                    aVar27 = (ic.a) f19;
                                    str12 = f2Var2.f19779r;
                                    if (str12 != null) {
                                        this.f3622d = aVar25;
                                        this.f3623e = aVar26;
                                        this.f3624f = aVar27;
                                        this.f3625g = null;
                                        this.f3621c = 5;
                                        s7.u uVar11 = j0Var3.f25075b;
                                        f20 = s7.u.f(str12, this);
                                        if (f20 == aVar50) {
                                            return aVar50;
                                        }
                                        aVar28 = (ic.a) f20;
                                        this.f3622d = aVar25;
                                        this.f3623e = null;
                                        this.f3624f = aVar27;
                                        this.f3625g = aVar28;
                                        this.f3621c = 6;
                                        if (f2Var2.t(aVar25, aVar26, this) == aVar50) {
                                            return aVar50;
                                        }
                                        aVar29 = aVar28;
                                        aVar30 = aVar27;
                                        aVar31 = aVar25;
                                        this.f3622d = aVar31;
                                        this.f3623e = null;
                                        this.f3624f = aVar30;
                                        this.f3625g = null;
                                        this.f3621c = 7;
                                        if (f2Var2.v(aVar30, aVar29, this) != aVar50) {
                                            return aVar50;
                                        }
                                        aVar32 = aVar30;
                                        aVar33 = aVar31;
                                        if (aVar33 == null && aVar32 == null) {
                                            j0Var3.f(2L);
                                        }
                                        return Unit.f19194a;
                                    }
                                    aVar28 = null;
                                    this.f3622d = aVar25;
                                    this.f3623e = null;
                                    this.f3624f = aVar27;
                                    this.f3625g = aVar28;
                                    this.f3621c = 6;
                                    if (f2Var2.t(aVar25, aVar26, this) == aVar50) {
                                    }
                                } else {
                                    aVar27 = null;
                                    str12 = f2Var2.f19779r;
                                    if (str12 != null) {
                                    }
                                }
                            } else {
                                aVar25 = aVar24;
                                aVar26 = null;
                                str11 = f2Var2.q;
                                if (str11 != null) {
                                }
                            }
                        } else {
                            aVar24 = null;
                            str10 = f2Var2.f19777o;
                            if (str10 != null) {
                            }
                        }
                    case 1:
                        h8.b.B(obj);
                        str9 = f2Var2.f19776n;
                        if (str9 == null) {
                        }
                        break;
                    case 2:
                        h8.b.B(obj);
                        f17 = obj;
                        aVar24 = (ic.a) f17;
                        str10 = f2Var2.f19777o;
                        if (str10 != null) {
                        }
                        break;
                    case 3:
                        aVar24 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        f18 = obj;
                        ic.a aVar512 = (ic.a) f18;
                        aVar25 = aVar24;
                        aVar26 = aVar512;
                        str11 = f2Var2.q;
                        if (str11 != null) {
                        }
                        break;
                    case 4:
                        aVar26 = (ic.a) this.f3623e;
                        ic.a aVar52 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        aVar25 = aVar52;
                        f19 = obj;
                        aVar27 = (ic.a) f19;
                        str12 = f2Var2.f19779r;
                        if (str12 != null) {
                        }
                        break;
                    case 5:
                        ic.a aVar53 = (ic.a) this.f3624f;
                        aVar26 = (ic.a) this.f3623e;
                        ic.a aVar54 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        aVar25 = aVar54;
                        aVar27 = aVar53;
                        f20 = obj;
                        aVar28 = (ic.a) f20;
                        this.f3622d = aVar25;
                        this.f3623e = null;
                        this.f3624f = aVar27;
                        this.f3625g = aVar28;
                        this.f3621c = 6;
                        if (f2Var2.t(aVar25, aVar26, this) == aVar50) {
                        }
                        break;
                    case 6:
                        aVar29 = (ic.a) this.f3625g;
                        aVar30 = (ic.a) this.f3624f;
                        aVar31 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        this.f3622d = aVar31;
                        this.f3623e = null;
                        this.f3624f = aVar30;
                        this.f3625g = null;
                        this.f3621c = 7;
                        if (f2Var2.v(aVar30, aVar29, this) != aVar50) {
                        }
                        break;
                    case 7:
                        aVar32 = (ic.a) this.f3624f;
                        aVar33 = (ic.a) this.f3622d;
                        h8.b.B(obj);
                        if (aVar33 == null) {
                            j0Var3.f(2L);
                        }
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            default:
                SettingFragment settingFragment = (SettingFragment) this.f3625g;
                lf.a aVar55 = lf.a.f20034a;
                int i19 = this.f3621c;
                if (i19 == 0) {
                    h8.b.B(obj);
                    context = settingFragment.getContext();
                    if (context != null) {
                        str13 = (String) this.f3626h;
                        ec.z zVar5 = (ec.z) settingFragment.f22459a;
                        r14 = zVar5 != null ? zVar5.f9073b.getSizeAvatar() : 0;
                        if (r14 <= 0) {
                            lg.e eVar6 = m0.f9201a;
                            lg.d dVar = lg.d.f20063c;
                            ad.a aVar56 = new ad.a(context, continuation2, 19);
                            this.f3622d = settingFragment;
                            this.f3623e = str13;
                            this.f3624f = context;
                            this.f3621c = 1;
                            A5 = c0.A(dVar, aVar56, this);
                            if (A5 == aVar55) {
                                return aVar55;
                            }
                            str14 = str13;
                        }
                        SettingFragment.L(settingFragment, context, str13, r14, r14);
                    }
                    return Unit.f19194a;
                }
                if (i19 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Context context2 = (Context) this.f3624f;
                str14 = (String) this.f3623e;
                SettingFragment settingFragment2 = (SettingFragment) this.f3622d;
                h8.b.B(obj);
                context = context2;
                settingFragment = settingFragment2;
                A5 = obj;
                r14 = ((Number) A5).intValue();
                str13 = str14;
                SettingFragment.L(settingFragment, context, str13, r14, r14);
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SettingFragment settingFragment, String str, Continuation continuation) {
        super(2, continuation);
        this.f3620b = 8;
        this.f3625g = settingFragment;
        this.f3626h = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3620b = i5;
        this.f3622d = obj;
        this.f3623e = obj2;
        this.f3624f = obj3;
        this.f3625g = obj4;
        this.f3626h = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3620b = i5;
        this.f3624f = obj;
        this.f3625g = obj2;
        this.f3626h = obj3;
    }
}
