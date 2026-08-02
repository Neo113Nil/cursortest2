package ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation;

import Vg.d;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetHelpInsuranceBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.HelpInsuranceVO;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.adapters.HelpInsuranceStepAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.adapters.HelpInsuranceStepDecoration;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.adapters.HelpInsuranceTabAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.adapters.HelpInsuranceTabDecoration;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00110%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "", "selectedPos", "firstPos", "lastPos", "", "scrollToCurrentPosition", "(III)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetHelpInsuranceBinding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetHelpInsuranceBinding;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "tabsLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "offset", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/adapters/HelpInsuranceStepAdapter;", "stepAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/adapters/HelpInsuranceStepAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/adapters/HelpInsuranceTabAdapter;", "tabAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/adapters/HelpInsuranceTabAdapter;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HelpInsuranceWidgetViewHolder extends k<HelpInsuranceVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetHelpInsuranceBinding binding;

    @NotNull
    private final View containerView;
    private final int offset;

    @NotNull
    private final HelpInsuranceStepAdapter stepAdapter;

    @NotNull
    private final HelpInsuranceTabAdapter tabAdapter;
    private LinearLayoutManager tabsLayoutManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpInsuranceWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        WidgetHelpInsuranceBinding bind = WidgetHelpInsuranceBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.offset = ResourceExtKt.toPx(8, getContext());
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new HelpInsuranceWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        HelpInsuranceStepAdapter helpInsuranceStepAdapter = new HelpInsuranceStepAdapter(buildHandler);
        this.stepAdapter = helpInsuranceStepAdapter;
        HelpInsuranceTabAdapter helpInsuranceTabAdapter = new HelpInsuranceTabAdapter(new HelpInsuranceWidgetViewHolder$tabAdapter$1(refs, this));
        this.tabAdapter = helpInsuranceTabAdapter;
        bind.insuranceTabsRV.setAdapter(helpInsuranceTabAdapter);
        bind.insuranceTabsRV.addItemDecoration(new HelpInsuranceTabDecoration(getContext()));
        RecyclerView.o layoutManager = bind.insuranceTabsRV.getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        this.tabsLayoutManager = (LinearLayoutManager) layoutManager;
        bind.insuranceInstructionsRV.setAdapter(helpInsuranceStepAdapter);
        bind.insuranceInstructionsRV.addItemDecoration(new HelpInsuranceStepDecoration(getContext()));
        RecyclerView insuranceInstructionsRV = bind.insuranceInstructionsRV;
        Intrinsics.checkNotNullExpressionValue(insuranceInstructionsRV, "insuranceInstructionsRV");
        RecyclerViewExtensionsKt.addParentTouchesInterceptor$default(insuranceInstructionsRV, false, 1, null);
    }

    private final void scrollToCurrentPosition(int selectedPos, int firstPos, int lastPos) {
        LinearLayoutManager linearLayoutManager = this.tabsLayoutManager;
        if (linearLayoutManager == null) {
            Intrinsics.n("tabsLayoutManager");
            throw null;
        }
        if ((selectedPos >= lastPos || selectedPos <= firstPos) && selectedPos > 0) {
            selectedPos--;
        }
        linearLayoutManager.scrollToPositionWithOffset(selectedPos, this.offset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HelpInsuranceVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        HelpInsuranceVO.CaseVO caseVO = item.getCases().get(item.getSelectedCaseInd());
        TextAtomView helpInsuranceTitleTAV = this.binding.helpInsuranceTitleTAV;
        Intrinsics.checkNotNullExpressionValue(helpInsuranceTitleTAV, "helpInsuranceTitleTAV");
        TextAtomHolderKt.bind$default(helpInsuranceTitleTAV, item.getTitle(), null, 2, null);
        LinearLayout warningLayoutLL = this.binding.warningLayoutLL;
        Intrinsics.checkNotNullExpressionValue(warningLayoutLL, "warningLayoutLL");
        warningLayoutLL.setVisibility(caseVO.getWarning() != null ? 0 : 8);
        HelpInsuranceVO.WarningVO warning = caseVO.getWarning();
        if (warning != null) {
            ImageView warningIconIV = this.binding.warningIconIV;
            Intrinsics.checkNotNullExpressionValue(warningIconIV, "warningIconIV");
            ImageViewExtKt.load$default(warningIconIV, warning.getIcon().getImage(), null, null, null, null, false, null, 126, null);
            ImageView warningIconIV2 = this.binding.warningIconIV;
            Intrinsics.checkNotNullExpressionValue(warningIconIV2, "warningIconIV");
            ThemeExtKt.tint(warningIconIV2, warning.getIcon().getTintColor());
            TextAtomView warningTitleTAV = this.binding.warningTitleTAV;
            Intrinsics.checkNotNullExpressionValue(warningTitleTAV, "warningTitleTAV");
            TextAtomHolderKt.bind$default(warningTitleTAV, warning.getTitle(), null, 2, null);
        }
        this.tabAdapter.setItems(item.getTabs());
        this.stepAdapter.setItems(caseVO.getInstructions());
        TextAtomView caseTitleTAV = this.binding.caseTitleTAV;
        Intrinsics.checkNotNullExpressionValue(caseTitleTAV, "caseTitleTAV");
        TextAtomHolderKt.bind$default(caseTitleTAV, caseVO.getTitle(), null, 2, null);
        TextAtomView caseSubtitleTAV = this.binding.caseSubtitleTAV;
        Intrinsics.checkNotNullExpressionValue(caseSubtitleTAV, "caseSubtitleTAV");
        TextAtomHolderKt.bindOrGone$default(caseSubtitleTAV, caseVO.getSubtitle(), null, 2, null);
        LargeButtonView helpInsuranceCloseButtonLBV = this.binding.helpInsuranceCloseButtonLBV;
        Intrinsics.checkNotNullExpressionValue(helpInsuranceCloseButtonLBV, "helpInsuranceCloseButtonLBV");
        LargeButtonHolderKt.bind(helpInsuranceCloseButtonLBV, item.getCloseButton(), this.actionHandler);
        scrollToCurrentPosition(item.getSelectedCaseInd(), item.getFirstSelectedPosition(), item.getLastSelectedPosition());
    }
}
