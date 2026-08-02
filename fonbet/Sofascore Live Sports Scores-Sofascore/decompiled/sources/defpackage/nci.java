package defpackage;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PendingPurchasesParams;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.sofascore.results.service.StartWorker;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nci extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ StartWorker t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nci(StartWorker startWorker, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = startWorker;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        StartWorker startWorker = this.t;
        switch (i) {
            case 0:
                return new nci(startWorker, rq3Var, 0);
            case 1:
                return new nci(startWorker, rq3Var, 1);
            case 2:
                return new nci(startWorker, rq3Var, 2);
            case 3:
                return new nci(startWorker, rq3Var, 3);
            case 4:
                return new nci(startWorker, rq3Var, 4);
            case 5:
                return new nci(startWorker, rq3Var, 5);
            case 6:
                return new nci(startWorker, rq3Var, 6);
            case 7:
                return new nci(startWorker, rq3Var, 7);
            case 8:
                return new nci(startWorker, rq3Var, 8);
            case 9:
                return new nci(startWorker, rq3Var, 9);
            case 10:
                return new nci(startWorker, rq3Var, 10);
            case 11:
                return new nci(startWorker, rq3Var, 11);
            case 12:
                return new nci(startWorker, rq3Var, 12);
            case 13:
                return new nci(startWorker, rq3Var, 13);
            default:
                return new nci(startWorker, rq3Var, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((nci) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = 18;
        int i3 = 5;
        int i4 = 11;
        StartWorker startWorker = this.t;
        int i5 = 2;
        switch (i) {
            case 0:
                Object obj2 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    e64 e64Var = startWorker.i;
                    long j = currentTimeMillis - gl3.a;
                    this.s = 1;
                    Object U = gz8.U(this, e64Var.a.a, false, true, new yz(j, i4));
                    if (U != obj2) {
                        U = Unit.a;
                    }
                    if (U != obj2) {
                        U = Unit.a;
                    }
                    if (U == obj2) {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                Object obj3 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    fyk fykVar = startWorker.c;
                    this.s = 1;
                    fykVar.getClass();
                    Object U2 = gz8.U(this, fykVar.a.a, false, true, new prd(LocalDate.now(ZoneId.systemDefault()).atStartOfDay(ZoneId.systemDefault()).plusDays(-90L).toEpochSecond(), 7));
                    if (U2 != obj3) {
                        U2 = Unit.a;
                    }
                    if (U2 != obj3) {
                        U2 = Unit.a;
                    }
                    if (U2 == obj3) {
                        break;
                    }
                } else if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                Object obj4 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    zte zteVar = startWorker.d;
                    this.s = 1;
                    zteVar.getClass();
                    Object U3 = gz8.U(this, zteVar.a.a, false, true, new prd(LocalDate.now(ZoneId.systemDefault()).atStartOfDay(ZoneId.systemDefault()).plusDays(-90L).toEpochSecond(), i5));
                    if (U3 != obj4) {
                        U3 = Unit.a;
                    }
                    if (U3 != obj4) {
                        U3 = Unit.a;
                    }
                    if (U3 == obj4) {
                        break;
                    }
                } else if (i8 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 3:
                Object obj5 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    irk irkVar = startWorker.e;
                    this.s = 1;
                    erk erkVar = irkVar.a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    calendar.add(5, -7);
                    Object U4 = gz8.U(this, erkVar.a, false, true, new prd(calendar.getTimeInMillis() / 1000, 6));
                    if (U4 != obj5) {
                        U4 = Unit.a;
                    }
                    if (U4 != obj5) {
                        U4 = Unit.a;
                    }
                    if (U4 == obj5) {
                        break;
                    }
                } else if (i9 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 4:
                Object obj6 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    cs2 cs2Var = startWorker.f;
                    this.s = 1;
                    cs2Var.getClass();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.set(11, 0);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                    calendar2.add(5, -10);
                    Object U5 = gz8.U(this, cs2Var.a.a, false, true, new yz(calendar2.getTimeInMillis() / 1000, 7));
                    if (U5 != obj6) {
                        U5 = Unit.a;
                    }
                    if (U5 != obj6) {
                        U5 = Unit.a;
                    }
                    if (U5 == obj6) {
                        break;
                    }
                } else if (i10 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 5:
                Object obj7 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    z3k z3kVar = startWorker.g;
                    this.s = 1;
                    r3k r3kVar = z3kVar.a;
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.set(11, 0);
                    calendar3.set(12, 0);
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                    calendar3.add(5, -7);
                    Object U6 = gz8.U(this, r3kVar.a, false, true, new prd(calendar3.getTimeInMillis() / 1000, i3));
                    if (U6 != obj7) {
                        U6 = Unit.a;
                    }
                    if (U6 != obj7) {
                        U6 = Unit.a;
                    }
                    if (U6 == obj7) {
                        break;
                    }
                } else if (i11 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 6:
                lu3 lu3Var = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    qa6 qa6Var = startWorker.h;
                    this.s = 1;
                    if (qa6Var.b(this) == lu3Var) {
                        break;
                    }
                } else if (i12 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 7:
                Object obj8 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    qa6 qa6Var2 = startWorker.h;
                    this.s = 1;
                    v76 v76Var = qa6Var2.a;
                    Calendar calendar4 = Calendar.getInstance();
                    calendar4.set(11, 0);
                    calendar4.set(12, 0);
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                    calendar4.add(5, -7);
                    Object U7 = gz8.U(this, v76Var.a, false, true, new yz(calendar4.getTimeInMillis() / 1000, i2));
                    if (U7 != obj8) {
                        U7 = Unit.a;
                    }
                    if (U7 != obj8) {
                        U7 = Unit.a;
                    }
                    if (U7 == obj8) {
                        break;
                    }
                } else if (i13 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 8:
                Object obj9 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    m7c m7cVar = startWorker.b;
                    this.s = 1;
                    m7cVar.getClass();
                    Object U8 = gz8.U(this, m7cVar.b.a, false, true, new yz(LocalDate.now(ZoneId.systemDefault()).atStartOfDay(ZoneId.systemDefault()).plusDays(-90L).toEpochSecond(), 28));
                    if (U8 != obj9) {
                        U8 = Unit.a;
                    }
                    if (U8 != obj9) {
                        U8 = Unit.a;
                    }
                    if (U8 == obj9) {
                        break;
                    }
                } else if (i14 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 9:
                Object obj10 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    m7c m7cVar2 = startWorker.b;
                    this.s = 1;
                    m7cVar2.getClass();
                    Object U9 = gz8.U(this, m7cVar2.c.a, false, true, new yz(LocalDate.now(ZoneId.systemDefault()).atStartOfDay(ZoneId.systemDefault()).plusDays(-7L).toEpochSecond(), 25));
                    if (U9 != obj10) {
                        U9 = Unit.a;
                    }
                    if (U9 != obj10) {
                        U9 = Unit.a;
                    }
                    if (U9 == obj10) {
                        break;
                    }
                } else if (i15 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 10:
                Object obj11 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    wld wldVar = startWorker.l;
                    this.s = 1;
                    wldVar.getClass();
                    Object r = s9a.r(new jk(wldVar, (rq3) null, 19), this);
                    if (r != obj11) {
                        r = Unit.a;
                    }
                    if (r == obj11) {
                        break;
                    }
                } else if (i16 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 11:
                lu3 lu3Var2 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    jx9 jx9Var = startWorker.m;
                    this.s = 1;
                    jx9Var.getClass();
                    oog oogVar = new oog(z9a.b(this));
                    Context context = jx9Var.a;
                    if (b.j(0, 2, 18).contains(Integer.valueOf(GoogleApiAvailability.e.b(context, GoogleApiAvailabilityLight.a)))) {
                        BillingClient build = BillingClient.newBuilder(context).setListener(new k03()).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
                        build.getClass();
                        build.startConnection(new ix9(jx9Var, oogVar, build));
                    } else {
                        jx9Var.b(false);
                        jx9.a(oogVar, Boolean.FALSE);
                    }
                    Object b = oogVar.b();
                    if (b != lu3Var2) {
                        b = Unit.a;
                    }
                    if (b == lu3Var2) {
                        break;
                    }
                } else if (i17 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 12:
                lu3 lu3Var3 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    nge ngeVar = startWorker.n;
                    this.s = 1;
                    Object a = ngeVar.a(this);
                    if (a != lu3Var3) {
                        a = Unit.a;
                    }
                    if (a == lu3Var3) {
                        break;
                    }
                } else if (i18 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 13:
                lu3 lu3Var4 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    fkk fkkVar = startWorker.o;
                    this.s = 1;
                    if (fkkVar.a(this) == lu3Var4) {
                        break;
                    }
                } else if (i19 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var5 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    ihk ihkVar = startWorker.p;
                    this.s = 1;
                    if (ihkVar.a(this) == lu3Var5) {
                        break;
                    }
                } else if (i20 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
