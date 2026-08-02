package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.StagesListResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import java.time.DayOfWeek;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l4i extends hoi implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ n4i C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Stage E;
    public av4 r;
    public zu4 s;
    public zu4 t;
    public Object u;
    public Object v;
    public Object w;
    public ug5 x;
    public boolean y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4i(n4i n4iVar, int i, Stage stage, rq3 rq3Var) {
        super(2, rq3Var);
        this.C = n4iVar;
        this.D = i;
        this.E = stage;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        l4i l4iVar = new l4i(this.C, this.D, this.E, rq3Var);
        l4iVar.B = obj;
        return l4iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l4i) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0128, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c((r3 == null || (r3 = r3.getStatus()) == null) ? null : r3.getType(), com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0225, code lost:
    
        if (r2 == r10) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020a  */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4, types: [av4, java.lang.Object, ug5] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        zu4 t2;
        boolean z;
        boolean z2;
        boolean z3;
        zu4 p;
        OddsCountryProvider oddsCountryProvider;
        ug5 ug5Var;
        Context i;
        Object w;
        OddsCountryProvider oddsCountryProvider2;
        ug5 ug5Var2;
        av4 av4Var;
        UniqueStage uniqueStage;
        UniqueStage uniqueStage2;
        n4i n4iVar;
        zu4 zu4Var;
        ?? r5;
        zu4 zu4Var2;
        Object T;
        OddsCountryProvider oddsCountryProvider3;
        boolean z4;
        OddsCountryProvider oddsCountryProvider4;
        Boolean bool;
        List<Stage> stages;
        boolean z5;
        Object T2;
        zu4 zu4Var3;
        Stage stage;
        zu4 zu4Var4;
        yzc yzcVar;
        Stage stage2;
        boolean z6;
        Object obj2;
        Object T3;
        Stage stage3;
        zu4 zu4Var5;
        yzc yzcVar2;
        av4 av4Var2;
        boolean c;
        Object T4;
        boolean z7;
        Stage stage4;
        boolean z8;
        yzc yzcVar3;
        yzc yzcVar4;
        yzc yzcVar5;
        Object obj3;
        n4i n4iVar2 = this.C;
        yzc yzcVar6 = n4iVar2.p;
        amd amdVar = n4iVar2.h;
        ku3 ku3Var = (ku3) this.B;
        lu3 lu3Var = lu3.a;
        int i2 = this.A;
        Stage stage5 = this.E;
        Boolean bool2 = null;
        av4 av4Var3 = null;
        av4 av4Var4 = null;
        av4 av4Var5 = null;
        if (i2 == 0) {
            y6a.M(obj);
            int i3 = this.D;
            t = xw3.t(ku3Var, null, new anc(n4iVar2, i3, null, 13), 3);
            if (n4iVar2.s && !n4iVar2.t) {
                n4iVar2.s = false;
                t2 = xw3.t(ku3Var, null, new k4i(n4iVar2, i3, null, 0), 3);
                av4 t3 = xw3.t(ku3Var, null, new k4i(n4iVar2, i3, null, 1), 3);
                joa joaVar = l5i.a;
                Stage stage6 = n4iVar2.k;
                if (ph0.v(new String[]{Sports.FORMULA_1, "WRC", "MotoGP"}, (stage6 == null || (uniqueStage2 = stage6.getUniqueStage()) == null) ? null : uniqueStage2.getName())) {
                    Stage stage7 = n4iVar2.k;
                    if (Intrinsics.c((stage7 == null || (uniqueStage = stage7.getUniqueStage()) == null) ? null : uniqueStage.getName(), "WRC")) {
                        Stage stage8 = n4iVar2.k;
                    }
                    z = true;
                    zu4 zu4Var6 = null;
                    bool2 = null;
                    z2 = true;
                    z3 = false;
                    p = yaa.p(ku3Var, z, new anc(n4iVar2, t3, i3, (rq3) null, 14));
                    oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(amdVar.c());
                    if (oddsCountryProvider != null) {
                        ug5Var = ug5.e;
                        i = n4iVar2.i();
                        DayOfWeek dayOfWeek = hwc.a;
                        if (!hwc.f(stage5)) {
                            this.B = ku3Var;
                            this.r = t;
                            this.s = t2;
                            this.t = p;
                            this.u = oddsCountryProvider;
                            this.v = amdVar;
                            this.w = i;
                            this.x = ug5Var;
                            this.A = 1;
                            w = t3.w(this);
                            if (w != lu3Var) {
                                oddsCountryProvider2 = oddsCountryProvider;
                                ug5Var2 = ug5Var;
                                av4Var = t;
                            }
                            return lu3Var;
                        }
                        oddsCountryProvider3 = oddsCountryProvider;
                        ug5Var2 = ug5Var;
                        z4 = z2;
                        ug5Var2.getClass();
                        i.getClass();
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        oddsCountryProvider4 = (!fn0.B("show_motorsport_odds") && xld.g(i) && rld.t(i) && amdVar.c().size() == z2 && (!z4 || !rld.a(ke0.c))) ? oddsCountryProvider3 : null;
                        if (oddsCountryProvider4 != null) {
                            r5 = 0;
                            n4iVar = n4iVar2;
                            zu4Var = xw3.t(ku3Var, null, new h4i(n4iVar2, stage5, oddsCountryProvider4, (rq3) null, 1), 3);
                            zu4Var2 = t2;
                            this.B = r5;
                            this.r = r5;
                            this.s = zu4Var2;
                            this.t = p;
                            this.u = zu4Var;
                            this.v = r5;
                            this.w = r5;
                            this.x = r5;
                            this.A = 2;
                            T = t.T(this);
                            av4Var5 = r5;
                        } else {
                            zu4Var6 = null;
                        }
                    }
                    n4iVar = n4iVar2;
                    zu4Var = zu4Var6;
                    r5 = zu4Var6;
                    zu4Var2 = t2;
                    this.B = r5;
                    this.r = r5;
                    this.s = zu4Var2;
                    this.t = p;
                    this.u = zu4Var;
                    this.v = r5;
                    this.w = r5;
                    this.x = r5;
                    this.A = 2;
                    T = t.T(this);
                    av4Var5 = r5;
                }
                z = false;
                zu4 zu4Var62 = null;
                bool2 = null;
                z2 = true;
                z3 = false;
                p = yaa.p(ku3Var, z, new anc(n4iVar2, t3, i3, (rq3) null, 14));
                oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(amdVar.c());
                if (oddsCountryProvider != null) {
                }
                n4iVar = n4iVar2;
                zu4Var = zu4Var62;
                r5 = zu4Var62;
                zu4Var2 = t2;
                this.B = r5;
                this.r = r5;
                this.s = zu4Var2;
                this.t = p;
                this.u = zu4Var;
                this.v = r5;
                this.w = r5;
                this.x = r5;
                this.A = 2;
                T = t.T(this);
                av4Var5 = r5;
            }
            return Unit.a;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                zu4Var = (zu4) this.u;
                zu4 zu4Var7 = this.t;
                zu4Var2 = this.s;
                y6a.M(obj);
                p = zu4Var7;
                z2 = true;
                n4iVar = n4iVar2;
                T = obj;
                Stage stage9 = (Stage) T;
                if (stage9 == null) {
                    yzcVar6.j(av4Var5);
                    n4iVar.s = z2;
                    return Unit.a;
                }
                n4iVar.t = z2;
                this.B = av4Var5;
                this.r = av4Var5;
                this.s = av4Var5;
                this.t = p;
                this.u = zu4Var;
                this.v = yzcVar6;
                this.w = stage9;
                this.A = 3;
                T2 = zu4Var2.T(this);
                if (T2 != lu3Var) {
                    zu4Var3 = zu4Var;
                    stage = stage9;
                    zu4Var4 = p;
                    av4Var4 = av4Var5;
                    yzcVar = yzcVar6;
                    boolean booleanValue = ((Boolean) T2).booleanValue();
                    if (zu4Var4 != null) {
                    }
                }
                return lu3Var;
            }
            if (i2 == 3) {
                stage = (Stage) this.w;
                yzc yzcVar7 = (yzc) this.v;
                zu4 zu4Var8 = (zu4) this.u;
                zu4Var4 = this.t;
                y6a.M(obj);
                n4iVar = n4iVar2;
                zu4Var3 = zu4Var8;
                z2 = true;
                T2 = obj;
                yzcVar = yzcVar7;
                boolean booleanValue2 = ((Boolean) T2).booleanValue();
                if (zu4Var4 != null) {
                    stage2 = stage;
                    z6 = booleanValue2;
                    obj2 = av4Var4;
                    av4Var2 = av4Var4;
                    yzcVar2 = yzcVar;
                    c = Intrinsics.c(obj2, Boolean.TRUE);
                    obj3 = av4Var2;
                    yzcVar5 = yzcVar2;
                    if (zu4Var3 != null) {
                    }
                    yzcVar5.j(new i4i(stage2, z6, c, Intrinsics.c(obj3, Boolean.TRUE)));
                    n4iVar.s = z2;
                    return Unit.a;
                }
                this.B = av4Var4;
                this.r = av4Var4;
                this.s = av4Var4;
                this.t = av4Var4;
                this.u = zu4Var3;
                this.v = yzcVar;
                this.w = stage;
                this.y = booleanValue2;
                this.A = 4;
                T3 = zu4Var4.T(this);
                if (T3 != lu3Var) {
                    zu4 zu4Var9 = zu4Var3;
                    stage3 = stage;
                    z6 = booleanValue2;
                    zu4Var5 = zu4Var9;
                    av4Var3 = av4Var4;
                    yzcVar4 = yzcVar;
                    obj2 = (Boolean) T3;
                    zu4 zu4Var10 = zu4Var5;
                    stage2 = stage3;
                    zu4Var3 = zu4Var10;
                    av4Var2 = av4Var3;
                    yzcVar2 = yzcVar4;
                    c = Intrinsics.c(obj2, Boolean.TRUE);
                    obj3 = av4Var2;
                    yzcVar5 = yzcVar2;
                    if (zu4Var3 != null) {
                    }
                    yzcVar5.j(new i4i(stage2, z6, c, Intrinsics.c(obj3, Boolean.TRUE)));
                    n4iVar.s = z2;
                    return Unit.a;
                }
                return lu3Var;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z8 = this.z;
                boolean z9 = this.y;
                stage4 = (Stage) this.w;
                yzcVar3 = (yzc) this.v;
                y6a.M(obj);
                n4iVar = n4iVar2;
                z7 = z9;
                T4 = obj;
                z2 = true;
                stage2 = stage4;
                yzcVar5 = yzcVar3;
                obj3 = (Boolean) T4;
                c = z8;
                z6 = z7;
                yzcVar5.j(new i4i(stage2, z6, c, Intrinsics.c(obj3, Boolean.TRUE)));
                n4iVar.s = z2;
                return Unit.a;
            }
            z6 = this.y;
            Stage stage10 = (Stage) this.w;
            yzc yzcVar8 = (yzc) this.v;
            zu4 zu4Var11 = (zu4) this.u;
            y6a.M(obj);
            n4iVar = n4iVar2;
            stage3 = stage10;
            z2 = true;
            zu4Var5 = zu4Var11;
            yzcVar4 = yzcVar8;
            T3 = obj;
            obj2 = (Boolean) T3;
            zu4 zu4Var102 = zu4Var5;
            stage2 = stage3;
            zu4Var3 = zu4Var102;
            av4Var2 = av4Var3;
            yzcVar2 = yzcVar4;
            c = Intrinsics.c(obj2, Boolean.TRUE);
            obj3 = av4Var2;
            yzcVar5 = yzcVar2;
            if (zu4Var3 != null) {
                this.B = av4Var2;
                this.r = av4Var2;
                this.s = av4Var2;
                this.t = av4Var2;
                this.u = av4Var2;
                this.v = yzcVar2;
                this.w = stage2;
                this.y = z6;
                this.z = c;
                this.A = 5;
                T4 = zu4Var3.T(this);
                if (T4 != lu3Var) {
                    z7 = z6;
                    stage4 = stage2;
                    z8 = c;
                    yzcVar3 = yzcVar2;
                    stage2 = stage4;
                    yzcVar5 = yzcVar3;
                    obj3 = (Boolean) T4;
                    c = z8;
                    z6 = z7;
                }
                return lu3Var;
            }
            yzcVar5.j(new i4i(stage2, z6, c, Intrinsics.c(obj3, Boolean.TRUE)));
            n4iVar.s = z2;
            return Unit.a;
        }
        ug5Var2 = this.x;
        i = (Context) this.w;
        amdVar = (amd) this.v;
        oddsCountryProvider2 = (OddsCountryProvider) this.u;
        p = this.t;
        t2 = this.s;
        av4Var = this.r;
        y6a.M(obj);
        z3 = false;
        z2 = true;
        w = obj;
        StagesListResponse stagesListResponse = (StagesListResponse) w;
        if (stagesListResponse == null || (stages = stagesListResponse.getStages()) == null) {
            bool = bool2;
        } else {
            if (!stages.isEmpty()) {
                for (Stage stage11 : stages) {
                    DayOfWeek dayOfWeek2 = hwc.a;
                    if (hwc.f(stage11)) {
                        z5 = z2;
                        break;
                    }
                }
            }
            z5 = z3;
            bool = Boolean.valueOf(z5);
        }
        if (Intrinsics.c(bool, Boolean.TRUE)) {
            av4 av4Var6 = av4Var;
            ug5Var = ug5Var2;
            oddsCountryProvider = oddsCountryProvider2;
            t = av4Var6;
            oddsCountryProvider3 = oddsCountryProvider;
            ug5Var2 = ug5Var;
            z4 = z2;
            ug5Var2.getClass();
            i.getClass();
            amdVar.getClass();
            yea yeaVar2 = j58.a;
            if (!fn0.B("show_motorsport_odds")) {
            }
            if (oddsCountryProvider4 != null) {
            }
        } else {
            oddsCountryProvider3 = oddsCountryProvider2;
            z4 = z3;
            t = av4Var;
            ug5Var2.getClass();
            i.getClass();
            amdVar.getClass();
            yea yeaVar22 = j58.a;
            if (!fn0.B("show_motorsport_odds")) {
            }
            if (oddsCountryProvider4 != null) {
            }
        }
    }
}
