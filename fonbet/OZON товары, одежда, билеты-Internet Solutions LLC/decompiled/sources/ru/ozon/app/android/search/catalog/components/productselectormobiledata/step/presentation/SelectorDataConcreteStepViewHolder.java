package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation;

import FX.a;
import GZ.g;
import H2.b;
import Sc.o;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.W;
import i10.l;
import j10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.ProductSelectorLoadingDelegate;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.RangeAnalyticDelegate;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.SelectorDataActionBarModel;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.SelectorInfo;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.ShortOnQueryTextListener;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.CurrentStepAction;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.SelectorDataConcreteStepViewHolder;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.models.ProductSelectorMobileDataConcreteStepVO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.rv.StepItemsAdapter;
import ru.ozon.app.android.search.databinding.NoUiWidgetSelectorConcreteStepDataBinding;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001e\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00120.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/SelectorDataConcreteStepViewHolder;", "", "Lru/ozon/app/android/search/databinding/NoUiWidgetSelectorConcreteStepDataBinding;", "binding", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/ConcreteStepViewModel;", "concreteStepViewModel", "LGZ/g;", "ozonRouter", "<init>", "(Lru/ozon/app/android/search/databinding/NoUiWidgetSelectorConcreteStepDataBinding;Lj10/h;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/ConcreteStepViewModel;LGZ/g;)V", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;", ProductSelectorMobileDataDTO.STEP_TYPE, "", "bindContent", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;)V", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataActionBarModel;", "actionBarModel", "bindActionBar", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataActionBarModel;)V", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/models/ProductSelectorMobileDataConcreteStepVO;", "vo", "bind", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/models/ProductSelectorMobileDataConcreteStepVO;)V", "onRemove", "()V", "Lru/ozon/app/android/search/databinding/NoUiWidgetSelectorConcreteStepDataBinding;", "getBinding", "()Lru/ozon/app/android/search/databinding/NoUiWidgetSelectorConcreteStepDataBinding;", "Lj10/h;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/ConcreteStepViewModel;", "LGZ/g;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/RangeAnalyticDelegate;", "rangeAnalyticDelegate", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/RangeAnalyticDelegate;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/ProductSelectorLoadingDelegate;", "loadingDelegate", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/ProductSelectorLoadingDelegate;", "currentItem", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/models/ProductSelectorMobileDataConcreteStepVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/StepItemsAdapter;", "adapter", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/StepItemsAdapter;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectorDataConcreteStepViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final StepItemsAdapter adapter;

    @NotNull
    private final NoUiWidgetSelectorConcreteStepDataBinding binding;

    @NotNull
    private final ConcreteStepViewModel concreteStepViewModel;
    private ProductSelectorMobileDataConcreteStepVO currentItem;

    @NotNull
    private final ProductSelectorLoadingDelegate loadingDelegate;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final RangeAnalyticDelegate rangeAnalyticDelegate;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final h<l> voHelper;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectorDataConcreteStepViewHolder(@NotNull final NoUiWidgetSelectorConcreteStepDataBinding binding, @NotNull h<l> voHelper, @NotNull ComposerReferences references, @NotNull ConcreteStepViewModel concreteStepViewModel, @NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(concreteStepViewModel, "concreteStepViewModel");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.binding = binding;
        this.voHelper = voHelper;
        this.references = references;
        this.concreteStepViewModel = concreteStepViewModel;
        this.ozonRouter = ozonRouter;
        this.rangeAnalyticDelegate = new RangeAnalyticDelegate();
        FrameLayout stepProgressContaienr = binding.stepProgressContaienr;
        Intrinsics.checkNotNullExpressionValue(stepProgressContaienr, "stepProgressContaienr");
        this.loadingDelegate = new ProductSelectorLoadingDelegate(stepProgressContaienr, references);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, voHelper, ProductSelectorMobileDataConcreteStepVO.class).onPreProcess(new SelectorDataConcreteStepViewHolder$actionHandler$1(this)).customAnalyticHandler(new SelectorDataConcreteStepViewHolder$actionHandler$2(this)).onClick(new SelectorDataConcreteStepViewHolder$actionHandler$3(this)).buildHandler();
        this.actionHandler = buildHandler;
        StepItemsAdapter stepItemsAdapter = new StepItemsAdapter(buildHandler, null, 2, 0 == true ? 1 : 0);
        this.adapter = stepItemsAdapter;
        references.getController().e(new l.a.C1079a(0L, null, 3));
        binding.stepItems.setAdapter(stepItemsAdapter);
        binding.backButton.setOnClickListener(new a(this, 6));
        binding.stepSearch.o(new ShortOnQueryTextListener() { // from class: ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.SelectorDataConcreteStepViewHolder$1$2
            @Override // androidx.appcompat.widget.SearchView.l
            public boolean onQueryTextChange(String newText) {
                ConcreteStepViewModel concreteStepViewModel2;
                concreteStepViewModel2 = SelectorDataConcreteStepViewHolder.this.concreteStepViewModel;
                concreteStepViewModel2.onSearchTextChanged(newText);
                return true;
            }
        });
        concreteStepViewModel.getAction().observe(references.getContainer().g(), new W() { // from class: ZH.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                SelectorDataConcreteStepViewHolder.lambda$3$lambda$2(this, binding, (CurrentStepAction) obj);
            }
        });
    }

    private final void bindActionBar(SelectorDataActionBarModel actionBarModel) {
        NoUiWidgetSelectorConcreteStepDataBinding noUiWidgetSelectorConcreteStepDataBinding = this.binding;
        TextView stepTitle = noUiWidgetSelectorConcreteStepDataBinding.stepTitle;
        Intrinsics.checkNotNullExpressionValue(stepTitle, "stepTitle");
        TextViewExtKt.setTextOrGone(stepTitle, actionBarModel.getTitle());
        TextView stepSubtitle = noUiWidgetSelectorConcreteStepDataBinding.stepSubtitle;
        Intrinsics.checkNotNullExpressionValue(stepSubtitle, "stepSubtitle");
        TextViewExtKt.setTextOrGone(stepSubtitle, actionBarModel.getSubtitle());
        LargeBorderlessButtonView closeAllStepButton = noUiWidgetSelectorConcreteStepDataBinding.closeAllStepButton;
        Intrinsics.checkNotNullExpressionValue(closeAllStepButton, "closeAllStepButton");
        LargeBorderlessButtonHolderKt.bindOrGone(closeAllStepButton, actionBarModel.getCloseButton(), this.actionHandler);
    }

    private final void bindContent(SelectorInfo.SelectorStepData selectorStepData) {
        NoUiWidgetSelectorConcreteStepDataBinding noUiWidgetSelectorConcreteStepDataBinding = this.binding;
        this.concreteStepViewModel.bindStepCells(selectorStepData.getValueCells());
        SelectorInfo.SelectorStepData.SearchBar searchBar = selectorStepData.getSearchBar();
        if (searchBar == null) {
            SearchView stepSearch = noUiWidgetSelectorConcreteStepDataBinding.stepSearch;
            Intrinsics.checkNotNullExpressionValue(stepSearch, "stepSearch");
            ViewExtKt.gone(stepSearch);
        } else {
            SearchView stepSearch2 = noUiWidgetSelectorConcreteStepDataBinding.stepSearch;
            Intrinsics.checkNotNullExpressionValue(stepSearch2, "stepSearch");
            ViewExtKt.show(stepSearch2);
            noUiWidgetSelectorConcreteStepDataBinding.stepSearch.q(searchBar.getHint());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$0(SelectorDataConcreteStepViewHolder selectorDataConcreteStepViewHolder, View view) {
        GZ.l.a(selectorDataConcreteStepViewHolder.ozonRouter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(SelectorDataConcreteStepViewHolder selectorDataConcreteStepViewHolder, NoUiWidgetSelectorConcreteStepDataBinding noUiWidgetSelectorConcreteStepDataBinding, CurrentStepAction currentStepAction) {
        if (currentStepAction instanceof CurrentStepAction.ShowCells) {
            selectorDataConcreteStepViewHolder.adapter.submitList(((CurrentStepAction.ShowCells) currentStepAction).getCells(), new b(3, noUiWidgetSelectorConcreteStepDataBinding, selectorDataConcreteStepViewHolder));
            return;
        }
        if (currentStepAction instanceof CurrentStepAction.ProcessChangeFilter) {
            selectorDataConcreteStepViewHolder.references.getController().e(new l.a.C1079a(0L, null, 3));
            InterfaceC7851b.a.a(selectorDataConcreteStepViewHolder.references.getController(), null, ((CurrentStepAction.ProcessChangeFilter) currentStepAction).getPostParams(), null, null, 13);
        } else {
            if (!(currentStepAction instanceof CurrentStepAction.CloseFlow)) {
                throw new o();
            }
            ComposerExtKt.closeFlow(selectorDataConcreteStepViewHolder.references.getContainer());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2$lambda$1(NoUiWidgetSelectorConcreteStepDataBinding noUiWidgetSelectorConcreteStepDataBinding, SelectorDataConcreteStepViewHolder selectorDataConcreteStepViewHolder) {
        noUiWidgetSelectorConcreteStepDataBinding.stepItems.scrollToPosition(0);
        selectorDataConcreteStepViewHolder.references.getController().hideLoader();
    }

    public final void bind(@NotNull ProductSelectorMobileDataConcreteStepVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.currentItem = vo;
        this.loadingDelegate.bindIsCalled();
        bindActionBar(vo.getActionBarModel());
        LargeButtonView concreteStepActionButton = this.binding.concreteStepActionButton;
        Intrinsics.checkNotNullExpressionValue(concreteStepActionButton, "concreteStepActionButton");
        LargeButtonHolderKt.bind(concreteStepActionButton, vo.getActionButton(), this.actionHandler);
        bindContent(vo.getStepContent());
    }

    public final void onRemove() {
        this.concreteStepViewModel.getAction().removeObservers(this.references.getContainer().g());
        this.loadingDelegate.onRemove();
    }
}
