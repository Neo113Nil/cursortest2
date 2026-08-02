package ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep;

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
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.model.ProductSelectorMobileDataAllStepVO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.rv.SelectorDataAllStepViewHolder;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.SelectorDataViewAnalyticDelegate;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.app.android.search.databinding.NoUiWidgetSelectorStepDataAllStepsBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0010\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0018\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0017\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010!\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00032\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R6\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060)j\u0002`*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030+0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/ProductSelectorDataAllStepNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/model/ProductSelectorMobileDataAllStepVO;", "LPc/a;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/AllStepViewModel;", "pViewModel", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataViewAnalyticDelegate;", "delegate", "<init>", "(LPc/a;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataViewAnalyticDelegate;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/model/ProductSelectorMobileDataAllStepVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "", "handleRemove", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)Z", "LPc/a;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataViewAnalyticDelegate;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "allStepsContainer", "Landroid/view/View;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductSelectorDataAllStepNoUiViewMapper extends SingleNoUiViewMapper<ProductSelectorMobileDataDTO, ProductSelectorMobileDataAllStepVO> {
    private View allStepsContainer;

    @NotNull
    private final SelectorDataViewAnalyticDelegate delegate;

    @NotNull
    private final Function2<ProductSelectorMobileDataDTO, d, List<ProductSelectorMobileDataAllStepVO>> mapper;

    @NotNull
    private final a<AllStepViewModel> pViewModel;

    public ProductSelectorDataAllStepNoUiViewMapper(@NotNull a<AllStepViewModel> pViewModel, @NotNull SelectorDataViewAnalyticDelegate delegate) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.pViewModel = pViewModel;
        this.delegate = delegate;
        this.mapper = ProductSelectorDataAllStepNoUiViewMapper$mapper$1.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        View view = this.allStepsContainer;
        if (view != null) {
            Object tag = view.getTag();
            SelectorDataAllStepViewHolder selectorDataAllStepViewHolder = tag instanceof SelectorDataAllStepViewHolder ? (SelectorDataAllStepViewHolder) tag : null;
            if (selectorDataAllStepViewHolder != null) {
                c d11 = viewObject.d();
                ProductSelectorMobileDataAllStepVO productSelectorMobileDataAllStepVO = d11 instanceof ProductSelectorMobileDataAllStepVO ? (ProductSelectorMobileDataAllStepVO) d11 : null;
                if (productSelectorMobileDataAllStepVO == null) {
                    return;
                }
                selectorDataAllStepViewHolder.bind(productSelectorMobileDataAllStepVO);
            }
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        this.delegate.setComposerReferences(references);
        if (this.allStepsContainer == null) {
            View inflate = LayoutInflater.from(references.getContainer().i()).inflate(R$layout.no_ui_widget_selector_step_data_all_steps, composerRootView, false);
            composerRootView.addView(inflate);
            this.allStepsContainer = inflate;
            if (inflate != null) {
                NoUiWidgetSelectorStepDataAllStepsBinding bind = NoUiWidgetSelectorStepDataAllStepsBinding.bind(inflate);
                Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
                w0 a11 = new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.ProductSelectorDataAllStepNoUiViewMapper$constructLayout$lambda$2$$inlined$createViewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        a aVar;
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        aVar = ProductSelectorDataAllStepNoUiViewMapper.this.pViewModel;
                        AllStepViewModel allStepViewModel = (AllStepViewModel) aVar.get();
                        Intrinsics.g(allStepViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return allStepViewModel;
                    }
                }).a(AllStepViewModel.class);
                Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
                inflate.setTag(new SelectorDataAllStepViewHolder(bind, voHelper, references, (AllStepViewModel) a11));
            }
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<ProductSelectorMobileDataDTO, d, List<ProductSelectorMobileDataAllStepVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public boolean handleRemove(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.delegate.setComposerReferences(null);
        View view = this.allStepsContainer;
        Object tag = view != null ? view.getTag() : null;
        SelectorDataAllStepViewHolder selectorDataAllStepViewHolder = tag instanceof SelectorDataAllStepViewHolder ? (SelectorDataAllStepViewHolder) tag : null;
        if (selectorDataAllStepViewHolder != null) {
            selectorDataAllStepViewHolder.onRemove();
        }
        composerRootView.removeView(this.allStepsContainer);
        this.allStepsContainer = null;
        return true;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void trackView(@NotNull ProductSelectorMobileDataAllStepVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.delegate.trackViewScreen$search_prodGoogleAllVendorsRelease(item, trackingData, viewedPond, item.getTrackingInfo());
    }
}
