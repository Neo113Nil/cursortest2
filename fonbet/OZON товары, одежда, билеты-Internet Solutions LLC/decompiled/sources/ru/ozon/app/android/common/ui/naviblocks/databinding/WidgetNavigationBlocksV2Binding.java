package ru.ozon.app.android.common.ui.naviblocks.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class WidgetNavigationBlocksV2Binding implements a {

    @NonNull
    private final RecyclerView rootView;

    @NonNull
    public final RecyclerView rvBlocks;

    private WidgetNavigationBlocksV2Binding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.rvBlocks = recyclerView2;
    }

    @NonNull
    public static WidgetNavigationBlocksV2Binding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetNavigationBlocksV2Binding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
