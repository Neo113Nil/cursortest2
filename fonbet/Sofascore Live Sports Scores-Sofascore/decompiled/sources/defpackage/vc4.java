package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.model.database.DisplayType;
import com.sofascore.results.main.matches.redesign.chronologicalmatches.ChronologicalMatchesFragment;
import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vc4 extends wp8 {
    public final ViewPager2 j;
    public final Calendar k;
    public DisplayType l;

    public vc4(Fragment fragment, ViewPager2 viewPager2) {
        super(fragment);
        this.j = viewPager2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ke0.a.getTimeInMillis());
        this.k = calendar;
        this.l = DisplayType.DEFAULT;
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
        return i * (this.l == DisplayType.DEFAULT ? 1 : -1);
    }

    @Override // defpackage.wp8
    public final Fragment q(int i) {
        long epochSecond = Instant.ofEpochSecond(this.k.getTimeInMillis() / 1000).atZone(ZoneId.systemDefault()).plusDays(i - 1073741823).toEpochSecond();
        int i2 = uc4.a[this.l.ordinal()];
        if (i2 == 1) {
            DateMatchesFragment dateMatchesFragment = new DateMatchesFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_TIMESTAMP", Long.valueOf(epochSecond));
            dateMatchesFragment.setArguments(bundle);
            return dateMatchesFragment;
        }
        if (i2 != 2) {
            zzl.b();
            return null;
        }
        ChronologicalMatchesFragment chronologicalMatchesFragment = new ChronologicalMatchesFragment();
        chronologicalMatchesFragment.setArguments(fz8.C(fz8.E(epochSecond, "ARG_TIMESTAMP")));
        return chronologicalMatchesFragment;
    }

    public final int v(Calendar calendar) {
        calendar.getClass();
        return wzb.a((calendar.getTime().getTime() - this.k.getTime().getTime()) / 8.64E7d) + 1073741823;
    }

    public final long w(int i) {
        return Instant.ofEpochSecond(this.k.getTimeInMillis() / 1000).atZone(ZoneId.systemDefault()).plusDays(i - 1073741823).toEpochSecond();
    }
}
