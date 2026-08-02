package ru.ozon.app.android.cabinet.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.cabinet.R$id;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes11.dex */
public final class WidgetScanItIntroBinding implements a {

    @NonNull
    public final ScrollingPagerIndicator pagerIndicator;

    @NonNull
    public final RecyclerView pagesRv;

    @NonNull
    private final View rootView;

    private WidgetScanItIntroBinding(@NonNull View view, @NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull RecyclerView recyclerView) {
        this.rootView = view;
        this.pagerIndicator = scrollingPagerIndicator;
        this.pagesRv = recyclerView;
    }

    @NonNull
    public static WidgetScanItIntroBinding bind(@NonNull View view) {
        int i11 = R$id.pagerIndicator;
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C2548q.d(i11, view);
        if (scrollingPagerIndicator != null) {
            i11 = R$id.pagesRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                return new WidgetScanItIntroBinding(view, scrollingPagerIndicator, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
