package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.main.matches.redesign.datematches.MainMatchesFragment;
import com.sofascore.results.main.matches.redesign.livematches.LiveMatchesFragment;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class oeb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LiveMatchesFragment b;

    public /* synthetic */ oeb(LiveMatchesFragment liveMatchesFragment, int i) {
        this.a = i;
        this.b = liveMatchesFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lrj lrjVar;
        int i = this.a;
        ?? r1 = 0;
        ?? r12 = 0;
        LiveMatchesFragment liveMatchesFragment = this.b;
        switch (i) {
            case 0:
                veb vebVar = (veb) obj;
                krk krkVar = liveMatchesFragment.l;
                krkVar.getClass();
                int i2 = 3;
                tgj.G(((ro8) krkVar).c, 0L, 3);
                Fragment parentFragment = liveMatchesFragment.getParentFragment();
                MainMatchesFragment mainMatchesFragment = parentFragment instanceof MainMatchesFragment ? (MainMatchesFragment) parentFragment : null;
                if (mainMatchesFragment != null) {
                    int size = vebVar.a.size();
                    krk krkVar2 = mainMatchesFragment.l;
                    krkVar2.getClass();
                    ((so8) krkVar2).e.setLiveCount(new p9k(R.plurals.number_of_events, size, l6g.K(Integer.valueOf(size))));
                }
                Calendar calendar = ke0.a;
                Context requireContext = liveMatchesFragment.requireContext();
                requireContext.getClass();
                Map o = wv8.o(SearchResponseKt.SPORT_ENTITY, ke0.b(requireContext));
                liveMatchesFragment.C().N(13);
                liveMatchesFragment.C().K(liveMatchesFragment, o, false);
                kda.p(wca.x(liveMatchesFragment.getLifecycle()), new n50(liveMatchesFragment, vebVar, r12 == true ? 1 : 0, 7), new oeb(liveMatchesFragment, 2));
                if (!liveMatchesFragment.g) {
                    u6b viewLifecycleOwner = liveMatchesFragment.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new ppa(liveMatchesFragment, r1 == true ? 1 : 0, i2), 3);
                }
                break;
            case 1:
                liveMatchesFragment.l();
                liveMatchesFragment.D().j = (qqb) obj;
                xeb.k(liveMatchesFragment.D(), (String) liveMatchesFragment.u.getValue(), CollectionsKt.S0(liveMatchesFragment.C().i));
                break;
            default:
                List list = (List) obj;
                list.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        lrjVar = it.next();
                        if (lrjVar instanceof lrj) {
                        }
                    } else {
                        lrjVar = null;
                    }
                }
                lrj lrjVar2 = lrjVar instanceof lrj ? lrjVar : null;
                int i3 = 1;
                if (lrjVar2 != null) {
                    lrjVar2.k = true;
                }
                liveMatchesFragment.C().F(list);
                g6b lifecycle = liveMatchesFragment.getViewLifecycleOwner().getLifecycle();
                if (lifecycle.b().compareTo(e6b.d) >= 0) {
                    krk krkVar3 = liveMatchesFragment.l;
                    krkVar3.getClass();
                    liveMatchesFragment.t(((ro8) krkVar3).d, new oi(liveMatchesFragment, 9));
                } else {
                    lifecycle.a(new dh4(lifecycle, liveMatchesFragment, i3));
                }
                break;
        }
        return Unit.a;
    }
}
