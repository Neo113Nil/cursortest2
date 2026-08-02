package ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.binders;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.images.ImagesAdapter;
import ru.ozon.app.android.travel.molecules.view.indicator.DottedIndicatorView;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/ImagesBinder;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parent", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function0;", "", "onImageClick", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function0;)V", "", "", "toRatioString", "(F)Ljava/lang/String;", "", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Image;", "images", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$CardSettings;", "settings", "bind", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$CardSettings;)V", "", "getIndicatorId", "()I", "getContainerId", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/images/ImagesAdapter;", "imageAdapter", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/images/ImagesAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "recyclerView", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView;", "indicator", "Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImagesBinder {
    private final Context context;

    @NotNull
    private final ImagesAdapter imageAdapter;

    @NotNull
    private final DottedIndicatorView indicator;

    @NotNull
    private final LinearLayoutManager linearLayoutManager;

    @NotNull
    private final LoopedRecyclerView recyclerView;

    public ImagesBinder(@NotNull ConstraintLayout parent, @NotNull J lifecycleOwner, @NotNull Function0<Unit> onImageClick) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onImageClick, "onImageClick");
        Context context = parent.getContext();
        this.context = context;
        ImagesAdapter imagesAdapter = new ImagesAdapter(lifecycleOwner, onImageClick);
        this.imageAdapter = imagesAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.linearLayoutManager = linearLayoutManager;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        LoopedRecyclerView loopedRecyclerView = new LoopedRecyclerView(context, null, 0, 6, null);
        loopedRecyclerView.setId(R$id.shelfCardTGalleryRv);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        loopedRecyclerView.setLayoutParams(bVar);
        loopedRecyclerView.setHasFixedSize(true);
        loopedRecyclerView.setNestedScrollingEnabled(false);
        loopedRecyclerView.setItemAnimator(null);
        this.recyclerView = loopedRecyclerView;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        DottedIndicatorView dottedIndicatorView = new DottedIndicatorView(context, null, 2, null);
        Context context2 = dottedIndicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(2, context2);
        Context context3 = dottedIndicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px2 = ResourceExtKt.toPx(8, context3);
        dottedIndicatorView.setId(View.generateViewId());
        Context context4 = dottedIndicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        dottedIndicatorView.setDotColor(ThemeExtKt.themeColor(context4, R$attr.graphicTertiaryOnLight));
        Context context5 = dottedIndicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        dottedIndicatorView.setHighlightedDotColor(ThemeExtKt.themeColor(context5, R$attr.bgDarkKey));
        dottedIndicatorView.setDotRadius(px);
        dottedIndicatorView.setHighlightedDotLength(px * 2);
        dottedIndicatorView.setSpacing(px);
        DottedIndicatorView.enableBackground$default(dottedIndicatorView, null, 1, null);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41658v = loopedRecyclerView.getId();
        bVar2.f41642l = loopedRecyclerView.getId();
        bVar2.setMarginEnd(px2);
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = px2;
        dottedIndicatorView.setLayoutParams(bVar2);
        this.indicator = dottedIndicatorView;
        loopedRecyclerView.setLayoutManager(linearLayoutManager);
        loopedRecyclerView.setAdapter(imagesAdapter);
        parent.addView(loopedRecyclerView);
        parent.addView(dottedIndicatorView);
        new x().attachToRecyclerView(loopedRecyclerView);
        dottedIndicatorView.attachTo(loopedRecyclerView);
    }

    private final String toRatioString(float f7) {
        return ((int) (f7 * 100)) + ":100";
    }

    public final void bind(@NotNull List<ShelfCardVO.Image> images, @NotNull ShelfCardVO.CardSettings settings) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(settings, "settings");
        LoopedRecyclerView loopedRecyclerView = this.recyclerView;
        ViewGroup.LayoutParams layoutParams = loopedRecyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        Float galleryAspectRatio = settings.getGalleryAspectRatio();
        if (galleryAspectRatio != null) {
            float floatValue = galleryAspectRatio.floatValue();
            Integer galleryWidth = settings.getGalleryWidth();
            ((ViewGroup.MarginLayoutParams) bVar).width = galleryWidth != null ? galleryWidth.intValue() : 0;
            bVar.f41600G = toRatioString(floatValue);
        }
        loopedRecyclerView.setLayoutParams(bVar);
        ViewExtensionsKt.safeUpdateMargins$default(this.recyclerView, Integer.valueOf(settings.getGalleryTopMargin()), null, Integer.valueOf(settings.getGalleryHorizontalMargin()), Integer.valueOf(settings.getGalleryHorizontalMargin()), 2, null);
        this.indicator.setVisibility(images.size() > 1 ? 0 : 8);
        this.imageAdapter.setItems(images);
    }

    public final int getContainerId() {
        return this.recyclerView.getId();
    }

    public final int getIndicatorId() {
        return this.indicator.getId();
    }
}
