package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.indicator;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerViewAttacher;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/indicator/XmlIndicatorAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/indicator/IndicatorAdapter;", "indicator", "Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;", "<init>", "(Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;)V", "getIndicator", "()Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;", "attachToPager", "", "pager", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class XmlIndicatorAdapter implements IndicatorAdapter {

    @NotNull
    private final ScrollingPagerIndicator indicator;

    public XmlIndicatorAdapter(@NotNull ScrollingPagerIndicator indicator) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        this.indicator = indicator;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.indicator.IndicatorAdapter
    public void attachToPager(@NotNull LoopedRecyclerView pager) {
        Intrinsics.checkNotNullParameter(pager, "pager");
        getIndicator().c(pager, new LoopedRecyclerViewAttacher());
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.indicator.IndicatorAdapter
    @NotNull
    public ScrollingPagerIndicator getIndicator() {
        return this.indicator;
    }
}
