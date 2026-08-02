package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import Pc.a;
import Sc.o;
import androidx.lifecycle.J;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.Action;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchBinder;", "", "LPc/a;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchViewModel;", "pViewModel", "<init>", "(LPc/a;)V", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "currentStep", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "paramsExtra", "", "setInitialNetworkData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchView;", "view", "Landroidx/lifecycle/J;", "viewLifecycleOwner", "bind", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchView;Landroidx/lifecycle/J;)V", "viewModel", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchViewModel;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchBinder {

    @NotNull
    private ProductPickerSearchViewModel viewModel;

    public ProductPickerSearchBinder(@NotNull a<ProductPickerSearchViewModel> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        ProductPickerSearchViewModel productPickerSearchViewModel = pViewModel.get();
        Intrinsics.checkNotNullExpressionValue(productPickerSearchViewModel, "get(...)");
        this.viewModel = productPickerSearchViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(ProductPickerSearchView productPickerSearchView, Action action) {
        if (action instanceof Action.Data) {
            ProductPickerSearchVO vo = ((Action.Data) action).getVo();
            productPickerSearchView.onNewTitleData(vo.getTitle());
            productPickerSearchView.onNewButtonData(vo.getButtonTitle(), vo.getButtonSubtitle());
            productPickerSearchView.onNewSearchData(vo.getSearchHint());
            productPickerSearchView.onNewScreenStructureData(vo.getIsTree());
        } else if (action instanceof Action.NewItems) {
            productPickerSearchView.onNewItems(((Action.NewItems) action).getItems());
        } else if (action instanceof Action.EnableButton) {
            productPickerSearchView.onEnableButton(((Action.EnableButton) action).getEnable());
        } else if (action instanceof Action.ScrollToPosition) {
            productPickerSearchView.onScroll(((Action.ScrollToPosition) action).getPosition());
        } else if (action instanceof Action.SmoothScrollToPosition) {
            productPickerSearchView.onSmoothScroll(((Action.SmoothScrollToPosition) action).getPosition());
        } else if (action instanceof Action.Params) {
            productPickerSearchView.onNewParams(((Action.Params) action).getParams());
        } else if (action instanceof Action.Progress) {
            productPickerSearchView.onProgress(((Action.Progress) action).getShow());
        } else if (action instanceof Action.Error) {
            productPickerSearchView.onError(((Action.Error) action).getError());
        } else {
            if (!(action instanceof Action.Finish)) {
                throw new o();
            }
            productPickerSearchView.onFinish();
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    public final void bind(@NotNull ProductPickerSearchView view, @NotNull J viewLifecycleOwner) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        this.viewModel.getActionLiveData().observe(viewLifecycleOwner, new WB.a(view, 1));
        view.setOnMainButtonClicked(new ProductPickerSearchBinder$bind$2(this.viewModel));
        view.setOnLeafClicked(new ProductPickerSearchBinder$bind$3(this.viewModel));
        view.setOnNodeClicked(new ProductPickerSearchBinder$bind$4(this.viewModel));
        view.setOnSearch(new ProductPickerSearchBinder$bind$5(this.viewModel));
        this.viewModel.onRetrieveData(false);
    }

    public final void setInitialNetworkData(@NotNull String actionType, @NotNull String currentStep, @NotNull HashMap<String, String> paramsExtra) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        Intrinsics.checkNotNullParameter(paramsExtra, "paramsExtra");
        this.viewModel.setInitialNetworkData(actionType, currentStep, paramsExtra);
    }
}
