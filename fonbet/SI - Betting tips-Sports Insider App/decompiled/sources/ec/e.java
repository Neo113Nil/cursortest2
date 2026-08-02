package ec;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final SwipeRefreshLayout f8929a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f8930b;

    /* renamed from: c, reason: collision with root package name */
    public final SwipeRefreshLayout f8931c;

    public e(SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.f8929a = swipeRefreshLayout;
        this.f8930b = recyclerView;
        this.f8931c = swipeRefreshLayout2;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8929a;
    }
}
