package ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation;

import Gt.a;
import W10.c;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.marketing.databinding.WidgetSellerCarouselBinding;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.view.SellerCarouselView;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010%\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` 2\u000e\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001cH\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;LWZ/l;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;La00/f;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "", "titleDeeplink", "Ljava/lang/String;", "Lru/ozon/app/android/marketing/databinding/WidgetSellerCarouselBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetSellerCarouselBinding;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselAdapter;", "adapter", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselAdapter;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerCarouselViewHolder extends k<SellerCarouselVO> {

    @NotNull
    private final SellerCarouselAdapter adapter;

    @NotNull
    private final WidgetSellerCarouselBinding binding;

    @NotNull
    private final ComposerReferences refs;
    private String titleDeeplink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerCarouselViewHolder(@NotNull View containerView, @NotNull l tokenizedAnalytics, @NotNull SellerFavoriteService sellerFavoriteService, @NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker, @NotNull FavoriteEventManager favoriteEventManager, @NotNull C4911f container, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
        WidgetSellerCarouselBinding bind = WidgetSellerCarouselBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        SellerCarouselAdapter sellerCarouselAdapter = new SellerCarouselAdapter(this, sellerFavoriteService, refs.getNavigator(), tokenizedAnalytics, adultHandler, featureChecker, favoriteEventManager, container);
        this.adapter = sellerCarouselAdapter;
        SellerCarouselView sellerCarouselView = bind.root;
        sellerCarouselView.getCarousel().setAdapter(sellerCarouselAdapter);
        RecyclerView carousel = sellerCarouselView.getCarousel();
        Context context = sellerCarouselView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        carousel.addItemDecoration(new SellerCarouselDecorator(context));
        new x().attachToRecyclerView(sellerCarouselView.getCarousel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$3(SellerCarouselVO sellerCarouselVO, SellerCarouselViewHolder sellerCarouselViewHolder, View view) {
        t titleTokenizedEvent = sellerCarouselVO.getTitleTokenizedEvent();
        if (titleTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(sellerCarouselViewHolder.refs.getTokenizedAnalytics(), titleTokenizedEvent, null, 2, null);
        }
        String str = sellerCarouselViewHolder.titleDeeplink;
        if (str != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(sellerCarouselViewHolder.refs.getNavigator(), str, null, 2, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.adapter.detachAll();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerCarouselVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetSellerCarouselBinding widgetSellerCarouselBinding = this.binding;
        TextViewExtKt.setTextOrGone(widgetSellerCarouselBinding.root.getTitle(), item.getTitle());
        this.titleDeeplink = item.getTitleDeeplink();
        this.adapter.setItems(item.getItems());
        this.adapter.setTrackingData(getTrackingData());
        widgetSellerCarouselBinding.root.getTitle().setOnClickListener(new a(2, item, this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SellerCarouselVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SellerCarouselViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
