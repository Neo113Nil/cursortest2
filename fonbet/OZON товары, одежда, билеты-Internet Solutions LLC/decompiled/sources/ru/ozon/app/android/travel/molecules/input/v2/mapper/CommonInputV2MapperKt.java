package ru.ozon.app.android.travel.molecules.input.v2.mapper;

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
import ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0001H\u0002¢\u0006\u0004\b \u0010!\u001a\u0019\u0010#\u001a\u00020\"2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010.\u001a\u0011\u00100\u001a\u00020/*\u00020\u0005¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "", "isLastInput", "", "widgetId", "", "inputId", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;", "toVO", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;Ljava/lang/Boolean;Ljava/lang/Long;I)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;", "dto", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "mapTextInput", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;Ljava/lang/Boolean;Ljava/lang/Long;I)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2;", "mapDateInput", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;I)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;", "mapCheckboxInput", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;I)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "mapSelectInput", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;ILjava/lang/Long;)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputType;", "type", "isMultiline", "mapInputType", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputType;Z)I", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputStatus;", "status", "isReadOnly", "Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;", "mapInputStatus", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputStatus;Z)Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;", "LQ1/w;", "mapKeyboardType", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$InputType;)I", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$SelectorOptionV2;", "selectorOption", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2$OptionV2;", "mapOption", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$SelectorOptionV2;)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2$OptionV2;", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$DateRangeV2;", "dateRange", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2$DateRangeV2;", "mapDateRange", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO$DateRangeV2;)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2$DateRangeV2;", "LQ1/v;", "toKeyboardCapitalization", "(I)I", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonInputV2MapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CommonInputV2DTO.InputType.values().length];
            try {
                iArr[CommonInputV2DTO.InputType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonInputV2DTO.InputType.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonInputV2DTO.InputType.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonInputV2DTO.InputType.TELEPHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommonInputV2DTO.InputType.DIGITAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommonInputV2DTO.InputType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CommonInputV2DTO.InputType.DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CommonInputV2DTO.InputType.CHECKBOX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CommonInputV2DTO.InputType.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CommonInputV2DTO.InputStatus.values().length];
            try {
                iArr2[CommonInputV2DTO.InputStatus.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CommonInputV2DTO.InputStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CommonInputV2DTO.InputStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final CommonInputV2VO.CheckboxV2 mapCheckboxInput(CommonInputV2DTO commonInputV2DTO, int i11) {
        String name = commonInputV2DTO.getName();
        String subtext = commonInputV2DTO.getSubtext();
        if (subtext == null) {
            subtext = "";
        }
        String str = subtext;
        boolean checked = commonInputV2DTO.getChecked();
        boolean z11 = !commonInputV2DTO.isDisabled();
        boolean isInvalid = commonInputV2DTO.isInvalid();
        List<String> errors = commonInputV2DTO.getErrors();
        String V11 = errors != null ? C7714v.V(errors, "\n", null, null, null, 62) : null;
        AtomActionDTO onChange = commonInputV2DTO.getOnChange();
        AtomAction atomAction = onChange != null ? AtomActionMapperKt.toAtomAction(onChange, commonInputV2DTO.getTrackingInfo()) : null;
        String defaultValue = commonInputV2DTO.getDefaultValue();
        return new CommonInputV2VO.CheckboxV2(i11, name, isInvalid, V11, str, checked, z11, atomAction, !(defaultValue == null || defaultValue.length() == 0));
    }

    private static final CommonInputV2VO.DateInputV2 mapDateInput(CommonInputV2DTO commonInputV2DTO, int i11) {
        String name = commonInputV2DTO.getName();
        String value = commonInputV2DTO.getValue();
        String str = value == null ? "" : value;
        String placeholder = commonInputV2DTO.getPlaceholder();
        String str2 = placeholder == null ? "" : placeholder;
        boolean z11 = !commonInputV2DTO.isDisabled();
        CommonInputV2VO.DateInputV2.DateRangeV2 mapDateRange = mapDateRange(commonInputV2DTO.getRange());
        boolean isInvalid = commonInputV2DTO.isInvalid();
        List<String> errors = commonInputV2DTO.getErrors();
        String V11 = errors != null ? C7714v.V(errors, "\n", null, null, null, 62) : null;
        AtomActionDTO onChange = commonInputV2DTO.getOnChange();
        AtomAction atomAction = onChange != null ? AtomActionMapperKt.toAtomAction(onChange, commonInputV2DTO.getTrackingInfo()) : null;
        String defaultValue = commonInputV2DTO.getDefaultValue();
        return new CommonInputV2VO.DateInputV2(i11, name, str, isInvalid, V11, str2, z11, mapDateRange, atomAction, defaultValue == null ? "" : defaultValue, null, null, commonInputV2DTO.getLabel(), 3072, null);
    }

    private static final CommonInputV2VO.DateInputV2.DateRangeV2 mapDateRange(CommonInputV2DTO.DateRangeV2 dateRangeV2) {
        if (dateRangeV2 == null) {
            return null;
        }
        DateTime start = dateRangeV2.getStart();
        start.getClass();
        long time = new Date(start.getMillis()).getTime();
        DateTime finish = dateRangeV2.getFinish();
        finish.getClass();
        return new CommonInputV2VO.DateInputV2.DateRangeV2(time, new Date(finish.getMillis()).getTime());
    }

    private static final DsInputStatus mapInputStatus(CommonInputV2DTO.InputStatus inputStatus, boolean z11) {
        if (z11) {
            return DsInputStatus.READ_ONLY;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$1[inputStatus.ordinal()];
        if (i11 == 1) {
            return DsInputStatus.NEUTRAL;
        }
        if (i11 == 2) {
            return DsInputStatus.SUCCESS;
        }
        if (i11 == 3) {
            return DsInputStatus.ERROR;
        }
        throw new o();
    }

    private static final int mapInputType(CommonInputV2DTO.InputType inputType, boolean z11) {
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
        if (i11 == 4 || i11 == 5) {
            return 3;
        }
        return z11 ? 147457 : 8193;
    }

    private static final int mapKeyboardType(CommonInputV2DTO.InputType inputType) {
        int i11 = inputType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        if (i11 == 1) {
            return 3;
        }
        if (i11 != 3) {
            return (i11 == 4 || i11 == 5) ? 4 : 1;
        }
        return 6;
    }

    private static final CommonInputV2VO.SelectorV2.OptionV2 mapOption(CommonInputV2DTO.SelectorOptionV2 selectorOptionV2) {
        return new CommonInputV2VO.SelectorV2.OptionV2(selectorOptionV2.getCode(), selectorOptionV2.getValue());
    }

    private static final CommonInputV2VO.SelectorV2 mapSelectInput(CommonInputV2DTO commonInputV2DTO, int i11, Long l11) {
        Object obj;
        Object obj2;
        List<CommonInputV2DTO.SelectorOptionV2> options = commonInputV2DTO.getOptions();
        if (options == null) {
            return null;
        }
        List<CommonInputV2DTO.SelectorOptionV2> list = options;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapOption((CommonInputV2DTO.SelectorOptionV2) it.next()));
        }
        String name = commonInputV2DTO.getName();
        String value = commonInputV2DTO.getValue();
        String str = value == null ? "" : value;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.d(((CommonInputV2VO.SelectorV2.OptionV2) obj).getCode(), commonInputV2DTO.getValue())) {
                break;
            }
        }
        CommonInputV2VO.SelectorV2.OptionV2 optionV2 = (CommonInputV2VO.SelectorV2.OptionV2) obj;
        String value2 = optionV2 != null ? optionV2.getValue() : null;
        String str2 = value2 == null ? "" : value2;
        String placeholder = commonInputV2DTO.getPlaceholder();
        String str3 = placeholder == null ? "" : placeholder;
        boolean z11 = !commonInputV2DTO.isDisabled();
        boolean isInvalid = commonInputV2DTO.isInvalid();
        List<String> errors = commonInputV2DTO.getErrors();
        String V11 = errors != null ? C7714v.V(errors, "\n", null, null, null, 62) : null;
        AtomActionDTO onChange = commonInputV2DTO.getOnChange();
        AtomAction atomAction = onChange != null ? AtomActionMapperKt.toAtomAction(onChange, commonInputV2DTO.getSelectTrackingInfo()) : null;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            if (Intrinsics.d(((CommonInputV2VO.SelectorV2.OptionV2) obj2).getValue(), commonInputV2DTO.getDefaultValue())) {
                break;
            }
        }
        CommonInputV2VO.SelectorV2.OptionV2 optionV22 = (CommonInputV2VO.SelectorV2.OptionV2) obj2;
        Map<String, TokenizedTrackingInfo> trackingInfo = commonInputV2DTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, l11, null, 2, null) : null;
        AtomActionDTO onClick = commonInputV2DTO.getOnClick();
        return new CommonInputV2VO.SelectorV2(i11, name, str, isInvalid, V11, str2, str3, z11, arrayList, atomAction, optionV22, onClick != null ? AtomActionMapperKt.toAtomAction(onClick, commonInputV2DTO.getTrackingInfo()) : null, tokenizedEvent$default, null, null, commonInputV2DTO.getLabel(), 24576, null);
    }

    private static final CommonInputV2VO.TextInputV2 mapTextInput(CommonInputV2DTO commonInputV2DTO, Boolean bool, Long l11, int i11) {
        String name = commonInputV2DTO.getName();
        String value = commonInputV2DTO.getValue();
        if (value == null) {
            value = "";
        }
        int mapKeyboardType = mapKeyboardType(commonInputV2DTO.getType());
        CommonInputV2DTO.InputType type = commonInputV2DTO.getType();
        if (type == null) {
            throw new IllegalStateException("Wrong input type in CommonInputV2DTO");
        }
        int mapInputType = mapInputType(type, commonInputV2DTO.isMultiline());
        String placeholder = commonInputV2DTO.getPlaceholder();
        String str = placeholder == null ? "" : placeholder;
        boolean z11 = !commonInputV2DTO.isDisabled();
        boolean isInvalid = commonInputV2DTO.isInvalid();
        List<String> errors = commonInputV2DTO.getErrors();
        String V11 = errors != null ? C7714v.V(errors, "\n", null, null, null, 62) : null;
        String mask = commonInputV2DTO.getMask();
        String Y11 = mask != null ? h.Y(mask, '#', '_') : null;
        String maskPattern = commonInputV2DTO.getMaskPattern();
        AtomActionDTO onChange = commonInputV2DTO.getOnChange();
        AtomAction atomAction = onChange != null ? AtomActionMapperKt.toAtomAction(onChange, null) : null;
        AtomActionDTO onFocusLost = commonInputV2DTO.getOnFocusLost();
        AtomAction atomAction2 = onFocusLost != null ? AtomActionMapperKt.toAtomAction(onFocusLost, null) : null;
        AtomActionDTO onClick = commonInputV2DTO.getOnClick();
        AtomAction atomAction3 = onClick != null ? AtomActionMapperKt.toAtomAction(onClick, commonInputV2DTO.getTrackingInfo()) : null;
        boolean isMultiline = commonInputV2DTO.isMultiline();
        String str2 = value;
        int i12 = Intrinsics.d(bool, Boolean.TRUE) ? 6 : 5;
        Map<String, TokenizedTrackingInfo> trackingInfo = commonInputV2DTO.getTrackingInfo();
        int i13 = i12;
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, l11, null, 2, null) : null;
        Integer maxLength = commonInputV2DTO.getMaxLength();
        String defaultValue = commonInputV2DTO.getDefaultValue();
        String str3 = defaultValue == null ? "" : defaultValue;
        t tVar = tokenizedEvent$default;
        Map<String, TokenizedTrackingInfo> focusLostTrackingInfo = commonInputV2DTO.getFocusLostTrackingInfo();
        t tokenizedEvent$default2 = focusLostTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(focusLostTrackingInfo, l11, null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> inputTrackingInfo = commonInputV2DTO.getInputTrackingInfo();
        return new CommonInputV2VO.TextInputV2(i11, name, str2, isInvalid, V11, mapInputType, mapKeyboardType, str, z11, Y11, maskPattern, atomAction, atomAction2, atomAction3, isMultiline, i13, tVar, inputTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(inputTrackingInfo, l11, null, 2, null) : null, tokenizedEvent$default2, maxLength, str3, null, null, commonInputV2DTO.getLabel(), commonInputV2DTO.getShowMaxLengthCounter(), Boolean.valueOf(commonInputV2DTO.isReadOnly()), commonInputV2DTO.getIcon(), mapInputStatus(commonInputV2DTO.getStatus(), commonInputV2DTO.isReadOnly()), 6291456, null);
    }

    public static final int toKeyboardCapitalization(int i11) {
        return (i11 & 8192) != 0 ? 2 : 0;
    }

    public static final CommonInputV2VO toVO(@NotNull CommonInputV2DTO commonInputV2DTO, Boolean bool, Long l11, int i11) {
        Intrinsics.checkNotNullParameter(commonInputV2DTO, "<this>");
        CommonInputV2DTO.InputType type = commonInputV2DTO.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return mapTextInput(commonInputV2DTO, bool, l11, i11);
            case 7:
                return mapDateInput(commonInputV2DTO, i11);
            case 8:
                return mapCheckboxInput(commonInputV2DTO, i11);
            case 9:
                return mapSelectInput(commonInputV2DTO, i11, l11);
            default:
                throw new IllegalStateException("Wrong input type in CommonInputV2DTO");
        }
    }

    public static /* synthetic */ CommonInputV2VO toVO$default(CommonInputV2DTO commonInputV2DTO, Boolean bool, Long l11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = null;
        }
        if ((i12 & 2) != 0) {
            l11 = null;
        }
        return toVO(commonInputV2DTO, bool, l11, i11);
    }
}
