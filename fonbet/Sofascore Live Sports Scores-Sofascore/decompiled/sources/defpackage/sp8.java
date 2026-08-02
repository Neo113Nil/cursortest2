package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.common.SwipeRefreshLayoutFixed;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sp8 implements krk {
    public final SwipeRefreshLayoutFixed a;
    public final RecyclerView b;
    public final SwipeRefreshLayoutFixed c;

    public sp8(SwipeRefreshLayoutFixed swipeRefreshLayoutFixed, RecyclerView recyclerView, SwipeRefreshLayoutFixed swipeRefreshLayoutFixed2) {
        this.a = swipeRefreshLayoutFixed;
        this.b = recyclerView;
        this.c = swipeRefreshLayoutFixed2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
