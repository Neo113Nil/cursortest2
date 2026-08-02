package defpackage;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.tv.TVScheduleActivity;
import com.sofascore.results.tv.fragments.TVScheduleFragment;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h4k extends wp8 {
    public final ViewPager2 j;
    public final SofaTabLayout k;
    public final ArrayList l;
    public final mqi m;

    public h4k(TVScheduleActivity tVScheduleActivity, ViewPager2 viewPager2, SofaTabLayout sofaTabLayout) {
        super(tVScheduleActivity);
        this.j = viewPager2;
        this.k = sofaTabLayout;
        this.l = new ArrayList();
        this.m = ypa.b(new fej(8, this, tVScheduleActivity));
        viewPager2.addOnLayoutChangeListener(new r8(this, 11));
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return this.l.size();
    }

    @Override // defpackage.wp8, androidx.recyclerview.widget.l
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onAttachedToRecyclerView(recyclerView);
        ((osi) this.m.getValue()).a();
    }

    @Override // defpackage.wp8, androidx.recyclerview.widget.l
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onDetachedFromRecyclerView(recyclerView);
        ((osi) this.m.getValue()).b();
    }

    @Override // defpackage.wp8
    public final Fragment q(int i) {
        return (TVScheduleFragment) this.l.get(i);
    }
}
