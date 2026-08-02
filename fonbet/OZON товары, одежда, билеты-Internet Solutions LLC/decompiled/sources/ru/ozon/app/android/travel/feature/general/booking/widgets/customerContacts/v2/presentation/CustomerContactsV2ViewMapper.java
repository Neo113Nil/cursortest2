package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation;

import A00.a;
import Xc.a;
import Xc.b;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.booking.R$layout;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.data.CustomerContactsV2DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.di.CustomerContactsV2Component;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0017j\b\u0012\u0004\u0012\u00020\u0002`\u00182\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010$\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020)0(0\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R0\u00101\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060.j\u0002`/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010'¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/di/CustomerContactsV2Component;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/data/CustomerContactsV2DTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;", "<init>", "()V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "oldItem", "newItem", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewMapper$Payload;", "getCellPayload", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewMapper$Payload;", "LA00/a$J$a;", "update", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;", "", "getPayload", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "Payload", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomerContactsV2ViewMapper extends WidgetViewMapper2<CustomerContactsV2Component, CustomerContactsV2DTO, CustomerContactsV2VO> {
    private final int layout = R$layout.widget_customer_contacts_v2;

    @NotNull
    private final Function2<View, ComposerReferences, CustomerContactsV2WidgetViewHolder> holderProducer = new CustomerContactsV2ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<Object>> supportedUpdates = C7714v.b0(CustomerContactsUpdate$Inputs.class, CustomerContactsUpdate$Checkbox.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewMapper$Payload;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "SUBTITLE", "INPUTS", "CELL_INFO", "CHECKBOX_STATUS", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Payload {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Payload[] $VALUES;
        public static final Payload TITLE = new Payload(SelectionItemDescriptionDTO.TITLE, 0);
        public static final Payload SUBTITLE = new Payload("SUBTITLE", 1);
        public static final Payload INPUTS = new Payload("INPUTS", 2);
        public static final Payload CELL_INFO = new Payload("CELL_INFO", 3);
        public static final Payload CHECKBOX_STATUS = new Payload("CHECKBOX_STATUS", 4);

        private static final /* synthetic */ Payload[] $values() {
            return new Payload[]{TITLE, SUBTITLE, INPUTS, CELL_INFO, CHECKBOX_STATUS};
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

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, CustomerContactsV2WidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CustomerContactsV2DTO, d, List<CustomerContactsV2VO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<Object>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CustomerContactsV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CustomerContactsV2Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<Payload> getPayload(@NotNull CustomerContactsV2VO oldItem, @NotNull CustomerContactsV2VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            arrayList.add(Payload.TITLE);
        }
        if (!Intrinsics.d(oldItem.getSubtitle(), newItem.getSubtitle())) {
            arrayList.add(Payload.SUBTITLE);
        }
        if (!CollectionExtKt.deepEquals(oldItem.getInputs(), newItem.getInputs())) {
            arrayList.add(Payload.INPUTS);
        }
        Payload cellPayload = getCellPayload(oldItem.getCellInfo(), newItem.getCellInfo());
        if (cellPayload != null) {
            arrayList.add(cellPayload);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public CustomerContactsV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CustomerContactsV2VO oldItem) {
        CellDTO.LeftBlock leftBlock;
        CellDTO.LeftBlock leftBlock2;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof CustomerContactsUpdate$Inputs) {
            ArrayList W02 = C7714v.W0(oldItem.getInputs());
            CustomerContactsUpdate$Inputs customerContactsUpdate$Inputs = (CustomerContactsUpdate$Inputs) update;
            W02.set(customerContactsUpdate$Inputs.getInputPosition(), customerContactsUpdate$Inputs.getInputText());
            return CustomerContactsV2VO.copy$default(oldItem, 0L, null, null, null, W02, null, null, null, null, 495, null);
        }
        if (!(update instanceof CustomerContactsUpdate$Checkbox)) {
            return null;
        }
        CellDTO cellInfo = oldItem.getCellInfo();
        AtomDTO control = (cellInfo == null || (leftBlock2 = cellInfo.getLeftBlock()) == null) ? null : leftBlock2.getControl();
        CheckBoxDTO checkBoxDTO = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
        CheckBoxDTO copy$default = checkBoxDTO != null ? CheckBoxDTO.copy$default(checkBoxDTO, null, ((CustomerContactsUpdate$Checkbox) update).getStatus(), null, null, null, null, null, null, null, null, 1021, null) : null;
        CellDTO cellInfo2 = oldItem.getCellInfo();
        CellDTO.LeftBlock copy$default2 = (cellInfo2 == null || (leftBlock = cellInfo2.getLeftBlock()) == null) ? null : CellDTO.LeftBlock.copy$default(leftBlock, null, null, null, null, null, null, null, copy$default, 127, null);
        CellDTO cellInfo3 = oldItem.getCellInfo();
        return CustomerContactsV2VO.copy$default(oldItem, 0L, null, null, null, null, cellInfo3 != null ? CellDTO.copy$default(cellInfo3, null, null, copy$default2, null, null, 27, null) : null, null, null, null, 479, null);
    }
}
