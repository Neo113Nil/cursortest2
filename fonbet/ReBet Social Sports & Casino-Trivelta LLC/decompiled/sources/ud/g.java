package ud;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import od.q;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f66292a;

    /* renamed from: b, reason: collision with root package name */
    public final View f66293b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f66294c;

    public g(ConstraintLayout constraintLayout, View view, RecyclerView recyclerView) {
        this.f66292a = constraintLayout;
        this.f66293b = view;
        this.f66294c = recyclerView;
    }

    public static g a(View view) {
        int i10 = q.f60576l;
        View a10 = N2.a.a(view, i10);
        if (a10 != null) {
            i10 = q.f60269H;
            RecyclerView recyclerView = (RecyclerView) N2.a.a(view, i10);
            if (recyclerView != null) {
                return new g((ConstraintLayout) view, a10, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public ConstraintLayout b() {
        return this.f66292a;
    }
}
