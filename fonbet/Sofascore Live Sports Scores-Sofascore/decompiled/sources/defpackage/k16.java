package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.event.hockeyplaybyplay.EventHockeyPlayByPlayFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k16 extends RecyclerView.OnScrollListener {
    public final /* synthetic */ EventHockeyPlayByPlayFragment a;

    public k16(EventHockeyPlayByPlayFragment eventHockeyPlayByPlayFragment) {
        this.a = eventHockeyPlayByPlayFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getClass();
        super.onScrolled(recyclerView, i, i2);
        EventHockeyPlayByPlayFragment eventHockeyPlayByPlayFragment = this.a;
        eventHockeyPlayByPlayFragment.C();
        joa joaVar = eventHockeyPlayByPlayFragment.w;
        if (((vd9) joaVar.getValue()).e) {
            eventHockeyPlayByPlayFragment.D(((vd9) joaVar.getValue()).e);
        }
    }
}
