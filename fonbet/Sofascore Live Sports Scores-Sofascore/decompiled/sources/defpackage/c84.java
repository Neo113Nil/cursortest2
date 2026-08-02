package defpackage;

import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c84 extends RecyclerView.OnScrollListener {
    public final /* synthetic */ CupTreeExtendedView a;

    public c84(CupTreeExtendedView cupTreeExtendedView) {
        this.a = cupTreeExtendedView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        recyclerView.getClass();
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            CupTreeExtendedView cupTreeExtendedView = this.a;
            ((RelativeLayout) cupTreeExtendedView.d.c).postDelayed(new mc3(15, recyclerView, cupTreeExtendedView), 20L);
        }
    }
}
