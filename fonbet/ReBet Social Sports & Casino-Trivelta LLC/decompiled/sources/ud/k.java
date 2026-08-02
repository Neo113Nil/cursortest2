package ud;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import od.q;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f66324a;

    /* renamed from: b, reason: collision with root package name */
    public final View f66325b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f66326c;

    public k(LinearLayout linearLayout, View view, RecyclerView recyclerView) {
        this.f66324a = linearLayout;
        this.f66325b = view;
        this.f66326c = recyclerView;
    }

    public static k a(View view) {
        int i10 = q.f60576l;
        View a10 = N2.a.a(view, i10);
        if (a10 != null) {
            i10 = q.f60571k4;
            RecyclerView recyclerView = (RecyclerView) N2.a.a(view, i10);
            if (recyclerView != null) {
                return new k((LinearLayout) view, a10, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public LinearLayout b() {
        return this.f66324a;
    }
}
