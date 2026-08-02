package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.builder;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.R$layout;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.indicator.IndicatorAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.indicator.NonXmlIndicatorAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.indicator.NonXmlScrollingPagerIndicator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.indicator.XmlIndicatorAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.image.TileGrid2AdultImageView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.core.UniColors;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/builder/GallerySwipeViewBuilder;", "", "<init>", "()V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "viewGroup", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "appendItemsRv", "(Landroidx/constraintlayout/widget/ConstraintLayout;)Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "", "shouldPreCreate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/TileGrid2AdultImageView;", "appendSingleItemView", "(Landroidx/constraintlayout/widget/ConstraintLayout;Z)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/TileGrid2AdultImageView;", "isIndicatorInflateEnabled", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/indicator/IndicatorAdapter;", "appendIndicator", "(Landroidx/constraintlayout/widget/ConstraintLayout;Z)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/indicator/IndicatorAdapter;", "", "dp4$delegate", "LSc/j;", "getDp4", "()I", "dp4", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GallerySwipeViewBuilder {

    @NotNull
    public static final GallerySwipeViewBuilder INSTANCE = new GallerySwipeViewBuilder();

    /* renamed from: dp4$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j dp4 = LazyUtilsKt.unsafeLazy(GallerySwipeViewBuilder$dp4$2.INSTANCE);

    private GallerySwipeViewBuilder() {
    }

    private final int getDp4() {
        return ((Number) dp4.getValue()).intValue();
    }

    @NotNull
    public final IndicatorAdapter appendIndicator(@NotNull ConstraintLayout viewGroup, boolean isIndicatorInflateEnabled) {
        IndicatorAdapter nonXmlIndicatorAdapter;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        if (isIndicatorInflateEnabled) {
            View inflate = LayoutInflater.from(context).inflate(R$layout.tile_grid_2_page_indicator, (ViewGroup) null);
            Intrinsics.g(inflate, "null cannot be cast to non-null type ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator");
            nonXmlIndicatorAdapter = new XmlIndicatorAdapter((ScrollingPagerIndicator) inflate);
        } else {
            int color = a.getColor(context, UniColors.BG_OVERLAP.getResId());
            int color2 = a.getColor(context, UniColors.GRAPHIC_ACTION_PRIMARY.getResId());
            TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
            nonXmlIndicatorAdapter = new NonXmlIndicatorAdapter(new NonXmlScrollingPagerIndicator(context, color, color2, tileGrid2Constants.getIndicatorDotSize(), tileGrid2Constants.getIndicatorDotSelectedSize(), tileGrid2Constants.getIndicatorDotSpacing(), 7));
        }
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41640k = R$id.contentElementsVAL;
        bVar.f41658v = 0;
        bVar.f41638j = R$id.itemsRv;
        bVar.f41656t = 0;
        viewGroup.addView(nonXmlIndicatorAdapter.getIndicator(), bVar);
        return nonXmlIndicatorAdapter;
    }

    @NotNull
    public final LoopedRecyclerView appendItemsRv(@NotNull ConstraintLayout viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LoopedRecyclerView loopedRecyclerView = new LoopedRecyclerView(context, null, 0, 6, null);
        loopedRecyclerView.setId(R$id.itemsRv);
        loopedRecyclerView.setNestedScrollingEnabled(false);
        final Context context2 = viewGroup.getContext();
        loopedRecyclerView.setLayoutManager(new LinearLayoutManager(context2) { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.builder.GallerySwipeViewBuilder$appendItemsRv$itemsRv$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            protected void calculateExtraLayoutSpace(RecyclerView.A state, int[] extraLayoutSpace) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(extraLayoutSpace, "extraLayoutSpace");
                extraLayoutSpace[0] = 0;
                extraLayoutSpace[1] = 0;
            }
        });
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, 0);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41640k = R$id.pagerIndicator;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = INSTANCE.getDp4();
        bVar.f41599F = 0.0f;
        bVar.f41604K = 2;
        viewGroup.addView(loopedRecyclerView, 0, bVar);
        return loopedRecyclerView;
    }

    @NotNull
    public final TileGrid2AdultImageView appendSingleItemView(@NotNull ConstraintLayout viewGroup, boolean shouldPreCreate) {
        TileGrid2AdultImageView tileGrid2AdultImageView;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        if (shouldPreCreate) {
            tileGrid2AdultImageView = (TileGrid2AdultImageView) q.f64554a.i(N.b(TileGrid2AdultImageView.class), viewGroup.getContext());
            if (tileGrid2AdultImageView == null) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                tileGrid2AdultImageView = new TileGrid2AdultImageView(context, null, 0, 6, null);
            }
        } else {
            Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            tileGrid2AdultImageView = new TileGrid2AdultImageView(context2, null, 0, 6, null);
        }
        tileGrid2AdultImageView.setId(R$id.itemsRv);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, 0);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41640k = R$id.contentElementsVAL;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = INSTANCE.getDp4();
        bVar.f41599F = 0.0f;
        bVar.f41604K = 2;
        viewGroup.addView(tileGrid2AdultImageView, 0, bVar);
        return tileGrid2AdultImageView;
    }
}
