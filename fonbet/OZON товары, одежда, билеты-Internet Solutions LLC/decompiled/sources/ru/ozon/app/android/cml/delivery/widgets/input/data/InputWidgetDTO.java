package ru.ozon.app.android.cml.delivery.widgets.input.data;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b0\b\u0081\b\u0018\u00002\u00020\u0001:\u0002EFB\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010>\u001a\u00020\u0017HÆ\u0003J²\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\n2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\fHÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\t\u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006G"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO;", "", "type", "Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO$InputType;", "backgroundColor", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "message", "isDisabled", "", "maxLength", "", "tooltipAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "status", "Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO$InputStatus;", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightPadding", "bottomPadding", "leftPadding", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO$InputType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO$InputStatus;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getType", "()Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO$InputType;", "getBackgroundColor", "()Ljava/lang/String;", "getValue", "getPlaceholder", "getMessage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTooltipAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getStatus", "()Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO$InputStatus;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "getBottomPadding", "getLeftPadding", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO$InputType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO$InputStatus;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO;", "equals", "other", "hashCode", "toString", "InputType", "InputStatus", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InputWidgetDTO {
    private final String backgroundColor;

    @EnumNullFallback
    private final Paddings bottomPadding;

    @NotNull
    private final CommonControlSettings common;
    private final Boolean isDisabled;

    @EnumNullFallback
    private final Paddings leftPadding;
    private final Integer maxLength;
    private final String message;
    private final String placeholder;

    @EnumNullFallback
    private final Paddings rightPadding;

    @EnumNullFallback
    private final InputStatus status;
    private final AtomActionDTO tooltipAction;

    @EnumNullFallback
    private final Paddings topPadding;

    @NotNull
    private final InputType type;
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO$InputStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "ERROR", "SUCCESS", "READONLY", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InputStatus[] $VALUES;
        public static final InputStatus NEUTRAL = new InputStatus("NEUTRAL", 0);
        public static final InputStatus ERROR = new InputStatus("ERROR", 1);
        public static final InputStatus SUCCESS = new InputStatus("SUCCESS", 2);
        public static final InputStatus READONLY = new InputStatus("READONLY", 3);

        private static final /* synthetic */ InputStatus[] $values() {
            return new InputStatus[]{NEUTRAL, ERROR, SUCCESS, READONLY};
        }

        static {
            InputStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private InputStatus(String str, int i11) {
        }

        public static InputStatus valueOf(String str) {
            return (InputStatus) Enum.valueOf(InputStatus.class, str);
        }

        public static InputStatus[] values() {
            return (InputStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO$InputType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "MONEY", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType TEXT = new InputType("TEXT", 0);
        public static final InputType MONEY = new InputType("MONEY", 1);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{TEXT, MONEY};
        }

        static {
            InputType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private InputType(String str, int i11) {
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    public InputWidgetDTO(@NotNull InputType type, String str, String str2, String str3, String str4, Boolean bool, Integer num, AtomActionDTO atomActionDTO, InputStatus inputStatus, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(common, "common");
        this.type = type;
        this.backgroundColor = str;
        this.value = str2;
        this.placeholder = str3;
        this.message = str4;
        this.isDisabled = bool;
        this.maxLength = num;
        this.tooltipAction = atomActionDTO;
        this.status = inputStatus;
        this.topPadding = paddings;
        this.rightPadding = paddings2;
        this.bottomPadding = paddings3;
        this.leftPadding = paddings4;
        this.common = common;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputType getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component11, reason: from getter */
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    /* renamed from: component12, reason: from getter */
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component13, reason: from getter */
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getTooltipAction() {
        return this.tooltipAction;
    }

    /* renamed from: component9, reason: from getter */
    public final InputStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final InputWidgetDTO copy(@NotNull InputType type, String backgroundColor, String value, String placeholder, String message, Boolean isDisabled, Integer maxLength, AtomActionDTO tooltipAction, InputStatus status, Paddings topPadding, Paddings rightPadding, Paddings bottomPadding, Paddings leftPadding, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(common, "common");
        return new InputWidgetDTO(type, backgroundColor, value, placeholder, message, isDisabled, maxLength, tooltipAction, status, topPadding, rightPadding, bottomPadding, leftPadding, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputWidgetDTO)) {
            return false;
        }
        InputWidgetDTO inputWidgetDTO = (InputWidgetDTO) other;
        return this.type == inputWidgetDTO.type && Intrinsics.d(this.backgroundColor, inputWidgetDTO.backgroundColor) && Intrinsics.d(this.value, inputWidgetDTO.value) && Intrinsics.d(this.placeholder, inputWidgetDTO.placeholder) && Intrinsics.d(this.message, inputWidgetDTO.message) && Intrinsics.d(this.isDisabled, inputWidgetDTO.isDisabled) && Intrinsics.d(this.maxLength, inputWidgetDTO.maxLength) && Intrinsics.d(this.tooltipAction, inputWidgetDTO.tooltipAction) && this.status == inputWidgetDTO.status && this.topPadding == inputWidgetDTO.topPadding && this.rightPadding == inputWidgetDTO.rightPadding && this.bottomPadding == inputWidgetDTO.bottomPadding && this.leftPadding == inputWidgetDTO.leftPadding && Intrinsics.d(this.common, inputWidgetDTO.common);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    public final InputStatus getStatus() {
        return this.status;
    }

    public final AtomActionDTO getTooltipAction() {
        return this.tooltipAction;
    }

    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    @NotNull
    public final InputType getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeholder;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.maxLength;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.tooltipAction;
        int hashCode8 = (hashCode7 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        InputStatus inputStatus = this.status;
        int hashCode9 = (hashCode8 + (inputStatus == null ? 0 : inputStatus.hashCode())) * 31;
        Paddings paddings = this.topPadding;
        int hashCode10 = (hashCode9 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.rightPadding;
        int hashCode11 = (hashCode10 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.bottomPadding;
        int hashCode12 = (hashCode11 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.leftPadding;
        return this.common.hashCode() + ((hashCode12 + (paddings4 != null ? paddings4.hashCode() : 0)) * 31);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        InputType inputType = this.type;
        String str = this.backgroundColor;
        String str2 = this.value;
        String str3 = this.placeholder;
        String str4 = this.message;
        Boolean bool = this.isDisabled;
        Integer num = this.maxLength;
        AtomActionDTO atomActionDTO = this.tooltipAction;
        InputStatus inputStatus = this.status;
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.rightPadding;
        Paddings paddings3 = this.bottomPadding;
        Paddings paddings4 = this.leftPadding;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("InputWidgetDTO(type=");
        sb2.append(inputType);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", value=");
        Nh.a.h(sb2, str2, ", placeholder=", str3, ", message=");
        Sh.a.d(bool, str4, ", isDisabled=", ", maxLength=", sb2);
        sb2.append(num);
        sb2.append(", tooltipAction=");
        sb2.append(atomActionDTO);
        sb2.append(", status=");
        sb2.append(inputStatus);
        sb2.append(", topPadding=");
        sb2.append(paddings);
        sb2.append(", rightPadding=");
        Lh.a.e(sb2, paddings2, ", bottomPadding=", paddings3, ", leftPadding=");
        sb2.append(paddings4);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(")");
        return sb2.toString();
    }
}
