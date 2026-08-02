package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.sofascore.results.R;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFilterModal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hyi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamPlayerStatsFilterModal b;

    public /* synthetic */ hyi(TeamPlayerStatsFilterModal teamPlayerStatsFilterModal, int i) {
        this.a = i;
        this.b = teamPlayerStatsFilterModal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TeamPlayerStatsFilterModal teamPlayerStatsFilterModal = this.b;
        switch (i) {
            case 0:
                Fragment requireParentFragment = teamPlayerStatsFilterModal.requireParentFragment();
                requireParentFragment.getClass();
                return requireParentFragment;
            case 1:
                Context requireContext = teamPlayerStatsFilterModal.requireContext();
                requireContext.getClass();
                kp5 kp5Var = teamPlayerStatsFilterModal.z;
                ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
                Iterator<E> it = kp5Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(teamPlayerStatsFilterModal.getString(((yt) it.next()).a));
                }
                return new jyi(requireContext, R.layout.item_filter_dropdown, arrayList);
            default:
                Context requireContext2 = teamPlayerStatsFilterModal.requireContext();
                requireContext2.getClass();
                kp5<lre> kp5Var2 = lre.e;
                ArrayList arrayList2 = new ArrayList(k13.r(kp5Var2, 10));
                for (lre lreVar : kp5Var2) {
                    boolean z = lreVar.b;
                    int i2 = lreVar.a;
                    arrayList2.add(z ? teamPlayerStatsFilterModal.getString(i2, yid.r(50)) : teamPlayerStatsFilterModal.getString(i2));
                }
                return new jyi(requireContext2, R.layout.item_filter_dropdown, arrayList2);
        }
    }
}
