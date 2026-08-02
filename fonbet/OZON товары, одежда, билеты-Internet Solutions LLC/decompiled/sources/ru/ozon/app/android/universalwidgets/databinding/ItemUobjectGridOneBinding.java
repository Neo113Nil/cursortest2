package ru.ozon.app.android.universalwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes2.dex */
public final class ItemUobjectGridOneBinding implements a {

    @NonNull
    public final RecyclerView itemsRv;

    @NonNull
    public final ScrollingPagerIndicator pagerIndicator;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final FrameLayout uObjectGridOneContainer;

    private ItemUobjectGridOneBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.itemsRv = recyclerView;
        this.pagerIndicator = scrollingPagerIndicator;
        this.uObjectGridOneContainer = frameLayout2;
    }

    @NonNull
    public static ItemUobjectGridOneBinding bind(@NonNull View view) {
        int i11 = R$id.itemsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.pagerIndicator;
            ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C2548q.d(i11, view);
            if (scrollingPagerIndicator != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new ItemUobjectGridOneBinding(frameLayout, recyclerView, scrollingPagerIndicator, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
