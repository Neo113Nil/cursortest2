package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import od.q;
import od.r;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final View f66290a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f66291b;

    public f(View view, RecyclerView recyclerView) {
        this.f66290a = view;
        this.f66291b = recyclerView;
    }

    public static f a(View view) {
        int i10 = q.f60522f7;
        RecyclerView recyclerView = (RecyclerView) N2.a.a(view, i10);
        if (recyclerView != null) {
            return new f(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static f b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(r.f60782f, viewGroup);
        return a(viewGroup);
    }
}
