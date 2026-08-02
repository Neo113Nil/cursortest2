package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.sofascore.model.newNetwork.SeasonShotAction;
import com.sofascore.model.newNetwork.ShotActionArea;
import com.sofascore.results.R;
import com.sofascore.results.view.graph.BasketballShotmapGraph;
import com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph;
import com.sofascore.results.view.graph.BasketballShotmapView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vr1 extends yve {
    public final e92 j;
    public int k;
    public zve l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(Context context) {
        super(context);
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.player_season_shot_map, (ViewGroup) getBinding().a, false);
        int i = R.id.shot_map_description;
        View B = nq8.B(R.id.shot_map_description, inflate);
        if (B != null) {
            View B2 = nq8.B(R.id.shot_map_color_description, B);
            if (B2 == null) {
                yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(R.id.shot_map_color_description)));
                throw null;
            }
            pu1 b = pu1.b(B2);
            ed edVar = new ed((LinearLayout) B, 22, b);
            i = R.id.shot_map_header;
            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.shot_map_header, inflate);
            if (typeHeaderView != null) {
                i = R.id.shot_map_heat_map;
                BasketballShotmapGraph basketballShotmapGraph = (BasketballShotmapGraph) nq8.B(R.id.shot_map_heat_map, inflate);
                if (basketballShotmapGraph != null) {
                    i = R.id.shotmap;
                    BasketballShotmapView basketballShotmapView = (BasketballShotmapView) nq8.B(R.id.shotmap, inflate);
                    if (basketballShotmapView != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        this.j = new e92((ViewGroup) linearLayout, (Object) edVar, (Object) typeHeaderView, (Object) basketballShotmapGraph, (Object) basketballShotmapView, 20);
                        this.k = -1;
                        this.m = -1;
                        Integer valueOf = Integer.valueOf(R.drawable.ic_shotmap_terrain);
                        linearLayout.getClass();
                        t2.j(this, R.string.season_shot_map, valueOf, 0, linearLayout, false, "BASKETBALL_PLAYER_SEASON_SHOTMAP", null, null, 394);
                        b.c.setImageTintList(eq3.q(R.color.rating_00, context));
                        b.d.setText(context.getString(R.string.shotmap_minimum_shots));
                        kp5 kp5Var = tfh.d;
                        ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
                        Iterator<E> it = kp5Var.iterator();
                        while (it.hasNext()) {
                            arrayList.add(context.getString(((tfh) it.next()).a));
                        }
                        g5k g5kVar = new g5k((TypeHeaderView) this.j.b);
                        g5kVar.a = arrayList;
                        g5kVar.f = uxf.p;
                        g5kVar.c = (String) CollectionsKt.a0(1, arrayList);
                        g5kVar.m = new ur1(this, 0);
                        g5kVar.b();
                        setTopDividerVisibility(false);
                        setBottomDividerVisibility(false);
                        o8.d(this, 0, 7);
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void n() {
        zve zveVar = this.l;
        if (zveVar != null) {
            ArrayList arrayList = zveVar.b;
            ArrayList arrayList2 = zveVar.c;
            if (this.k > 0) {
                int i = this.m;
                if (i == -1) {
                    this.m = 1;
                    i = 1;
                }
                BasketballShotmapGraph basketballShotmapGraph = (BasketballShotmapGraph) this.j.f;
                if (i != 0) {
                    if (i != 1) {
                        arrayList = arrayList2;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(arrayList);
                        arrayList3.addAll(arrayList2);
                        arrayList = arrayList3;
                    }
                }
                basketballShotmapGraph.a(arrayList, this.k);
            }
        }
    }

    @Override // defpackage.yve
    public void setShotMapData(@NotNull dzg dzgVar) {
        dzgVar.getClass();
        List<ShotActionArea> list = dzgVar.c;
        List list2 = dzgVar.b;
        if (list == null || list.isEmpty() || list2.isEmpty()) {
            return;
        }
        setVisibility(0);
        zve zveVar = new zve();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            zveVar.a((SeasonShotAction) it.next());
        }
        this.l = zveVar;
        if (list != null) {
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            for (ShotActionArea shotActionArea : list) {
                arrayList.add(new ShotActionArea(shotActionArea.getArea(), shotActionArea.getP1(), shotActionArea.getP2(), shotActionArea.getP3(), shotActionArea.getP4(), shotActionArea.getP5(), shotActionArea.getAverage()));
            }
        }
        this.k = dzgVar.a;
        n();
        e92 e92Var = this.j;
        BasketballShotmapView basketballShotmapView = (BasketballShotmapView) e92Var.c;
        zve zveVar2 = new zve();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            zveVar2.a((SeasonShotAction) it2.next());
        }
        basketballShotmapView.d = zveVar2;
        se5 se5Var = new se5(list);
        basketballShotmapView.e = se5Var;
        if (list != null) {
            ((BasketballShotmapPlayAreasGraph) basketballShotmapView.a.c).b(basketballShotmapView.d, se5Var, true);
            int i = basketballShotmapView.b;
            if (i == 0) {
                i = 100;
            }
            basketballShotmapView.a(i);
        }
        LinearLayout linearLayout = ((pu1) ((ed) e92Var.d).c).b;
        linearLayout.getClass();
        linearLayout.setVisibility(((BasketballShotmapView) e92Var.c).getHasEmptyLabels() ? 0 : 8);
    }
}
