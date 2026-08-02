package ec;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sports.insider.ui.views.EmptySectionView;
import com.sports.insider.ui.views.FloatingActionButton;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final SwipeRefreshLayout f8868a;

    /* renamed from: b, reason: collision with root package name */
    public final EmptySectionView f8869b;

    /* renamed from: c, reason: collision with root package name */
    public final FloatingActionButton f8870c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f8871d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f8872e;

    /* renamed from: f, reason: collision with root package name */
    public final View f8873f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f8874g;

    /* renamed from: h, reason: collision with root package name */
    public final RecyclerView f8875h;

    /* renamed from: i, reason: collision with root package name */
    public final SwipeRefreshLayout f8876i;

    public b0(SwipeRefreshLayout swipeRefreshLayout, EmptySectionView emptySectionView, FloatingActionButton floatingActionButton, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, View view, FrameLayout frameLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.f8868a = swipeRefreshLayout;
        this.f8869b = emptySectionView;
        this.f8870c = floatingActionButton;
        this.f8871d = appCompatImageView;
        this.f8872e = appCompatImageView2;
        this.f8873f = view;
        this.f8874g = frameLayout;
        this.f8875h = recyclerView;
        this.f8876i = swipeRefreshLayout2;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8868a;
    }
}
