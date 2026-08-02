package defpackage;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView;
import com.sofascore.results.event.graphs.view.CricketBowlerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mo8 implements krk {
    public final SwipeRefreshLayout a;
    public final CricketBowlerView b;
    public final SwipeRefreshLayout c;
    public final CricketWagonWheelView d;

    public mo8(SwipeRefreshLayout swipeRefreshLayout, CricketBowlerView cricketBowlerView, SwipeRefreshLayout swipeRefreshLayout2, CricketWagonWheelView cricketWagonWheelView) {
        this.a = swipeRefreshLayout;
        this.b = cricketBowlerView;
        this.c = swipeRefreshLayout2;
        this.d = cricketWagonWheelView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
