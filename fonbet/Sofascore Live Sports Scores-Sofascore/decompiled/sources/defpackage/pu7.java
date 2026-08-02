package defpackage;

import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pu7 extends hoi implements Function2 {
    public OddsEventUIModel A;
    public OddsCountryProvider B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ tu7 I;
    public final /* synthetic */ Event J;
    public unb r;
    public zu4 s;
    public x2g t;
    public tu7 u;
    public Event v;
    public lu7 w;
    public fdi x;
    public Object y;
    public gv9 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu7(tu7 tu7Var, Event event, rq3 rq3Var) {
        super(2, rq3Var);
        this.I = tu7Var;
        this.J = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        pu7 pu7Var = new pu7(this.I, this.J, rq3Var);
        pu7Var.H = obj;
        return pu7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pu7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0112, code lost:
    
        if (r1 == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019c, code lost:
    
        if (r3 == r2) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x022c -> B:7:0x0043). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vnb vnbVar;
        zu4 t;
        Object w;
        Object value;
        Object w2;
        Object value2;
        xmd xmdVar;
        x2g x2gVar;
        tu7 tu7Var;
        Event event;
        lu7 lu7Var;
        fdi fdiVar;
        zu4 zu4Var;
        x2g x2gVar2;
        int i;
        int i2;
        Object value3;
        OddsEventUIModel oddsEventUIModel;
        Object T;
        int i3;
        lu3 lu3Var;
        x2g x2gVar3;
        gv9 gv9Var;
        boolean z;
        OddsCountryProvider oddsCountryProvider;
        Object value4;
        ku3 ku3Var = (ku3) this.H;
        lu3 lu3Var2 = lu3.a;
        int i4 = this.G;
        int i5 = 0;
        if (i4 == 0) {
            rq3 rq3Var = null;
            y6a.M(obj);
            vnbVar = (vnb) this.I.i.getValue();
            tu7 tu7Var2 = this.I;
            List list = tu7Var2.p;
            if (list == null && (list = tu7Var2.f.a(ok3.v(this.J))) == null) {
                amd amdVar = this.I.f;
                Integer v = ok3.v(this.J);
                if (this.I.h && amdVar.f == null && amdVar.h == null) {
                    BrandingTournament C = ccd.C(amdVar.a, v);
                    if (!Intrinsics.c(C != null ? C.getForceOdds() : null, Boolean.TRUE)) {
                        C = null;
                    }
                    Integer oddsProviderId = C != null ? C.getOddsProviderId() : null;
                    amdVar.h = oddsProviderId;
                    if (oddsProviderId == null) {
                        amdVar.h = -1;
                        list = amdVar.c();
                    } else {
                        bga bgaVar = xld.a;
                        amdVar.f = rld.e(amdVar.h, xld.b(amdVar.a));
                    }
                }
                list = amdVar.c();
            }
            tu7Var2.p = list;
            av4 t2 = xw3.t(ku3Var, null, new nu7(this.I, this.J, rq3Var, i5), 3);
            if (vnbVar instanceof unb) {
                this.H = null;
                this.r = (unb) vnbVar;
                this.G = 1;
                w2 = t2.w(this);
            } else {
                List list2 = this.I.p;
                OddsCountryProvider oddsCountryProvider2 = list2 != null ? (OddsCountryProvider) CollectionsKt.firstOrNull(list2) : null;
                tu7 tu7Var3 = this.I;
                if (oddsCountryProvider2 == null) {
                    fdi fdiVar2 = tu7Var3.i;
                    do {
                        value = fdiVar2.getValue();
                    } while (!fdiVar2.k(value, new snb()));
                    return Unit.a;
                }
                t = xw3.t(ku3Var, null, new ou7(tu7Var3, oddsCountryProvider2, this.J, null), 3);
                this.H = null;
                this.r = null;
                this.s = t;
                this.G = 2;
                w = t2.w(this);
            }
            return lu3Var2;
        }
        if (i4 == 1) {
            unb unbVar = this.r;
            y6a.M(obj);
            vnbVar = unbVar;
            w2 = obj;
            lu7 lu7Var2 = (lu7) yaa.x((x2g) w2);
            if (lu7Var2 == null) {
                return Unit.a;
            }
            fdi fdiVar3 = this.I.i;
            Event event2 = this.J;
            do {
                value2 = fdiVar3.getValue();
                xmdVar = (xmd) ((unb) vnbVar).a;
            } while (!fdiVar3.k(value2, new unb(xmd.a(xmdVar, lu7Var2.a, OddsEventUIModel.a(xmdVar.c, event2.getStatusType()), lu7Var2.b, 18))));
            return Unit.a;
        }
        if (i4 == 2) {
            t = this.s;
            y6a.M(obj);
            w = obj;
            x2gVar = (x2g) w;
            tu7 tu7Var4 = this.I;
            Event event3 = this.J;
            if (!(x2gVar instanceof t2g)) {
                if (!(x2gVar instanceof v2g)) {
                    zzl.b();
                    return null;
                }
                tu7Var = tu7Var4;
                event = event3;
                lu7Var = (lu7) ((v2g) x2gVar).a;
                fdiVar = tu7Var4.i;
                zu4Var = t;
                x2gVar2 = x2gVar;
                i = 0;
                i2 = 0;
                value3 = fdiVar.getValue();
                gv9 gv9Var2 = lu7Var.a;
                event.getClass();
                oddsEventUIModel = new OddsEventUIModel(event.getId(), o3a.F(event.getTournament()), event.getStatusType(), ok3.s(event), event.shouldReverseTeams());
                List list3 = tu7Var.p;
                OddsCountryProvider oddsCountryProvider3 = list3 == null ? (OddsCountryProvider) CollectionsKt.firstOrNull(list3) : null;
                boolean z2 = lu7Var.b;
                lu3 lu3Var3 = lu3Var2;
                this.H = null;
                this.r = null;
                this.s = zu4Var;
                this.t = x2gVar2;
                this.u = tu7Var;
                this.v = event;
                this.w = lu7Var;
                this.x = fdiVar;
                this.y = value3;
                this.z = gv9Var2;
                this.A = oddsEventUIModel;
                this.B = oddsCountryProvider3;
                this.C = i5;
                this.D = i;
                this.E = i2;
                this.F = z2;
                this.G = 3;
                T = zu4Var.T(this);
                i3 = i;
                lu3Var = lu3Var3;
                if (T != lu3Var) {
                    return lu3Var;
                }
                x2gVar3 = x2gVar2;
                gv9Var = gv9Var2;
                OddsCountryProvider oddsCountryProvider4 = oddsCountryProvider3;
                z = z2;
                oddsCountryProvider = oddsCountryProvider4;
            }
            tu7 tu7Var5 = this.I;
            if (!(x2gVar instanceof t2g)) {
                fdi fdiVar4 = tu7Var5.i;
                do {
                    value4 = fdiVar4.getValue();
                } while (!fdiVar4.k(value4, new snb()));
            } else if (!(x2gVar instanceof v2g)) {
                zzl.b();
                return null;
            }
            return Unit.a;
        }
        if (i4 != 3) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z3 = this.F;
        i2 = this.E;
        int i6 = this.D;
        i5 = this.C;
        OddsCountryProvider oddsCountryProvider5 = this.B;
        oddsEventUIModel = this.A;
        gv9 gv9Var3 = this.z;
        value3 = this.y;
        fdiVar = this.x;
        lu7Var = this.w;
        event = this.v;
        tu7Var = this.u;
        x2g x2gVar4 = this.t;
        zu4Var = this.s;
        y6a.M(obj);
        x2gVar3 = x2gVar4;
        gv9Var = gv9Var3;
        i3 = i6;
        oddsCountryProvider = oddsCountryProvider5;
        z = z3;
        lu3Var = lu3Var2;
        T = obj;
        Event event4 = event;
        tu7 tu7Var6 = tu7Var;
        fdi fdiVar5 = fdiVar;
        lu7 lu7Var3 = lu7Var;
        zu4 zu4Var2 = zu4Var;
        Object obj2 = value3;
        int i7 = i5;
        OddsEventUIModel oddsEventUIModel2 = oddsEventUIModel;
        int i8 = i2;
        if (fdiVar5.k(obj2, new unb(new xmd(gv9Var, oddsCountryProvider, oddsEventUIModel2, z, (tld) T)))) {
            x2gVar = x2gVar3;
            tu7 tu7Var52 = this.I;
            if (!(x2gVar instanceof t2g)) {
            }
            return Unit.a;
        }
        lu3Var2 = lu3Var;
        i2 = i8;
        x2gVar2 = x2gVar3;
        i5 = i7;
        zu4Var = zu4Var2;
        fdiVar = fdiVar5;
        lu7Var = lu7Var3;
        event = event4;
        i = i3;
        tu7Var = tu7Var6;
        value3 = fdiVar.getValue();
        gv9 gv9Var22 = lu7Var.a;
        event.getClass();
        oddsEventUIModel = new OddsEventUIModel(event.getId(), o3a.F(event.getTournament()), event.getStatusType(), ok3.s(event), event.shouldReverseTeams());
        List list32 = tu7Var.p;
        if (list32 == null) {
        }
        boolean z22 = lu7Var.b;
        lu3 lu3Var32 = lu3Var2;
        this.H = null;
        this.r = null;
        this.s = zu4Var;
        this.t = x2gVar2;
        this.u = tu7Var;
        this.v = event;
        this.w = lu7Var;
        this.x = fdiVar;
        this.y = value3;
        this.z = gv9Var22;
        this.A = oddsEventUIModel;
        this.B = oddsCountryProvider3;
        this.C = i5;
        this.D = i;
        this.E = i2;
        this.F = z22;
        this.G = 3;
        T = zu4Var.T(this);
        i3 = i;
        lu3Var = lu3Var32;
        if (T != lu3Var) {
        }
    }
}
