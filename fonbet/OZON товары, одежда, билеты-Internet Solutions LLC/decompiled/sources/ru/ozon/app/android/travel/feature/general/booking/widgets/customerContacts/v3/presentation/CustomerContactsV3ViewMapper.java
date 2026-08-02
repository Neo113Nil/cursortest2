package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation;

import A00.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.data.storage.utils.TravelPageStorageUtilsKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.data.CustomerContactsV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.di.CustomerContactsV3Component;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.view.CustomerContactsV3View;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0019j\b\u0012\u0004\u0012\u00020\u0003`\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R(\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0(0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/data/CustomerContactsV3DTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/di/CustomerContactsV3Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/di/CustomerContactsV3Component;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "oldItem", "newItem", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewMapper$Payload;", "getCellPayload", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewMapper$Payload;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/data/CustomerContactsV3DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "update", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;", "getPayload", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/di/CustomerContactsV3Component;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Payload", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomerContactsV3ViewMapper extends g<CustomerContactsV3DTO, CustomerContactsV3VO> {

    @NotNull
    private final CustomerContactsV3Component component;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewMapper$Payload;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "PHONE_NUMBER", "EMAIL", "CELL", "BUTTON", "CELL_INFO", "CHECKBOX_STATUS", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Payload {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Payload[] $VALUES;
        public static final Payload TITLE = new Payload(SelectionItemDescriptionDTO.TITLE, 0);
        public static final Payload PHONE_NUMBER = new Payload("PHONE_NUMBER", 1);
        public static final Payload EMAIL = new Payload("EMAIL", 2);
        public static final Payload CELL = new Payload("CELL", 3);
        public static final Payload BUTTON = new Payload("BUTTON", 4);
        public static final Payload CELL_INFO = new Payload("CELL_INFO", 5);
        public static final Payload CHECKBOX_STATUS = new Payload("CHECKBOX_STATUS", 6);

        private static final /* synthetic */ Payload[] $values() {
            return new Payload[]{TITLE, PHONE_NUMBER, EMAIL, CELL, BUTTON, CELL_INFO, CHECKBOX_STATUS};
        }

        static {
            Payload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Payload(String str, int i11) {
        }

        public static Payload valueOf(String str) {
            return (Payload) Enum.valueOf(Payload.class, str);
        }

        public static Payload[] values() {
            return (Payload[]) $VALUES.clone();
        }
    }

    public CustomerContactsV3ViewMapper(@NotNull CustomerContactsV3Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.b0(UpdateCustomerContactsV3PhoneNumber.class, UpdateCustomerContactsV3Email.class, UpdateCustomerContactsV3CheckboxStatus.class);
    }

    private final Payload getCellPayload(CellDTO oldItem, CellDTO newItem) {
        CellDTO.LeftBlock leftBlock;
        CellDTO.LeftBlock leftBlock2;
        if (Intrinsics.d(oldItem, newItem)) {
            return null;
        }
        AtomDTO control = (oldItem == null || (leftBlock2 = oldItem.getLeftBlock()) == null) ? null : leftBlock2.getControl();
        CheckBoxDTO checkBoxDTO = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
        if (checkBoxDTO == null) {
            return Payload.CELL_INFO;
        }
        AtomDTO control2 = (newItem == null || (leftBlock = newItem.getLeftBlock()) == null) ? null : leftBlock.getControl();
        CheckBoxDTO checkBoxDTO2 = control2 instanceof CheckBoxDTO ? (CheckBoxDTO) control2 : null;
        if (checkBoxDTO2 == null) {
            return Payload.CELL_INFO;
        }
        CellDTO.LeftBlock leftBlock3 = oldItem.getLeftBlock();
        CellDTO copy$default = CellDTO.copy$default(oldItem, null, null, leftBlock3 != null ? CellDTO.LeftBlock.copy$default(leftBlock3, null, null, null, null, null, null, null, CheckBoxDTO.copy$default(checkBoxDTO, null, CheckBoxDTO.CheckboxStatus.INDETERMINATE, null, null, null, null, null, null, null, null, 1021, null), 127, null) : null, null, null, 27, null);
        CellDTO.LeftBlock leftBlock4 = newItem.getLeftBlock();
        return Intrinsics.d(copy$default, CellDTO.copy$default(newItem, null, null, leftBlock4 != null ? CellDTO.LeftBlock.copy$default(leftBlock4, null, null, null, null, null, null, null, CheckBoxDTO.copy$default(checkBoxDTO2, null, CheckBoxDTO.CheckboxStatus.INDETERMINATE, null, null, null, null, null, null, null, null, 1021, null), 127, null) : null, null, null, 27, null)) ? Payload.CHECKBOX_STATUS : Payload.CELL_INFO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<CustomerContactsV3VO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        final TravelPageKeyValueStorage pageStorage = TravelPageStorageUtilsKt.getTravelPageStorageHolder(container).getPageStorage();
        return new CustomerContactsV3WidgetViewHolder((CustomerContactsV3View) view, container, (CustomerContactsV3ViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3ViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                CustomerContactsV3Component customerContactsV3Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                customerContactsV3Component = CustomerContactsV3ViewMapper.this.component;
                CustomerContactsV3ViewModel viewModel = customerContactsV3Component.getViewModel(pageStorage);
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(CustomerContactsV3ViewModel.class), this.component.getActionHandlersStoreFactory(), this.component.getTokenizedAnalytics());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CustomerContactsV3View customerContactsV3View = new CustomerContactsV3View(context);
        customerContactsV3View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return customerContactsV3View;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<Payload> getPayload(@NotNull CustomerContactsV3VO oldItem, @NotNull CustomerContactsV3VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            arrayList.add(Payload.TITLE);
        }
        if (!Intrinsics.d(oldItem.getPhoneNumber(), newItem.getPhoneNumber())) {
            arrayList.add(Payload.PHONE_NUMBER);
        }
        if (!Intrinsics.d(oldItem.getEmail(), newItem.getEmail())) {
            arrayList.add(Payload.EMAIL);
        }
        if (!Intrinsics.d(oldItem.getCell(), newItem.getCell())) {
            arrayList.add(Payload.CELL);
        }
        if (!Intrinsics.d(oldItem.getButton(), newItem.getButton())) {
            arrayList.add(Payload.BUTTON);
        }
        Payload cellPayload = getCellPayload(oldItem.getCellInfo(), newItem.getCellInfo());
        if (cellPayload != null) {
            arrayList.add(cellPayload);
        }
        return arrayList;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    public CustomerContactsV3VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CustomerContactsV3VO oldItem) {
        CellDTO.LeftBlock leftBlock;
        CellDTO.LeftBlock leftBlock2;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof UpdateCustomerContactsV3PhoneNumber) {
            return CustomerContactsV3VO.copy$default(oldItem, 0L, null, ((UpdateCustomerContactsV3PhoneNumber) update).getPhoneNumber(), null, null, null, null, null, null, null, true, 1019, null);
        }
        if (update instanceof UpdateCustomerContactsV3Email) {
            return CustomerContactsV3VO.copy$default(oldItem, 0L, null, null, ((UpdateCustomerContactsV3Email) update).getEmail(), null, null, null, null, null, null, true, 1015, null);
        }
        if (!(update instanceof UpdateCustomerContactsV3CheckboxStatus)) {
            return null;
        }
        CellDTO cellInfo = oldItem.getCellInfo();
        AtomDTO control = (cellInfo == null || (leftBlock2 = cellInfo.getLeftBlock()) == null) ? null : leftBlock2.getControl();
        CheckBoxDTO checkBoxDTO = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
        CheckBoxDTO copy$default = checkBoxDTO != null ? CheckBoxDTO.copy$default(checkBoxDTO, null, ((UpdateCustomerContactsV3CheckboxStatus) update).getCheckboxStatus(), null, null, null, null, null, null, null, null, 1021, null) : null;
        CellDTO cellInfo2 = oldItem.getCellInfo();
        CellDTO.LeftBlock copy$default2 = (cellInfo2 == null || (leftBlock = cellInfo2.getLeftBlock()) == null) ? null : CellDTO.LeftBlock.copy$default(leftBlock, null, null, null, null, null, null, null, copy$default, 127, null);
        CellDTO cellInfo3 = oldItem.getCellInfo();
        return CustomerContactsV3VO.copy$default(oldItem, 0L, null, null, null, null, cellInfo3 != null ? CellDTO.copy$default(cellInfo3, null, null, copy$default2, null, null, 27, null) : null, null, null, null, null, false, 2015, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CustomerContactsV3VO> map(@NotNull CustomerContactsV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
