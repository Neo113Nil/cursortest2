package defpackage;

import com.sofascore.model.newNetwork.TrendingGridTile;
import com.sofascore.model.newNetwork.TrendingGridTileSize;
import com.sofascore.model.newNetwork.TrendingGridTileType;
import com.sofascore.model.newNetwork.TrendingGridTilesResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b0k extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ c0k t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0k(c0k c0kVar, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = c0kVar;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        c0k c0kVar = this.t;
        switch (i) {
            case 0:
                return new b0k(c0kVar, str, rq3Var, 0);
            default:
                return new b0k(c0kVar, str, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((b0k) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List<TrendingGridTile> tiles;
        int i = this.r;
        String str = this.u;
        c0k c0kVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    vyh vyhVar = c0kVar.l;
                    this.s = 1;
                    vyhVar.getClass();
                    obj = yaa.P(new uyh(vyhVar, str, null, 4), this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                List list = (List) yaa.x((x2g) obj);
                if (list == null) {
                    break;
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    vyh vyhVar2 = c0kVar.l;
                    this.s = 1;
                    vyhVar2.getClass();
                    obj = yaa.P(new uyh(vyhVar2, str, null, 5), this);
                    if (obj == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                TrendingGridTilesResponse trendingGridTilesResponse = (TrendingGridTilesResponse) yaa.x((x2g) obj);
                if (trendingGridTilesResponse != null && (tiles = trendingGridTilesResponse.getTiles()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : tiles) {
                        TrendingGridTile trendingGridTile = (TrendingGridTile) obj2;
                        if (trendingGridTile.getType() != TrendingGridTileType.UNKNOWN && trendingGridTile.getSize() != TrendingGridTileSize.UNKNOWN) {
                            arrayList.add(obj2);
                        }
                    }
                    break;
                } else {
                    break;
                }
                break;
        }
        return km5.a;
    }
}
