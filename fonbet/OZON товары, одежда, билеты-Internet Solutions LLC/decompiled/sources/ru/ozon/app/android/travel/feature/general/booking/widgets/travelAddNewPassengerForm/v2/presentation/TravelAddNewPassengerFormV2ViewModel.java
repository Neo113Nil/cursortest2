package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation;

import An.C2439a;
import J0.P;
import Kk.c;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.format.a;
import org.joda.time.format.b;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.input.InputPayload;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.uikit.dialog.sort.SortItem;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010 \u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J%\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b'\u0010\u0011J\u0015\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u000b¢\u0006\u0004\b,\u0010\u0003R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R%\u00105\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00150\u0015038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010:\u001a\n 4*\u0004\u0018\u000109098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00130>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "", "prepareInputsParams", "()Ljava/util/Map;", "", "inputId", "newValue", "", "onBirthCertificateTextInputChanged", "(JLjava/lang/String;)V", "", "selectedValuePosition", "onBirthCertificateSelectorValueSelected", "(I)V", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "inputs", "", "isClearButtonVisible", "bindInputs", "(Ljava/util/List;Z)V", "oldValue", "", "onTextInputChanged", "(JLjava/lang/String;Ljava/lang/CharSequence;)V", "onDateInputClicked", "(J)V", "onSelectorClicked", "onCheckboxChanged", "(JZ)V", "selectedDay", "selectedMonth", "selectedYear", "onDateValueSelected", "(III)V", "onSelectorValueSelected", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "onClearButtonClicked", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action;", "actionLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "kotlin.jvm.PlatformType", "clearButtonVisibilityLiveData", "Landroidx/lifecycle/V;", "getClearButtonVisibilityLiveData", "()Landroidx/lifecycle/V;", "Lorg/joda/time/format/b;", "visibleDateTimeFormatter", "Lorg/joda/time/format/b;", "requestedChangeInputId", "Ljava/lang/Long;", "", "cachedInputs", "Ljava/util/List;", "getBirthCertificateInputs", "()Ljava/util/List;", "birthCertificateInputs", "Action", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormV2ViewModel extends w0 {
    private List<CommonInputVO> cachedInputs;
    private Long requestedChangeInputId;

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData = new SingleLiveEvent<>();

    @NotNull
    private final V<Boolean> clearButtonVisibilityLiveData = new V<>(Boolean.FALSE);
    private final b visibleDateTimeFormatter = a.b("dd.MM.yyyy");

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action;", "", "<init>", "()V", "HandleAction", "ShowSelector", "ShowDateSelector", "SubmitInputs", "NotifyInputChanged", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action$HandleAction;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action$NotifyInputChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action$ShowDateSelector;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action$ShowSelector;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action$SubmitInputs;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action$HandleAction;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HandleAction extends Action {

            @NotNull
            private final AtomAction atomAction;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HandleAction(@NotNull AtomAction atomAction) {
                super(null);
                Intrinsics.checkNotNullParameter(atomAction, "atomAction");
                this.atomAction = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandleAction) && Intrinsics.d(this.atomAction, ((HandleAction) other).atomAction);
            }

            @NotNull
            public final AtomAction getAtomAction() {
                return this.atomAction;
            }

            public int hashCode() {
                return this.atomAction.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("HandleAction(atomAction=", ")", this.atomAction);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action$NotifyInputChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action;", "", "inputPosition", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/adapter/input/InputPayload;", "payload", "", "shouldInputStateChange", "<init>", "(ILru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/adapter/input/InputPayload;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getInputPosition", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/adapter/input/InputPayload;", "getPayload", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/adapter/input/InputPayload;", "Z", "getShouldInputStateChange", "()Z", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NotifyInputChanged extends Action {
            private final int inputPosition;
            private final InputPayload payload;
            private final boolean shouldInputStateChange;

            public /* synthetic */ NotifyInputChanged(int i11, InputPayload inputPayload, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, (i12 & 2) != 0 ? null : inputPayload, z11);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotifyInputChanged)) {
                    return false;
                }
                NotifyInputChanged notifyInputChanged = (NotifyInputChanged) other;
                return this.inputPosition == notifyInputChanged.inputPosition && this.payload == notifyInputChanged.payload && this.shouldInputStateChange == notifyInputChanged.shouldInputStateChange;
            }

            public final int getInputPosition() {
                return this.inputPosition;
            }

            public final InputPayload getPayload() {
                return this.payload;
            }

            public final boolean getShouldInputStateChange() {
                return this.shouldInputStateChange;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.inputPosition) * 31;
                InputPayload inputPayload = this.payload;
                return Boolean.hashCode(this.shouldInputStateChange) + ((hashCode + (inputPayload == null ? 0 : inputPayload.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                int i11 = this.inputPosition;
                InputPayload inputPayload = this.payload;
                boolean z11 = this.shouldInputStateChange;
                StringBuilder sb2 = new StringBuilder("NotifyInputChanged(inputPosition=");
                sb2.append(i11);
                sb2.append(", payload=");
                sb2.append(inputPayload);
                sb2.append(", shouldInputStateChange=");
                return Pk0.a.a(")", sb2, z11);
            }

            public NotifyInputChanged(int i11, InputPayload inputPayload, boolean z11) {
                super(null);
                this.inputPosition = i11;
                this.payload = inputPayload;
                this.shouldInputStateChange = z11;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action$ShowDateSelector;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action;", "", "selectorTitle", "", "selectedDay", "selectedMonth", "selectedYear", "", "startDateMillis", "endDateMillis", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectorTitle", "Ljava/lang/Integer;", "getSelectedDay", "()Ljava/lang/Integer;", "getSelectedMonth", "getSelectedYear", "Ljava/lang/Long;", "getStartDateMillis", "()Ljava/lang/Long;", "getEndDateMillis", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowDateSelector extends Action {
            private final Long endDateMillis;
            private final Integer selectedDay;
            private final Integer selectedMonth;
            private final Integer selectedYear;
            private final String selectorTitle;
            private final Long startDateMillis;

            public ShowDateSelector(String str, Integer num, Integer num2, Integer num3, Long l11, Long l12) {
                super(null);
                this.selectorTitle = str;
                this.selectedDay = num;
                this.selectedMonth = num2;
                this.selectedYear = num3;
                this.startDateMillis = l11;
                this.endDateMillis = l12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowDateSelector)) {
                    return false;
                }
                ShowDateSelector showDateSelector = (ShowDateSelector) other;
                return Intrinsics.d(this.selectorTitle, showDateSelector.selectorTitle) && Intrinsics.d(this.selectedDay, showDateSelector.selectedDay) && Intrinsics.d(this.selectedMonth, showDateSelector.selectedMonth) && Intrinsics.d(this.selectedYear, showDateSelector.selectedYear) && Intrinsics.d(this.startDateMillis, showDateSelector.startDateMillis) && Intrinsics.d(this.endDateMillis, showDateSelector.endDateMillis);
            }

            public final Long getEndDateMillis() {
                return this.endDateMillis;
            }

            public final Integer getSelectedDay() {
                return this.selectedDay;
            }

            public final Integer getSelectedMonth() {
                return this.selectedMonth;
            }

            public final Integer getSelectedYear() {
                return this.selectedYear;
            }

            public final String getSelectorTitle() {
                return this.selectorTitle;
            }

            public final Long getStartDateMillis() {
                return this.startDateMillis;
            }

            public int hashCode() {
                String str = this.selectorTitle;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.selectedDay;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.selectedMonth;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.selectedYear;
                int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Long l11 = this.startDateMillis;
                int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
                Long l12 = this.endDateMillis;
                return hashCode5 + (l12 != null ? l12.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.selectorTitle;
                Integer num = this.selectedDay;
                Integer num2 = this.selectedMonth;
                Integer num3 = this.selectedYear;
                Long l11 = this.startDateMillis;
                Long l12 = this.endDateMillis;
                StringBuilder b11 = P.b("ShowDateSelector(selectorTitle=", str, num, ", selectedDay=", ", selectedMonth=");
                Ef0.c.e(b11, num2, ", selectedYear=", num3, ", startDateMillis=");
                b11.append(l11);
                b11.append(", endDateMillis=");
                b11.append(l12);
                b11.append(")");
                return b11.toString();
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action$ShowSelector;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action;", "", "selectorTitle", "", "Lru/ozon/app/android/uikit/dialog/sort/SortItem;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectorTitle", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowSelector extends Action {

            @NotNull
            private final List<SortItem> items;
            private final String selectorTitle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowSelector(String str, @NotNull List<SortItem> items) {
                super(null);
                Intrinsics.checkNotNullParameter(items, "items");
                this.selectorTitle = str;
                this.items = items;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowSelector)) {
                    return false;
                }
                ShowSelector showSelector = (ShowSelector) other;
                return Intrinsics.d(this.selectorTitle, showSelector.selectorTitle) && Intrinsics.d(this.items, showSelector.items);
            }

            @NotNull
            public final List<SortItem> getItems() {
                return this.items;
            }

            public final String getSelectorTitle() {
                return this.selectorTitle;
            }

            public int hashCode() {
                String str = this.selectorTitle;
                return this.items.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @NotNull
            public String toString() {
                return C2439a.a("ShowSelector(selectorTitle=", this.selectorTitle, ", items=", ")", this.items);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action$SubmitInputs;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action;", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "inputs", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SubmitInputs extends Action {

            @NotNull
            private final List<CommonInputVO> inputs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public SubmitInputs(@NotNull List<? extends CommonInputVO> inputs) {
                super(null);
                Intrinsics.checkNotNullParameter(inputs, "inputs");
                this.inputs = inputs;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubmitInputs) && Intrinsics.d(this.inputs, ((SubmitInputs) other).inputs);
            }

            @NotNull
            public final List<CommonInputVO> getInputs() {
                return this.inputs;
            }

            public int hashCode() {
                return this.inputs.hashCode();
            }

            @NotNull
            public String toString() {
                return H3.c.a("SubmitInputs(inputs=", ")", this.inputs);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    private final List<CommonInputVO> getBirthCertificateInputs() {
        Object obj;
        List<CommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CommonInputVO) obj) instanceof CommonInputVO.BirthCertificateCommonInputVO) {
                break;
            }
        }
        CommonInputVO commonInputVO = (CommonInputVO) obj;
        List<CommonInputVO> asInputsList = commonInputVO != null ? ((CommonInputVO.BirthCertificateCommonInputVO) commonInputVO).asInputsList() : null;
        return asInputsList == null ? K.f71697a : asInputsList;
    }

    private final void onBirthCertificateSelectorValueSelected(int selectedValuePosition) {
        Object obj;
        CommonInputVO.Selector.Option option;
        CommonInputVO.Selector copy;
        Iterator<T> it = getBirthCertificateInputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long id2 = ((CommonInputVO) obj).getId();
            Long l11 = this.requestedChangeInputId;
            if (l11 != null && id2 == l11.longValue()) {
                break;
            }
        }
        CommonInputVO.Selector selector = obj instanceof CommonInputVO.Selector ? (CommonInputVO.Selector) obj : null;
        if (selector == null) {
            return;
        }
        List<CommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Iterator<CommonInputVO> it2 = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            } else if (it2.next() instanceof CommonInputVO.BirthCertificateCommonInputVO) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = i11;
        List<CommonInputVO> list2 = this.cachedInputs;
        if (list2 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Object Q11 = C7714v.Q(i12, list2);
        CommonInputVO.BirthCertificateCommonInputVO birthCertificateCommonInputVO = Q11 instanceof CommonInputVO.BirthCertificateCommonInputVO ? (CommonInputVO.BirthCertificateCommonInputVO) Q11 : null;
        if (birthCertificateCommonInputVO == null || (option = (CommonInputVO.Selector.Option) C7714v.Q(selectedValuePosition, selector.getOptions())) == null) {
            return;
        }
        copy = selector.copy((r37 & 1) != 0 ? selector.id : 0L, (r37 & 2) != 0 ? selector.name : null, (r37 & 4) != 0 ? selector.value : option.getCode(), (r37 & 8) != 0 ? selector.isErrorVisible : false, (r37 & 16) != 0 ? selector.error : null, (r37 & 32) != 0 ? selector.scrollOnMount : false, (r37 & 64) != 0 ? selector.text : option.getValue(), (r37 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? selector.placeholder : null, (r37 & 256) != 0 ? selector.isEnabled : false, (r37 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? selector.options : null, (r37 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? selector.onSelectAction : null, (r37 & 2048) != 0 ? selector.defaultOption : null, (r37 & 4096) != 0 ? selector.clickEvent : null, (r37 & 8192) != 0 ? selector.selectEvent : null, (r37 & 16384) != 0 ? selector.rightIcon : null, (r37 & 32768) != 0 ? selector.leftIcon : null);
        List<CommonInputVO> list3 = this.cachedInputs;
        if (list3 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        list3.set(i12, CommonInputVO.BirthCertificateCommonInputVO.copy$default(birthCertificateCommonInputVO, 0L, null, null, false, null, false, copy, null, 191, null));
        this.actionLiveData.setValue(new Action.NotifyInputChanged(i12, InputPayload.BIRTH_CERTIFICATE_SERIES_SELECTOR, true));
        AtomAction onSelectAction = selector.getOnSelectAction();
        if (onSelectAction != null) {
            this.actionLiveData.setValue(new Action.HandleAction(onSelectAction));
        }
        this.clearButtonVisibilityLiveData.setValue(Boolean.TRUE);
    }

    private final void onBirthCertificateTextInputChanged(long inputId, String newValue) {
        Object obj;
        Iterator<T> it = getBirthCertificateInputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((CommonInputVO) obj).getId() == inputId) {
                    break;
                }
            }
        }
        CommonInputVO.TextCommonInputVO textCommonInputVO = obj instanceof CommonInputVO.TextCommonInputVO ? (CommonInputVO.TextCommonInputVO) obj : null;
        if (textCommonInputVO == null) {
            return;
        }
        List<CommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Iterator<CommonInputVO> it2 = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            } else if (it2.next() instanceof CommonInputVO.BirthCertificateCommonInputVO) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = i11;
        List<CommonInputVO> list2 = this.cachedInputs;
        if (list2 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Object Q11 = C7714v.Q(i12, list2);
        CommonInputVO.BirthCertificateCommonInputVO birthCertificateCommonInputVO = Q11 instanceof CommonInputVO.BirthCertificateCommonInputVO ? (CommonInputVO.BirthCertificateCommonInputVO) Q11 : null;
        if (birthCertificateCommonInputVO == null) {
            return;
        }
        CommonInputVO.TextCommonInputVO copy$default = CommonInputVO.TextCommonInputVO.copy$default(textCommonInputVO, 0L, null, newValue, false, null, false, 0, null, false, null, null, false, 0, null, null, null, null, false, null, null, false, 2097139, null);
        boolean z11 = copy$default.getIsErrorVisible() != textCommonInputVO.getIsErrorVisible();
        List<CommonInputVO> list3 = this.cachedInputs;
        if (list3 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        list3.set(i12, CommonInputVO.BirthCertificateCommonInputVO.copy$default(birthCertificateCommonInputVO, 0L, null, null, false, null, false, null, copy$default, 127, null));
        this.actionLiveData.setValue(new Action.NotifyInputChanged(i12, InputPayload.BIRTH_CERTIFICATE_SERIES_TEXT_ERROR, z11));
        this.clearButtonVisibilityLiveData.setValue(Boolean.TRUE);
    }

    private final Map<String, String> prepareInputsParams() {
        List<CommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        ArrayList p02 = C7714v.p0(getBirthCertificateInputs(), list);
        ArrayList arrayList = new ArrayList();
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(((CommonInputVO) next) instanceof CommonInputVO.BirthCertificateCommonInputVO)) {
                arrayList.add(next);
            }
        }
        int h11 = U.h(C7714v.z(arrayList, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CommonInputVO commonInputVO = (CommonInputVO) it2.next();
            Pair pair = new Pair(commonInputVO.getName(), commonInputVO.getValue());
            linkedHashMap.put(pair.e(), pair.f());
        }
        return linkedHashMap;
    }

    public final void bindInputs(@NotNull List<? extends CommonInputVO> inputs, boolean isClearButtonVisible) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        ArrayList W02 = C7714v.W0(inputs);
        this.cachedInputs = W02;
        this.actionLiveData.setValue(new Action.SubmitInputs(W02));
        if (isClearButtonVisible) {
            this.clearButtonVisibilityLiveData.setValue(Boolean.TRUE);
        }
    }

    @NotNull
    public final SingleLiveEvent<Action> getActionLiveData() {
        return this.actionLiveData;
    }

    @NotNull
    public final V<Boolean> getClearButtonVisibilityLiveData() {
        return this.clearButtonVisibilityLiveData;
    }

    public final void onCheckboxChanged(long inputId, boolean newValue) {
        Object obj;
        List<CommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((CommonInputVO) obj).getId() == inputId) {
                    break;
                }
            }
        }
        CommonInputVO.Checkbox checkbox = obj instanceof CommonInputVO.Checkbox ? (CommonInputVO.Checkbox) obj : null;
        if (checkbox == null) {
            return;
        }
        List<CommonInputVO> list2 = this.cachedInputs;
        if (list2 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        int indexOf = list2.indexOf(checkbox);
        CommonInputVO.Checkbox copy$default = CommonInputVO.Checkbox.copy$default(checkbox, 0L, null, false, null, false, null, newValue, false, null, false, 955, null);
        boolean z11 = copy$default.getIsErrorVisible() != checkbox.getIsErrorVisible();
        List<CommonInputVO> list3 = this.cachedInputs;
        if (list3 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        list3.set(indexOf, copy$default);
        this.actionLiveData.setValue(new Action.NotifyInputChanged(indexOf, InputPayload.ERROR, z11));
        AtomAction onSelectAction = checkbox.getOnSelectAction();
        if (onSelectAction != null) {
            this.actionLiveData.setValue(new Action.HandleAction(onSelectAction));
        }
        this.clearButtonVisibilityLiveData.setValue(Boolean.TRUE);
    }

    public final void onClearButtonClicked() {
        this.clearButtonVisibilityLiveData.setValue(Boolean.FALSE);
    }

    public final void onDateInputClicked(long inputId) {
        Object obj;
        this.requestedChangeInputId = Long.valueOf(inputId);
        List<CommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((CommonInputVO) obj).getId() == inputId) {
                    break;
                }
            }
        }
        CommonInputVO.DateCommonInputVO dateCommonInputVO = obj instanceof CommonInputVO.DateCommonInputVO ? (CommonInputVO.DateCommonInputVO) obj : null;
        if (dateCommonInputVO == null) {
            return;
        }
        String value = dateCommonInputVO.getValue();
        if (h.K(value)) {
            value = null;
        }
        LocalDate e11 = value != null ? this.visibleDateTimeFormatter.e(value) : null;
        SingleLiveEvent<Action> singleLiveEvent = this.actionLiveData;
        String placeholder = dateCommonInputVO.getPlaceholder();
        Integer valueOf = e11 != null ? Integer.valueOf(e11.i()) : null;
        Integer valueOf2 = e11 != null ? Integer.valueOf(e11.n() - 1) : null;
        Integer valueOf3 = e11 != null ? Integer.valueOf(e11.s()) : null;
        CommonInputVO.DateCommonInputVO.DateRange dateRange = dateCommonInputVO.getDateRange();
        Long valueOf4 = dateRange != null ? Long.valueOf(dateRange.getDateStart()) : null;
        CommonInputVO.DateCommonInputVO.DateRange dateRange2 = dateCommonInputVO.getDateRange();
        singleLiveEvent.setValue(new Action.ShowDateSelector(placeholder, valueOf, valueOf2, valueOf3, valueOf4, dateRange2 != null ? Long.valueOf(dateRange2.getDateEnd()) : null));
    }

    public final void onDateValueSelected(int selectedDay, int selectedMonth, int selectedYear) {
        Object obj;
        CommonInputVO.DateCommonInputVO copy;
        List<CommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long id2 = ((CommonInputVO) obj).getId();
            Long l11 = this.requestedChangeInputId;
            if (l11 != null && id2 == l11.longValue()) {
                break;
            }
        }
        CommonInputVO.DateCommonInputVO dateCommonInputVO = obj instanceof CommonInputVO.DateCommonInputVO ? (CommonInputVO.DateCommonInputVO) obj : null;
        if (dateCommonInputVO == null) {
            return;
        }
        List<CommonInputVO> list2 = this.cachedInputs;
        if (list2 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        int indexOf = list2.indexOf(dateCommonInputVO);
        String h11 = this.visibleDateTimeFormatter.h(new LocalDate(selectedYear, selectedMonth + 1, selectedDay));
        Intrinsics.f(h11);
        copy = dateCommonInputVO.copy((r29 & 1) != 0 ? dateCommonInputVO.id : 0L, (r29 & 2) != 0 ? dateCommonInputVO.name : null, (r29 & 4) != 0 ? dateCommonInputVO.value : h11, (r29 & 8) != 0 ? dateCommonInputVO.isErrorVisible : false, (r29 & 16) != 0 ? dateCommonInputVO.error : null, (r29 & 32) != 0 ? dateCommonInputVO.scrollOnMount : false, (r29 & 64) != 0 ? dateCommonInputVO.placeholder : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? dateCommonInputVO.isEnabled : false, (r29 & 256) != 0 ? dateCommonInputVO.dateRange : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? dateCommonInputVO.onSelectAction : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? dateCommonInputVO.defaultValue : null, (r29 & 2048) != 0 ? dateCommonInputVO.rightIcon : null, (r29 & 4096) != 0 ? dateCommonInputVO.leftIcon : null);
        List<CommonInputVO> list3 = this.cachedInputs;
        if (list3 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        list3.set(indexOf, copy);
        this.actionLiveData.setValue(new Action.NotifyInputChanged(indexOf, null, true, 2, null));
        AtomAction onSelectAction = dateCommonInputVO.getOnSelectAction();
        if (onSelectAction != null) {
            this.actionLiveData.setValue(new Action.HandleAction(onSelectAction));
        }
        this.clearButtonVisibilityLiveData.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void onSelectorClicked(long inputId) {
        Object obj;
        CommonInputVO.Selector selector;
        this.requestedChangeInputId = Long.valueOf(inputId);
        List<CommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((CommonInputVO) obj).getId() == inputId) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CommonInputVO.Selector selector2 = obj instanceof CommonInputVO.Selector ? (CommonInputVO.Selector) obj : null;
        if (selector2 == null) {
            Iterator it2 = getBirthCertificateInputs().iterator();
            while (true) {
                if (it2.hasNext()) {
                    selector = it2.next();
                    if (((CommonInputVO) selector).getId() == inputId) {
                        break;
                    }
                } else {
                    selector = 0;
                    break;
                }
            }
            CommonInputVO.Selector selector3 = selector instanceof CommonInputVO.Selector ? selector : null;
            if (selector3 == null) {
                return;
            } else {
                selector2 = selector3;
            }
        }
        List<CommonInputVO.Selector.Option> options = selector2.getOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(options, 10));
        for (CommonInputVO.Selector.Option option : options) {
            arrayList.add(new SortItem(option.getValue(), Intrinsics.d(selector2.getValue(), option.getCode())));
        }
        this.actionLiveData.setValue(new Action.ShowSelector(selector2.getPlaceholder(), arrayList));
    }

    public final void onSelectorValueSelected(int selectedValuePosition) {
        Object obj;
        CommonInputVO.Selector copy;
        List<CommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long id2 = ((CommonInputVO) obj).getId();
            Long l11 = this.requestedChangeInputId;
            if (l11 != null && id2 == l11.longValue()) {
                break;
            }
        }
        CommonInputVO.Selector selector = obj instanceof CommonInputVO.Selector ? (CommonInputVO.Selector) obj : null;
        if (selector == null) {
            onBirthCertificateSelectorValueSelected(selectedValuePosition);
            return;
        }
        List<CommonInputVO> list2 = this.cachedInputs;
        if (list2 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        int indexOf = list2.indexOf(selector);
        CommonInputVO.Selector.Option option = (CommonInputVO.Selector.Option) C7714v.Q(selectedValuePosition, selector.getOptions());
        if (option == null) {
            return;
        }
        copy = selector.copy((r37 & 1) != 0 ? selector.id : 0L, (r37 & 2) != 0 ? selector.name : null, (r37 & 4) != 0 ? selector.value : option.getCode(), (r37 & 8) != 0 ? selector.isErrorVisible : false, (r37 & 16) != 0 ? selector.error : null, (r37 & 32) != 0 ? selector.scrollOnMount : false, (r37 & 64) != 0 ? selector.text : option.getValue(), (r37 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? selector.placeholder : null, (r37 & 256) != 0 ? selector.isEnabled : false, (r37 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? selector.options : null, (r37 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? selector.onSelectAction : null, (r37 & 2048) != 0 ? selector.defaultOption : null, (r37 & 4096) != 0 ? selector.clickEvent : null, (r37 & 8192) != 0 ? selector.selectEvent : null, (r37 & 16384) != 0 ? selector.rightIcon : null, (r37 & 32768) != 0 ? selector.leftIcon : null);
        List<CommonInputVO> list3 = this.cachedInputs;
        if (list3 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        list3.set(indexOf, copy);
        this.actionLiveData.setValue(new Action.NotifyInputChanged(indexOf, null, true, 2, null));
        AtomAction onSelectAction = selector.getOnSelectAction();
        if (onSelectAction != null) {
            this.actionLiveData.setValue(new Action.HandleAction(onSelectAction));
        }
        this.clearButtonVisibilityLiveData.setValue(Boolean.TRUE);
    }

    public final void onTextInputChanged(long inputId, @NotNull String oldValue, CharSequence newValue) {
        String obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        if (newValue == null || (obj = newValue.toString()) == null || obj.equals(oldValue)) {
            return;
        }
        List<CommonInputVO> list = this.cachedInputs;
        if (list == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((CommonInputVO) obj2).getId() == inputId) {
                    break;
                }
            }
        }
        CommonInputVO.TextCommonInputVO textCommonInputVO = obj2 instanceof CommonInputVO.TextCommonInputVO ? (CommonInputVO.TextCommonInputVO) obj2 : null;
        if (textCommonInputVO == null) {
            onBirthCertificateTextInputChanged(inputId, obj);
            return;
        }
        List<CommonInputVO> list2 = this.cachedInputs;
        if (list2 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        int indexOf = list2.indexOf(textCommonInputVO);
        CommonInputVO.TextCommonInputVO copy$default = CommonInputVO.TextCommonInputVO.copy$default(textCommonInputVO, 0L, null, obj, false, null, false, 0, null, false, null, null, false, 0, null, null, null, null, false, null, null, false, 2097139, null);
        boolean z11 = copy$default.getIsErrorVisible() != textCommonInputVO.getIsErrorVisible();
        List<CommonInputVO> list3 = this.cachedInputs;
        if (list3 == null) {
            Intrinsics.n("cachedInputs");
            throw null;
        }
        list3.set(indexOf, copy$default);
        this.actionLiveData.setValue(new Action.NotifyInputChanged(indexOf, InputPayload.ERROR, z11));
        this.clearButtonVisibilityLiveData.setValue(Boolean.TRUE);
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
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null);
    }
}
