package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.model.DateSection;
import com.sofascore.results.main.matches.redesign.trending.TrendingMatchesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class d0k implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TrendingMatchesFragment b;

    public /* synthetic */ d0k(TrendingMatchesFragment trendingMatchesFragment, int i) {
        this.a = i;
        this.b = trendingMatchesFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        TrendingMatchesFragment trendingMatchesFragment = this.b;
        switch (i) {
            case 0:
                pyj pyjVar = (pyj) obj;
                trendingMatchesFragment.n();
                ArrayList arrayList = pyjVar.a;
                ArrayList arrayList2 = pyjVar.b;
                if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                    oyj C = trendingMatchesFragment.C();
                    ArrayList arrayList3 = pyjVar.a;
                    C.getClass();
                    ArrayList w0 = CollectionsKt.w0(arrayList2, CollectionsKt.w0(a.c(C.u), arrayList3));
                    C.N(arrayList3.size());
                    C.F(w0);
                    ArrayList arrayList4 = C.x;
                    arrayList4.clear();
                    ArrayList arrayList5 = C.i;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = r1 + 1;
                        if (r1 < 0) {
                            b.q();
                            throw null;
                        }
                        Integer valueOf = next instanceof DateSection ? Integer.valueOf(r1) : null;
                        if (valueOf != null) {
                            arrayList6.add(valueOf);
                        }
                        r1 = i2;
                    }
                    arrayList4.addAll(arrayList6);
                }
                long currentTimeMillis = System.currentTimeMillis() - trendingMatchesFragment.w;
                wd5 wd5Var = xd5.b;
                if (currentTimeMillis > xd5.e(wkn.R(6, be5.HOURS))) {
                    trendingMatchesFragment.D();
                }
                trendingMatchesFragment.w = System.currentTimeMillis();
                return Unit.a;
            default:
                ((View) obj).getClass();
                ArrayList arrayList7 = trendingMatchesFragment.C().i;
                arrayList7.getClass();
                Iterator it2 = arrayList7.iterator();
                int i3 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        next2.getClass();
                        if (!(next2 instanceof d92)) {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                    }
                }
                Integer valueOf2 = i3 == -1 ? null : Integer.valueOf(i3);
                if (valueOf2 != null) {
                    int intValue = valueOf2.intValue();
                    r1 = intValue >= 0 ? intValue : 0;
                    krk krkVar = trendingMatchesFragment.l;
                    krkVar.getClass();
                    n layoutManager = ((oo8) krkVar).d.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        Context requireContext = trendingMatchesFragment.requireContext();
                        requireContext.getClass();
                        linearLayoutManager.scrollToPositionWithOffset(r1, ao2.s(96, requireContext));
                    }
                }
                return Unit.a;
        }
    }
}
