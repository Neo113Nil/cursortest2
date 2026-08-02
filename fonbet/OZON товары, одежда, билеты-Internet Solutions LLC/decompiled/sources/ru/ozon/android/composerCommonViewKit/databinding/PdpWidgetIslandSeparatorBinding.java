package ru.ozon.android.composerCommonViewKit.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.android.composerCommonViewKit.R$layout;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;

/* loaded from: classes6.dex */
public final class PdpWidgetIslandSeparatorBinding implements a {

    @NonNull
    public final IslandSeparatorView islandSeparatorV;

    @NonNull
    private final IslandSeparatorView rootView;

    private PdpWidgetIslandSeparatorBinding(@NonNull IslandSeparatorView islandSeparatorView, @NonNull IslandSeparatorView islandSeparatorView2) {
        this.rootView = islandSeparatorView;
        this.islandSeparatorV = islandSeparatorView2;
    }

    @NonNull
    public static PdpWidgetIslandSeparatorBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        IslandSeparatorView islandSeparatorView = (IslandSeparatorView) view;
        return new PdpWidgetIslandSeparatorBinding(islandSeparatorView, islandSeparatorView);
    }

    @NonNull
    public static PdpWidgetIslandSeparatorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_widget_island_separator, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public IslandSeparatorView getRoot() {
        return this.rootView;
    }
}
