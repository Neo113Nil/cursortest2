package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import An.C2439a;
import B90.C2618u;
import Kk.c;
import Sc.o;
import T7.E;
import WZ.t;
import android.os.Bundle;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.IndexedValue;
import kotlin.collections.K;
import kotlin.collections.O;
import kotlin.collections.P;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.format.b;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3Mapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3ResultApi;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input.AddNewPassengerFormInputV2Payload;
import ru.ozon.app.android.travel.molecules.fragment.dateSelector.TravelDateSelectorDialogFragment;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorItem;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001oB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J%\u0010\u001c\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J9\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0!2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0!H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J#\u00105\u001a\u00020\u000f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J/\u0010:\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020\u001a¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b<\u0010\u0011J\u0015\u0010=\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b=\u0010\u0011J\u001d\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u001a¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ'\u0010F\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u000108¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u0012¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u000f¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010NR\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0O8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010W\u001a\n V*\u0004\u0018\u00010U0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010YR\u0016\u0010Z\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00180^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\"\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020&0a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\"\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR(\u0010h\u001a\u0004\u0018\u00010\r2\b\u0010g\u001a\u0004\u0018\u00010\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bh\u0010]\"\u0004\bi\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010m¨\u0006p"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3ResultApi;", "api", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3Mapper;", "mapper", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3ResultApi;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3Mapper;)V", "Landroid/os/Bundle;", "bundle", "", "prepareDateInputValue", "(Landroid/os/Bundle;)Ljava/lang/String;", "", "inputId", "", "cleanSuggests", "(I)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "performOnTextChangeComposerAction", "(ILru/ozon/uni/atoms/af/AtomAction;)V", "performOnFocusLostComposerAction", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "inputsVO", "", "shouldUpdateTextValue", "updateInputs", "(Ljava/util/List;Z)V", "inputItemVO", "updateInput", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;)V", "", "oldParams", "prepareParams", "(ILjava/util/Map;)Ljava/util/Map;", "index", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;", "newInput", "changeInputItemInCash", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;)V", "prepareInputsParams", "()Ljava/util/Map;", "newValue", "onBirthCertificateTextInputChanged", "(Ljava/lang/String;)V", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "changeCachedBirthCertificateTextInput", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)V", "inputItems", "", "widgetId", "bindInputs", "(Ljava/util/List;J)V", "oldValue", "", "shouldInvokeAction", "onTextInputChanged", "(ILjava/lang/String;Ljava/lang/CharSequence;Z)V", "onDateInputClicked", "onSelectorClicked", "onCheckboxChanged", "(IZ)V", "onDateValueSelected", "(Landroid/os/Bundle;)V", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "selectedItem", "onSelectorValueSelected", "(Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;)V", "onTextInputFocusLost", "(ILjava/lang/String;Ljava/lang/CharSequence;)V", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "setShouldSkipOnFocusLost", "()V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3ResultApi;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3Mapper;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action;", "actionLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lorg/joda/time/format/b;", "kotlin.jvm.PlatformType", "visibleDateTimeFormatter", "Lorg/joda/time/format/b;", "Ljava/lang/Long;", "shouldSkipOnFocusLost", "Z", "requestedChangeInputId", "Ljava/lang/Integer;", "", "cachedInputItems", "Ljava/util/List;", "", "cachedInputs", "Ljava/util/Map;", "cachedInputItemsIndexes", "cachedBirthCertificateTextInput", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "cachedBirthCertificateIndex", "setCachedBirthCertificateIndex", "(Ljava/lang/Integer;)V", "Lxe/B0;", "onFocusLostJob", "Lxe/B0;", "onTextChangeJob", "Action", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormV3ViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;

    @NotNull
    private final TravelAddNewPassengerFormV3ResultApi api;
    private Integer cachedBirthCertificateIndex;
    private CommonInputV2VO.TextInputV2 cachedBirthCertificateTextInput;

    @NotNull
    private List<TravelAddNewPassengerFormV3VO.InputItemVO> cachedInputItems;

    @NotNull
    private Map<Integer, Integer> cachedInputItemsIndexes;

    @NotNull
    private Map<Integer, CommonInputV2VO> cachedInputs;

    @NotNull
    private final TravelAddNewPassengerFormV3Mapper mapper;
    private B0 onFocusLostJob;
    private B0 onTextChangeJob;
    private Integer requestedChangeInputId;
    private boolean shouldSkipOnFocusLost;
    private final b visibleDateTimeFormatter;
    private Long widgetId;

    public TravelAddNewPassengerFormV3ViewModel(@NotNull TravelAddNewPassengerFormV3ResultApi api, @NotNull TravelAddNewPassengerFormV3Mapper mapper) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.api = api;
        this.mapper = mapper;
        this.actionLiveData = new SingleLiveEvent<>();
        this.visibleDateTimeFormatter = org.joda.time.format.a.b("dd.MM.yyyy");
        this.cachedInputItems = C7714v.W0(K.f71697a);
        this.cachedInputs = U.u(U.c());
        this.cachedInputItemsIndexes = U.c();
    }

    private final void changeCachedBirthCertificateTextInput(CommonInputV2VO.TextInputV2 newInput) {
        TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem copy$default;
        Integer num = this.cachedBirthCertificateIndex;
        if (num != null) {
            int intValue = num.intValue();
            TravelAddNewPassengerFormV3VO.InputItemVO inputItemVO = this.cachedInputItems.get(intValue);
            TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem birthCertificateInputItem = inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem ? (TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem) inputItemVO : null;
            if (birthCertificateInputItem == null || (copy$default = TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem.copy$default(birthCertificateInputItem, 0, null, newInput, 3, null)) == null) {
                return;
            }
            this.cachedInputItems.set(intValue, copy$default);
        }
    }

    private final void changeInputItemInCash(int index, CommonInputV2VO newInput) {
        TravelAddNewPassengerFormV3VO.InputItemVO inputItemVO = this.cachedInputItems.get(index);
        TravelAddNewPassengerFormV3VO.InputItemVO copy$default = ((inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem) && (newInput instanceof CommonInputV2VO.TextInputV2)) ? TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem.copy$default((TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem) inputItemVO, 0, (CommonInputV2VO.TextInputV2) newInput, null, null, null, 29, null) : ((inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.DateInputItem) && (newInput instanceof CommonInputV2VO.DateInputV2)) ? TravelAddNewPassengerFormV3VO.InputItemVO.DateInputItem.copy$default((TravelAddNewPassengerFormV3VO.InputItemVO.DateInputItem) inputItemVO, 0, (CommonInputV2VO.DateInputV2) newInput, 1, null) : ((inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem) && (newInput instanceof CommonInputV2VO.SelectorV2)) ? TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem.copy$default((TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem) inputItemVO, 0, (CommonInputV2VO.SelectorV2) newInput, 1, null) : ((inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.CheckboxInputItem) && (newInput instanceof CommonInputV2VO.CheckboxV2)) ? TravelAddNewPassengerFormV3VO.InputItemVO.CheckboxInputItem.copy$default((TravelAddNewPassengerFormV3VO.InputItemVO.CheckboxInputItem) inputItemVO, 0, (CommonInputV2VO.CheckboxV2) newInput, 1, null) : ((inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem) && (newInput instanceof CommonInputV2VO.SelectorV2)) ? TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem.copy$default((TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem) inputItemVO, 0, (CommonInputV2VO.SelectorV2) newInput, null, 5, null) : null;
        if (copy$default != null) {
            this.cachedInputItems.set(index, copy$default);
        }
    }

    private final void cleanSuggests(int inputId) {
        Integer num = this.cachedInputItemsIndexes.get(Integer.valueOf(inputId));
        if (num != null) {
            int intValue = num.intValue();
            TravelAddNewPassengerFormV3VO.InputItemVO inputItemVO = this.cachedInputItems.get(intValue);
            if (inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem) {
                this.cachedInputItems.set(intValue, TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem.copy$default((TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem) inputItemVO, 0, null, null, K.f71697a, null, 19, null));
            }
        }
    }

    private final void onBirthCertificateTextInputChanged(String newValue) {
        Integer num;
        CommonInputV2VO.TextInputV2 textInputV2 = this.cachedBirthCertificateTextInput;
        if (textInputV2 == null || (num = this.cachedBirthCertificateIndex) == null) {
            return;
        }
        int intValue = num.intValue();
        CommonInputV2VO.TextInputV2 m1443copyjp_8I2s$default = CommonInputV2VO.TextInputV2.m1443copyjp_8I2s$default(textInputV2, 0, null, newValue, false, null, 0, 0, null, false, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, 268435443, null);
        boolean z11 = m1443copyjp_8I2s$default.getIsErrorVisible() != textInputV2.getIsErrorVisible();
        this.cachedBirthCertificateTextInput = m1443copyjp_8I2s$default;
        changeCachedBirthCertificateTextInput(m1443copyjp_8I2s$default);
        this.actionLiveData.setValue(new Action.NotifyInputChanged(intValue, z11 ? AddNewPassengerFormInputV2Payload.CHANGE_SERIES_TEXT_ERROR : AddNewPassengerFormInputV2Payload.CHANGE_INPUT_DATA, this.cachedInputItems));
        AtomAction onChange = m1443copyjp_8I2s$default.getOnChange();
        if (onChange != null) {
            performOnTextChangeComposerAction(textInputV2.getId(), onChange);
        }
    }

    private final void performOnFocusLostComposerAction(int inputId) {
        AtomAction onFocusLost;
        Long l11;
        CommonInputV2VO commonInputV2VO = this.cachedInputs.get(Integer.valueOf(inputId));
        CommonInputV2VO.TextInputV2 textInputV2 = commonInputV2VO instanceof CommonInputV2VO.TextInputV2 ? (CommonInputV2VO.TextInputV2) commonInputV2VO : null;
        if (textInputV2 == null || (onFocusLost = textInputV2.getOnFocusLost()) == null || !(onFocusLost instanceof AtomAction.ComposerAction) || (l11 = this.widgetId) == null) {
            return;
        }
        long longValue = l11.longValue();
        Map<String, String> prepareParams = prepareParams(inputId, ((AtomAction.ComposerAction) onFocusLost).getParams());
        B0 b02 = this.onTextChangeJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.onFocusLostJob;
        if (b03 != null) {
            b03.j(null);
        }
        if (this.shouldSkipOnFocusLost) {
            this.shouldSkipOnFocusLost = false;
        } else {
            this.onFocusLostJob = C10727i.c(x0.a(this), null, null, new TravelAddNewPassengerFormV3ViewModel$performOnFocusLostComposerAction$1(this, onFocusLost, prepareParams, longValue, null), 3);
        }
    }

    private final void performOnTextChangeComposerAction(int inputId, AtomAction atomAction) {
        Long l11;
        if ((atomAction instanceof AtomAction.ComposerAction) && (l11 = this.widgetId) != null) {
            long longValue = l11.longValue();
            Map<String, String> prepareParams = prepareParams(inputId, ((AtomAction.ComposerAction) atomAction).getParams());
            B0 b02 = this.onTextChangeJob;
            if (b02 != null) {
                b02.j(null);
            }
            B0 b03 = this.onFocusLostJob;
            if (b03 == null || !b03.isActive()) {
                this.onTextChangeJob = C10727i.c(x0.a(this), null, null, new TravelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1(this, atomAction, prepareParams, longValue, null), 3);
            }
        }
    }

    private final String prepareDateInputValue(Bundle bundle) {
        TravelDateSelectorDialogFragment.Companion companion = TravelDateSelectorDialogFragment.INSTANCE;
        int i11 = bundle.getInt("KEY_SELECTED_DAY");
        int i12 = bundle.getInt("KEY_SELECTED_MONTH");
        String h11 = this.visibleDateTimeFormatter.h(new LocalDate(bundle.getInt("KEY_SELECTED_YEAR"), i12 + 1, i11));
        Intrinsics.checkNotNullExpressionValue(h11, "print(...)");
        return h11;
    }

    private final Map<String, String> prepareInputsParams() {
        ArrayList p02 = C7714v.p0(C7714v.c0(this.cachedBirthCertificateTextInput), this.cachedInputs.values());
        int h11 = U.h(C7714v.z(p02, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            CommonInputV2VO commonInputV2VO = (CommonInputV2VO) it.next();
            Pair pair = new Pair(commonInputV2VO.getName(), commonInputV2VO.getValue());
            linkedHashMap.put(pair.e(), pair.f());
        }
        return linkedHashMap;
    }

    private final Map<String, String> prepareParams(int inputId, Map<String, String> oldParams) {
        String str;
        CommonInputV2VO.TextInputV2 textInputV2;
        if (oldParams == null) {
            oldParams = U.c();
        }
        HashMap hashMap = new HashMap(oldParams);
        hashMap.put("inputId", String.valueOf(inputId));
        CommonInputV2VO commonInputV2VO = this.cachedInputs.get(Integer.valueOf(inputId));
        if (commonInputV2VO == null || (str = commonInputV2VO.getValue()) == null) {
            CommonInputV2VO.TextInputV2 textInputV22 = this.cachedBirthCertificateTextInput;
            if (textInputV22 == null || (str = textInputV22.getValue()) == null || (textInputV2 = this.cachedBirthCertificateTextInput) == null || textInputV2.getId() != inputId) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
        }
        hashMap.put("inputValue", str);
        return hashMap;
    }

    private final void setCachedBirthCertificateIndex(Integer num) {
        if (num != null && num.intValue() == -1) {
            num = null;
        }
        this.cachedBirthCertificateIndex = num;
    }

    private final void updateInput(TravelAddNewPassengerFormV3VO.InputItemVO inputItemVO) {
        Integer num = this.cachedInputItemsIndexes.get(Integer.valueOf(inputItemVO.getId()));
        if (num == null) {
            String c11 = Nh.a.c(inputItemVO.getId(), "Wrong inputId - ", " for ", inputItemVO.getInput().getName(), " in TravelAddNewPassengerFormV3ViewModel");
            LoggerExtKt.sendNonFatal$default(new IllegalArgumentException(c11), c11, null, null, 12, null);
        } else {
            this.cachedInputs.put(Integer.valueOf(inputItemVO.getId()), inputItemVO.getInput());
            this.cachedInputItems.set(num.intValue(), inputItemVO);
            this.actionLiveData.setValue(new Action.NotifyInputChanged(num.intValue(), null, this.cachedInputItems, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateInputs(List<? extends TravelAddNewPassengerFormV3VO.InputItemVO> inputsVO, boolean shouldUpdateTextValue) {
        for (TravelAddNewPassengerFormV3VO.InputItemVO inputItemVO : inputsVO) {
            if (inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem) {
                TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem textInputItem = (TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem) inputItemVO;
                Integer num = this.cachedInputItemsIndexes.get(Integer.valueOf(textInputItem.getId()));
                if (num == null) {
                    String a11 = E.a(textInputItem.getId(), "Wrong inputId - ", " for TextInputItem in TravelAddNewPassengerFormV3ViewModel");
                    LoggerExtKt.sendNonFatal$default(new IllegalArgumentException(a11), a11, null, null, 12, null);
                } else {
                    this.cachedInputs.put(Integer.valueOf(textInputItem.getId()), textInputItem.getInput());
                    this.cachedInputItems.set(num.intValue(), inputItemVO);
                    this.actionLiveData.setValue(new Action.NotifyInputChanged(num.intValue(), shouldUpdateTextValue ? null : AddNewPassengerFormInputV2Payload.CHANGE_SUGGESTS, this.cachedInputItems));
                }
            } else if (inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem) {
                TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem selectorInputItem = (TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem) inputItemVO;
                Integer num2 = this.cachedInputItemsIndexes.get(Integer.valueOf(selectorInputItem.getId()));
                if (num2 == null) {
                    String a12 = E.a(selectorInputItem.getId(), "Wrong inputId - ", " for SelectorInputItem in TravelAddNewPassengerFormV3ViewModel");
                    LoggerExtKt.sendNonFatal$default(new IllegalArgumentException(a12), a12, null, null, 12, null);
                } else {
                    CommonInputV2VO commonInputV2VO = this.cachedInputs.get(Integer.valueOf(selectorInputItem.getId()));
                    String value = commonInputV2VO != null ? commonInputV2VO.getValue() : null;
                    if (value == null || value.length() == 0) {
                        this.cachedInputs.put(Integer.valueOf(selectorInputItem.getId()), selectorInputItem.getInput());
                        this.cachedInputItems.set(num2.intValue(), inputItemVO);
                        this.actionLiveData.setValue(new Action.NotifyInputChanged(num2.intValue(), null, this.cachedInputItems, 2, null));
                    }
                }
            } else if (inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.CheckboxInputItem) {
                updateInput(inputItemVO);
            } else if (inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem) {
                updateInput(inputItemVO);
            } else {
                if (!(inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.DateInputItem)) {
                    throw new o();
                }
                updateInput(inputItemVO);
            }
        }
    }

    public final void bindInputs(@NotNull List<? extends TravelAddNewPassengerFormV3VO.InputItemVO> inputItems, long widgetId) {
        Intrinsics.checkNotNullParameter(inputItems, "inputItems");
        this.widgetId = Long.valueOf(widgetId);
        this.cachedInputItems = C7714v.W0(inputItems);
        List<? extends TravelAddNewPassengerFormV3VO.InputItemVO> list = inputItems;
        int h11 = U.h(C7714v.z(list, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (TravelAddNewPassengerFormV3VO.InputItemVO inputItemVO : list) {
            linkedHashMap.put(Integer.valueOf(inputItemVO.getId()), inputItemVO.getInput());
        }
        this.cachedInputs = U.u(linkedHashMap);
        O a12 = C7714v.a1(list);
        int h12 = U.h(C7714v.z(a12, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h12 >= 16 ? h12 : 16);
        Iterator it = a12.iterator();
        while (true) {
            P p11 = (P) it;
            if (!p11.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) p11.next();
            linkedHashMap2.put(Integer.valueOf(((TravelAddNewPassengerFormV3VO.InputItemVO) indexedValue.d()).getId()), Integer.valueOf(indexedValue.c()));
        }
        this.cachedInputItemsIndexes = linkedHashMap2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem) {
                arrayList.add(obj);
            }
        }
        TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem birthCertificateInputItem = (TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem) C7714v.M(arrayList);
        this.cachedBirthCertificateTextInput = birthCertificateInputItem != null ? birthCertificateInputItem.getSeriesTextInput() : null;
        Iterator<? extends TravelAddNewPassengerFormV3VO.InputItemVO> it2 = inputItems.iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            } else if (it2.next() instanceof TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem) {
                break;
            } else {
                i11++;
            }
        }
        setCachedBirthCertificateIndex(Integer.valueOf(i11));
        this.actionLiveData.setValue(new Action.SubmitInputItems(this.cachedInputItems));
    }

    @NotNull
    public final SingleLiveEvent<Action> getActionLiveData() {
        return this.actionLiveData;
    }

    public final void onCheckboxChanged(int inputId, boolean newValue) {
        Integer num;
        CommonInputV2VO commonInputV2VO = this.cachedInputs.get(Integer.valueOf(inputId));
        CommonInputV2VO.CheckboxV2 checkboxV2 = commonInputV2VO instanceof CommonInputV2VO.CheckboxV2 ? (CommonInputV2VO.CheckboxV2) commonInputV2VO : null;
        if (checkboxV2 == null || (num = this.cachedInputItemsIndexes.get(Integer.valueOf(inputId))) == null) {
            return;
        }
        int intValue = num.intValue();
        CommonInputV2VO.CheckboxV2 copy$default = CommonInputV2VO.CheckboxV2.copy$default(checkboxV2, 0, null, false, null, null, newValue, false, null, false, 475, null);
        boolean z11 = copy$default.getIsErrorVisible() != checkboxV2.getIsErrorVisible();
        this.cachedInputs.put(Integer.valueOf(inputId), copy$default);
        changeInputItemInCash(intValue, copy$default);
        if (z11) {
            this.actionLiveData.setValue(new Action.NotifyInputChanged(intValue, AddNewPassengerFormInputV2Payload.CHANGE_ERROR, this.cachedInputItems));
        }
        AtomAction onChange = checkboxV2.getOnChange();
        if (onChange == null || !(onChange instanceof AtomAction.ComposerAction)) {
            return;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) onChange;
        Map<String, String> params = composerAction.getParams();
        if (params == null) {
            params = U.c();
        }
        HashMap hashMap = new HashMap(params);
        hashMap.put("inputId", String.valueOf(inputId));
        CommonInputV2VO commonInputV2VO2 = this.cachedInputs.get(Integer.valueOf(inputId));
        CommonInputV2VO.CheckboxV2 checkboxV22 = commonInputV2VO2 instanceof CommonInputV2VO.CheckboxV2 ? (CommonInputV2VO.CheckboxV2) commonInputV2VO2 : null;
        if (checkboxV22 == null) {
            return;
        }
        hashMap.put("inputValue", String.valueOf(checkboxV22.getIsSelected()));
        this.actionLiveData.setValue(new Action.HandleAction(AtomAction.ComposerAction.copy$default(composerAction, null, null, hashMap, null, null, 27, null)));
    }

    public final void onDateInputClicked(int inputId) {
        this.requestedChangeInputId = Integer.valueOf(inputId);
        CommonInputV2VO commonInputV2VO = this.cachedInputs.get(Integer.valueOf(inputId));
        CommonInputV2VO.DateInputV2 dateInputV2 = commonInputV2VO instanceof CommonInputV2VO.DateInputV2 ? (CommonInputV2VO.DateInputV2) commonInputV2VO : null;
        if (dateInputV2 == null) {
            return;
        }
        String value = dateInputV2.getValue();
        if (h.K(value)) {
            value = null;
        }
        LocalDate e11 = value != null ? this.visibleDateTimeFormatter.e(value) : null;
        SingleLiveEvent<Action> singleLiveEvent = this.actionLiveData;
        String placeholder = dateInputV2.getPlaceholder();
        Integer valueOf = e11 != null ? Integer.valueOf(e11.i()) : null;
        Integer valueOf2 = e11 != null ? Integer.valueOf(e11.n() - 1) : null;
        Integer valueOf3 = e11 != null ? Integer.valueOf(e11.s()) : null;
        CommonInputV2VO.DateInputV2.DateRangeV2 dateRange = dateInputV2.getDateRange();
        Long valueOf4 = dateRange != null ? Long.valueOf(dateRange.getDateStart()) : null;
        CommonInputV2VO.DateInputV2.DateRangeV2 dateRange2 = dateInputV2.getDateRange();
        singleLiveEvent.setValue(new Action.ShowDateSelector(placeholder, valueOf, valueOf2, valueOf3, valueOf4, dateRange2 != null ? Long.valueOf(dateRange2.getDateEnd()) : null));
    }

    public final void onDateValueSelected(@NotNull Bundle bundle) {
        Integer num;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Integer num2 = this.requestedChangeInputId;
        if (num2 != null) {
            int intValue = num2.intValue();
            CommonInputV2VO commonInputV2VO = this.cachedInputs.get(num2);
            CommonInputV2VO.DateInputV2 dateInputV2 = commonInputV2VO instanceof CommonInputV2VO.DateInputV2 ? (CommonInputV2VO.DateInputV2) commonInputV2VO : null;
            if (dateInputV2 == null || (num = this.cachedInputItemsIndexes.get(num2)) == null) {
                return;
            }
            int intValue2 = num.intValue();
            CommonInputV2VO.DateInputV2 copy$default = CommonInputV2VO.DateInputV2.copy$default(dateInputV2, 0, null, prepareDateInputValue(bundle), false, null, null, false, null, null, null, null, null, null, 8179, null);
            this.cachedInputs.put(num2, copy$default);
            changeInputItemInCash(intValue2, copy$default);
            this.actionLiveData.setValue(new Action.NotifyInputChanged(intValue2, null, this.cachedInputItems, 2, null));
            AtomAction onChange = dateInputV2.getOnChange();
            if (onChange == null || !(onChange instanceof AtomAction.ComposerAction)) {
                return;
            }
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) onChange;
            this.actionLiveData.setValue(new Action.HandleAction(AtomAction.ComposerAction.copy$default(composerAction, null, null, prepareParams(intValue, composerAction.getParams()), null, null, 27, null)));
        }
    }

    public final void onSelectorClicked(int inputId) {
        this.requestedChangeInputId = Integer.valueOf(inputId);
        CommonInputV2VO commonInputV2VO = this.cachedInputs.get(Integer.valueOf(inputId));
        CommonInputV2VO.SelectorV2 selectorV2 = commonInputV2VO instanceof CommonInputV2VO.SelectorV2 ? (CommonInputV2VO.SelectorV2) commonInputV2VO : null;
        if (selectorV2 == null) {
            return;
        }
        t clickEvent = selectorV2.getClickEvent();
        if (clickEvent != null) {
            this.actionLiveData.setValue(new Action.SendAnalytics(clickEvent));
        }
        List<CommonInputV2VO.SelectorV2.OptionV2> options = selectorV2.getOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(options, 10));
        for (CommonInputV2VO.SelectorV2.OptionV2 optionV2 : options) {
            arrayList.add(new SelectorItem(optionV2.getCode(), optionV2.getValue(), Intrinsics.d(selectorV2.getValue(), optionV2.getCode())));
        }
        this.actionLiveData.setValue(new Action.ShowSelector(selectorV2.getPlaceholder(), arrayList));
    }

    public final void onSelectorValueSelected(@NotNull SelectorItem selectedItem) {
        Integer num;
        CommonInputV2VO.SelectorV2 copy;
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Integer num2 = this.requestedChangeInputId;
        if (num2 != null) {
            int intValue = num2.intValue();
            CommonInputV2VO commonInputV2VO = this.cachedInputs.get(num2);
            CommonInputV2VO.SelectorV2 selectorV2 = commonInputV2VO instanceof CommonInputV2VO.SelectorV2 ? (CommonInputV2VO.SelectorV2) commonInputV2VO : null;
            if (selectorV2 == null || (num = this.cachedInputItemsIndexes.get(num2)) == null) {
                return;
            }
            int intValue2 = num.intValue();
            copy = selectorV2.copy((r34 & 1) != 0 ? selectorV2.id : 0, (r34 & 2) != 0 ? selectorV2.name : null, (r34 & 4) != 0 ? selectorV2.value : selectedItem.getCode(), (r34 & 8) != 0 ? selectorV2.isErrorVisible : false, (r34 & 16) != 0 ? selectorV2.error : null, (r34 & 32) != 0 ? selectorV2.text : selectedItem.getName(), (r34 & 64) != 0 ? selectorV2.placeholder : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? selectorV2.isEnabled : false, (r34 & 256) != 0 ? selectorV2.options : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? selectorV2.onChange : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? selectorV2.defaultOption : null, (r34 & 2048) != 0 ? selectorV2.onClick : null, (r34 & 4096) != 0 ? selectorV2.clickEvent : null, (r34 & 8192) != 0 ? selectorV2.rightIcon : null, (r34 & 16384) != 0 ? selectorV2.leftIcon : null, (r34 & 32768) != 0 ? selectorV2.label : null);
            this.cachedInputs.put(num2, copy);
            changeInputItemInCash(intValue2, copy);
            this.actionLiveData.setValue(new Action.NotifyInputChanged(intValue2, null, this.cachedInputItems, 2, null));
            AtomAction onChange = selectorV2.getOnChange();
            if (onChange == null || !(onChange instanceof AtomAction.ComposerAction)) {
                return;
            }
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) onChange;
            this.actionLiveData.setValue(new Action.HandleAction(AtomAction.ComposerAction.copy$default(composerAction, null, null, prepareParams(intValue, composerAction.getParams()), null, null, 27, null)));
        }
    }

    public final void onTextInputChanged(int inputId, @NotNull String oldValue, CharSequence newValue, boolean shouldInvokeAction) {
        String obj;
        AtomAction onChange;
        t textChangeEvent;
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        if (newValue == null || (obj = newValue.toString()) == null || obj.equals(oldValue)) {
            return;
        }
        CommonInputV2VO commonInputV2VO = this.cachedInputs.get(Integer.valueOf(inputId));
        CommonInputV2VO.TextInputV2 textInputV2 = commonInputV2VO instanceof CommonInputV2VO.TextInputV2 ? (CommonInputV2VO.TextInputV2) commonInputV2VO : null;
        if (textInputV2 == null) {
            onBirthCertificateTextInputChanged(obj);
            CommonInputV2VO.TextInputV2 textInputV22 = this.cachedBirthCertificateTextInput;
            if (textInputV22 == null || (textChangeEvent = textInputV22.getTextChangeEvent()) == null) {
                return;
            }
            this.actionLiveData.setValue(new Action.SendAnalytics(textChangeEvent));
            return;
        }
        t textChangeEvent2 = textInputV2.getTextChangeEvent();
        if (textChangeEvent2 != null) {
            this.actionLiveData.setValue(new Action.SendAnalytics(textChangeEvent2));
        }
        Integer num = this.cachedInputItemsIndexes.get(Integer.valueOf(inputId));
        if (num != null) {
            int intValue = num.intValue();
            CommonInputV2VO.TextInputV2 m1443copyjp_8I2s$default = CommonInputV2VO.TextInputV2.m1443copyjp_8I2s$default(textInputV2, 0, null, obj, false, null, 0, 0, null, false, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, 268435443, null);
            boolean z11 = m1443copyjp_8I2s$default.getIsErrorVisible() != textInputV2.getIsErrorVisible();
            this.cachedInputs.put(Integer.valueOf(inputId), m1443copyjp_8I2s$default);
            changeInputItemInCash(intValue, m1443copyjp_8I2s$default);
            this.actionLiveData.setValue(new Action.NotifyInputChanged(intValue, z11 ? AddNewPassengerFormInputV2Payload.CHANGE_ERROR : AddNewPassengerFormInputV2Payload.CHANGE_INPUT_DATA, this.cachedInputItems));
            if (!shouldInvokeAction || (onChange = m1443copyjp_8I2s$default.getOnChange()) == null) {
                return;
            }
            performOnTextChangeComposerAction(inputId, onChange);
        }
    }

    public final void onTextInputFocusLost(int inputId, @NotNull String oldValue, CharSequence newValue) {
        String obj;
        Integer num;
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        cleanSuggests(inputId);
        if (newValue == null || (obj = newValue.toString()) == null) {
            return;
        }
        if (!obj.equals(oldValue)) {
            CommonInputV2VO commonInputV2VO = this.cachedInputs.get(Integer.valueOf(inputId));
            CommonInputV2VO.TextInputV2 textInputV2 = commonInputV2VO instanceof CommonInputV2VO.TextInputV2 ? (CommonInputV2VO.TextInputV2) commonInputV2VO : null;
            if (textInputV2 == null || (num = this.cachedInputItemsIndexes.get(Integer.valueOf(inputId))) == null) {
                return;
            }
            int intValue = num.intValue();
            CommonInputV2VO.TextInputV2 m1443copyjp_8I2s$default = CommonInputV2VO.TextInputV2.m1443copyjp_8I2s$default(textInputV2, 0, null, obj, false, null, 0, 0, null, false, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, 268435443, null);
            boolean z11 = m1443copyjp_8I2s$default.getIsErrorVisible() != textInputV2.getIsErrorVisible();
            this.cachedInputs.put(Integer.valueOf(inputId), m1443copyjp_8I2s$default);
            changeInputItemInCash(intValue, m1443copyjp_8I2s$default);
            this.actionLiveData.setValue(new Action.NotifyInputChanged(intValue, z11 ? AddNewPassengerFormInputV2Payload.CHANGE_ERROR : AddNewPassengerFormInputV2Payload.CHANGE_INPUT_DATA, this.cachedInputItems));
        }
        if (obj.length() <= 0 || oldValue.length() <= 0) {
            return;
        }
        performOnFocusLostComposerAction(inputId);
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

    public final void setShouldSkipOnFocusLost() {
        this.shouldSkipOnFocusLost = true;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action;", "", "HandleAction", "SendAnalytics", "ShowSelector", "ShowDateSelector", "SubmitInputItems", "NotifyInputChanged", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$HandleAction;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$NotifyInputChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$SendAnalytics;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$ShowDateSelector;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$ShowSelector;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$SubmitInputItems;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$HandleAction;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HandleAction implements Action {

            @NotNull
            private final AtomAction atomAction;

            public HandleAction(@NotNull AtomAction atomAction) {
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

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$SendAnalytics;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "<init>", "(LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getEvent", "()LWZ/t;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SendAnalytics implements Action {

            @NotNull
            private final t event;

            public SendAnalytics(@NotNull t event) {
                Intrinsics.checkNotNullParameter(event, "event");
                this.event = event;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendAnalytics) && Intrinsics.d(this.event, ((SendAnalytics) other).event);
            }

            @NotNull
            public final t getEvent() {
                return this.event;
            }

            public int hashCode() {
                return this.event.hashCode();
            }

            @NotNull
            public String toString() {
                return "SendAnalytics(event=" + this.event + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$ShowDateSelector;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action;", "", "selectorTitle", "", "selectedDay", "selectedMonth", "selectedYear", "", "startDateMillis", "endDateMillis", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectorTitle", "Ljava/lang/Integer;", "getSelectedDay", "()Ljava/lang/Integer;", "getSelectedMonth", "getSelectedYear", "Ljava/lang/Long;", "getStartDateMillis", "()Ljava/lang/Long;", "getEndDateMillis", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowDateSelector implements Action {
            private final Long endDateMillis;
            private final Integer selectedDay;
            private final Integer selectedMonth;
            private final Integer selectedYear;
            private final String selectorTitle;
            private final Long startDateMillis;

            public ShowDateSelector(String str, Integer num, Integer num2, Integer num3, Long l11, Long l12) {
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
                StringBuilder b11 = J0.P.b("ShowDateSelector(selectorTitle=", str, num, ", selectedDay=", ", selectedMonth=");
                Ef0.c.e(b11, num2, ", selectedYear=", num3, ", startDateMillis=");
                b11.append(l11);
                b11.append(", endDateMillis=");
                b11.append(l12);
                b11.append(")");
                return b11.toString();
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$ShowSelector;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action;", "", "selectorTitle", "", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectorTitle", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowSelector implements Action {

            @NotNull
            private final List<SelectorItem> items;

            @NotNull
            private final String selectorTitle;

            public ShowSelector(@NotNull String selectorTitle, @NotNull List<SelectorItem> items) {
                Intrinsics.checkNotNullParameter(selectorTitle, "selectorTitle");
                Intrinsics.checkNotNullParameter(items, "items");
                this.selectorTitle = selectorTitle;
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
            public final List<SelectorItem> getItems() {
                return this.items;
            }

            @NotNull
            public final String getSelectorTitle() {
                return this.selectorTitle;
            }

            public int hashCode() {
                return this.items.hashCode() + (this.selectorTitle.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return C2439a.a("ShowSelector(selectorTitle=", this.selectorTitle, ", items=", ")", this.items);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$SubmitInputItems;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "inputItems", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInputItems", "()Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SubmitInputItems implements Action {

            @NotNull
            private final List<TravelAddNewPassengerFormV3VO.InputItemVO> inputItems;

            /* JADX WARN: Multi-variable type inference failed */
            public SubmitInputItems(@NotNull List<? extends TravelAddNewPassengerFormV3VO.InputItemVO> inputItems) {
                Intrinsics.checkNotNullParameter(inputItems, "inputItems");
                this.inputItems = inputItems;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubmitInputItems) && Intrinsics.d(this.inputItems, ((SubmitInputItems) other).inputItems);
            }

            @NotNull
            public final List<TravelAddNewPassengerFormV3VO.InputItemVO> getInputItems() {
                return this.inputItems;
            }

            public int hashCode() {
                return this.inputItems.hashCode();
            }

            @NotNull
            public String toString() {
                return H3.c.a("SubmitInputItems(inputItems=", ")", this.inputItems);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action$NotifyInputChanged;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action;", "", "inputPosition", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/AddNewPassengerFormInputV2Payload;", "payload", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "inputItems", "<init>", "(ILru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/AddNewPassengerFormInputV2Payload;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getInputPosition", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/AddNewPassengerFormInputV2Payload;", "getPayload", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/AddNewPassengerFormInputV2Payload;", "Ljava/util/List;", "getInputItems", "()Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NotifyInputChanged implements Action {

            @NotNull
            private final List<TravelAddNewPassengerFormV3VO.InputItemVO> inputItems;
            private final int inputPosition;
            private final AddNewPassengerFormInputV2Payload payload;

            /* JADX WARN: Multi-variable type inference failed */
            public NotifyInputChanged(int i11, AddNewPassengerFormInputV2Payload addNewPassengerFormInputV2Payload, @NotNull List<? extends TravelAddNewPassengerFormV3VO.InputItemVO> inputItems) {
                Intrinsics.checkNotNullParameter(inputItems, "inputItems");
                this.inputPosition = i11;
                this.payload = addNewPassengerFormInputV2Payload;
                this.inputItems = inputItems;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotifyInputChanged)) {
                    return false;
                }
                NotifyInputChanged notifyInputChanged = (NotifyInputChanged) other;
                return this.inputPosition == notifyInputChanged.inputPosition && this.payload == notifyInputChanged.payload && Intrinsics.d(this.inputItems, notifyInputChanged.inputItems);
            }

            @NotNull
            public final List<TravelAddNewPassengerFormV3VO.InputItemVO> getInputItems() {
                return this.inputItems;
            }

            public final int getInputPosition() {
                return this.inputPosition;
            }

            public final AddNewPassengerFormInputV2Payload getPayload() {
                return this.payload;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.inputPosition) * 31;
                AddNewPassengerFormInputV2Payload addNewPassengerFormInputV2Payload = this.payload;
                return this.inputItems.hashCode() + ((hashCode + (addNewPassengerFormInputV2Payload == null ? 0 : addNewPassengerFormInputV2Payload.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                int i11 = this.inputPosition;
                AddNewPassengerFormInputV2Payload addNewPassengerFormInputV2Payload = this.payload;
                List<TravelAddNewPassengerFormV3VO.InputItemVO> list = this.inputItems;
                StringBuilder sb2 = new StringBuilder("NotifyInputChanged(inputPosition=");
                sb2.append(i11);
                sb2.append(", payload=");
                sb2.append(addNewPassengerFormInputV2Payload);
                sb2.append(", inputItems=");
                return C2618u.h(sb2, list, ")");
            }

            public /* synthetic */ NotifyInputChanged(int i11, AddNewPassengerFormInputV2Payload addNewPassengerFormInputV2Payload, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, (i12 & 2) != 0 ? null : addNewPassengerFormInputV2Payload, list);
            }
        }
    }
}
