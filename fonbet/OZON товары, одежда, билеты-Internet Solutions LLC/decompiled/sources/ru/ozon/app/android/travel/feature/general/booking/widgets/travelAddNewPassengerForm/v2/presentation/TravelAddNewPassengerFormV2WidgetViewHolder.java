package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.booking.databinding.WidgetTravelAddNewPassengerFormV2Binding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.TravelAddNewPassengerFormV2VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.bonusCard.BonusCardsDecoration;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.bonusCard.BonusCardsListAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.input.InputsDecoration;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.input.InputsListAdapter;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u0014J#\u0010\"\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` H\u0014¢\u0006\u0004\b\"\u0010#J3\u0010*\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%2\u000e\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010-R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0012028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R$\u00107\u001a\u0012\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001202j\u0002`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel;LWZ/l;)V", "", "observeAction", "()V", "Landroid/view/ViewGroup;", "root", "clearFocus", "(Landroid/view/ViewGroup;)V", "", "newTopMargin", "updateInputsTopMarginIfNecessary", "(I)V", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetTravelAddNewPassengerFormV2Binding;", "binding", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetTravelAddNewPassengerFormV2Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/adapter/input/InputsListAdapter;", "inputsListAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/adapter/input/InputsListAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/adapter/bonusCard/BonusCardsListAdapter;", "bonusCardsAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/adapter/bonusCard/BonusCardsListAdapter;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormV2WidgetViewHolder extends k<TravelAddNewPassengerFormV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTravelAddNewPassengerFormV2Binding binding;

    @NotNull
    private final BonusCardsListAdapter bonusCardsAdapter;

    @NotNull
    private final InputsListAdapter inputsListAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TravelAddNewPassengerFormV2ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelAddNewPassengerFormV2WidgetViewHolder(@NotNull View containerView, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences references, @NotNull TravelAddNewPassengerFormV2ViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetTravelAddNewPassengerFormV2Binding bind = WidgetTravelAddNewPassengerFormV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).onPreProcess(new TravelAddNewPassengerFormV2WidgetViewHolder$actionHandler$1(this, containerView)).customActionHandlers(new TravelAddNewPassengerFormV2WidgetViewHolder$actionHandler$2(customActionHandlersStoreFactory)).buildHandler();
        TravelAddNewPassengerFormV2WidgetViewHolder$processedActionHandler$1 travelAddNewPassengerFormV2WidgetViewHolder$processedActionHandler$1 = new TravelAddNewPassengerFormV2WidgetViewHolder$processedActionHandler$1(this);
        this.processedActionHandler = travelAddNewPassengerFormV2WidgetViewHolder$processedActionHandler$1;
        InputsListAdapter inputsListAdapter = new InputsListAdapter(new TravelAddNewPassengerFormV2WidgetViewHolder$inputsListAdapter$1(viewModel), new TravelAddNewPassengerFormV2WidgetViewHolder$inputsListAdapter$2(viewModel), new TravelAddNewPassengerFormV2WidgetViewHolder$inputsListAdapter$3(viewModel), new TravelAddNewPassengerFormV2WidgetViewHolder$inputsListAdapter$4(viewModel));
        this.inputsListAdapter = inputsListAdapter;
        BonusCardsListAdapter bonusCardsListAdapter = new BonusCardsListAdapter(travelAddNewPassengerFormV2WidgetViewHolder$processedActionHandler$1);
        this.bonusCardsAdapter = bonusCardsListAdapter;
        RecyclerView recyclerView = bind.inputsRv;
        recyclerView.setAdapter(inputsListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new InputsDecoration(context));
        RecyclerView recyclerView2 = bind.bonusCardsRv;
        recyclerView2.setAdapter(bonusCardsListAdapter);
        recyclerView2.setLayoutManager(new FlexboxLayoutManager(recyclerView2.getContext()));
        Context context2 = recyclerView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView2.addItemDecoration(new BonusCardsDecoration(context2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearFocus(ViewGroup root) {
        View findFocus = root.findFocus();
        if (findFocus == null) {
            return;
        }
        findFocus.clearFocus();
        if (findFocus instanceof EditText) {
            KeyboardUtilsKt.hideKeyboard(findFocus);
        }
    }

    private final void observeAction() {
        this.viewModel.getActionLiveData().observe(this, new TravelAddNewPassengerFormV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelAddNewPassengerFormV2WidgetViewHolder$observeAction$1(this)));
    }

    private final void updateInputsTopMarginIfNecessary(int newTopMargin) {
        RecyclerView inputsRv = this.binding.inputsRv;
        Intrinsics.checkNotNullExpressionValue(inputsRv, "inputsRv");
        ViewGroup.LayoutParams layoutParams = inputsRv.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != newTopMargin) {
            RecyclerView inputsRv2 = this.binding.inputsRv;
            Intrinsics.checkNotNullExpressionValue(inputsRv2, "inputsRv");
            ViewGroup.LayoutParams layoutParams2 = inputsRv2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.topMargin = newTopMargin;
            inputsRv2.setLayoutParams(layoutParams3);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeAction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelAddNewPassengerFormV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getIsInputChangedByClient()) {
            return;
        }
        this.viewModel.bindInputs(item.getInputs(), item.getIsClearButtonVisible());
        TextAtomView addNewPassengerFormV2TitleTextView = this.binding.addNewPassengerFormV2TitleTextView;
        Intrinsics.checkNotNullExpressionValue(addNewPassengerFormV2TitleTextView, "addNewPassengerFormV2TitleTextView");
        TextAtomHolderKt.bindOrGone$default(addNewPassengerFormV2TitleTextView, item.getTitle(), null, 2, null);
        TextAtomView addNewPassengerFormV2SubtitleTextView = this.binding.addNewPassengerFormV2SubtitleTextView;
        Intrinsics.checkNotNullExpressionValue(addNewPassengerFormV2SubtitleTextView, "addNewPassengerFormV2SubtitleTextView");
        TextAtomHolderKt.bindOrGone$default(addNewPassengerFormV2SubtitleTextView, item.getSubtitle(), null, 2, null);
        CellView useBankDetailsCV = this.binding.useBankDetailsCV;
        Intrinsics.checkNotNullExpressionValue(useBankDetailsCV, "useBankDetailsCV");
        CellHolderKt.bindOrGone(useBankDetailsCV, item.getUseBankDetails(), this.actionHandler);
        updateInputsTopMarginIfNecessary(item.getInputsTopMargin());
        LinearLayout bonusCardsContainerLl = this.binding.bonusCardsContainerLl;
        Intrinsics.checkNotNullExpressionValue(bonusCardsContainerLl, "bonusCardsContainerLl");
        bonusCardsContainerLl.setVisibility(item.getIsBonusCardsVisible() ? 0 : 8);
        TravelAddNewPassengerFormV2VO.BonusCards bonusCards = item.getBonusCards();
        if (bonusCards != null) {
            ImageView bonusCardsIv = this.binding.bonusCardsIv;
            Intrinsics.checkNotNullExpressionValue(bonusCardsIv, "bonusCardsIv");
            ImageViewExtKt.load$default(bonusCardsIv, bonusCards.getIcon().getImage(), null, null, null, null, false, null, 126, null);
            Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), bonusCards.getIcon().getTintColor());
            if (parseColor != null) {
                ImageView bonusCardsIv2 = this.binding.bonusCardsIv;
                Intrinsics.checkNotNullExpressionValue(bonusCardsIv2, "bonusCardsIv");
                ThemeExtKt.tint(bonusCardsIv2, parseColor);
            }
            this.bonusCardsAdapter.setItems(bonusCards.getList());
        }
        LargeButtonView addBonusCardLbv = this.binding.addBonusCardLbv;
        Intrinsics.checkNotNullExpressionValue(addBonusCardLbv, "addBonusCardLbv");
        LargeButtonHolderKt.bindOrGone(addBonusCardLbv, item.getAddBonusCardButton(), this.processedActionHandler);
        LargeButtonView saveLbv = this.binding.saveLbv;
        Intrinsics.checkNotNullExpressionValue(saveLbv, "saveLbv");
        LargeButtonHolderKt.bind(saveLbv, item.getSaveButton(), this.processedActionHandler);
        TextAtomView addNewPassengerFormV2AgreementTextView = this.binding.addNewPassengerFormV2AgreementTextView;
        Intrinsics.checkNotNullExpressionValue(addNewPassengerFormV2AgreementTextView, "addNewPassengerFormV2AgreementTextView");
        TextAtomHolderKt.bindOrGone(addNewPassengerFormV2AgreementTextView, item.getAgreementText(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelAddNewPassengerFormV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TravelAddNewPassengerFormV2WidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
