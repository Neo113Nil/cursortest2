package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step;

import GZ.g;
import Pc.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.SelectorDataViewAnalyticDelegate;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.ConcreteStepViewModel;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.SelectorDataConcreteStepViewHolder;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.models.ProductSelectorMobileDataConcreteStepVO;
import ru.ozon.app.android.search.databinding.NoUiWidgetSelectorConcreteStepDataBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0019\u001a\u00060\u0012j\u0002`\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010#\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00032\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R6\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060,j\u0002`-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030.0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/ProductSelectorDataConcreteStepNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/models/ProductSelectorMobileDataConcreteStepVO;", "LPc/a;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/ConcreteStepViewModel;", "pViewModel", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataViewAnalyticDelegate;", "delegate", "<init>", "(LPc/a;LGZ/g;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataViewAnalyticDelegate;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/models/ProductSelectorMobileDataConcreteStepVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "", "handleRemove", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)Z", "LPc/a;", "LGZ/g;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataViewAnalyticDelegate;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "concreteStepWidget", "Landroid/view/View;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductSelectorDataConcreteStepNoUiViewMapper extends SingleNoUiViewMapper<ProductSelectorMobileDataDTO, ProductSelectorMobileDataConcreteStepVO> {
    private View concreteStepWidget;

    @NotNull
    private final SelectorDataViewAnalyticDelegate delegate;

    @NotNull
    private final Function2<ProductSelectorMobileDataDTO, d, List<ProductSelectorMobileDataConcreteStepVO>> mapper;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final a<ConcreteStepViewModel> pViewModel;

    public ProductSelectorDataConcreteStepNoUiViewMapper(@NotNull a<ConcreteStepViewModel> pViewModel, @NotNull g ozonRouter, @NotNull SelectorDataViewAnalyticDelegate delegate) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.pViewModel = pViewModel;
        this.ozonRouter = ozonRouter;
        this.delegate = delegate;
        this.mapper = ProductSelectorDataConcreteStepNoUiViewMapper$mapper$1.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        View view = this.concreteStepWidget;
        if (view != null) {
            Object tag = view.getTag();
            SelectorDataConcreteStepViewHolder selectorDataConcreteStepViewHolder = tag instanceof SelectorDataConcreteStepViewHolder ? (SelectorDataConcreteStepViewHolder) tag : null;
            if (selectorDataConcreteStepViewHolder != null) {
                c d11 = viewObject.d();
                ProductSelectorMobileDataConcreteStepVO productSelectorMobileDataConcreteStepVO = d11 instanceof ProductSelectorMobileDataConcreteStepVO ? (ProductSelectorMobileDataConcreteStepVO) d11 : null;
                if (productSelectorMobileDataConcreteStepVO == null) {
                    return;
                }
                selectorDataConcreteStepViewHolder.bind(productSelectorMobileDataConcreteStepVO);
            }
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        this.delegate.setComposerReferences(references);
        if (this.concreteStepWidget == null) {
            View inflate = LayoutInflater.from(references.getContainer().i()).inflate(R$layout.no_ui_widget_selector_concrete_step_data, composerRootView, false);
            composerRootView.addView(inflate);
            this.concreteStepWidget = inflate;
            if (inflate != null) {
                NoUiWidgetSelectorConcreteStepDataBinding bind = NoUiWidgetSelectorConcreteStepDataBinding.bind(inflate);
                Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
                w0 a11 = new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.ProductSelectorDataConcreteStepNoUiViewMapper$constructLayout$lambda$2$$inlined$createViewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        a aVar;
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        aVar = ProductSelectorDataConcreteStepNoUiViewMapper.this.pViewModel;
                        ConcreteStepViewModel concreteStepViewModel = (ConcreteStepViewModel) aVar.get();
                        Intrinsics.g(concreteStepViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return concreteStepViewModel;
                    }
                }).a(ConcreteStepViewModel.class);
                Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
                inflate.setTag(new SelectorDataConcreteStepViewHolder(bind, voHelper, references, (ConcreteStepViewModel) a11, this.ozonRouter));
            }
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<ProductSelectorMobileDataDTO, d, List<ProductSelectorMobileDataConcreteStepVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public boolean handleRemove(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.delegate.setComposerReferences(null);
        View view = this.concreteStepWidget;
        Object tag = view != null ? view.getTag() : null;
        SelectorDataConcreteStepViewHolder selectorDataConcreteStepViewHolder = tag instanceof SelectorDataConcreteStepViewHolder ? (SelectorDataConcreteStepViewHolder) tag : null;
        if (selectorDataConcreteStepViewHolder != null) {
            selectorDataConcreteStepViewHolder.onRemove();
        }
        composerRootView.removeView(this.concreteStepWidget);
        this.concreteStepWidget = null;
        return true;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void trackView(@NotNull ProductSelectorMobileDataConcreteStepVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.delegate.trackViewScreen$search_prodGoogleAllVendorsRelease(item, trackingData, viewedPond, item.getTrackingInfo());
    }
}
