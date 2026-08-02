package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation;

import Fm0.g;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.feature.hotels.databinding.WidgetHotelsRoomsDetailsFullBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation.adapters.HotelsRoomsDetailsFullImagesViewPagerAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation.adapters.HotelsRoomsDetailsFullInfoCardAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation.adapters.HotelsRoomsDetailsFullInfoCardDecoration;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/HotelsRoomsDetailsFullWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/HotelsRoomsDetailsFullVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;LWZ/l;)V", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", ResultDTO.CONTENT_TYPE_SERVICES, "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "layout", "", "bindServices", "(Ljava/util/List;Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/HotelsRoomsDetailsFullVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/HotelsRoomsDetailsFullVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsRoomsDetailsFullBinding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsRoomsDetailsFullBinding;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/adapters/HotelsRoomsDetailsFullImagesViewPagerAdapter;", "photosAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/adapters/HotelsRoomsDetailsFullImagesViewPagerAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/adapters/HotelsRoomsDetailsFullInfoCardAdapter;", "infoCardAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/adapters/HotelsRoomsDetailsFullInfoCardAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsDetailsFullWidgetViewHolder extends k<HotelsRoomsDetailsFullVO> {

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetHotelsRoomsDetailsFullBinding binding;

    @NotNull
    private final HotelsRoomsDetailsFullInfoCardAdapter infoCardAdapter;

    @NotNull
    private final HotelsRoomsDetailsFullImagesViewPagerAdapter photosAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomsDetailsFullWidgetViewHolder(@NotNull View containerView, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetHotelsRoomsDetailsFullBinding bind = WidgetHotelsRoomsDetailsFullBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        HotelsRoomsDetailsFullImagesViewPagerAdapter hotelsRoomsDetailsFullImagesViewPagerAdapter = new HotelsRoomsDetailsFullImagesViewPagerAdapter();
        this.photosAdapter = hotelsRoomsDetailsFullImagesViewPagerAdapter;
        HotelsRoomsDetailsFullInfoCardAdapter hotelsRoomsDetailsFullInfoCardAdapter = new HotelsRoomsDetailsFullInfoCardAdapter();
        this.infoCardAdapter = hotelsRoomsDetailsFullInfoCardAdapter;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        ViewPager viewPager = bind.hotelsRoomsDetailsFullPhotosVp;
        viewPager.setAdapter(hotelsRoomsDetailsFullImagesViewPagerAdapter);
        bind.hotelsRoomsDetailsFullDotsSpi.c(viewPager, new g());
        RecyclerView recyclerView = bind.hotelsRoomsDetailsFullInfoCardsRv;
        recyclerView.setAdapter(hotelsRoomsDetailsFullInfoCardAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new HotelsRoomsDetailsFullInfoCardDecoration(context));
        bind.seatsDetailsVAL.setAdapter(atomsAdapter);
    }

    private final void bindServices(List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> services, VerticalAtomsLayout layout) {
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list = services;
        layout.setVisibility(list == null || list.isEmpty() ? 8 : 0);
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context = layout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (services == null) {
            services = K.f71697a;
        }
        atomsAdapter.bind(context, services);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsRoomsDetailsFullVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView hotelsRoomsDetailsFullTitleTav = this.binding.hotelsRoomsDetailsFullTitleTav;
        Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsFullTitleTav, "hotelsRoomsDetailsFullTitleTav");
        TextAtomHolderKt.bind$default(hotelsRoomsDetailsFullTitleTav, item.getTitle(), null, 2, null);
        TextAtomView hotelsRoomsDetailsFullSubtitleTav = this.binding.hotelsRoomsDetailsFullSubtitleTav;
        Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsFullSubtitleTav, "hotelsRoomsDetailsFullSubtitleTav");
        TextAtomHolderKt.bind$default(hotelsRoomsDetailsFullSubtitleTav, item.getSubtitle(), null, 2, null);
        Group hotelsRoomsDetailsFullPhotosGroup = this.binding.hotelsRoomsDetailsFullPhotosGroup;
        Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsFullPhotosGroup, "hotelsRoomsDetailsFullPhotosGroup");
        List<String> images = item.getImages();
        boolean z11 = true;
        hotelsRoomsDetailsFullPhotosGroup.setVisibility(!(images == null || images.isEmpty()) ? 0 : 8);
        List<String> images2 = item.getImages();
        if (images2 != null) {
            this.photosAdapter.setItems(images2);
        }
        RecyclerView hotelsRoomsDetailsFullInfoCardsRv = this.binding.hotelsRoomsDetailsFullInfoCardsRv;
        Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsFullInfoCardsRv, "hotelsRoomsDetailsFullInfoCardsRv");
        List<InfoCardVO> infoCards = item.getInfoCards();
        if (infoCards != null && !infoCards.isEmpty()) {
            z11 = false;
        }
        hotelsRoomsDetailsFullInfoCardsRv.setVisibility(z11 ? 8 : 0);
        this.infoCardAdapter.setItems(item.getInfoCards());
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> services = item.getServices();
        VerticalAtomsLayout seatsDetailsVAL = this.binding.seatsDetailsVAL;
        Intrinsics.checkNotNullExpressionValue(seatsDetailsVAL, "seatsDetailsVAL");
        bindServices(services, seatsDetailsVAL);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsRoomsDetailsFullVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HotelsRoomsDetailsFullWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
