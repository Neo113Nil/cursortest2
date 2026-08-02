package ru.ozon.app.android.storefront.widgets.cms.bannercarousel.widget;

import B0.A0;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.BannerCarouselItem;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.BannerCarouselVO;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.carousel.CarouselAdapter;
import ru.ozon.app.android.storefront.widgets.cms.databinding.WidgetBannerCarouselBinding;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/widget/BannerCarouselViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselVO;Ll20/d;)V", "", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItem;", "items", "setItems", "(Ljava/util/List;)V", "setAsMultipleBanner", "()V", "setAsSingleBanner", "", "width", "height", "setRatio", "(II)V", "onRecycle", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/widgets/cms/databinding/WidgetBannerCarouselBinding;", "binding", "Lru/ozon/app/android/storefront/widgets/cms/databinding/WidgetBannerCarouselBinding;", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselAdapter;", "adapter", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselAdapter;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BannerCarouselViewHolder extends k<BannerCarouselVO> {

    @NotNull
    private final CarouselAdapter adapter;

    @NotNull
    private final WidgetBannerCarouselBinding binding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerCarouselViewHolder(@NotNull View view, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.refs = refs;
        WidgetBannerCarouselBinding bind = WidgetBannerCarouselBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        CarouselAdapter carouselAdapter = new CarouselAdapter(refs, this, this);
        this.adapter = carouselAdapter;
        bind.carouselVp.setAdapter(carouselAdapter);
        bind.pageIndicatorPiv.d(bind.carouselVp);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        BannerCarouselVO boundedData = getBoundedData();
        if (boundedData != null) {
            RecyclerView.o layoutManager = this.binding.carouselVp.getLayoutManager();
            boundedData.setLayoutManagerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }

    public void setAsMultipleBanner() {
        this.binding.pageIndicatorPiv.setVisibility(0);
    }

    public void setAsSingleBanner() {
        this.binding.pageIndicatorPiv.setVisibility(8);
    }

    public void setItems(@NotNull List<BannerCarouselItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.adapter.setItems(items);
    }

    public void setRatio(int width, int height) {
        ViewGroup.LayoutParams layoutParams = this.binding.carouselVp.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.b) layoutParams).f41600G = A0.a(width, height, "H, ", ProductContainerDTO.RATIO_DELIMITER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BannerCarouselVO item, @NotNull d info) {
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Parcelable layoutManagerState = item.getLayoutManagerState();
        if (layoutManagerState != null && (layoutManager = this.binding.carouselVp.getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(layoutManagerState);
        }
        setItems(item.getBanners());
        if (item.getBanners().size() > 1) {
            setAsMultipleBanner();
        } else {
            setAsSingleBanner();
        }
        setRatio(item.getWidth(), item.getHeight());
    }
}
