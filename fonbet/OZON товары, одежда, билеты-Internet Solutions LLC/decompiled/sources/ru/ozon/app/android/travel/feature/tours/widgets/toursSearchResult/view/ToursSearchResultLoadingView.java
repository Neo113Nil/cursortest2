package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.searchPreloader.SearchPreloaderView;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultLoadingView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp16", "dp8", "placeholderV", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultFiltersPlaceholderView;", "progressBarV", "Lru/ozon/app/android/travel/molecules/view/searchPreloader/SearchPreloaderView;", "getProgressBarV", "()Lru/ozon/app/android/travel/molecules/view/searchPreloader/SearchPreloaderView;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultLoadingView extends LinearLayout {
    public static final int $stable;
    private final int dp16;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final ToursSearchResultFiltersPlaceholderView placeholderV;

    @NotNull
    private final SearchPreloaderView progressBarV;

    static {
        int i11 = SearchPreloaderView.$stable;
        int i12 = RoundedShimmerView.$stable;
        $stable = i11 | i12 | i12 | i12 | i12 | i12 | DesignSystemDimensProvider.$stable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSearchResultLoadingView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        int px3 = ResourceExtKt.toPx(8, context);
        this.dp8 = px3;
        ToursSearchResultFiltersPlaceholderView toursSearchResultFiltersPlaceholderView = new ToursSearchResultFiltersPlaceholderView(context);
        toursSearchResultFiltersPlaceholderView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.placeholderV = toursSearchResultFiltersPlaceholderView;
        SearchPreloaderView searchPreloaderView = new SearchPreloaderView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        searchPreloaderView.setPadding(px2, px, px2, px3);
        searchPreloaderView.setLayoutParams(layoutParams);
        searchPreloaderView.setProgressColor(ThemeExtKt.themeColor(context, R$attr.textAction));
        searchPreloaderView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textPrimary));
        this.progressBarV = searchPreloaderView;
        setOrientation(1);
        addView(toursSearchResultFiltersPlaceholderView);
        addView(searchPreloaderView);
    }

    @NotNull
    public final SearchPreloaderView getProgressBarV() {
        return this.progressBarV;
    }
}
