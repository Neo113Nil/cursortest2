package ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.layoutmanagers;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/layoutmanagers/NavigationSliderV3LayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "canScrollHorizontally", "()Z", "canScroll", "Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderV3LayoutManager extends LinearLayoutManager {
    private boolean canScroll;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.canScroll && super.canScrollHorizontally();
    }
}
