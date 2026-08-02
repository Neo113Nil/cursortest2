package ru.ozon.app.android.atoms.data.controls.button;

import D3.h;
import D40.c;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000267B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001f\u001a\u00020 H\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jn\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020 J\u0013\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020 HÖ\u0001J\t\u00100\u001a\u00020\nHÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00068"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO;", "Lru/ozon/app/android/atoms/data/controls/button/ButtonsDTO;", "size", "Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO$Size;", "status", "Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO$Status;", "disabled", "", "readOnly", "label", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "caption", "common", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO$Size;Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO$Status;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)V", "getSize", "()Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO$Size;", "getStatus", "()Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO$Status;", "getDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReadOnly", "getLabel", "()Ljava/lang/String;", "getValue", "getCaption", "getCommon", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO$Size;Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO$Status;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Size", "Status", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InputSelectButtonDTO extends ButtonsDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<InputSelectButtonDTO> CREATOR = new Creator();
    private final String caption;
    private final CommonControlSettings common;
    private final Boolean disabled;
    private final String label;
    private final Boolean readOnly;
    private final Size size;
    private final Status status;
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputSelectButtonDTO> {
        @Override // android.os.Parcelable.Creator
        public final InputSelectButtonDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Size valueOf3 = parcel.readInt() == 0 ? null : Size.valueOf(parcel.readString());
            Status valueOf4 = parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InputSelectButtonDTO(valueOf3, valueOf4, valueOf, valueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final InputSelectButtonDTO[] newArray(int i11) {
            return new InputSelectButtonDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO$Size;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_500", "SIZE_600", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size SIZE_500 = new Size("SIZE_500", 0);
        public static final Size SIZE_600 = new Size("SIZE_600", 1);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SIZE_500, SIZE_600};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Size(String str, int i11) {
        }

        @NotNull
        public static a<Size> getEntries() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/InputSelectButtonDTO$Status;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_ERROR", "STATUS_NEUTRAL", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status STATUS_ERROR = new Status("STATUS_ERROR", 0);
        public static final Status STATUS_NEUTRAL = new Status("STATUS_NEUTRAL", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{STATUS_ERROR, STATUS_NEUTRAL};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Status(String str, int i11) {
        }

        @NotNull
        public static a<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public /* synthetic */ InputSelectButtonDTO(Size size, Status status, Boolean bool, Boolean bool2, String str, String str2, String str3, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Size.SIZE_600 : size, (i11 & 2) != 0 ? Status.STATUS_NEUTRAL : status, (i11 & 4) != 0 ? Boolean.FALSE : bool, (i11 & 8) != 0 ? Boolean.FALSE : bool2, str, str2, str3, commonControlSettings);
    }

    public static /* synthetic */ InputSelectButtonDTO copy$default(InputSelectButtonDTO inputSelectButtonDTO, Size size, Status status, Boolean bool, Boolean bool2, String str, String str2, String str3, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            size = inputSelectButtonDTO.size;
        }
        if ((i11 & 2) != 0) {
            status = inputSelectButtonDTO.status;
        }
        if ((i11 & 4) != 0) {
            bool = inputSelectButtonDTO.disabled;
        }
        if ((i11 & 8) != 0) {
            bool2 = inputSelectButtonDTO.readOnly;
        }
        if ((i11 & 16) != 0) {
            str = inputSelectButtonDTO.label;
        }
        if ((i11 & 32) != 0) {
            str2 = inputSelectButtonDTO.value;
        }
        if ((i11 & 64) != 0) {
            str3 = inputSelectButtonDTO.caption;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = inputSelectButtonDTO.common;
        }
        String str4 = str3;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        String str5 = str;
        String str6 = str2;
        return inputSelectButtonDTO.copy(size, status, bool, bool2, str5, str6, str4, commonControlSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component6, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final InputSelectButtonDTO copy(Size size, Status status, Boolean disabled, Boolean readOnly, String label, String value, String caption, CommonControlSettings common) {
        return new InputSelectButtonDTO(size, status, disabled, readOnly, label, value, caption, common);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputSelectButtonDTO)) {
            return false;
        }
        InputSelectButtonDTO inputSelectButtonDTO = (InputSelectButtonDTO) other;
        return this.size == inputSelectButtonDTO.size && this.status == inputSelectButtonDTO.status && Intrinsics.d(this.disabled, inputSelectButtonDTO.disabled) && Intrinsics.d(this.readOnly, inputSelectButtonDTO.readOnly) && Intrinsics.d(this.label, inputSelectButtonDTO.label) && Intrinsics.d(this.value, inputSelectButtonDTO.value) && Intrinsics.d(this.caption, inputSelectButtonDTO.caption) && Intrinsics.d(this.common, inputSelectButtonDTO.common);
    }

    public final String getCaption() {
        return this.caption;
    }

    @Override // ru.ozon.app.android.atoms.data.controls.button.ButtonsDTO
    public CommonControlSettings getCommon() {
        return this.common;
    }

    public final Boolean getDisabled() {
        return this.disabled;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.inputSelectButton;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Boolean getReadOnly() {
        return this.readOnly;
    }

    public final Size getSize() {
        return this.size;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        Size size = this.size;
        int hashCode = (size == null ? 0 : size.hashCode()) * 31;
        Status status = this.status;
        int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
        Boolean bool = this.disabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.readOnly;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.label;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.caption;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode7 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Size size = this.size;
        Status status = this.status;
        Boolean bool = this.disabled;
        Boolean bool2 = this.readOnly;
        String str = this.label;
        String str2 = this.value;
        String str3 = this.caption;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("InputSelectButtonDTO(size=");
        sb2.append(size);
        sb2.append(", status=");
        sb2.append(status);
        sb2.append(", disabled=");
        h.h(sb2, bool, ", readOnly=", bool2, ", label=");
        Nh.a.h(sb2, str, ", value=", str2, ", caption=");
        sb2.append(str3);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Size size = this.size;
        if (size == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(size.name());
        }
        Status status = this.status;
        if (status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(status.name());
        }
        Boolean bool = this.disabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Boolean bool2 = this.readOnly;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
        dest.writeString(this.label);
        dest.writeString(this.value);
        dest.writeString(this.caption);
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
    }

    public InputSelectButtonDTO(Size size, Status status, Boolean bool, Boolean bool2, String str, String str2, String str3, CommonControlSettings commonControlSettings) {
        super(DsAtomsType.INPUT_SELECT_BUTTON, commonControlSettings, null, 4, null);
        this.size = size;
        this.status = status;
        this.disabled = bool;
        this.readOnly = bool2;
        this.label = str;
        this.value = str2;
        this.caption = str3;
        this.common = commonControlSettings;
    }
}
