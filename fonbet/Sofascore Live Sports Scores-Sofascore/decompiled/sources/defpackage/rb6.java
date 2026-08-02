package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.event.statistics.EventStatisticsFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rb6 extends RecyclerView.OnScrollListener {
    public final /* synthetic */ EventStatisticsFragment a;

    public rb6(EventStatisticsFragment eventStatisticsFragment) {
        this.a = eventStatisticsFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        recyclerView.getClass();
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            EventStatisticsFragment eventStatisticsFragment = this.a;
            if (eventStatisticsFragment.C().p) {
                eventStatisticsFragment.C().p = false;
            }
        }
    }
}
