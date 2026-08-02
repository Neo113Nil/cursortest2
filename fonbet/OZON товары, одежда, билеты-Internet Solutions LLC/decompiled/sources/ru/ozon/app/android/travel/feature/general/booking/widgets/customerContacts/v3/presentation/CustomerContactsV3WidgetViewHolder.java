package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation;

import Ae.C;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Bm0.b;
import Em0.a;
import Em0.c;
import Vg.d;
import WZ.l;
import WZ.t;
import androidx.lifecycle.K;
import fd.InterfaceC6511n;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3ViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.view.CustomerContactsV3View;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ+\u0010$\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` 2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J#\u0010$\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` H\u0014¢\u0006\u0004\b$\u0010&J\u000f\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010\u001dJ\u000f\u0010(\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010\u001dJ)\u0010-\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0014048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u00109\u001a\u0012\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u001404j\u0002`88\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/view/CustomerContactsV3View;", "containerView", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/view/CustomerContactsV3View;Ll10/i;Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel;LVg/d;LWZ/l;)V", "", "isSelected", "", "trackToggle", "(Z)V", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "item", "LEm0/c;", "getFormatWatcher", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)LEm0/c;", "observeEvents", "()V", "observeActions", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;Ll20/d;)V", "onAttach", "onDetach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/view/CustomerContactsV3View;", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel;", "LVg/d;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomerContactsV3WidgetViewHolder extends k<CustomerContactsV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final CustomerContactsV3View containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CustomerContactsV3ViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3WidgetViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements InterfaceC6511n<Integer, String, CharSequence, Unit> {
        AnonymousClass1(Object obj) {
            super(3, obj, CustomerContactsV3ViewModel.class, "onTextInputChanged", "onTextInputChanged(ILjava/lang/String;Ljava/lang/CharSequence;)V", 0);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, CharSequence charSequence) {
            invoke(num.intValue(), str, charSequence);
            return Unit.f71690a;
        }

        public final void invoke(int i11, String p12, CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(p12, "p1");
            ((CustomerContactsV3ViewModel) this.receiver).onTextInputChanged(i11, p12, charSequence);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "checkboxStatus", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3WidgetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<CheckBoxDTO.CheckboxStatus, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckBoxDTO.CheckboxStatus checkboxStatus) {
            invoke2(checkboxStatus);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CheckBoxDTO.CheckboxStatus checkboxStatus) {
            Intrinsics.checkNotNullParameter(checkboxStatus, "checkboxStatus");
            CustomerContactsV3ViewModel customerContactsV3ViewModel = CustomerContactsV3WidgetViewHolder.this.viewModel;
            CustomerContactsV3VO boundData = CustomerContactsV3WidgetViewHolder.this.getBoundData();
            customerContactsV3ViewModel.onCheckboxStatusChanged(checkboxStatus, boundData != null ? boundData.getCheckboxAction() : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerContactsV3WidgetViewHolder(@NotNull CustomerContactsV3View containerView, @NotNull i container, @NotNull CustomerContactsV3ViewModel viewModel, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.container = container;
        this.viewModel = viewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(container, this).onPreProcess(new CustomerContactsV3WidgetViewHolder$actionHandler$1(this)).customActionHandlers(new CustomerContactsV3WidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.processedActionHandler = new CustomerContactsV3WidgetViewHolder$processedActionHandler$1(this);
        containerView.setInputTextWatcher(new AnonymousClass1(viewModel));
        containerView.setCheckBoxStateChangeListener(new AnonymousClass2());
    }

    private final c getFormatWatcher(CommonInputV2VO.TextInputV2 item) {
        if (item == null || item.getInputType() != 3 || item.getMask() == null) {
            return null;
        }
        b h11 = b.h(item.getMask());
        h11.i();
        h11.j(item.getValue());
        return new a(new Cm0.a(), h11);
    }

    private final void observeActions() {
        C2399j.C(new C(new C2408n0(this.viewModel.getActionFlow(), new CustomerContactsV3WidgetViewHolder$observeActions$1(this, null)), new CustomerContactsV3WidgetViewHolder$observeActions$2(null)), K.a(this));
    }

    private final void observeEvents() {
        C2399j.C(new C(new C2408n0(new C2406m0(this.viewModel.getUiEventFlow()), new CustomerContactsV3WidgetViewHolder$observeEvents$1(this, null)), new CustomerContactsV3WidgetViewHolder$observeEvents$2(null)), K.a(this));
    }

    private final void trackToggle(boolean isSelected) {
        Map<String, TokenizedTrackingInfo> checkboxTrackingInfo;
        CustomerContactsV3VO boundData = getBoundData();
        if (boundData == null || (checkboxTrackingInfo = boundData.getCheckboxTrackingInfo()) == null) {
            return;
        }
        CustomerContactsV3VO boundData2 = getBoundData();
        t mapToTokenizedEvent = TrackingInfoMapperKt.mapToTokenizedEvent(checkboxTrackingInfo, boundData2 != null ? Long.valueOf(boundData2.getId()) : null, isSelected ? ActionType.SET.INSTANCE.getType() : "unset");
        if (mapToTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent, null, 2, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeEvents();
        observeActions();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.containerView.setFormatWatcher(null);
        super.onDetach();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CustomerContactsV3VO item, @NotNull W10.c trackingData, f viewedPond) {
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
    public void bind(@NotNull CustomerContactsV3VO item, @NotNull l20.d info, @NotNull Object payload) {
        CellDTO.LeftBlock leftBlock;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        List list = payload instanceof List ? (List) payload : null;
        if (list == null) {
            return;
        }
        boolean ifInputsNotCashed = this.viewModel.getIfInputsNotCashed();
        for (Object obj : list) {
            if (obj == CustomerContactsV3ViewMapper.Payload.TITLE) {
                this.containerView.bindTitle(item.getTitle());
            } else if (obj == CustomerContactsV3ViewMapper.Payload.PHONE_NUMBER) {
                if (!item.getIsLocalUpdate()) {
                    this.containerView.bindPhoneNumber(this.viewModel.getPhoneNumberWithCashedValue(item.getPhoneNumber(), ifInputsNotCashed));
                }
            } else if (obj == CustomerContactsV3ViewMapper.Payload.EMAIL) {
                if (!item.getIsLocalUpdate()) {
                    this.containerView.bindEmail(this.viewModel.getEmailWithCashedValue(item.getEmail(), ifInputsNotCashed));
                }
            } else if (obj == CustomerContactsV3ViewMapper.Payload.CELL) {
                this.containerView.bindCell(item.getCell());
            } else if (obj == CustomerContactsV3ViewMapper.Payload.BUTTON) {
                this.containerView.bindButton(item.getButton());
            } else {
                CustomerContactsV3ViewMapper.Payload payload2 = CustomerContactsV3ViewMapper.Payload.CELL_INFO;
                if (obj == payload2 || obj == CustomerContactsV3ViewMapper.Payload.CHECKBOX_STATUS) {
                    CellDTO cellInfo = item.getCellInfo();
                    AtomDTO control = (cellInfo == null || (leftBlock = cellInfo.getLeftBlock()) == null) ? null : leftBlock.getControl();
                    CheckBoxDTO checkBoxDTO = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
                    CheckBoxDTO.CheckboxStatus status = checkBoxDTO != null ? checkBoxDTO.getStatus() : null;
                    this.viewModel.bindCheckboxStatus(status);
                    if (obj == payload2) {
                        this.containerView.bindCellInfo(item.getCellInfo());
                    } else {
                        trackToggle(status == CheckBoxDTO.CheckboxStatus.SELECTED);
                        this.containerView.bindCheckboxStatus(status);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CustomerContactsV3VO item, @NotNull l20.d info) {
        CellDTO.LeftBlock leftBlock;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        boolean ifInputsNotCashed = this.viewModel.getIfInputsNotCashed();
        if (ifInputsNotCashed && item.getEmail() != null && item.getPhoneNumber() != null) {
            this.viewModel.bindInputs(item.getPhoneNumber(), item.getEmail());
        }
        CellDTO cellInfo = item.getCellInfo();
        AtomDTO control = (cellInfo == null || (leftBlock = cellInfo.getLeftBlock()) == null) ? null : leftBlock.getControl();
        CheckBoxDTO checkBoxDTO = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
        this.viewModel.bindCheckboxStatus(checkBoxDTO != null ? checkBoxDTO.getStatus() : null);
        this.containerView.bindEmail(this.viewModel.getEmailWithCashedValue(item.getEmail(), ifInputsNotCashed));
        CommonInputV2VO.TextInputV2 phoneNumberWithCashedValue = this.viewModel.getPhoneNumberWithCashedValue(item.getPhoneNumber(), ifInputsNotCashed);
        this.containerView.bindPhoneNumber(phoneNumberWithCashedValue);
        this.containerView.setFormatWatcher(getFormatWatcher(phoneNumberWithCashedValue));
        this.containerView.bind(item, this.actionHandler, this.processedActionHandler);
    }
}
