package ru.ozon.app.android.cml.delivery.molecules.input.data;

import GZ.e;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001:\u0002FGB\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010>\u001a\u00020\u0016HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010&J¼\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\f2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u000eHÖ\u0001J\t\u0010E\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\u000b\u0010#R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010'\u001a\u0004\b0\u0010&¨\u0006H"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "", "type", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputType;", "status", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;", "backgroundColor", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "message", "isDisabled", "", "maxLength", "", FormPageDTO.Field.FIELD_TYPE_MASK, "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightPadding", "bottomPadding", "leftPadding", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "debounce", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputType;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Integer;)V", "getType", "()Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputType;", "getStatus", "()Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;", "getBackgroundColor", "()Ljava/lang/String;", "getValue", "getPlaceholder", "getMessage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMask", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "getBottomPadding", "getLeftPadding", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getDebounce", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputType;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Integer;)Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "equals", "other", "hashCode", "toString", "InputType", "InputStatus", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InputMoleculeDTO {
    private final String backgroundColor;

    @EnumNullFallback
    private final Paddings bottomPadding;

    @NotNull
    private final CommonControlSettings common;
    private final Integer debounce;
    private final Boolean isDisabled;

    @EnumNullFallback
    private final Paddings leftPadding;
    private final String mask;
    private final Integer maxLength;
    private final String message;
    private final String placeholder;

    @EnumNullFallback
    private final Paddings rightPadding;

    @NotNull
    private final InputStatus status;

    @EnumNullFallback
    private final Paddings topPadding;

    @NotNull
    private final InputType type;
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "ERROR", "SUCCESS", "READONLY", "STATUS_INVALID", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InputStatus[] $VALUES;
        public static final InputStatus NEUTRAL = new InputStatus("NEUTRAL", 0);
        public static final InputStatus ERROR = new InputStatus("ERROR", 1);
        public static final InputStatus SUCCESS = new InputStatus("SUCCESS", 2);
        public static final InputStatus READONLY = new InputStatus("READONLY", 3);
        public static final InputStatus STATUS_INVALID = new InputStatus("STATUS_INVALID", 4);

        private static final /* synthetic */ InputStatus[] $values() {
            return new InputStatus[]{NEUTRAL, ERROR, SUCCESS, READONLY, STATUS_INVALID};
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "MONEY", "DIGITAL", "TYPE_INVALID", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType TEXT = new InputType("TEXT", 0);
        public static final InputType MONEY = new InputType("MONEY", 1);
        public static final InputType DIGITAL = new InputType("DIGITAL", 2);
        public static final InputType TYPE_INVALID = new InputType("TYPE_INVALID", 3);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{TEXT, MONEY, DIGITAL, TYPE_INVALID};
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

    public InputMoleculeDTO(@NotNull InputType type, @NotNull InputStatus status, String str, String str2, String str3, String str4, Boolean bool, Integer num, String str5, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, @NotNull CommonControlSettings common, Integer num2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(common, "common");
        this.type = type;
        this.status = status;
        this.backgroundColor = str;
        this.value = str2;
        this.placeholder = str3;
        this.message = str4;
        this.isDisabled = bool;
        this.maxLength = num;
        this.mask = str5;
        this.topPadding = paddings;
        this.rightPadding = paddings2;
        this.bottomPadding = paddings3;
        this.leftPadding = paddings4;
        this.common = common;
        this.debounce = num2;
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

    /* renamed from: component15, reason: from getter */
    public final Integer getDebounce() {
        return this.debounce;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InputStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMask() {
        return this.mask;
    }

    @NotNull
    public final InputMoleculeDTO copy(@NotNull InputType type, @NotNull InputStatus status, String backgroundColor, String value, String placeholder, String message, Boolean isDisabled, Integer maxLength, String mask, Paddings topPadding, Paddings rightPadding, Paddings bottomPadding, Paddings leftPadding, @NotNull CommonControlSettings common, Integer debounce) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(common, "common");
        return new InputMoleculeDTO(type, status, backgroundColor, value, placeholder, message, isDisabled, maxLength, mask, topPadding, rightPadding, bottomPadding, leftPadding, common, debounce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputMoleculeDTO)) {
            return false;
        }
        InputMoleculeDTO inputMoleculeDTO = (InputMoleculeDTO) other;
        return this.type == inputMoleculeDTO.type && this.status == inputMoleculeDTO.status && Intrinsics.d(this.backgroundColor, inputMoleculeDTO.backgroundColor) && Intrinsics.d(this.value, inputMoleculeDTO.value) && Intrinsics.d(this.placeholder, inputMoleculeDTO.placeholder) && Intrinsics.d(this.message, inputMoleculeDTO.message) && Intrinsics.d(this.isDisabled, inputMoleculeDTO.isDisabled) && Intrinsics.d(this.maxLength, inputMoleculeDTO.maxLength) && Intrinsics.d(this.mask, inputMoleculeDTO.mask) && this.topPadding == inputMoleculeDTO.topPadding && this.rightPadding == inputMoleculeDTO.rightPadding && this.bottomPadding == inputMoleculeDTO.bottomPadding && this.leftPadding == inputMoleculeDTO.leftPadding && Intrinsics.d(this.common, inputMoleculeDTO.common) && Intrinsics.d(this.debounce, inputMoleculeDTO.debounce);
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

    public final Integer getDebounce() {
        return this.debounce;
    }

    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    public final String getMask() {
        return this.mask;
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

    @NotNull
    public final InputStatus getStatus() {
        return this.status;
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
        int hashCode = (this.status.hashCode() + (this.type.hashCode() * 31)) * 31;
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
        String str5 = this.mask;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Paddings paddings = this.topPadding;
        int hashCode9 = (hashCode8 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.rightPadding;
        int hashCode10 = (hashCode9 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.bottomPadding;
        int hashCode11 = (hashCode10 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.leftPadding;
        int a11 = Bi.a.a(this.common, (hashCode11 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31, 31);
        Integer num2 = this.debounce;
        return a11 + (num2 != null ? num2.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        InputType inputType = this.type;
        InputStatus inputStatus = this.status;
        String str = this.backgroundColor;
        String str2 = this.value;
        String str3 = this.placeholder;
        String str4 = this.message;
        Boolean bool = this.isDisabled;
        Integer num = this.maxLength;
        String str5 = this.mask;
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.rightPadding;
        Paddings paddings3 = this.bottomPadding;
        Paddings paddings4 = this.leftPadding;
        CommonControlSettings commonControlSettings = this.common;
        Integer num2 = this.debounce;
        StringBuilder sb2 = new StringBuilder("InputMoleculeDTO(type=");
        sb2.append(inputType);
        sb2.append(", status=");
        sb2.append(inputStatus);
        sb2.append(", backgroundColor=");
        Nh.a.h(sb2, str, ", value=", str2, ", placeholder=");
        Nh.a.h(sb2, str3, ", message=", str4, ", isDisabled=");
        e.d(bool, num, ", maxLength=", ", mask=", sb2);
        sb2.append(str5);
        sb2.append(", topPadding=");
        sb2.append(paddings);
        sb2.append(", rightPadding=");
        Lh.a.e(sb2, paddings2, ", bottomPadding=", paddings3, ", leftPadding=");
        sb2.append(paddings4);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", debounce=");
        return Ep.a.c(sb2, num2, ")");
    }
}
