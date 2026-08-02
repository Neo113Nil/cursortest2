package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation;

import B0.C2454a;
import Kk.c;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import ed.InterfaceC6346b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.shared.CustomerContactsCheckboxStatusKeyProvider;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002<=B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J'\u0010)\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020+2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u0010028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0013048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00105R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010;¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/shared/CustomerContactsCheckboxStatusKeyProvider;", "checkboxStatusKeyProvider", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/shared/CustomerContactsCheckboxStatusKeyProvider;)V", "", "", "prepareInputsParams", "()Ljava/util/Map;", "prepareCheckboxParams", "", "fillInputsToStorage", "()V", "fillCheckboxStatusToStorage", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action;", "actionLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$UiEvent;", "uiEventLiveData", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "storage", "setUpStorage", "(Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;)V", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "inputs", "bindInputs", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "checkboxStatus", "", "needUiUpdate", "bindCheckboxStatus", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;Z)V", "", "inputId", "oldValue", "", "newValue", "onTextInputChanged", "(JLjava/lang/String;Ljava/lang/CharSequence;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "onCheckboxStatusChanged", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;Lru/ozon/uni/atoms/af/AtomAction;)V", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/shared/CustomerContactsCheckboxStatusKeyProvider;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "", "cachedInputs", "Ljava/util/List;", "cachedCheckboxStatus", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "Action", "UiEvent", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomerContactsV2ViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;
    private CheckBoxDTO.CheckboxStatus cachedCheckboxStatus;
    private List<CommonInputVO.TextCommonInputVO> cachedInputs;

    @NotNull
    private final CustomerContactsCheckboxStatusKeyProvider checkboxStatusKeyProvider;
    private TravelPageKeyValueStorage storage;

    @NotNull
    private final V<UiEvent> uiEventLiveData;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action;", "", "HandleAction", "NotifyInputChanged", "NotifyCheckboxChanged", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action$HandleAction;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action$NotifyCheckboxChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action$NotifyInputChanged;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action$HandleAction;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "constructor-impl", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "", "toString-impl", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/af/AtomAction;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HandleAction implements Action {

            @NotNull
            private final AtomAction atomAction;

            private /* synthetic */ HandleAction(AtomAction atomAction) {
                this.atomAction = atomAction;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ HandleAction m1113boximpl(AtomAction atomAction) {
                return new HandleAction(atomAction);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static AtomAction m1114constructorimpl(@NotNull AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(atomAction, "atomAction");
                return atomAction;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1115equalsimpl(AtomAction atomAction, Object obj) {
                return (obj instanceof HandleAction) && Intrinsics.d(atomAction, ((HandleAction) obj).getAtomAction());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1116hashCodeimpl(AtomAction atomAction) {
                return atomAction.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1117toStringimpl(AtomAction atomAction) {
                return c.e("HandleAction(atomAction=", ")", atomAction);
            }

            public boolean equals(Object obj) {
                return m1115equalsimpl(this.atomAction, obj);
            }

            public int hashCode() {
                return m1116hashCodeimpl(this.atomAction);
            }

            public String toString() {
                return m1117toStringimpl(this.atomAction);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ AtomAction getAtomAction() {
                return this.atomAction;
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action$NotifyCheckboxChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "checkboxStatus", "constructor-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "", "toString-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "getCheckboxStatus", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NotifyCheckboxChanged implements Action {

            @NotNull
            private final CheckBoxDTO.CheckboxStatus checkboxStatus;

            private /* synthetic */ NotifyCheckboxChanged(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                this.checkboxStatus = checkboxStatus;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ NotifyCheckboxChanged m1119boximpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                return new NotifyCheckboxChanged(checkboxStatus);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static CheckBoxDTO.CheckboxStatus m1120constructorimpl(@NotNull CheckBoxDTO.CheckboxStatus checkboxStatus) {
                Intrinsics.checkNotNullParameter(checkboxStatus, "checkboxStatus");
                return checkboxStatus;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1121equalsimpl(CheckBoxDTO.CheckboxStatus checkboxStatus, Object obj) {
                return (obj instanceof NotifyCheckboxChanged) && checkboxStatus == ((NotifyCheckboxChanged) obj).getCheckboxStatus();
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1122hashCodeimpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                return checkboxStatus.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1123toStringimpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                return "NotifyCheckboxChanged(checkboxStatus=" + checkboxStatus + ")";
            }

            public boolean equals(Object obj) {
                return m1121equalsimpl(this.checkboxStatus, obj);
            }

            public int hashCode() {
                return m1122hashCodeimpl(this.checkboxStatus);
            }

            public String toString() {
                return m1123toStringimpl(this.checkboxStatus);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ CheckBoxDTO.CheckboxStatus getCheckboxStatus() {
                return this.checkboxStatus;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action$NotifyInputChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action;", "", "inputPosition", "Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;", "payload", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "input", "<init>", "(ILru/ozon/app/android/travel/molecules/input/v1/InputPayload;Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getInputPosition", "Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;", "getPayload", "()Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NotifyInputChanged implements Action {

            @NotNull
            private final CommonInputVO.TextCommonInputVO input;
            private final int inputPosition;
            private final InputPayload payload;

            public NotifyInputChanged(int i11, InputPayload inputPayload, @NotNull CommonInputVO.TextCommonInputVO input) {
                Intrinsics.checkNotNullParameter(input, "input");
                this.inputPosition = i11;
                this.payload = inputPayload;
                this.input = input;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotifyInputChanged)) {
                    return false;
                }
                NotifyInputChanged notifyInputChanged = (NotifyInputChanged) other;
                return this.inputPosition == notifyInputChanged.inputPosition && this.payload == notifyInputChanged.payload && Intrinsics.d(this.input, notifyInputChanged.input);
            }

            @NotNull
            public final CommonInputVO.TextCommonInputVO getInput() {
                return this.input;
            }

            public final int getInputPosition() {
                return this.inputPosition;
            }

            public final InputPayload getPayload() {
                return this.payload;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.inputPosition) * 31;
                InputPayload inputPayload = this.payload;
                return this.input.hashCode() + ((hashCode + (inputPayload == null ? 0 : inputPayload.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                return "NotifyInputChanged(inputPosition=" + this.inputPosition + ", payload=" + this.payload + ", input=" + this.input + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$UiEvent;", "", "SubmitInputs", "SetCheckboxStatus", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$UiEvent$SetCheckboxStatus;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$UiEvent$SubmitInputs;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface UiEvent {

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$UiEvent$SetCheckboxStatus;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$UiEvent;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "checkboxStatus", "constructor-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "", "toString-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "getCheckboxStatus", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SetCheckboxStatus implements UiEvent {
            private final CheckBoxDTO.CheckboxStatus checkboxStatus;

            private /* synthetic */ SetCheckboxStatus(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                this.checkboxStatus = checkboxStatus;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ SetCheckboxStatus m1125boximpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                return new SetCheckboxStatus(checkboxStatus);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static CheckBoxDTO.CheckboxStatus m1126constructorimpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                return checkboxStatus;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1127equalsimpl(CheckBoxDTO.CheckboxStatus checkboxStatus, Object obj) {
                return (obj instanceof SetCheckboxStatus) && checkboxStatus == ((SetCheckboxStatus) obj).getCheckboxStatus();
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1128hashCodeimpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                if (checkboxStatus == null) {
                    return 0;
                }
                return checkboxStatus.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1129toStringimpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                return "SetCheckboxStatus(checkboxStatus=" + checkboxStatus + ")";
            }

            public boolean equals(Object obj) {
                return m1127equalsimpl(this.checkboxStatus, obj);
            }

            public int hashCode() {
                return m1128hashCodeimpl(this.checkboxStatus);
            }

            public String toString() {
                return m1129toStringimpl(this.checkboxStatus);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ CheckBoxDTO.CheckboxStatus getCheckboxStatus() {
                return this.checkboxStatus;
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0004\u0092\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$UiEvent$SubmitInputs;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$UiEvent;", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "inputs", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/util/List;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "equals", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SubmitInputs implements UiEvent {

            @NotNull
            private final List<CommonInputVO.TextCommonInputVO> inputs;

            private /* synthetic */ SubmitInputs(List list) {
                this.inputs = list;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ SubmitInputs m1131boximpl(List list) {
                return new SubmitInputs(list);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends CommonInputVO.TextCommonInputVO> m1132constructorimpl(@NotNull List<CommonInputVO.TextCommonInputVO> inputs) {
                Intrinsics.checkNotNullParameter(inputs, "inputs");
                return inputs;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1133equalsimpl(List<? extends CommonInputVO.TextCommonInputVO> list, Object obj) {
                return (obj instanceof SubmitInputs) && Intrinsics.d(list, ((SubmitInputs) obj).getInputs());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1134hashCodeimpl(List<? extends CommonInputVO.TextCommonInputVO> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1135toStringimpl(List<? extends CommonInputVO.TextCommonInputVO> list) {
                return H3.c.a("SubmitInputs(inputs=", ")", list);
            }

            public boolean equals(Object obj) {
                return m1133equalsimpl(this.inputs, obj);
            }

            public int hashCode() {
                return m1134hashCodeimpl(this.inputs);
            }

            public String toString() {
                return m1135toStringimpl(this.inputs);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getInputs() {
                return this.inputs;
            }
        }
    }

    public CustomerContactsV2ViewModel(@NotNull CustomerContactsCheckboxStatusKeyProvider checkboxStatusKeyProvider) {
        Intrinsics.checkNotNullParameter(checkboxStatusKeyProvider, "checkboxStatusKeyProvider");
        this.checkboxStatusKeyProvider = checkboxStatusKeyProvider;
        this.actionLiveData = new SingleLiveEvent<>();
        this.uiEventLiveData = new V<>();
    }

    private final void fillCheckboxStatusToStorage() {
        Unit unit;
        CheckBoxDTO.CheckboxStatus checkboxStatus = this.cachedCheckboxStatus;
        if (checkboxStatus != null) {
            TravelPageKeyValueStorage travelPageKeyValueStorage = this.storage;
            if (travelPageKeyValueStorage != null) {
                travelPageKeyValueStorage.put(this.checkboxStatusKeyProvider.getKey(), checkboxStatus);
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        TravelPageKeyValueStorage travelPageKeyValueStorage2 = this.storage;
        if (travelPageKeyValueStorage2 != null) {
            travelPageKeyValueStorage2.remove(this.checkboxStatusKeyProvider.getKey());
            Unit unit2 = Unit.f71690a;
        }
    }

    private final void fillInputsToStorage() {
        TravelPageKeyValueStorage travelPageKeyValueStorage = this.storage;
        if (travelPageKeyValueStorage != null) {
            travelPageKeyValueStorage.putAll(prepareInputsParams());
        }
    }

    private final Map<String, String> prepareCheckboxParams() {
        Map<String, String> b11;
        CheckBoxDTO.CheckboxStatus checkboxStatus = this.cachedCheckboxStatus;
        return (checkboxStatus == null || (b11 = C2454a.b(this.checkboxStatusKeyProvider.getKey(), checkboxStatus.name())) == null) ? U.c() : b11;
    }

    private final Map<String, String> prepareInputsParams() {
        List<CommonInputVO.TextCommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        List<CommonInputVO.TextCommonInputVO> list2 = list;
        int h11 = U.h(C7714v.z(list2, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (CommonInputVO.TextCommonInputVO textCommonInputVO : list2) {
            Pair pair = new Pair(textCommonInputVO.getName(), textCommonInputVO.getValue());
            linkedHashMap.put(pair.e(), pair.f());
        }
        return linkedHashMap;
    }

    @NotNull
    public final P<Action> actionLiveData() {
        return this.actionLiveData;
    }

    public final void bindCheckboxStatus(CheckBoxDTO.CheckboxStatus checkboxStatus, boolean needUiUpdate) {
        this.cachedCheckboxStatus = checkboxStatus;
        if (needUiUpdate) {
            this.uiEventLiveData.setValue(UiEvent.SetCheckboxStatus.m1125boximpl(UiEvent.SetCheckboxStatus.m1126constructorimpl(checkboxStatus)));
        }
        fillCheckboxStatusToStorage();
    }

    public final void bindInputs(@NotNull List<CommonInputVO.TextCommonInputVO> inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        ArrayList W02 = C7714v.W0(inputs);
        this.cachedInputs = W02;
        this.uiEventLiveData.setValue(UiEvent.SubmitInputs.m1131boximpl(UiEvent.SubmitInputs.m1132constructorimpl(W02)));
        fillInputsToStorage();
    }

    public final void onCheckboxStatusChanged(@NotNull CheckBoxDTO.CheckboxStatus checkboxStatus, AtomAction action) {
        Intrinsics.checkNotNullParameter(checkboxStatus, "checkboxStatus");
        if (this.cachedCheckboxStatus != checkboxStatus) {
            this.cachedCheckboxStatus = checkboxStatus;
            this.actionLiveData.setValue(Action.NotifyCheckboxChanged.m1119boximpl(Action.NotifyCheckboxChanged.m1120constructorimpl(checkboxStatus)));
            if (action != null) {
                this.actionLiveData.setValue(Action.HandleAction.m1113boximpl(Action.HandleAction.m1114constructorimpl(action)));
            }
        }
    }

    public final void onTextInputChanged(long inputId, @NotNull String oldValue, CharSequence newValue) {
        String obj;
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        if (newValue == null || (obj = newValue.toString()) == null || Intrinsics.d(oldValue, obj)) {
            return;
        }
        List<CommonInputVO.TextCommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Iterator<CommonInputVO.TextCommonInputVO> it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getId() == inputId) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            List<CommonInputVO.TextCommonInputVO> list2 = this.cachedInputs;
            if (list2 == null) {
                Intrinsics.n("cachedInputs");
                throw null;
            }
            CommonInputVO.TextCommonInputVO textCommonInputVO = list2.get(intValue);
            CommonInputVO.TextCommonInputVO copy$default = CommonInputVO.TextCommonInputVO.copy$default(textCommonInputVO, 0L, null, obj, false, null, false, 0, null, false, null, null, false, 0, null, null, null, null, false, null, null, false, 2097139, null);
            List<CommonInputVO.TextCommonInputVO> list3 = this.cachedInputs;
            if (list3 == null) {
                Intrinsics.n("cachedInputs");
                throw null;
            }
            list3.set(intValue, copy$default);
            this.actionLiveData.setValue(new Action.NotifyInputChanged(intValue, InputPayload.ERROR, copy$default));
            AtomAction onChange = textCommonInputVO.getOnChange();
            if (onChange != null) {
                this.actionLiveData.setValue(Action.HandleAction.m1113boximpl(Action.HandleAction.m1114constructorimpl(onChange)));
            }
        }
    }

    @NotNull
    public final AtomAction processAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ComposerAction)) {
            return action;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        Map<String, String> params = composerAction.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
        u11.putAll(prepareInputsParams());
        u11.putAll(prepareCheckboxParams());
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null);
    }

    public final void setUpStorage(@NotNull TravelPageKeyValueStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
    }

    @NotNull
    public final P<UiEvent> uiEventLiveData() {
        return this.uiEventLiveData;
    }
}
