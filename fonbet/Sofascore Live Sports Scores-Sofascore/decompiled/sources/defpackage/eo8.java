package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eo8 implements krk {
    public final SwipeRefreshLayout a;
    public final v82 b;
    public final FrameLayout c;
    public final RecyclerView d;
    public final SwipeRefreshLayout e;
    public final ComposeView f;
    public final TypeHeaderView g;

    public eo8(SwipeRefreshLayout swipeRefreshLayout, v82 v82Var, FrameLayout frameLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2, ComposeView composeView, TypeHeaderView typeHeaderView) {
        this.a = swipeRefreshLayout;
        this.b = v82Var;
        this.c = frameLayout;
        this.d = recyclerView;
        this.e = swipeRefreshLayout2;
        this.f = composeView;
        this.g = typeHeaderView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
