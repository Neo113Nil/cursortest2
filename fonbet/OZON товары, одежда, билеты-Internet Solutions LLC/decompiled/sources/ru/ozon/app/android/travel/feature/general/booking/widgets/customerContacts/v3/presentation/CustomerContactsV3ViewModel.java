package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation;

import Ae.B0;
import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Kk.c;
import androidx.lifecycle.w0;
import com.google.android.gms.common.Scopes;
import ed.InterfaceC6346b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.shared.CustomerContactsCheckboxStatusKeyProvider;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.utils.FlowUtilsKt;
import ru.ozon.app.android.travel.utils.extensions.MapExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002GHB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0012J'\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J!\u0010+\u001a\u0004\u0018\u00010\u00132\b\u0010)\u001a\u0004\u0018\u00010\u00132\u0006\u0010*\u001a\u00020&¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u0004\u0018\u00010\u00132\b\u0010)\u001a\u0004\u0018\u00010\u00132\u0006\u0010*\u001a\u00020&¢\u0006\u0004\b-\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001f\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010C\u001a\b\u0012\u0004\u0012\u0002050B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "storage", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/shared/CustomerContactsCheckboxStatusKeyProvider;", "checkboxStatusKeyProvider", "<init>", "(Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/shared/CustomerContactsCheckboxStatusKeyProvider;)V", "", "", "prepareInputsParams", "()Ljava/util/Map;", "", "fillInputsToStorage", "()V", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "checkboxStatus", "fillCheckboxStatusToStorage", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)V", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "phoneNumber", Scopes.EMAIL, "bindInputs", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)V", "bindCheckboxStatus", "", "inputId", "oldValue", "", "newValue", "onTextInputChanged", "(ILjava/lang/String;Ljava/lang/CharSequence;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "onCheckboxStatusChanged", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;Lru/ozon/uni/atoms/af/AtomAction;)V", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "", "getIfInputsNotCashed", "()Z", "input", "shouldUpdateInput", "getPhoneNumberWithCashedValue", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Z)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "getEmailWithCashedValue", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/shared/CustomerContactsCheckboxStatusKeyProvider;", "LAe/x0;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent;", "_uiEventFlow", "LAe/x0;", "LAe/w0;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$Action;", "_actionFlow", "LAe/w0;", "cashedPhoneNumberVO", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "cashedEmailVO", "cashedCheckboxStatus", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "LAe/M0;", "uiEventFlow", "LAe/M0;", "getUiEventFlow", "()LAe/M0;", "LAe/B0;", "actionFlow", "LAe/B0;", "getActionFlow", "()LAe/B0;", "UiEvent", "Action", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomerContactsV3ViewModel extends w0 {

    @NotNull
    private final Ae.w0<Action> _actionFlow;

    @NotNull
    private final x0<UiEvent> _uiEventFlow;

    @NotNull
    private final B0<Action> actionFlow;
    private CheckBoxDTO.CheckboxStatus cashedCheckboxStatus;
    private CommonInputV2VO.TextInputV2 cashedEmailVO;
    private CommonInputV2VO.TextInputV2 cashedPhoneNumberVO;

    @NotNull
    private final CustomerContactsCheckboxStatusKeyProvider checkboxStatusKeyProvider;

    @NotNull
    private final TravelPageKeyValueStorage storage;

    @NotNull
    private final M0<UiEvent> uiEventFlow;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$Action;", "", "HandleAction", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$Action$HandleAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$Action$HandleAction;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "constructor-impl", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "", "toString-impl", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/af/AtomAction;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HandleAction implements Action {

            @NotNull
            private final AtomAction atomAction;

            private /* synthetic */ HandleAction(AtomAction atomAction) {
                this.atomAction = atomAction;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ HandleAction m1137boximpl(AtomAction atomAction) {
                return new HandleAction(atomAction);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static AtomAction m1138constructorimpl(@NotNull AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(atomAction, "atomAction");
                return atomAction;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1139equalsimpl(AtomAction atomAction, Object obj) {
                return (obj instanceof HandleAction) && Intrinsics.d(atomAction, ((HandleAction) obj).getAtomAction());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1140hashCodeimpl(AtomAction atomAction) {
                return atomAction.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1141toStringimpl(AtomAction atomAction) {
                return c.e("HandleAction(atomAction=", ")", atomAction);
            }

            public boolean equals(Object obj) {
                return m1139equalsimpl(this.atomAction, obj);
            }

            public int hashCode() {
                return m1140hashCodeimpl(this.atomAction);
            }

            public String toString() {
                return m1141toStringimpl(this.atomAction);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ AtomAction getAtomAction() {
                return this.atomAction;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent;", "", "NotifyPhoneNumberChanged", "NotifyEmailChanged", "NotifyCheckboxStatusChanged", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent$NotifyCheckboxStatusChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent$NotifyEmailChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent$NotifyPhoneNumberChanged;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface UiEvent {

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent$NotifyCheckboxStatusChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "checkboxStatus", "constructor-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "", "toString-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "getCheckboxStatus", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NotifyCheckboxStatusChanged implements UiEvent {

            @NotNull
            private final CheckBoxDTO.CheckboxStatus checkboxStatus;

            private /* synthetic */ NotifyCheckboxStatusChanged(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                this.checkboxStatus = checkboxStatus;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ NotifyCheckboxStatusChanged m1143boximpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                return new NotifyCheckboxStatusChanged(checkboxStatus);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static CheckBoxDTO.CheckboxStatus m1144constructorimpl(@NotNull CheckBoxDTO.CheckboxStatus checkboxStatus) {
                Intrinsics.checkNotNullParameter(checkboxStatus, "checkboxStatus");
                return checkboxStatus;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1145equalsimpl(CheckBoxDTO.CheckboxStatus checkboxStatus, Object obj) {
                return (obj instanceof NotifyCheckboxStatusChanged) && checkboxStatus == ((NotifyCheckboxStatusChanged) obj).getCheckboxStatus();
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1146hashCodeimpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                return checkboxStatus.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1147toStringimpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
                return "NotifyCheckboxStatusChanged(checkboxStatus=" + checkboxStatus + ")";
            }

            public boolean equals(Object obj) {
                return m1145equalsimpl(this.checkboxStatus, obj);
            }

            public int hashCode() {
                return m1146hashCodeimpl(this.checkboxStatus);
            }

            public String toString() {
                return m1147toStringimpl(this.checkboxStatus);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ CheckBoxDTO.CheckboxStatus getCheckboxStatus() {
                return this.checkboxStatus;
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent$NotifyEmailChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", Scopes.EMAIL, "constructor-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "", "toString-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Ljava/lang/Object;)Z", "equals", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "getEmail", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NotifyEmailChanged implements UiEvent {

            @NotNull
            private final CommonInputV2VO.TextInputV2 email;

            private /* synthetic */ NotifyEmailChanged(CommonInputV2VO.TextInputV2 textInputV2) {
                this.email = textInputV2;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ NotifyEmailChanged m1149boximpl(CommonInputV2VO.TextInputV2 textInputV2) {
                return new NotifyEmailChanged(textInputV2);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static CommonInputV2VO.TextInputV2 m1150constructorimpl(@NotNull CommonInputV2VO.TextInputV2 email) {
                Intrinsics.checkNotNullParameter(email, "email");
                return email;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1151equalsimpl(CommonInputV2VO.TextInputV2 textInputV2, Object obj) {
                return (obj instanceof NotifyEmailChanged) && Intrinsics.d(textInputV2, ((NotifyEmailChanged) obj).getEmail());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1152hashCodeimpl(CommonInputV2VO.TextInputV2 textInputV2) {
                return textInputV2.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1153toStringimpl(CommonInputV2VO.TextInputV2 textInputV2) {
                return "NotifyEmailChanged(email=" + textInputV2 + ")";
            }

            public boolean equals(Object obj) {
                return m1151equalsimpl(this.email, obj);
            }

            public int hashCode() {
                return m1152hashCodeimpl(this.email);
            }

            public String toString() {
                return m1153toStringimpl(this.email);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ CommonInputV2VO.TextInputV2 getEmail() {
                return this.email;
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent$NotifyPhoneNumberChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "phoneNumber", "constructor-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "", "toString-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Ljava/lang/Object;)Z", "equals", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "getPhoneNumber", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NotifyPhoneNumberChanged implements UiEvent {

            @NotNull
            private final CommonInputV2VO.TextInputV2 phoneNumber;

            private /* synthetic */ NotifyPhoneNumberChanged(CommonInputV2VO.TextInputV2 textInputV2) {
                this.phoneNumber = textInputV2;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ NotifyPhoneNumberChanged m1155boximpl(CommonInputV2VO.TextInputV2 textInputV2) {
                return new NotifyPhoneNumberChanged(textInputV2);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static CommonInputV2VO.TextInputV2 m1156constructorimpl(@NotNull CommonInputV2VO.TextInputV2 phoneNumber) {
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                return phoneNumber;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1157equalsimpl(CommonInputV2VO.TextInputV2 textInputV2, Object obj) {
                return (obj instanceof NotifyPhoneNumberChanged) && Intrinsics.d(textInputV2, ((NotifyPhoneNumberChanged) obj).getPhoneNumber());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1158hashCodeimpl(CommonInputV2VO.TextInputV2 textInputV2) {
                return textInputV2.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1159toStringimpl(CommonInputV2VO.TextInputV2 textInputV2) {
                return "NotifyPhoneNumberChanged(phoneNumber=" + textInputV2 + ")";
            }

            public boolean equals(Object obj) {
                return m1157equalsimpl(this.phoneNumber, obj);
            }

            public int hashCode() {
                return m1158hashCodeimpl(this.phoneNumber);
            }

            public String toString() {
                return m1159toStringimpl(this.phoneNumber);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ CommonInputV2VO.TextInputV2 getPhoneNumber() {
                return this.phoneNumber;
            }
        }
    }

    public CustomerContactsV3ViewModel(@NotNull TravelPageKeyValueStorage storage, @NotNull CustomerContactsCheckboxStatusKeyProvider checkboxStatusKeyProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(checkboxStatusKeyProvider, "checkboxStatusKeyProvider");
        this.storage = storage;
        this.checkboxStatusKeyProvider = checkboxStatusKeyProvider;
        x0<UiEvent> a11 = O0.a(null);
        this._uiEventFlow = a11;
        Ae.w0<Action> SingleEventsFlow = FlowUtilsKt.SingleEventsFlow();
        this._actionFlow = SingleEventsFlow;
        this.uiEventFlow = C2399j.b(a11);
        this.actionFlow = C2399j.a(SingleEventsFlow);
    }

    private final void fillCheckboxStatusToStorage(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        if (checkboxStatus != null) {
            this.storage.put(this.checkboxStatusKeyProvider.getKey(), checkboxStatus);
        } else {
            this.storage.remove(this.checkboxStatusKeyProvider.getKey());
        }
    }

    private final void fillInputsToStorage() {
        this.storage.putAll(prepareInputsParams());
    }

    private final Map<String, String> prepareInputsParams() {
        CommonInputV2VO.TextInputV2 textInputV2;
        CommonInputV2VO.TextInputV2 textInputV22 = this.cashedPhoneNumberVO;
        if (textInputV22 != null && (textInputV2 = this.cashedEmailVO) != null) {
            return U.j(new Pair(textInputV22.getName(), textInputV22.getValue()), new Pair(textInputV2.getName(), textInputV2.getValue()));
        }
        return U.c();
    }

    public final void bindCheckboxStatus(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        this.cashedCheckboxStatus = checkboxStatus;
        fillCheckboxStatusToStorage(checkboxStatus);
    }

    public final void bindInputs(CommonInputV2VO.TextInputV2 phoneNumber, CommonInputV2VO.TextInputV2 email) {
        this.cashedPhoneNumberVO = phoneNumber;
        this.cashedEmailVO = email;
        fillInputsToStorage();
    }

    @NotNull
    public final B0<Action> getActionFlow() {
        return this.actionFlow;
    }

    public final CommonInputV2VO.TextInputV2 getEmailWithCashedValue(CommonInputV2VO.TextInputV2 input, boolean shouldUpdateInput) {
        CommonInputV2VO.TextInputV2 textInputV2 = this.cashedEmailVO;
        String name = textInputV2 != null ? textInputV2.getName() : null;
        CommonInputV2VO.TextInputV2 m1443copyjp_8I2s$default = (shouldUpdateInput || textInputV2 == null || input == null) ? input : CommonInputV2VO.TextInputV2.m1443copyjp_8I2s$default(input, 0, null, textInputV2.getValue(), false, null, 0, 0, null, false, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, 268435451, null);
        this.cashedEmailVO = m1443copyjp_8I2s$default;
        if (m1443copyjp_8I2s$default != null) {
            this.storage.put(m1443copyjp_8I2s$default.getName(), m1443copyjp_8I2s$default.getValue());
        } else if (name != null) {
            this.storage.remove(name);
        }
        return this.cashedEmailVO;
    }

    public final boolean getIfInputsNotCashed() {
        CommonInputV2VO.TextInputV2 textInputV2 = this.cashedPhoneNumberVO;
        String value = textInputV2 != null ? textInputV2.getValue() : null;
        if (value != null && value.length() != 0) {
            return false;
        }
        CommonInputV2VO.TextInputV2 textInputV22 = this.cashedEmailVO;
        String value2 = textInputV22 != null ? textInputV22.getValue() : null;
        return value2 == null || value2.length() == 0;
    }

    public final CommonInputV2VO.TextInputV2 getPhoneNumberWithCashedValue(CommonInputV2VO.TextInputV2 input, boolean shouldUpdateInput) {
        CommonInputV2VO.TextInputV2 textInputV2 = this.cashedPhoneNumberVO;
        String name = textInputV2 != null ? textInputV2.getName() : null;
        CommonInputV2VO.TextInputV2 m1443copyjp_8I2s$default = (shouldUpdateInput || textInputV2 == null || input == null) ? input : CommonInputV2VO.TextInputV2.m1443copyjp_8I2s$default(input, 0, null, textInputV2.getValue(), false, null, 0, 0, null, false, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, 268435451, null);
        this.cashedPhoneNumberVO = m1443copyjp_8I2s$default;
        if (m1443copyjp_8I2s$default != null) {
            this.storage.put(m1443copyjp_8I2s$default.getName(), m1443copyjp_8I2s$default.getValue());
        } else if (name != null) {
            this.storage.remove(name);
        }
        return this.cashedPhoneNumberVO;
    }

    @NotNull
    public final M0<UiEvent> getUiEventFlow() {
        return this.uiEventFlow;
    }

    public final void onCheckboxStatusChanged(@NotNull CheckBoxDTO.CheckboxStatus checkboxStatus, AtomAction action) {
        Intrinsics.checkNotNullParameter(checkboxStatus, "checkboxStatus");
        if (this.cashedCheckboxStatus != checkboxStatus) {
            this._uiEventFlow.setValue(UiEvent.NotifyCheckboxStatusChanged.m1143boximpl(UiEvent.NotifyCheckboxStatusChanged.m1144constructorimpl(checkboxStatus)));
            fillCheckboxStatusToStorage(checkboxStatus);
            if (action != null) {
                this._actionFlow.tryEmit(Action.HandleAction.m1137boximpl(Action.HandleAction.m1138constructorimpl(action)));
            }
        }
    }

    public final void onTextInputChanged(int inputId, @NotNull String oldValue, CharSequence newValue) {
        String obj;
        CommonInputV2VO.TextInputV2 textInputV2;
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        if (newValue == null || (obj = newValue.toString()) == null || Intrinsics.d(oldValue, obj)) {
            return;
        }
        CommonInputV2VO.TextInputV2 textInputV22 = this.cashedPhoneNumberVO;
        if (textInputV22 != null && inputId == textInputV22.getId()) {
            CommonInputV2VO.TextInputV2 textInputV23 = this.cashedPhoneNumberVO;
            if (textInputV23 != null) {
                CommonInputV2VO.TextInputV2 m1443copyjp_8I2s$default = CommonInputV2VO.TextInputV2.m1443copyjp_8I2s$default(textInputV23, 0, null, obj, false, null, 0, 0, null, false, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, 268435443, null);
                this.cashedPhoneNumberVO = m1443copyjp_8I2s$default;
                this.storage.put(m1443copyjp_8I2s$default.getName(), m1443copyjp_8I2s$default.getValue());
                this._uiEventFlow.setValue(UiEvent.NotifyPhoneNumberChanged.m1155boximpl(UiEvent.NotifyPhoneNumberChanged.m1156constructorimpl(m1443copyjp_8I2s$default)));
                AtomAction onChange = m1443copyjp_8I2s$default.getOnChange();
                if (onChange != null) {
                    this._actionFlow.tryEmit(Action.HandleAction.m1137boximpl(Action.HandleAction.m1138constructorimpl(onChange)));
                    return;
                }
                return;
            }
            return;
        }
        CommonInputV2VO.TextInputV2 textInputV24 = this.cashedEmailVO;
        if (textInputV24 == null || inputId != textInputV24.getId() || (textInputV2 = this.cashedEmailVO) == null) {
            return;
        }
        CommonInputV2VO.TextInputV2 m1443copyjp_8I2s$default2 = CommonInputV2VO.TextInputV2.m1443copyjp_8I2s$default(textInputV2, 0, null, obj, false, null, 0, 0, null, false, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, 268435443, null);
        this.cashedEmailVO = m1443copyjp_8I2s$default2;
        this.storage.put(m1443copyjp_8I2s$default2.getName(), m1443copyjp_8I2s$default2.getValue());
        this._uiEventFlow.setValue(UiEvent.NotifyEmailChanged.m1149boximpl(UiEvent.NotifyEmailChanged.m1150constructorimpl(m1443copyjp_8I2s$default2)));
        AtomAction onChange2 = m1443copyjp_8I2s$default2.getOnChange();
        if (onChange2 != null) {
            this._actionFlow.tryEmit(Action.HandleAction.m1137boximpl(Action.HandleAction.m1138constructorimpl(onChange2)));
        }
    }

    @NotNull
    public final AtomAction processAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ComposerAction)) {
            return action;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, MapExtensionsKt.combineWith(composerAction.getParams(), this.storage.getAll()), null, null, 27, null);
    }
}
