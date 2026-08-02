package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation;

import Bm0.b;
import Em0.a;
import Em0.c;
import Vg.d;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6511n;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.booking.databinding.WidgetCustomerContactsV2Binding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation.CustomerContactsV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation.decoration.InputsDecoration;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.listAdapter.InputsListAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ+\u0010$\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` 2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J#\u0010$\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` H\u0014¢\u0006\u0004\b$\u0010&J\u000f\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010\u001dJ)\u0010,\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0014058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010:\u001a\u0012\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001405j\u0002`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LWZ/l;)V", "", "isSelected", "", "trackToggle", "(Z)V", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "item", "LEm0/c;", "setFormatWatcher", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;)LEm0/c;", "observeActions", "()V", "observeUiEvents", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;Ll20/d;)V", "onAttach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/d;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetCustomerContactsV2Binding;", "binding", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetCustomerContactsV2Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/presentation/listAdapter/InputsListAdapter;", "inputsListAdapter", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/presentation/listAdapter/InputsListAdapter;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomerContactsV2WidgetViewHolder extends k<CustomerContactsV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCustomerContactsV2Binding binding;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final InputsListAdapter inputsListAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CustomerContactsV2ViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<unused var>", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "checkboxStatus", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation.CustomerContactsV2WidgetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements InterfaceC6511n<CheckBoxView, CheckBoxDTO.CheckboxStatus, Boolean, Unit> {
        AnonymousClass2() {
            super(3);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(CheckBoxView checkBoxView, CheckBoxDTO.CheckboxStatus checkboxStatus, Boolean bool) {
            invoke(checkBoxView, checkboxStatus, bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(CheckBoxView checkBoxView, CheckBoxDTO.CheckboxStatus checkboxStatus, boolean z11) {
            Intrinsics.checkNotNullParameter(checkBoxView, "<unused var>");
            Intrinsics.checkNotNullParameter(checkboxStatus, "checkboxStatus");
            CustomerContactsV2ViewModel customerContactsV2ViewModel = CustomerContactsV2WidgetViewHolder.this.viewModel;
            CustomerContactsV2VO boundData = CustomerContactsV2WidgetViewHolder.this.getBoundData();
            customerContactsV2ViewModel.onCheckboxStatusChanged(checkboxStatus, boundData != null ? boundData.getCheckboxAction() : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerContactsV2WidgetViewHolder(@NotNull View containerView, @NotNull CustomerContactsV2ViewModel viewModel, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.viewModel = viewModel;
        this.references = references;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetCustomerContactsV2Binding bind = WidgetCustomerContactsV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new CustomerContactsV2WidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.processedActionHandler = new CustomerContactsV2WidgetViewHolder$processedActionHandler$1(this);
        InputsListAdapter inputsListAdapter = new InputsListAdapter(this, null, new CustomerContactsV2WidgetViewHolder$inputsListAdapter$1(viewModel), new CustomerContactsV2WidgetViewHolder$inputsListAdapter$2(this), null, null, null, tokenizedAnalytics, 114, null);
        this.inputsListAdapter = inputsListAdapter;
        RecyclerView recyclerView = bind.contactsFormInputsRv;
        recyclerView.setAdapter(inputsListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new InputsDecoration(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setRecycledViewPool(references.getComposerViewPoolProvider().getViewPool());
        bind.contactsFormCellInfo.getLeftBlock().getCheckBoxView().setOnStateChangeListener(new AnonymousClass2());
    }

    private final void observeActions() {
        this.viewModel.actionLiveData().observe(this, new CustomerContactsV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new CustomerContactsV2WidgetViewHolder$observeActions$1(this)));
    }

    private final void observeUiEvents() {
        this.viewModel.uiEventLiveData().observe(this, new CustomerContactsV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new CustomerContactsV2WidgetViewHolder$observeUiEvents$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c setFormatWatcher(CommonInputVO.TextCommonInputVO item) {
        if (item.getInputType() != 3 || item.getMask() == null) {
            return null;
        }
        b h11 = b.h(item.getMask());
        h11.i();
        h11.j(item.getValue());
        return new a(new Cm0.a(), h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackToggle(boolean isSelected) {
        Map<String, TokenizedTrackingInfo> checkboxTrackingInfo;
        CustomerContactsV2VO boundData = getBoundData();
        if (boundData == null || (checkboxTrackingInfo = boundData.getCheckboxTrackingInfo()) == null) {
            return;
        }
        CustomerContactsV2VO boundData2 = getBoundData();
        t mapToTokenizedEvent = TrackingInfoMapperKt.mapToTokenizedEvent(checkboxTrackingInfo, boundData2 != null ? Long.valueOf(boundData2.getId()) : null, isSelected ? ActionType.SET.INSTANCE.getType() : "unset");
        if (mapToTokenizedEvent != null) {
            m.a(this.tokenizedAnalytics, mapToTokenizedEvent, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeActions();
        observeUiEvents();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CustomerContactsV2VO item, @NotNull W10.c trackingData, f viewedPond) {
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
        Map<String, TokenizedTrackingInfo> checkboxTrackingInfo = item.getCheckboxTrackingInfo();
        if (checkboxTrackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(checkboxTrackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CustomerContactsV2VO item, @NotNull l20.d info, @NotNull Object payload) {
        CellDTO.LeftBlock leftBlock;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        List list = payload instanceof List ? (List) payload : null;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == CustomerContactsV2ViewMapper.Payload.TITLE) {
                TextAtomView contactsFormTitleTav = this.binding.contactsFormTitleTav;
                Intrinsics.checkNotNullExpressionValue(contactsFormTitleTav, "contactsFormTitleTav");
                TextAtomHolderKt.bindOrGone$default(contactsFormTitleTav, item.getTitle(), null, 2, null);
            } else if (next == CustomerContactsV2ViewMapper.Payload.SUBTITLE) {
                TextAtomView contactsFormSubtitleTav = this.binding.contactsFormSubtitleTav;
                Intrinsics.checkNotNullExpressionValue(contactsFormSubtitleTav, "contactsFormSubtitleTav");
                TextAtomHolderKt.bindOrGone$default(contactsFormSubtitleTav, item.getSubtitle(), null, 2, null);
            } else if (next == CustomerContactsV2ViewMapper.Payload.INPUTS) {
                this.viewModel.bindInputs(item.getInputs());
            } else {
                CustomerContactsV2ViewMapper.Payload payload2 = CustomerContactsV2ViewMapper.Payload.CELL_INFO;
                if (next == payload2 || next == CustomerContactsV2ViewMapper.Payload.CHECKBOX_STATUS) {
                    CellDTO cellInfo = item.getCellInfo();
                    AtomDTO control = (cellInfo == null || (leftBlock = cellInfo.getLeftBlock()) == null) ? null : leftBlock.getControl();
                    CheckBoxDTO checkBoxDTO = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
                    this.viewModel.bindCheckboxStatus(checkBoxDTO != null ? checkBoxDTO.getStatus() : null, next == CustomerContactsV2ViewMapper.Payload.CHECKBOX_STATUS);
                    if (next == payload2) {
                        CellView contactsFormCellInfo = this.binding.contactsFormCellInfo;
                        Intrinsics.checkNotNullExpressionValue(contactsFormCellInfo, "contactsFormCellInfo");
                        CellHolderKt.bindOrGone$default(contactsFormCellInfo, item.getCellInfo(), null, 2, null);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CustomerContactsV2VO item, @NotNull l20.d info) {
        CellDTO.LeftBlock leftBlock;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CellDTO cellInfo = item.getCellInfo();
        AtomDTO control = (cellInfo == null || (leftBlock = cellInfo.getLeftBlock()) == null) ? null : leftBlock.getControl();
        CheckBoxDTO checkBoxDTO = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
        CheckBoxDTO.CheckboxStatus status = checkBoxDTO != null ? checkBoxDTO.getStatus() : null;
        this.viewModel.bindInputs(item.getInputs());
        this.viewModel.bindCheckboxStatus(status, false);
        TextAtomView contactsFormTitleTav = this.binding.contactsFormTitleTav;
        Intrinsics.checkNotNullExpressionValue(contactsFormTitleTav, "contactsFormTitleTav");
        TextAtomHolderKt.bindOrGone$default(contactsFormTitleTav, item.getTitle(), null, 2, null);
        TextAtomView contactsFormSubtitleTav = this.binding.contactsFormSubtitleTav;
        Intrinsics.checkNotNullExpressionValue(contactsFormSubtitleTav, "contactsFormSubtitleTav");
        TextAtomHolderKt.bindOrGone$default(contactsFormSubtitleTav, item.getSubtitle(), null, 2, null);
        CellView contactsFormCellInfo = this.binding.contactsFormCellInfo;
        Intrinsics.checkNotNullExpressionValue(contactsFormCellInfo, "contactsFormCellInfo");
        CellHolderKt.bindOrGone$default(contactsFormCellInfo, item.getCellInfo(), null, 2, null);
    }
}
