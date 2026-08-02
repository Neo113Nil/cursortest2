package la;

import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19443b;

    /* renamed from: c, reason: collision with root package name */
    public int f19444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19445d;

    /* renamed from: e, reason: collision with root package name */
    public int f19446e;

    /* renamed from: f, reason: collision with root package name */
    public Object f19447f;

    /* renamed from: g, reason: collision with root package name */
    public Object f19448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f19449h;

    /* renamed from: i, reason: collision with root package name */
    public Object f19450i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fb.b bVar, int i5, String str, String str2, String str3, int i10, String str4, Continuation continuation) {
        super(2, continuation);
        this.f19443b = 1;
        this.f19447f = bVar;
        this.f19444c = i5;
        this.f19445d = str;
        this.f19448g = str2;
        this.f19449h = str3;
        this.f19446e = i10;
        this.f19450i = str4;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19443b) {
            case 0:
                return new e((g) this.f19449h, this.f19445d, continuation);
            case 1:
                return new e((fb.b) this.f19447f, this.f19444c, this.f19445d, (String) this.f19448g, (String) this.f19449h, this.f19446e, (String) this.f19450i, continuation);
            case 2:
                return new e((wc.i) this.f19447f, (Activity) this.f19448g, this.f19445d, this.f19446e, (String) this.f19449h, (String) this.f19450i, continuation, 2);
            default:
                return new e((com.google.firebase.messaging.x) this.f19447f, (Activity) this.f19448g, this.f19445d, this.f19446e, (String) this.f19449h, (String) this.f19450i, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19443b) {
        }
        return ((e) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object C0;
        String str;
        Object w02;
        ha.a aVar;
        Integer num;
        ha.d dVar;
        Object A;
        int i5;
        bb.b bVar;
        Object A2;
        ha.a aVar2;
        g gVar;
        bb.b b10;
        int i10;
        int i11;
        int i12 = 0;
        switch (this.f19443b) {
            case 0:
                g gVar2 = (g) this.f19449h;
                lf.a aVar3 = lf.a.f20034a;
                Continuation continuation = null;
                switch (this.f19446e) {
                    case 0:
                        h8.b.B(obj);
                        bb.b bVar2 = new bb.b();
                        this.f19446e = 1;
                        C0 = bVar2.C0(this);
                        if (C0 == aVar3) {
                            return aVar3;
                        }
                        str = (String) C0;
                        if (str != null) {
                            return new ha.a(401, "Internal error access", null, null);
                        }
                        na.b bVar3 = new na.b();
                        String str2 = this.f19445d;
                        String str3 = gc.d.f9945a;
                        String c2 = d2.i.c();
                        String d10 = d2.i.d();
                        this.f19446e = 2;
                        w02 = bVar3.w0(str, str2, c2, d10, this);
                        if (w02 == aVar3) {
                            return aVar3;
                        }
                        aVar = (ha.a) w02;
                        num = aVar == null ? new Integer(aVar.f10431a) : null;
                        if (num != null && num.intValue() == 401) {
                            bVar = new bb.b();
                            this.f19447f = aVar;
                            this.f19446e = 3;
                            if (bVar.A0(this) == aVar3) {
                                return aVar3;
                            }
                        } else if (num != null && num.intValue() == 200 && (dVar = aVar.f10433c) != null) {
                            bb.b bVar4 = new bb.b();
                            String str4 = dVar.f10451a;
                            String str5 = dVar.f10455e;
                            String str6 = dVar.f10453c;
                            String str7 = dVar.f10454d;
                            this.f19447f = aVar;
                            this.f19448g = gVar2;
                            this.f19450i = dVar;
                            this.f19444c = 0;
                            this.f19446e = 4;
                            lg.e eVar = eg.m0.f9201a;
                            A = eg.c0.A(lg.d.f20063c, new d1(bVar4, str6, str7, str5, str4, null, 2), this);
                            if (A != aVar3) {
                                A = Unit.f19194a;
                            }
                            if (A != aVar3) {
                                return aVar3;
                            }
                            i5 = 0;
                            bb.b b11 = g.b(gVar2);
                            String str8 = dVar.f10456f;
                            this.f19447f = aVar;
                            this.f19448g = gVar2;
                            this.f19450i = dVar;
                            this.f19444c = i5;
                            this.f19446e = 5;
                            lg.e eVar2 = eg.m0.f9201a;
                            A2 = eg.c0.A(lg.d.f20063c, new ab.b(b11, str8, continuation, i12), this);
                            if (A2 != aVar3) {
                                A2 = Unit.f19194a;
                            }
                            if (A2 != aVar3) {
                                return aVar3;
                            }
                            aVar2 = aVar;
                            gVar = gVar2;
                            b10 = g.b(gVar);
                            i10 = dVar.f10457g;
                            i11 = dVar.f10458h;
                            this.f19447f = aVar2;
                            this.f19448g = gVar;
                            this.f19450i = dVar;
                            this.f19444c = i5;
                            this.f19446e = 6;
                            if (b10.Q0(i10, i11, this) == aVar3) {
                                return aVar3;
                            }
                            this.f19447f = aVar2;
                            this.f19448g = null;
                            this.f19450i = null;
                            this.f19444c = i5;
                            this.f19446e = 7;
                            return g.a(gVar, dVar, this) == aVar3 ? aVar3 : aVar2;
                        }
                        return aVar;
                    case 1:
                        h8.b.B(obj);
                        C0 = obj;
                        str = (String) C0;
                        if (str != null) {
                        }
                        break;
                    case 2:
                        h8.b.B(obj);
                        w02 = obj;
                        aVar = (ha.a) w02;
                        if (aVar == null) {
                        }
                        if (num != null) {
                            bVar = new bb.b();
                            this.f19447f = aVar;
                            this.f19446e = 3;
                            if (bVar.A0(this) == aVar3) {
                            }
                            return aVar;
                        }
                        if (num != null) {
                            bb.b bVar42 = new bb.b();
                            String str42 = dVar.f10451a;
                            String str52 = dVar.f10455e;
                            String str62 = dVar.f10453c;
                            String str72 = dVar.f10454d;
                            this.f19447f = aVar;
                            this.f19448g = gVar2;
                            this.f19450i = dVar;
                            this.f19444c = 0;
                            this.f19446e = 4;
                            lg.e eVar3 = eg.m0.f9201a;
                            A = eg.c0.A(lg.d.f20063c, new d1(bVar42, str62, str72, str52, str42, null, 2), this);
                            if (A != aVar3) {
                            }
                            if (A != aVar3) {
                            }
                            break;
                        }
                        return aVar;
                    case 3:
                        ha.a aVar4 = (ha.a) this.f19447f;
                        h8.b.B(obj);
                        return aVar4;
                    case 4:
                        i5 = this.f19444c;
                        dVar = (ha.d) this.f19450i;
                        gVar2 = (g) this.f19448g;
                        aVar = (ha.a) this.f19447f;
                        h8.b.B(obj);
                        bb.b b112 = g.b(gVar2);
                        String str82 = dVar.f10456f;
                        this.f19447f = aVar;
                        this.f19448g = gVar2;
                        this.f19450i = dVar;
                        this.f19444c = i5;
                        this.f19446e = 5;
                        lg.e eVar22 = eg.m0.f9201a;
                        A2 = eg.c0.A(lg.d.f20063c, new ab.b(b112, str82, continuation, i12), this);
                        if (A2 != aVar3) {
                        }
                        if (A2 != aVar3) {
                        }
                        break;
                    case 5:
                        i5 = this.f19444c;
                        dVar = (ha.d) this.f19450i;
                        gVar = (g) this.f19448g;
                        aVar2 = (ha.a) this.f19447f;
                        h8.b.B(obj);
                        b10 = g.b(gVar);
                        i10 = dVar.f10457g;
                        i11 = dVar.f10458h;
                        this.f19447f = aVar2;
                        this.f19448g = gVar;
                        this.f19450i = dVar;
                        this.f19444c = i5;
                        this.f19446e = 6;
                        if (b10.Q0(i10, i11, this) == aVar3) {
                        }
                        this.f19447f = aVar2;
                        this.f19448g = null;
                        this.f19450i = null;
                        this.f19444c = i5;
                        this.f19446e = 7;
                        if (g.a(gVar, dVar, this) == aVar3) {
                        }
                        break;
                    case 6:
                        i5 = this.f19444c;
                        dVar = (ha.d) this.f19450i;
                        gVar = (g) this.f19448g;
                        aVar2 = (ha.a) this.f19447f;
                        h8.b.B(obj);
                        this.f19447f = aVar2;
                        this.f19448g = null;
                        this.f19450i = null;
                        this.f19444c = i5;
                        this.f19446e = 7;
                        if (g.a(gVar, dVar, this) == aVar3) {
                        }
                        break;
                    case 7:
                        ha.a aVar42 = (ha.a) this.f19447f;
                        h8.b.B(obj);
                        return aVar42;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            case 1:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                rb.g P0 = fb.b.P0();
                int i13 = this.f19444c;
                String str9 = this.f19445d;
                String str10 = (String) this.f19448g;
                String str11 = (String) this.f19449h;
                int i14 = this.f19446e;
                String str12 = (String) this.f19450i;
                rb.e eVar4 = P0.f22382a;
                k2.w wVar = eVar4.f22378a;
                k2.w wVar2 = eVar4.f22378a;
                if (((Number) f3.x.n0(wVar, true, false, new eb.b(i13, 15))).intValue() > 0) {
                    f3.x.n0(wVar2, false, true, new rb.c(str9, str12, str11, str10, i14, i13, 2));
                } else {
                    f3.x.n0(wVar2, false, true, new rb.c(i13, str9, i14, str12, str10, str11, 1));
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar6 = lf.a.f20034a;
                int i15 = this.f19444c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    ((wc.i) this.f19447f).getClass();
                    pc.u a7 = wc.i.a();
                    Activity activity = (Activity) this.f19448g;
                    String str13 = this.f19445d;
                    int i16 = this.f19446e;
                    String str14 = (String) this.f19449h;
                    String str15 = (String) this.f19450i;
                    this.f19444c = 1;
                    if (a7.t(activity, str13, 2, i16, str14, str15, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar7 = lf.a.f20034a;
                int i17 = this.f19444c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    ((com.google.firebase.messaging.x) this.f19447f).getClass();
                    pc.u v5 = com.google.firebase.messaging.x.v();
                    Activity activity2 = (Activity) this.f19448g;
                    String str16 = this.f19445d;
                    int i18 = this.f19446e;
                    String str17 = (String) this.f19449h;
                    String str18 = (String) this.f19450i;
                    this.f19444c = 1;
                    if (v5.t(activity2, str16, 2, i18, str17, str18, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Activity activity, String str, int i5, String str2, String str3, Continuation continuation, int i10) {
        super(2, continuation);
        this.f19443b = i10;
        this.f19447f = obj;
        this.f19448g = activity;
        this.f19445d = str;
        this.f19446e = i5;
        this.f19449h = str2;
        this.f19450i = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f19443b = 0;
        this.f19449h = gVar;
        this.f19445d = str;
    }
}
