package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class knc implements krk {
    public final SwipeRefreshLayout a;
    public final FrameLayout b;
    public final SwipeRefreshLayout c;
    public final NestedScrollView d;
    public final LinearLayout e;

    public knc(SwipeRefreshLayout swipeRefreshLayout, FrameLayout frameLayout, SwipeRefreshLayout swipeRefreshLayout2, NestedScrollView nestedScrollView, LinearLayout linearLayout) {
        this.a = swipeRefreshLayout;
        this.b = frameLayout;
        this.c = swipeRefreshLayout2;
        this.d = nestedScrollView;
        this.e = linearLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
