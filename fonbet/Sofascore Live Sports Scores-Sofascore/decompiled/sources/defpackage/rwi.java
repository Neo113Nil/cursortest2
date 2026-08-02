package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.team.lastnext.TeamEventsFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rwi extends RecyclerView.OnScrollListener {
    public final /* synthetic */ TeamEventsFragment a;

    public rwi(TeamEventsFragment teamEventsFragment) {
        this.a = teamEventsFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getClass();
        this.a.H();
    }
}
