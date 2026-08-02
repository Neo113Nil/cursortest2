package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u56 extends g7 {
    public final LayoutInflater l;
    public y56 m;
    public final LinkedHashMap n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u56(Context context, Event event) {
        super(context);
        context.getClass();
        this.l = LayoutInflater.from(context);
        this.n = new LinkedHashMap();
    }

    public final void G(y56 y56Var) {
        Collection collection;
        Collection collection2;
        Object obj;
        List list;
        Object obj2;
        List list2;
        y56Var.getClass();
        this.m = y56Var;
        ArrayList arrayList = new ArrayList();
        String seasonStatisticsType = y56Var.a.getSeasonStatisticsType();
        TopPerformanceStatistics topPerformanceStatistics = y56Var.b;
        Context context = this.b;
        if (topPerformanceStatistics == null || (collection = cbb.b(context, topPerformanceStatistics, seasonStatisticsType)) == null) {
            collection = km5.a;
        }
        TopPerformanceStatistics topPerformanceStatistics2 = y56Var.c;
        if (topPerformanceStatistics2 == null || (collection2 = cbb.b(context, topPerformanceStatistics2, seasonStatisticsType)) == null) {
            collection2 = km5.a;
        }
        Collection collection3 = !collection.isEmpty() ? collection : null;
        if (collection3 == null) {
            collection3 = collection2;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collection3) {
            cmj cmjVar = (cmj) obj3;
            cmjVar.getClass();
            context.getClass();
            if (!Intrinsics.c(cmjVar.g0(), context.getString(R.string.average_sofascore_rating))) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((cmj) it.next()).a);
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            boolean c = Intrinsics.c((Boolean) this.n.get(str), Boolean.TRUE);
            Iterator it3 = collection.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (((cmj) obj).a.equals(str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            cmj cmjVar2 = (cmj) obj;
            if (cmjVar2 == null || (list = cmjVar2.b) == null) {
                list = km5.a;
            }
            Iterator it4 = collection2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    obj2 = it4.next();
                    if (((cmj) obj2).a.equals(str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            cmj cmjVar3 = (cmj) obj2;
            if (cmjVar3 == null || (list2 = cmjVar3.b) == null) {
                list2 = km5.a;
            }
            boolean z = list.size() <= 1 && list2.size() <= 1;
            boolean isEmpty = list.isEmpty();
            boolean isEmpty2 = list2.isEmpty();
            if (!isEmpty || !isEmpty2) {
                arrayList.add(new s56(str));
                int max = Math.max(list.size(), list2.size());
                if (!c && max > 1) {
                    max = 1;
                }
                for (int i = 0; i < max; i++) {
                    arrayList.add(new r56((fmj) CollectionsKt.a0(i, list), (fmj) CollectionsKt.a0(i, list2), i));
                }
                if (z) {
                    Object j0 = CollectionsKt.j0(arrayList);
                    r56 r56Var = j0 instanceof r56 ? (r56) j0 : null;
                    if (r56Var != null) {
                        r56Var.d = true;
                    }
                } else {
                    arrayList.add(new q56(str, c));
                }
            }
        }
        F(arrayList);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return i != 1;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 21);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        t56 t56Var = (t56) obj;
        t56Var.getClass();
        if (t56Var instanceof s56) {
            return 1;
        }
        if (t56Var instanceof q56) {
            return 3;
        }
        if (t56Var instanceof r56) {
            return 2;
        }
        zzl.b();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = 2;
        LayoutInflater layoutInflater = this.l;
        if (i == 1) {
            View inflate = layoutInflater.inflate(R.layout.prematch_lineups_top_players_section_layout, viewGroup, false);
            TextView textView = (TextView) nq8.B(R.id.section_text, inflate);
            if (textView != null) {
                return new ja9(new o16((FrameLayout) inflate, textView, i2), (byte) 0);
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.section_text)));
            return null;
        }
        ejg ejgVar = this.a;
        if (i != 2) {
            if (i != 3) {
                ilg.c();
                return null;
            }
            View inflate2 = layoutInflater.inflate(R.layout.card_bottom_link, viewGroup, false);
            LinearLayout linearLayout = (LinearLayout) inflate2;
            TextView textView2 = (TextView) nq8.B(R.id.bottom_link_text, inflate2);
            if (textView2 != null) {
                return new vh(new dk2(linearLayout, textView2, 0), (ct8) ejgVar.d);
            }
            yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(R.id.bottom_link_text)));
            return null;
        }
        View inflate3 = layoutInflater.inflate(R.layout.lineups_player_double_item, viewGroup, false);
        int i3 = R.id.first_item;
        View B = nq8.B(R.id.first_item, inflate3);
        if (B != null) {
            ss9 a = ss9.a(B);
            i3 = R.id.first_item_holder;
            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.first_item_holder, inflate3);
            if (frameLayout != null) {
                i3 = R.id.second_item;
                View B2 = nq8.B(R.id.second_item, inflate3);
                if (B2 != null) {
                    ss9 a2 = ss9.a(B2);
                    i3 = R.id.second_item_holder;
                    FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.second_item_holder, inflate3);
                    if (frameLayout2 != null) {
                        return new vh(new e92((ViewGroup) inflate3, (Object) a, (ViewGroup) frameLayout, (Object) a2, (View) frameLayout2, 9), (ct8) ejgVar.d);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i3)));
        return null;
    }
}
