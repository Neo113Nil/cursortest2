package ru.ozon.app.android.common.productselectormobile.core;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.productselectormobile.PickerRefreshLinkStore;
import ru.ozon.app.android.common.productselectormobile.data.ProductSelectorMobileDTO;
import ru.ozon.app.android.common.productselectormobile.data.ProductSelectorMobileVO;
import ru.ozon.app.android.common.productselectormobile.presentation.ProductSelectorMobileViewHolder;
import ru.ozon.app.android.common.ui.productselectormobile.R$layout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/productselectormobile/core/ProductSelectorMobileViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileDTO;", "Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileVO;", "mapper", "Lru/ozon/app/android/common/productselectormobile/core/ProductSelectorMobileMapper;", "handlersInhibitor", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "refreshLinkStore", "Lru/ozon/app/android/common/productselectormobile/PickerRefreshLinkStore;", "<init>", "(Lru/ozon/app/android/common/productselectormobile/core/ProductSelectorMobileMapper;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/common/productselectormobile/PickerRefreshLinkStore;)V", "getMapper", "()Lru/ozon/app/android/common/productselectormobile/core/ProductSelectorMobileMapper;", "layout", "", "getLayout", "()Ljava/lang/Integer;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/productselectormobile/presentation/ProductSelectorMobileViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "product-selector-mobile_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductSelectorMobileViewMapper extends WidgetViewMapper<ProductSelectorMobileDTO, ProductSelectorMobileVO> {

    @NotNull
    private final Function2<View, ComposerReferences, ProductSelectorMobileViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final ProductSelectorMobileMapper mapper;

    public ProductSelectorMobileViewMapper(@NotNull ProductSelectorMobileMapper mapper, @NotNull HandlersInhibitor handlersInhibitor, @NotNull PickerRefreshLinkStore refreshLinkStore) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(refreshLinkStore, "refreshLinkStore");
        this.mapper = mapper;
        this.layout = R$layout.widget_product_selector_mobile;
        this.holderProducer = new ProductSelectorMobileViewMapper$holderProducer$1(handlersInhibitor, refreshLinkStore);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ProductSelectorMobileVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ProductSelectorMobileDTO, d, List<ProductSelectorMobileVO>> getMapper() {
        return this.mapper;
    }
}
