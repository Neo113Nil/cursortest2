package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.results.R;
import com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class f3i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageDetailsRankingFragment b;

    public /* synthetic */ f3i(StageDetailsRankingFragment stageDetailsRankingFragment, int i) {
        this.a = i;
        this.b = stageDetailsRankingFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0236, code lost:
    
        if (defpackage.yid.m(r8 != null ? java.lang.Integer.valueOf(r8.size()) : null) > 0) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        final StageDetailsRankingFragment stageDetailsRankingFragment = this.b;
        switch (i) {
            case 0:
                n3i n3iVar = (n3i) obj;
                stageDetailsRankingFragment.n();
                List list = n3iVar.a;
                ta4 ta4Var = n3iVar.h;
                xbb xbbVar = n3iVar.g;
                j5i j5iVar = n3iVar.f;
                List list2 = n3iVar.e;
                boolean z2 = n3iVar.i;
                joa joaVar = stageDetailsRankingFragment.x;
                ConstraintLayout constraintLayout = ((c75) joaVar.getValue()).a;
                constraintLayout.getClass();
                constraintLayout.setVisibility((list.isEmpty() || !n3iVar.b) ? 8 : 0);
                ((c75) joaVar.getValue()).b.setChecked(z2);
                final int i2 = 1;
                if (stageDetailsRankingFragment.t == null && Boolean.valueOf(!list2.isEmpty()).equals(Boolean.TRUE)) {
                    stageDetailsRankingFragment.v = j5iVar;
                    Context requireContext = stageDetailsRankingFragment.requireContext();
                    requireContext.getClass();
                    TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                    g5k g5kVar = new g5k(typeHeaderView);
                    ArrayList arrayList = new ArrayList(k13.r(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((j5i) it.next()).name());
                    }
                    g5kVar.a = arrayList;
                    g5kVar.d = new aaf(22, typeHeaderView, stageDetailsRankingFragment);
                    g5kVar.m = new d5k() { // from class: e3i
                        @Override // defpackage.d5k
                        public final void a(int i3, String str) {
                            int i4 = i2;
                            StageDetailsRankingFragment stageDetailsRankingFragment2 = stageDetailsRankingFragment;
                            switch (i4) {
                                case 0:
                                    str.getClass();
                                    q3i D = stageDetailsRankingFragment2.D();
                                    for (ta4 ta4Var2 : ta4.h) {
                                        if (ta4Var2.a.equals(str)) {
                                            D.k = ta4Var2;
                                            D.m = null;
                                            D.m();
                                            break;
                                        }
                                    }
                                    ogj.m("Collection contains no element matching the predicate.");
                                    break;
                                default:
                                    str.getClass();
                                    for (j5i j5iVar2 : j5i.e) {
                                        if (Intrinsics.c(j5iVar2.name(), str)) {
                                            stageDetailsRankingFragment2.v = j5iVar2;
                                            q3i D2 = stageDetailsRankingFragment2.D();
                                            D2.j = j5iVar2;
                                            D2.m = D2.l ? 0 : null;
                                            D2.m();
                                            break;
                                        }
                                    }
                                    ogj.m("Collection contains no element matching the predicate.");
                                    break;
                            }
                        }
                    };
                    g5kVar.c = j5iVar.name();
                    g5kVar.b();
                    Unit unit = Unit.a;
                    typeHeaderView.setBackgroundResource(R.drawable.bg_bottom_divider_surface_1);
                    r6.p(stageDetailsRankingFragment.C().g.size(), typeHeaderView);
                    stageDetailsRankingFragment.t = typeHeaderView;
                }
                if (stageDetailsRankingFragment.w == null && Boolean.valueOf(!xbbVar.isEmpty()).equals(Boolean.TRUE)) {
                    Context requireContext2 = stageDetailsRankingFragment.requireContext();
                    requireContext2.getClass();
                    TypeHeaderView typeHeaderView2 = new TypeHeaderView(requireContext2, null, 6);
                    g5k g5kVar2 = new g5k(typeHeaderView2);
                    ArrayList arrayList2 = new ArrayList(k13.r(xbbVar, 10));
                    ListIterator listIterator = xbbVar.listIterator(0);
                    while (true) {
                        hc9 hc9Var = (hc9) listIterator;
                        if (hc9Var.hasNext()) {
                            arrayList2.add(((ta4) hc9Var.next()).a);
                        } else {
                            g5kVar2.a = arrayList2;
                            z = false;
                            g5kVar2.d = new h3i(typeHeaderView2, 0);
                            final Object[] objArr = 0 == true ? 1 : 0;
                            g5kVar2.m = new d5k() { // from class: e3i
                                @Override // defpackage.d5k
                                public final void a(int i3, String str) {
                                    int i4 = objArr;
                                    StageDetailsRankingFragment stageDetailsRankingFragment2 = stageDetailsRankingFragment;
                                    switch (i4) {
                                        case 0:
                                            str.getClass();
                                            q3i D = stageDetailsRankingFragment2.D();
                                            for (ta4 ta4Var2 : ta4.h) {
                                                if (ta4Var2.a.equals(str)) {
                                                    D.k = ta4Var2;
                                                    D.m = null;
                                                    D.m();
                                                    break;
                                                }
                                            }
                                            ogj.m("Collection contains no element matching the predicate.");
                                            break;
                                        default:
                                            str.getClass();
                                            for (j5i j5iVar2 : j5i.e) {
                                                if (Intrinsics.c(j5iVar2.name(), str)) {
                                                    stageDetailsRankingFragment2.v = j5iVar2;
                                                    q3i D2 = stageDetailsRankingFragment2.D();
                                                    D2.j = j5iVar2;
                                                    D2.m = D2.l ? 0 : null;
                                                    D2.m();
                                                    break;
                                                }
                                            }
                                            ogj.m("Collection contains no element matching the predicate.");
                                            break;
                                    }
                                }
                            };
                            g5kVar2.c = ta4Var.name();
                            g5kVar2.b();
                            r4.p(stageDetailsRankingFragment.C().g.size(), typeHeaderView2);
                            stageDetailsRankingFragment.w = typeHeaderView2;
                        }
                    }
                } else {
                    z = false;
                }
                Object value = stageDetailsRankingFragment.u.getValue();
                value.getClass();
                ((View) value).setVisibility(list.isEmpty() ? z : 8);
                a8i C = stageDetailsRankingFragment.C();
                Context context = C.b;
                boolean z3 = C.A;
                Integer num = n3iVar.j;
                List<Stage> list3 = n3iVar.d;
                ArrayList arrayList3 = n3iVar.c;
                if (z3 != z2 || C.s != j5iVar || C.u != ta4Var) {
                    C.z.e(context);
                    C.A = z2;
                    C.s = j5iVar;
                    C.u = ta4Var;
                }
                xbb b = a.b();
                List list4 = n3iVar.a;
                if (!list4.isEmpty()) {
                    b.add(new t7i(j5iVar, arrayList3, list3, num));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        b.add(new y7i((l3i) it2.next(), arrayList3, list3, num));
                    }
                    if (!list4.isEmpty()) {
                        Iterator it3 = list4.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (Intrinsics.c(((l3i) it3.next()).a.isLive(), Boolean.TRUE)) {
                                    z = true;
                                }
                            }
                        }
                    }
                    Iterator it4 = list4.iterator();
                    if (it4.hasNext()) {
                        long n = yid.n(((l3i) it4.next()).a.getUpdatedAtTimestamp());
                        while (it4.hasNext()) {
                            long n2 = yid.n(((l3i) it4.next()).a.getUpdatedAtTimestamp());
                            if (n < n2) {
                                n = n2;
                            }
                        }
                        b.add(new v7i(n, z));
                        if (!arrayList3.isEmpty()) {
                            Iterator it5 = arrayList3.iterator();
                            while (it5.hasNext()) {
                                if (((k3i) it5.next()).b != null) {
                                    b.add(x7i.a);
                                    Iterator it6 = arrayList3.iterator();
                                    while (it6.hasNext()) {
                                        k3i k3iVar = (k3i) it6.next();
                                        Integer num2 = k3iVar.b;
                                        if (num2 != null) {
                                            int intValue = num2.intValue();
                                            String string = context.getString(k3iVar.a);
                                            string.getClass();
                                            String string2 = context.getString(intValue);
                                            string2.getClass();
                                            b.add(new w7i(string, string2));
                                        }
                                    }
                                    if (list3 != null) {
                                        for (Stage stage : list3) {
                                            joa joaVar2 = l5i.a;
                                            b.add(new w7i(l5i.j(stage), stage.getDescription()));
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        yhk.d();
                        break;
                    }
                }
                C.F(a.a(b));
                break;
            default:
                Integer num3 = (Integer) obj;
                num3.getClass();
                q3i D = stageDetailsRankingFragment.D();
                D.m = num3;
                D.m();
                break;
        }
        return Unit.a;
    }
}
