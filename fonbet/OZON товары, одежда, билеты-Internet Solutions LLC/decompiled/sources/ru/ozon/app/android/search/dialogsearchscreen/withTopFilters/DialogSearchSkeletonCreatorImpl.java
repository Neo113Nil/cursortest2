package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import A00.a;
import T00.j;
import android.content.Context;
import androidx.recyclerview.widget.m;
import j10.InterfaceC7238a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.search.R$anim;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.app.android.search.views.searchShimmer.ShimmerConfig;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonElement;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchSkeletonCreatorImpl;", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/SkeletonCreator;", "<init>", "()V", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "createIslandSeparator", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "LT00/j;", "generateRawWidget", "()LT00/j;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonElement;", "getSkeletonElements", "(Landroid/content/Context;)Ljava/util/List;", "Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "shimmer", "", "configureShimmer", "(Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;)V", "Lru/ozon/app/android/composer/ComposerFragmentController;", "composer", "insertIslandSeparator", "(Lru/ozon/app/android/composer/ComposerFragmentController;)V", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogSearchSkeletonCreatorImpl implements SkeletonCreator {
    private static final int SHIMMER_WIDTH = ResourceExtKt.toPx(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
    private static final int singleLargeSkeletonTopMargin = ResourceExtKt.toPx(24);
    private static final int singleLargeSkeletonTopPadding = ResourceExtKt.toPx(18);

    private final IslandSeparatorDTO createIslandSeparator() {
        return new IslandSeparatorDTO(8, UniColors.LAYER_FLOOR_0.getToken(), IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, null, null, null);
    }

    private final j generateRawWidget() {
        return new j(new T00.m(1L, "common", "islandSeparator", "dp.islandSeparator"), createIslandSeparator(), U.c(), null);
    }

    @Override // ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.SkeletonCreator
    public void configureShimmer(@NotNull SearchShimmer shimmer) {
        Intrinsics.checkNotNullParameter(shimmer, "shimmer");
        int i11 = R$anim.shimmer_animation;
        int i12 = SHIMMER_WIDTH;
        Float valueOf = Float.valueOf(0.0f);
        shimmer.configureShimmer(new ShimmerConfig(i11, i12, U.j(new Pair(valueOf, valueOf), new Pair(Float.valueOf(0.3f), Float.valueOf(0.5f)), new Pair(Float.valueOf(0.5f), Float.valueOf(0.6f)), new Pair(Float.valueOf(0.6f), Float.valueOf(0.5f)), new Pair(Float.valueOf(1.0f), valueOf)), null, 8, null));
    }

    @Override // ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.SkeletonCreator
    @NotNull
    public List<SkeletonElement> getSkeletonElements(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SkeletonElement.IslandSeparator islandSeparator = new SkeletonElement.IslandSeparator(false, false, 3, null);
        SkeletonElement.IslandSeparator islandSeparator2 = new SkeletonElement.IslandSeparator(false, true);
        SkeletonElement.SingleLarge singleLarge = new SkeletonElement.SingleLarge(singleLargeSkeletonTopMargin, 0, singleLargeSkeletonTopPadding, ThemeExtKt.themeColor(context, R$attr.layerFloor0), 2, null);
        SkeletonElement.Grid2 grid2 = SkeletonElement.Grid2.INSTANCE;
        return C7714v.b0(islandSeparator, SkeletonElement.Double.INSTANCE, SkeletonElement.Flexbox3.INSTANCE, islandSeparator2, singleLarge, grid2, grid2, grid2);
    }

    @Override // ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.SkeletonCreator
    public void insertIslandSeparator(@NotNull ComposerFragmentController composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        l lVar = (l) composer.getScreen().c().s().b(generateRawWidget());
        InterfaceC7238a<l> composerStore = composer.getComposerStore();
        a.C2371l.C0009a c0009a = new a.C2371l.C0009a();
        c0009a.d(lVar);
        c0009a.b();
        composerStore.c(c0009a.c());
    }
}
