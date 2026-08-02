package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.newNetwork.SportCategoriesResponse;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g7i extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public h7i s;
    public int t;
    public final /* synthetic */ h7i u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g7i(h7i h7iVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = h7iVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        h7i h7iVar = this.u;
        switch (i) {
            case 0:
                return new g7i(h7iVar, rq3Var, 0);
            default:
                return new g7i(h7iVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((g7i) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        h7i h7iVar;
        List list;
        List<Category> categories;
        h7i h7iVar2;
        int i = this.r;
        h7i h7iVar3 = this.u;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.t;
                int i3 = 2;
                if (i2 == 0) {
                    y6a.M(obj);
                    vyh vyhVar = h7iVar3.f;
                    this.s = h7iVar3;
                    this.t = 1;
                    vyhVar.getClass();
                    obj = yaa.P(new uyh(vyhVar, Sports.MOTORSPORT, rq3Var, i3), this);
                    if (obj == lu3Var) {
                        break;
                    } else {
                        h7iVar = h7iVar3;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    h7iVar = this.s;
                    y6a.M(obj);
                }
                SportCategoriesResponse sportCategoriesResponse = (SportCategoriesResponse) yaa.x((x2g) obj);
                if (sportCategoriesResponse == null || (categories = sportCategoriesResponse.getCategories()) == null || (list = CollectionsKt.H0(categories, new o5i(new q6i(1), i3))) == null) {
                    list = km5.a;
                }
                h7iVar.n = list;
                h7iVar3.o = null;
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.t;
                if (i4 == 0) {
                    y6a.M(obj);
                    tak takVar = h7iVar3.g;
                    this.s = h7iVar3;
                    this.t = 1;
                    obj = takVar.c(this);
                    if (obj == lu3Var2) {
                        break;
                    } else {
                        h7iVar2 = h7iVar3;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    h7iVar2 = this.s;
                    y6a.M(obj);
                }
                h7iVar2.j = (Set) obj;
                h7iVar3.k = null;
                break;
        }
        return Unit.a;
    }
}
