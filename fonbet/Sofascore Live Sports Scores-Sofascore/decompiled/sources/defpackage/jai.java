package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Description;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.mvvm.model.TeamLinkedRound;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jai extends g7 implements vqf {
    public final String l;
    public final Function1 m;
    public final boolean n;
    public final boolean o;
    public final List p;
    public final boolean q;
    public final ArrayList r;
    public wai s;
    public cai t;
    public final iai u;
    public final LayoutInflater v;
    public Function0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jai(Context context, String str, Function1 function1, boolean z, List list, int i) {
        super(context);
        boolean z2 = (i & 8) == 0;
        z = (i & 16) != 0 ? false : z;
        if ((i & 32) != 0) {
            hai[] haiVarArr = hai.a;
            list = b.j(3, 1);
        }
        boolean z3 = (i & 64) == 0;
        context.getClass();
        list.getClass();
        this.l = str;
        this.m = function1;
        this.n = z2;
        this.o = z;
        this.p = list;
        this.q = z3;
        this.r = new ArrayList();
        this.t = d7a.z(context, str);
        this.u = new iai();
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.v = from;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [g7, jai] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [wai] */
    /* JADX WARN: Type inference failed for: r3v6, types: [bbi] */
    @Override // defpackage.g7
    public final void A() {
        x9i x9iVar;
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ?? next = it.next();
            if (next instanceof wai) {
                next = wai.a((wai) next, null, null, null, null, 511);
                cai caiVar = this.t;
                caiVar.getClass();
                next.b = caiVar;
            } else {
                if (next instanceof bbi) {
                    bbi bbiVar = (bbi) next;
                    ?? a = bbi.a(bbiVar, false, 511);
                    cai caiVar2 = this.t;
                    caiVar2.getClass();
                    a.e = caiVar2;
                    a.j = bbiVar.j;
                    a.k = bbiVar.k;
                    x9iVar = a;
                } else if (next instanceof x9i) {
                    x9i x9iVar2 = (x9i) next;
                    int i = x9iVar2.a;
                    String str = x9iVar2.b;
                    List list = x9iVar2.c;
                    List list2 = x9iVar2.d;
                    List list3 = x9iVar2.e;
                    List list4 = x9iVar2.f;
                    List list5 = x9iVar2.g;
                    cai caiVar3 = x9iVar2.h;
                    boolean z = x9iVar2.i;
                    str.getClass();
                    list.getClass();
                    list2.getClass();
                    list3.getClass();
                    list4.getClass();
                    list5.getClass();
                    caiVar3.getClass();
                    x9i x9iVar3 = new x9i(i, str, list, list2, list3, list4, list5, caiVar3, z);
                    cai caiVar4 = this.t;
                    caiVar4.getClass();
                    x9iVar3.h = caiVar4;
                    x9iVar = x9iVar3;
                }
                next = x9iVar;
            }
            arrayList2.add(next);
        }
        F(arrayList2);
    }

    @Override // defpackage.g7
    public final void F(List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.r;
        arrayList.clear();
        this.s = null;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            if (obj2 instanceof x9i) {
                Iterator it = this.i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if ((obj instanceof x9i) && ((x9i) obj).a == ((x9i) obj2).a) {
                        break;
                    }
                }
                if (obj != null) {
                    x9i x9iVar = (x9i) obj2;
                    x9iVar.i = ((x9i) obj).i;
                    cai caiVar = this.t;
                    caiVar.getClass();
                    x9iVar.h = caiVar;
                }
            } else if (obj2 instanceof wai) {
                wai waiVar = (wai) obj2;
                cai caiVar2 = this.t;
                caiVar2.getClass();
                waiVar.b = caiVar2;
                arrayList.add(Integer.valueOf(i));
                if (this.s == null) {
                    this.s = waiVar;
                }
            } else if (obj2 instanceof bbi) {
                cai caiVar3 = this.t;
                caiVar3.getClass();
                ((bbi) obj2).e = caiVar3;
            }
            i = i2;
        }
        super.F(list);
    }

    public final int G(String str) {
        Iterator it = this.i.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (next instanceof ebi) {
                ebi ebiVar = (ebi) next;
                if (Intrinsics.c(ebiVar.b.getGroupName(), str) || Intrinsics.c(ebiVar.c, str)) {
                    break;
                }
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i <= 1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        return this.g.size() + valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r1 > 1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int H(int i) {
        int i2;
        ArrayList arrayList = this.i;
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            Object next = it.next();
            if ((next instanceof ebi) && i == ((ebi) next).b.getId()) {
                break;
            }
            i3++;
        }
        Integer valueOf = Integer.valueOf(i3);
        if (valueOf.intValue() > 1) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if ((it2.next() instanceof ebi) && (i2 = i2 + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            } else {
                i2 = 0;
            }
        }
        valueOf = null;
        if (valueOf != null) {
            return this.g.size() + valueOf.intValue();
        }
        return 0;
    }

    public final void I(int i) {
        this.u.a = i;
        notifyDataSetChanged();
    }

    @Override // defpackage.ysk
    public final Integer a(int i) {
        hai[] haiVarArr = hai.a;
        if (i == 2) {
            return Integer.valueOf(R.id.ll_standings_header);
        }
        return null;
    }

    @Override // defpackage.vqf
    public final Object f(int i) {
        List list;
        List list2;
        List list3;
        List list4;
        String text;
        int size = i - this.g.size();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) next).intValue() <= size) {
                arrayList.add(next);
            }
        }
        Integer num = (Integer) CollectionsKt.k0(arrayList);
        if (num != null) {
            int intValue = num.intValue();
            ArrayList arrayList2 = this.i;
            Object a0 = CollectionsKt.a0(size, arrayList2);
            Object a02 = CollectionsKt.a0(size + 1, arrayList2);
            Object obj = arrayList2.get(intValue);
            wai waiVar = obj instanceof wai ? (wai) obj : null;
            if (a0 instanceof bbi) {
                bbi bbiVar = a02 instanceof bbi ? (bbi) a02 : null;
                if (bbiVar == null) {
                    bbiVar = (bbi) a0;
                }
                if (waiVar != null) {
                    int i2 = bbiVar.j;
                    Description promotion = bbiVar.c.getPromotion();
                    String str = (promotion == null || (text = promotion.getText()) == null) ? "" : text;
                    wai waiVar2 = this.s;
                    if (waiVar2 == null || (list3 = waiVar2.c) == null) {
                        list3 = km5.a;
                    }
                    List list5 = list3;
                    if (waiVar2 == null || (list4 = waiVar2.d) == null) {
                        list4 = km5.a;
                    }
                    return wai.a(waiVar, list5, list4, str, Integer.valueOf(i2), 403);
                }
            } else if ((a0 instanceof wai) && waiVar != null) {
                wai waiVar3 = (wai) a0;
                Integer num2 = waiVar3.g;
                String str2 = waiVar3.f;
                String str3 = str2 == null ? "" : str2;
                wai waiVar4 = this.s;
                if (waiVar4 == null || (list = waiVar4.c) == null) {
                    list = km5.a;
                }
                List list6 = list;
                if (waiVar4 == null || (list2 = waiVar4.d) == null) {
                    list2 = km5.a;
                }
                return wai.a(waiVar, list6, list2, str3, num2, 403);
            }
        }
        return null;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        ArrayList arrayList;
        if (!this.p.contains(Integer.valueOf(i))) {
            return false;
        }
        hai[] haiVarArr = hai.a;
        if (i == 3) {
            StandingsTableRow standingsTableRow = ((bbi) obj).c;
            if (standingsTableRow.getTeam().getDisabled()) {
                List<TeamLinkedRound> teamLinks = standingsTableRow.getTeam().getTeamLinks();
                if (teamLinks != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : teamLinks) {
                        if (!(((TeamLinkedRound) obj2) instanceof TeamLinkedRound.UnknownTeamLinkedRound)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    return false;
                }
            }
        } else if (i != 1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.g7
    public final void s() {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            arrayList.remove(0);
        }
        F(CollectionsKt.L0(this.i, 1));
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 15);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof wai) {
            hai[] haiVarArr = hai.a;
            return 2;
        }
        if (obj instanceof ebi) {
            hai[] haiVarArr2 = hai.a;
            return 1;
        }
        if (obj instanceof x9i) {
            hai[] haiVarArr3 = hai.a;
            return 4;
        }
        if (obj instanceof bbi) {
            hai[] haiVarArr4 = hai.a;
            return 3;
        }
        if (obj instanceof tai) {
            hai[] haiVarArr5 = hai.a;
            return 0;
        }
        if (obj instanceof bai) {
            hai[] haiVarArr6 = hai.a;
            return 5;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        hai[] haiVarArr = hai.a;
        LayoutInflater layoutInflater = this.v;
        if (i != 1) {
            boolean z = this.o;
            boolean z2 = this.q;
            iai iaiVar = this.u;
            if (i == 2) {
                return new xai(n9i.a(layoutInflater.inflate(R.layout.standings_cell, viewGroup, false)), iaiVar, z2, z);
            }
            if (i == 4) {
                return new j8i(rfe.a(layoutInflater.inflate(R.layout.standings_description_expandable, viewGroup, false)));
            }
            if (i == 3) {
                return new maf(n9i.a(layoutInflater.inflate(R.layout.standings_cell, viewGroup, false)), iaiVar, z2, z);
            }
            if (i == 0) {
                return new gai(this, e92.e(layoutInflater.inflate(R.layout.standings_row_switcher, viewGroup, false)));
            }
            if (i == 5) {
                return new s6i(u22.a(layoutInflater, viewGroup), 1);
            }
            ilg.c();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.header_tournament_standings, viewGroup, false);
        int i2 = R.id.chart_button;
        TextView textView = (TextView) nq8.B(R.id.chart_button, inflate);
        if (textView != null) {
            i2 = R.id.chart_button_click_zone;
            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.chart_button_click_zone, inflate);
            if (frameLayout != null) {
                i2 = R.id.tournament_name;
                TextView textView2 = (TextView) nq8.B(R.id.tournament_name, inflate);
                if (textView2 != null) {
                    return new gai(new ez0((LinearLayout) inflate, textView, frameLayout, textView2, 14), new fl8(0, this, jai.class, "onStandingsTrackerClicked", "onStandingsTrackerClicked()V", 0, 23));
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
