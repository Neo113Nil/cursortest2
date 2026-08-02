package defpackage;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.mma.mainScreen.MmaEventsWeekFragment;
import java.time.LocalDate;
import java.time.ZoneId;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class omc extends wp8 {
    public final ViewPager2 j;
    public LocalDate k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omc(Fragment fragment, ViewPager2 viewPager2, LocalDate localDate) {
        super(fragment);
        localDate.getClass();
        this.j = viewPager2;
        this.k = localDate;
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
        return this.k.plusWeeks(i - 1073741823).atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
    }

    @Override // defpackage.wp8
    public final Fragment q(int i) {
        long epochSecond = this.k.plusWeeks(i - 1073741823).atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
        MmaEventsWeekFragment mmaEventsWeekFragment = new MmaEventsWeekFragment();
        mmaEventsWeekFragment.setArguments(fz8.C(fz8.E(epochSecond, "ARG_WEEK_MIDDLE_EPOCH_SECONDS")));
        return mmaEventsWeekFragment;
    }
}
