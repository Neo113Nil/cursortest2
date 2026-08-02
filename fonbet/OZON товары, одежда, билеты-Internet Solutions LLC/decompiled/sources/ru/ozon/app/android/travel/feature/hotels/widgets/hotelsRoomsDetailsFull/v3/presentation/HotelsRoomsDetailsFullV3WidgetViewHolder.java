package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.databinding.WidgetHotelsRoomsDetailsFullV3Binding;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.presentation.images.ImagesAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.presentation.images.ImagesItemDecoration;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.presentation.infoCards.HotelsRoomsDetailsFullV3Decoration;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.presentation.infoCards.InfoCardsAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u000e\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/HotelsRoomsDetailsFullV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/HotelsRoomsDetailsFullV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "isImagesVisible", "", "setupCornerMargins", "(Z)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/HotelsRoomsDetailsFullV3VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/HotelsRoomsDetailsFullV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsRoomsDetailsFullV3Binding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsRoomsDetailsFullV3Binding;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/images/ImagesAdapter;", "imagesAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/images/ImagesAdapter;", "", "dp16", "I", "dp54", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/infoCards/InfoCardsAdapter;", "infoCardAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/infoCards/InfoCardsAdapter;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsDetailsFullV3WidgetViewHolder extends k<HotelsRoomsDetailsFullV3VO> {

    @NotNull
    private final WidgetHotelsRoomsDetailsFullV3Binding binding;
    private final int dp16;
    private final int dp54;

    @NotNull
    private final ImagesAdapter imagesAdapter;

    @NotNull
    private final InfoCardsAdapter infoCardAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomsDetailsFullV3WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetHotelsRoomsDetailsFullV3Binding bind = WidgetHotelsRoomsDetailsFullV3Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ImagesAdapter imagesAdapter = new ImagesAdapter(new HotelsRoomsDetailsFullV3WidgetViewHolder$imagesAdapter$1(this, references));
        this.imagesAdapter = imagesAdapter;
        this.dp16 = ResourceExtKt.toPx(16, getContext());
        this.dp54 = ResourceExtKt.toPx(54, getContext());
        InfoCardsAdapter infoCardsAdapter = new InfoCardsAdapter();
        this.infoCardAdapter = infoCardsAdapter;
        RecyclerView recyclerView = bind.hotelsRoomsDetailsFullImagesRv;
        recyclerView.setAdapter(imagesAdapter);
        bind.hotelsRoomsDetailsFullDotsDiv.attachTo(recyclerView);
        new x().attachToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new ImagesItemDecoration(context));
        RecyclerView recyclerView2 = bind.hotelsRoomsDetailsFullInfoCardsRv;
        recyclerView2.setAdapter(infoCardsAdapter);
        Context context2 = recyclerView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView2.addItemDecoration(new HotelsRoomsDetailsFullV3Decoration(context2));
    }

    private final void setupCornerMargins(boolean isImagesVisible) {
        int i11 = isImagesVisible ? this.dp16 : this.dp54;
        WidgetHotelsRoomsDetailsFullV3Binding widgetHotelsRoomsDetailsFullV3Binding = this.binding;
        TextAtomV2View hotelsRoomsDetailsFullTitleTav = widgetHotelsRoomsDetailsFullV3Binding.hotelsRoomsDetailsFullTitleTav;
        Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsFullTitleTav, "hotelsRoomsDetailsFullTitleTav");
        ViewGroup.LayoutParams layoutParams = hotelsRoomsDetailsFullTitleTav.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41595B = i11;
        hotelsRoomsDetailsFullTitleTav.setLayoutParams(bVar);
        BadgeView hotelsRoomsDetailsFullBadgeBv = widgetHotelsRoomsDetailsFullV3Binding.hotelsRoomsDetailsFullBadgeBv;
        Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsFullBadgeBv, "hotelsRoomsDetailsFullBadgeBv");
        ViewGroup.LayoutParams layoutParams2 = hotelsRoomsDetailsFullBadgeBv.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.setMarginEnd(i11);
        hotelsRoomsDetailsFullBadgeBv.setLayoutParams(bVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsRoomsDetailsFullV3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.imagesAdapter.setItems(item.getImages());
        Group hotelsRoomsDetailsFullPhotosGroup = this.binding.hotelsRoomsDetailsFullPhotosGroup;
        Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsFullPhotosGroup, "hotelsRoomsDetailsFullPhotosGroup");
        hotelsRoomsDetailsFullPhotosGroup.setVisibility(item.getIsImagesVisible() ? 0 : 8);
        TextAtomV2View hotelsRoomsDetailsFullTitleTav = this.binding.hotelsRoomsDetailsFullTitleTav;
        Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsFullTitleTav, "hotelsRoomsDetailsFullTitleTav");
        TextHolderKt.bind$default(hotelsRoomsDetailsFullTitleTav, item.getTitle(), null, 2, null);
        BadgeView hotelsRoomsDetailsFullBadgeBv = this.binding.hotelsRoomsDetailsFullBadgeBv;
        Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsFullBadgeBv, "hotelsRoomsDetailsFullBadgeBv");
        BadgeHolderKt.bindOrGone$default(hotelsRoomsDetailsFullBadgeBv, item.getTitleBadge(), (Function1) null, 2, (Object) null);
        TextAtomV2View hotelsRoomsDetailsFullSubtitleTav = this.binding.hotelsRoomsDetailsFullSubtitleTav;
        Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsFullSubtitleTav, "hotelsRoomsDetailsFullSubtitleTav");
        TextHolderKt.bindOrGone$default(hotelsRoomsDetailsFullSubtitleTav, item.getSubtitle(), null, 2, null);
        this.infoCardAdapter.submitList(item.getInfoCards());
        RecyclerView hotelsRoomsDetailsFullInfoCardsRv = this.binding.hotelsRoomsDetailsFullInfoCardsRv;
        Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsFullInfoCardsRv, "hotelsRoomsDetailsFullInfoCardsRv");
        hotelsRoomsDetailsFullInfoCardsRv.setVisibility(item.getIsInfoCardsVisible() ? 0 : 8);
        setupCornerMargins(item.getIsImagesVisible());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsRoomsDetailsFullV3VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HotelsRoomsDetailsFullV3WidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
