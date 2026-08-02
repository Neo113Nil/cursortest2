package defpackage;

import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.SearchManagersResponse;
import com.sofascore.model.newNetwork.SearchVenuesResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ci5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ di5 t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci5(di5 di5Var, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = di5Var;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        di5 di5Var = this.t;
        switch (i) {
            case 0:
                return new ci5(di5Var, str, rq3Var, 0);
            default:
                return new ci5(di5Var, str, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ci5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r12 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (defpackage.n4o.y(100, r11) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0096, code lost:
    
        if (r12 == r9) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0082, code lost:
    
        if (defpackage.n4o.y(100, r11) == r9) goto L36;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Sport sport;
        List<Venue> list;
        int i = this.r;
        String str2 = this.u;
        di5 di5Var = this.t;
        switch (i) {
            case 0:
                yzc yzcVar = di5Var.i;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            x2g x2gVar = (x2g) obj;
                            if (x2gVar instanceof v2g) {
                                Team team = di5Var.m;
                                if (team == null || (sport = team.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                List<Manager> managers = ((SearchManagersResponse) ((v2g) x2gVar).a).getManagers();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : managers) {
                                    Sport sport2 = ((Manager) obj2).getSport();
                                    if (Intrinsics.c(sport2 != null ? sport2.getSlug() : null, str)) {
                                        arrayList.add(obj2);
                                    }
                                }
                                yzcVar.j(CollectionsKt.S0(arrayList));
                            } else {
                                yzcVar.j(km5.a);
                            }
                            break;
                        } else {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        y6a.M(obj);
                    }
                } else {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                }
                e64 e64Var = di5Var.f;
                this.s = 2;
                e64Var.getClass();
                obj = yaa.P(new d64(e64Var, str2, null, 0), this);
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            y6a.M(obj);
                            yzc yzcVar2 = di5Var.k;
                            SearchVenuesResponse searchVenuesResponse = (SearchVenuesResponse) yaa.x((x2g) obj);
                            if (searchVenuesResponse == null || (list = searchVenuesResponse.getVenues()) == null) {
                                list = km5.a;
                            }
                            yzcVar2.j(list);
                            break;
                        } else {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        y6a.M(obj);
                    }
                } else {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                }
                e64 e64Var2 = di5Var.f;
                this.s = 2;
                e64Var2.getClass();
                obj = yaa.P(new d64(e64Var2, str2, null, 2), this);
                break;
        }
        return Unit.a;
    }
}
