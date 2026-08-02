package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.results.event.statistics.EventStatisticsFragment;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ob6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventStatisticsFragment b;

    public /* synthetic */ ob6(EventStatisticsFragment eventStatisticsFragment, int i) {
        this.a = i;
        this.b = eventStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        EventStatisticsFragment eventStatisticsFragment = this.b;
        switch (i) {
            case 0:
                Context requireContext = eventStatisticsFragment.requireContext();
                requireContext.getClass();
                return new nb6(requireContext, ok3.s(eventStatisticsFragment.D()), false);
            case 1:
                return Boolean.valueOf(Intrinsics.c(ok3.s(eventStatisticsFragment.D()), Sports.FOOTBALL));
            case 2:
                Context requireContext2 = eventStatisticsFragment.requireContext();
                requireContext2.getClass();
                return new b56(requireContext2);
            case 3:
                eventStatisticsFragment.n();
                return Unit.a;
            case 4:
                return Integer.valueOf(eventStatisticsFragment.C().getItemCount() - 1);
            case 5:
                Iterator it = eventStatisticsFragment.C().i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (!(it.next() instanceof ie9)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            case 6:
                return new sb6(eventStatisticsFragment.requireContext());
            case 7:
                return Boolean.valueOf(Intrinsics.c(ok3.s(eventStatisticsFragment.D()), Sports.FOOTBALL));
            case 8:
                Context requireContext3 = eventStatisticsFragment.requireContext();
                requireContext3.getClass();
                return new ml8(requireContext3, eventStatisticsFragment.D(), eventStatisticsFragment.z);
            case 9:
                return Boolean.valueOf(Intrinsics.c(ok3.s(eventStatisticsFragment.D()), Sports.BASKETBALL));
            case 10:
                Context requireContext4 = eventStatisticsFragment.requireContext();
                requireContext4.getClass();
                return new ns1(requireContext4, new ob6(eventStatisticsFragment, 4), eventStatisticsFragment.A, eventStatisticsFragment.B);
            case 11:
                return Boolean.valueOf(Intrinsics.c(ok3.s(eventStatisticsFragment.D()), Sports.ICE_HOCKEY));
            default:
                Context requireContext5 = eventStatisticsFragment.requireContext();
                requireContext5.getClass();
                return new be9(requireContext5, eventStatisticsFragment.D(), new ob6(eventStatisticsFragment, 5), eventStatisticsFragment.A, eventStatisticsFragment.B);
        }
    }
}
