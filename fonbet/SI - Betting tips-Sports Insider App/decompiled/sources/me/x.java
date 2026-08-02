package me;

import com.android.billingclient.api.Purchase;
import com.sports.insider.MyApp;
import com.sports.insider.data.entity.prediction.GamesInfoData;
import eg.m0;
import hg.d1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20690b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f20691c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f20692d;

    /* renamed from: e, reason: collision with root package name */
    public Object f20693e;

    /* renamed from: f, reason: collision with root package name */
    public Object f20694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20695g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c0 c0Var, boolean z5, Continuation continuation) {
        super(2, continuation);
        this.f20695g = c0Var;
        this.f20692d = z5;
    }

    public static final int c(Double d10, Double d11) {
        if (d10 == null || d11 == null || d10.doubleValue() <= 0.0d || d11.doubleValue() <= 0.0d) {
            return 0;
        }
        return Math.abs((int) (((d10.doubleValue() - d11.doubleValue()) / d10.doubleValue()) * 100));
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20690b) {
            case 0:
                return new x((c0) this.f20695g, this.f20692d, continuation);
            case 1:
                x xVar = new x((pc.u) this.f20694f, this.f20692d, (String) this.f20695g, continuation);
                xVar.f20693e = obj;
                return xVar;
            default:
                return new x((wc.i) this.f20693e, (ic.a) this.f20694f, this.f20692d, (ic.a) this.f20695g, this.f20691c, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20690b) {
        }
        return ((x) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b6 A[Catch: all -> 0x0108, Exception -> 0x010b, TRY_LEAVE, TryCatch #0 {Exception -> 0x010b, blocks: (B:51:0x0103, B:58:0x011c, B:61:0x0190, B:65:0x019d, B:70:0x01b6, B:73:0x0129, B:74:0x017f, B:79:0x0131, B:80:0x016e, B:85:0x0135, B:86:0x0158, B:91:0x013c), top: B:44:0x00f7, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017d  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kc.b bVar;
        kc.b bVar2;
        GamesInfoData gamesInfoData;
        Object A;
        int i5 = this.f20690b;
        boolean z5 = true;
        int i10 = 2;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.f20695g;
        boolean z7 = this.f20692d;
        switch (i5) {
            case 0:
                c0 c0Var = (c0) obj3;
                l1.a aVar = c0Var.f20612b;
                d1 d1Var = c0Var.f20625i;
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f20691c;
                try {
                    try {
                    } catch (Exception ex) {
                        Intrinsics.checkNotNullParameter(ex, "ex");
                        jg.d dVar = MyApp.f6830c;
                        lg.e eVar = m0.f9201a;
                        eg.c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, objArr == true ? 1 : 0, 18), 2);
                    }
                    if (i11 == 0) {
                        h8.b.B(obj);
                        Boolean bool = Boolean.TRUE;
                        d1Var.getClass();
                        d1Var.k(null, bool);
                        Integer num = new Integer(c0Var.f20619f);
                        this.f20691c = 1;
                        aVar.getClass();
                        obj = l1.a.q(num, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                bVar = (kc.b) this.f20693e;
                                h8.b.B(obj);
                                GamesInfoData gamesInfoData2 = (GamesInfoData) obj;
                                this.f20693e = bVar;
                                this.f20694f = gamesInfoData2;
                                this.f20691c = 3;
                                if (c0Var.j(bVar, this) != aVar2) {
                                    return aVar2;
                                }
                                bVar2 = bVar;
                                gamesInfoData = gamesInfoData2;
                                this.f20693e = bVar2;
                                this.f20694f = gamesInfoData;
                                this.f20691c = 4;
                                if (c0.e(c0Var, gamesInfoData, this) == aVar2) {
                                }
                                if (bVar2 != null) {
                                }
                                Integer num2 = new Integer(c0Var.f20619f);
                                if (gamesInfoData != null) {
                                }
                                z5 = false;
                                this.f20693e = null;
                                this.f20694f = null;
                                this.f20691c = 5;
                                aVar.getClass();
                                lg.e eVar2 = m0.f9201a;
                                A = eg.c0.A(lg.d.f20063c, new id.i(num2, z5, aVar, (Continuation) null), this);
                                if (A != aVar2) {
                                }
                                if (A == aVar2) {
                                }
                                return Unit.f19194a;
                            }
                            if (i11 == 3) {
                                gamesInfoData = (GamesInfoData) this.f20694f;
                                bVar2 = (kc.b) this.f20693e;
                                h8.b.B(obj);
                                this.f20693e = bVar2;
                                this.f20694f = gamesInfoData;
                                this.f20691c = 4;
                                if (c0.e(c0Var, gamesInfoData, this) == aVar2) {
                                    return aVar2;
                                }
                                if (bVar2 != null) {
                                }
                                Integer num22 = new Integer(c0Var.f20619f);
                                if (gamesInfoData != null) {
                                }
                                z5 = false;
                                this.f20693e = null;
                                this.f20694f = null;
                                this.f20691c = 5;
                                aVar.getClass();
                                lg.e eVar22 = m0.f9201a;
                                A = eg.c0.A(lg.d.f20063c, new id.i(num22, z5, aVar, (Continuation) null), this);
                                if (A != aVar2) {
                                }
                                if (A == aVar2) {
                                }
                                return Unit.f19194a;
                            }
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj);
                                return Unit.f19194a;
                            }
                            gamesInfoData = (GamesInfoData) this.f20694f;
                            bVar2 = (kc.b) this.f20693e;
                            h8.b.B(obj);
                            if (bVar2 != null || z7) {
                                Integer num222 = new Integer(c0Var.f20619f);
                                if (gamesInfoData != null || z7) {
                                    z5 = false;
                                }
                                this.f20693e = null;
                                this.f20694f = null;
                                this.f20691c = 5;
                                aVar.getClass();
                                lg.e eVar222 = m0.f9201a;
                                A = eg.c0.A(lg.d.f20063c, new id.i(num222, z5, aVar, (Continuation) null), this);
                                if (A != aVar2) {
                                    A = Unit.f19194a;
                                }
                                if (A == aVar2) {
                                    return aVar2;
                                }
                            }
                            return Unit.f19194a;
                        }
                        h8.b.B(obj);
                    }
                    bVar = (kc.b) obj;
                    Integer num3 = new Integer(c0Var.f20619f);
                    this.f20693e = bVar;
                    this.f20691c = 2;
                    obj = aVar.s(num3, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    GamesInfoData gamesInfoData22 = (GamesInfoData) obj;
                    this.f20693e = bVar;
                    this.f20694f = gamesInfoData22;
                    this.f20691c = 3;
                    if (c0Var.j(bVar, this) != aVar2) {
                    }
                } finally {
                    Boolean bool2 = Boolean.FALSE;
                    d1Var.getClass();
                    d1Var.k(null, bool2);
                }
            case 1:
                pc.u uVar = (pc.u) this.f20694f;
                eg.z zVar = (eg.z) this.f20693e;
                lf.a aVar3 = lf.a.f20034a;
                int i12 = this.f20691c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    this.f20693e = zVar;
                    this.f20691c = 1;
                    obj = pc.u.v("inapp", z7, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                com.android.billingclient.api.w wVar = (com.android.billingclient.api.w) obj;
                if (wVar.f4110a.f4037a != 0) {
                    return null;
                }
                List list = wVar.f4111b;
                lg.e eVar3 = m0.f9201a;
                c4.w wVar2 = uVar.f21721w;
                eVar3.getClass();
                eg.c0.e(zVar, kotlin.coroutines.e.c(eVar3, wVar2).t(new eg.y("OnAllOwnedItems")), new pc.o(uVar, list, objArr2 == true ? 1 : 0, i10), 2);
                String str = (String) obj3;
                for (Object obj4 : list) {
                    if (Intrinsics.areEqual(((Purchase) obj4).a().get(0), str)) {
                        return obj4;
                    }
                }
                return null;
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                rc.a aVar5 = ((wc.i) this.f20693e).f25114e;
                ic.b c2 = aVar5.c((ic.a) this.f20694f, z7);
                ic.b c8 = aVar5.c((ic.a) obj3, false);
                double longValue = c2 != null ? c2.f11076b.longValue() : 0.0d;
                Double d10 = c2 != null ? new Double(c2.f11075a.longValue()) : null;
                Double d11 = c8 != null ? new Double(c8.f11075a.longValue()) : null;
                return new ic.c(c2, c8, this.f20691c, new Integer(longValue == 0.0d ? c(d10, d11) : c(new Double(longValue), d11)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(pc.u uVar, boolean z5, String str, Continuation continuation) {
        super(2, continuation);
        this.f20694f = uVar;
        this.f20692d = z5;
        this.f20695g = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(wc.i iVar, ic.a aVar, boolean z5, ic.a aVar2, int i5, Continuation continuation) {
        super(2, continuation);
        this.f20693e = iVar;
        this.f20694f = aVar;
        this.f20692d = z5;
        this.f20695g = aVar2;
        this.f20691c = i5;
    }
}
