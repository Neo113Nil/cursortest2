package defpackage;

import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class epc extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ fpc t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ epc(fpc fpcVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = fpcVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        fpc fpcVar = this.t;
        switch (i) {
            case 0:
                return new epc(fpcVar, rq3Var, 0);
            case 1:
                return new epc(fpcVar, rq3Var, 1);
            case 2:
                return new epc(fpcVar, rq3Var, 2);
            default:
                return new epc(fpcVar, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((epc) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        UniqueTournament uniqueTournament;
        int i = this.r;
        fpc fpcVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar = fpcVar.e;
                int i3 = fpcVar.f;
                String t6eVar = t6e.a.toString();
                this.s = 1;
                Object O = w3bVar.O(i3, t6eVar, this);
                return O == lu3Var ? lu3Var : O;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar2 = fpcVar.e;
                int i5 = fpcVar.f;
                String t6eVar2 = t6e.b.toString();
                this.s = 1;
                Object O2 = w3bVar2.O(i5, t6eVar2, this);
                return O2 == lu3Var2 ? lu3Var2 : O2;
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
                w3b w3bVar3 = fpcVar.e;
                int i7 = fpcVar.f;
                this.s = 1;
                Object G = w3bVar3.G(i7, this);
                return G == lu3Var3 ? lu3Var3 : G;
            default:
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    w3b w3bVar4 = fpcVar.e;
                    int i9 = fpcVar.f;
                    this.s = 1;
                    obj = w3bVar4.q0(i9, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                UniqueTournamentResponse uniqueTournamentResponse = (UniqueTournamentResponse) obj;
                if (uniqueTournamentResponse == null || (uniqueTournament = uniqueTournamentResponse.getUniqueTournament()) == null) {
                    return null;
                }
                fpcVar.g.j(uniqueTournament);
                return uniqueTournament;
        }
    }
}
