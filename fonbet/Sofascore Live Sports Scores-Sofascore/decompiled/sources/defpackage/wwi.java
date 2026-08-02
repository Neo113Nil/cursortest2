package defpackage;

import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wwi extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ xwi t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwi(xwi xwiVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = xwiVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        xwi xwiVar = this.t;
        switch (i) {
            case 0:
                return new wwi(xwiVar, rq3Var, 0);
            case 1:
                return new wwi(xwiVar, rq3Var, 1);
            case 2:
                return new wwi(xwiVar, rq3Var, 2);
            case 3:
                return new wwi(xwiVar, rq3Var, 3);
            case 4:
                return new wwi(xwiVar, rq3Var, 4);
            case 5:
                return new wwi(xwiVar, rq3Var, 5);
            default:
                return new wwi(xwiVar, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((wwi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fe, code lost:
    
        if (r2.j(r14) == r0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e0, code lost:
    
        if (r15 == r0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f5, code lost:
    
        if (r15 == r0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0194, code lost:
    
        if (r2.k(r15, r14) == r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0176, code lost:
    
        if (r15.Z(r14) == r0) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Integer] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        YearMonth now;
        int i = this.r;
        xwi xwiVar = this.t;
        int i2 = 1;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    twi twiVar = (twi) xwiVar.m.getValue();
                    int i4 = twiVar == null ? -1 : vwi.a[twiVar.ordinal()];
                    if (i4 == 1) {
                        this.s = 1;
                        Object r = s9a.r(new cce(xwiVar, r5, 25), this);
                        if (r != lu3Var) {
                            r = Unit.a;
                            break;
                        }
                    } else if (i4 == 2) {
                        this.s = 2;
                        Object r2 = s9a.r(new wwi(xwiVar, r5, i2), this);
                        if (r2 != lu3Var) {
                            r2 = Unit.a;
                            break;
                        }
                    }
                    return Unit.a;
                }
                if (i3 != 1 && i3 != 2) {
                    if (i3 == 3) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.s = 3;
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    g9i g9iVar = xwiVar.u;
                    if (g9iVar != null) {
                        this.s = 1;
                        break;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                lwi lwiVar = (lwi) xwiVar.o.getValue();
                if (lwiVar == null || (now = lwiVar.a) == null) {
                    now = YearMonth.now();
                }
                now.getClass();
                this.s = 2;
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar = xwiVar.e;
                int id = xwiVar.g.getId();
                yyi yyiVar = xwiVar.r;
                String t6eVar = t6e.a.toString();
                UniqueTournament uniqueTournament = (UniqueTournament) ((eoh) xwiVar.q).getValue();
                r5 = uniqueTournament != null ? new Integer(uniqueTournament.getId()) : null;
                this.s = 1;
                j0jVar.getClass();
                Object P = yaa.P(new jzi(yyiVar, j0jVar, id, t6eVar, 0, r5, null), this);
                return P == lu3Var3 ? lu3Var3 : P;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar2 = xwiVar.e;
                int id2 = xwiVar.g.getId();
                yyi yyiVar2 = xwiVar.r;
                String t6eVar2 = t6e.b.toString();
                UniqueTournament uniqueTournament2 = (UniqueTournament) ((eoh) xwiVar.q).getValue();
                Integer num = uniqueTournament2 != null ? new Integer(uniqueTournament2.getId()) : null;
                this.s = 1;
                j0jVar2.getClass();
                Object P2 = yaa.P(new jzi(yyiVar2, j0jVar2, id2, t6eVar2, 0, num, null), this);
                return P2 == lu3Var4 ? lu3Var4 : P2;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar3 = xwiVar.e;
                int id3 = xwiVar.g.getId();
                YearMonth now2 = YearMonth.now();
                now2.getClass();
                LocalDate atDay = now2.atDay(1);
                atDay.getClass();
                bi4 bi4Var = bi4.PATTERN_NETWORK_MY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                String format = atDay.format(hk4.a(bi4Var.d()));
                format.getClass();
                this.s = 1;
                Object B = j0jVar3.B(id3, format, this);
                return B == lu3Var5 ? lu3Var5 : B;
            case 5:
                Team team = xwiVar.g;
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar4 = xwiVar.e;
                int id4 = team.getId();
                String sportSlug = team.getSportSlug();
                this.s = 1;
                j0jVar4.getClass();
                Object r3 = s9a.r(new mj5(sportSlug, j0jVar4, id4, (rq3) null, 12), this);
                return r3 == lu3Var6 ? lu3Var6 : r3;
            default:
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar5 = xwiVar.e;
                int id5 = xwiVar.g.getId();
                this.s = 1;
                j0jVar5.getClass();
                Object P3 = yaa.P(new azi(j0jVar5, id5, r5, 0), this);
                return P3 == lu3Var7 ? lu3Var7 : P3;
        }
    }
}
