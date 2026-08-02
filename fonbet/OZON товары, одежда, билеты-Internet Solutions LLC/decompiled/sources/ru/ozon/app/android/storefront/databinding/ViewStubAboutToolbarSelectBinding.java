package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.storefront.R$id;

/* loaded from: classes2.dex */
public final class ViewStubAboutToolbarSelectBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final IslandSeparatorView roundedSeparator;

    @NonNull
    public final Toolbar toolbarSelect;

    private ViewStubAboutToolbarSelectBinding(@NonNull LinearLayout linearLayout, @NonNull IslandSeparatorView islandSeparatorView, @NonNull Toolbar toolbar) {
        this.rootView = linearLayout;
        this.roundedSeparator = islandSeparatorView;
        this.toolbarSelect = toolbar;
    }

    @NonNull
    public static ViewStubAboutToolbarSelectBinding bind(@NonNull View view) {
        int i11 = R$id.roundedSeparator;
        IslandSeparatorView islandSeparatorView = (IslandSeparatorView) C2548q.d(i11, view);
        if (islandSeparatorView != null) {
            i11 = R$id.toolbarSelect;
            Toolbar toolbar = (Toolbar) C2548q.d(i11, view);
            if (toolbar != null) {
                return new ViewStubAboutToolbarSelectBinding((LinearLayout) view, islandSeparatorView, toolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
