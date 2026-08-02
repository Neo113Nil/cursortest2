package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r68 implements krk {
    public final SwipeRefreshLayout a;
    public final ComposeView b;
    public final FrameLayout c;
    public final CircularProgressIndicator d;
    public final RecyclerView e;
    public final SwipeRefreshLayout f;

    public r68(SwipeRefreshLayout swipeRefreshLayout, ComposeView composeView, FrameLayout frameLayout, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.a = swipeRefreshLayout;
        this.b = composeView;
        this.c = frameLayout;
        this.d = circularProgressIndicator;
        this.e = recyclerView;
        this.f = swipeRefreshLayout2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
