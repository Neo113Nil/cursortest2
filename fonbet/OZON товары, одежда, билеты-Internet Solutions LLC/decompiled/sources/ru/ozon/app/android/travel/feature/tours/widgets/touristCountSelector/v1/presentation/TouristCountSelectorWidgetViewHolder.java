package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation;

import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.travel.feature.tours.databinding.WidgetTouristCountSelectorBinding;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.view.TouristCountAgeSelectorView;
import ru.ozon.app.android.travel.molecules.view.quantityCell.QuantityCellVO;
import ru.ozon.app.android.travel.molecules.view.quantityCell.QuantityCellView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J3\u0010\u001a\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u001dJ#\u0010&\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00022\n\u0010%\u001a\u00060#j\u0002`$H\u0014¢\u0006\u0004\b&\u0010'J+\u0010&\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00022\n\u0010%\u001a\u00060#j\u0002`$2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b&\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel;)V", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AlertVO;", "alerts", "", "checkInfantRestriction", "(Ljava/util/List;)V", "Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;", "cells", "bindCells", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;", "ageSelectors", "", "ageCategories", "ageSelectorPlaceholder", "bindAgeSelectors", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "observeUpdateCells", "()V", "observeRestrictions", "observeAction", "observeProgress", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;Ll20/d;Ljava/lang/Object;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel;", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetTouristCountSelectorBinding;", "binding", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetTouristCountSelectorBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorWidgetViewHolder extends k<TouristCountSelectorVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTouristCountSelectorBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TouristCountSelectorViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouristCountSelectorWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull TouristCountSelectorViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.references = references;
        this.viewModel = viewModel;
        WidgetTouristCountSelectorBinding bind = WidgetTouristCountSelectorBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).onComposerAction(new TouristCountSelectorWidgetViewHolder$actionHandler$1(viewModel)).buildHandler();
    }

    private final void bindAgeSelectors(List<TouristCountSelectorVO.AgeSelectorVO> ageSelectors, List<String> ageCategories, String ageSelectorPlaceholder) {
        this.binding.touristAgeSelectorContainerLL.removeAllViews();
        for (TouristCountSelectorVO.AgeSelectorVO ageSelectorVO : ageSelectors) {
            TouristCountAgeSelectorView touristCountAgeSelectorView = new TouristCountAgeSelectorView(getContext(), null, 0, 0, 14, null);
            touristCountAgeSelectorView.bindVO(ageSelectorVO, ageCategories, ageSelectorPlaceholder, new TouristCountSelectorWidgetViewHolder$bindAgeSelectors$1$1$1(this.viewModel));
            this.binding.touristAgeSelectorContainerLL.addView(touristCountAgeSelectorView);
        }
    }

    private final void bindCells(List<QuantityCellVO> cells) {
        this.binding.touristCountSelectorContainerLL.removeAllViews();
        for (QuantityCellVO quantityCellVO : cells) {
            QuantityCellView quantityCellView = new QuantityCellView(getContext(), null, 0, 0, 14, null);
            quantityCellView.bind(quantityCellVO, new TouristCountSelectorWidgetViewHolder$bindCells$1$1$1(this, quantityCellVO), new TouristCountSelectorWidgetViewHolder$bindCells$1$1$2(this, quantityCellVO));
            this.binding.touristCountSelectorContainerLL.addView(quantityCellView);
        }
    }

    private final void checkInfantRestriction(List<TouristCountSelectorVO.AlertVO> alerts) {
        Object obj;
        Iterator<T> it = alerts.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((TouristCountSelectorVO.AlertVO) obj).getBrokenRule() == TouristCountSelectorDTO.AlertDTO.BrokenRuleDTO.BROKEN_RULE_INFANT_SUM) {
                    break;
                }
            }
        }
        TouristCountSelectorVO.AlertVO alertVO = (TouristCountSelectorVO.AlertVO) obj;
        if (alertVO != null) {
            TouristCountSelectorVO.AlertVO alertVO2 = alertVO.getShowAlertNow() ? alertVO : null;
            if (alertVO2 != null) {
                this.viewModel.getRestrictionLiveData().setValue(alertVO2.getRestriction());
            }
        }
    }

    private final void observeAction() {
        this.viewModel.getActionLiveData().observe(this, new TouristCountSelectorWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TouristCountSelectorWidgetViewHolder$observeAction$1(this)));
    }

    private final void observeProgress() {
        this.viewModel.getProgressLiveData().observe(this, new TouristCountSelectorWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TouristCountSelectorWidgetViewHolder$observeProgress$1(this)));
    }

    private final void observeRestrictions() {
        this.viewModel.getRestrictionLiveData().observe(this, new TouristCountSelectorWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TouristCountSelectorWidgetViewHolder$observeRestrictions$1(this)));
    }

    private final void observeUpdateCells() {
        this.viewModel.getCellsUpdateLiveData().observe(this, new TouristCountSelectorWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TouristCountSelectorWidgetViewHolder$observeUpdateCells$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeAction();
        observeProgress();
        observeUpdateCells();
        observeRestrictions();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TouristCountSelectorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TouristCountSelectorVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.viewModel.onBindNewItem(item);
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            checkInfantRestriction(item.getAlerts());
            bindCells(item.getCells());
            bindAgeSelectors(item.getAgeSelectors(), item.getAgeCategories(), item.getAgeSelectorPlaceholder());
            DisclaimerContainer touristCountSelectorAnnotation = this.binding.touristCountSelectorAnnotation;
            Intrinsics.checkNotNullExpressionValue(touristCountSelectorAnnotation, "touristCountSelectorAnnotation");
            DisclaimerHolderKt.bind$default(touristCountSelectorAnnotation, item.getChildrenAgeAnnotation(), null, 2, null);
            DisclaimerContainer touristCountSelectorAnnotation2 = this.binding.touristCountSelectorAnnotation;
            Intrinsics.checkNotNullExpressionValue(touristCountSelectorAnnotation2, "touristCountSelectorAnnotation");
            touristCountSelectorAnnotation2.setVisibility(item.getIsChildrenAgeAnnotationVisible() ? 0 : 8);
            LargeButtonView touristCountSelectorButtonLbv = this.binding.touristCountSelectorButtonLbv;
            Intrinsics.checkNotNullExpressionValue(touristCountSelectorButtonLbv, "touristCountSelectorButtonLbv");
            LargeButtonHolderKt.bind(touristCountSelectorButtonLbv, item.getApplyButton(), this.actionHandler);
            return;
        }
        if (!Intrinsics.d(payload, "count_cell_and_age_selectors")) {
            return;
        }
        LinearLayout touristCountSelectorContainerLL = this.binding.touristCountSelectorContainerLL;
        Intrinsics.checkNotNullExpressionValue(touristCountSelectorContainerLL, "touristCountSelectorContainerLL");
        Iterator it = l.h(C5316f0.b(touristCountSelectorContainerLL), TouristCountSelectorWidgetViewHolder$bind$$inlined$filterIsInstance$1.INSTANCE).iterator();
        int i11 = 0;
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                bindAgeSelectors(item.getAgeSelectors(), item.getAgeCategories(), item.getAgeSelectorPlaceholder());
                DisclaimerContainer touristCountSelectorAnnotation3 = this.binding.touristCountSelectorAnnotation;
                Intrinsics.checkNotNullExpressionValue(touristCountSelectorAnnotation3, "touristCountSelectorAnnotation");
                touristCountSelectorAnnotation3.setVisibility(item.getIsChildrenAgeAnnotationVisible() ? 0 : 8);
                return;
            }
            Object next = aVar.next();
            int i12 = i11 + 1;
            if (i11 >= 0) {
                QuantityCellVO quantityCellVO = item.getCells().get(i11);
                ((QuantityCellView) next).bind(quantityCellVO, new TouristCountSelectorWidgetViewHolder$bind$1$1(this, quantityCellVO), new TouristCountSelectorWidgetViewHolder$bind$1$2(this, quantityCellVO));
                i11 = i12;
            } else {
                C7714v.O0();
                throw null;
            }
        }
    }
}
