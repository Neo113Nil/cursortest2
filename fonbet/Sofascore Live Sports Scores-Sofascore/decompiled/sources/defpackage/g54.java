package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.results.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g54 extends hoi implements gt8 {
    public /* synthetic */ c1j A;
    public /* synthetic */ List B;
    public /* synthetic */ c0a C;
    public /* synthetic */ Pair D;
    public final /* synthetic */ q54 E;
    public kxe r;
    public kxe s;
    public c1j t;
    public q54 u;
    public ey4 v;
    public ey4 w;
    public int x;
    public int y;
    public /* synthetic */ ey4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g54(q54 q54Var, rq3 rq3Var) {
        super(6, rq3Var);
        this.E = q54Var;
    }

    @Override // defpackage.gt8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        g54 g54Var = new g54(this.E, (rq3) obj6);
        g54Var.z = (ey4) obj;
        g54Var.A = (c1j) obj2;
        g54Var.B = (List) obj3;
        g54Var.C = (c0a) obj4;
        g54Var.D = (Pair) obj5;
        return g54Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015a  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kxe kxeVar;
        Object y;
        q54 q54Var;
        int i;
        c1j c1jVar;
        kxe kxeVar2;
        ey4 ey4Var;
        Object u;
        c1j c1jVar2;
        kxe kxeVar3;
        Object u2;
        c1j c1jVar3;
        boolean booleanValue;
        ey4 ey4Var2;
        c1j c1jVar4;
        kxe kxeVar4;
        kxe kxeVar5;
        kxe kxeVar6;
        c1j c1jVar5;
        Object v;
        boolean z;
        int i2;
        boolean z2;
        ey4 ey4Var3 = this.z;
        c1j c1jVar6 = this.A;
        List list = this.B;
        c0a c0aVar = this.C;
        Pair pair = this.D;
        lu3 lu3Var = lu3.a;
        int i3 = this.y;
        if (i3 == 0) {
            y6a.M(obj);
            kxeVar = (kxe) pair.a;
            kxe kxeVar7 = (kxe) pair.b;
            q54 q54Var2 = this.E;
            aeh aehVar = q54Var2.h;
            this.z = ey4Var3;
            this.A = c1jVar6;
            this.B = list;
            this.C = c0aVar;
            this.D = null;
            this.r = kxeVar;
            this.s = kxeVar7;
            this.t = c1jVar6;
            this.u = q54Var2;
            this.v = null;
            this.w = ey4Var3;
            this.x = 0;
            this.y = 1;
            y = rd0.y(aehVar, this);
            if (y != lu3Var) {
                q54Var = q54Var2;
                i = 0;
                c1jVar = c1jVar6;
                kxeVar2 = kxeVar7;
                ey4Var = ey4Var3;
            }
            return lu3Var;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ey4Var = this.v;
                c1jVar3 = this.t;
                kxe kxeVar8 = this.s;
                kxe kxeVar9 = this.r;
                y6a.M(obj);
                kxeVar2 = kxeVar8;
                kxeVar = kxeVar9;
                u2 = obj;
                booleanValue = ((Boolean) u2).booleanValue();
                c1j c1jVar7 = c1jVar3;
                ey4Var2 = ey4Var;
                c1jVar4 = c1jVar7;
                kxeVar4 = kxeVar;
                kxeVar5 = kxeVar2;
                if (!booleanValue) {
                }
                gv9 W = l6g.W(list);
                CrowdsourcingIncidentType crowdsourcingIncidentType = ey4Var3.b;
                z = crowdsourcingIncidentType instanceof CrowdsourcingIncidentType.Card;
                if (!z) {
                }
                int i4 = i2;
                if (!z) {
                }
                return new l44(ey4Var2, r6, W, c0aVar, i4, z2, kxeVar4, kxeVar5, !c1jVar6.a.c || c1jVar6.b.c);
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ey4Var = this.v;
                c1jVar5 = this.t;
                kxeVar6 = this.s;
                kxe kxeVar10 = this.r;
                y6a.M(obj);
                kxeVar3 = kxeVar10;
                v = obj;
                if (!((Boolean) v).booleanValue()) {
                    c1j c1jVar8 = c1jVar5;
                    ey4Var2 = ey4Var;
                    c1jVar4 = c1jVar8;
                    kxeVar5 = kxeVar6;
                    kxeVar4 = kxeVar3;
                    booleanValue = false;
                    c1j c1jVar9 = !booleanValue ? c1jVar4 : null;
                    gv9 W2 = l6g.W(list);
                    CrowdsourcingIncidentType crowdsourcingIncidentType2 = ey4Var3.b;
                    z = crowdsourcingIncidentType2 instanceof CrowdsourcingIncidentType.Card;
                    if (!z) {
                        i2 = R.string.crowdsourcing_carded_player;
                    } else {
                        if (!(crowdsourcingIncidentType2 instanceof CrowdsourcingIncidentType.Goal)) {
                            zzl.b();
                            return null;
                        }
                        i2 = R.string.scorer;
                    }
                    int i42 = i2;
                    if (!z) {
                        z2 = false;
                    } else {
                        if (!(crowdsourcingIncidentType2 instanceof CrowdsourcingIncidentType.Goal)) {
                            zzl.b();
                            return null;
                        }
                        z2 = true;
                    }
                    return new l44(ey4Var2, c1jVar9, W2, c0aVar, i42, z2, kxeVar4, kxeVar5, !c1jVar6.a.c || c1jVar6.b.c);
                }
                c1j c1jVar10 = c1jVar5;
                ey4Var2 = ey4Var;
                c1jVar4 = c1jVar10;
                kxeVar4 = kxeVar3;
                kxeVar5 = kxeVar6;
                booleanValue = true;
                if (!booleanValue) {
                }
                gv9 W22 = l6g.W(list);
                CrowdsourcingIncidentType crowdsourcingIncidentType22 = ey4Var3.b;
                z = crowdsourcingIncidentType22 instanceof CrowdsourcingIncidentType.Card;
                if (!z) {
                }
                int i422 = i2;
                if (!z) {
                }
                return new l44(ey4Var2, c1jVar9, W22, c0aVar, i422, z2, kxeVar4, kxeVar5, !c1jVar6.a.c || c1jVar6.b.c);
            }
            int i5 = this.x;
            ey4 ey4Var4 = this.w;
            q54 q54Var3 = this.u;
            c1jVar2 = this.t;
            kxeVar2 = this.s;
            kxeVar3 = this.r;
            y6a.M(obj);
            i = i5;
            ey4Var = ey4Var4;
            q54Var = q54Var3;
            u = obj;
            kxeVar6 = kxeVar2;
            if (!((Boolean) u).booleanValue()) {
                c1jVar5 = c1jVar2;
                c1j c1jVar102 = c1jVar5;
                ey4Var2 = ey4Var;
                c1jVar4 = c1jVar102;
                kxeVar4 = kxeVar3;
                kxeVar5 = kxeVar6;
                booleanValue = true;
                if (!booleanValue) {
                }
                gv9 W222 = l6g.W(list);
                CrowdsourcingIncidentType crowdsourcingIncidentType222 = ey4Var3.b;
                z = crowdsourcingIncidentType222 instanceof CrowdsourcingIncidentType.Card;
                if (!z) {
                }
                int i4222 = i2;
                if (!z) {
                }
                return new l44(ey4Var2, c1jVar9, W222, c0aVar, i4222, z2, kxeVar4, kxeVar5, !c1jVar6.a.c || c1jVar6.b.c);
            }
            this.z = ey4Var3;
            this.A = c1jVar6;
            this.B = list;
            this.C = c0aVar;
            this.D = null;
            this.r = kxeVar3;
            this.s = kxeVar6;
            this.t = c1jVar2;
            this.u = null;
            this.v = ey4Var;
            this.w = null;
            this.x = i;
            this.y = 4;
            v = q54Var.v(this);
            if (v != lu3Var) {
                c1jVar5 = c1jVar2;
                if (!((Boolean) v).booleanValue()) {
                }
                c1j c1jVar1022 = c1jVar5;
                ey4Var2 = ey4Var;
                c1jVar4 = c1jVar1022;
                kxeVar4 = kxeVar3;
                kxeVar5 = kxeVar6;
                booleanValue = true;
                if (!booleanValue) {
                }
                gv9 W2222 = l6g.W(list);
                CrowdsourcingIncidentType crowdsourcingIncidentType2222 = ey4Var3.b;
                z = crowdsourcingIncidentType2222 instanceof CrowdsourcingIncidentType.Card;
                if (!z) {
                }
                int i42222 = i2;
                if (!z) {
                }
                return new l44(ey4Var2, c1jVar9, W2222, c0aVar, i42222, z2, kxeVar4, kxeVar5, !c1jVar6.a.c || c1jVar6.b.c);
            }
            return lu3Var;
        }
        int i6 = this.x;
        ey4 ey4Var5 = this.w;
        q54 q54Var4 = this.u;
        c1jVar = this.t;
        kxe kxeVar11 = this.s;
        kxe kxeVar12 = this.r;
        y6a.M(obj);
        q54Var = q54Var4;
        kxeVar2 = kxeVar11;
        i = i6;
        ey4Var = ey4Var5;
        kxeVar = kxeVar12;
        y = obj;
        w34 w34Var = ((k24) y).b;
        if (w34Var instanceof u34) {
            this.z = ey4Var3;
            this.A = c1jVar6;
            this.B = list;
            this.C = c0aVar;
            this.D = null;
            this.r = kxeVar;
            this.s = kxeVar2;
            this.t = c1jVar;
            this.u = null;
            this.v = ey4Var;
            this.w = null;
            this.x = i;
            this.y = 2;
            u2 = q54Var.u(this);
            if (u2 != lu3Var) {
                c1jVar3 = c1jVar;
                booleanValue = ((Boolean) u2).booleanValue();
                c1j c1jVar72 = c1jVar3;
                ey4Var2 = ey4Var;
                c1jVar4 = c1jVar72;
                kxeVar4 = kxeVar;
                kxeVar5 = kxeVar2;
                if (!booleanValue) {
                }
                gv9 W22222 = l6g.W(list);
                CrowdsourcingIncidentType crowdsourcingIncidentType22222 = ey4Var3.b;
                z = crowdsourcingIncidentType22222 instanceof CrowdsourcingIncidentType.Card;
                if (!z) {
                }
                int i422222 = i2;
                if (!z) {
                }
                return new l44(ey4Var2, c1jVar9, W22222, c0aVar, i422222, z2, kxeVar4, kxeVar5, !c1jVar6.a.c || c1jVar6.b.c);
            }
        } else {
            if (!(w34Var instanceof v34)) {
                zzl.b();
                return null;
            }
            this.z = ey4Var3;
            this.A = c1jVar6;
            this.B = list;
            this.C = c0aVar;
            this.D = null;
            this.r = kxeVar;
            this.s = kxeVar2;
            this.t = c1jVar;
            this.u = q54Var;
            this.v = null;
            this.w = ey4Var;
            this.x = i;
            this.y = 3;
            u = q54Var.u(this);
            if (u != lu3Var) {
                c1jVar2 = c1jVar;
                kxeVar3 = kxeVar;
                kxeVar6 = kxeVar2;
                if (!((Boolean) u).booleanValue()) {
                }
            }
        }
        return lu3Var;
    }
}
