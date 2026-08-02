package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerView;

/* loaded from: classes12.dex */
public final class WidgetRecShelfShimmerBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final ShimmerView shimmerView1;

    @NonNull
    public final WidgetRecShelfItemBinding skeleton1;

    @NonNull
    public final WidgetRecShelfItemBinding skeleton2;

    private WidgetRecShelfShimmerBinding(@NonNull View view, @NonNull ShimmerView shimmerView, @NonNull WidgetRecShelfItemBinding widgetRecShelfItemBinding, @NonNull WidgetRecShelfItemBinding widgetRecShelfItemBinding2) {
        this.rootView = view;
        this.shimmerView1 = shimmerView;
        this.skeleton1 = widgetRecShelfItemBinding;
        this.skeleton2 = widgetRecShelfItemBinding2;
    }

    @NonNull
    public static WidgetRecShelfShimmerBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.shimmerView1;
        ShimmerView shimmerView = (ShimmerView) C2548q.d(i11, view);
        if (shimmerView != null && (d11 = C2548q.d((i11 = R$id.skeleton1), view)) != null) {
            WidgetRecShelfItemBinding bind = WidgetRecShelfItemBinding.bind(d11);
            int i12 = R$id.skeleton2;
            View d12 = C2548q.d(i12, view);
            if (d12 != null) {
                return new WidgetRecShelfShimmerBinding(view, shimmerView, bind, WidgetRecShelfItemBinding.bind(d12));
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
