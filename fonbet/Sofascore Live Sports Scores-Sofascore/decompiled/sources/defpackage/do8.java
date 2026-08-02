package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.common.SwipeRefreshLayoutFixed;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class do8 implements krk {
    public final SwipeRefreshLayoutFixed a;
    public final GraphicLarge b;
    public final RecyclerView c;
    public final CircularProgressIndicator d;
    public final SwipeRefreshLayoutFixed e;

    public do8(RecyclerView recyclerView, CircularProgressIndicator circularProgressIndicator, SwipeRefreshLayoutFixed swipeRefreshLayoutFixed, SwipeRefreshLayoutFixed swipeRefreshLayoutFixed2, GraphicLarge graphicLarge) {
        this.a = swipeRefreshLayoutFixed;
        this.b = graphicLarge;
        this.c = recyclerView;
        this.d = circularProgressIndicator;
        this.e = swipeRefreshLayoutFixed2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
