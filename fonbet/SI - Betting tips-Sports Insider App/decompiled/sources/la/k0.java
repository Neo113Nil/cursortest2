package la;

import com.google.android.gms.internal.measurement.y3;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19530b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f19531c;

    /* renamed from: d, reason: collision with root package name */
    public int f19532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19533e;

    /* renamed from: f, reason: collision with root package name */
    public Object f19534f;

    /* renamed from: g, reason: collision with root package name */
    public Object f19535g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f19536h;

    /* renamed from: i, reason: collision with root package name */
    public Object f19537i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(int i5, e3.j jVar, yc.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f19533e = i5;
        this.f19536h = jVar;
        this.f19537i = eVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19530b) {
            case 0:
                return new k0((m0) this.f19536h, this.f19533e, continuation);
            default:
                return new k0(this.f19533e, (e3.j) this.f19536h, (yc.e) this.f19537i, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19530b) {
        }
        return ((k0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5 A[Catch: Exception -> 0x00be, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:9:0x0020, B:13:0x00b5, B:21:0x0033, B:23:0x0087, B:27:0x0093, B:38:0x0055, B:41:0x0063), top: B:4:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object C0;
        Object A;
        a4.l lVar;
        List predictions;
        Iterator it;
        int i5;
        a4.l lVar2;
        Object uVar;
        String b10;
        Object A2;
        int intValue;
        Object obj2;
        Object obj3;
        int i10;
        Continuation continuation = null;
        switch (this.f19530b) {
            case 0:
                m0 m0Var = (m0) this.f19536h;
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f19532d;
                int i12 = 4;
                int i13 = 5;
                if (i11 == 0) {
                    h8.b.B(obj);
                    fb.b bVar = new fb.b();
                    this.f19532d = 1;
                    C0 = bVar.C0(this);
                    if (C0 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            h8.b.B(obj);
                            A = obj;
                            lVar = (a4.l) A;
                            if (lVar.getStatusCode() == 200 && (predictions = lVar.getPredictions()) != null) {
                                it = predictions.iterator();
                                i5 = 0;
                                while (it.hasNext()) {
                                }
                            }
                            lVar2 = lVar;
                            if (lVar2.getStatusCode() == 404) {
                            }
                            if (lVar2.getStatusCode() == 401) {
                            }
                            return new Integer(lVar2.getStatusCode());
                        }
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                lVar2 = (a4.l) this.f19534f;
                                h8.b.B(obj);
                                return new Integer(lVar2.getStatusCode());
                            }
                            lVar2 = (a4.l) this.f19534f;
                            h8.b.B(obj);
                            if (lVar2.getStatusCode() == 401) {
                                fb.b bVar2 = new fb.b();
                                this.f19534f = lVar2;
                                this.f19535g = null;
                                this.f19537i = null;
                                this.f19532d = 5;
                                if (bVar2.A0(this) == aVar) {
                                    return aVar;
                                }
                            }
                            return new Integer(lVar2.getStatusCode());
                        }
                        int i14 = this.f19531c;
                        it = (Iterator) this.f19537i;
                        m0 m0Var2 = (m0) this.f19535g;
                        a4.l lVar3 = (a4.l) this.f19534f;
                        h8.b.B(obj);
                        i5 = i14;
                        m0Var = m0Var2;
                        lVar = lVar3;
                        while (it.hasNext()) {
                            a4.i iVar = (a4.i) it.next();
                            this.f19534f = lVar;
                            this.f19535g = m0Var;
                            this.f19537i = it;
                            this.f19531c = i5;
                            this.f19532d = 3;
                            m0Var.getClass();
                            if (eg.c0.A(eg.m0.f9201a, new kd.e(iVar, m0Var, continuation, i12), this) == aVar) {
                                return aVar;
                            }
                        }
                        lVar2 = lVar;
                        if (lVar2.getStatusCode() == 404) {
                            fb.b bVar3 = new fb.b();
                            int i15 = this.f19533e;
                            this.f19534f = lVar2;
                            this.f19535g = null;
                            this.f19537i = null;
                            this.f19532d = 4;
                            lg.e eVar = eg.m0.f9201a;
                            Object A3 = eg.c0.A(lg.d.f20063c, new kb.b(bVar3, i15, continuation, i13), this);
                            if (A3 != lf.a.f20034a) {
                                A3 = Unit.f19194a;
                            }
                            if (A3 == aVar) {
                                return aVar;
                            }
                        }
                        if (lVar2.getStatusCode() == 401) {
                        }
                        return new Integer(lVar2.getStatusCode());
                    }
                    h8.b.B(obj);
                    C0 = obj;
                }
                String str = (String) C0;
                if (str == null) {
                    return new Integer(401);
                }
                na.b bVar4 = new na.b();
                int i16 = this.f19533e;
                String str2 = gc.d.f9945a;
                String c2 = d2.i.c();
                String d10 = d2.i.d();
                this.f19532d = 2;
                lg.e eVar2 = eg.m0.f9201a;
                A = eg.c0.A(lg.d.f20063c, new sa.a(bVar4, c2, d10, str, i16, null, 1), this);
                if (A == aVar) {
                    return aVar;
                }
                lVar = (a4.l) A;
                if (lVar.getStatusCode() == 200) {
                    it = predictions.iterator();
                    i5 = 0;
                    while (it.hasNext()) {
                    }
                }
                lVar2 = lVar;
                if (lVar2.getStatusCode() == 404) {
                }
                if (lVar2.getStatusCode() == 401) {
                }
                return new Integer(lVar2.getStatusCode());
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i17 = this.f19532d;
                try {
                    if (i17 == 0) {
                        h8.b.B(obj);
                        if (this.f19533e > 20) {
                            return new e3.s();
                        }
                        uVar = new e3.u();
                        Intrinsics.checkNotNullExpressionValue(uVar, "success(...)");
                        b10 = ((e3.j) this.f19536h).b("langWorkKey");
                        if (b10 == null) {
                            b10 = "en";
                        }
                        o oVar = (o) y3.m(o.class, null, 6);
                        this.f19534f = uVar;
                        this.f19535g = b10;
                        this.f19532d = 1;
                        oVar.getClass();
                        lg.e eVar3 = eg.m0.f9201a;
                        A2 = eg.c0.A(lg.d.f20063c, new androidx.lifecycle.o(oVar, b10, continuation, 22), this);
                        if (A2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i10 = this.f19531c;
                            obj3 = (e3.v) this.f19534f;
                            h8.b.B(obj);
                            intValue = i10;
                            obj2 = obj3;
                            if (intValue != 429) {
                                return obj2;
                            }
                            e3.t tVar = new e3.t();
                            Intrinsics.checkNotNullExpressionValue(tVar, "retry(...)");
                            return tVar;
                        }
                        String str3 = (String) this.f19535g;
                        Object obj4 = (e3.v) this.f19534f;
                        h8.b.B(obj);
                        b10 = str3;
                        uVar = obj4;
                        A2 = obj;
                    }
                    intValue = ((Number) A2).intValue();
                    if (200 > intValue || intValue >= 300) {
                        obj2 = uVar;
                        if (intValue != 429) {
                        }
                    } else {
                        int epochSecond = (int) Instant.now().getEpochSecond();
                        this.f19534f = uVar;
                        this.f19535g = null;
                        this.f19531c = intValue;
                        this.f19532d = 2;
                        if (s7.u.j(epochSecond, b10, this) == aVar2) {
                            return aVar2;
                        }
                        obj3 = uVar;
                        i10 = intValue;
                        intValue = i10;
                        obj2 = obj3;
                        if (intValue != 429) {
                        }
                    }
                } catch (Exception unused) {
                    e3.t tVar2 = new e3.t();
                    Intrinsics.checkNotNullExpressionValue(tVar2, "retry(...)");
                    return tVar2;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, int i5, Continuation continuation) {
        super(2, continuation);
        this.f19536h = m0Var;
        this.f19533e = i5;
    }
}
