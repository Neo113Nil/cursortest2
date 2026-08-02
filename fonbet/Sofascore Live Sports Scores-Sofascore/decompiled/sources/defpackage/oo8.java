package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oo8 implements krk {
    public final SwipeRefreshLayout a;
    public final ViewStub b;
    public final CircularProgressIndicator c;
    public final RecyclerView d;
    public final SwipeRefreshLayout e;
    public final TypeHeaderView f;

    public oo8(SwipeRefreshLayout swipeRefreshLayout, ViewStub viewStub, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2, TypeHeaderView typeHeaderView) {
        this.a = swipeRefreshLayout;
        this.b = viewStub;
        this.c = circularProgressIndicator;
        this.d = recyclerView;
        this.e = swipeRefreshLayout2;
        this.f = typeHeaderView;
    }

    public static oo8 a(View view) {
        int i = R.id.app_bar;
        if (((AppBarLayout) nq8.B(R.id.app_bar, view)) != null) {
            i = R.id.empty_state;
            ViewStub viewStub = (ViewStub) nq8.B(R.id.empty_state, view);
            if (viewStub != null) {
                i = R.id.progress_section;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) nq8.B(R.id.progress_section, view);
                if (circularProgressIndicator != null) {
                    i = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, view);
                    if (recyclerView != null) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                        i = R.id.type_header;
                        TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.type_header, view);
                        if (typeHeaderView != null) {
                            return new oo8(swipeRefreshLayout, viewStub, circularProgressIndicator, recyclerView, swipeRefreshLayout, typeHeaderView);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static oo8 b(LayoutInflater layoutInflater) {
        return a(layoutInflater.inflate(R.layout.fragment_layout_with_padding, (ViewGroup) null, false));
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
