package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bqe extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ fqe t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bqe(fqe fqeVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = fqeVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        fqe fqeVar = this.t;
        switch (i) {
            case 0:
                return new bqe(fqeVar, i2, rq3Var, 0);
            case 1:
                return new bqe(fqeVar, i2, rq3Var, 1);
            case 2:
                return new bqe(fqeVar, i2, rq3Var, 2);
            default:
                return new bqe(fqeVar, i2, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((bqe) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        EventBestPlayer playerOfTheMatch;
        Player player;
        int i = this.r;
        int i2 = this.u;
        fqe fqeVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var = fqeVar.g;
                this.s = 1;
                Object d = s96Var.d(i2, this);
                return d == lu3Var ? lu3Var : d;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    s96 s96Var2 = fqeVar.g;
                    this.s = 1;
                    obj = s96Var2.h(i2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse = (EventBestPlayersSummaryResponse) obj;
                if (eventBestPlayersSummaryResponse == null || (playerOfTheMatch = eventBestPlayersSummaryResponse.getPlayerOfTheMatch()) == null || (player = playerOfTheMatch.getPlayer()) == null) {
                    return null;
                }
                return new Integer(player.getId());
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.s = 1;
                yzd yzdVar = fqe.B;
                Object v = fqeVar.v(i2, this);
                return v == lu3Var3 ? lu3Var3 : v;
            default:
                lu3 lu3Var4 = lu3.a;
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
                wve wveVar = fqeVar.e;
                this.s = 1;
                wveVar.getClass();
                Object P = yaa.P(new lh7((Serializable) null, wveVar, this.u, 0, (rq3) null, 4), this);
                return P == lu3Var4 ? lu3Var4 : P;
        }
    }
}
