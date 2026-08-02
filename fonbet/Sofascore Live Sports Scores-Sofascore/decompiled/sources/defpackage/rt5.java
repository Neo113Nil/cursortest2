package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rt5 extends RecyclerView.OnScrollListener {
    public final /* synthetic */ EventBoxScoreFragment a;

    public rt5(EventBoxScoreFragment eventBoxScoreFragment) {
        this.a = eventBoxScoreFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getClass();
        super.onScrolled(recyclerView, i, i2);
        this.a.C(recyclerView);
    }
}
