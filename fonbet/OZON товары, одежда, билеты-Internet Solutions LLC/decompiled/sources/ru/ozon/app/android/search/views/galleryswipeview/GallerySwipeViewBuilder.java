package ru.ozon.app.android.search.views.galleryswipeview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/views/galleryswipeview/GallerySwipeViewBuilder;", "", "<init>", "()V", "appendItemsRv", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "viewGroup", "Landroidx/constraintlayout/widget/ConstraintLayout;", "appendWaveView", "Lru/ozon/app/android/product/common/wave/WaveView;", "appendIndicator", "Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GallerySwipeViewBuilder {

    @NotNull
    public static final GallerySwipeViewBuilder INSTANCE = new GallerySwipeViewBuilder();

    private GallerySwipeViewBuilder() {
    }

    @NotNull
    public final ScrollingPagerIndicator appendIndicator(@NotNull ConstraintLayout viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.srv2_page_indicator, (ViewGroup) null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator");
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) inflate;
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41642l = 0;
        bVar.f41658v = 0;
        bVar.f41638j = R$id.itemsRv;
        bVar.f41656t = 0;
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = ResourceExtKt.toPx(4, context);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = ResourceExtKt.toPx(4, context2);
        viewGroup.addView(scrollingPagerIndicator, bVar);
        return scrollingPagerIndicator;
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
        loopedRecyclerView.setLayoutManager(new LinearLayoutManager(context2) { // from class: ru.ozon.app.android.search.views.galleryswipeview.GallerySwipeViewBuilder$appendItemsRv$itemsRv$1$1
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
        viewGroup.addView(loopedRecyclerView, bVar);
        return loopedRecyclerView;
    }

    @NotNull
    public final WaveView appendWaveView(@NotNull ConstraintLayout viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WaveView waveView = new WaveView(context, null, 0, 6, null);
        waveView.setId(R$id.waveView);
        waveView.setVisibility(8);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, ResourceExtKt.toPx(10, context2));
        bVar.f41642l = R$id.itemsRv;
        bVar.f41658v = 0;
        bVar.f41656t = 0;
        viewGroup.addView(waveView, bVar);
        return waveView;
    }
}
