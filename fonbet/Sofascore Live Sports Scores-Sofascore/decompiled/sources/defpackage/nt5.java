package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.TeamSelection;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nt5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventBoxScoreFragment b;

    public /* synthetic */ nt5(EventBoxScoreFragment eventBoxScoreFragment, int i) {
        this.a = i;
        this.b = eventBoxScoreFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 8;
        int i3 = 2;
        boolean z = true;
        boolean z2 = true;
        EventBoxScoreFragment eventBoxScoreFragment = this.b;
        switch (i) {
            case 0:
                ((View) obj).getClass();
                krk krkVar = eventBoxScoreFragment.l;
                krkVar.getClass();
                eventBoxScoreFragment.C(((a22) krkVar).f);
                return Unit.a;
            case 1:
                Pair pair = (Pair) obj;
                pair.getClass();
                m22 m22Var = (m22) pair.a;
                x12 x12Var = (x12) pair.b;
                if (eventBoxScoreFragment.H()) {
                    Calendar calendar = ke0.a;
                    Context requireContext = eventBoxScoreFragment.requireContext();
                    requireContext.getClass();
                    r9k a = x12Var.a();
                    Context requireContext2 = eventBoxScoreFragment.requireContext();
                    requireContext2.getClass();
                    ke0.g(requireContext, a.b(requireContext2), 0);
                } else {
                    kv5 G = eventBoxScoreFragment.G();
                    m22Var.getClass();
                    String str = m22Var.a;
                    x12Var.getClass();
                    G.q.put(str, x12Var);
                    G.u();
                    int size = eventBoxScoreFragment.F().g.size();
                    Iterator it = eventBoxScoreFragment.F().i.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (!(next instanceof m22) || !Intrinsics.c(((m22) next).a, str)) {
                                i4++;
                            }
                        } else {
                            i4 = -1;
                        }
                    }
                    int i5 = size + i4;
                    r5 = i5 != 0 ? i5 - 1 : 0;
                    krk krkVar2 = eventBoxScoreFragment.l;
                    krkVar2.getClass();
                    ((a22) krkVar2).f.smoothScrollToPosition(r5);
                }
                return Unit.a;
            case 2:
                ((View) obj).getClass();
                krk krkVar3 = eventBoxScoreFragment.l;
                krkVar3.getClass();
                ((a22) krkVar3).f.scrollToPosition(0);
                return Unit.a;
            case 3:
                boolean z3 = ((hv5) obj).a;
                krk krkVar4 = eventBoxScoreFragment.l;
                krkVar4.getClass();
                ConstraintLayout constraintLayout = ((a22) krkVar4).c.a;
                constraintLayout.getClass();
                if (z3 && !eventBoxScoreFragment.H()) {
                    i2 = 0;
                }
                constraintLayout.setVisibility(i2);
                if (eventBoxScoreFragment.H()) {
                    eventBoxScoreFragment.G().m(true, false);
                    eventBoxScoreFragment.K(true);
                } else if (z3) {
                    krk krkVar5 = eventBoxScoreFragment.l;
                    krkVar5.getClass();
                    ((a22) krkVar5).c.b.setOnCheckedChangeListener(new hn(eventBoxScoreFragment, i3));
                    krk krkVar6 = eventBoxScoreFragment.l;
                    krkVar6.getClass();
                    ((a22) krkVar6).c.b.setChecked(eventBoxScoreFragment.G().m);
                }
                eventBoxScoreFragment.K(eventBoxScoreFragment.G().m && z3);
                if (eventBoxScoreFragment.G().m && !z3) {
                    eventBoxScoreFragment.G().m(false, true);
                }
                return Unit.a;
            case 4:
                q22 q22Var = (q22) obj;
                if (!eventBoxScoreFragment.A) {
                    eventBoxScoreFragment.A = true;
                    Set set = wyh.a;
                    boolean g = wyh.g(ok3.s(eventBoxScoreFragment.E()));
                    xbb b = a.b();
                    b.add(new r1h("First", new tc3(-493980985, new st5(eventBoxScoreFragment, r5), true)));
                    if (g) {
                        b.add(new q1h("Combined", new tc3(621462283, new ot5(eventBoxScoreFragment, i3), true), new tc3(1522530218, new ot5(eventBoxScoreFragment, 3), true)));
                    }
                    b.add(new r1h("Second", new tc3(-961072130, new st5(eventBoxScoreFragment, z2 ? 1 : 0), true)));
                    xbb a2 = a.a(b);
                    krk krkVar7 = eventBoxScoreFragment.l;
                    krkVar7.getClass();
                    SegmentedButtonsView segmentedButtonsView = ((a22) krkVar7).i;
                    Boolean bool = Boolean.FALSE;
                    Pair pair2 = new Pair(bool, bool);
                    mt5 mt5Var = new mt5(eventBoxScoreFragment, z ? 1 : 0);
                    t1h[] t1hVarArr = (t1h[]) a2.toArray(new t1h[0]);
                    t1h[] t1hVarArr2 = (t1h[]) Arrays.copyOf(t1hVarArr, t1hVarArr.length);
                    rlh rlhVar = rlh.b;
                    rlhVar.getClass();
                    hfe d = rlhVar.d();
                    o13.w(d, t1hVarArr2);
                    b7 d2 = d.d();
                    String str2 = g ? "Combined" : "First";
                    segmentedButtonsView.k = mt5Var;
                    segmentedButtonsView.g = false;
                    segmentedButtonsView.h = pair2;
                    segmentedButtonsView.j = v1h.f;
                    segmentedButtonsView.i = new z1h(0);
                    segmentedButtonsView.setSelectedItem(str2);
                    if (d2 == null) {
                        d2 = rlh.b;
                    }
                    if (!d2.isEmpty()) {
                        SegmentedButtonsView.t(segmentedButtonsView, d2, null, 6);
                    }
                }
                krk krkVar8 = eventBoxScoreFragment.l;
                krkVar8.getClass();
                GraphicLarge graphicLarge = ((a22) krkVar8).d;
                ArrayList arrayList = q22Var.b;
                ArrayList arrayList2 = q22Var.c;
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    i2 = 0;
                }
                graphicLarge.setVisibility(i2);
                o12 F = eventBoxScoreFragment.F();
                TeamSelection teamSelection = eventBoxScoreFragment.G().l;
                if (teamSelection == null) {
                    Intrinsics.i("selectedTeam");
                    throw null;
                }
                F.q = teamSelection == TeamSelection.Combined;
                o12 F2 = eventBoxScoreFragment.F();
                ArrayList arrayList3 = q22Var.b;
                boolean isEmpty = arrayList3.isEmpty();
                List list = arrayList3;
                if (isEmpty) {
                    list = a.c((j29) eventBoxScoreFragment.B.getValue());
                }
                F2.F(list);
                ((xh) eventBoxScoreFragment.w.getValue()).F(arrayList2);
                eventBoxScoreFragment.I(q22Var.d);
                if (eventBoxScoreFragment.z) {
                    eventBoxScoreFragment.z = false;
                    krk krkVar9 = eventBoxScoreFragment.l;
                    krkVar9.getClass();
                    l adapter = ((a22) krkVar9).f.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                    krk krkVar10 = eventBoxScoreFragment.l;
                    krkVar10.getClass();
                    eventBoxScoreFragment.t(((a22) krkVar10).f, new nt5(eventBoxScoreFragment, r5));
                }
                return Unit.a;
            default:
                hf9 hf9Var = (hf9) obj;
                ArrayList arrayList4 = eventBoxScoreFragment.F().i;
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayList4.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        b.q();
                        throw null;
                    }
                    Integer valueOf = (((next2 instanceof m22) && next2.equals(hf9Var.c)) || ((next2 instanceof i22) && ((i22) next2).m.equals(hf9Var.c)) || ((next2 instanceof zm1) && ((zm1) next2).m.equals(hf9Var.c))) ? Integer.valueOf(eventBoxScoreFragment.F().g.size() + i6) : null;
                    if (valueOf != null) {
                        arrayList5.add(valueOf);
                    }
                    i6 = i7;
                }
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    int intValue = ((Number) it3.next()).intValue();
                    krk krkVar11 = eventBoxScoreFragment.l;
                    krkVar11.getClass();
                    u findViewHolderForAdapterPosition = ((a22) krkVar11).f.findViewHolderForAdapterPosition(intValue);
                    ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = findViewHolderForAdapterPosition instanceof am2 ? (ScrollInterceptorHorizontalScrollView) p12.a(((am2) findViewHolderForAdapterPosition).itemView).g : findViewHolderForAdapterPosition instanceof dse ? (ScrollInterceptorHorizontalScrollView) j22.a(((dse) findViewHolderForAdapterPosition).itemView).p : findViewHolderForAdapterPosition instanceof cn1 ? (ScrollInterceptorHorizontalScrollView) ez0.a(((cn1) findViewHolderForAdapterPosition).itemView).d : null;
                    if (scrollInterceptorHorizontalScrollView != null) {
                        int scrollX = scrollInterceptorHorizontalScrollView.getScrollX();
                        int i8 = hf9Var.a;
                        if (scrollX != i8) {
                            scrollInterceptorHorizontalScrollView.scrollTo(i8, 0);
                        }
                    }
                }
                krk krkVar12 = eventBoxScoreFragment.l;
                krkVar12.getClass();
                if (((a22) krkVar12).e.getChildCount() == 1) {
                    krk krkVar13 = eventBoxScoreFragment.l;
                    krkVar13.getClass();
                    ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView2 = (ScrollInterceptorHorizontalScrollView) p12.a(((a22) krkVar13).e.getChildAt(0)).g;
                    if (Intrinsics.c(hf9Var.c, eventBoxScoreFragment.y)) {
                        int scrollX2 = scrollInterceptorHorizontalScrollView2.getScrollX();
                        int i9 = hf9Var.a;
                        if (scrollX2 != i9) {
                            scrollInterceptorHorizontalScrollView2.scrollTo(i9, 0);
                        }
                    }
                }
                return Unit.a;
        }
    }
}
