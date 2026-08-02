package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonElement;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/SkeletonCreator;", "", "getSkeletonElements", "", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonElement;", "context", "Landroid/content/Context;", "configureShimmer", "", "shimmer", "Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "insertIslandSeparator", "composer", "Lru/ozon/app/android/composer/ComposerFragmentController;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SkeletonCreator {
    void configureShimmer(@NotNull SearchShimmer shimmer);

    @NotNull
    List<SkeletonElement> getSkeletonElements(@NotNull Context context);

    void insertIslandSeparator(@NotNull ComposerFragmentController composer);
}
