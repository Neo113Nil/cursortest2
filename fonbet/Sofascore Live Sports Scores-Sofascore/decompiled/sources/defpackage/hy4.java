package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hy4 implements krk {
    public final SwipeRefreshLayout a;
    public final RecyclerView b;
    public final SwipeRefreshLayout c;

    public hy4(SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.a = swipeRefreshLayout;
        this.b = recyclerView;
        this.c = swipeRefreshLayout2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
