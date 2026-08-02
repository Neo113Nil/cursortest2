package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiSeparatorPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiSeparatorPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiSeparatorPropsDto> CREATOR = new a();

    @pmi0("alignment")
    private final AlignmentDto alignment;

    @pmi0("appearance")
    private final AppearanceDto appearance;

    @pmi0("axis")
    private final AxisDto axis;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiSeparatorPropsDto.kt */
    public static final class AlignmentDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AlignmentDto[] $VALUES;

        @pmi0("1")
        public static final AlignmentDto CENTER;
        public static final Parcelable.Creator<AlignmentDto> CREATOR;

        @pmi0("2")
        public static final AlignmentDto END;

        @pmi0("0")
        public static final AlignmentDto START;
        private final int value;

        /* compiled from: AtumVkuiSeparatorPropsDto.kt */
        public static final class a implements Parcelable.Creator<AlignmentDto> {
            @Override // android.os.Parcelable.Creator
            public final AlignmentDto createFromParcel(Parcel parcel) {
                return AlignmentDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AlignmentDto[] newArray(int i) {
                return new AlignmentDto[i];
            }
        }

        static {
            AlignmentDto alignmentDto = new AlignmentDto("START", 0, 0);
            START = alignmentDto;
            AlignmentDto alignmentDto2 = new AlignmentDto("CENTER", 1, 1);
            CENTER = alignmentDto2;
            AlignmentDto alignmentDto3 = new AlignmentDto("END", 2, 2);
            END = alignmentDto3;
            AlignmentDto[] alignmentDtoArr = {alignmentDto, alignmentDto2, alignmentDto3};
            $VALUES = alignmentDtoArr;
            $ENTRIES = new asp(alignmentDtoArr);
            CREATOR = new a();
        }

        private AlignmentDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static AlignmentDto valueOf(String str) {
            return (AlignmentDto) Enum.valueOf(AlignmentDto.class, str);
        }

        public static AlignmentDto[] values() {
            return (AlignmentDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiSeparatorPropsDto.kt */
    public static final class AppearanceDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AppearanceDto[] $VALUES;
        public static final Parcelable.Creator<AppearanceDto> CREATOR;

        @pmi0("0")
        public static final AppearanceDto PRIMARY;

        @pmi0("1")
        public static final AppearanceDto PRIMARY_ALPHA;

        @pmi0("2")
        public static final AppearanceDto SECONDARY;
        private final int value;

        /* compiled from: AtumVkuiSeparatorPropsDto.kt */
        public static final class a implements Parcelable.Creator<AppearanceDto> {
            @Override // android.os.Parcelable.Creator
            public final AppearanceDto createFromParcel(Parcel parcel) {
                return AppearanceDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppearanceDto[] newArray(int i) {
                return new AppearanceDto[i];
            }
        }

        static {
            AppearanceDto appearanceDto = new AppearanceDto("PRIMARY", 0, 0);
            PRIMARY = appearanceDto;
            AppearanceDto appearanceDto2 = new AppearanceDto("PRIMARY_ALPHA", 1, 1);
            PRIMARY_ALPHA = appearanceDto2;
            AppearanceDto appearanceDto3 = new AppearanceDto("SECONDARY", 2, 2);
            SECONDARY = appearanceDto3;
            AppearanceDto[] appearanceDtoArr = {appearanceDto, appearanceDto2, appearanceDto3};
            $VALUES = appearanceDtoArr;
            $ENTRIES = new asp(appearanceDtoArr);
            CREATOR = new a();
        }

        private AppearanceDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static AppearanceDto valueOf(String str) {
            return (AppearanceDto) Enum.valueOf(AppearanceDto.class, str);
        }

        public static AppearanceDto[] values() {
            return (AppearanceDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiSeparatorPropsDto.kt */
    public static final class AxisDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AxisDto[] $VALUES;
        public static final Parcelable.Creator<AxisDto> CREATOR;

        @pmi0("1")
        public static final AxisDto HORIZONTAL;

        @pmi0("2")
        public static final AxisDto VERTICAL;
        private final int value;

        /* compiled from: AtumVkuiSeparatorPropsDto.kt */
        public static final class a implements Parcelable.Creator<AxisDto> {
            @Override // android.os.Parcelable.Creator
            public final AxisDto createFromParcel(Parcel parcel) {
                return AxisDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AxisDto[] newArray(int i) {
                return new AxisDto[i];
            }
        }

        static {
            AxisDto axisDto = new AxisDto("HORIZONTAL", 0, 1);
            HORIZONTAL = axisDto;
            AxisDto axisDto2 = new AxisDto("VERTICAL", 1, 2);
            VERTICAL = axisDto2;
            AxisDto[] axisDtoArr = {axisDto, axisDto2};
            $VALUES = axisDtoArr;
            $ENTRIES = new asp(axisDtoArr);
            CREATOR = new a();
        }

        private AxisDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static AxisDto valueOf(String str) {
            return (AxisDto) Enum.valueOf(AxisDto.class, str);
        }

        public static AxisDto[] values() {
            return (AxisDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AtumVkuiSeparatorPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiSeparatorPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSeparatorPropsDto createFromParcel(Parcel parcel) {
            return new AtumVkuiSeparatorPropsDto(parcel.readInt() == 0 ? null : AppearanceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AlignmentDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AxisDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSeparatorPropsDto[] newArray(int i) {
            return new AtumVkuiSeparatorPropsDto[i];
        }
    }

    public AtumVkuiSeparatorPropsDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiSeparatorPropsDto)) {
            return false;
        }
        AtumVkuiSeparatorPropsDto atumVkuiSeparatorPropsDto = (AtumVkuiSeparatorPropsDto) obj;
        return this.appearance == atumVkuiSeparatorPropsDto.appearance && this.alignment == atumVkuiSeparatorPropsDto.alignment && this.axis == atumVkuiSeparatorPropsDto.axis;
    }

    public final int hashCode() {
        AppearanceDto appearanceDto = this.appearance;
        int hashCode = (appearanceDto == null ? 0 : appearanceDto.hashCode()) * 31;
        AlignmentDto alignmentDto = this.alignment;
        int hashCode2 = (hashCode + (alignmentDto == null ? 0 : alignmentDto.hashCode())) * 31;
        AxisDto axisDto = this.axis;
        return hashCode2 + (axisDto != null ? axisDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiSeparatorPropsDto(appearance=" + this.appearance + ", alignment=" + this.alignment + ", axis=" + this.axis + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppearanceDto appearanceDto = this.appearance;
        if (appearanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appearanceDto.writeToParcel(parcel, i);
        }
        AlignmentDto alignmentDto = this.alignment;
        if (alignmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            alignmentDto.writeToParcel(parcel, i);
        }
        AxisDto axisDto = this.axis;
        if (axisDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            axisDto.writeToParcel(parcel, i);
        }
    }

    public AtumVkuiSeparatorPropsDto(AppearanceDto appearanceDto, AlignmentDto alignmentDto, AxisDto axisDto) {
        this.appearance = appearanceDto;
        this.alignment = alignmentDto;
        this.axis = axisDto;
    }

    public /* synthetic */ AtumVkuiSeparatorPropsDto(AppearanceDto appearanceDto, AlignmentDto alignmentDto, AxisDto axisDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : appearanceDto, (i & 2) != 0 ? null : alignmentDto, (i & 4) != 0 ? null : axisDto);
    }
}
