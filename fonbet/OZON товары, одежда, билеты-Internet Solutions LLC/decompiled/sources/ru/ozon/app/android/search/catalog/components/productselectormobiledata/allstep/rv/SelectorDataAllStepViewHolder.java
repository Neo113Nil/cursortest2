package ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.rv;

import B90.i0;
import Sc.o;
import android.widget.FrameLayout;
import android.widget.TextView;
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
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.AllStepViewModel;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.model.AllStepAction;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.model.ProductSelectorMobileDataAllStepVO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.rv.SelectorDataAllStepViewHolder;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.ProductSelectorLoadingDelegate;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.SelectorDataActionBarModel;
import ru.ozon.app.android.search.databinding.NoUiWidgetSelectorStepDataAllStepsBinding;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001e\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/rv/SelectorDataAllStepViewHolder;", "", "Lru/ozon/app/android/search/databinding/NoUiWidgetSelectorStepDataAllStepsBinding;", "binding", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/AllStepViewModel;", "allStepViewModel", "<init>", "(Lru/ozon/app/android/search/databinding/NoUiWidgetSelectorStepDataAllStepsBinding;Lj10/h;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/AllStepViewModel;)V", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/model/ProductSelectorMobileDataAllStepVO;", "vo", "", "bindContent", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/model/ProductSelectorMobileDataAllStepVO;)V", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataActionBarModel;", "actionBarModel", "bindActionBar", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataActionBarModel;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "actionButton", "bindActionButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "bind", "onRemove", "()V", "Lru/ozon/app/android/search/databinding/NoUiWidgetSelectorStepDataAllStepsBinding;", "Lj10/h;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/AllStepViewModel;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/ProductSelectorLoadingDelegate;", "loadingDelegate", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/ProductSelectorLoadingDelegate;", "currentModel", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/model/ProductSelectorMobileDataAllStepVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/rv/AllStepInfoAdapter;", "adapter", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/rv/AllStepInfoAdapter;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectorDataAllStepViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AllStepInfoAdapter adapter;

    @NotNull
    private final AllStepViewModel allStepViewModel;

    @NotNull
    private final NoUiWidgetSelectorStepDataAllStepsBinding binding;
    private ProductSelectorMobileDataAllStepVO currentModel;

    @NotNull
    private final ProductSelectorLoadingDelegate loadingDelegate;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final h<l> voHelper;

    public SelectorDataAllStepViewHolder(@NotNull NoUiWidgetSelectorStepDataAllStepsBinding binding, @NotNull h<l> voHelper, @NotNull ComposerReferences references, @NotNull AllStepViewModel allStepViewModel) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(allStepViewModel, "allStepViewModel");
        this.binding = binding;
        this.voHelper = voHelper;
        this.references = references;
        this.allStepViewModel = allStepViewModel;
        FrameLayout stepProgressContaienr = binding.stepProgressContaienr;
        Intrinsics.checkNotNullExpressionValue(stepProgressContaienr, "stepProgressContaienr");
        this.loadingDelegate = new ProductSelectorLoadingDelegate(stepProgressContaienr, references);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, voHelper, ProductSelectorMobileDataAllStepVO.class).onClick(new SelectorDataAllStepViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        AllStepInfoAdapter allStepInfoAdapter = new AllStepInfoAdapter(buildHandler);
        this.adapter = allStepInfoAdapter;
        binding.allStepCells.setAdapter(allStepInfoAdapter);
        references.getController().e(new l.a.C1079a(0L, null, 3));
        allStepViewModel.getActionEvent().observe(references.getContainer().g(), new W() { // from class: WH.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                SelectorDataAllStepViewHolder._init_$lambda$0(SelectorDataAllStepViewHolder.this, (AllStepAction) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SelectorDataAllStepViewHolder selectorDataAllStepViewHolder, AllStepAction allStepAction) {
        if (allStepAction instanceof AllStepAction.Refresh) {
            selectorDataAllStepViewHolder.references.getController().e(new l.a.C1079a(0L, null, 3));
            InterfaceC7851b.a.a(selectorDataAllStepViewHolder.references.getController(), null, ((AllStepAction.Refresh) allStepAction).getPostParams(), null, null, 13);
        } else {
            if (!(allStepAction instanceof AllStepAction.CloseFlow)) {
                throw new o();
            }
            ComposerExtKt.closeFlow(selectorDataAllStepViewHolder.references.getContainer());
        }
    }

    private final void bindActionBar(SelectorDataActionBarModel actionBarModel) {
        NoUiWidgetSelectorStepDataAllStepsBinding noUiWidgetSelectorStepDataAllStepsBinding = this.binding;
        LargeBorderlessButtonView clearAllStepButton = noUiWidgetSelectorStepDataAllStepsBinding.clearAllStepButton;
        Intrinsics.checkNotNullExpressionValue(clearAllStepButton, "clearAllStepButton");
        LargeBorderlessButtonHolderKt.bindOrGone(clearAllStepButton, actionBarModel.getClearButton(), this.actionHandler);
        LargeBorderlessButtonView closeAllStepButton = noUiWidgetSelectorStepDataAllStepsBinding.closeAllStepButton;
        Intrinsics.checkNotNullExpressionValue(closeAllStepButton, "closeAllStepButton");
        LargeBorderlessButtonHolderKt.bindOrGone(closeAllStepButton, actionBarModel.getCloseButton(), this.actionHandler);
    }

    private final void bindActionButton(ButtonV3Atom.LargeButton actionButton) {
        LargeButtonView allStepsActionButton = this.binding.allStepsActionButton;
        Intrinsics.checkNotNullExpressionValue(allStepsActionButton, "allStepsActionButton");
        LargeButtonHolderKt.bindOrGone(allStepsActionButton, actionButton, this.actionHandler);
    }

    private final void bindContent(ProductSelectorMobileDataAllStepVO vo) {
        TextView title = this.binding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextViewExtKt.setTextOrGone(title, vo.getSelectorInfo().getHeaderTitle());
        this.adapter.submitList(vo.getSelectorInfo().getStepCells(), new i0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindContent$lambda$1(SelectorDataAllStepViewHolder selectorDataAllStepViewHolder) {
        selectorDataAllStepViewHolder.references.getController().hideLoader();
    }

    public final void bind(@NotNull ProductSelectorMobileDataAllStepVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.currentModel = vo;
        this.loadingDelegate.bindIsCalled();
        bindActionBar(vo.getActionBarModel());
        bindActionButton(vo.getActionButton());
        bindContent(vo);
    }

    public final void onRemove() {
        this.loadingDelegate.onRemove();
        this.allStepViewModel.getActionEvent().removeObservers(this.references.getContainer().g());
    }
}
