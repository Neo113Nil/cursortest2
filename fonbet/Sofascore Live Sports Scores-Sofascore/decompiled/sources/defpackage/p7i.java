package defpackage;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.main.matches.StageSeriesWeekFragment;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p7i extends wp8 {
    public final ViewPager2 j;
    public final LocalDate k;

    public p7i(Fragment fragment, ViewPager2 viewPager2) {
        super(fragment);
        this.j = viewPager2;
        LocalDate with = LocalDate.now().with(TemporalAdjusters.previousOrSame(hwc.a));
        with.getClass();
        this.k = with;
        wrf.d(viewPager2, 1);
        RecyclerView c = wrf.c(viewPager2);
        if (c != null) {
            wrf.b(c);
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.wp8, androidx.recyclerview.widget.l
    public final long getItemId(int i) {
        return i;
    }

    @Override // defpackage.wp8
    public final Fragment q(int i) {
        long epochSecond = this.k.plusWeeks(i - 1073741823).atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
        StageSeriesWeekFragment stageSeriesWeekFragment = new StageSeriesWeekFragment();
        stageSeriesWeekFragment.setArguments(fz8.C(fz8.E(epochSecond, "ARG_WEEK_START_EPOCH_SECONDS")));
        return stageSeriesWeekFragment;
    }
}
