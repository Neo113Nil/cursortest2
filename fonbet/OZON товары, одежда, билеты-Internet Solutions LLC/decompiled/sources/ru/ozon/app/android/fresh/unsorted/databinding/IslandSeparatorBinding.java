package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.unsorted.R$id;

/* loaded from: classes12.dex */
public final class IslandSeparatorBinding implements a {

    @NonNull
    public final View bottomIslandView;

    @NonNull
    public final LinearLayout islandSeparatorContainer;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View separatorView;

    @NonNull
    public final View topIslandView;

    private IslandSeparatorBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull View view2, @NonNull View view3) {
        this.rootView = linearLayout;
        this.bottomIslandView = view;
        this.islandSeparatorContainer = linearLayout2;
        this.separatorView = view2;
        this.topIslandView = view3;
    }

    @NonNull
    public static IslandSeparatorBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.bottomIslandView;
        View d12 = C2548q.d(i11, view);
        if (d12 != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.separatorView;
            View d13 = C2548q.d(i11, view);
            if (d13 != null && (d11 = C2548q.d((i11 = R$id.topIslandView), view)) != null) {
                return new IslandSeparatorBinding(linearLayout, d12, linearLayout, d13, d11);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
