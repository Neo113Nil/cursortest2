package defpackage;

import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.newNetwork.StageSeasonsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f8i extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ h8i t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8i(h8i h8iVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = h8iVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        h8i h8iVar = this.t;
        switch (i) {
            case 0:
                return new f8i(h8iVar, rq3Var, 0);
            case 1:
                return new f8i(h8iVar, rq3Var, 1);
            case 2:
                return new f8i(h8iVar, rq3Var, 2);
            default:
                return new f8i(h8iVar, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((f8i) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List<StageSeason> list;
        int i = this.r;
        h8i h8iVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = h8iVar.e;
                    int i3 = h8iVar.g;
                    this.s = 1;
                    j0jVar.getClass();
                    obj = yaa.P(new azi(j0jVar, i3, null, 3), this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                StageSeasonsResponse stageSeasonsResponse = (StageSeasonsResponse) yaa.x((x2g) obj);
                if (stageSeasonsResponse == null || (list = stageSeasonsResponse.getStageSeasons()) == null) {
                    list = km5.a;
                }
                StageSeason stageSeason = (StageSeason) CollectionsKt.a0(0, list);
                if ((stageSeason != null ? stageSeason.getUniqueStage() : null) != null) {
                    list.get(0);
                }
                h8iVar.n.j(list);
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    j0j j0jVar2 = h8iVar.e;
                    int i5 = h8iVar.g;
                    this.s = 1;
                    obj = j0jVar2.k(i5, this);
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
                return yaa.x((x2g) obj);
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
                j0j j0jVar3 = h8iVar.e;
                int i7 = h8iVar.g;
                this.s = 1;
                Object w = j0jVar3.w(i7, this);
                return w == lu3Var3 ? lu3Var3 : w;
            default:
                lu3 lu3Var4 = lu3.a;
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
                j0j j0jVar4 = h8iVar.e;
                int i9 = h8iVar.g;
                this.s = 1;
                Object x = j0jVar4.x(i9, this);
                return x == lu3Var4 ? lu3Var4 : x;
        }
    }
}
