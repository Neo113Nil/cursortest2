package ru.ozon.app.android.travel.molecules.input.v1.mapper;

import Sc.o;
import WZ.t;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "", "isLastInput", "", "widgetId", "", "index", "", "uniqueString", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "toVO", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;Ljava/lang/Boolean;Ljava/lang/Long;ILjava/lang/String;)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "dto", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "mapTextInput", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;Ljava/lang/Boolean;Ljava/lang/Long;ILjava/lang/String;)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;", "mapDateInput", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;ILjava/lang/String;)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Checkbox;", "mapCheckboxInput", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;ILjava/lang/String;)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Checkbox;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;", "mapSelectInput", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;Ljava/lang/Long;ILjava/lang/String;)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$InputType;", "type", "isMultiline", "mapInputType", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$InputType;Z)I", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$SelectorOption;", "selectorOption", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector$Option;", "mapOption", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$SelectorOption;)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector$Option;", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$DateRange;", "dateRange", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO$DateRange;", "mapDateRange", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO$DateRange;)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO$DateRange;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonInputMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonInputDTO.InputType.values().length];
            try {
                iArr[CommonInputDTO.InputType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonInputDTO.InputType.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonInputDTO.InputType.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonInputDTO.InputType.TELEPHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommonInputDTO.InputType.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommonInputDTO.InputType.DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CommonInputDTO.InputType.CHECKBOX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CommonInputDTO.InputType.SELECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final CommonInputVO.Checkbox mapCheckboxInput(CommonInputDTO commonInputDTO, int i11, String str) {
        long hashCode = ("Checkbox" + i11 + str).hashCode();
        String name = commonInputDTO.getName();
        String subtext = commonInputDTO.getSubtext();
        if (subtext == null) {
            subtext = "";
        }
        String str2 = subtext;
        String value = commonInputDTO.getValue();
        boolean z11 = !(value == null || value.length() == 0);
        boolean z12 = !commonInputDTO.isDisabled();
        boolean isInvalid = commonInputDTO.isInvalid();
        List<String> errors = commonInputDTO.getErrors();
        String V11 = errors != null ? C7714v.V(errors, "\n", null, null, null, 62) : null;
        AtomActionDTO selectedAction = commonInputDTO.getSelectedAction();
        AtomAction atomAction = selectedAction != null ? AtomActionMapperKt.toAtomAction(selectedAction, commonInputDTO.getTrackingInfo()) : null;
        String defaultValue = commonInputDTO.getDefaultValue();
        return new CommonInputVO.Checkbox(hashCode, name, isInvalid, V11, commonInputDTO.getScrollOnMount(), str2, z11, z12, atomAction, !(defaultValue == null || defaultValue.length() == 0));
    }

    private static final CommonInputVO.DateCommonInputVO mapDateInput(CommonInputDTO commonInputDTO, int i11, String str) {
        long hashCode = ("DateInput" + i11 + str).hashCode();
        String name = commonInputDTO.getName();
        String value = commonInputDTO.getValue();
        String str2 = value == null ? "" : value;
        String placeholder = commonInputDTO.getPlaceholder();
        String str3 = placeholder == null ? "" : placeholder;
        boolean z11 = !commonInputDTO.isDisabled();
        CommonInputVO.DateCommonInputVO.DateRange mapDateRange = mapDateRange(commonInputDTO.getRange());
        boolean isInvalid = commonInputDTO.isInvalid();
        List<String> errors = commonInputDTO.getErrors();
        String V11 = errors != null ? C7714v.V(errors, "\n", null, null, null, 62) : null;
        AtomActionDTO selectedAction = commonInputDTO.getSelectedAction();
        AtomAction atomAction = selectedAction != null ? AtomActionMapperKt.toAtomAction(selectedAction, commonInputDTO.getTrackingInfo()) : null;
        String defaultValue = commonInputDTO.getDefaultValue();
        return new CommonInputVO.DateCommonInputVO(hashCode, name, str2, isInvalid, V11, commonInputDTO.getScrollOnMount(), str3, z11, mapDateRange, atomAction, defaultValue == null ? "" : defaultValue, null, null, 6144, null);
    }

    private static final CommonInputVO.DateCommonInputVO.DateRange mapDateRange(CommonInputDTO.DateRange dateRange) {
        if (dateRange == null) {
            return null;
        }
        DateTime start = dateRange.getStart();
        start.getClass();
        long time = new Date(start.getMillis()).getTime();
        DateTime finish = dateRange.getFinish();
        finish.getClass();
        return new CommonInputVO.DateCommonInputVO.DateRange(time, new Date(finish.getMillis()).getTime());
    }

    private static final int mapInputType(CommonInputDTO.InputType inputType, boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        if (i11 == 1) {
            return 2;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 32;
        }
        if (i11 != 4) {
            return z11 ? 147457 : 8193;
        }
        return 3;
    }

    private static final CommonInputVO.Selector.Option mapOption(CommonInputDTO.SelectorOption selectorOption) {
        return new CommonInputVO.Selector.Option(selectorOption.getCode(), selectorOption.getValue());
    }

    private static final CommonInputVO.Selector mapSelectInput(CommonInputDTO commonInputDTO, Long l11, int i11, String str) {
        Object obj;
        Object obj2;
        List<CommonInputDTO.SelectorOption> options = commonInputDTO.getOptions();
        if (options == null) {
            return null;
        }
        List<CommonInputDTO.SelectorOption> list = options;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapOption((CommonInputDTO.SelectorOption) it.next()));
        }
        long hashCode = ("Selector" + i11 + str).hashCode();
        String name = commonInputDTO.getName();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.d(((CommonInputVO.Selector.Option) obj).getValue(), commonInputDTO.getValue())) {
                break;
            }
        }
        CommonInputVO.Selector.Option option = (CommonInputVO.Selector.Option) obj;
        String code = option != null ? option.getCode() : null;
        String str2 = code == null ? "" : code;
        String value = commonInputDTO.getValue();
        String str3 = value == null ? "" : value;
        String placeholder = commonInputDTO.getPlaceholder();
        String str4 = placeholder == null ? "" : placeholder;
        boolean z11 = !commonInputDTO.isDisabled();
        boolean isInvalid = commonInputDTO.isInvalid();
        List<String> errors = commonInputDTO.getErrors();
        String V11 = errors != null ? C7714v.V(errors, "\n", null, null, null, 62) : null;
        AtomActionDTO selectedAction = commonInputDTO.getSelectedAction();
        AtomAction atomAction = selectedAction != null ? AtomActionMapperKt.toAtomAction(selectedAction, commonInputDTO.getTrackingInfo()) : null;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            if (Intrinsics.d(((CommonInputVO.Selector.Option) obj2).getValue(), commonInputDTO.getDefaultValue())) {
                break;
            }
        }
        CommonInputVO.Selector.Option option2 = (CommonInputVO.Selector.Option) obj2;
        Map<String, TokenizedTrackingInfo> trackingInfo = commonInputDTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, l11, null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> selectTrackingInfo = commonInputDTO.getSelectTrackingInfo();
        return new CommonInputVO.Selector(hashCode, name, str2, isInvalid, V11, commonInputDTO.getScrollOnMount(), str3, str4, z11, arrayList, atomAction, option2, tokenizedEvent$default, selectTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(selectTrackingInfo, l11, null, 2, null) : null, null, null, 49152, null);
    }

    private static final CommonInputVO.TextCommonInputVO mapTextInput(CommonInputDTO commonInputDTO, Boolean bool, Long l11, int i11, String str) {
        long hashCode = ("TextInput" + i11 + str).hashCode();
        String name = commonInputDTO.getName();
        String value = commonInputDTO.getValue();
        String str2 = value == null ? "" : value;
        int mapInputType = mapInputType(commonInputDTO.getType(), commonInputDTO.isMultiline());
        String placeholder = commonInputDTO.getPlaceholder();
        String str3 = placeholder == null ? "" : placeholder;
        boolean z11 = !commonInputDTO.isDisabled();
        boolean isInvalid = commonInputDTO.isInvalid();
        List<String> errors = commonInputDTO.getErrors();
        String V11 = errors != null ? C7714v.V(errors, "\n", null, null, null, 62) : null;
        String mask = commonInputDTO.getMask();
        String Y11 = mask != null ? h.Y(mask, '#', '_') : null;
        AtomActionDTO onChange = commonInputDTO.getOnChange();
        AtomAction atomAction = onChange != null ? AtomActionMapperKt.toAtomAction(onChange, null) : null;
        boolean isMultiline = commonInputDTO.isMultiline();
        int i12 = Intrinsics.d(bool, Boolean.TRUE) ? 6 : 5;
        Map<String, TokenizedTrackingInfo> trackingInfo = commonInputDTO.getTrackingInfo();
        String str4 = V11;
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, l11, null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> unfocusedTrackingInfo = commonInputDTO.getUnfocusedTrackingInfo();
        t tokenizedEvent$default2 = unfocusedTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(unfocusedTrackingInfo, l11, null, 2, null) : null;
        Integer maxLength = commonInputDTO.getMaxLength();
        String defaultValue = commonInputDTO.getDefaultValue();
        return new CommonInputVO.TextCommonInputVO(hashCode, name, str2, isInvalid, str4, commonInputDTO.getScrollOnMount(), mapInputType, str3, z11, Y11, atomAction, isMultiline, i12, tokenizedEvent$default, tokenizedEvent$default2, maxLength, defaultValue == null ? "" : defaultValue, false, null, null, commonInputDTO.getFocusOnMount(), 917504, null);
    }

    public static final CommonInputVO toVO(@NotNull CommonInputDTO commonInputDTO, Boolean bool, Long l11, int i11, String str) {
        Intrinsics.checkNotNullParameter(commonInputDTO, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[commonInputDTO.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return mapTextInput(commonInputDTO, bool, l11, i11, str);
            case 6:
                return mapDateInput(commonInputDTO, i11, str);
            case 7:
                return mapCheckboxInput(commonInputDTO, i11, str);
            case 8:
                return mapSelectInput(commonInputDTO, l11, i11, str);
            default:
                throw new o();
        }
    }

    public static /* synthetic */ CommonInputVO toVO$default(CommonInputDTO commonInputDTO, Boolean bool, Long l11, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = null;
        }
        if ((i12 & 2) != 0) {
            l11 = null;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            str = null;
        }
        return toVO(commonInputDTO, bool, l11, i11, str);
    }
}
