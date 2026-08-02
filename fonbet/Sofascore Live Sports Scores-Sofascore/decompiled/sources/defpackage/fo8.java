package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fo8 implements krk {
    public final SwipeRefreshLayout a;
    public final SegmentedButtonsView b;
    public final RecyclerView c;
    public final SwipeRefreshLayout d;

    public fo8(SwipeRefreshLayout swipeRefreshLayout, SegmentedButtonsView segmentedButtonsView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.a = swipeRefreshLayout;
        this.b = segmentedButtonsView;
        this.c = recyclerView;
        this.d = swipeRefreshLayout2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
