package hd;

import com.google.android.gms.internal.measurement.y3;
import eg.c0;
import eg.m0;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.d0;
import la.e1;
import rc.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10500b;

    /* renamed from: c, reason: collision with root package name */
    public int f10501c;

    /* renamed from: d, reason: collision with root package name */
    public int f10502d;

    /* renamed from: e, reason: collision with root package name */
    public int f10503e;

    /* renamed from: f, reason: collision with root package name */
    public int f10504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f10506h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f10500b = i5;
        this.f10505g = obj;
        this.f10506h = obj2;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f10500b) {
            case 0:
                return new a((String) this.f10505g, (m3.f) this.f10506h, continuation, 0);
            case 1:
                return new a((ha.d) this.f10505g, (la.g) this.f10506h, continuation, 1);
            default:
                return new a((ha.d) this.f10505g, (e1) this.f10506h, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f10500b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023c A[Catch: Exception -> 0x0244, TryCatch #0 {Exception -> 0x0244, blocks: (B:70:0x014c, B:71:0x0241, B:76:0x015d, B:77:0x0222, B:83:0x023c, B:84:0x0162, B:85:0x01f2, B:88:0x016b, B:89:0x01d1, B:95:0x01ed, B:97:0x0173, B:98:0x01be, B:106:0x0180, B:110:0x018e, B:113:0x0197, B:120:0x01b7, B:121:0x01f5, B:123:0x01fd, B:130:0x021a), top: B:63:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ed A[Catch: Exception -> 0x0244, TryCatch #0 {Exception -> 0x0244, blocks: (B:70:0x014c, B:71:0x0241, B:76:0x015d, B:77:0x0222, B:83:0x023c, B:84:0x0162, B:85:0x01f2, B:88:0x016b, B:89:0x01d1, B:95:0x01ed, B:97:0x0173, B:98:0x01be, B:106:0x0180, B:110:0x018e, B:113:0x0197, B:120:0x01b7, B:121:0x01f5, B:123:0x01fd, B:130:0x021a), top: B:63:0x0140 }] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int E;
        int i5;
        int i10;
        int i11;
        int i12;
        r rVar;
        Object A;
        Object A2;
        int i13;
        int i14;
        int i15;
        y8.d dVar;
        Integer num;
        int i16;
        int i17;
        int i18;
        y8.d dVar2;
        Integer num2;
        int i19 = this.f10500b;
        Object obj2 = this.f10505g;
        switch (i19) {
            case 0:
                String str = (String) obj2;
                Object obj3 = lf.a.f20034a;
                int i20 = this.f10504f;
                Continuation continuation = null;
                if (i20 == 0) {
                    h8.b.B(obj);
                    if (str == null) {
                        return Boolean.FALSE;
                    }
                    int i21 = StringsKt.E(0, str, "CP", false) > -1 ? 1 : 0;
                    if (i21 != 0) {
                        E = StringsKt.E(0, str, "CPEnable", false);
                        if (E > -1) {
                            la.b bVar = (la.b) y3.m(la.b.class, null, 6);
                            Integer num3 = new Integer(2);
                            this.f10501c = i21;
                            this.f10502d = E;
                            this.f10504f = 1;
                            bVar.getClass();
                            Object e7 = new y8.d().e(num3, this);
                            if (e7 != obj3) {
                                e7 = Unit.f19194a;
                            }
                            if (e7 == obj3) {
                                return obj3;
                            }
                            i12 = i21;
                            rVar = new r();
                            this.f10501c = i12;
                            this.f10502d = E;
                            this.f10504f = 2;
                            if (rVar.c(true, this) == obj3) {
                            }
                            String w10 = d0.w(8, str);
                            this.f10501c = i12;
                            this.f10502d = E;
                            this.f10504f = 3;
                            lg.e eVar = m0.f9201a;
                            A = c0.A(lg.d.f20063c, new b(r6, w10, continuation), this);
                            if (A != obj3) {
                            }
                            if (A == obj3) {
                            }
                        } else {
                            int E2 = StringsKt.E(0, str, "CPDisable", false);
                            if (E2 > -1) {
                                la.b bVar2 = (la.b) y3.m(la.b.class, null, 6);
                                this.f10501c = i21;
                                this.f10502d = E;
                                this.f10503e = E2;
                                this.f10504f = 4;
                                bVar2.getClass();
                                Object e9 = new y8.d().e(null, this);
                                if (e9 != obj3) {
                                    e9 = Unit.f19194a;
                                }
                                if (e9 == obj3) {
                                    return obj3;
                                }
                                i5 = E;
                                i10 = E2;
                                i11 = i21;
                                this.f10501c = i11;
                                this.f10502d = i5;
                                this.f10503e = i10;
                                this.f10504f = 5;
                                lg.e eVar2 = m0.f9201a;
                                A2 = c0.A(lg.d.f20063c, new b(r6, "", continuation), this);
                                if (A2 == obj3) {
                                }
                                if (A2 == obj3) {
                                }
                                return Boolean.TRUE;
                            }
                        }
                    }
                    return Boolean.FALSE;
                }
                if (i20 == 1) {
                    E = this.f10502d;
                    i12 = this.f10501c;
                    h8.b.B(obj);
                    rVar = new r();
                    this.f10501c = i12;
                    this.f10502d = E;
                    this.f10504f = 2;
                    if (rVar.c(true, this) == obj3) {
                        return obj3;
                    }
                    String w102 = d0.w(8, str);
                    this.f10501c = i12;
                    this.f10502d = E;
                    this.f10504f = 3;
                    lg.e eVar3 = m0.f9201a;
                    A = c0.A(lg.d.f20063c, new b(r6, w102, continuation), this);
                    if (A != obj3) {
                    }
                    if (A == obj3) {
                    }
                } else if (i20 == 2) {
                    E = this.f10502d;
                    i12 = this.f10501c;
                    h8.b.B(obj);
                    String w1022 = d0.w(8, str);
                    this.f10501c = i12;
                    this.f10502d = E;
                    this.f10504f = 3;
                    lg.e eVar32 = m0.f9201a;
                    A = c0.A(lg.d.f20063c, new b(r6, w1022, continuation), this);
                    if (A != obj3) {
                        A = Unit.f19194a;
                    }
                    if (A == obj3) {
                        return obj3;
                    }
                } else {
                    if (i20 != 3) {
                        if (i20 != 4) {
                            if (i20 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return Boolean.TRUE;
                        }
                        i10 = this.f10503e;
                        i5 = this.f10502d;
                        i11 = this.f10501c;
                        h8.b.B(obj);
                        this.f10501c = i11;
                        this.f10502d = i5;
                        this.f10503e = i10;
                        this.f10504f = 5;
                        lg.e eVar22 = m0.f9201a;
                        A2 = c0.A(lg.d.f20063c, new b(r6, "", continuation), this);
                        if (A2 == obj3) {
                            A2 = Unit.f19194a;
                        }
                        if (A2 == obj3) {
                            return obj3;
                        }
                        return Boolean.TRUE;
                    }
                    h8.b.B(obj);
                }
                return Boolean.TRUE;
            case 1:
                ha.d dVar3 = (ha.d) obj2;
                lf.a aVar = lf.a.f20034a;
                int i22 = this.f10504f;
                if (i22 == 0) {
                    h8.b.B(obj);
                    Integer num4 = dVar3.f10460k;
                    int intValue = num4 != null ? num4.intValue() : 0;
                    Integer num5 = dVar3.f10459i;
                    r6 = num5 != null ? num5.intValue() : 0;
                    i13 = dVar3.j;
                    y8.d dVar4 = new y8.d();
                    Integer num6 = new Integer(intValue);
                    this.f10501c = intValue;
                    this.f10502d = r6;
                    this.f10503e = i13;
                    this.f10504f = 1;
                    if (dVar4.e(num6, this) == aVar) {
                        return aVar;
                    }
                    i14 = intValue;
                    i15 = r6;
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return Unit.f19194a;
                        }
                        i13 = this.f10503e;
                        i15 = this.f10502d;
                        i14 = this.f10501c;
                        h8.b.B(obj);
                        dVar = new y8.d();
                        num = new Integer(i13);
                        this.f10501c = i14;
                        this.f10502d = i15;
                        this.f10503e = i13;
                        this.f10504f = 3;
                        if (dVar.o(num, this) == aVar) {
                            return aVar;
                        }
                        return Unit.f19194a;
                    }
                    i13 = this.f10503e;
                    i15 = this.f10502d;
                    i14 = this.f10501c;
                    h8.b.B(obj);
                }
                y8.d dVar5 = new y8.d();
                Integer num7 = new Integer(i15);
                this.f10501c = i14;
                this.f10502d = i15;
                this.f10503e = i13;
                this.f10504f = 2;
                if (dVar5.h(num7, this) == aVar) {
                    return aVar;
                }
                dVar = new y8.d();
                num = new Integer(i13);
                this.f10501c = i14;
                this.f10502d = i15;
                this.f10503e = i13;
                this.f10504f = 3;
                if (dVar.o(num, this) == aVar) {
                }
                return Unit.f19194a;
            default:
                ha.d dVar6 = (ha.d) obj2;
                lf.a aVar2 = lf.a.f20034a;
                int i23 = this.f10504f;
                if (i23 == 0) {
                    h8.b.B(obj);
                    Integer num8 = dVar6.f10460k;
                    int intValue2 = num8 != null ? num8.intValue() : 0;
                    Integer num9 = dVar6.f10459i;
                    r6 = num9 != null ? num9.intValue() : 0;
                    i16 = dVar6.j;
                    y8.d dVar7 = new y8.d();
                    Integer num10 = new Integer(intValue2);
                    this.f10501c = intValue2;
                    this.f10502d = r6;
                    this.f10503e = i16;
                    this.f10504f = 1;
                    if (dVar7.e(num10, this) == aVar2) {
                        return aVar2;
                    }
                    i17 = intValue2;
                    i18 = r6;
                } else {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            if (i23 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return Unit.f19194a;
                        }
                        i16 = this.f10503e;
                        i18 = this.f10502d;
                        i17 = this.f10501c;
                        h8.b.B(obj);
                        dVar2 = new y8.d();
                        num2 = new Integer(i16);
                        this.f10501c = i17;
                        this.f10502d = i18;
                        this.f10503e = i16;
                        this.f10504f = 3;
                        if (dVar2.o(num2, this) == aVar2) {
                            return aVar2;
                        }
                        return Unit.f19194a;
                    }
                    i16 = this.f10503e;
                    i18 = this.f10502d;
                    i17 = this.f10501c;
                    h8.b.B(obj);
                }
                y8.d dVar8 = new y8.d();
                Integer num11 = new Integer(i18);
                this.f10501c = i17;
                this.f10502d = i18;
                this.f10503e = i16;
                this.f10504f = 2;
                if (dVar8.h(num11, this) == aVar2) {
                    return aVar2;
                }
                dVar2 = new y8.d();
                num2 = new Integer(i16);
                this.f10501c = i17;
                this.f10502d = i18;
                this.f10503e = i16;
                this.f10504f = 3;
                if (dVar2.o(num2, this) == aVar2) {
                }
                return Unit.f19194a;
        }
    }
}
